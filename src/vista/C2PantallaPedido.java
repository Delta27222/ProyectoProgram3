package vista;


import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Joyeria;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class C2PantallaPedido extends javax.swing.JFrame {

    Orfebre conPedOrf; 
    Cliente conPedClie; 
    Controladora control;
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    BPantallaPrincipal a;   
    DaoPedidoXml datosPed = new  DaoPedidoXml();;
    
    public C2PantallaPedido() {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaPedido, jdFechaEntrega);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 
        panelPedido.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }
    
    public C2PantallaPedido(Orfebre conPedOrf, Cliente conPedClie) {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaPedido, jdFechaEntrega);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        //a=b;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelPedido.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);      
    }

    C2PantallaPedido(Orfebre conPedOrf) {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaPedido, jdFechaEntrega);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        //a=b;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelPedido.setVisible(false);  
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }
//USADO
    public C2PantallaPedido(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie, DaoPedidoXml datosPed) {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaPedido, jdFechaEntrega);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        this.datosPed = datosPed; 
        //a=b;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelPedido.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }   
//USADO
    public C2PantallaPedido(Orfebre conPedOrf, Cliente conPedClie, DaoPedidoXml datosPed) {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtCedulaCliente, txtCosto, txtAbonoInicial, jdFechaPedido, jdFechaEntrega);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.datosPed = datosPed; 
        //a=b;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelPedido.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnCheck = new javax.swing.JButton();
        btnOpciones = new javax.swing.JButton();
        labeliIdPedido = new javax.swing.JLabel();
        btnAgregarPedido = new javax.swing.JButton();
        panelPedido = new javax.swing.JPanel();
        labelCosto = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        labelAbonoInicial = new javax.swing.JLabel();
        txtAbonoInicial = new javax.swing.JTextField();
        labelDolar = new javax.swing.JLabel();
        labelDolar1 = new javax.swing.JLabel();
        labelFechaPedido = new javax.swing.JLabel();
        labelFechaEntregaPedido = new javax.swing.JLabel();
        labelCedulaCliente = new javax.swing.JLabel();
        txtCedulaCliente = new javax.swing.JTextField();
        jdFechaPedido = new com.toedter.calendar.JDateChooser();
        jdFechaEntrega = new com.toedter.calendar.JDateChooser();
        txtIdPedido = new javax.swing.JTextField();
        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnLimpiarTXT1 = new javax.swing.JButton();
        labelAgregarPedido = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();
        labelFondoPequeno = new javax.swing.JLabel();

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

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        btnCheck.setBackground(new java.awt.Color(153, 153, 153));
        btnCheck.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        btnCheck.setContentAreaFilled(false);
        btnCheck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheck.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCheck.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });
        getContentPane().add(btnCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 40, 40));

        btnOpciones.setBackground(new java.awt.Color(153, 153, 153));
        btnOpciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Opciones pequena.png"))); // NOI18N
        btnOpciones.setText("Mas Opciones ");
        btnOpciones.setContentAreaFilled(false);
        btnOpciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpciones.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Opciones Grandes.png"))); // NOI18N
        btnOpciones.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Opciones Grandes.png"))); // NOI18N
        btnOpciones.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 180, 230));

        labeliIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido.setText("Id Pedido:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 40));

        btnAgregarPedido.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedidoPequeno.png"))); // NOI18N
        btnAgregarPedido.setText("Agregar Pedido");
        btnAgregarPedido.setContentAreaFilled(false);
        btnAgregarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedido.png"))); // NOI18N
        btnAgregarPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedido.png"))); // NOI18N
        btnAgregarPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, 230));

        panelPedido.setForeground(new java.awt.Color(255, 228, 195));

        labelCosto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCosto.setText("Costo:");

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

        labelAbonoInicial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
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

        labelDolar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDolar.setText("$");

        labelDolar1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelDolar1.setText("$");

        labelFechaPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFechaPedido.setText("Fecha pedi:");

        labelFechaEntregaPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelFechaEntregaPedido.setText("Fecha entre:");

        labelCedulaCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCedulaCliente.setText("C/I Cliente:");

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

        jdFechaPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaPedidoKeyTyped(evt);
            }
        });

        jdFechaEntrega.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jdFechaEntregaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelPedidoLayout = new javax.swing.GroupLayout(panelPedido);
        panelPedido.setLayout(panelPedidoLayout);
        panelPedidoLayout.setHorizontalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addComponent(labelAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addComponent(labelCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelFechaPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelFechaEntregaPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelPedidoLayout.setVerticalGroup(
            panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPedidoLayout.createSequentialGroup()
                        .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelPedidoLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtCedulaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)
                                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAbonoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPedidoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(labelDolar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDolar1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)
                        .addComponent(labelFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jdFechaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFechaEntregaPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFechaEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panelPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 340, 270));

        txtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPedidoActionPerformed(evt);
            }
        });
        txtIdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPedidoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPedidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, 30));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 620, 130, 110));

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 650, 90, 80));

        btnLimpiarTXT1.setBackground(new java.awt.Color(153, 153, 153));
        btnLimpiarTXT1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLimpiarTXT1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Basura Pequena.png"))); // NOI18N
        btnLimpiarTXT1.setText("Limpiar");
        btnLimpiarTXT1.setContentAreaFilled(false);
        btnLimpiarTXT1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiarTXT1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiarTXT1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Basura Grande.png"))); // NOI18N
        btnLimpiarTXT1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Basura Grande.png"))); // NOI18N
        btnLimpiarTXT1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLimpiarTXT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTXT1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarTXT1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 180, 230));

        labelAgregarPedido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelAgregarPedido.setText("Agregar Pedido: ");
        getContentPane().add(labelAgregarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        labelFondoPequeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyectoGrande.png"))); // NOI18N
        getContentPane().add(labelFondoPequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 680, 100));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
    if (listaPie == null || listaPie.size() == 0){
        JOptionPane.showMessageDialog(null,"El pedido necesita al menos una pieza para poder ser agregado","ERROR",JOptionPane.ERROR_MESSAGE);
        txtIdPedido.setText("");
        panelPedido.setVisible(false);
        txtCedulaCliente.setText("");
        txtCosto.setText("");
        txtAbonoInicial.setText("");
        btnCheck.setVisible(true);
    }else{
       if (!txtIdPedido.getText().equals("")&& !txtIdPedido.getText().equals("0")){
         int id, id1, cont=0; 
         String txt = txtIdPedido.getText();
            id = Integer.parseInt(txt); 
            if (conPedOrf.getListaPedidosOrfebre() != null){
                for (int i = 0; i < conPedOrf.getListaPedidosOrfebre().size(); i++) {
                    id1 = conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido();   
                    if (id == id1){
                        JOptionPane.showMessageDialog(null,"El Id del pedido Ya se encuenta asignado","ERROR",JOptionPane.ERROR_MESSAGE);
                        txtIdPedido.setText("");
                        cont = 1;
                        break; 
                    }        
                }
                 if (cont==0){
                    panelPedido.setVisible(true);
                    btnCheck.setVisible(false);
                 }       
            }
        }else{
           txtIdPedido.setText("");
       }
    }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
        D2PantallaOpcionesPedido adelante = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie);
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void btnAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoActionPerformed
        if (listaPie == null || listaPie.size() == 0){
            JOptionPane.showMessageDialog(null,"El pedido necesita al menos una pieza para poder ser agregado","ERROR",JOptionPane.ERROR_MESSAGE);
            txtIdPedido.setText("");
            panelPedido.setVisible(false);
            txtCedulaCliente.setText("");
            txtCosto.setText("");
            txtAbonoInicial.setText("");
            btnCheck.setVisible(true);
        }else{
            int a = jdFechaPedido.getDate().compareTo(jdFechaEntrega.getDate()); 
            if (a < 0){               
                SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-YYYY");
                String fechaPedido = dFormat.format(jdFechaPedido.getDate());
                String fechaEntrega = dFormat.format(jdFechaEntrega.getDate());
                if (!txtCedulaCliente.getText().isEmpty() && !txtCosto.getText().isEmpty() && !txtAbonoInicial.getText().isEmpty() && !fechaPedido.equals("") && !fechaEntrega.equals("")){
                    //entrar a controladora                               
                    control.datosPedido(conPedOrf, conPedClie, listaPie);           
                    txtIdPedido.setText("");
                    txtCedulaCliente.setText("");
                    txtCosto.setText("");
                    txtAbonoInicial.setText("");
                    panelPedido.setVisible(false);
                    btnCheck.setVisible(true);   
                }else{
                    JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos requeridos","ERROR",JOptionPane.ERROR_MESSAGE);
                }             
            }else{
                if (a > 0){
                    JOptionPane.showMessageDialog(null,"La FECHA DEL PEDIDO no puede ser posterior a la FECHA DE LA ENTREGA","ERROR",JOptionPane.ERROR_MESSAGE);                      
                }
            }
        }
        
    }//GEN-LAST:event_btnAgregarPedidoActionPerformed

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void txtCostoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoKeyPressed

    private void txtCostoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCostoKeyTyped
        if (txtCosto.getText().length()>=6){
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

    private void txtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPedidoActionPerformed

    }//GEN-LAST:event_txtIdPedidoActionPerformed

    private void txtIdPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyPressed

    }//GEN-LAST:event_txtIdPedidoKeyPressed

    private void txtIdPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyTyped
        if (txtIdPedido.getText().length()>=6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id del pedido solo tiene un maximo de 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtIdPedidoKeyTyped

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        BPantallaPrincipal atras = new BPantallaPrincipal(conPedOrf, conPedClie, listaPie, datosPed);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTXT1ActionPerformed
        txtIdPedido.setText("");
        panelPedido.setVisible(false);
        txtCedulaCliente.setText("");
        txtCosto.setText("");
        txtAbonoInicial.setText("");
        btnCheck.setVisible(true);
    }//GEN-LAST:event_btnLimpiarTXT1ActionPerformed

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
            int costo = 0; 
            int abono = 0;
            String costo1 = txtCosto.getText();
            String abono1 = txtAbonoInicial.getText(); 
            costo = Integer.parseInt(costo1); 
            abono = Integer.parseInt(abono1);
                if (abono > costo){
                    JOptionPane.showMessageDialog(null,"El abono no puede ser mayor al costo","ERROR",JOptionPane.ERROR_MESSAGE);
                    txtAbonoInicial.setText("");
                }               
            }
      
    }//GEN-LAST:event_txtAbonoInicialKeyReleased

    private void jdFechaEntregaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaEntregaKeyReleased

        
    }//GEN-LAST:event_jdFechaEntregaKeyReleased

    private void jdFechaPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaPedidoKeyTyped
  
        
        
        
    }//GEN-LAST:event_jdFechaPedidoKeyTyped

    private void jdFechaEntregaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jdFechaEntregaKeyTyped
    }//GEN-LAST:event_jdFechaEntregaKeyTyped

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
            java.util.logging.Logger.getLogger(C2PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C2PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C2PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C2PantallaPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C2PantallaPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPedido;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnLimpiarTXT1;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog jDialog1;
    private com.toedter.calendar.JDateChooser jdFechaEntrega;
    private com.toedter.calendar.JDateChooser jdFechaPedido;
    private javax.swing.JLabel labelAbonoInicial;
    private javax.swing.JLabel labelAgregarPedido;
    private javax.swing.JLabel labelCedulaCliente;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelDolar;
    private javax.swing.JLabel labelDolar1;
    private javax.swing.JLabel labelFechaEntregaPedido;
    private javax.swing.JLabel labelFechaPedido;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondoPequeno;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JPanel panelPedido;
    private javax.swing.JTextField txtAbonoInicial;
    private javax.swing.JTextField txtCedulaCliente;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
