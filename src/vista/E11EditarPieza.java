package vista;

import controller.Controladora;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Cliente;
import modelo.Orfebre;
import modelo.Pedido;
import modelo.Pieza;

public class E11EditarPieza extends javax.swing.JFrame {


    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pedido> listaPie1 = new ArrayList<Pedido>();
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    int id; 
    boolean collarCreado = false, anilloCreado = false, arreglados = false, anilloArreglado = false, collarArreglado = false; 
    
    public E11EditarPieza() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        panelCaracteristicas.setVisible(false);
        btnEditar.setVisible(false);
    }
    
    
    //USADO     
    E11EditarPieza(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie) {
        initComponents();
        control = new Controladora(this);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");    
        panelCaracteristicas.setVisible(false);
        btnEditar.setVisible(false);
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPieza);
    }   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        labeEditarPieza = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnAtras4 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
        labeliIdPedido = new javax.swing.JLabel();
        txtIdPieza = new javax.swing.JTextField();
        btnCheck = new javax.swing.JButton();
        panelCaracteristicas = new javax.swing.JPanel();
        jcbTipoAnillo = new javax.swing.JCheckBox();
        jcbTipoArreglo = new javax.swing.JCheckBox();
        labeliIdPedido1 = new javax.swing.JLabel();
        jcbTamano = new javax.swing.JCheckBox();
        jcbMensaje = new javax.swing.JCheckBox();
        jcbPeso = new javax.swing.JCheckBox();
        jcbMaterial = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeEditarPieza.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEditarPieza.setForeground(new java.awt.Color(0, 0, 0));
        labeEditarPieza.setText("Editar pieza: ");
        getContentPane().add(labeEditarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

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
        labeliIdPedido.setText("Id Pieza:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 90, 40));

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
        getContentPane().add(txtIdPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 140, 30));

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

        panelCaracteristicas.setForeground(new java.awt.Color(204, 204, 204));
        panelCaracteristicas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcbTipoAnillo.setText("Tipo Anillo");
        jcbTipoAnillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoAnilloActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbTipoAnillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, -1));

        jcbTipoArreglo.setText("Tipo Arreglo");
        jcbTipoArreglo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoArregloActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbTipoArreglo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 110, -1));

        labeliIdPedido1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido1.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido1.setText("Opciones para editar la pieza : ");
        panelCaracteristicas.add(labeliIdPedido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 40));

        jcbTamano.setText("Tamano ");
        jcbTamano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTamanoActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 170, -1));

        jcbMensaje.setText("Mensaje");
        jcbMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMensajeActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 170, -1));

        jcbPeso.setText("Peso");
        jcbPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPesoActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbPeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 170, -1));

        jcbMaterial.setText("Material");
        jcbMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMaterialActionPerformed(evt);
            }
        });
        panelCaracteristicas.add(jcbMaterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 90, -1));

        getContentPane().add(panelCaracteristicas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 290, 250));

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

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras4ActionPerformed
        D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza(conPedOrf, conPedClie, listaPie); 
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

    private void txtIdPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPiezaActionPerformed

    }//GEN-LAST:event_txtIdPiezaActionPerformed

    private void txtIdPiezaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyPressed

    }//GEN-LAST:event_txtIdPiezaKeyPressed

    private void txtIdPiezaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyTyped
        if (txtIdPieza.getText().length()>=6){
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null,"El Id de la pieza solo tiene un maximo de 6 digitos","ERROR",JOptionPane.ERROR_MESSAGE);
        }else{
            char car = evt.getKeyChar();
            if((car<'0' || car>'9')){
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtIdPiezaKeyTyped

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        /*   cuando se trabajen los archivos, debemos clonar una lista pedidos......de modo que podamos sacar los idPedidos que esten en ella
        y asi hacer la comprobacion para saber si existen o no un idPedido para que no se repitan */
        if (!txtIdPieza.getText().equals("")){
            int id1, cont=0;
            String txt = txtIdPieza.getText();
            this.id = Integer.parseInt(txt);
            if (conPedOrf.getListaPiezas() != null){
                for (int i = 0; i < conPedOrf.getListaPiezas().size() ; i++) {
                    id1 = conPedOrf.getListaPiezas().get(i).getIdPieza(); 
                    if (id == id1){
                        cont = 1;
                        id = id1; 
                        panelCaracteristicas.setVisible(true);
                        if (conPedOrf.getListaPiezas().get(i).getPiezaa().equalsIgnoreCase("Anillo creado")){
                            jcbMaterial.setVisible(true);
                            jcbTipoAnillo.setVisible(true);
                            jcbPeso.setVisible(true);
                            jcbTamano.setVisible(true);
                            jcbMensaje.setVisible(true);
                            jcbTipoArreglo.setVisible(false);
                            btnEditar.setVisible(true);
                            this.anilloCreado = true; 
                        }else{
                            if ( conPedOrf.getListaPiezas().get(i).getPiezaa().equalsIgnoreCase("Collar creado")){
                            jcbMaterial.setVisible(true);
                            jcbTipoAnillo.setVisible(false);
                            jcbPeso.setVisible(true);
                            jcbTamano.setVisible(true);
                            jcbMensaje.setVisible(false);
                            jcbTipoArreglo.setVisible(false);
                            btnEditar.setVisible(true);
                            this.collarCreado = true; 
                            }else{ 
                                this.arreglados = true;
                                if (conPedOrf.getListaPiezas().get(i).getPiezaa().equalsIgnoreCase("Anillo arreglado")){
                                    jcbMaterial.setVisible(false);
                                    jcbTipoAnillo.setVisible(false);
                                    jcbPeso.setVisible(false);
                                    jcbTamano.setVisible(true);
                                    jcbMensaje.setVisible(false);
                                    jcbTipoArreglo.setVisible(true);
                                    btnEditar.setVisible(true);
                                    this.anilloArreglado = true; 
                                }else{
                                    if (conPedOrf.getListaPiezas().get(i).getPiezaa().equalsIgnoreCase("Collar arreglado")){
                                        jcbMaterial.setVisible(false);
                                        jcbTipoAnillo.setVisible(false);
                                        jcbPeso.setVisible(false);
                                        jcbTamano.setVisible(true);
                                        jcbMensaje.setVisible(false);
                                        jcbTipoArreglo.setVisible(true);
                                        btnEditar.setVisible(true);
                                        this.collarArreglado = true; 
                                    }                                    
                                }
                                
                               
                            }
                        }
                            
                        break;
                    }
                }
                if (cont==0){
                    JOptionPane.showMessageDialog(null,"El Id del pedido proporcionado, no existe en el sistema. INTENTE DE NUEVO","ERROR",JOptionPane.ERROR_MESSAGE);
                    txtIdPieza.setText("");
                    System.out.println("tamano de la lista de piezas que esta en orfebre "+conPedOrf.getListaPiezas().size());
                    
                }
            }
        }
    }//GEN-LAST:event_btnCheckActionPerformed

    private void jcbTamanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTamanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTamanoActionPerformed

    private void jcbMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMensajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbMensajeActionPerformed

    private void jcbPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbPesoActionPerformed

    private void jcbMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMaterialActionPerformed

    }//GEN-LAST:event_jcbMaterialActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        if (jcbMaterial.isSelected() || jcbTipoAnillo.isSelected() || jcbPeso.isSelected() || jcbTamano.isSelected() || jcbMensaje.isSelected() || jcbTipoArreglo.isSelected()){
            boolean material = false, tipoAnillo = false, peso = false, tamano = false, mensaje = false, tipoArreglo = false; 
            if (jcbMaterial.isSelected()){
                material=true;
            }
            if (jcbTipoAnillo.isSelected()){
                tipoAnillo = true; 
            }
            if (jcbPeso.isSelected()){
                peso=true;
            }
            if (jcbTamano.isSelected()){
                tamano=true;
            }
            if (jcbMensaje.isSelected()){
                mensaje=true;
            }
            if (jcbTipoArreglo.isSelected()){
                tipoArreglo = true; 
            }
            this.id = Integer.parseInt(txtIdPieza.getText()); 
            System.out.println("id de pieza es = "+this.id);
            E1EditarPiezaCaracteristicas adelante = new E1EditarPiezaCaracteristicas(conPedOrf, conPedClie, listaPie, material, tipoAnillo, peso, tamano, mensaje, tipoArreglo, this.id, this.anilloCreado, this.collarCreado, this.arreglados, this.anilloArreglado, this.collarArreglado);
            adelante.setVisible(true);
            this.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(null,"Debe seleccionar lo que quiere editar","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void jcbTipoArregloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoArregloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoArregloActionPerformed

    private void jcbTipoAnilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoAnilloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbTipoAnilloActionPerformed

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
            java.util.logging.Logger.getLogger(E11EditarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(E11EditarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(E11EditarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(E11EditarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new E11EditarPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras4;
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JCheckBox jcbMaterial;
    private javax.swing.JCheckBox jcbMensaje;
    private javax.swing.JCheckBox jcbPeso;
    private javax.swing.JCheckBox jcbTamano;
    private javax.swing.JCheckBox jcbTipoAnillo;
    private javax.swing.JCheckBox jcbTipoArreglo;
    private javax.swing.JLabel labeEditarPieza;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JLabel labeliIdPedido1;
    private javax.swing.JPanel panelCaracteristicas;
    private javax.swing.JTextField txtIdPieza;
    // End of variables declaration//GEN-END:variables
}
