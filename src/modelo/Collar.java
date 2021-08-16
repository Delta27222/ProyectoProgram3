/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import org.jdom.Element;

/**
 *
 * @author usuario
 */
public class Collar extends Pieza{
    private int tamaño;
    private String tipoCollar; 
    private String mensaje; 
  /*  private int peso; 
    private int pureza; */
    
    
    
    public Collar() {
        super();
        this.tamaño =0; // aquí va el nombre del papa de samuel
        this.mensaje = ""; 
        this.tipoCollar = ""; 
     /*   this.peso = 0;
        this.pureza = 0;        */
    }
//PARA SER USADA AL EDITAR LA PIEZA, Y QUE SALGA EL CAMBIO EN EL XML
    public Collar(String piezaa,int idpieza, String material, int circunferencia, String tipoanillo, String mensaje, int pureza, int peso, String arreglo) {
        super(piezaa, idpieza, material, pureza, peso, arreglo);     
        this.tamaño = circunferencia; 
        this.tipoCollar = tipoanillo;
        this.mensaje = mensaje;      
    }
    
    
    
    

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
/*
    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPureza() {
        return pureza;
    }

    public void setPureza(int pureza) {
        this.pureza = pureza;
    }
     */

    public String getTipoCollar() {
        return tipoCollar;
    }

    public void setTipoCollar(String tipoCollar) {
        this.tipoCollar = tipoCollar;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    
}
