package controller;

import Persistencia.DaoPedidoXml;
import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Joyeria;
import modelo.Pedido;
import modelo.Orfebre;
import modelo.Cliente;
import modelo.Pieza;
import modelo.Anillo;
import modelo.Collar;
import vista.E0PagarPedido;
import vista.E1EditarPiezaCaracteristicas;
import vista.E2EditarPedidoCaracteristicas;

public class Controladora {
    
    JTextField txtIdPedido, txtIdPieza, txtCedulaCliente, txtCircunferencia2, txtCircunferencia1, txtCircunferencia3, txtCircunferencia5 , txtEscrito, txtCosto, txtAbonoInicial, txtFechaPedido, txtFechaEntregaPedido, txtTipoReparacion, txtPeso; 
    JComboBox jcbMaterial, jcbAnillo, jcbCollar, jcbTipoAnillo, jcbPurezaOro, jcbPurezaPlata; 
    JFrame ventana;
    JPanel panelMaterial, panelTamano, panelPeso, panelMensaje, panelTipoAnillo,panelArreglo; 
    com.toedter.calendar.JDateChooser jdFechaPedido, jdFechaEntrega;
    int cont = 0, nohay = 0, nop; 
    Anillo ani1, ani2; 
    Collar coll1, coll2; 
    Pedido pedidoParaPieza;
    Pedido pedidoParaPiezaEliminar;

    private boolean resultado = false, pedidoPPieza = false;
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
   //USADO 
    public Controladora(JFrame ventana){
      this.ventana = ventana;
    }
    //viene de pedido
    //USADO
    public Controladora (JFrame ventana, JTextField txtIdPedido, JTextField txtCedulaCliente, JTextField txtCosto, JTextField txtAbonoInicial, JDateChooser jdFechaPedido, JDateChooser jdFechaEntrega){
        this.txtIdPedido = txtIdPedido;
        this.txtCedulaCliente = txtCedulaCliente;
        this.txtCosto = txtCosto;
        this.txtAbonoInicial = txtAbonoInicial;
        this.jdFechaPedido = jdFechaPedido;
        this.jdFechaEntrega = jdFechaEntrega;
    }
//USADO
    public Controladora(JFrame ventana,  JTextField txtIdPieza, JTextField txtTipoReparacion, JTextField txtCircunferencia5, JTextField txtCircunferencia3, JTextField txtPeso,JTextField txtCircunferencia1, JTextField txtEscrito, JTextField txtCircunferencia2,JComboBox jcbMaterial, JComboBox jcbPurezaOro, JComboBox jcbPurezaPlata, JComboBox jcbTipoAnillo)  {

        this.txtIdPieza = txtIdPieza; 
        this.txtTipoReparacion  = txtTipoReparacion; 
        this.txtCircunferencia2 = txtCircunferencia2;
        this.txtCircunferencia1 = txtCircunferencia1; //3
        this.txtPeso = txtPeso; 
        this.txtCircunferencia3 = txtCircunferencia3;//1
        this.txtCircunferencia5 = txtCircunferencia5;
        this.txtEscrito = txtEscrito;
        this.jcbMaterial = jcbMaterial;
        this.jcbTipoAnillo = jcbTipoAnillo;
        this.jcbPurezaOro = jcbPurezaOro; 
        this.jcbPurezaPlata = jcbPurezaPlata; 
    }
    //controlador llamado desde E2EditarPedidoCaracteristica
    //USADO
    public Controladora(JFrame ventana, JTextField txtCedulaCliente, JTextField txtCosto, JTextField txtAbonoInicial, JDateChooser jdFechaEntrega, JDateChooser jdFechaPedido) {
        this.txtCedulaCliente = txtCedulaCliente;
        this.txtCosto = txtCosto;
        this.txtAbonoInicial = txtAbonoInicial;
        this.jdFechaPedido = jdFechaPedido;
        this.jdFechaEntrega = jdFechaEntrega; 
    }     
    //controlador llamado desde E1EditarPiezaCaracteristica'
    //USADO 
    public Controladora(E1EditarPiezaCaracteristicas aThis, JComboBox<String> jcbMaterial, JComboBox<String> jcbPurezaPlata, JComboBox<String> jcbPurezaOro, JTextField txtPeso, JTextField txtTamano, JTextField txtMensaje, JComboBox<String> jcbTipoAnillo, JTextField txtTipoArreglo, JPanel panelMaterial, JPanel panelTamano, JPanel panelPeso, JPanel panelMensaje, JPanel panelTipoAnillo, JPanel panelArreglo) {
        this.jcbMaterial = jcbMaterial; 
        this.jcbPurezaOro = jcbPurezaOro; 
        this.jcbPurezaPlata = jcbPurezaPlata; 
        this.txtPeso = txtPeso; 
        this.txtCircunferencia1 = txtTamano; 
        this.txtEscrito = txtMensaje; 
        this.jcbTipoAnillo = jcbTipoAnillo; 
        this.txtTipoReparacion = txtTipoArreglo; 
        this.panelMaterial = panelMaterial; 
        this.panelArreglo = panelArreglo; 
        this.panelMensaje = panelMensaje; 
        this.panelPeso = panelPeso;
        this.panelTamano = panelTamano; 
        this.panelTipoAnillo = panelTipoAnillo;        
    }
//USADO
    public Controladora(E0PagarPedido aThis, JTextField txtIdPedido, JTextField txtIdAbonoNuevo) {
        this.txtAbonoInicial = txtIdAbonoNuevo;
        this.txtIdPedido = txtIdPedido;        
    }


