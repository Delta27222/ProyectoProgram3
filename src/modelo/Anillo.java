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
public class Anillo extends Pieza{
    private int circunferencia;
    private String tipoAnillo; //ANILLO 
    private String Mensaje;
   /*  private int peso; 
    private int pureza; */
    
    
    public Anillo() {
        super();
        this.circunferencia=0; // aquí va el nombre del papa de samuel
        this.tipoAnillo = ""; // aquí va la cedula del papa de samuel
        this.Mensaje = ""; // aquí va el telefono del papa de samuel
     /*   this.peso = 0;
        this.pureza = 0;        */
    }
    
//PARA SER USADA AL EDITAR LA PIEZA, Y QUE SALGA EL CAMBIO EN EL XML  
    public Anillo(String piezaa,int idpieza, String material, int circunferencia, String tipoanillo, String mensaje, int pureza, int peso, String arreglo) {
        super(piezaa, idpieza, material, pureza, peso, arreglo);         
        this.circunferencia = circunferencia; 
        this.tipoAnillo = tipoanillo;
        this.Mensaje = mensaje; 
    }
    

    public int getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(int circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getTipoAnillo() {
        return tipoAnillo;
    }

    public void setTipoAnillo(String tipoAnillo) {
        this.tipoAnillo = tipoAnillo;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
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
    
    
    
}
