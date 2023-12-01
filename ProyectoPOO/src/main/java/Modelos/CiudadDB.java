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
public interface CiudadDB {
    ArrayList<Ciudad>ListaCiudades=new ArrayList<Ciudad>();
    public boolean Crear(Connection link, Ciudad ciudad);
    public boolean Eliminar(Connection link, int id);
    public ArrayList<Ciudad> Leer(Connection link);
    public Ciudad Buscar(Connection link, int id);
}