    //USADO 
    public void iniciaVentana(JFrame ventana, String ruta){
        ventana.setResizable(false);
        ventana.setLocationRelativeTo(null);
        ventana.setIconImage(new ImageIcon(ruta).getImage());        
    }
    
//USADO    
     public  void  datosPedido(Orfebre arrayPed, Cliente arrayPedCli,  ArrayList<Pieza> listaPie){ //se usa en C2PantallaPedido cuando se crea el pedido
        Pedido p =new Pedido();
 
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
        String fechaPedido = dFormat.format(jdFechaPedido.getDate());
        String fechaEntrega = dFormat.format(jdFechaEntrega.getDate());
            p.setIdPedido(Integer.parseInt(txtIdPedido.getText()));
            p.setCedulaCliente(Integer.parseInt(txtCedulaCliente.getText()));    
            p.setCostoTotal(Integer.parseInt(txtCosto.getText()));
            p.setAbonoInicial(Integer.parseInt(txtAbonoInicial.getText()));
            p.setFechaPedido(fechaPedido);
            p.setFechaEntrega(fechaEntrega);
            p.setListaPiezas(listaPie);
            arrayPed.incluirPedOrfebre(p); 
            //ENTRAR A DaoPedidoXml
            resultado = datosPed.agregarPedido(p, listaPie);
           if (resultado == true) {
               JOptionPane.showMessageDialog(null, "Pedido numero "+txtIdPedido.getText(), " agregado con exito!", JOptionPane.INFORMATION_MESSAGE);
           } else 
               JOptionPane.showMessageDialog(null, "Operacion Fallida, no se agrego el Pedido numero "+txtIdPedido.getText(), "Error", JOptionPane.ERROR_MESSAGE);
    }  

    //LLENA EL XML CON EL PEDIDO 0, EL CUAL CONTIENE TODAS LAS PIEZAS SINEDO O NO PARTE DE UN PEDIDO 
//USADO
    public  void  llenarXMLConPedido0(Orfebre arrayPed){ 
            Pedido pedidoTodasPiezas = new Pedido(); 
            pedidoTodasPiezas.setIdPedido(000);
            pedidoTodasPiezas.setCedulaCliente(000);
            pedidoTodasPiezas.setCostoTotal(000);
            pedidoTodasPiezas.setAbonoInicial(000);
            pedidoTodasPiezas.setFechaPedido("0-0-0");
            pedidoTodasPiezas.setFechaEntrega("0-0-0");
            pedidoTodasPiezas.setListaPiezas(arrayPed.getListaPiezas());
            datosPed.actualizarPedido(pedidoTodasPiezas, arrayPed, 2); 
 }        
     
