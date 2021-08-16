package vista;

import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;


public class F2ConsultarPedido extends javax.swing.JFrame {

    
    Controladora control;
    Orfebre conPedOrf;
    Cliente conPedClie;
    ArrayList<Pedido> conPed2 = new ArrayList<Pedido>(); 
    ArrayList<Pieza> listaPieza;
    
    public F2ConsultarPedido() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        TextPrompt prueba = new TextPrompt("IDPedido-CEDULA-COSTO-ABONO", txtIdPedido);
    }
    
    //USADO
    public F2ConsultarPedido(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPieza) {
        initComponents();
        control = new Controladora(this);
        this.listaPieza = listaPieza;
        this.conPedOrf = conPedOrf; 
        this.conPedClie = conPedClie;
        control.llenarTablaPedidos(conPedOrf, conPedClie, tablaCreado, conPed2, listaPieza);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelCuadroPrincipal.setVisible(true);
        panelCuadroSecundario.setVisible(false);
        TextPrompt prueba = new TextPrompt("IDPedido-CEDULA-COSTO-ABONO", txtIdPedido);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        btnRecetear = new javax.swing.JButton();
        labelNoAplica = new javax.swing.JLabel();
        panelCuadroSecundario = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCreado1 = new javax.swing.JTable();
        panelCuadroPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCreado = new javax.swing.JTable();
        labelNoPieza = new javax.swing.JLabel();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        labeConsultarPedido = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnLupa = new javax.swing.JButton();
        txtIdPedido = new javax.swing.JTextField();
        labelIdPedido = new javax.swing.JLabel();
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

        btnRecetear.setBackground(new java.awt.Color(153, 153, 153));
        btnRecetear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRecetear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirPequeno.png"))); // NOI18N
        btnRecetear.setContentAreaFilled(false);
        btnRecetear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRecetear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRecetear.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirGrande.png"))); // NOI18N
        btnRecetear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/repetirGrande.png"))); // NOI18N
        btnRecetear.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRecetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecetearActionPerformed(evt);
            }
        });
        getContentPane().add(btnRecetear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 50, 50));

        labelNoAplica.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNoAplica.setForeground(new java.awt.Color(0, 0, 0));
        labelNoAplica.setText("N/A = No aplica para el tipo de trabajo");
        getContentPane().add(labelNoAplica, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 520, -1, -1));

        panelCuadroSecundario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCreado1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TIPO1               ", "Id Pedido", "Cedula Cliente", "Id Pieza", "Material", "Pureza", "Costo", "Abono Inicial", "Fecha Pedido", "Fecha Entrega"
            }
        ));
        jScrollPane2.setViewportView(tablaCreado1);

        panelCuadroSecundario.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 260));

        getContentPane().add(panelCuadroSecundario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 860, 260));

        panelCuadroPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaCreado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "TIPO1", "Id Pedido", "Cedula Cliente", "Id Pieza", "Material", "Pureza", "Costo", "Abono Inicial", "Fecha Pedido", "Fecha Entrega"
            }
        ));
        jScrollPane1.setViewportView(tablaCreado);

        panelCuadroPrincipal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 260));

        getContentPane().add(panelCuadroPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 860, 260));

        labelNoPieza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelNoPieza.setForeground(new java.awt.Color(0, 0, 0));
        labelNoPieza.setText("N/P = No tiene pieza el pedido");
        getContentPane().add(labelNoPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 550, -1, -1));

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

        labeConsultarPedido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeConsultarPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeConsultarPedido.setText("Consultar pedido: ");
        getContentPane().add(labeConsultarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 190, 90));

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

        txtIdPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPedidoActionPerformed(evt);
            }
        });
        txtIdPedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdPedidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 220, 40));

        labelIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labelIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labelIdPedido.setText("Caracteristica a CONSULTAR: ");
        getContentPane().add(labelIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        labelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 640));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 790, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPieza);
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

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
        if (!txtIdPedido.getText().equals("") && !txtIdPedido.getText().equals("0")){
            if (conPedOrf.getListaPedidosOrfebre() != null){
                String caracateristica= txtIdPedido.getText();
                control.llenarTablaPedidosCon(conPedOrf, conPedClie, tablaCreado1, conPed2, listaPieza, caracateristica);
                txtIdPedido.setText("");
                panelCuadroPrincipal.setVisible(false);
                panelCuadroSecundario.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null,"La lista de pedidos esta vacia","ERROR",JOptionPane.ERROR_MESSAGE);
            }
        } else{
            txtIdPedido.setText("");
        }      
    }//GEN-LAST:event_btnLupaActionPerformed

    private void txtIdPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyTyped
        if (txtIdPedido.getText().length()>=20){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id del pedido solo tiene un maximo de 20 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIdPedidoKeyTyped

    private void txtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPedidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPedidoActionPerformed

    private void btnRecetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecetearActionPerformed
        panelCuadroPrincipal.setVisible(true);
        panelCuadroSecundario.setVisible(false);
    }//GEN-LAST:event_btnRecetearActionPerformed

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
            java.util.logging.Logger.getLogger(F2ConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(F2ConsultarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new F2ConsultarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnRecetear;
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
    private javax.swing.JLabel labelNoPieza;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JPanel panelCuadroPrincipal;
    private javax.swing.JPanel panelCuadroSecundario;
    private javax.swing.JTable tablaCreado;
    private javax.swing.JTable tablaCreado1;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
