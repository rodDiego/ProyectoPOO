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
public interface DeporteDB {
    ArrayList<Deporte>ListaDeportes=new ArrayList<Deporte>();
    public boolean Crear(Connection link, Deporte deporte);
    public boolean Eliminar(Connection link, int id);
    public ArrayList<Deporte> Leer(Connection link);
    public Deporte Buscar(Connection link, int id);
}
