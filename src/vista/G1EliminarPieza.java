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

public class G1EliminarPieza extends javax.swing.JFrame {

    Controladora control;
    Orfebre conPedOrf;
    Cliente conPedClie;
    ArrayList<Pedido> conPed2 = new ArrayList<Pedido>(); 
    ArrayList<Pieza> listaPieza;
    ArrayList<Pieza> listaPieza2;
    Pieza piezaEliminar; 
    int id;  
    DaoPedidoXml datosPed = new DaoPedidoXml();
    
    public G1EliminarPieza() {
        initComponents();
        control = new Controladora(this);
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
    }
    
//USADO   
    public G1EliminarPieza(Orfebre conPedOrf, Cliente conPedClie, ArrayList<Pieza> listaPieza) {
        initComponents();
        control = new Controladora(this);
        this.listaPieza = listaPieza;
        this.conPedOrf = conPedOrf; 
        this.conPedClie = conPedClie;
        control.iniciaVentana(this,  "src/imagenes/diamante.png");  
        TextPrompt prueba = new TextPrompt("Obligatorio", txtIdPieza);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        btnSalir1 = new javax.swing.JButton();
        labeEliminarPieza = new javax.swing.JLabel();
        labelNombreEmpresa = new javax.swing.JLabel();
        btnAtras1 = new javax.swing.JButton();
        labelFondo = new javax.swing.JLabel();
        btnSalir2 = new javax.swing.JButton();
        labeEliminarPieza1 = new javax.swing.JLabel();
        labelNombreEmpresa1 = new javax.swing.JLabel();
        btnAtras2 = new javax.swing.JButton();
        labelFondo1 = new javax.swing.JLabel();
        jDialog2 = new javax.swing.JDialog();
        btnSalir3 = new javax.swing.JButton();
        labeEliminarPieza2 = new javax.swing.JLabel();
        labelNombreEmpresa2 = new javax.swing.JLabel();
        btnAtras3 = new javax.swing.JButton();
        btnEliminarPieza = new javax.swing.JButton();
        txtIdPieza = new javax.swing.JTextField();
        labeliIdPedido = new javax.swing.JLabel();
        labelFondo2 = new javax.swing.JLabel();

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

        labeEliminarPieza.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEliminarPieza.setForeground(new java.awt.Color(0, 0, 0));
        labeEliminarPieza.setText("Eliminar pieza: ");

        labelNombreEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N

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

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N

        btnSalir2.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir2.setContentAreaFilled(false);
        btnSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir2ActionPerformed(evt);
            }
        });

        labeEliminarPieza1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEliminarPieza1.setForeground(new java.awt.Color(0, 0, 0));
        labeEliminarPieza1.setText("Eliminar pieza: ");

        labelNombreEmpresa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N

        btnAtras2.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras2.setContentAreaFilled(false);
        btnAtras2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras2ActionPerformed(evt);
            }
        });

        labelFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(labeEliminarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(470, 470, 470)
                            .addComponent(labelNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(470, 470, 470)
                            .addComponent(labelNombreEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(labeEliminarPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(550, 550, 550)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(530, 530, 530)
                            .addComponent(btnAtras1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labeEliminarPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(labelNombreEmpresa1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(420, 420, 420)
                            .addComponent(btnAtras2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(550, 550, 550)
                            .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(labeEliminarPieza1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelFondo1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
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

        btnSalir3.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Pequena.png"))); // NOI18N
        btnSalir3.setContentAreaFilled(false);
        btnSalir3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSalir3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar Grande.png"))); // NOI18N
        btnSalir3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 90, 80));

        labeEliminarPieza2.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        labeEliminarPieza2.setForeground(new java.awt.Color(0, 0, 0));
        labeEliminarPieza2.setText("Eliminar pieza: ");
        getContentPane().add(labeEliminarPieza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 310, 120));

        labelNombreEmpresa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Nombre Empresa.png"))); // NOI18N
        getContentPane().add(labelNombreEmpresa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 190, 90));

        btnAtras3.setBackground(new java.awt.Color(153, 153, 153));
        btnAtras3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAtras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras Pequena.png"))); // NOI18N
        btnAtras3.setContentAreaFilled(false);
        btnAtras3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Atras grande.png"))); // NOI18N
        btnAtras3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtras3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 130, 110));

        btnEliminarPieza.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminarPieza.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminarPieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoPequeno.png"))); // NOI18N
        btnEliminarPieza.setText("Eliminar");
        btnEliminarPieza.setContentAreaFilled(false);
        btnEliminarPieza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPieza.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarPieza.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoGrande.png"))); // NOI18N
        btnEliminarPieza.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RemoverPedidoGrande.png"))); // NOI18N
        btnEliminarPieza.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEliminarPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPiezaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 170, 190));

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
        getContentPane().add(txtIdPieza, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 140, 30));

        labeliIdPedido.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        labeliIdPedido.setForeground(new java.awt.Color(0, 0, 0));
        labeliIdPedido.setText("Id Pieza a eliminar:");
        getContentPane().add(labeliIdPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 40));

        labelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoProyecto.PNG"))); // NOI18N
        getContentPane().add(labelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir1ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir1ActionPerformed

    private void btnAtras1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras1ActionPerformed
        D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras1ActionPerformed

    private void btnSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir2ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir2ActionPerformed

    private void btnAtras2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras2ActionPerformed
        D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza();
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras2ActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        int respuesta= JOptionPane.showConfirmDialog(null,"Seguro quiere salir del sistema?","Salir",JOptionPane.YES_NO_OPTION);
        if (respuesta==0){
            control.llenarXMLConPedido0(conPedOrf);  
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void btnAtras3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtras3ActionPerformed
        D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza(conPedOrf, conPedClie, listaPieza); 
        atras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtras3ActionPerformed

    private void btnEliminarPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPiezaActionPerformed
        if (!txtIdPieza.equals("")){
            int cont=0;
            int respuesta= JOptionPane.showConfirmDialog(null,"Seguro desea eliminar la pieza N° "+txtIdPieza.getText()+" ?","Eliminar Pedido",JOptionPane.YES_NO_OPTION);
            if (respuesta==0){
                
                String id1 = txtIdPieza.getText();
                this.id = Integer.parseInt(id1);
                control.elimiarPiezasXml(datosPed,this.id,this.conPedOrf); 
                Pieza pie=null;
                ArrayList<Pedido> listaPed;
                listaPed = conPedOrf.getListaPedidosOrfebre();
                ArrayList<Pieza> listaPie;
                listaPie = conPedOrf.getListaPiezas(); 
                for(int i=0; i < listaPie.size();i++)//Lavadora lav: lista  //Para saber si el costo o el abono es mayor que el otro, para comprobar que cuando se edite...se siga cumpliendo lo mismo
                {
                    if (this.id == listaPie.get(i).getIdPieza()){
                        pie = listaPie.get(i);
                        cont = 1;
                        break;
                    }
                }
                if (cont == 1){
                    for (int j = 0; j < listaPed.size(); j++) {
                        Pedido pedido = new Pedido(); 
                        pedido = listaPed.get(j); 
                        Pieza pie2 = null; 
                        ArrayList<Pieza> listaPie2;
                        listaPie2 = pedido.getListaPiezas();
                        for (int x = 0; x < listaPie2.size(); x++) {
                            if (this.id == listaPie2.get(x).getIdPieza()){
                                pie2 = listaPie2.get(x); 
                                listaPie2.remove(pie2); 
                                break; 
                            }    
                        }
                    }                   
                    conPedOrf.eliminarPie(pie);                  
                    
                    JOptionPane.showMessageDialog(null,"Se ha eliminado la pieza con exito","Eliminar Pedido",JOptionPane.INFORMATION_MESSAGE);
                    D1PantallaOpcionesPieza atras = new D1PantallaOpcionesPieza(conPedOrf, conPedClie, listaPieza);
                    this.setVisible(false);
                    atras.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null,"El IdPieza no existe en el sistema INTENTE DE NUEVO","Error",JOptionPane.ERROR_MESSAGE);
                    txtIdPieza.setText("");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarPiezaActionPerformed

    private void txtIdPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPiezaActionPerformed

    }//GEN-LAST:event_txtIdPiezaActionPerformed

    private void txtIdPiezaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyPressed

    }//GEN-LAST:event_txtIdPiezaKeyPressed

    private void txtIdPiezaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdPiezaKeyTyped
        if (txtIdPieza.getText().equals("") && txtIdPieza.getText().length()>=6){
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
            java.util.logging.Logger.getLogger(G1EliminarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(G1EliminarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(G1EliminarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(G1EliminarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new G1EliminarPieza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras1;
    private javax.swing.JButton btnAtras2;
    private javax.swing.JButton btnAtras3;
    private javax.swing.JButton btnEliminarPieza;
    private javax.swing.JButton btnSalir1;
    private javax.swing.JButton btnSalir2;
    private javax.swing.JButton btnSalir3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JLabel labeEliminarPieza;
    private javax.swing.JLabel labeEliminarPieza1;
    private javax.swing.JLabel labeEliminarPieza2;
    private javax.swing.JLabel labelFondo;
    private javax.swing.JLabel labelFondo1;
    private javax.swing.JLabel labelFondo2;
    private javax.swing.JLabel labelNombreEmpresa;
    private javax.swing.JLabel labelNombreEmpresa1;
    private javax.swing.JLabel labelNombreEmpresa2;
    private javax.swing.JLabel labeliIdPedido;
    private javax.swing.JTextField txtIdPieza;
    // End of variables declaration//GEN-END:variables
}
