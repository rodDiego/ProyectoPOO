/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Usuario {
     private String nombre;
    private String apellido;
    private String rut;
    private Date fechaNacimiento;
    private String correo;
    private int numeroTelefonico;
    private Scanner entrada;
    private ArrayList<Deporte> listaDeportes;
    private boolean esPremium;
   
    //CONSTRUCTORES
    
    public Usuario(){
        this.nombre = "";
        this.apellido = "";
        this.rut = "";
        this.fechaNacimiento = null;
        this.correo = "";
        this.numeroTelefonico = 0;
        this.entrada = new Scanner(System.in);
        listaDeportes = new ArrayList<Deporte>();
        this.esPremium = false;
        
    }
    
    public Usuario(String nombre, String apellido, String rut, Date fechaNacimiento, String correo, int numeroTelefonico, boolean esPremium) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.numeroTelefonico = numeroTelefonico;
        this.esPremium = esPremium;
    }

    //ACCESORES

    public String getNombre() {
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }

    public String getRut() {
        return this.rut;
    }
    
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public String getCorreo() {
        return this.correo;
    }
    
    public int getNumeroTelefonico() {
        return this.numeroTelefonico;
    }
    public boolean isEsPremium() {
        return esPremium;
    }
    
    
    //MUTADORES

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setNumeroTelefonico(int numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    public void setEsPremium(boolean esPremium) {
        this.esPremium = esPremium;
    }
}
