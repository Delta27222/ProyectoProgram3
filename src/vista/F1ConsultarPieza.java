package vista;

import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class F1ConsultarPieza extends javax.swing.JFrame {

    
        Controladora control;
    Orfebre conPedOrf;
    Cliente conPedClie;
    ArrayList<Pedido> conPed2 = new ArrayList<Pedido>(); 
    ArrayList<Pieza> listaPieza;
    ArrayList<Pieza> listaPieza2;
    
    public F1ConsultarPieza() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        TextPrompt prueba = new TextPrompt("Caracteristica de su pieza", txtIdPieza);
        panelPrincipal.setVisible(true);
        panelSecundario.setVisible(false);
    }
    //USADO 
    public F1ConsultarPieza(Orfebre conPedOrf, Cliente conPedClie) {
        initComponents();
        control = new Controladora(this);
        this.conPedOrf = conPedOrf; 
        this.conPedClie = conPedClie;
        control.llenarTablaPieza(conPedOrf, conPedClie, tablaCuadroPrincipal);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelPrincipal.setVisible(true);
        panelSecundario.setVisible(false);
        TextPrompt prueba = new TextPrompt("Caracteristica de su pieza", txtIdPieza);

    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        panelSecundario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuadroSecundario = new javax.swing.JTable();
        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCuadroPrincipal = new javax.swing.JTable();
        labeConsultarPedido = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        btnAtras4 = new javax.swing.JButton();
        labelIdPedido = new javax.swing.JLabel();
        txtIdPieza = new javax.swing.JTextField();
        btnLupa = new javax.swing.JButton();
        btnLupa1 = new javax.swing.JButton();
        labelNoAplica = new javax.swing.JLabel();
        labelFondo1 = new javax.swing.JLabel();
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

        panelSecundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCuadroSecundario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Id Pieza", "Materia", "Pureza", "Peso", "Tamano", "Tipo Anillo", "Mensaje ", "Tipo Arreglo"
            }
        ));
        jScrollPane2.setViewportView(tablaCuadroSecundario);

        panelSecundario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 270));

        getContentPane().add(panelSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 950, 270));

        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCuadroPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Id Pieza", "Materia", "Pureza", "Peso", "Tamano", "Tipo Anillo", "Mensaje ", "Tipo Arreglo"
            }
        ));
        jScrollPane1.setViewportView(tablaCuadroPrincipal);

        panelPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 270));

        getContentPane().add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 950, 270));

        labeConsultarPedido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeConsultarPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeConsultarPedido.setText("Consultar pieza: ");
        getContentPane().add(labeConsultarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 190, 90));

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
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 550, 90, 80));

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
        getContentPane().add(btnAtras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, 110));

        labelIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labelIdPedido.setText("Caracteristica a CONSULTAR: ");
        getContentPane().add(labelIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtIdPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPiezaActionPerformed(evt);
            }
        });
        txtIdPieza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPiezaKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 220, 40));

        btnLupa.setBackground(new java.awt.Color(153, 153, 153));
        btnLupa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLupa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2Lupa Pequena.png"))); // NOI18N
        btnLupa.setContentAreaFilled(false);
        btnLupa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLupa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLupa.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2Lupa Grande.png"))); // NOI18N
        btnLupa.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/2Lupa Grande.png"))); // NOI18N
        btnLupa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 90, 80));

        btnLupa1.setBackground(new java.awt.Color(153, 153, 153));
        btnLupa1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirPequeno.png"))); // NOI18N
        btnLupa1.setContentAreaFilled(false);
        btnLupa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnLupa1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLupa1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirGrande.png"))); // NOI18N
        btnLupa1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirGrande.png"))); // NOI18N
        btnLupa1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLupa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnLupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 50, 50));

        labelNoAplica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNoAplica.setForeground(new java.awt.Color(0, 0, 0));
        labelNoAplica.setText("N/A = No aplica para el tipo de trabajo");
        getContentPane().add(labelNoAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        labelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 640));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 600, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza(conPedOrf, conPedClie, listaPieza); 
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras4ActionPerformed

    private void txtIdPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPiezaActionPerformed

    private void txtIdPiezaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyTyped
        if (txtIdPieza.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id de la pieza solo tiene un maximo de 20 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIdPiezaKeyTyped

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
        if (!txtIdPieza.getText().equals("")){
            if (conPedOrf.getListaPedidosOrfebre() != null){
                String caracateristica= txtIdPieza.getText();
                boolean hay; 
                hay = control.llenarTablaPiezasCon(conPedOrf, tablaCuadroSecundario, caracateristica);
                if (!hay){
                    JOptionPane.showMessageDialog(null,"No hay ninguna pieza con dicha caracteristica","No coincidencia",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    panelPrincipal.setVisible(false);
                    panelSecundario.setVisible(true);
                }
                txtIdPieza.setText("");
            }else{
                JOptionPane.showMessageDialog(null,"La lista de pedidos esta vacia","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnLupaActionPerformed

    private void btnLupa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupa1ActionPerformed
        panelPrincipal.setVisible(true);
        panelSecundario.setVisible(false);
    }//GEN-LAST:event_btnLupa1ActionPerformed

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
            java.util.logging.Logger.getLogger(F1ConsultarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F1ConsultarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F1ConsultarPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnLupa1;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labeConsultarPedido;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondo1;
    private javax.swing.JLabel labelIdPedido;
    private javax.swing.JLabel labelNoAplica;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSecundario;
    private javax.swing.JTable tablaCuadroPrincipal;
    private javax.swing.JTable tablaCuadroSecundario;
    private javax.swing.JTextField txtIdPieza;
    // End of variables declaration//GEN-END:variables
}
