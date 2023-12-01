/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author drodr
 */
public class Evento {
    private int id;
    private String nombre;
    private Date fecha;
    private String direccion;
    private String ciudad;
    private String deporte;
    private int cantMaxima;
    private int valor;
    private Scanner sn;
    
    //CONSTRUCTORES
    
    public Evento(){
        this.id = 0;
        this.nombre = "";
        this.fecha = null;
        this.direccion = "";
        this.ciudad = "";
        this.deporte = null;
        this.cantMaxima = 0;
        this.valor = 0;
        this.sn = new Scanner(System.in);
    }
    
    public Evento(int id, String nombre, Date fecha, String direccion, String ciudad, String deporte, int cantMaxima, int valor) {
        this.id = id;
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.deporte = "";
        this.cantMaxima = cantMaxima;
        this.valor = valor;
    }
    
    //ACCESORES

    public int getId() {
        return id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public String getDeporte() {
        return this.deporte;
    }

    public int getCantMaxima() {
        return this.cantMaxima;
    }

    public int getValor() {
        return this.valor;
    }
   
    //MUTADORES

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public void setCantMaxima(int cantMaxima) {
        this.cantMaxima = cantMaxima;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
