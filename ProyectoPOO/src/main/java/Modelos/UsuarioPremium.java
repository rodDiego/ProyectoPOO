/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author drodr
 */
public class UsuarioPremium extends Usuario{
    
    private boolean sinPublicidad;
    private boolean soportePrioritario;
    private ArrayList<String> eventosEspeciales;
    
    public UsuarioPremium() {
        super();
        sinPublicidad = true;
        soportePrioritario = true;
        eventosEspeciales = new ArrayList<String>();
    }
    public UsuarioPremium(String nombre, String apellido, String rut, Date fechaNacimiento, String correo, int numeroTelefonico, boolean esPremium, boolean sinPublicidad, boolean soportePrioritario) {
        super(nombre, apellido, rut, fechaNacimiento, correo, numeroTelefonico, esPremium);
        this.sinPublicidad = sinPublicidad;
        this.soportePrioritario = soportePrioritario;
        eventosEspeciales = new ArrayList<String>();
    }

    public boolean isSinPublicidad() {
        return sinPublicidad;
    }

    public void setSinPublicidad(boolean sinPublicidad) {
        this.sinPublicidad = sinPublicidad;
    }

    public boolean isSoportePrioritario() {
        return soportePrioritario;
    }

    public void setSoportePrioritario(boolean soportePrioritario) {
        this.soportePrioritario = soportePrioritario;
    }

    public ArrayList<String> getEventosEspeciales() {
        return eventosEspeciales;
    }

    public void setEventosEspeciales(ArrayList<String> eventosEspeciales) {
        this.eventosEspeciales = eventosEspeciales;
    }

    

    
}
