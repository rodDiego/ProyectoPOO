/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drodr
 */
public class Ciudad {
    private int id;
    private String nombre;
    private String comuna;
    private String region;
    private ArrayList<Deporte> listaDeportes; 
    private Scanner lectura;
    
    //CONTRUCTORES
    
    public Ciudad() {

        this.id = 0;
        this.nombre = "";
        this.comuna = "";
        this.region = "";
        this.listaDeportes = new ArrayList<>();
        this.lectura = new Scanner(System.in);
    }
 
    public Ciudad(int id, String nombre, String comuna, String region) {
        this.id = id;
        this.nombre = nombre;
        this.comuna = comuna;
        this.region = region;
        this.listaDeportes = new ArrayList<>();
    }
    //getters y setters
    public String getNombre() {
        return this.nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getComuna() {
        return this.comuna;
    }
 
    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
 
    public String getRegion() {
        return this.region;
    }
 
    public void setRegion(String region) {
        this.region = region;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
