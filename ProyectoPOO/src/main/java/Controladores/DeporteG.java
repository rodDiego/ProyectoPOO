/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import Modelos.Deporte;
import Modelos.DeporteDB;
import java.sql.ResultSet;
import java.util.HashSet;

public class DeporteG implements DeporteDB{
    
    public String query;
    
    public boolean Crear(Connection link, Deporte deporte){

            try{
                Statement s = link.createStatement();
                query="INSERT INTO deporte(id,nombre)VALUES('"+deporte.getId()+"','"+deporte.getNombre()+"')";
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
            query="delete * deporte where id='"+id+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public ArrayList<Deporte> Leer(Connection link){

      try{
          Statement s = link.createStatement();
          query="select * from deporte";
          ResultSet rs=s.executeQuery(query);
          while (rs.next()){

             Deporte deporte=new Deporte();

             deporte.setId(rs.getInt("id"));
             deporte.setNombre(rs.getString("nombre"));


             ListaDeportes.add(deporte);

          }

          return ListaDeportes;
      }catch (SQLException ex) {
          Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
      }
      return null;
   }
    
    @Override
    public Deporte Buscar(Connection link, int id){

        Deporte deporte=new Deporte();

        try {
            Statement s = link.createStatement();
            query="select * from deporte where id='"+id+"'";
            ResultSet rs=s.executeQuery(query);



            while (rs.next()){

               deporte.setId(rs.getInt("id"));
               deporte.setNombre(rs.getString("nombre"));

            }
            return deporte;


        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    

  
    
}
