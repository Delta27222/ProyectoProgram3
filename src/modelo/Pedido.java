package modelo;
import Persistencia.DaoPedidoXml;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import vista.BPantallaPrincipal;


public class Pedido {
    private int idPedido;
    private String tipoPedido; 
    private int costoTotal; 
    private int abonoInicial;
    private int saldoRestante; 
    private String fechaPedido; 
    private String fechaEntrega; 
    private int cedulaCliente;  
    private Boolean piezaPagada; 

    private String Material; 
    private String notaAdicional; 
    private int costoMetal; 
    
    private String Piezaa;                 //quitar o arreglar
    private String tipoReparacion; 
    
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
   Cliente cliente;
   private ArrayList<Pieza> listaPiezas;

    ArrayList<Pedido> pedidosOrfebreOriginal = new ArrayList<Pedido>();

    ArrayList<Pieza> todasPiezasOriginal = new ArrayList<Pieza>();   
   
   
   
   private Orfebre orfebre= new Orfebre();

//USADO    
   public Pedido() {
        this.idPedido = 0;
        this.tipoPedido = "";
        this.costoTotal = 0;
        this.abonoInicial = 0;
        this.saldoRestante = 0;
        this.fechaPedido = "";
        this.fechaEntrega = "";
        this.cedulaCliente = 0;
        this.piezaPagada = false;
        this.notaAdicional = "";
        this.costoMetal = 0;
        this.listaPiezas = new ArrayList<Pieza>();
    }

//USADO
    public Pedido(int x) {
        
        try {
            File archivoXml = new File("src/archivosXml/pedidos.xml"); 
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder builder = dbFactory.newDocumentBuilder(); 
            Document documentoXml =  builder.parse(archivoXml);   
            
            documentoXml.getDocumentElement().normalize();
            
            NodeList pedidos = documentoXml.getElementsByTagName("Pedido");
            
            ArrayList<Pedido> pedidosOrfebre = new ArrayList<Pedido>();
            
            ArrayList<Pieza> todasPiezas = new ArrayList<Pieza>();
            
            for (int i = 0; i < pedidos.getLength(); i++) {
                Node  pedido = pedidos.item(i); 
                
                
                if (pedido.getNodeType() == Node.ELEMENT_NODE){
                   Element elemento = (Element) pedido; 
                   String idPedidoComprobacion = elemento.getElementsByTagName("idpedido").item(0).getTextContent(); 
                   if (!idPedidoComprobacion.equals("0")){
                        Pedido nuevoPedido = new Pedido();
                        nuevoPedido.setIdPedido(Integer.parseInt(elemento.getElementsByTagName("idpedido").item(0).getTextContent()));
                        nuevoPedido.setCedulaCliente(Integer.parseInt(elemento.getElementsByTagName("cedulacliente").item(0).getTextContent()));
                        nuevoPedido.setCostoTotal(Integer.parseInt(elemento.getElementsByTagName("costo").item(0).getTextContent()));
                        nuevoPedido.setAbonoInicial(Integer.parseInt(elemento.getElementsByTagName("abono").item(0).getTextContent()));
                        nuevoPedido.setFechaPedido(elemento.getElementsByTagName("fechapedido").item(0).getTextContent());
                        nuevoPedido.setFechaEntrega(elemento.getElementsByTagName("fechaentrega").item(0).getTextContent());
                        //HASTA ACA SE CREA EL PEDIDO NUEVO

                        ArrayList<Pieza> piezadePedido = new ArrayList<Pieza>();
                        NodeList piezas = elemento.getElementsByTagName("Pieza"); 
                        for (int j = 0; j < piezas.getLength(); j++) {
                            Node pieza = piezas.item(j);

                            if (pieza.getNodeType() == Node.ELEMENT_NODE){
                                Element elemento1 = (Element) pieza; 

                                Pieza piezaPedido = new Pieza();                         
                                String quees = elemento1.getElementsByTagName("tipopieza").item(0).getTextContent(); 

                                if (quees.equals("Anillo creado") || quees.equals("Anillo arreglado")){
                                    piezaPedido = new Anillo();
                                    Anillo newPie = (Anillo) piezaPedido; 
                                    newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                    newPie.setIdPieza(Integer.parseInt(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()));
                                    newPie.setTipomaterial(elemento1.getElementsByTagName("tipomaterial").item(0).getTextContent());
                                    newPie.setCircunferencia(Integer.parseInt(elemento1.getElementsByTagName("circunferencia").item(0).getTextContent()));
                                    newPie.setTipoAnillo(elemento1.getElementsByTagName("tipoanillo").item(0).getTextContent());
                                    newPie.setMensaje(elemento1.getElementsByTagName("mensaje").item(0).getTextContent());
                                    newPie.setPurezamaterial(Integer.parseInt(elemento1.getElementsByTagName("pureza").item(0).getTextContent()));
                                    newPie.setPeso(Integer.parseInt(elemento1.getElementsByTagName("peso").item(0).getTextContent()));
                                    if (quees.equals("Anillo arreglado")){
                                        newPie.setTipoArreglo(elemento1.getElementsByTagName("tipoarreglo").item(0).getTextContent());
                                    }
                                    piezadePedido.add(newPie);
                                }else{
                                    if (quees.equals("Collar creado") || quees.equals("Colalr arreglado")){
                                        piezaPedido = new Collar(); 
                                        Collar newPie = (Collar) piezaPedido;                                     
                                        newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                        newPie.setIdPieza(Integer.parseInt(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()));
                                        newPie.setTipomaterial(elemento1.getElementsByTagName("tipomaterial").item(0).getTextContent());
                                        newPie.setTamaño(Integer.parseInt(elemento1.getElementsByTagName("circunferencia").item(0).getTextContent()));
                                        if (quees.equals("Collar creado")){
                                            newPie.setTipoCollar(elemento1.getElementsByTagName("tipoanillo").item(0).getTextContent());
                                        }                                    
                                        newPie.setMensaje(elemento1.getElementsByTagName("mensaje").item(0).getTextContent());
                                        newPie.setPurezamaterial(Integer.parseInt(elemento1.getElementsByTagName("pureza").item(0).getTextContent()));
                                        newPie.setPeso(Integer.parseInt(elemento1.getElementsByTagName("peso").item(0).getTextContent()));
                                        if (quees.equals("Collar arreglado")){
                                            newPie.setTipoArreglo(elemento1.getElementsByTagName("tipoarreglo").item(0).getTextContent());
                                        }    
                                       piezadePedido.add(newPie); 
                                    }                                
                                }
                            }                        
                        //termina for de las piezas del pieza             
                        }
                        nuevoPedido.setListaPiezas(piezadePedido);
                        pedidosOrfebre.add(nuevoPedido);
                        this.pedidosOrfebreOriginal = pedidosOrfebre; 
                    }else{
                        ArrayList<Pieza> piezadePedido = new ArrayList<Pieza>();
                        NodeList piezas = elemento.getElementsByTagName("Pieza"); 
                        
                        for (int j = 0; j < piezas.getLength(); j++) {
                            Node pieza = piezas.item(j);


                            if (pieza.getNodeType() == Node.ELEMENT_NODE){
                                Element elemento1 = (Element) pieza; 

                                Pieza piezaPedido = new Pieza();                         
                                String quees = elemento1.getElementsByTagName("tipopieza").item(0).getTextContent(); 

                                if (quees.equals("Anillo creado") || quees.equals("Anillo arreglado")){
                                    piezaPedido = new Anillo();
                                    Anillo newPie = (Anillo) piezaPedido; 
                                    newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                    newPie.setIdPieza(Integer.parseInt(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()));
                                    newPie.setTipomaterial(elemento1.getElementsByTagName("tipomaterial").item(0).getTextContent());
                                    newPie.setCircunferencia(Integer.parseInt(elemento1.getElementsByTagName("circunferencia").item(0).getTextContent()));
                                    newPie.setTipoAnillo(elemento1.getElementsByTagName("tipoanillo").item(0).getTextContent());
                                    newPie.setMensaje(elemento1.getElementsByTagName("mensaje").item(0).getTextContent());
                                    newPie.setPurezamaterial(Integer.parseInt(elemento1.getElementsByTagName("pureza").item(0).getTextContent()));
                                    newPie.setPeso(Integer.parseInt(elemento1.getElementsByTagName("peso").item(0).getTextContent()));
                                    if (quees.equals("Anillo arreglado")){
                                        newPie.setTipoArreglo(elemento1.getElementsByTagName("tipoarreglo").item(0).getTextContent());
                                    }
                                    piezadePedido.add(newPie);
                                    todasPiezas.add(newPie);
                                    this.todasPiezasOriginal = todasPiezas; 
                                }else{
                                    if (quees.equals("Collar creado") || quees.equals("Colalr arreglado")){
                                        piezaPedido = new Collar(); 
                                        Collar newPie = (Collar) piezaPedido;                                     
                                        newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                        newPie.setIdPieza(Integer.parseInt(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()));
                                        newPie.setTipomaterial(elemento1.getElementsByTagName("tipomaterial").item(0).getTextContent());
                                        newPie.setTamaño(Integer.parseInt(elemento1.getElementsByTagName("circunferencia").item(0).getTextContent()));
                                        if (quees.equals("Collar creado")){
                                            newPie.setTipoCollar(elemento1.getElementsByTagName("tipoanillo").item(0).getTextContent());
                                        }                                    
                                        newPie.setMensaje(elemento1.getElementsByTagName("mensaje").item(0).getTextContent());
                                        newPie.setPurezamaterial(Integer.parseInt(elemento1.getElementsByTagName("pureza").item(0).getTextContent()));
                                        newPie.setPeso(Integer.parseInt(elemento1.getElementsByTagName("peso").item(0).getTextContent()));
                                        if (quees.equals("Collar arreglado")){
                                            newPie.setTipoArreglo(elemento1.getElementsByTagName("tipoarreglo").item(0).getTextContent());
                                        }    
                                       piezadePedido.add(newPie); 
                                       todasPiezas.add(newPie); 
                                       this.todasPiezasOriginal = todasPiezas; 
                                    }                                
                                }
                            }                            
                        }
                   }
                }                   
            } 
            orfebre.setListaPedidosOrfebre(this.pedidosOrfebreOriginal);
            orfebre.setListaPiezas(this.todasPiezasOriginal); 

            
            BPantallaPrincipal adelante = new BPantallaPrincipal(orfebre); 
            adelante.setVisible(true);     
            
            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println("Error: "+ e.getMessage());
        }       
    }
  
//VIENE DE EDITAR PEDIDO
  //USADO
    public Pedido(int cedulaCliente, int costo, int abono, String fechaPedido, String fechaEntrega, Orfebre conPedOrf, int idPedido) {
        this.costoTotal = costo; 
        this.abonoInicial = abono; 
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.cedulaCliente = cedulaCliente; 
        for (int i = 0; i < conPedOrf.getListaPedidosOrfebre().size(); i++) {
            if (conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido() == idPedido){
                this.listaPiezas = conPedOrf.getListaPedidosOrfebre().get(i).listaPiezas;
                break; 
            }
        } 
    }

    
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getAbonoInicial() {
        return abonoInicial;
    }