    //USADO 
    public void datosPieza(ArrayList<Pieza> listaPie, Pieza pie, int x, Orfebre arrayPie){
        if (x == 1){
            if (pie instanceof Anillo){
                Anillo newPie = (Anillo) pie; 
                    newPie.setPiezaa("Anillo creado");
                    newPie.setIdPieza(Integer.parseInt(txtIdPieza.getText()));
                    newPie.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));       
                    newPie.setCircunferencia(Integer.parseInt(txtCircunferencia1.getText())); 
                    newPie.setTipoAnillo(String.valueOf(jcbTipoAnillo.getSelectedItem()));
                    newPie.setMensaje(txtEscrito.getText());
                    String saberPureza = newPie.getTipomaterial(), oro = "Oro", plata = "Plata", otro = "";  
                
                    if (saberPureza.equals(oro)){
                        String pure = String.valueOf(jcbPurezaOro.getSelectedItem()); 
                        int pure1 = Integer.parseInt(pure); 
                        newPie.setPurezamaterial(pure1);                    
                    }else{
                        if (saberPureza.equals(plata)){
                            String pure = String.valueOf(jcbPurezaPlata.getSelectedItem()); 
                            int pure1 = Integer.parseInt(pure); 
                            newPie.setPurezamaterial(pure1);   
                        }else{
                            if (saberPureza.equals(otro)){
                                newPie.setPurezamaterial(0);
                            }
                        }
                    }
                
                    String peso = String.valueOf(txtPeso.getText()); 
                    int peso1 = Integer.parseInt(peso);                
                    newPie.setPeso(peso1);
                    arrayPie.incluirPieOrfebre(newPie);
                    listaPie.add(newPie); 
            }
            if (pie instanceof Collar){
                Collar newPie = (Collar) pie; 
                    newPie.setPiezaa("Collar creado");
                    newPie.setIdPieza(Integer.parseInt(txtIdPieza.getText()));
                    newPie.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));  
                    newPie.setTamaño(Integer.parseInt(txtCircunferencia2.getText())); 
                    newPie.setMensaje("");
                    newPie.setTipoCollar("");
                    String saberPureza = newPie.getTipomaterial(), oro = "Oro", plata = "Plata", otro = "";    

                    if (saberPureza.equals(oro)){
                        String pure = String.valueOf(jcbPurezaOro.getSelectedItem()); 
                        int pure1 = Integer.parseInt(pure); 
                        newPie.setPurezamaterial(pure1);                    
                    }else{
                        if (saberPureza.equals(plata)){
                            String pure = String.valueOf(jcbPurezaPlata.getSelectedItem()); 
                            int pure1 = Integer.parseInt(pure); 
                            newPie.setPurezamaterial(pure1);   
                        }else{
                            if (saberPureza.equals(otro)){
                                newPie.setPurezamaterial(0);
                            }
                        }
                    }

                    String peso = String.valueOf(txtPeso.getText()); 
                    int peso1 = Integer.parseInt(peso);                
                    newPie.setPeso(peso1);
                    arrayPie.incluirPieOrfebre(newPie);
                    listaPie.add(newPie); 
            }            
        }else{      
                if (pie instanceof Anillo){
                    Anillo newPie = (Anillo) pie; 
                        newPie.setPiezaa("Anillo arreglado");
                        newPie.setIdPieza(Integer.parseInt(txtIdPieza.getText()));
                        newPie.setCircunferencia(Integer.parseInt(txtCircunferencia3.getText())); 
                        newPie.setTipoArreglo(txtTipoReparacion.getText());
                        newPie.setTipomaterial("N/A");       
                        newPie.setTipoAnillo("N/A");
                        newPie.setMensaje("N/A");
                        newPie.setPurezamaterial(0);   
                        newPie.setPeso(0);   
                        arrayPie.incluirPieOrfebre(newPie);  
                        listaPie.add(newPie); 
                }
                if (pie instanceof Collar){
                    Collar newPie = (Collar) pie; 
                        newPie.setPiezaa("Collar arreglado");
                        newPie.setIdPieza(Integer.parseInt(txtIdPieza.getText()));
                        newPie.setTamaño(Integer.parseInt(txtCircunferencia5.getText())); 
                        newPie.setTipoArreglo(txtTipoReparacion.getText());
                        newPie.setTipomaterial("N/A");     
                        newPie.setMensaje("N/A");
                        newPie.setTipoCollar("N/A");
                        newPie.setPurezamaterial(0); 
                        newPie.setPeso(0);   
                        arrayPie.incluirPieOrfebre(newPie);
                        listaPie.add(newPie); 
                } 
        }
    }
    //LLamada a controladora de E2EditarPedidoCaracteristicas 
    //USADO
    public void datosPedidoModif(Orfebre arrayPed, Cliente arrayPedCli,  boolean cedula, boolean costo, boolean abono, boolean fechas, int id){ 
        
        Pedido ped=null;   
            ArrayList<Pedido> listaPed; 
            listaPed = arrayPed.getListaPedidosOrfebre();
            for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista
            {
               if (id==listaPed.get(i).getIdPedido()){
                  ped = listaPed.get(i);
                  break; 
               }                 
          }        
        if (cedula){
            ped.setCedulaCliente(Integer.parseInt(txtCedulaCliente.getText()));
        } 
        
        if (costo){
            ped.setCostoTotal(Integer.parseInt(txtCosto.getText()));
        }
        
        if(abono){
            ped.setAbonoInicial(Integer.parseInt(txtAbonoInicial.getText()));
        }    
            
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
        if(fechas){            
            String fechaPedido1 = dFormat.format(jdFechaPedido.getDate());
            ped.setFechaPedido(fechaPedido1);
            String fechaEntrega1 = dFormat.format(jdFechaEntrega.getDate());    
            ped.setFechaEntrega(fechaEntrega1);           
        }  
    }
    
    //LLamada a controladora de E1EditarPiezaCaracteristicas 
    //USADO
    public void datosPiezaModif(Orfebre arrayPed, int id , boolean material, boolean tipoAnillo, boolean peso, boolean tamano, boolean mensaje, boolean tipoArreglo, boolean anilloCreado, boolean collarCreado, boolean arreglados){ 
        //Obtener la pieza de la lista general de piezas que tiene el mismo id Pieza que le dio el usuario 
        Pieza pie =  null; 
        ArrayList<Pieza> listaPieza; 
        listaPieza = arrayPed.getListaPiezas();
        for(int i=0; i < listaPieza.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mi'
        {
            if (id == listaPieza.get(i).getIdPieza()){
                pie = listaPieza.get(i);
                if (pie instanceof Anillo){
                    Anillo ani = (Anillo) listaPieza.get(i); 
                    this.ani1 = ani;
                }else{
                    if (pie instanceof Collar){
                        Collar coll = (Collar) listaPieza.get(i); 
                        this.coll1 = coll; 
                    }
                }
               
                break; 
            }  
        }  
        //Obtener la pieza de la lista de piezas que tiene un pedido en concreto, con el mismo IdPieza que dio el usuario
        Pedido ped=null;   
        ArrayList<Pedido> listaPed; 
        listaPed = arrayPed.getListaPedidosOrfebre();
        for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista
        {
            ped = listaPed.get(i); 
            ArrayList<Pieza> listaPiezas; 
            listaPiezas = ped.getListaPiezas();
            if (listaPiezas == null || listaPiezas.isEmpty()){
                nohay = 1; 
                this.nop = 0; 
            }else{
                nohay = 0; 
                for (int j = 0; j < listaPiezas.size(); j++) {
                    Pieza piePed = listaPiezas.get(j); 
                    if (id == piePed.getIdPieza()){
                        if (piePed instanceof Anillo){
                            Anillo ani = (Anillo) listaPieza.get(j); 
                            this.ani2 = ani;                            
                        }else{
                            if (piePed instanceof Collar){
                                Collar coll = (Collar) listaPieza.get(j); 
                                this.coll2 = coll;                                
                            }
                        } 
                    }else{
                         this.nop = 0;
                    }
                }                
            }                                
        }  
        if(this.nop == 0){
            nohay = 1; 
        }
            
        if (anilloCreado){
            if (material){
                System.out.println("antes");
                this.ani1.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));
                if (nohay == 0){
                    System.out.println("ante111s");
                    this.ani2.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));    
                }               
                String saberPureza = this.ani1.getTipomaterial(), oro = "Oro", plata = "Plata", otro = "";   
                if (saberPureza.equals(oro)){
                    String pure = String.valueOf(jcbPurezaOro.getSelectedItem()); 
                    int pure1 = Integer.parseInt(pure); 
                    this.ani1.setPurezamaterial(pure1);
                    if (nohay == 0){
                        this.ani2.setPurezamaterial(pure1);
                    }                    
                }else{
                    if (saberPureza.equals(plata)){
                        String pure = String.valueOf(jcbPurezaPlata.getSelectedItem()); 
                        int pure1 = Integer.parseInt(pure); 
                        this.ani1.setPurezamaterial(pure1);
                        if (nohay == 0){
                            this.ani2.setPurezamaterial(pure1);
                        }                        
                    }else{
                        if (saberPureza.equals(otro)){
                            this.ani1.setPurezamaterial(0);
                            if (nohay == 0){
                                this.ani2.setPurezamaterial(0);
                            }                           
                        }
                    }
                }             
            }
            if (peso){
                this.ani1.setPeso(Integer.parseInt(txtPeso.getText()));
                if (nohay == 0){
                    this.ani2.setPeso(Integer.parseInt(txtPeso.getText()));
                }                
            }
            if (tamano){
                this.ani1.setCircunferencia(Integer.parseInt(txtCircunferencia1.getText()));
                if (nohay == 0){
                    this.ani2.setCircunferencia(Integer.parseInt(txtCircunferencia1.getText()));
                }                
            }
            if (mensaje){
                this.ani1.setMensaje(txtEscrito.getText());
                if (nohay == 0){
                    this.ani2.setMensaje(txtEscrito.getText());
                }                
            }
            if (tipoAnillo){
                this.ani1.setTipoAnillo(String.valueOf(jcbTipoAnillo.getSelectedItem()));
                if (nohay == 0){
                    this.ani2.setTipoAnillo(String.valueOf(jcbTipoAnillo.getSelectedItem()));
                }                
            }
        }else{
            if (collarCreado){
                if (material){
                    this.coll1.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));
                    if (nohay == 0){
                        this.coll2.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));
                    }                  

                    String saberPureza = this.coll1.getTipomaterial(), oro = "Oro", plata = "Plata", otro = "";   
                    if (saberPureza.equals(oro)){
                        String pure = String.valueOf(jcbPurezaOro.getSelectedItem()); 
                        int pure1 = Integer.parseInt(pure); 
                        this.coll1.setPurezamaterial(pure1);
                        if (nohay == 0){
                            this.coll2.setPurezamaterial(pure1);
                        }
                    }else{
                        if (saberPureza.equals(plata)){
                            String pure = String.valueOf(jcbPurezaPlata.getSelectedItem()); 
                            int pure1 = Integer.parseInt(pure); 
                            this.coll1.setPurezamaterial(pure1);
                            if (nohay == 0){
                                this.coll2.setPurezamaterial(pure1);
                            }
                        }else{
                            if (saberPureza.equals(otro)){
                                this.coll1.setPurezamaterial(0);
                                if (nohay == 0){
                                    this.coll2.setPurezamaterial(0);
                                }
                            }
                        }
                    }             
                }
                if (peso){
                    this.coll1.setPeso(Integer.parseInt(txtPeso.getText()));
                    if (nohay == 0){
                        this.coll2.setPeso(Integer.parseInt(txtPeso.getText()));
                    }                    
                }
                if (tamano){
                    this.coll1.setTamaño(Integer.parseInt(txtCircunferencia1.getText()));
                    if (nohay == 0){
                        this.coll2.setTamaño(Integer.parseInt(txtCircunferencia1.getText()));                        
                    }
                }
            }else{
                if (arreglados){
                    if (this.ani1 instanceof Anillo){
                        if (tamano){
                            this.ani1.setCircunferencia(Integer.parseInt(txtCircunferencia1.getText()));
                            if (nohay == 0){
                                this.ani2.setCircunferencia(Integer.parseInt(txtCircunferencia1.getText()));
                            }                            
                        }else
                            if (tipoArreglo){
                                this.ani1.setTipoArreglo(txtTipoReparacion.getText());
                                if (nohay == 0){
                                    this.ani2.setTipoArreglo(txtTipoReparacion.getText());
                                }                                
                            }
                    }else{
                        if (this.coll1 instanceof Collar){
                            if (tamano){
                                this.coll1.setTamaño(Integer.parseInt(txtCircunferencia1.getText()));
                                if (nohay == 0){
                                    this.coll2.setTamaño(Integer.parseInt(txtCircunferencia1.getText()));
                                }                                
                            }
                            if (tipoArreglo){
                                this.coll1.setTipoArreglo(txtTipoReparacion.getText());
                                if (nohay == 0){
                                    this.coll2.setTipoArreglo(txtTipoReparacion.getText());
                                }                                
                            }                           
                        }
                    } 
                }
            }
        }    
    }       

