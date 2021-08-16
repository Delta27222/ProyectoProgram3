package vista;

import controller.Controladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Joyeria;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class D1PantallaOpcionesPieza extends javax.swing.JFrame {

    Joyeria conPed = new Joyeria();
    //Joyeria conPed1;
    Orfebre conPedOrf;
    Cliente conPedClie;
    ArrayList<Pedido> conPed2 = new ArrayList<Pedido>(); 
    ArrayList<Pedido> conPed3;
    ArrayList<Pieza> listaPieza;
    C1PantallaPieza a;
    Controladora control; 
       
    
    public D1PantallaOpcionesPieza() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
    
        public D1PantallaOpcionesPieza(Orfebre conPedOrf) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        this.conPedOrf = conPedOrf; 
    }
    
    //USADO   
    public D1PantallaOpcionesPieza(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPieza) {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png"); 
        //this.a=b;
        this.conPedOrf = conPedOrf; 
        this.conPedClie = conPedClie;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnConsultar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        labelOpcionesPieza = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JButton();
        btnAtras1 = new javax.swing.JButton();
        labelNombreEmpresa = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsultar.setBackground(new java.awt.Color(153, 153, 153));
        btnConsultar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarPiezaPequena.png"))); // NOI18N
        btnConsultar.setText("ConsultarPieza");
        btnConsultar.setContentAreaFilled(false);
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarPiezaGrande.png"))); // NOI18N
        btnConsultar.setRequestFocusEnabled(false);
        btnConsultar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BuscarPiezaGrande.png"))); // NOI18N
        btnConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 170, 130));

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarPiezaPequena.png"))); // NOI18N
        btnEditar.setText("Editar Pieza");
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarPiezaGrande.png"))); // NOI18N
        btnEditar.setRequestFocusEnabled(false);
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarPiezaGrande.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 150, 130));

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarPiezaPequena.png"))); // NOI18N
        btnEliminar.setText("Eliminar Pieza");
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarPiezaGrande.png"))); // NOI18N
        btnEliminar.setRequestFocusEnabled(false);
        btnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarPiezaGrande.png"))); // NOI18N
        btnEliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 160, 120));

        labelOpcionesPieza.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labelOpcionesPieza.setForeground(new java.awt.Color(0, 0, 0));
        labelOpcionesPieza.setText("Opciones Pieza: ");
        getContentPane().add(labelOpcionesPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

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

        btnAtras1.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras1.setContentAreaFilled(false);
        btnAtras1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 130, 110));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        F1ConsultarPieza adelante = new F1ConsultarPieza(this.conPedOrf, conPedClie);
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        E11EditarPieza adelante = new E11EditarPieza(conPedOrf, conPedClie, listaPieza);
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        G1EliminarPieza adelante = new G1EliminarPieza(conPedOrf, conPedClie, listaPieza);
        adelante.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        C1PantallaPieza atras= new C1PantallaPieza(conPedOrf, conPedClie); 
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras1ActionPerformed

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
            java.util.logging.Logger.getLogger(D1PantallaOpcionesPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(D1PantallaOpcionesPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(D1PantallaOpcionesPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(D1PantallaOpcionesPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new D1PantallaOpcionesPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labelOpcionesPieza;
    // End of variables declaration//GEN-END:variables
}
