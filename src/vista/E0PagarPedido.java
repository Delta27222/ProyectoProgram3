package vista;

import Persistencia.DaoPedidoXml;
import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class E0PagarPedido extends javax.swing.JFrame {


    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pedido> listaPie1 = new ArrayList<Pedido>();
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    int id, restante; 
    Pedido pedidoUso = new Pedido(); 
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
    public E0PagarPedido() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        btnPagar.setVisible(false);
    }
    
    
    //USADO     
    E0PagarPedido(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie) {
        initComponents();
        control = new Controladora(this, txtIdPedido, txtIdAbonoNuevo);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");    
        btnPagar.setVisible(false);
        labelAbonoNuevo.setVisible(false);
        txtIdAbonoNuevo.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        labeEditarPieza = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        txtIdAbonoNuevo = new javax.swing.JTextField();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        labeliIdPedido = new javax.swing.JLabel();
        txtIdPedido = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        labelAbonoNuevo = new javax.swing.JLabel();
        labelRestante = new javax.swing.JLabel();
        labelCosto = new javax.swing.JLabel();
        labelAbono = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeEditarPieza.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEditarPieza.setForeground(new java.awt.Color(0, 0, 0));
        labeEditarPieza.setText("Pagar Pedido:");
        getContentPane().add(labeEditarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        txtIdAbonoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAbonoNuevoActionPerformed(evt);
            }
        });
        txtIdAbonoNuevo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdAbonoNuevoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdAbonoNuevoKeyTyped(evt);
            }
        });
        getContentPane().add(txtIdAbonoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 140, 30));

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

        labeliIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido.setText("Id Pedido:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 40));

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

        btnPagar.setBackground(new java.awt.Color(153, 153, 153));
        btnPagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PagarPeuqeno1.png"))); // NOI18N
        btnPagar.setText("Pagar");
        btnPagar.setContentAreaFilled(false);
        btnPagar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPagar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPagar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PagaraGrande1.png"))); // NOI18N
        btnPagar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PagaraGrande1.png"))); // NOI18N
        btnPagar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, 180, 230));

        labelAbonoNuevo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAbonoNuevo.setForeground(new java.awt.Color(0, 0, 0));
        labelAbonoNuevo.setText("Nuevo Abono: ");
        getContentPane().add(labelAbonoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 40));

        labelRestante.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelRestante.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelRestante, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 220, 40));

        labelCosto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelCosto.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 220, 40));

        labelAbono.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        labelAbono.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(labelAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 220, 40));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie); 
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

    private void txtIdPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPedidoActionPerformed

    }//GEN-LAST:event_txtIdPedidoActionPerformed

    private void txtIdPedidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyPressed

    }//GEN-LAST:event_txtIdPedidoKeyPressed

    private void txtIdPedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPedidoKeyTyped
        if (txtIdPedido.getText().length()>=6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id de la pieza solo tiene un maximo de 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtIdPedidoKeyTyped

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
       //Comprobamos que si existe un PEDIDO con el mismo IdPedido
        if (!txtIdPedido.getText().equals("") && !txtIdPedido.getText().equals("0")){

            int id, id1, cont=0;
            String txt = txtIdPedido.getText();
            id = Integer.parseInt(txt);
            if (conPedOrf.getListaPedidosOrfebre() != null){
                for (int i = 0; i < conPedOrf.getListaPedidosOrfebre().size(); i++) {
                    id1 = conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido();
                    if (id == id1){
                        Pedido pedidoAPagar = conPedOrf.getListaPedidosOrfebre().get(i); 
                        this.pedidoUso = pedidoAPagar; 
                        if (this.pedidoUso.getAbonoInicial() == this.pedidoUso.getCostoTotal()){
                            JOptionPane.showMessageDialog(null,"Ya esta pago el Pedido, el abono = "+this.pedidoUso.getAbonoInicial()+" es igual al costo = "+this.pedidoUso.getCostoTotal(),"ERROR",JOptionPane.ERROR_MESSAGE);
                            D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie);
                            atras.setVisible(true);
                            this.setVisible(false);
                        }            
                        txtIdAbonoNuevo.setVisible(true);
                        labelAbonoNuevo.setVisible(true);
                        labelCosto.setText("Costo Total: "+pedidoAPagar.getCostoTotal());
                        labelAbono.setText("Abonado hasta ahora: "+pedidoAPagar.getAbonoInicial());
                        labelRestante.setText("Restante: "+(pedidoAPagar.getCostoTotal()- pedidoAPagar.getAbonoInicial()));
                        this.restante = pedidoAPagar.getCostoTotal()- pedidoAPagar.getAbonoInicial(); 
                        btnPagar.setVisible(true);
                        cont = 1;
                        this.id = conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido();                       
                        break;
                    }
                }
                if (cont==0){
                    JOptionPane.showMessageDialog(null,"El Id del pedido proporcionado, no existe en el sistema. INTENTE DE NUEVO","ERROR",JOptionPane.ERROR_MESSAGE);
                    txtIdPedido.setText("");
                }
            }       
        }else{
            txtIdPedido.setText("");
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (!txtIdAbonoNuevo.getText().equals("") && !txtIdAbonoNuevo.getText().equals("0") ){
            int abonoNuevo = Integer.parseInt(txtIdAbonoNuevo.getText()); 
            if ( abonoNuevo <= this.restante ){    
                int abonoViejo = this.pedidoUso.getAbonoInicial(); 
                this.pedidoUso.setAbonoInicial(abonoNuevo+abonoViejo);
                datosPed.actualizarPedido(this.pedidoUso, conPedOrf, 1);           
                JOptionPane.showMessageDialog(null,"Se a Agregado el nuevo abono con EXITO!!","Listo",JOptionPane.INFORMATION_MESSAGE);
                D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie);
                atras.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null,"El abono no puede ser mayor que el costo, INTENTE DE NUEVO","ERROR",JOptionPane.ERROR_MESSAGE);
                txtIdAbonoNuevo.setText("");
            }                  
        }else{
            txtIdAbonoNuevo.setText("");
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtIdAbonoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAbonoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAbonoNuevoActionPerformed

    private void txtIdAbonoNuevoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAbonoNuevoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAbonoNuevoKeyPressed

    private void txtIdAbonoNuevoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdAbonoNuevoKeyTyped
        if (txtIdPedido.getText().length()>=6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El abono tiene un maximo de 6 caracteres","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtIdAbonoNuevoKeyTyped

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
            java.util.logging.Logger.getLogger(E0PagarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E0PagarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E0PagarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E0PagarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E0PagarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel labeEditarPieza;
    private javax.swing.JLabel labelAbono;
    private javax.swing.JLabel labelAbonoNuevo;
    private javax.swing.JLabel labelCosto;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labelRestante;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JTextField txtIdAbonoNuevo;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
