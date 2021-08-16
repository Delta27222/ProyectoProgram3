/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;



public class E2EditarPedidoCaracteristicas extends javax.swing.JFrame {

    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    boolean cedula, costo, abono, fechas;
    int id; 
    DaoPedidoXml datosPed = new DaoPedidoXml();
    String fechaPedido1, fechaEntrega1; 
    Pedido pedido=null;  
    
    public E2EditarPedidoCaracteristicas() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 


    }

//USADO
    E2EditarPedidoCaracteristicas(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie, boolean cedula, boolean costo, boolean abono, boolean fechas, int id) {
        initComponents();
        control = new Controladora(this, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaEntrega, jdFechaPedido);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        this.cedula = cedula; 
        this.costo = costo; 
        this.abono = abono; 
        this.fechas = fechas; 
        this.id = id;      
        //Aca se busca el pedido que se encuentra en la lista de los pedidos que tiene el orfebre
        ArrayList<Pedido> listaPed; 
        listaPed = conPedOrf.getListaPedidosOrfebre();
        for(int i=0; i < listaPed.size();i++)
        {
            if (id==listaPed.get(i).getIdPedido()){
                this.pedido = listaPed.get(i);
                break; 
            }  
        }       
        //Aca se busca el pedido dentro del XML
        Pedido pedidoXml = datosPed.buscarPedido(id); 
        if (pedidoXml == null) {
            JOptionPane.showMessageDialog(null, "Estudiante no Existe en el xml", "Error cédula no encontrada", JOptionPane.ERROR_MESSAGE);
        } else {            
            int cedula1, costo1,abono1; 
            
            if (cedula){
                panelCedula.setVisible(true);
                txtCedulaCliente.setText(Integer.toString(this.pedido.getCedulaCliente()));
                cedula1 = this.pedido.getCedulaCliente(); 
                labelCedula1.setText("Cedula = "+cedula1);
            }else{
                panelCedula.setVisible(false);
                txtCedulaCliente.setText(Integer.toString(pedidoXml.getCedulaCliente()));
            }

            if (costo){
                panelCosto.setVisible(true);
                txtCosto.setText(Integer.toString(this.pedido.getCostoTotal()));
                costo1 = this.pedido.getCostoTotal(); 
                labelCosto1.setText("Costo = "+costo1); 
                abono1 = this.pedido.getAbonoInicial(); 
                labelAbono1.setText("Abono Inicial = "+abono1);
                TextPrompt prueba = new TextPrompt("Obligatorio", txtCosto);
            }else{
                panelCosto.setVisible(false);
                txtCosto.setText(Integer.toString(pedidoXml.getCostoTotal()));                
            }

            if(abono){
                panelAbono.setVisible(false);
                txtAbonoInicial.setText(Integer.toString(this.pedido.getAbonoInicial()));                
                abono1 = this.pedido.getAbonoInicial(); 
                labelAbono1.setText("Abono Inicial = "+abono1);
                costo1 = this.pedido.getCostoTotal(); 
                labelCosto1.setText("Costo = "+costo1); 
                TextPrompt prueba = new TextPrompt("Obligatorio", txtAbonoInicial);
            }else{
                panelAbono.setVisible(false);
                txtAbonoInicial.setText(Integer.toString(pedidoXml.getAbonoInicial()));
            }

            if(fechas){
                panelFechaPedido.setVisible(true);
                panelFechaEntrega.setVisible(true);   
                this.fechaPedido1 = this.pedido.getFechaPedido(); 
                labelFechaPedido1.setText("Fecha Pedido = "+fechaPedido1);                       
                this.fechaEntrega1 = this.pedido.getFechaEntrega(); 
                labelFechaEntrega1.setText("Fecha Entrega = "+fechaEntrega1);

            }else{
                panelFechaPedido.setVisible(false);
                panelFechaEntrega.setVisible(false);   
            }

            control.iniciaVentana(this,  "src/imagenes/diamante.png");    
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        labelFechaEntrega1 = new javax.swing.JLabel();
        labelDatos = new javax.swing.JLabel();
        labelCosto1 = new javax.swing.JLabel();
        labelAbono1 = new javax.swing.JLabel();
        labelFechaPedido1 = new javax.swing.JLabel();
        labelCedula1 = new javax.swing.JLabel();
        panelFechaEntrega = new javax.swing.JPanel();
        labelFechaEntregaPedido = new javax.swing.JLabel();
        jdFechaEntrega = new com.toedter.calendar.JDateChooser();
        panelAbono = new javax.swing.JPanel();
        labelAbonoInicial = new javax.swing.JLabel();
        txtAbonoInicial = new javax.swing.JTextField();
        labelDolar1 = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        labeCambioCaracteristicas = new javax.swing.JLabel();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        panelFechaPedido = new javax.swing.JPanel();
        labelFechaPedido = new javax.swing.JLabel();
        jdFechaPedido = new com.toedter.calendar.JDateChooser();
        panelCedula = new javax.swing.JPanel();
        txtCedulaCliente = new javax.swing.JTextField();
        labelCedulaCliente2 = new javax.swing.JLabel();
        panelCosto = new javax.swing.JPanel();
        txtCosto = new javax.swing.JTextField();
        labelCosto = new javax.swing.JLabel();
        labelDolar = new javax.swing.JLabel();
        btnAgregarPedido = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelFechaEntrega1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFechaEntrega1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelFechaEntrega1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 240, 40));

        labelDatos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelDatos.setForeground(new java.awt.Color(0, 0, 0));
        labelDatos.setText("Datos sin editar: ");
        getContentPane().add(labelDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 150, 40));

        labelCosto1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCosto1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelCosto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 230, 40));

        labelAbono1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAbono1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelAbono1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 230, 40));

        labelFechaPedido1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelFechaPedido1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelFechaPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, 230, 40));

        labelCedula1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCedula1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelCedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 220, 40));

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

        getContentPane().add(panelFechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 270, 50));

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

        getContentPane().add(panelAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 300, 50));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 190, 90));

        labeCambioCaracteristicas.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeCambioCaracteristicas.setForeground(new java.awt.Color(0, 0, 0));
        labeCambioCaracteristicas.setText("Cambio de caracteristicas: ");
        getContentPane().add(labeCambioCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 440, 120));

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
        getContentPane().add(btnAtras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 130, 110));

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
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 560, 90, 80));

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

        getContentPane().add(panelFechaPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 270, 50));

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

        getContentPane().add(panelCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 270, 50));

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

        getContentPane().add(panelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 300, 50));

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
        getContentPane().add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 180, 230));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        E21EditarPedido atras = new E21EditarPedido(conPedOrf, conPedClie, listaPie);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras4ActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir1ActionPerformed

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
        if (!txtCosto.getText().isEmpty() && this.abono == true){
            panelAbono.setVisible(true);
        }
    }//GEN-LAST:event_txtCostoKeyTyped

    private void txtAbonoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAbonoInicialActionPerformed

    }//GEN-LAST:event_txtAbonoInicialActionPerformed

    private void txtAbonoInicialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAbonoInicialKeyReleased
        evt.consume();
        char car = evt.getKeyChar();
        if((car<'0' || car>'9')){
            evt.consume();
            JOptionPane.showMessageDialog(null,"El abono solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{

   //0-------------------------------------         //revisar esto
   
//            Pedido ped=null;   
//            ArrayList<Pedido> listaPed; 
//            listaPed = conPedOrf.getListaPedidosOrfebre();
//            for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mismo
//            {
//                   if (id==listaPed.get(i).getIdPedido()){
//                      ped = listaPed.get(i);
//                      break; 
//                   }                 
//          }
          
            if (this.costo && this.abono){
                int costo = 0; 
                int abono = 0;
                String costo1 = txtCosto.getText();
                String abono1 = txtAbonoInicial.getText(); 
                costo = Integer.parseInt(costo1); 
                abono = Integer.parseInt(abono1);
                if (abono > costo){
                    JOptionPane.showMessageDialog(null,"El ABONO no puede ser mayor al COSTO","ERROR",JOptionPane.ERROR_MESSAGE);
                    txtAbonoInicial.setText("");
                }               
            }      
        }
            
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

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        boolean pasa = false;  
              if (this.costo && !this.abono){
                    int costo = 0; 
                    int abono = 0;
                    String costo1 = txtCosto.getText();
                    costo = Integer.parseInt(costo1); 
                    Pedido ped=null;  
                    ArrayList<Pedido> listaPed; 
                    listaPed = conPedOrf.getListaPedidosOrfebre();
                    for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mismo
                    {
                        if (id==listaPed.get(i).getIdPedido()){
                            ped = listaPed.get(i);
                        }  
                    }
                    abono = ped.getAbonoInicial();
                    if (costo < abono){
                        JOptionPane.showMessageDialog(null,"El COSTO no puede ser menor que el ABONO inicial de  = "+abono,"ERROR",JOptionPane.ERROR_MESSAGE);
                        txtAbonoInicial.setText("");
                        txtCosto.setText("");
                    }else{
                        pasa = true; 
                    }                    
                }else{
                    if (!this.costo && this.abono){
                        int costo = 0; 
                        int abono = 0;
                        String abono1 = txtAbonoInicial.getText();
                        abono = Integer.parseInt(abono1); 
                        Pedido ped=null;  
                        ArrayList<Pedido> listaPed; 
                        listaPed = conPedOrf.getListaPedidosOrfebre();
                        for(int i=0; i < listaPed.size();i++){
                            if (id==listaPed.get(i).getIdPedido()){
                                ped = listaPed.get(i);
                            }  
                        }
                        costo = ped.getCostoTotal();
                        if (costo < abono){
                            JOptionPane.showMessageDialog(null,"El abono no puede ser mayor que el COSTO = "+costo,"ERROR",JOptionPane.ERROR_MESSAGE);
                            txtAbonoInicial.setText("");
                        }   
                    }else{
                        pasa = true;  
                    }
                }            
        if (pasa){
            //El if que se encuentra a continuacion, se pone de modo que el programano explote por no tener el jcb de las fechas nada
            if (this.fechas){
                int a = jdFechaPedido.getDate().compareTo(jdFechaEntrega.getDate()); 
                //El int a lo que me hace es una comparacion de fechas, y asi se si las echas estan bien colocadas por parte del usuario
                if (a < 0){
                    SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                    String fechaPedido = dFormat.format(jdFechaPedido.getDate());
                    String fechaEntrega = dFormat.format(jdFechaEntrega.getDate());
                    //Cambia el pedido sin la modificacion, por el nuevo pedido modificado
                    control.salvarPedido(datosPed, txtCedulaCliente, txtCosto, txtAbonoInicial,fechaPedido, fechaEntrega, this.id, conPedOrf, this.cedula, this.costo, this.abono, this.fechas);
                    //Modifica el pedido dentro de la lista de los pedidos del orfebre
                    control.datosPedidoModif(conPedOrf, conPedClie, this.cedula, this.costo, this.abono, this.fechas, this.id); 
                    JOptionPane.showMessageDialog(null,"Se ha editado su pedido con Exito","Listo",JOptionPane.INFORMATION_MESSAGE);
                    this.setVisible(false);
                    E21EditarPedido adelante = new E21EditarPedido(conPedOrf, conPedClie, listaPie);
                    adelante.setVisible(true);                      
                           
                }else{
                    if (a > 0){
                        JOptionPane.showMessageDialog(null,"La FECHA DEL PEDIDO no puede ser posterior a la FECHA DE LA ENTREGA","ERROR",JOptionPane.ERROR_MESSAGE);
                    }
                }  
            }else{
                //Cambia el pedido sin la modificacion, por el nuevo pedido modificado
                control.salvarPedido(datosPed, txtCedulaCliente, txtCosto, txtAbonoInicial,this.fechaPedido1, this.fechaEntrega1, this.id, conPedOrf, this.cedula, this.costo, this.abono, this.fechas);
                //Modifica el pedido dentro de la lista de los pedidos del orfebre 
                control.datosPedidoModif(conPedOrf, conPedClie, this.cedula, this.costo, this.abono, this.fechas, this.id); 
                JOptionPane.showMessageDialog(null,"Se ha editado su pedido con Exito","Listo",JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                E21EditarPedido adelante = new E21EditarPedido(conPedOrf, conPedClie, listaPie);
                adelante.setVisible(true);                
            }               
        }else{
            JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos requeridos","ERROR",JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(E2EditarPedidoCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E2EditarPedidoCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E2EditarPedidoCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E2EditarPedidoCaracteristicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E2EditarPedidoCaracteristicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaPedido;
    private javax.swing.JLabel labeCambioCaracteristicas;
    private javax.swing.JLabel labelAbono1;
    private javax.swing.JLabel labelAbonoInicial;
    private javax.swing.JLabel labelCedula1;
    private javax.swing.JLabel labelCedulaCliente2;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelCosto1;
    private javax.swing.JLabel labelDatos;
    private javax.swing.JLabel labelDolar;
    private javax.swing.JLabel labelDolar1;
    private javax.swing.JLabel labelFechaEntrega1;
    private javax.swing.JLabel labelFechaEntregaPedido;
    private javax.swing.JLabel labelFechaPedido;
    private javax.swing.JLabel labelFechaPedido1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JPanel panelAbono;
    private javax.swing.JPanel panelCedula;
    private javax.swing.JPanel panelCosto;
    private javax.swing.JPanel panelFechaEntrega;
    private javax.swing.JPanel panelFechaPedido;
    private javax.swing.JTextField txtAbonoInicial;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCosto;
    // End of variables declaration//GEN-END:variables
}
