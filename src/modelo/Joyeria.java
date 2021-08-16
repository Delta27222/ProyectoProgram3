package modelo;

import java.util.*;
import java.util.ArrayList;
import modelo.Persona;

public class Joyeria {
    
    private String rif; 
    private String direccion;
    private int telefono; 
    Orfebre o1; //falta el = new Persona() creo, aunque creo que eso va en el constructor de joyería// Aquí en vez de persona va es orfebre creo

   /*private ArrayList<Pedido> listaPed;//estos dos no irían creo
   private ArrayList<Pedido> listaPed1;*/
   
    public Joyeria() {
        /*this.listaPed = new ArrayList<Pedido>();// ninguno de estos dos van creo
        this.listaPed1 = new ArrayList<Pedido>();*/
        this.rif = ""; // aquí va el rif del lugar del papa de samuel
        this.direccion = "";// aquí va la direccion del lugar del papa de samuel
        this.telefono = 0; // aquí va el telefono del lugar del papa de samuel
        this.o1 = new Orfebre();
    }   

    /*public ArrayList<Pedido> getListaPed() {//En vez de estos cuatro sería solo get persona y set persona creo, no ceo que sería get joyería y set joyería. Aquí hay que poner los getters y los setters de los atributos de la clase, así que sí irían los get persona y set persona
        return listaPed;
    }

    public void setListaPed(ArrayList<Pedido> listaPed) {
        this.listaPed = listaPed;
    }

    public ArrayList<Pedido> getListaPed1() {
        return listaPed1;
    }

    public void setListaPed1(ArrayList<Pedido> listaPed1) {
        this.listaPed1 = listaPed1;
    }*/
    
    /* public void incluirPed1(Pedido ped){//estos de incluir no iría creo
       listaPed1.add(ped);      
   }
       
   public void incluirPedOrfebre(Pedido ped){
       listaPed.add(ped);         
   }
    
   public void recorrer(ArrayList<Pedido> listaPed){//Estos dos no iría creo
     System.out.println("Cantida: " +listaPed.size());
   }
   
      public void recorrer1(ArrayList<Pedido> listaPed1){
     System.out.println("Cantida: " +listaPed1.size());
   }*/

    public String getRif() {
        return rif;
    }

    public void setRif(String rif) {
        this.rif = rif;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Orfebre getO1() {
        return o1;
    }

    public void setO1(Orfebre o1) {
        this.o1 = o1;
    }

    public void recorrer1(ArrayList<Pedido> lista) {
       if (lista.size()== 0){
           System.out.println("ESTA VACIA");
       }else{
           System.out.println("La cantidad de elementos es de "+lista.size());
       }
    }
    
    
   
   
}
