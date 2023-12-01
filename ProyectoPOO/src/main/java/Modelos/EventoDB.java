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
public interface EventoDB {
    ArrayList<Evento>ListaUsuarios=new ArrayList<Evento>();
    public boolean Crear(Connection link, Evento evento);
    public boolean Eliminar(Connection link, int id);
    public Evento Buscar(Connection link, int id);
}
