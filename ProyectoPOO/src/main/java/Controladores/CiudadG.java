/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelos.Ciudad;
import Modelos.CiudadDB;

public class CiudadG implements CiudadDB{

    public String query;
    
    @Override
    public boolean Crear(Connection link, Ciudad ciudad){
 
        try{
            Statement s = link.createStatement();
            query="INSERT INTO ciudad(nombre,comuna,region,id)VALUES('"+ciudad.getNombre()+"','"+ciudad.getComuna()+"','"+ciudad.getRegion()+"','"+ciudad.getId()+"')";
            s.executeUpdate(query);
            return true;
 
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return false;
 
    }
    
    @Override
    public boolean Eliminar(Connection link, int id) {
           try {
            //aqui hay que buscar si se encuentra 
 
            Statement s = link.createStatement();
            query="delete * ciudad where Id='"+id+"'";
            ResultSet rs=s.executeQuery(query);
 
            return true;
 
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        return false;
    }
    
    @Override
     public ArrayList<Ciudad> Leer(Connection link){

        try{
            Statement s = link.createStatement();
            query="select * from ciudad";
            ResultSet rs=s.executeQuery(query);
            while (rs.next()){

                Ciudad ciudad=new Ciudad();

                ciudad.setNombre(rs.getString("nombre"));
                ciudad.setComuna(rs.getString("nomuna"));
                ciudad.setRegion(rs.getString("region"));
                ciudad.setId(rs.getInt("id"));

                ListaCiudades.add(ciudad);

            }

            return ListaCiudades;
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
    @Override
    public Ciudad Buscar(Connection link, int id){
        Ciudad ciudad=new Ciudad();
        try {
            Statement s = link.createStatement();
            query="select * from ciudad where id='"+id+"'";
            ResultSet rs=s.executeQuery(query);
 
 
 
            while (rs.next()){
               ciudad.setNombre(rs.getString("nombre"));
               ciudad.setComuna(rs.getString("nomuna"));
               ciudad.setRegion(rs.getString("region"));
               ciudad.setId(rs.getInt("id"));
            }
            return ciudad;
 
 
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }    
    
    
}