//LLENADOR DE TABLA PEDIDOS CON CONSULTA 
    //USADO
    public void llenarTablaPedidosCon(Orfebre arrayPed, Cliente arrayPedCli, JTable tablaCreado, ArrayList<Pedido> lista, ArrayList<Pieza> listaPieza, String caracteristica){ //Tienda arrayElec
          String[] columna = {"TIPO", "Id Pedido", "Cedula Cliente", "Id Pieza", "Material", "Pureza", "Costo", "Abono Inicial", "Fecha Pedido", "Fecha Entrega"}; 
          DefaultTableModel dtm = new DefaultTableModel(null,columna);
          lista = arrayPed.getListaPedidosOrfebre();
          for(int i=0; i < lista.size();i++)
          {
              //if (!lista.get(i).getListaPiezas().isEmpty()){
                /*String[] row = {Integer.toString(lav.getPrecioBase()), lav.getColor(), lav.getConsumoElectrico(), Integer.toString(lav.getPeso()), Integer.toString(lav.getCarga()) }; 
                dtm.addRow(row);*/
                   String idPedido = String.valueOf(lista.get(i).getIdPedido()); 
                   String cedula = String.valueOf(lista.get(i).getCedulaCliente()); 
                   String costoTotal = String.valueOf(lista.get(i).getCostoTotal()); 
                   String abonoInicial = String.valueOf(lista.get(i).getAbonoInicial());                   
                   
                   
                   if  (caracteristica.equalsIgnoreCase(idPedido) || caracteristica.equalsIgnoreCase(cedula) || caracteristica.equalsIgnoreCase(costoTotal) || caracteristica.equalsIgnoreCase(abonoInicial))
                   {  
                       Pedido ped = (Pedido)lista.get(i);
                       if (ped.getListaPiezas() != null){
                          boolean listo =false;    
                          for(int j=0; j < ped.getListaPiezas().size();j++){
                              if (ped.getListaPiezas().get(j) instanceof Anillo){System.out.println("11111");
                                   Anillo pie = (Anillo)ped.getListaPiezas().get(j); 
                                   String[] row ={pie.getPiezaa(), Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),Integer.toString(pie.getIdPieza()),pie.getTipomaterial() ,Integer.toString(pie.getPurezamaterial()), Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                                   dtm.addRow(row);
                                   listo = true; 
                              }else{
                                  if (ped.getListaPiezas().get(j) instanceof Collar){System.out.println("22222");
                                       Collar pie = (Collar)ped.getListaPiezas().get(j); 
                                       String[] row ={pie.getPiezaa(), Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),Integer.toString(pie.getIdPieza()),pie.getTipomaterial() ,Integer.toString(pie.getPurezamaterial()), Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                                       dtm.addRow(row);  
                                       listo = true; 
                                  }
                              }
                          }
                          if (listo == false){
                              String[] row ={"N/P", Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),"N/P","N/P","N/P", Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                              dtm.addRow(row);
                          }
                       }
                   }                   
            //  }   System.out.println("ESTA VACIA LA LISTA DEPIEZAS ");            
          }
    tablaCreado.setModel(dtm);                 
    }
