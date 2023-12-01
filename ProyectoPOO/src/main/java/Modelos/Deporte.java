/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Scanner;

/**
 *
 * @author drodr
 */
public class Deporte {
    private int id;
    private String nombre;
    private Scanner entrada;
    
    public Deporte(){
        this.entrada = new Scanner(System.in);
        this.id = 0;
        this.nombre = "";
    }
    public Deporte(int id, String nombre) {
        this.entrada = new Scanner(System.in);
        this.id = id;
        this.nombre = nombre;
    }
 
    //getters y setters
 
    public int getId() {
        return this.id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
    public String getNombre() {
        return this.nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