    public void setAbonoInicial(int abonoInicial) {
        this.abonoInicial = abonoInicial;
    }

    public int getSaldoRestante() {
        return saldoRestante;
    }

    public void setSaldoRestante(int saldoRestante) {
        this.saldoRestante = saldoRestante;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public Boolean getPiezaPagada() {
        return piezaPagada;
    }

    public void setPiezaPagada(Boolean piezaPagada) {
        this.piezaPagada = piezaPagada;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getNotaAdicional() {
        return notaAdicional;
    }

    public void setNotaAdicional(String notaAdicional) {
        this.notaAdicional = notaAdicional;
    }

    public int getCostoMetal() {
        return costoMetal;
    }

    public void setCostoMetal(int costoMetal) {
        this.costoMetal = costoMetal;
    }
    
    
    
    //LOS QUE AGREGO PROVICIONALMENTE 

    /*public int getCircunferencia() {
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
    }*/

    public String getPiezaa() {
        return Piezaa;
    }

    public void setPiezaa(String Piezaa) {
        this.Piezaa = Piezaa;
    }
    

    /*public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza Pieza) {
        this.pieza = Pieza;
    }*/ 

    public ArrayList<Pieza> getListaPiezas() {
        return listaPiezas;
    }

    public void setListaPiezas(ArrayList<Pieza> listaPiezas) {
        this.listaPiezas = listaPiezas;
    }
    
    

    public String getTipoReparacion() {
        return tipoReparacion;
    }

    public void setTipoReparacion(String tipoReparacion) {
        this.tipoReparacion = tipoReparacion;
    }
    //saber si entran los datos
    @Override
   public String toString(){
       return "Pedido =  [id pedido "+idPedido+" , Cedula cliente "+cedulaCliente+" , costo "+costoTotal+" , abono inicial "+abonoInicial+" , fecha pedido "+fechaPedido+ " , fecha entrega "+ fechaEntrega+ ", [";               
   }
    
    
    
   
}
