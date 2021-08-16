/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;



public class Orfebre extends Persona {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Pedido> listaPedidosOrfebre;
    private ArrayList<Pieza> listaPiezas;
    
    public Orfebre(){  
        super();
        this.listaClientes = new ArrayList<Cliente>();
        this.listaPedidosOrfebre = new ArrayList<Pedido>();
        this.listaPiezas = new ArrayList<Pieza>(); 

    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    /*public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }este no va creo*/

    public ArrayList<Pedido> getListaPedidosOrfebre() {
        return listaPedidosOrfebre;
    }

    public void setListaPedidosOrfebre(ArrayList<Pedido> listaPedidosOrfebre) {
        this.listaPedidosOrfebre = listaPedidosOrfebre;
    }

    public void setListaPiezas(ArrayList<Pieza> listaPiezas) {
        this.listaPiezas = listaPiezas;
    }

    
    
    public ArrayList<Pieza> getListaPiezas() {
        return listaPiezas;
    }

    /*public void setListaPedidosOrfebre(ArrayList<Pedido> listaPedidosOrfebre) {
        this.listaPedidosOrfebre = listaPedidosOrfebre;
    }este no va creo*/
    
    public void incluirPedOrfebre(Pedido ped){
       listaPedidosOrfebre.add(ped);  
       
       if (listaPedidosOrfebre != null){
            for (int i = 0; i < listaPedidosOrfebre.size(); i++) {
                 
                System.out.println(listaPedidosOrfebre.get(i));
            }
        }
        System.out.println("se aa agregado el pedido");
              
    }
    //USADO 
    public void incluirPieOrfebre(Pieza pie){
       listaPiezas.add(pie); 
       
       if (listaPiezas != null){
            for (int i = 0; i < listaPiezas.size(); i++) {
                 
                System.out.println(listaPiezas.get(i));
            }
        }
        System.out.println("se ha agregado la pieza");
              
    } 
    
   public Pedido buscarIdPedOrf(int idped){ // esta funcion ()devuelve un pedido creo) es consultar pedido creo, donde dice nomele deberia ir cidigoele o algo asi. String colorele// yo creo que este metodo debería ser una funcion que devuelva un electrodomestico
        boolean continuar = false;
        //Iterator<Electrodomestico> it=listaEle.iterator();
        //while (!continuar){
        int i;
        for (i = 0; !continuar; i++){ 
            if (listaPedidosOrfebre.get(i).getIdPedido()==idped)
                continuar = true;
                //return listaEle.get(i);
            
    }
            //if (it.next().getColor().equalsIgnoreCase(colorele)) // en donde dice nombre deberia ir codigo o algo asi
               // return listaEle.get();          
        //}
    return listaPedidosOrfebre.get(i);                
    }

    public void eliminarPiePed(Pieza pie){
       
    }   
   
//USADO
    public void eliminarPie(Pieza pie){
        listaPiezas.remove(pie);
    }
    
    //USADO
    public void eliminarPed(Pedido ped){        
        ArrayList<Pieza> listaPiezaDePedido; 
        listaPiezaDePedido = ped.getListaPiezas(); 
        for(int i=0; i < listaPiezaDePedido.size();i++)
        {
               Pieza piezaEliminar = listaPiezaDePedido.get(i); 
               listaPiezas.remove(piezaEliminar); 
        }
        listaPedidosOrfebre.remove(ped);        
    }
    
    
}
