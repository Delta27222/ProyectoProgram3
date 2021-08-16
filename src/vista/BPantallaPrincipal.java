package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;


public class BPantallaPrincipal extends javax.swing.JFrame {
    
    Controladora control; 
    C1PantallaPieza a; 
    Orfebre conPedOrf ;
    Cliente conPedClie;
    ArrayList<Pieza> listaPieza;
    DaoPedidoXml datosPed; 
    
     public BPantallaPrincipal() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
     
//USADO
    public BPantallaPrincipal(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPieza, DaoPedidoXml datosPed) {
        initComponents();
        control = new Controladora(this);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.datosPed = datosPed; 
        this.listaPieza = listaPieza; 
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    } 
    
//USADO
    public BPantallaPrincipal(Orfebre orfebre) {
        initComponents();
        control = new Controladora(this);      
        this.conPedOrf = orfebre;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        Bienvenida = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnPieza = new javax.swing.JButton();
        btnPedido = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
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

        Bienvenida.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        Bienvenida.setText("Pantalla pricipal: ");
        getContentPane().add(Bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        btnPieza.setBackground(new java.awt.Color(153, 153, 153));
        btnPieza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Joya Pequena.png"))); // NOI18N
        btnPieza.setText("Pieza");
        btnPieza.setContentAreaFilled(false);
        btnPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPieza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPieza.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Joya Grande.png"))); // NOI18N
        btnPieza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Joya Grande.png"))); // NOI18N
        btnPieza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 210, 210));

        btnPedido.setBackground(new java.awt.Color(153, 153, 153));
        btnPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pedido Pequeno.png"))); // NOI18N
        btnPedido.setText("Pedido");
        btnPedido.setContentAreaFilled(false);
        btnPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pedido Grande.png"))); // NOI18N
        btnPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pedido Grande.png"))); // NOI18N
        btnPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 190, 150));

        btnAtras.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 130, 110));

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 570, 90, 80));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiezaActionPerformed
        C1PantallaPieza adelante = new C1PantallaPieza(this.conPedOrf);
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPiezaActionPerformed

    private void btnPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPedidoActionPerformed
        C2PantallaPedido adelante = new C2PantallaPedido(conPedOrf, conPedClie, listaPieza, datosPed); //falta enviar el orfebre, el cliente y el entero. yo creo que el problema está es aquí, creo que no tendría que pasarle this y en la clase pantalla cuadros regtresarme con una nueva pantalla principal. //this
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnPedidoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        ALogin atras = new ALogin();
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
            java.util.logging.Logger.getLogger(BPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BPantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BPantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenida;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnPedido;
    private javax.swing.JButton btnPieza;
    private javax.swing.JButton btnSalir;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    // End of variables declaration//GEN-END:variables
}
