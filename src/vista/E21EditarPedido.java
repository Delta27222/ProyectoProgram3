package vista;

import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class E21EditarPedido extends javax.swing.JFrame {

    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pedido> listaPie1 = new ArrayList<Pedido>();
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    int id; 
    
    public E21EditarPedido() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelEditar.setVisible(false);
        btnEditar.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }
   //USADO 
    E21EditarPedido(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie) {
        initComponents();
        control = new Controladora(this);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");    
        panelEditar.setVisible(false);
        btnEditar.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        btnEditar = new javax.swing.JButton();
        panelEditar = new javax.swing.JPanel();
        labeliIdPedido1 = new javax.swing.JLabel();
        jcbAbono = new javax.swing.JCheckBox();
        jcbFechas = new javax.swing.JCheckBox();
        jcbCosto = new javax.swing.JCheckBox();
        jcbCedulaCliente = new javax.swing.JCheckBox();
        btnCheck = new javax.swing.JButton();
        txtIdPedido = new javax.swing.JTextField();
        labeliIdPedido = new javax.swing.JLabel();
        labeEditarPedido = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditar.setBackground(new java.awt.Color(153, 153, 153));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarPequeno.png"))); // NOI18N
        btnEditar.setText("Editar ");
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarGrnade.png"))); // NOI18N
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarGrnade.png"))); // NOI18N
        btnEditar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 180, 230));

        panelEditar.setForeground(new java.awt.Color(204, 204, 204));
        panelEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeliIdPedido1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido1.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido1.setText("Opciones para editar del pedido: ");
        panelEditar.add(labeliIdPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 40));

        jcbAbono.setText("Abono");
        jcbAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAbonoActionPerformed(evt);
            }
        });
        panelEditar.add(jcbAbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, -1));

        jcbFechas.setText("Fechas");
        jcbFechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbFechasActionPerformed(evt);
            }
        });
        panelEditar.add(jcbFechas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, -1));

        jcbCosto.setText("Costo");
        jcbCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCostoActionPerformed(evt);
            }
        });
        panelEditar.add(jcbCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, -1));

        jcbCedulaCliente.setText("Cedula Cliente ");
        jcbCedulaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCedulaClienteActionPerformed(evt);
            }
        });
        panelEditar.add(jcbCedulaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 170, -1));

        getContentPane().add(panelEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 240));

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

        labeliIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido.setText("Id Pedido:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 40));

        labeEditarPedido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEditarPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeEditarPedido.setText("Editar pedido: ");
        getContentPane().add(labeEditarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 190, 90));

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
        getContentPane().add(btnAtras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 130, 110));

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
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 510, 90, 80));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 610));

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
                        cont = 1;
                        this.id = conPedOrf.getListaPedidosOrfebre().get(i).getIdPedido();
                        panelEditar.setVisible(true);
                        btnEditar.setVisible(true);
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

    private void jcbCedulaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCedulaClienteActionPerformed

    }//GEN-LAST:event_jcbCedulaClienteActionPerformed

    private void jcbAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAbonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAbonoActionPerformed

    private void jcbFechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbFechasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbFechasActionPerformed

    private void jcbCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCostoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jcbCedulaCliente.isSelected() || jcbCosto.isSelected() || jcbAbono.isSelected() || jcbFechas.isSelected() ){
            boolean cedula=false, costo=false, abono=false, fechas=false;  
            if (jcbCedulaCliente.isSelected()){
                cedula=true; 
            }        
            if (jcbCosto.isSelected()){
                costo=true; 
            }
            if (jcbAbono.isSelected()){
                abono=true; 
            }
            if (jcbFechas.isSelected()){
                fechas=true; 
            }           
                E2EditarPedidoCaracteristicas adelante = new E2EditarPedidoCaracteristicas(conPedOrf, conPedClie, listaPie, cedula, costo, abono, fechas, this.id);
                adelante.setVisible(true);
                this.setVisible(false);       
        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar lo que quiere editar","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

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
            java.util.logging.Logger.getLogger(E21EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E21EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E21EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E21EditarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new E21EditarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JCheckBox jcbAbono;
    private javax.swing.JCheckBox jcbCedulaCliente;
    private javax.swing.JCheckBox jcbCosto;
    private javax.swing.JCheckBox jcbFechas;
    private javax.swing.JLabel labeEditarPedido;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JLabel labeliIdPedido1;
    private javax.swing.JPanel panelEditar;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
