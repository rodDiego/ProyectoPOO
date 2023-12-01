/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelos;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author drodr
 */
public interface UsuarioDB {
    ArrayList<Usuario>ListaUsuarios=new ArrayList<Usuario>();
    public boolean Crear(Connection link, Usuario usuario);
    public boolean Actualizar(Connection link, Usuario usuario);
    public boolean Eliminar(Connection link, String rut);
    public ArrayList<Usuario> Leer(Connection link);
    public Usuario Buscar(Connection link, String rut);
}
