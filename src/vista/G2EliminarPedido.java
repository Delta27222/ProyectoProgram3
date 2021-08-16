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

public class G2EliminarPedido extends javax.swing.JFrame {
    
    
    Orfebre conPedOrf;
    Cliente conPedClie;
    Controladora control;
    ArrayList<Pedido> listaPie1 = new ArrayList<Pedido>();
    ArrayList<Pieza> listaPie = new ArrayList<Pieza>();
    int id;  
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
    public G2EliminarPedido() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
//USADO
    G2EliminarPedido(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPie) {
        initComponents();
        control = new Controladora(this);
        this.conPedOrf = conPedOrf;
        this.conPedClie = conPedClie;
        this.listaPie = listaPie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");    
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPedido);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        btnEliminarPedido = new javax.swing.JButton();
        txtIdPedido = new javax.swing.JTextField();
        labeliIdPedido = new javax.swing.JLabel();
        labeEliminarPedido = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        btnSalir1 = new javax.swing.JButton();
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

        btnEliminarPedido.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarPedido.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoPequeno.png"))); // NOI18N
        btnEliminarPedido.setText("Eliminar");
        btnEliminarPedido.setContentAreaFilled(false);
        btnEliminarPedido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarPedido.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoGrande.png"))); // NOI18N
        btnEliminarPedido.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoGrande.png"))); // NOI18N
        btnEliminarPedido.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, 190));

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
        getContentPane().add(txtIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 30));

        labeliIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido.setText("Id Pedido a eliminar:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 40));

        labeEliminarPedido.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEliminarPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeEliminarPedido.setText("Eliminar pedido: ");
        getContentPane().add(labeEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

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
        getContentPane().add(btnAtras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 110));

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
        getContentPane().add(btnSalir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 90, 80));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie);
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras1ActionPerformed

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
        if (txtIdPedido.getText().equals("") && txtIdPedido.getText().length()>=6){
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

    private void btnEliminarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoActionPerformed

        if (!txtIdPedido.equals("")&& !txtIdPedido.getText().equals("0")){
            int cont=0;
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea eliminar el Pedido N° "+txtIdPedido.getText()+" ?","Eliminar Pedido",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
                String id1 = txtIdPedido.getText(); 
                this.id = Integer.parseInt(id1); 
                Pedido ped=null;  
                ArrayList<Pedido> listaPed; 
                listaPed = conPedOrf.getListaPedidosOrfebre();
                for(int i=0; i < listaPed.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mismo
                {
                    if (this.id==listaPed.get(i).getIdPedido()){
                        ped = listaPed.get(i);
                        cont = 1; 
                        break; 
                    } 
                }
                if (cont == 1){
                    //FUNCION PARA ELIMINAR EL PEDIDO DE LA LISTA DE PEDIDOS DEL ORFEBRE 
                    conPedOrf.eliminarPed(ped);  
                    //FUNCION PARA BUSACR EL PEDIDO QUE SE QUIERE ELIMINAR DENTRO DEL XML  
                    Pedido pedidoEliminar  = datosPed.buscarPedido(this.id); 
                     // si devuelve el pedido, lo elimina del XML, sinomuestra un mensaje en pantalla (como ya se compureba que el pedido existe desde el inicio, siempre sera encontrado)
                    if (pedidoEliminar == null) {
                        JOptionPane.showMessageDialog(null, "Pedido no existente", "ID PEDIDO no encontrado", JOptionPane.ERROR_MESSAGE);
                    }
                    else{   
                        datosPed.borrarPedido(this.id);                        
                    }  
                    JOptionPane.showMessageDialog(null,"Se ha eliminado el pedido con exito","Eliminar Pedido",JOptionPane.INFORMATION_MESSAGE);      
                    D2PantallaOpcionesPedido atras = new D2PantallaOpcionesPedido(conPedOrf, conPedClie, listaPie);
                    this.setVisible(false);
                    atras.setVisible(true);                      
                }else{
                    JOptionPane.showMessageDialog(null,"El IdPedido no existe en el sistema INTENTE DE NUEVO","Error",JOptionPane.ERROR_MESSAGE);  
                    txtIdPedido.setText("");
                }
            }      
        }else{
            txtIdPedido.setText("");
        }
    }//GEN-LAST:event_btnEliminarPedidoActionPerformed

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
            java.util.logging.Logger.getLogger(G2EliminarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G2EliminarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G2EliminarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G2EliminarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G2EliminarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel labeEliminarPedido;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JTextField txtIdPedido;
    // End of variables declaration//GEN-END:variables
}