//LLENADOR DE TABLA CON CONSULTA DE ARREGLADOS  
//USADO 
    public boolean llenarTablaPiezasCon(Orfebre arrayPed,JTable tablaPieza, String caracteristica){ //Tienda arrayElec
          String[] columna = {"TIPO", "Id Pieza", "Material", "Pureza", "Peso", "Tamano", "Tipo Anillo", "Mensaje", "Tipo Arreglo"};
          DefaultTableModel dtm = new DefaultTableModel(null,columna); 
          ArrayList<Pieza> lista = arrayPed.getListaPiezas(); 
          for(int i=0; i < lista.size();i++)
          {   
              String tipo = lista.get(i).getPiezaa(); 
              String idPieza = String.valueOf(lista.get(i).getIdPieza());
              String material = lista.get(i).getTipomaterial(); 
              String pureza = String.valueOf(lista.get(i).getPurezamaterial()); 
              String peso = String.valueOf(lista.get(i).getPeso()); 
              
             // String tipoAnillo = lista.get(i).gettipoAnillo();
             if (!caracteristica.equalsIgnoreCase("N/A")){
                  String tipoArreglo = lista.get(i).getTipoArreglo(); 
                  if (tipo.equals("Anillo creado") || tipo.equals("Collar creado")){
                      if (lista.get(i) instanceof Anillo){
                          Anillo pie = (Anillo)lista.get(i); 
                          String mensaje = pie.getMensaje(); 
                          String circunferencia = String.valueOf(pie.getCircunferencia()); 
                          if ( caracteristica.equalsIgnoreCase(tipo) || caracteristica.equalsIgnoreCase(idPieza) || caracteristica.equalsIgnoreCase(material) || caracteristica.equalsIgnoreCase(pureza) || caracteristica.equalsIgnoreCase(peso) || caracteristica.equalsIgnoreCase(tipoArreglo) || caracteristica.equalsIgnoreCase(circunferencia) || caracteristica.equalsIgnoreCase(mensaje))
                          {  
                              String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(((Anillo) pie).getCircunferencia()) ,((Anillo) pie).getTipoAnillo(), ((Anillo) pie).getMensaje(), "N/A"}; 
                              dtm.addRow(row); 
                              cont = 1;                           
                          }
                      }else{
                          if (lista.get(i) instanceof Collar){
                              Collar pie = (Collar)lista.get(i); 
                              String tamano = String.valueOf(pie.getTamaño());
                              if ( caracteristica.equalsIgnoreCase(tipo) || caracteristica.equalsIgnoreCase(idPieza) || caracteristica.equalsIgnoreCase(material) || caracteristica.equalsIgnoreCase(pureza) || caracteristica.equalsIgnoreCase(peso) || caracteristica.equalsIgnoreCase(tipoArreglo) || caracteristica.equalsIgnoreCase(tamano))
                              {  
                                  String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(pie.getTamaño()) ,"N/A", "N/A", "N/A"}; 
                                  dtm.addRow(row);
                                  cont = 1;  
                              }   
                          }
                      }             
                  }else{
                      if (lista.get(i) instanceof Anillo){
                          Anillo pie = (Anillo)lista.get(i); 
                          String mensaje = pie.getMensaje(); 
                          String circunferencia = String.valueOf(pie.getCircunferencia()); 
                          if ( caracteristica.equalsIgnoreCase(tipo) || caracteristica.equalsIgnoreCase(idPieza) || caracteristica.equalsIgnoreCase(material) || caracteristica.equalsIgnoreCase(pureza) || caracteristica.equalsIgnoreCase(peso) || caracteristica.equalsIgnoreCase(tipoArreglo) || caracteristica.equalsIgnoreCase(circunferencia) || caracteristica.equalsIgnoreCase(mensaje))
                          {  
                              String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(((Anillo) pie).getCircunferencia()) ,((Anillo) pie).getTipoAnillo(), ((Anillo) pie).getMensaje(), pie.getTipoArreglo()}; 
                              dtm.addRow(row);
                              cont = 1; 
                          }

                      }else{
                          if (lista.get(i) instanceof Collar){
                              Collar pie = (Collar)lista.get(i); 
                              String tamano = String.valueOf(pie.getTamaño());
                              if ( caracteristica.equalsIgnoreCase(tipo) || caracteristica.equalsIgnoreCase(idPieza) || caracteristica.equalsIgnoreCase(material) || caracteristica.equalsIgnoreCase(pureza) || caracteristica.equalsIgnoreCase(peso) || caracteristica.equalsIgnoreCase(tipoArreglo) || caracteristica.equalsIgnoreCase(tamano))
                              {  
                                  String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(pie.getTamaño()) ,"N/A", "N/A", pie.getTipoArreglo()}; 
                                  dtm.addRow(row);
                                  cont = 1; 
                              }                              
                          }
                      }            
                  }                 
             }
          }
          if (cont == 1){
              tablaPieza.setModel(dtm);
              return true; 
          }else{
              return false; 
          }                   
    }        
                
    //USADO        
    public void  llenarTablaPieza(Orfebre arrayPed, Cliente arrayPedCli, JTable tablaCreado){ 
        String[] columna = {"TIPO", "Id Pieza", "Material", "Pureza", "Peso", "Tamano", "Tipo Anillo", "Mensaje", "Tipo Arreglo"}; 
        DefaultTableModel dtm = new DefaultTableModel(null,columna);
        ArrayList<Pieza> listaPieza = arrayPed.getListaPiezas(); 
          
          for(int i=0; i < listaPieza.size();i++)
          { 
              Pieza pie = (Pieza)listaPieza.get(i);
              String pieza1 = "Anillo arreglado", pieza2 = "Collar arreglado"; 
              if (!pie.getPiezaa().equalsIgnoreCase(pieza1) || !pie.getPiezaa().equalsIgnoreCase(pieza2)){
                  if (pie instanceof Anillo){
                      Anillo ani = (Anillo)pie; 
                      String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(((Anillo) pie).getCircunferencia()) ,((Anillo) pie).getTipoAnillo(), ((Anillo) pie).getMensaje(), "N/A"}; 
                      dtm.addRow(row);
                  }else{
                      Collar newPie = (Collar) pie; 
                      String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(newPie.getTamaño()) ,"N/A", "N/A", "N/A"}; 
                      dtm.addRow(row);
                  }
              }else{
                  
               if (pie instanceof Anillo){
                      Anillo ani = (Anillo)listaPieza.get(i);
                      String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(((Anillo) pie).getCircunferencia()) ,((Anillo) pie).getTipoAnillo(), ((Anillo) pie).getMensaje(),ani.getTipoArreglo()}; 
                      dtm.addRow(row);
                  }else{
                      Collar colla = (Collar)listaPieza.get(i);
                      String[] row ={pie.getPiezaa(), Integer.toString(pie.getIdPieza()),pie.getTipomaterial(),Integer.toString(pie.getPurezamaterial()),Integer.toString(pie.getPeso()),Integer.toString(colla.getTamaño()) ,"N/A", "N/A",colla.getTipoArreglo() }; 
                      dtm.addRow(row);                      
                 }                   
              }           
          } 
    tablaCreado.setModel(dtm);                    
    
    }    
