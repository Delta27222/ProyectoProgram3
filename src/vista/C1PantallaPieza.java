package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Anillo;
import modelo.Cliente;
import modelo.Collar;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;


public class C1PantallaPieza extends javax.swing.JFrame {

    //Joyeria arrayPed = new  Joyeria(); 
    Orfebre conPedOrf; 
    Cliente conPedClie; 
    Controladora control;
    BPantallaPrincipal a;
    //Pedido pieza;  //electrodomestico
    Pieza pieza;

    ArrayList<Pieza> listaPieza = new ArrayList<Pieza>();
        DaoPedidoXml datosPed = new DaoPedidoXml();

    public C1PantallaPieza() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelCrear.setVisible(false);
        panelArreglar.setVisible(false);
        panelCrearAnillo.setVisible(false);
        panelCrearCollar.setVisible(false);
        panelArreglarCollar.setVisible(false);
        labelCircunferencia3.setVisible(false);
        txtCircunferencia3.setVisible(false);
        labelCM2.setVisible(false);
        labelCircunferencia5.setVisible(false);
        txtCircunferencia5.setVisible(false);
        labelCM3.setVisible(false);
        jcbPurezaPlata.setVisible(false);
        labelNorma.setVisible(false); 
        jcbCrear.setVisible(false);
        jcbArreglar.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPieza);
    }
    //USADO     
      public C1PantallaPieza(Orfebre conPedOrf) {            
          
        initComponents();
        control = new Controladora(this, txtIdPieza, txtTipoReparacion, txtCircunferencia5, txtCircunferencia3, txtPeso, txtCircunferencia1, txtEscrito, txtCircunferencia2, jcbMaterial, jcbPurezaOro, jcbPurezaPlata, jcbTipoAnillo);  
        this.conPedOrf = conPedOrf;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelCrear.setVisible(false);
        panelArreglar.setVisible(false);
        panelCrearAnillo.setVisible(false);
        panelCrearCollar.setVisible(false);
        panelArreglarCollar.setVisible(false);
        labelCircunferencia3.setVisible(false);
        txtCircunferencia3.setVisible(false);
        labelCM2.setVisible(false);
        labelCircunferencia5.setVisible(false);
        txtCircunferencia5.setVisible(false);
        labelCM3.setVisible(false);
        jcbPurezaPlata.setVisible(false);
        labelNorma.setVisible(false);
        jcbCrear.setVisible(false);
        jcbArreglar.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPieza);
    }  
    
    public C1PantallaPieza(Orfebre conPedOrf, Cliente conPedClie) {
       initComponents();
        control = new Controladora(this); //yo creo que al pasarle this le estas pasando los atributos con los valores que tengan aquí creo (en este punto o momento)
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");
        panelCrear.setVisible(false);
        panelArreglar.setVisible(false);
        panelCrearAnillo.setVisible(false);
        panelCrearCollar.setVisible(false);
        panelArreglarCollar.setVisible(false);        
        labelCircunferencia3.setVisible(false);
        txtCircunferencia3.setVisible(false);
        labelCM2.setVisible(false);
        labelCircunferencia5.setVisible(false);
        txtCircunferencia5.setVisible(false);
        labelCM3.setVisible(false);
        jcbPurezaPlata.setVisible(false);
        labelNorma.setVisible(false);
        jcbCrear.setVisible(false);
        jcbArreglar.setVisible(false);   
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPieza);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        txtIdPieza = new javax.swing.JTextField();
        labelAgregarPieza = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnAgregarPieza = new javax.swing.JButton();
        btnOpciones1 = new javax.swing.JButton();
        jcbArreglar = new javax.swing.JCheckBox();
        jcbCrear = new javax.swing.JCheckBox();
        panelArreglar = new javax.swing.JPanel();
        labelTipoReparacion = new javax.swing.JLabel();
        txtTipoReparacion = new javax.swing.JTextField();
        labelTipoPieza1 = new javax.swing.JLabel();
        jcbAnillo1 = new javax.swing.JCheckBox();
        jcbCollar1 = new javax.swing.JCheckBox();
        panelArreglarCollar = new javax.swing.JPanel();
        txtCircunferencia4 = new javax.swing.JTextField();
        labelCirculnferencia4 = new javax.swing.JLabel();
        labelCM4 = new javax.swing.JLabel();
        labelCircunferencia5 = new javax.swing.JLabel();
        txtCircunferencia5 = new javax.swing.JTextField();
        labelCM3 = new javax.swing.JLabel();
        labelCM2 = new javax.swing.JLabel();
        txtCircunferencia3 = new javax.swing.JTextField();
        labelCircunferencia3 = new javax.swing.JLabel();
        panelCrear = new javax.swing.JPanel();
        labelPurezaMaterial = new javax.swing.JLabel();
        labelNorma = new javax.swing.JLabel();
        jcbAnillo = new javax.swing.JCheckBox();
        jcbMaterial = new javax.swing.JComboBox<>();
        labelTipoPieza = new javax.swing.JLabel();
        jcbPurezaOro = new javax.swing.JComboBox<>();
        labelKilate = new javax.swing.JLabel();
        labelPeso = new javax.swing.JLabel();
        labelMaterial = new javax.swing.JLabel();
        labelKilate1 = new javax.swing.JLabel();
        jcbPurezaPlata = new javax.swing.JComboBox<>();
        jcbCollar = new javax.swing.JCheckBox();
        txtPeso = new javax.swing.JTextField();
        panelCrearCollar = new javax.swing.JPanel();
        labelCM1 = new javax.swing.JLabel();
        txtCircunferencia2 = new javax.swing.JTextField();
        labelCirculnferencia2 = new javax.swing.JLabel();
        panelCrearAnillo = new javax.swing.JPanel();
        labelCM = new javax.swing.JLabel();
        jcbTipoAnillo = new javax.swing.JComboBox<>();
        txtCircunferencia1 = new javax.swing.JTextField();
        labelEscrito = new javax.swing.JLabel();
        txtEscrito = new javax.swing.JTextField();
        labelCirculnferencia1 = new javax.swing.JLabel();
        labelTipoAnillo1 = new javax.swing.JLabel();
        btnOpciones = new javax.swing.JButton();
        btnLimpiarTXT1 = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        labelInformacion5 = new javax.swing.JLabel();
        labelInformacion4 = new javax.swing.JLabel();
        labelInformacion3 = new javax.swing.JLabel();
        labelInformacion2 = new javax.swing.JLabel();
        labelInformacion1 = new javax.swing.JLabel();
        labelInformacion = new javax.swing.JLabel();
        labeliIdPieza = new javax.swing.JLabel();
        labelFondoPequeno = new javax.swing.JLabel();
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

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPiezaActionPerformed(evt);
            }
        });
        txtIdPieza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdPiezaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPiezaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 140, 30));

        labelAgregarPieza.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelAgregarPieza.setText("Agregar Pieza: ");
        getContentPane().add(labelAgregarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        btnAgregarPieza.setBackground(new java.awt.Color(153, 153, 153));
        btnAgregarPieza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedidoPequeno.png"))); // NOI18N
        btnAgregarPieza.setText("Agregar Pedido");
        btnAgregarPieza.setContentAreaFilled(false);
        btnAgregarPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPieza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarPieza.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedido.png"))); // NOI18N
        btnAgregarPieza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/AgregarPedido.png"))); // NOI18N
        btnAgregarPieza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAgregarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 180, 230));

        btnOpciones1.setBackground(new java.awt.Color(153, 153, 153));
        btnOpciones1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnOpciones1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/check.png"))); // NOI18N
        btnOpciones1.setContentAreaFilled(false);
        btnOpciones1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpciones1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOpciones1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOpciones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpciones1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 40, 40));

        jcbArreglar.setText("Arreglar Pieza");
        jcbArreglar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbArreglarActionPerformed(evt);
            }
        });
        getContentPane().add(jcbArreglar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, -1));

        jcbCrear.setText("Crear Pieza");
        jcbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCrearActionPerformed(evt);
            }
        });
        getContentPane().add(jcbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 100, -1));

        panelArreglar.setForeground(new java.awt.Color(255, 228, 195));
        panelArreglar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTipoReparacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTipoReparacion.setText("Tipo Reparacion:");
        panelArreglar.add(labelTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        txtTipoReparacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoReparacionActionPerformed(evt);
            }
        });
        txtTipoReparacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTipoReparacionKeyTyped(evt);
            }
        });
        panelArreglar.add(txtTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 140, 30));

        labelTipoPieza1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTipoPieza1.setText("Tipo pieza:");
        panelArreglar.add(labelTipoPieza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 40));

        jcbAnillo1.setText("Anillo");
        jcbAnillo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAnillo1ActionPerformed(evt);
            }
        });
        panelArreglar.add(jcbAnillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 100, -1));

        jcbCollar1.setText("Collar");
        jcbCollar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCollar1ActionPerformed(evt);
            }
        });
        panelArreglar.add(jcbCollar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 100, -1));

        panelArreglarCollar.setForeground(new java.awt.Color(204, 204, 204));

        txtCircunferencia4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferencia4ActionPerformed(evt);
            }
        });
        txtCircunferencia4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCircunferencia4KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferencia4KeyTyped(evt);
            }
        });

        labelCirculnferencia4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCirculnferencia4.setText("Nuevo Tamano: ");

        labelCM4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCM4.setText("cm");

        javax.swing.GroupLayout panelArreglarCollarLayout = new javax.swing.GroupLayout(panelArreglarCollar);
        panelArreglarCollar.setLayout(panelArreglarCollarLayout);
        panelArreglarCollarLayout.setHorizontalGroup(
            panelArreglarCollarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArreglarCollarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelCirculnferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCircunferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelCM4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelArreglarCollarLayout.setVerticalGroup(
            panelArreglarCollarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelArreglarCollarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelArreglarCollarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCirculnferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCircunferencia4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelArreglarCollarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelCM4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        panelArreglar.add(panelArreglarCollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 169, 270, -1));

        labelCircunferencia5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCircunferencia5.setText("Nuevo Tamano: ");
        panelArreglar.add(labelCircunferencia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 152, 40));

        txtCircunferencia5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferencia5ActionPerformed(evt);
            }
        });
        txtCircunferencia5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCircunferencia5KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferencia5KeyTyped(evt);
            }
        });
        panelArreglar.add(txtCircunferencia5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 55, 30));

        labelCM3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCM3.setText("cm");
        panelArreglar.add(labelCM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 65, 40));

        labelCM2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCM2.setText("cm");
        panelArreglar.add(labelCM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 40, 40));

        txtCircunferencia3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferencia3ActionPerformed(evt);
            }
        });
        txtCircunferencia3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCircunferencia3KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferencia3KeyTyped(evt);
            }
        });
        panelArreglar.add(txtCircunferencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 55, 30));

        labelCircunferencia3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCircunferencia3.setText("Nuevo Tamano Circunferencia:");
        panelArreglar.add(labelCircunferencia3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 40));

        getContentPane().add(panelArreglar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 410, 180));

        panelCrear.setForeground(new java.awt.Color(255, 228, 195));
        panelCrear.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPurezaMaterial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPurezaMaterial.setText("Pureza:");
        panelCrear.add(labelPurezaMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 90, 40));

        labelNorma.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelNorma.setText("Norma");
        panelCrear.add(labelNorma, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 65, 40));

        jcbAnillo.setText("Anillo");
        jcbAnillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAnilloActionPerformed(evt);
            }
        });
        panelCrear.add(jcbAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 100, -1));

        jcbMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oro", "Plata", "Otro" }));
        jcbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaterialActionPerformed(evt);
            }
        });
        panelCrear.add(jcbMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 100, 30));

        labelTipoPieza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTipoPieza.setText("Tipo pieza:");
        panelCrear.add(labelTipoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 110, 40));

        jcbPurezaOro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "14", "18" }));
        jcbPurezaOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPurezaOroActionPerformed(evt);
            }
        });
        panelCrear.add(jcbPurezaOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        labelKilate.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelKilate.setText("Kilates");
        panelCrear.add(labelKilate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 65, 40));

        labelPeso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelPeso.setText("Peso:");
        panelCrear.add(labelPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 90, 40));

        labelMaterial.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelMaterial.setText("Material:");
        panelCrear.add(labelMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 110, 40));

        labelKilate1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        labelKilate1.setText("gr");
        panelCrear.add(labelKilate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 65, 40));

        jcbPurezaPlata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "835", "925", "950" }));
        panelCrear.add(jcbPurezaPlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 100, 30));

        jcbCollar.setText("Collar");
        jcbCollar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCollarActionPerformed(evt);
            }
        });
        panelCrear.add(jcbCollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 100, -1));

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
        panelCrear.add(txtPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 55, 30));

        panelCrearCollar.setForeground(new java.awt.Color(204, 204, 204));
        panelCrearCollar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCM1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCM1.setText("cm");
        panelCrearCollar.add(labelCM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 20, 65, 40));

        txtCircunferencia2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferencia2ActionPerformed(evt);
            }
        });
        txtCircunferencia2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCircunferencia2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferencia2KeyTyped(evt);
            }
        });
        panelCrearCollar.add(txtCircunferencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 55, 30));

        labelCirculnferencia2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCirculnferencia2.setText("Circunferencia: ");
        panelCrearCollar.add(labelCirculnferencia2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 144, 40));

        panelCrear.add(panelCrearCollar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 370, 80));

        panelCrearAnillo.setForeground(new java.awt.Color(207, 183, 183));
        panelCrearAnillo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCM.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCM.setText("cm");
        panelCrearAnillo.add(labelCM, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 20, 65, 40));

        jcbTipoAnillo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grado", "C/Nombre", "Otro" }));
        panelCrearAnillo.add(jcbTipoAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 73, 100, 30));

        txtCircunferencia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCircunferencia1ActionPerformed(evt);
            }
        });
        txtCircunferencia1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCircunferencia1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCircunferencia1KeyTyped(evt);
            }
        });
        panelCrearAnillo.add(txtCircunferencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 23, 55, 30));

        labelEscrito.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelEscrito.setText("Mensaje:");
        panelCrearAnillo.add(labelEscrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 112, -1, 40));

        txtEscrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscritoActionPerformed(evt);
            }
        });
        txtEscrito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEscritoKeyTyped(evt);
            }
        });
        panelCrearAnillo.add(txtEscrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 119, 140, 30));

        labelCirculnferencia1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelCirculnferencia1.setText("Circunferencia: ");
        panelCrearAnillo.add(labelCirculnferencia1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 16, 144, 40));

        labelTipoAnillo1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelTipoAnillo1.setText("Tipo Anillo: ");
        panelCrearAnillo.add(labelTipoAnillo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 66, -1, 40));

        panelCrear.add(panelCrearAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 160));

        getContentPane().add(panelCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 400, 420));

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
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 130, 110));

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 760, 90, 80));

        labelInformacion5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion5.setText("pieza,  y solo quedara registrada");
        getContentPane().add(labelInformacion5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 780, 300, 50));

        labelInformacion4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion4.setText(" De lo contrario se borrara la ");
        getContentPane().add(labelInformacion4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 760, 300, 50));

        labelInformacion3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion3.setText(" vez para el apartado de Pedido. ");
        getContentPane().add(labelInformacion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 740, 300, 50));

        labelInformacion2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion2.setText(" pedido , debera irse de de una");
        getContentPane().add(labelInformacion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 720, 300, 50));

        labelInformacion1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion1.setText("OJO: Si desea agregar piezas a un");
        getContentPane().add(labelInformacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 700, 300, 50));

        labelInformacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelInformacion.setText("como una pieza sin pedido.");
        getContentPane().add(labelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 800, 340, 50));

        labeliIdPieza.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPieza.setText("Id Pieza:");
        getContentPane().add(labeliIdPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 40));

        labelFondoPequeno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyectoGrande.png"))); // NOI18N
        getContentPane().add(labelFondoPequeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 650, 680, 210));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPiezaActionPerformed

    private void txtIdPiezaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPiezaKeyPressed

    private void txtIdPiezaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyTyped
        if (txtIdPieza.getText().length()>=6){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id de la Pieza solo tiene un maximo de 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"El Id de la Pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtIdPiezaKeyTyped

    private void btnAgregarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPiezaActionPerformed
        if (jcbCrear.isSelected()){
                    if (jcbAnillo.isSelected() && !txtPeso.getText().isEmpty() && !txtCircunferencia1.getText().isEmpty() && !txtEscrito.getText().isEmpty() ){
                        pieza = new Anillo();                        
                        control.datosPieza(listaPieza, pieza, 1, conPedOrf);    //control.datosPedido                      

                    }else{
                        if (jcbCollar.isSelected() && !txtPeso.getText().isEmpty() && !txtCircunferencia2.getText().isEmpty()){
                             //ACA SE LLAMA A DATOS PARA AGREGAR COLLAR CREADO
                             //System.out.println("11hola22");
                             pieza = new Collar();
                             control.datosPieza(listaPieza, pieza, 1, conPedOrf);

                        }else{
                            JOptionPane.showMessageDialog(null,"11Por favor rellene los campos necesarios para hacer el anadido de la pieza","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }

                }
                if (jcbArreglar.isSelected()){
                    if (jcbAnillo1.isSelected() && !txtTipoReparacion.getText().isEmpty() && !txtCircunferencia3.getText().isEmpty()){
                        //agregas anillo arreglado
                        pieza = new Anillo(); 
                        control.datosPieza(listaPieza, pieza, 2, conPedOrf);

                    }else{
                        if (jcbCollar1.isSelected() && !txtTipoReparacion.getText().isEmpty() && !txtCircunferencia5.getText().isEmpty()){
                            //agregas collar arreglado
                            pieza = new Collar();
                            control.datosPieza(listaPieza, pieza, 2, conPedOrf);

                        }else{
                            JOptionPane.showMessageDialog(null,"Por favor rellene los campos necesarios para hacer el anadido de la pieza","ERROR",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }            

        txtIdPieza.setText("");
        txtPeso.setText("");
        txtCircunferencia2.setText("");
        txtCircunferencia1.setText("");
        txtEscrito.setText("");
        txtTipoReparacion.setText("");
        txtCircunferencia5.setText("");
        txtCircunferencia3.setText("");
        txtCircunferencia3.setVisible(false);
        labelCM2.setVisible(false);
        labelCM3.setVisible(false);
        labelCircunferencia3.setVisible(false);
        labelCircunferencia5.setVisible(false);
        txtCircunferencia5.setVisible(false);
        jcbAnillo.setSelected(false);
        jcbCollar.setSelected(false);
        jcbAnillo1.setSelected(false);
        jcbCollar1.setSelected(false);
        jcbCrear.setSelected(false);
        jcbArreglar.setSelected(false);
        panelCrearAnillo.setVisible(false);
        panelCrearCollar.setVisible(false);
        panelArreglar.setVisible(false);
        panelCrear.setVisible(false);
        jcbArreglar.setVisible(false);
        jcbCrear.setVisible(false);
        jcbCollar.setVisible(true);
        jcbAnillo.setVisible(true);
        btnOpciones1.setVisible(true);
    }//GEN-LAST:event_btnAgregarPiezaActionPerformed

    private void btnOpciones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpciones1ActionPerformed
     int id, id1, cont=0; 
     if (!txtIdPieza.getText().equals("")){
         id = Integer.parseInt(txtIdPieza.getText()); 
            if (conPedOrf.getListaPiezas()!= null){
                for (int i = 0; i < conPedOrf.getListaPiezas().size(); i++) {
                    id1 = conPedOrf.getListaPiezas().get(i).getIdPieza(); 
                    if (id == id1){  
                        cont = 0; 
                        break; 
                    }else{
                        cont = 1;
                    }       
                }     
            } 

        if (cont == 0){
           JOptionPane.showMessageDialog(null,"El Id de la pieza YA se encuenta registrado en el sistema","ERROR",JOptionPane.ERROR_MESSAGE); 
           txtIdPieza.setText("");
        }else{
            labelInformacion.setVisible(true);
            txtIdPieza.setVisible(true);
            jcbCrear.setVisible(true);
            jcbArreglar.setVisible(true);
            btnOpciones1.setVisible(false); 
        }         
     }

   
    }//GEN-LAST:event_btnOpciones1ActionPerformed

    private void jcbArreglarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbArreglarActionPerformed
        if (jcbArreglar.isSelected()){
            jcbCrear.setVisible(false);
            panelCrear.setVisible(false);
            panelArreglar.setVisible(true);
            jcbCollar1.setVisible(true);
            jcbAnillo1.setVisible(true);
        }else{
            jcbCrear.setVisible(true);
            panelCrear.setVisible(false);
            panelArreglar.setVisible(false);
            txtCircunferencia5.setText("");
            txtCircunferencia3.setText("");
            txtTipoReparacion.setText("");
            jcbAnillo1.setSelected(false);
            jcbCollar1.setSelected(false);
            jcbAnillo1.setVisible(true);
            jcbCollar1.setVisible(true);
            labelCircunferencia5.setVisible(false);
            labelCircunferencia3.setVisible(false);
            labelCM3.setVisible(false);
            labelCM2.setVisible(false);
            txtCircunferencia3.setVisible(false);
            txtCircunferencia5.setVisible(false);
        }
    }//GEN-LAST:event_jcbArreglarActionPerformed

    private void jcbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCrearActionPerformed
        if (jcbCrear.isSelected()){
            jcbArreglar.setVisible(false);
            panelCrear.setVisible(true);
            panelArreglar.setVisible(false);
        }else{
            jcbArreglar.setVisible(true);
            panelArreglar.setVisible(false);
            panelCrear.setVisible(false);
            txtCircunferencia1.setText("");
            txtEscrito.setText("");
            txtCircunferencia2.setText("");
            txtPeso.setText("");
            jcbAnillo.setSelected(false);
            jcbCollar.setSelected(false);
            jcbAnillo.setVisible(true);
            jcbCollar.setVisible(true);
            panelCrearAnillo.setVisible(false);
            panelCrearCollar.setVisible(false);
        }
    }//GEN-LAST:event_jcbCrearActionPerformed

    private void jcbAnilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAnilloActionPerformed
        if (jcbAnillo.isSelected()){
            jcbCollar.setVisible(false);
            panelCrearAnillo.setVisible(true);
            panelCrearCollar.setVisible(false);
        }else{
            jcbCollar.setVisible(true);
            panelCrearAnillo.setVisible(false);
            panelCrearCollar.setVisible(false);
            txtCircunferencia1.setText("");
            txtEscrito.setText("");
        }
    }//GEN-LAST:event_jcbAnilloActionPerformed

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

    private void jcbCollarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCollarActionPerformed
        if (jcbCollar.isSelected()){
            jcbAnillo.setVisible(false);
            panelCrearCollar.setVisible(true);
            panelCrearAnillo.setVisible(false);
        }else{
            jcbAnillo.setVisible(true);
            panelCrearCollar.setVisible(false);
            panelCrearAnillo.setVisible(false);
            txtCircunferencia2.setText("");
        }
    }//GEN-LAST:event_jcbCollarActionPerformed

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

    private void txtCircunferencia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferencia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia1ActionPerformed

    private void txtCircunferencia1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia1KeyPressed

    private void txtCircunferencia1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia1KeyTyped
        if (txtCircunferencia1.getText().length()>=2){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tamano de la circunferencia del pedido solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La circunferencia de la pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCircunferencia1KeyTyped

    private void txtEscritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEscritoActionPerformed

    private void txtEscritoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEscritoKeyTyped
        if (txtEscrito.getText().length()>=15){
            evt.consume();
            // Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Escrito no puede tener mas de 15 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtEscritoKeyTyped

    private void txtCircunferencia2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferencia2ActionPerformed

    }//GEN-LAST:event_txtCircunferencia2ActionPerformed

    private void txtCircunferencia2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia2KeyPressed

    private void txtCircunferencia2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia2KeyTyped
        if (txtCircunferencia2.getText().length()>=2){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tamano de la circunferencia del pedido solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La circunferencia de la pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCircunferencia2KeyTyped

    private void txtTipoReparacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTipoReparacionKeyTyped
       if (txtTipoReparacion.getText().length()>=15){
            evt.consume();
            // Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tipo de reparacion no puede tener mas de 15 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtTipoReparacionKeyTyped

    private void jcbAnillo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAnillo1ActionPerformed
        if (jcbAnillo1.isSelected()){
            jcbCollar1.setVisible(false);
            labelCircunferencia3.setVisible(true);
            txtCircunferencia3.setVisible(true);
            labelCM2.setVisible(true);
        }else{
            jcbCollar1.setVisible(true);
            labelCircunferencia3.setVisible(false);
            txtCircunferencia3.setVisible(false);
            labelCM2.setVisible(false);
            txtCircunferencia3.setText("");
        }
    }//GEN-LAST:event_jcbAnillo1ActionPerformed

    private void jcbCollar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCollar1ActionPerformed
        if (jcbCollar1.isSelected()){
            jcbAnillo1.setVisible(false);
            labelCircunferencia5.setVisible(true);
            txtCircunferencia5.setVisible(true);
            labelCM3.setVisible(true);
        }else{
            jcbAnillo1.setVisible(true);
            labelCircunferencia5.setVisible(false);
            txtCircunferencia5.setVisible(false);
            labelCM3.setVisible(false);
            txtCircunferencia5.setText("");
        }
    }//GEN-LAST:event_jcbCollar1ActionPerformed

    private void txtCircunferencia4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferencia4ActionPerformed

    }//GEN-LAST:event_txtCircunferencia4ActionPerformed

    private void txtCircunferencia4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia4KeyPressed

    private void txtCircunferencia4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia4KeyTyped
        if (txtCircunferencia2.getText().length()>=2){
            evt.consume();
            //  Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"La circunferencia solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtCircunferencia4KeyTyped

    private void txtCircunferencia5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferencia5ActionPerformed

    }//GEN-LAST:event_txtCircunferencia5ActionPerformed

    private void txtCircunferencia5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia5KeyPressed

    private void txtCircunferencia5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia5KeyTyped
        if (txtCircunferencia5.getText().length()>=2){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tamano de la circunferencia del pedido solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La circunferencia de la pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCircunferencia5KeyTyped

    private void txtCircunferencia3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCircunferencia3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia3ActionPerformed

    private void txtCircunferencia3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCircunferencia3KeyPressed

    private void txtCircunferencia3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCircunferencia3KeyTyped
        if (txtCircunferencia3.getText().length()>=2){
            evt.consume();
            java.awt.Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El tamano de la circunferencia del pedido solo tiene un maximo de 2 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
                JOptionPane.showMessageDialog(null,"La circunferencia de la pieza solo acepta enteros","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtCircunferencia3KeyTyped

    private void btnOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcionesActionPerformed
       D1PantallaOpcionesPieza adelante = new D1PantallaOpcionesPieza(this.conPedOrf, conPedClie,listaPieza);//Aquí es donde sta el problema creo. NO, no sé  //de ultimo
       adelante.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnOpcionesActionPerformed

    private void btnLimpiarTXT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTXT1ActionPerformed

        txtIdPieza.setText("");
        txtPeso.setText("");
        txtCircunferencia2.setText("");
        txtCircunferencia1.setText("");
        txtEscrito.setText("");
        txtTipoReparacion.setText("");
        txtCircunferencia5.setText("");
        txtCircunferencia3.setText("");
        jcbAnillo.setSelected(false);
        jcbCollar.setSelected(false);
        jcbAnillo1.setSelected(false);
        jcbCollar1.setSelected(false);
        jcbCrear.setSelected(false);
        jcbArreglar.setSelected(false);
        panelCrearAnillo.setVisible(false);
        panelCrearCollar.setVisible(false);
        panelArreglar.setVisible(false);
        panelCrear.setVisible(false);
        jcbArreglar.setVisible(true);
        jcbCrear.setVisible(true);
    }//GEN-LAST:event_btnLimpiarTXT1ActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        BPantallaPrincipal atras = new BPantallaPrincipal(conPedOrf, conPedClie, listaPieza, datosPed);
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

    private void txtTipoReparacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoReparacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoReparacionActionPerformed

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
            java.util.logging.Logger.getLogger(C1PantallaPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C1PantallaPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C1PantallaPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C1PantallaPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C1PantallaPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPieza;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnLimpiarTXT1;
    private javax.swing.JButton btnOpciones;
    private javax.swing.JButton btnOpciones1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JCheckBox jcbAnillo;
    private javax.swing.JCheckBox jcbAnillo1;
    private javax.swing.JCheckBox jcbArreglar;
    private javax.swing.JCheckBox jcbCollar;
    private javax.swing.JCheckBox jcbCollar1;
    private javax.swing.JCheckBox jcbCrear;
    private javax.swing.JComboBox<String> jcbMaterial;
    private javax.swing.JComboBox<String> jcbPurezaOro;
    private javax.swing.JComboBox<String> jcbPurezaPlata;
    private javax.swing.JComboBox<String> jcbTipoAnillo;
    private javax.swing.JLabel labelAgregarPieza;
    private javax.swing.JLabel labelCM;
    private javax.swing.JLabel labelCM1;
    private javax.swing.JLabel labelCM2;
    private javax.swing.JLabel labelCM3;
    private javax.swing.JLabel labelCM4;
    private javax.swing.JLabel labelCirculnferencia1;
    private javax.swing.JLabel labelCirculnferencia2;
    private javax.swing.JLabel labelCirculnferencia4;
    private javax.swing.JLabel labelCircunferencia3;
    private javax.swing.JLabel labelCircunferencia5;
    private javax.swing.JLabel labelEscrito;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondoPequeno;
    private javax.swing.JLabel labelInformacion;
    private javax.swing.JLabel labelInformacion1;
    private javax.swing.JLabel labelInformacion2;
    private javax.swing.JLabel labelInformacion3;
    private javax.swing.JLabel labelInformacion4;
    private javax.swing.JLabel labelInformacion5;
    private javax.swing.JLabel labelKilate;
    private javax.swing.JLabel labelKilate1;
    private javax.swing.JLabel labelMaterial;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labelNorma;
    private javax.swing.JLabel labelPeso;
    private javax.swing.JLabel labelPurezaMaterial;
    private javax.swing.JLabel labelTipoAnillo1;
    private javax.swing.JLabel labelTipoPieza;
    private javax.swing.JLabel labelTipoPieza1;
    private javax.swing.JLabel labelTipoReparacion;
    private javax.swing.JLabel labeliIdPieza;
    private javax.swing.JPanel panelArreglar;
    private javax.swing.JPanel panelArreglarCollar;
    private javax.swing.JPanel panelCrear;
    private javax.swing.JPanel panelCrearAnillo;
    private javax.swing.JPanel panelCrearCollar;
    private javax.swing.JTextField txtCircunferencia1;
    private javax.swing.JTextField txtCircunferencia2;
    private javax.swing.JTextField txtCircunferencia3;
    private javax.swing.JTextField txtCircunferencia4;
    private javax.swing.JTextField txtCircunferencia5;
    private javax.swing.JTextField txtEscrito;
    private javax.swing.JTextField txtIdPieza;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTipoReparacion;
    // End of variables declaration//GEN-END:variables
}
