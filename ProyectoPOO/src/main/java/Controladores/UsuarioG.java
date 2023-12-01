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


import Modelos.UsuarioDB;
import Modelos.Usuario;


public class UsuarioG implements UsuarioDB{
    
    public String query;
    
    @Override
    public boolean Crear(Connection link, Usuario usuario){

            try{
                Statement s = link.createStatement();
                query="INSERT INTO usuario(nombre,apellido,rut,fechaNacimiento,correo,numeroCelular)VALUES('"+usuario.getNombre()+"','"+usuario.getApellido()+"','"+usuario.getRut()+"','"+usuario.getFechaNacimiento()+"','"+usuario.getCorreo()+"','"+usuario.getNumeroTelefonico()+"')";
                s.executeUpdate(query);
                return true;

            }catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }

            return false;
    }
    
    @Override
    public boolean Actualizar(Connection link, Usuario usuario){
        try{
            Statement s = link.createStatement();
            query="UPDATE usuario set nombre='"+usuario.getNombre()+"',apellido='"+usuario.getApellido()+"',fechaNacimiento='"+usuario.getFechaNacimiento()+"',correo='"+usuario.getCorreo()+"',numero celular='"+usuario.getNumeroTelefonico()+"' WHERE rut='"+usuario.getRut()+"'";
            s.executeUpdate(query);
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
        
    }
    
    @Override
    public boolean Eliminar(Connection link, String rut) {
           try {
            //aqui hay que buscar si se encuentra 
            
            Statement s = link.createStatement();
            query="delete * usuario where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
            return true;
            
        }catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }

    @Override
    public ArrayList<Usuario> Leer(Connection link){

       try{
           Statement s = link.createStatement();
           query="select * from usuario";
           ResultSet rs=s.executeQuery(query);
           while (rs.next()){
               
              Usuario usuario=new Usuario();
              
              usuario.setNombre(rs.getString("nombre"));
              usuario.setApellido(rs.getString("apellido"));
              usuario.setRut(rs.getString("rut"));
              usuario.setFechaNacimiento(rs.getDate("fechaNacimiento"));
              usuario.setCorreo(rs.getString("correo"));
              usuario.setNumeroTelefonico(rs.getInt("NumeroCelular"));

              ListaUsuarios.add(usuario);

           }

           return ListaUsuarios;
       }catch (SQLException ex) {
           Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
       }
       return null;
    }

    @Override
    public Usuario Buscar(Connection link, String rut){
        
        Usuario usuario=new Usuario();
        
        try {
            Statement s = link.createStatement();
            query="select * from usuario where rut='"+rut+"'";
            ResultSet rs=s.executeQuery(query);
            
                   
   
            while (rs.next()){
               
               usuario.setNombre(rs.getString("nombres"));
               usuario.setApellido(rs.getString("apellidos"));
               usuario.setRut(rs.getString("rut"));
               usuario.setFechaNacimiento(rs.getDate("fechaNacimiento"));
               usuario.setCorreo(rs.getString("correo"));
               usuario.setNumeroTelefonico(rs.getInt("numeroCelular"));
                
            }
            return usuario;
  
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
   
    
    


    
    
    
     
     
    
    
    
}