//USADO
    public void  llenarTablaPedidos(Orfebre arrayPed, Cliente arrayPedCli, JTable tablaCreado, ArrayList<Pedido> lista, ArrayList<Pieza> listaPieza){
          String[] columna = {"TIPO", "Id Pedido", "Cedula Cliente", "Id Pieza", "Material", "Pureza", "Costo", "Abono Inicial", "Fecha Pedido", "Fecha Entrega"}; 
          DefaultTableModel dtm = new DefaultTableModel(null,columna);
          lista = arrayPed.getListaPedidosOrfebre();
          for(int i=0; i < lista.size();i++)
          {              
              Pedido ped = (Pedido)lista.get(i);
              if (ped.getListaPiezas() != null){
              boolean listo =false;    
                  for(int j=0; j < ped.getListaPiezas().size();j++){
                      if (ped.getListaPiezas().get(j) instanceof Anillo){
                           Anillo pie = (Anillo)ped.getListaPiezas().get(j); 
                           String[] row ={pie.getPiezaa(), Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),Integer.toString(pie.getIdPieza()),pie.getTipomaterial() ,Integer.toString(pie.getPurezamaterial()), Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                           dtm.addRow(row);
                           listo = true; 
                      }else{
                          if (ped.getListaPiezas().get(j) instanceof Collar){
                               Collar pie = (Collar)ped.getListaPiezas().get(j); 
                               String[] row ={pie.getPiezaa(), Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),Integer.toString(pie.getIdPieza()),pie.getTipomaterial() ,Integer.toString(pie.getPurezamaterial()), Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                               dtm.addRow(row);  
                               listo = true; 
                          }
                      }
                  }
                  if (listo == false){
                      String[] row ={"N/P", Integer.toString(ped.getIdPedido()),Integer.toString(ped.getCedulaCliente()),"N/P","N/P","N/P", Integer.toString(ped.getCostoTotal()), Integer.toString(ped.getAbonoInicial()), ped.getFechaPedido(), ped.getFechaEntrega()}; 
                      dtm.addRow(row);
                  }                  
              }
          } 
    tablaCreado.setModel(dtm);        
    }

  //222VIENE DE EDITAR PEDIDO
  //USADO
    public void salvarPedido(DaoPedidoXml datosPed, JTextField txtCedulaCliente, JTextField txtCosto, JTextField txtAbonoInicial, String fechaPedido1, String fechaEntrega1, int id, Orfebre conPedOrf, boolean cedula, boolean costo, boolean abono, boolean fechas) {
        Pedido ped = datosPed.buscarPedido(id, conPedOrf, 1); 
        Pedido copia = ped;         
        ped.setIdPedido(id);
        if (cedula){
            ped.setCedulaCliente(Integer.parseInt(txtCedulaCliente.getText()));
        }else{
             ped.setCedulaCliente(copia.getCedulaCliente());
        }
        
        if (costo){
            ped.setCostoTotal(Integer.parseInt(txtCosto.getText()));
        }else{
            ped.setCostoTotal(copia.getCostoTotal());
        }
        
        if (abono){
            ped.setAbonoInicial(Integer.parseInt(txtAbonoInicial.getText()));
        }else{
            ped.setAbonoInicial(copia.getAbonoInicial());
        }   
        if (fechas){                     
            ped.setFechaPedido(fechaPedido1);
            ped.setFechaEntrega(fechaEntrega1);
        }else{
            System.out.println("no es fechas");
            ped.setFechaPedido(copia.getFechaPedido());
            ped.setFechaEntrega(copia.getFechaEntrega());
        }
        datosPed.actualizarPedido(ped, conPedOrf, 1); 
    }

