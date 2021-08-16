package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Joyeria;
import modelo.Orfebre;
import modelo.Pedido;


public class ALogin extends javax.swing.JFrame {

   Controladora control; 
   Orfebre conPedOrf = new Orfebre();
   Cliente conPedClie = new Cliente();
   DaoPedidoXml datosPed = new DaoPedidoXml();
   
    public ALogin() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        labelCargando.setVisible(false);
    }

    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnEmpezar = new javax.swing.JButton();
        labelCargando = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(158, 191, 240));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 90, 80));

        btnEmpezar.setBackground(new java.awt.Color(153, 153, 153));
        btnEmpezar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmpezar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha Peuqena.png"))); // NOI18N
        btnEmpezar.setText("Iniciar Programa ");
        btnEmpezar.setContentAreaFilled(false);
        btnEmpezar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmpezar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpezar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha Grande.png"))); // NOI18N
        btnEmpezar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flecha Grande.png"))); // NOI18N
        btnEmpezar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 190, 170));

        labelCargando.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        labelCargando.setForeground(new java.awt.Color(0, 0, 0));
        labelCargando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/807.gif"))); // NOI18N
        labelCargando.setText("Cargando...");
        labelCargando.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                labelCargandoAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(labelCargando, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 290, 150));

        labelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa Pequena.png"))); // NOI18N
        getContentPane().add(labelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 140, 70));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void labelCargandoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_labelCargandoAncestorAdded
        
    }//GEN-LAST:event_labelCargandoAncestorAdded

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        btnEmpezar.setVisible(false);
        new _Cargar().show();    
        btnSalir.setVisible(false);
    }//GEN-LAST:event_btnEmpezarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed


    public class _Cargar implements Runnable{
        public void show(){
            new Thread(this).start();
        }
        @Override
        public void run(){
            labelCargando.setVisible(true);
            ciclo(); 
            labelCargando.setVisible(false);
        }
    }
    private void ciclo(){
        for(int i = 0; i < 15000; i++){
            System.out.println(" ");
        }
      datosPed.todosLosPedido(conPedOrf); 
      this.setVisible(false);

    } 
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
            java.util.logging.Logger.getLogger(ALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ALogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ALogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel labelCargando;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
