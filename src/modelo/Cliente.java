/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;



public class Cliente extends Persona{
    private int deuda;
    private ArrayList<Pedido> listaPedidosCliente;
    
    
    public Cliente(){  
        super();
        this.deuda =0;
        this.listaPedidosCliente = new ArrayList<Pedido>();
    }

    public int getDeuda() {
        return deuda;
    }

    public void setDeuda(int deuda) {
        this.deuda = deuda;
    }

    public ArrayList<Pedido> getListaPedidosCliente() {
        return listaPedidosCliente;
    }

    /*public void setListaPedidosCliente(ArrayList<Pedido> listaPedidosCliente) {
        this.listaPedidosCliente = listaPedidosCliente;
    }este no va creo*/
    
    
    public void incluirPedCli(Pedido ped){
       listaPedidosCliente.add(ped);         
    }
    
    
    
}
