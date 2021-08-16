package Persistencia;


import java.io.FileOutputStream;

import java.text.ParseException;

import java.util.Iterator;
import java.util.List;

import modelo.Anillo;
import modelo.Collar;
import modelo.Orfebre;
import modelo.Pedido;

import modelo.Pieza;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class DaoPedidoXml {

    private Element root;/* variable que contiene la raiz del documento Xml*/
    private String fileLocationPedidos = "src//archivosXml//pedidos.xml";    /* variable que contiene la localizacion del archivo xml*/    
    private Boolean sihay = false, siEsLaPieza = false; 
    private boolean material = false, tipoAnillo = false, peso = false, tamano = false, mensaje = false, tipoArreglo; 
    
public DaoPedidoXml() {

        try {
            SAXBuilder builder = new SAXBuilder(false); //parse que maneja el XMl
            Document doc = builder.build(fileLocationPedidos);
            root = doc.getRootElement();
        } catch (JDOMException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("No se pudo iniciar la operacion por: " + ex.getMessage());
        }
    }
//1111VIENE DE CREAR UN PEDIDO
//USADO
private Element PedidotoXmlElement(Pedido nPedido, ArrayList<Pieza> listaPie) {
             Element Pedidotrans = new Element("Pedido");//nombre de la Clase
             Element idPedido = new Element("idpedido");
             idPedido.setText(Integer.toString(nPedido.getIdPedido())); 
             Element cedulacliente = new Element("cedulacliente");//se crea cada etiqueta del XML
             cedulacliente.setText(Integer.toString(nPedido.getCedulaCliente()));//asocia el valor a la etiqueta 
             Element costo = new Element("costo");
             costo.setText(Integer.toString(nPedido.getCostoTotal()));
             Element abono = new Element("abono");
             abono.setText(Integer.toString(nPedido.getAbonoInicial()));
             Element fechapedido = new Element("fechapedido");
             fechapedido.setText(nPedido.getFechaPedido());
             Element fechaentrega = new Element("fechaentrega");
             fechaentrega.setText(nPedido.getFechaEntrega());             
             Pedidotrans.addContent(idPedido);
             Pedidotrans.addContent(cedulacliente);
             Pedidotrans.addContent(costo);
             Pedidotrans.addContent(abono);
             Pedidotrans.addContent(fechapedido);
             Pedidotrans.addContent(fechaentrega); 
             Element Piezastrans = new Element("Piezas");//nombre de la Clase
                 for (int i = 0; i < listaPie.size(); i++) {  
                     Element Piezatrans = new Element("Pieza");//nombre de la Clase
                     Pieza pie = nPedido.getListaPiezas().get(i); 
                     Element idPieza = new Element("idpieza");
                     idPieza.setText(Integer.toString(pie.getIdPieza())); 
                     Element tipoPieza = new Element("tipopieza");
                     tipoPieza.setText(pie.getPiezaa()); 
                     if (pie.getPiezaa().equals("Anillo creado")){
                         Anillo newPie = (Anillo) pie; 
                         Element tipoMaterial = new Element("tipomaterial");
                         tipoMaterial.setText(newPie.getTipomaterial()); 
                         Element circunferencia = new Element("circunferencia");
                         circunferencia.setText(Integer.toString(newPie.getCircunferencia())); 
                         Element tipoAnillo = new Element("tipoanillo");
                         tipoAnillo.setText(newPie.getTipoAnillo());
                         Element mensaje = new Element("mensaje");
                         mensaje.setText(newPie.getMensaje()); 
                         Element pureza = new Element("pureza");
                         pureza.setText(Integer.toString(newPie.getPurezamaterial())); 
                         Element peso = new Element("peso");
                         peso.setText(Integer.toString(newPie.getPeso()));
                         Element tipoArreglo = new Element("tipoarreglo");
                         tipoArreglo.setText("N/A");
                         if (i == 0){
                             Pedidotrans.addContent(Piezastrans.addContent(Piezatrans.addContent(tipoPieza)));
                         }else{ 
                             if (i == nPedido.getListaPiezas().size()-1){
                                 Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                             }else{
                                   Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                             }                             
                         }                       
                         Piezatrans.addContent(idPieza); 
                         Piezatrans.addContent(tipoMaterial); 
                         Piezatrans.addContent(circunferencia); 
                         Piezatrans.addContent(tipoAnillo); 
                         Piezatrans.addContent(mensaje); 
                         Piezatrans.addContent(pureza); 
                         Piezatrans.addContent(peso); 
                     }else{
                         if (pie.getPiezaa().equals("Collar creado")){
                             Collar newPie = (Collar) pie; 
                             Element tipoMaterial = new Element("tipomaterial");
                             tipoMaterial.setText(newPie.getTipomaterial()); 
                             Element circunferencia = new Element("circunferencia");
                             circunferencia.setText(Integer.toString(newPie.getTamaño())); 
                             Element tipoCollar = new Element("tipoanillo");
                             tipoCollar.setText(newPie.getTipoCollar());
                             Element mensaje = new Element("mensaje");
                             mensaje.setText(newPie.getMensaje()); 
                             Element pureza = new Element("pureza");
                             pureza.setText(Integer.toString(newPie.getPurezamaterial())); 
                             Element peso = new Element("peso");
                             peso.setText(Integer.toString(newPie.getPeso()));  
                             Element tipoArreglo = new Element("tipoarreglo");
                             tipoArreglo.setText("N/A");
                             if (i == 0){
                                 Pedidotrans.addContent(Piezastrans.addContent(Piezatrans.addContent(tipoPieza)));
                             }else{ 
                                 if (i == nPedido.getListaPiezas().size()-1){
                                     Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                 }else{
                                       Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                 }
                             } 
                             Piezatrans.addContent(idPieza); 
                             Piezatrans.addContent(tipoMaterial); 
                             Piezatrans.addContent(circunferencia);
                             Piezatrans.addContent(tipoCollar); 
                             Piezatrans.addContent(mensaje);
                             Piezatrans.addContent(pureza); 
                             Piezatrans.addContent(peso);                         
                         }else{
                             if (pie.getPiezaa().equals("Anillo arreglado")){
                                 Anillo newPie = (Anillo) pie; 
                                 Element tipoMaterial = new Element("tipomaterial");
                                 tipoMaterial.setText(newPie.getTipomaterial()); 
                                 Element circunferencia = new Element("circunferencia");
                                 circunferencia.setText(Integer.toString(newPie.getCircunferencia())); 
                                 Element tipoAnillo = new Element("tipoanillo");
                                 tipoAnillo.setText(newPie.getTipoAnillo());
                                 Element mensaje = new Element("mensaje");
                                 mensaje.setText(newPie.getMensaje()); 
                                 Element pureza = new Element("pureza");
                                 pureza.setText(Integer.toString(newPie.getPurezamaterial())); 
                                 Element peso = new Element("peso");
                                 peso.setText(Integer.toString(newPie.getPeso()));
                                 Element tipoArreglo = new Element("tipoarreglo");
                                 tipoArreglo.setText(newPie.getTipoArreglo());
                                 if (i == 0){
                                     Pedidotrans.addContent(Piezastrans.addContent(Piezatrans.addContent(tipoPieza)));
                                 }else{ 
                                     if (i == nPedido.getListaPiezas().size()-1){
                                         Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                     }else{
                                          Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                     }
                                 } 
                                 Piezatrans.addContent(idPieza);                                     
                                 Piezatrans.addContent(tipoMaterial); 
                                 Piezatrans.addContent(circunferencia);
                                 Piezatrans.addContent(tipoAnillo); 
                                 Piezatrans.addContent(mensaje);
                                 Piezatrans.addContent(pureza); 
                                 Piezatrans.addContent(peso);
                                 Piezatrans.addContent(tipoArreglo);
                             }else{
                                 if (pie.getPiezaa().equals("Collar arreglado")){
                                     Collar newPie = (Collar) pie; 
                                     Element tipoMaterial = new Element("tipomaterial");
                                     tipoMaterial.setText(newPie.getTipomaterial()); 
                                     Element circunferencia = new Element("circunferencia");
                                     circunferencia.setText(Integer.toString(newPie.getTamaño()));  
                                     Element tipoCollar = new Element("tipoanillo");
                                     tipoCollar.setText(newPie.getTipoCollar());
                                     Element mensaje = new Element("mensaje");
                                     mensaje.setText(newPie.getMensaje()); 
                                     Element pureza = new Element("pureza");
                                     pureza.setText(Integer.toString(newPie.getPurezamaterial())); 
                                     Element peso = new Element("peso");
                                     peso.setText(Integer.toString(newPie.getPeso()));
                                     Element tipoArreglo = new Element("tipoarreglo");
                                     tipoArreglo.setText(newPie.getTipoArreglo());
                                     if (i == 0){
                                         Pedidotrans.addContent(Piezastrans.addContent(Piezatrans.addContent(tipoPieza)));
                                     }else{ 
                                         if (i == nPedido.getListaPiezas().size()-1){
                                             Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                         }else{
                                               Piezastrans.addContent(Piezatrans.addContent(tipoPieza));
                                         }
                                     } 
                                     Piezatrans.addContent(idPieza); 
                                     Piezatrans.addContent(tipoMaterial); 
                                     Piezatrans.addContent(circunferencia);
                                     Piezatrans.addContent(tipoCollar); 
                                     Piezatrans.addContent(mensaje);
                                     Piezatrans.addContent(pureza); 
                                     Piezatrans.addContent(peso);
                                     Piezatrans.addContent(tipoArreglo);
                                 }
                             }
                         }
                     } 
                 }    
return Pedidotrans;

}
//111AGREGAR EL PEDIDO CON SUS RESPECTIVAS PIEZAS  //AGREGAR EL PEDIDO      
    //USADO
public boolean agregarPedido(Pedido nPedido, ArrayList<Pieza> listaPie) {
    root.addContent(PedidotoXmlElement((Pedido) nPedido, listaPie));
    boolean  resultado = updateDocument();
    return resultado;
}

//PARA LOS PEDIDOS
//USADO
private boolean updateDocument() {
    try {
        XMLOutputter out = new XMLOutputter(org.jdom.output.Format.getPrettyFormat());
        FileOutputStream file = new FileOutputStream(fileLocationPedidos);
        out.output(root, file);
        file.flush();
        file.close();
        return true;
    } catch (Exception e) {
        System.out.println("error: " + e.getMessage());
        return false;
    }         
}
//PARA LOS PEDIDOS
//USADO
public ArrayList<Pedido> todosLosPedido( Orfebre conPedOrf) {
      ArrayList<Pedido> resultado = new ArrayList<Pedido>();
      for (Object it : root.getChildren()) { 
            Element xmlElem = (Element) it;
            try {
                resultado.add(PedidoToObject(xmlElem));
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
            break; 
        }
        return resultado;
    }

//para agregarlo cuando se crea el pedido
//USADO
    public Pedido buscarPedido(Integer idPedido) {
    /* @param cedula número de cedula del Estudiante a buscar
    * @return objeto Estudiante con sus datos segun busqueda*/
      Element aux = new Element("Pedido");
      List Pedidos = this.root.getChildren("Pedido");
      while (aux != null) {
        aux = DaoPedidoXml.buscar(Pedidos, Integer.toString(idPedido));
        if (aux != null) {
           try {
                return PedidoToObject(aux);
           } catch (ParseException ex) {
                System.out.println(ex.getMessage());
           }
       }
     }
       return null;
   }
  //2222VIENE DE EDITAR PEDIDO
    //USADO
    public Pedido buscarPedido(Integer idPedido, Orfebre conPedOrf, int x) {
      Element aux = new Element("Pedido");
      List Pedidos = this.root.getChildren("Pedido");
      while (aux != null) {
        aux = DaoPedidoXml.buscar(Pedidos,Integer.toString(idPedido));
        if (aux != null) {
           try {
                return PedidoToObject(aux, conPedOrf, idPedido);
           } catch (ParseException ex) {
                System.out.println(ex.getMessage());
           }
       }
     }
       return null;
   }

    //VIENE DE EDITAR PEDIDO PEDIDO
    //USADO
 public static Element buscar(List raiz, String dato) {
      Iterator i = raiz.iterator();
      while (i.hasNext()) {
         Element e = (Element) i.next();
         if (dato.equals(e.getChild("idpedido").getText())) {
             return e;
            }
        }
      return null;
    }
//VIENE DE EDITAR PEDIDO
 //USADO
    public boolean actualizarPedido(Pedido nPedido, Orfebre conPedOrf, int x) {
      //Si entra con x != 1 , es porque va a agregar el pedido (PEDIDO 0) con todas las piezas sin importar que sean de un pedido o no 

        //Primero se elimina el pedido del XML
        boolean resultado = false;
        Element aux = new Element("Pedido");
        List Pedidos = this.root.getChildren("Pedido");
        while (aux != null) {
            aux = DaoPedidoXml.buscar(Pedidos, Integer.toString(nPedido.getIdPedido())); 
            if (aux != null) {
                Pedidos.remove(aux);
                resultado = updateDocument();
            }
        }
        //Luego se vuelve a agregar el pedido con la pieza editada
        if (x == 1){
            for (int i = 0; i < conPedOrf.getListaPedidosOrfebre().size(); i++) {
                if(nPedido.getIdPedido() == conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido()){
                    ArrayList<Pieza> listaPie = conPedOrf.getListaPedidosOrfebre().get(i).getListaPiezas(); 
                    agregarPedido(nPedido,listaPie);                
                    break; 
                }
            }            
        }else{
            //Aca en donde agrega el Pedido 0
            ArrayList<Pieza> listaPie = conPedOrf.getListaPiezas(); 
            agregarPedido(nPedido,listaPie);             
        }

return resultado;
    }

//PARA LOS PEDIDOS
//USADO
 private Pedido PedidoToObject(Element element) throws ParseException {
        Pedido nPedido = new Pedido(1);
        return nPedido;
    }   
//PARA SALVAR LOS PEDIDOS
 //USADO
 private Pedido PedidoToObject(Element element, Orfebre conPedOrf, int idPedido) throws ParseException {
   /*Método que retorna un Estudiante. A este metodo se le manda un Element y con
    sus datos se hará los pasos requeridos para crear el objeto Estudiante*/
        Pedido nPedido = new Pedido(Integer.parseInt(element.getChildText("cedulacliente")),Integer.parseInt(element.getChildText("costo")),Integer.parseInt(element.getChildText("abono")), element.getChildText("fechapedido"),element.getChildText("fechapedido"), conPedOrf, idPedido);
        return nPedido;

    }
 //USADO
    public boolean borrarPedido(Integer cedula) {
    /* @param cedula cédula del Estudiante a borrar
    * @return valor booleano con la condición de éxito */ 
        boolean resultado = false;
        Element aux = new Element("Pedido");
        List Pedidos = this.root.getChildren("Pedido");  
        while (aux != null) {
            aux = DaoPedidoXml.buscar(Pedidos, Integer.toString(cedula));
            if (aux != null) {
                Pedidos.remove(aux);
                resultado = updateDocument();
            }
        }
        return resultado;
    }
//USADO 
    public Pieza buscarPieza(Integer idPieza) {      
        try {

            File archivoXml = new File("src//archivosXml//pedidos.xml"); 
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
            DocumentBuilder builder = dbFactory.newDocumentBuilder(); 
            org.w3c.dom.Document documentoXml =  builder.parse(archivoXml);   
            
            documentoXml.getDocumentElement().normalize();
            
            NodeList pedidos = documentoXml.getElementsByTagName("Pedido");

            for (int i = 0; i < pedidos.getLength(); i++) {
                Node  pedido = pedidos.item(i); 
                
                if (pedido.getNodeType() == Node.ELEMENT_NODE){
                   org.w3c.dom.Element elemento = (org.w3c.dom.Element) pedido; 

                    NodeList piezas = elemento.getElementsByTagName("Pieza"); 
                    for (int j = 0; j < piezas.getLength(); j++) {
                        Node pieza = piezas.item(j);

                        System.out.println("Nombre elemento actual: "+pieza.getNodeName());

                        if (pieza.getNodeType() == Node.ELEMENT_NODE){
                            org.w3c.dom.Element elemento1 = (org.w3c.dom.Element) pieza; 
                            
                            Pieza piezaPedido = new Pieza();                         
                            
                            String quees = elemento1.getElementsByTagName("tipopieza").item(0).getTextContent(); 
                            
                            boolean sies = false; 
                            
                            if (quees.equals("Anillo creado") || quees.equals("Anillo arreglado")){
                                piezaPedido = new Anillo();
                                Anillo newPie = (Anillo) piezaPedido; 
                                newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                String idPiezaXml = String.valueOf(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()); 
                                if (idPiezaXml.equals(Integer.toString(idPieza))){
                                    sies = true; 
                                }
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
                                if (sies == true){
                                    return newPie; 
                                }
                            }else{
                                if (quees.equals("Collar creado") || quees.equals("Colalr arreglado")){
                                    piezaPedido = new Collar(); 
                                    Collar newPie = (Collar) piezaPedido;                                     
                                    newPie.setPiezaa(elemento1.getElementsByTagName("tipopieza").item(0).getTextContent());
                                    String idPiezaXml = String.valueOf(elemento1.getElementsByTagName("idpieza").item(0).getTextContent()); 
                                    if (idPiezaXml.equals(Integer.toString(idPieza))){
                                        sies = true; 
                                    }
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
                                    if (sies == true){
                                        return newPie; 
                                    }
                                }                                
                            }
                        }  
                    }
                }
            }            
        } catch (IOException | ParserConfigurationException | SAXException e) {
            System.err.println("Error: "+ e.getMessage());
        }                
 return null;     
   }    
    
    
    
}
