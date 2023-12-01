/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

import Modelos.EventoDB;
import Modelos.Evento;



public class EventoG implements EventoDB {
    
    public String query;
    
    @Override
    public boolean Crear(Connection link, Evento evento){

            try{
                Statement s = link.createStatement();
                query="INSERT INTO evento(id, nombre, fecha, direccion, ciudad, deporte, cantMaxima, valor)VALUES('"+evento.getId()+"','"+evento.getNombre()+"','"+evento.getFecha()+"','"+evento.getDireccion()+"','"+evento.getCiudad()+"','"+evento.getDeporte()+"','"+evento.getCantMaxima()+evento.getValor()+"')";
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
            query="delete * evento where id='"+id+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    @Override
    public Evento Buscar(Connection link, int id){
        
        Evento evento=new Evento();
        
        try {
            Statement s = link.createStatement();
            query="select * from usuario where id='"+id+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               
                evento.setId(rs.getInt("id"));
                evento.setNombre(rs.getString("nombre"));
                evento.setFecha(rs.getDate("fechaEvento"));
                evento.setDireccion(rs.getString("direccion"));
                evento.setCiudad(rs.getString("ciudad"));
                evento.setDeporte(rs.getString("deporte"));
                evento.setCantMaxima(rs.getInt("cantidadMaxima"));
                evento.setValor(rs.getInt("valor"));
                
            }
            return evento;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
