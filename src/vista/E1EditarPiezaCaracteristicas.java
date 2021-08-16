package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Anillo;
import modelo.Cliente;
import modelo.Collar;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;


public class E1EditarPiezaCaracteristicas extends javax.swing.JFrame {
    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    boolean material, tipoAnillo, peso, tamano, mensaje, tipoArreglo, anilloCreado, collarCreado, arreglados, anilloArreglado, collarArreglado, avanzar0 = false,avanzar1 = false, avanzar2 = false, avanzar3 = false; 
    String materia1, tipoAnillo1, peso1, tamano1, mensaje1, tipoArreglo1, pureza1; 
    int id; 
    Anillo ani1; 
    Collar coll1; 
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
    public E1EditarPiezaCaracteristicas() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 
    }
    //USADO 
     E1EditarPiezaCaracteristicas(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie, boolean material, boolean tipoAnillo, boolean peso, boolean tamano, boolean mensaje, boolean tipoArreglo, int id, boolean anilloCreado, boolean collarCreado, boolean arreglados, boolean anilloArreglado, boolean collarArreglado) {        
         initComponents();
        control = new Controladora(this, jcbMaterial, jcbPurezaPlata, jcbPurezaOro, txtPeso, txtTamano, txtMensaje, jcbTipoAnillo, txtTipoArreglo, panelMaterial, panelTamano, panelPeso, panelMensaje, panelTipoAnillo, panelArreglo); 
        this.material = material; 
        this.tipoAnillo = tipoAnillo; 
        this.peso = peso; 
        this.tamano = tamano; 
        this.mensaje = mensaje; 
        this.tipoArreglo = tipoArreglo; 
        this.anilloCreado = anilloCreado; 
        this.collarCreado = collarCreado; 
        this.anilloArreglado = anilloArreglado; 
        this.collarArreglado = collarArreglado; 
        this.arreglados = arreglados; 
        this.id = id;     
        this.conPedOrf = conPedOrf; 
        this.conPedClie = conPedClie; 
        this.listaPie = listaPie; 
        control.iniciaVentana(this,  "src/imagenes/diamante.png");         
        panelMaterial.setVisible(false);
        panelPeso.setVisible(false);
        panelTamano.setVisible(false);
        panelMensaje.setVisible(false);
        panelTipoAnillo.setVisible(false);
        panelArreglo.setVisible(false);
        labelNorma.setVisible(false);
        jcbPurezaPlata.setVisible(false);

        Pieza pie =  null; 
        ArrayList<Pieza> listaPieza; 
        listaPieza = conPedOrf.getListaPiezas();
        for(int i=0; i < listaPieza.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mi'
        {
            if (id==listaPieza.get(i).getIdPieza()){
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
       Pieza piezaXml = datosPed.buscarPieza(this.id);    
          if (piezaXml == null) {
                    JOptionPane.showMessageDialog(null, "Esta pieza no esta en el XML", "Error IdPieza no encontrado", JOptionPane.ERROR_MESSAGE);
        } else {
              System.out.println("IdPieza "+ piezaXml.getIdPieza());
              System.out.println("piezaaaa "+piezaXml.getPeso()); 
            if (anilloCreado){
                if (material){
                    this.materia1 = pie.getTipomaterial(); 
                    this.pureza1 = String.valueOf(pie.getPurezamaterial()); 
                    labelMaterial1.setText("Material: "+this.materia1);
                    labelPureza.setText("Pureza: "+this.pureza1);
                    panelMaterial.setVisible(true);
                }
                if (peso){
                    this.peso1 = String.valueOf(pie.getPeso()); 
                    labelPeso1.setText("Peso: "+this.peso1);
                    panelPeso.setVisible(true);
                }
                if (tamano){
                    if (pie instanceof Anillo){ 
                        this.tamano1 = String.valueOf(this.ani1.getCircunferencia()); 
                    }else{
                        if (pie instanceof Collar){
                            this.tamano1 = String.valueOf(this.coll1.getTamaño()); 
                        }
                    }
                    labelTamano1.setText("Circunferencia: "+this.tamano1);
                    panelTamano.setVisible(true);
                }
                if (mensaje){
                    if (pie instanceof Anillo){ 
                        this.mensaje1 = this.ani1.getMensaje(); 
                    }else{
                        if (pie instanceof Collar){
                            this.mensaje1 = this.coll1.getMensaje(); 
                        }
                    }
                    labelMensaje12.setText("Mensaje: "+this.mensaje1);
                    panelMensaje.setVisible(true);
                }
                if (tipoAnillo){
                    if (pie instanceof Anillo){ 
                        this.tipoAnillo1 = this.ani1.getTipoAnillo(); 
                    }
                    labelTipoAnillo.setText("Tipo Anillo: "+this.tipoAnillo1);
                    panelTipoAnillo.setVisible(true);
                }
            }else{
                if (collarCreado){
                    if (material){
                        this.materia1 = pie.getTipomaterial(); 
                        this.pureza1 = String.valueOf(pie.getPurezamaterial()); 
                        labelMaterial1.setText("Material: "+this.materia1);
                        labelPureza.setText("Pureza: "+this.pureza1);
                        panelMaterial.setVisible(true);
                    }
                    if (peso){
                        this.peso1 = String.valueOf(pie.getPeso()); 
                        labelPeso1.setText("Peso: "+this.peso1);
                        panelPeso.setVisible(true);
                    }
                    if (tamano){
                        if (pie instanceof Anillo){ 
                            this.tamano1 = String.valueOf(this.ani1.getCircunferencia()); 
                        }else{
                            if (pie instanceof Collar){
                                this.tamano1 = String.valueOf(this.coll1.getTamaño()); 
                            }
                        }
                        labelTamano1.setText("Circunferencia: "+this.tamano1);
                        panelTamano.setVisible(true);
                    }            
                }else{
                    if (arreglados){
                        if (tamano){
                            if (pie instanceof Anillo){ 
                                this.tamano1 = String.valueOf(this.ani1.getCircunferencia()); 
                            }else{
                                if (pie instanceof Collar){
                                    this.tamano1 = String.valueOf(this.coll1.getTamaño()); 
                                }
                            }
                            labelTamano1.setText("Circunferencia: "+this.tamano1);;
                            panelTamano.setVisible(true);
                        }
                        if (tipoArreglo){
                            this.tipoArreglo1 = pie.getTipoArreglo(); 
                            labelArreglo.setText("Tipo Arreglo: "+this.tipoArreglo1);
                            panelArreglo.setVisible(true);
                        }                    
                    }
                }
            }           
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        btnAgregarPedido = new javax.swing.JButton();
        labelDatos = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        labeCambioCaracteristicas = new javax.swing.JLabel();
        labelCosto1 = new javax.swing.JLabel();
        labelCedula1 = new javax.swing.JLabel();
        labelAbono1 = new javax.swing.JLabel();
        labelFechaPedido1 = new javax.swing.JLabel();
        labelFechaEntrega1 = new javax.swing.JLabel();
        panelCedula = new javax.swing.JPanel();
        txtCedulaCliente = new javax.swing.JTextField();
        labelCedulaCliente2 = new javax.swing.JLabel();
        panelCosto = new javax.swing.JPanel();
        txtCosto = new javax.swing.JTextField();
        labelCosto = new javax.swing.JLabel();
        labelDolar = new javax.swing.JLabel();
        panelAbono = new javax.swing.JPanel();
        labelAbonoInicial = new javax.swing.JLabel();
        txtAbonoInicial = new javax.swing.JTextField();
        labelDolar1 = new javax.swing.JLabel();
        panelFechaPedido = new javax.swing.JPanel();
        labelFechaPedido = new javax.swing.JLabel();
        jdFechaPedido = new com.toedter.calendar.JDateChooser();
        labelFondo = new javax.swing.JLabel();
        panelFechaEntrega = new javax.swing.JPanel();
        labelFechaEntregaPedido = new javax.swing.JLabel();
        jdFechaEntrega = new com.toedter.calendar.JDateChooser();
        labelArreglo = new javax.swing.JLabel();
        labelTipoAnillo = new javax.swing.JLabel();
        panelTipoAnillo = new javax.swing.JPanel();
        labelMensaje1 = new javax.swing.JLabel();
        jcbTipoAnillo = new javax.swing.JComboBox<>();
        panelArreglo = new javax.swing.JPanel();
        labelTipoArreglo = new javax.swing.JLabel();
        txtTipoArreglo = new javax.swing.JTextField();
        btnAtras5 = new javax.swing.JButton();
        btnSalir2 = new javax.swing.JButton();
        btnEditarPieza = new javax.swing.JButton();
        labelDatos1 = new javax.swing.JLabel();
        labelNombreEmpresa1 = new javax.swing.JLabel();
        labeCambioCaracteristicas1 = new javax.swing.JLabel();
        labelPureza = new javax.swing.JLabel();
        labelMaterial1 = new javax.swing.JLabel();
        labelPeso1 = new javax.swing.JLabel();
        labelTamano1 = new javax.swing.JLabel();
        labelMensaje12 = new javax.swing.JLabel();
        panelMaterial = new javax.swing.JPanel();
        labelMaterial = new javax.swing.JLabel();
        jcbMaterial = new javax.swing.JComboBox<>();
        labelPurezaMaterial = new javax.swing.JLabel();
        jcbPurezaOro = new javax.swing.JComboBox<>();
        jcbPurezaPlata = new javax.swing.JComboBox<>();
        labelNorma = new javax.swing.JLabel();
        labelKilate = new javax.swing.JLabel();
        panelPeso = new javax.swing.JPanel();
        labelNorma1 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        labelPeso = new javax.swing.JLabel();
        panelTamano = new javax.swing.JPanel();
        labelNorma2 = new javax.swing.JLabel();
        labelCircunferencia = new javax.swing.JLabel();
        txtTamano = new javax.swing.JTextField();
        panelMensaje = new javax.swing.JPanel();
        labelMensaje = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JTextField();
        labelFondo1 = new javax.swing.JLabel();

        btnAtras4.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras4.setContentAreaFilled(false);
        btnAtras4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras4ActionPerformed(evt);
            }
        });

        btnSalir1.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir1.setContentAreaFilled(false);
        btnSalir1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir1ActionPerformed(evt);
            }
        });

        btnAgregarPedido.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Engranaje pequeno.png"))); // NOI18N
        btnAgregarPedido.setText("Agregar Pedido");
        btnAgregarPedido.setContentAreaFilled(false);
        btnAgregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EngranajeGrande.png"))); // NOI18N
        btnAgregarPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EngranajeGrande.png"))); // NOI18N
        btnAgregarPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });

        labelDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDatos.setForeground(new java.awt.Color(0, 0, 0));
        labelDatos.setText("Datos sin editar: ");

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N

        labeCambioCaracteristicas.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeCambioCaracteristicas.setForeground(new java.awt.Color(0, 0, 0));
        labeCambioCaracteristicas.setText("Cambio de caracteristicas: ");

        labelCosto1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCosto1.setForeground(new java.awt.Color(0, 0, 0));

        labelCedula1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCedula1.setForeground(new java.awt.Color(0, 0, 0));

        labelAbono1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAbono1.setForeground(new java.awt.Color(0, 0, 0));

        labelFechaPedido1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFechaPedido1.setForeground(new java.awt.Color(0, 0, 0));

        labelFechaEntrega1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFechaEntrega1.setForeground(new java.awt.Color(0, 0, 0));

        txtCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaClienteActionPerformed(evt);
            }
        });
        txtCedulaCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaClienteKeyTyped(evt);
            }
        });

        labelCedulaCliente2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCedulaCliente2.setForeground(new java.awt.Color(0, 0, 0));
        labelCedulaCliente2.setText("C/I Cliente:");

        javax.swing.GroupLayout panelCedulaLayout = new javax.swing.GroupLayout(panelCedula);
        panelCedula.setLayout(panelCedulaLayout);
        panelCedulaLayout.setHorizontalGroup(
            panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCedulaLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelCedulaLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(labelCedulaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(150, Short.MAX_VALUE)))
        );
        panelCedulaLayout.setVerticalGroup(
            panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCedulaLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
            .addGroup(panelCedulaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCedulaLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelCedulaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        txtCosto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCostoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCostoKeyTyped(evt);
            }
        });

        labelCosto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCosto.setForeground(new java.awt.Color(0, 0, 0));
        labelCosto.setText("Costo:");

        labelDolar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDolar.setForeground(new java.awt.Color(0, 0, 0));
        labelDolar.setText("$");

        javax.swing.GroupLayout panelCostoLayout = new javax.swing.GroupLayout(panelCosto);
        panelCosto.setLayout(panelCostoLayout);
        panelCostoLayout.setHorizontalGroup(
            panelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCostoLayout.createSequentialGroup()
                .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCostoLayout.setVerticalGroup(
            panelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCostoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelCostoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelCostoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        labelAbonoInicial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelAbonoInicial.setForeground(new java.awt.Color(0, 0, 0));
        labelAbonoInicial.setText("Abono ini:");

        txtAbonoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAbonoInicialActionPerformed(evt);
            }
        });
        txtAbonoInicial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAbonoInicialKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAbonoInicialKeyTyped(evt);
            }
        });

        labelDolar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDolar1.setForeground(new java.awt.Color(0, 0, 0));
        labelDolar1.setText("$");

        javax.swing.GroupLayout panelAbonoLayout = new javax.swing.GroupLayout(panelAbono);
        panelAbono.setLayout(panelAbonoLayout);
        panelAbonoLayout.setHorizontalGroup(
            panelAbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAbonoLayout.createSequentialGroup()
                .addComponent(labelAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAbonoLayout.setVerticalGroup(
            panelAbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAbonoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelAbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelAbonoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelAbonoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );

        labelFechaPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFechaPedido.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaPedido.setText("Fecha pedi:");

        javax.swing.GroupLayout panelFechaPedidoLayout = new javax.swing.GroupLayout(panelFechaPedido);
        panelFechaPedido.setLayout(panelFechaPedidoLayout);
        panelFechaPedidoLayout.setHorizontalGroup(
            panelFechaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaPedidoLayout.createSequentialGroup()
                .addComponent(labelFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jdFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelFechaPedidoLayout.setVerticalGroup(
            panelFechaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaPedidoLayout.createSequentialGroup()
                .addGroup(panelFechaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N

        labelFechaEntregaPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFechaEntregaPedido.setForeground(new java.awt.Color(0, 0, 0));
        labelFechaEntregaPedido.setText("Fecha entre:");

        javax.swing.GroupLayout panelFechaEntregaLayout = new javax.swing.GroupLayout(panelFechaEntrega);
        panelFechaEntrega.setLayout(panelFechaEntregaLayout);
        panelFechaEntregaLayout.setHorizontalGroup(
            panelFechaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFechaEntregaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelFechaEntregaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        panelFechaEntregaLayout.setVerticalGroup(
            panelFechaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFechaEntregaLayout.createSequentialGroup()
                .addGroup(panelFechaEntregaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFechaEntregaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(500, 500, 500)
                            .addComponent(labelNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(labelCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnAtras4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(labelAbono1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(labelFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(440, 440, 440)
                            .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(labeCambioCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(labelCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(430, 430, 430)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(460, 460, 460)
                            .addComponent(labelFechaPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(panelAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(120, 120, 120)
                            .addComponent(labelCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(540, 540, 540)
                            .addComponent(btnAtras4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(360, 360, 360)
                            .addComponent(panelFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(260, 260, 260)
                            .addComponent(labelAbono1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(220, 220, 220)
                            .addComponent(panelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(labelFechaEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(labelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(panelCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labeCambioCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(200, 200, 200)
                            .addComponent(labelCedula1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(560, 560, 560)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(400, 400, 400)
                            .addComponent(btnAgregarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(labelFechaPedido1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(430, 430, 430)
                            .addComponent(panelFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(290, 290, 290)
                            .addComponent(panelAbono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelArreglo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelArreglo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 240, 40));

        labelTipoAnillo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTipoAnillo.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelTipoAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 240, 40));

        labelMensaje1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMensaje1.setForeground(new java.awt.Color(0, 0, 0));
        labelMensaje1.setText("Tipo Anillo:");

        jcbTipoAnillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grado", "C/Nombre", "Otro" }));

        javax.swing.GroupLayout panelTipoAnilloLayout = new javax.swing.GroupLayout(panelTipoAnillo);
        panelTipoAnillo.setLayout(panelTipoAnilloLayout);
        panelTipoAnilloLayout.setHorizontalGroup(
            panelTipoAnilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoAnilloLayout.createSequentialGroup()
                .addComponent(labelMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcbTipoAnillo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelTipoAnilloLayout.setVerticalGroup(
            panelTipoAnilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTipoAnilloLayout.createSequentialGroup()
                .addGroup(panelTipoAnilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMensaje1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbTipoAnillo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(panelTipoAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        labelTipoArreglo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTipoArreglo.setForeground(new java.awt.Color(0, 0, 0));
        labelTipoArreglo.setText("Arreglo:");

        txtTipoArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoArregloActionPerformed(evt);
            }
        });
        txtTipoArreglo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTipoArregloKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoArregloKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelArregloLayout = new javax.swing.GroupLayout(panelArreglo);
        panelArreglo.setLayout(panelArregloLayout);
        panelArregloLayout.setHorizontalGroup(
            panelArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArregloLayout.createSequentialGroup()
                .addComponent(labelTipoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(txtTipoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panelArregloLayout.setVerticalGroup(
            panelArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArregloLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelArregloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTipoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelArregloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtTipoArreglo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
        );

        getContentPane().add(panelArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        btnAtras5.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras5.setContentAreaFilled(false);
        btnAtras5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 130, 110));

        btnSalir2.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir2.setContentAreaFilled(false);
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 90, 80));

        btnEditarPieza.setBackground(new java.awt.Color(153, 153, 153));
        btnEditarPieza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Engranaje pequeno.png"))); // NOI18N
        btnEditarPieza.setText("Editar Pieza");
        btnEditarPieza.setContentAreaFilled(false);
        btnEditarPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPieza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarPieza.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EngranajeGrande.png"))); // NOI18N
        btnEditarPieza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EngranajeGrande.png"))); // NOI18N
        btnEditarPieza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 180, 230));

        labelDatos1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDatos1.setForeground(new java.awt.Color(0, 0, 0));
        labelDatos1.setText("Datos sin editar: ");
        getContentPane().add(labelDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 150, 40));

        labelNombreEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 190, 90));

        labeCambioCaracteristicas1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeCambioCaracteristicas1.setForeground(new java.awt.Color(0, 0, 0));
        labeCambioCaracteristicas1.setText("Cambio de caracteristicas: ");
        getContentPane().add(labeCambioCaracteristicas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 450, 120));

        labelPureza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPureza.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelPureza, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 230, 40));

        labelMaterial1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMaterial1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelMaterial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 220, 40));

        labelPeso1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelPeso1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelPeso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 230, 40));

        labelTamano1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelTamano1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelTamano1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 290, 230, 40));

        labelMensaje12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelMensaje12.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelMensaje12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 240, 40));

        labelMaterial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMaterial.setText("Material:");

        jcbMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oro", "Plata", "Otro" }));
        jcbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaterialActionPerformed(evt);
            }
        });

        labelPurezaMaterial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPurezaMaterial.setText("Pureza:");

        jcbPurezaOro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "14", "18" }));
        jcbPurezaOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPurezaOroActionPerformed(evt);
            }
        });

        jcbPurezaPlata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "835", "925", "950" }));

        labelNorma.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelNorma.setText("Norma");

        labelKilate.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelKilate.setText("Kilates");

        javax.swing.GroupLayout panelMaterialLayout = new javax.swing.GroupLayout(panelMaterial);
        panelMaterial.setLayout(panelMaterialLayout);
        panelMaterialLayout.setHorizontalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMaterialLayout.createSequentialGroup()
                        .addComponent(labelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelMaterialLayout.createSequentialGroup()
                        .addComponent(labelPurezaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPurezaOro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPurezaPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKilate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNorma, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMaterialLayout.setVerticalGroup(
            panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelPurezaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelMaterialLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbPurezaOro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbPurezaPlata, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKilate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelNorma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 280, 120));

        labelNorma1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelNorma1.setText("gr");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });
        txtPeso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPesoKeyTyped(evt);
            }
        });

        labelPeso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPeso.setForeground(new java.awt.Color(0, 0, 0));
        labelPeso.setText("Peso: ");

        javax.swing.GroupLayout panelPesoLayout = new javax.swing.GroupLayout(panelPeso);
        panelPeso.setLayout(panelPesoLayout);
        panelPesoLayout.setHorizontalGroup(
            panelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPesoLayout.createSequentialGroup()
                .addComponent(labelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNorma1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelPesoLayout.setVerticalGroup(
            panelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPesoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelPesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNorma1))
                .addGap(10, 10, 10))
        );

        getContentPane().add(panelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 300, 50));

        labelNorma2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelNorma2.setText("cm");

        labelCircunferencia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCircunferencia.setForeground(new java.awt.Color(0, 0, 0));
        labelCircunferencia.setText("Circunferencia: ");

        txtTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTamanoActionPerformed(evt);
            }
        });
        txtTamano.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTamanoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTamanoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelTamanoLayout = new javax.swing.GroupLayout(panelTamano);
        panelTamano.setLayout(panelTamanoLayout);
        panelTamanoLayout.setHorizontalGroup(
            panelTamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTamanoLayout.createSequentialGroup()
                .addComponent(labelCircunferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNorma2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        panelTamanoLayout.setVerticalGroup(
            panelTamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTamanoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelTamanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCircunferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTamano, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNorma2))
                .addGap(10, 10, 10))
        );

        getContentPane().add(panelTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 330, 50));

        labelMensaje.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMensaje.setForeground(new java.awt.Color(0, 0, 0));
        labelMensaje.setText("Mensaje:");

        txtMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMensajeActionPerformed(evt);
            }
        });
        txtMensaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMensajeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMensajeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelMensajeLayout = new javax.swing.GroupLayout(panelMensaje);
        panelMensaje.setLayout(panelMensajeLayout);
        panelMensajeLayout.setHorizontalGroup(
            panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensajeLayout.createSequentialGroup()
                .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelMensajeLayout.setVerticalGroup(
            panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMensajeLayout.createSequentialGroup()
                .addGroup(panelMensajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(panelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 270, 50));

        labelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        E11EditarPieza atras = new E11EditarPieza(conPedOrf, conPedClie, listaPie);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras4ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
  

    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void txtCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaClienteActionPerformed

    private void txtCedulaClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaClienteKeyTyped
        if (txtCedulaCliente.getText().length()>=8){
            evt.consume();
            //   Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"La cedula solo tiene un maximo de 8 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La cedula solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCedulaClienteKeyTyped

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed

    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyPressed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        if (txtCosto.getText().length()>=6 ){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El costo no puede pasar de los 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtAbonoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbonoInicialActionPerformed

    }//GEN-LAST:event_txtAbonoInicialActionPerformed

    private void txtAbonoInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoInicialKeyReleased


    }//GEN-LAST:event_txtAbonoInicialKeyReleased

    private void txtAbonoInicialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoInicialKeyTyped
        if (txtAbonoInicial.getText().length()>=6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Abono inicial no puede pasar de los 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtAbonoInicialKeyTyped

    private void btnAtras5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras5ActionPerformed
        E11EditarPieza atras = new E11EditarPieza(conPedOrf, conPedClie, listaPie);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras5ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnEditarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPiezaActionPerformed
       if (peso && txtPeso.getText().isEmpty() || tamano && txtTamano.getText().isEmpty() || mensaje && txtMensaje.getText().isEmpty() || tipoArreglo && txtTipoArreglo.getText().isEmpty()){
           JOptionPane.showMessageDialog(null,"Por favor completar los datos requeridos","Error",JOptionPane.ERROR_MESSAGE);
       }else{
        //Esta funcion editara el XML (la pieza del pedido) 
        control.salvarPieza(datosPed, txtPeso, txtTamano, txtCosto, txtAbonoInicial, txtMensaje, txtTipoArreglo, jcbMaterial, jcbPurezaOro, jcbPurezaPlata, material, tipoAnillo, peso, tamano, mensaje, tipoArreglo, anilloCreado, collarCreado, arreglados, id, anilloArreglado, collarArreglado, this.conPedOrf);
        //Esta funcion editara a la pieza,  tanto dentro de la lista de piezas(TODAS LAS PIEZAS DEL SISTEMA) como dentro de la lista de los pedidos de ser necesario (Si la pieza editada estaba dentro de un pedido tambien la editara)
        control.datosPiezaModif(conPedOrf, this.id ,  material, tipoAnillo, peso, tamano, mensaje, tipoArreglo, anilloCreado, collarCreado, arreglados);   
        JOptionPane.showMessageDialog(null,"Se ha editado su pedido con Exito","Listo",JOptionPane.INFORMATION_MESSAGE);
            E11EditarPieza atras = new E11EditarPieza(conPedOrf, conPedClie, listaPie);
            this.setVisible(false);
            atras.setVisible(true);

       }
               
        
        
        

    }//GEN-LAST:event_btnEditarPiezaActionPerformed

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed

    }//GEN-LAST:event_txtPesoActionPerformed

    private void txtPesoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoKeyPressed

    private void txtPesoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesoKeyTyped
        if (txtPeso.getText().length()>=2){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Peso del pedido solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
                if((car<'0' || car>'9')){
                    evt.consume();
                    JOptionPane.showMessageDialog(null,"El peso de la pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
                }

        }
    }//GEN-LAST:event_txtPesoKeyTyped

    private void txtTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTamanoActionPerformed

    }//GEN-LAST:event_txtTamanoActionPerformed

    private void txtTamanoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanoKeyReleased


    }//GEN-LAST:event_txtTamanoKeyReleased

    private void txtTamanoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTamanoKeyTyped
        if (txtTamano.getText().length()>=2){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Circunferencia no puede pasar de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtTamanoKeyTyped

    private void jcbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaterialActionPerformed
        if (jcbMaterial.getSelectedItem().equals("Oro")){
            jcbPurezaOro.setVisible(true);
            labelKilate.setVisible(true);
            labelNorma.setVisible(false);
            labelPurezaMaterial.setVisible(true);
            jcbPurezaPlata.setVisible(false);
        }else{
            if (jcbMaterial.getSelectedItem().equals("Plata")){
                jcbPurezaPlata.setVisible(true);
                labelNorma.setVisible(true);
                labelKilate.setVisible(false);
                labelPurezaMaterial.setVisible(true);
                jcbPurezaOro.setVisible(false);
            }else{
                if (jcbMaterial.getSelectedItem().equals("Otro")){
                    jcbPurezaOro.setVisible(false);
                    jcbPurezaPlata.setVisible(false);
                    labelNorma.setVisible(false);
                    labelKilate.setVisible(false);
                    labelPurezaMaterial.setVisible(false);
                }else{
                    labelPurezaMaterial.setVisible(true);
                    jcbPurezaOro.setVisible(false);
                    jcbPurezaPlata.setVisible(false);
                    labelNorma.setVisible(false);
                    labelKilate.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_jcbMaterialActionPerformed

    private void jcbPurezaOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPurezaOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPurezaOroActionPerformed

    private void txtMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeActionPerformed

    private void txtMensajeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMensajeKeyReleased

    private void txtMensajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMensajeKeyTyped
       if (txtMensaje.getText().length()>=15){
            evt.consume();
            // Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El mensaje no puede tener mas de 15 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtMensajeKeyTyped

    private void txtTipoArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoArregloActionPerformed

    private void txtTipoArregloKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoArregloKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoArregloKeyReleased

    private void txtTipoArregloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoArregloKeyTyped
       if (txtTipoArreglo.getText().length()>=15){
            evt.consume();
            // Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tipo de arreglo no puede tener mas de 15 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTipoArregloKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(E1EditarPiezaCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E1EditarPiezaCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E1EditarPiezaCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E1EditarPiezaCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E1EditarPiezaCaracteristicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnAtras5;
    private javax.swing.JButton btnEditarPieza;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JComboBox<String> jcbMaterial;
    private javax.swing.JComboBox<String> jcbPurezaOro;
    private javax.swing.JComboBox<String> jcbPurezaPlata;
    private javax.swing.JComboBox<String> jcbTipoAnillo;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaPedido;
    private javax.swing.JLabel labeCambioCaracteristicas;
    private javax.swing.JLabel labeCambioCaracteristicas1;
    private javax.swing.JLabel labelAbono1;
    private javax.swing.JLabel labelAbonoInicial;
    private javax.swing.JLabel labelArreglo;
    private javax.swing.JLabel labelCedula1;
    private javax.swing.JLabel labelCedulaCliente2;
    private javax.swing.JLabel labelCircunferencia;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelCosto1;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelDatos1;
    private javax.swing.JLabel labelDolar;
    private javax.swing.JLabel labelDolar1;
    private javax.swing.JLabel labelFechaEntrega1;
    private javax.swing.JLabel labelFechaEntregaPedido;
    private javax.swing.JLabel labelFechaPedido;
    private javax.swing.JLabel labelFechaPedido1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondo1;
    private javax.swing.JLabel labelKilate;
    private javax.swing.JLabel labelMaterial;
    private javax.swing.JLabel labelMaterial1;
    private javax.swing.JLabel labelMensaje;
    private javax.swing.JLabel labelMensaje1;
    private javax.swing.JLabel labelMensaje12;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labelNombreEmpresa1;
    private javax.swing.JLabel labelNorma;
    private javax.swing.JLabel labelNorma1;
    private javax.swing.JLabel labelNorma2;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPeso1;
    private javax.swing.JLabel labelPureza;
    private javax.swing.JLabel labelPurezaMaterial;
    private javax.swing.JLabel labelTamano1;
    private javax.swing.JLabel labelTipoAnillo;
    private javax.swing.JLabel labelTipoArreglo;
    private javax.swing.JPanel panelAbono;
    private javax.swing.JPanel panelArreglo;
    private javax.swing.JPanel panelCedula;
    private javax.swing.JPanel panelCosto;
    private javax.swing.JPanel panelFechaEntrega;
    private javax.swing.JPanel panelFechaPedido;
    private javax.swing.JPanel panelMaterial;
    private javax.swing.JPanel panelMensaje;
    private javax.swing.JPanel panelPeso;
    private javax.swing.JPanel panelTamano;
    private javax.swing.JPanel panelTipoAnillo;
    private javax.swing.JTextField txtAbonoInicial;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtMensaje;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTamano;
    private javax.swing.JTextField txtTipoArreglo;
    // End of variables declaration//GEN-END:variables
}