//USADO
    public void salvarPieza(DaoPedidoXml datosPed, JTextField txtPeso, JTextField txtTamano, JTextField txtCosto, JTextField txtAbonoInicial, JTextField txtMensaje, JTextField txtTipoArreglo, JComboBox<String> jcbMaterial, JComboBox<String> jcbPurezaOro, JComboBox<String> jcbPurezaPlata, boolean material, boolean tipoAnillo, boolean peso, boolean tamano, boolean mensaje, boolean tipoArreglo, boolean anilloCreado, boolean collarCreado, boolean arreglados, int id, boolean anilloArreglado, boolean collarArreglado, Orfebre conPedOrf) {
        this.pedidoPPieza = false; 
        Pieza pie = datosPed.buscarPieza(id); 
        Pieza pieCopia = pie; 
        pie.setIdPieza(id);
        if (pie instanceof Anillo){
            if (anilloCreado){
                if (material){
                    pie.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));
                    if (pie.getTipomaterial().equals("Oro")){
                        pie.setPurezamaterial(Integer.parseInt((String) jcbPurezaOro.getSelectedItem()));
                    }else{
                        if (pie.getTipomaterial().equals("Plata")){
                            pie.setPurezamaterial(Integer.parseInt((String) jcbPurezaPlata.getSelectedItem()));
                        }else{
                            pie.setPurezamaterial(0);
                        }
                    }                
                }else{
                    pie.setTipomaterial(pieCopia.getTipomaterial());
                }
                if (tipoAnillo){
                     ((Anillo) pie).setTipoAnillo(String.valueOf(jcbTipoAnillo.getSelectedItem()));
                }
                if (peso){
                    pie.setPeso(Integer.parseInt(txtPeso.getText()));
                }else{
                    pie.setPeso(pieCopia.getPeso());
                }
                if (tamano){
                    ((Anillo) pie).setCircunferencia(Integer.parseInt(txtTamano.getText()));
                }
                if (mensaje){
                    ((Anillo) pie).setMensaje(txtMensaje.getText());
                }
            }else{
                if (anilloArreglado){
                    if (tipoArreglo){
                        pie.setTipoArreglo(txtTipoArreglo.getText());
                    }
                    if (tamano){
                        ((Anillo) pie).setCircunferencia(Integer.parseInt(txtTamano.getText()));
                    }                    
                }
            }
        }else{
            if (collarCreado){
               if (material){
                    pie.setTipomaterial(String.valueOf(jcbMaterial.getSelectedItem()));
                    if (pie.getTipomaterial().equals("Oro")){
                        pie.setPurezamaterial(Integer.parseInt((String) jcbPurezaOro.getSelectedItem()));
                    }else{
                        if (pie.getTipomaterial().equals("Plata")){
                            pie.setPurezamaterial(Integer.parseInt((String) jcbPurezaPlata.getSelectedItem()));
                        }else{
                            pie.setPurezamaterial(0);
                        }
                    }

                }else{
                    pie.setTipomaterial(pieCopia.getTipomaterial());
                }
                if (tipoAnillo){
                     ((Collar) pie).setTipoCollar("N/A");
                }
                if (peso){
                    pie.setPeso(Integer.parseInt(txtPeso.getText()));
                }else{
                    pie.setPeso(pieCopia.getPeso());
                }
                if (tamano){
                    ((Collar) pie).setTamaño(Integer.parseInt(txtTamano.getText()));
                }
                if (mensaje){
                    ((Collar) pie).setMensaje(txtMensaje.getText());
                }

            }else{
                if (collarArreglado){
                    if (tipoArreglo){
                        pie.setTipoArreglo(txtTipoArreglo.getText());
                    }   
                    if (tamano){
                        ((Collar) pie).setTamaño(Integer.parseInt(txtTamano.getText()));
                    }
                }
            }
        }
        //Encontramos el pedido que contiene a la pieza del pedido
        Pedido ped=null;   
        ArrayList<Pedido> listaPed; 
        listaPed = conPedOrf.getListaPedidosOrfebre();
        for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista
        {
            ped = listaPed.get(i); 
            ArrayList<Pieza> listaPiezas; 
            listaPiezas = ped.getListaPiezas();
            for (int j = 0; j < listaPiezas.size(); j++) {
                Pieza piePed = listaPiezas.get(j); 
                if (id == piePed.getIdPieza()){
                    this.pedidoParaPieza = ped;   //pedido que tiene esa pieza
                    this.pedidoPPieza = true; 
                    break; 
                }
            }
            if (this.pedidoPPieza){
                break; 
            }                    
        }         
        //Aca removemos la pieza vieja que tenia el pedido sin la modificacion, y luego le insertamos la pieza ya modificada
        if (this.pedidoPPieza){
            for (int v = 0; v < this.pedidoParaPieza.getListaPiezas().size(); v++) {
                Pieza piePed = this.pedidoParaPieza.getListaPiezas().get(v); 
                ArrayList<Pieza> listaPiezaDePedido = this.pedidoParaPieza.getListaPiezas();
                if (piePed.getIdPieza() == pie.getIdPieza()){
                    listaPiezaDePedido.remove(piePed); 
                    listaPiezaDePedido.add(pie); 
                    break; 
                }
            }  //Esto se usa para que si solo existe una pieza(y esta se elimina) en el pedido, se eliminara el pedido tambien del xml 
                datosPed.actualizarPedido(this.pedidoParaPieza, conPedOrf,1); 
        
        }
        
    }
