/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modelos;

import Controladores.Conexion;
import Controladores.UsuarioG;
import java.sql.Connection;

/**
 *
 * @author drodr
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Conexion conn = new Conexion();
        Connection link = conn.Conectar();
          
        
        conn.CerrarConexion();
    }
    
}
