package modelo;

public class Pieza {
    private String tipomaterial;
    private int purezamaterial;
    private String notaadicional;
    private int peso; 
    private int idPieza;
    private String piezaa; 
    private String tipoArreglo; 
    //private ArrayList<Pieza> listaPiezas; 
    
    public Pieza() {
        this.tipomaterial=""; // aquí va el nombre del papa de samuel
        this.purezamaterial = 0; // aquí va la cedula del papa de samuel
        this.notaadicional = ""; // aquí va el telefono del papa de samuel
        this.peso = 0; 
        this.idPieza = 0; 
        this.piezaa = ""; 
        this.tipoArreglo = ""; 
       // this.listaPiezas = new ArrayList<Pieza>(); 
    }    

    public Pieza(String piezaa, int idpieza, String material, int pureza, int peso, String arreglo) {
        this.tipomaterial=material; 
        this.purezamaterial = pureza;  
        this.peso = peso; 
        this.idPieza = idpieza; 
        this.piezaa = piezaa; 
        this.tipoArreglo = arreglo; 
    }


    public String getTipoArreglo() {
        return tipoArreglo;
    }

    public void setTipoArreglo(String tipoArreglo) {
        this.tipoArreglo = tipoArreglo;
    }

    

    public String getTipomaterial() {
        return tipomaterial;
    }
  
    /*
        
    public ArrayList<Pieza> getListaPiezas() {
        return listaPiezas;
    }
    */

    public void setTipomaterial(String tipomaterial) {
        this.tipomaterial = tipomaterial;
    }

    public int getPurezamaterial() {
        return purezamaterial;
    }

    public void setPurezamaterial(int purezamaterial) {
        this.purezamaterial = purezamaterial;
    }

    public String getNotaadicional() {
        return notaadicional;
    }

    public void setNotaadicional(String notaadicional) {
        this.notaadicional = notaadicional;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdPieza() {
        return idPieza;
    }

    public void setIdPieza(int idPieza) {
        this.idPieza = idPieza;
    }

    public String getPiezaa() {
        return piezaa;
    }

    public void setPiezaa(String piezaa) {
        this.piezaa = piezaa;
    }
        

    @Override
   public String toString(){
       return "Pedido =  [id pieza "+idPieza+ ", Tipo pieza "+piezaa+ " , material "+tipomaterial+" , pureza material "+purezamaterial+" , peso "+peso;               
   }
    
}
