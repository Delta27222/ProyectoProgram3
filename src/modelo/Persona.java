/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author usuario
 */
public class Persona {
    private String nombre; 
    private int cedula; 
    private int telefono;
    
    
    public Persona() {
        this.nombre= ""; // aquí va el nombre del papa de samuel
        this.cedula = 0; // aquí va la cedula del papa de samuel
        this.telefono = 0; // aquí va el telefono del papa de samuel
        
    }
    
    // aquí irían los get persona y set persona creo. No los getters y los setters son de los atributos que tiene la clase creo

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
}