//USADO
     public void elimiarPiezasXml(DaoPedidoXml datosPed, int id, Orfebre conPedOrf) {
        this.pedidoPPieza = false; 
        Pieza pie = datosPed.buscarPieza(id); 
        //Encontramos el pedido que contiene a la pieza del pedido
        Pedido ped=null;   
        ArrayList<Pedido> listaPed; 
        listaPed = conPedOrf.getListaPedidosOrfebre();
        for(int i=0; i < listaPed.size();i++)
        {
            ped = listaPed.get(i); 
            ArrayList<Pieza> listaPiezas; 
            listaPiezas = ped.getListaPiezas();
            for (int j = 0; j < listaPiezas.size(); j++) {
                Pieza piePed = listaPiezas.get(j); 
                if (id == piePed.getIdPieza()){
                    this.pedidoParaPiezaEliminar = ped;   //pedido que tiene esa pieza
                    this.pedidoPPieza = true; 
                    break; 
                }
            }
            if (this.pedidoPPieza){
                break; 
            }                    
        }         
        //Aca removemos la pieza vieja que tenia el pedido sin la modificacion, y luego le insertamos la pieza ya modificada
        if (this.pedidoPPieza){
            for (int v = 0; v < this.pedidoParaPiezaEliminar.getListaPiezas().size(); v++) {
                Pieza piePed = this.pedidoParaPiezaEliminar.getListaPiezas().get(v); 
                ArrayList<Pieza> listaPiezaDePedido = this.pedidoParaPiezaEliminar.getListaPiezas();
                if (piePed.getIdPieza() == pie.getIdPieza()){
                    listaPiezaDePedido.remove(piePed);   
                    
                    if (!listaPiezaDePedido.isEmpty()){
                        System.out.println("entrando en primera");
                        datosPed.actualizarPedido(this.pedidoParaPiezaEliminar, conPedOrf, 1); 
                    }else{System.out.println("entrando en segunda");
                        datosPed.borrarPedido(this.pedidoParaPiezaEliminar.getIdPedido());
                    }                   
                    break; 
                }
            }
        }                
    }
  
  
}

