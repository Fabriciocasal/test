
package jframearraylist;

import java.util.ArrayList;

public class FrmArreyList extends javax.swing.JFrame {
  //CREE DOS LISTAS
     ArrayList nombres = new ArrayList();
     ArrayList apellidos = new ArrayList();
     ArrayList edades = new ArrayList();

    //INSTANCIE LA CLASE PRO 
 
   Programacion pro = new Programacion(nombres, apellidos , edades) {};
   

    public FrmArreyList(){
    initComponents();
   
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnmodificar = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        txtdni = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtedad = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaaatos = new javax.swing.JTextArea();
        btnIngresar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        btnlim = new javax.swing.JButton();
        txtEdad = new javax.swing.JTextField();

        checkbox1.setLabel("checkbox1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        btnmodificar.setBackground(new java.awt.Color(0, 131, 135));
        btnmodificar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnmodificar.setForeground(new java.awt.Color(0, 0, 0));
        btnmodificar.setText("Modificar");

        jLabel4.setText("Dni:");

        txtedad.setEditable(false);
        txtedad.setBackground(new java.awt.Color(204, 204, 204));
        txtedad.setForeground(new java.awt.Color(0, 0, 0));
        txtedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtedadActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Edad:");

        txtnombre.setBackground(new java.awt.Color(204, 204, 204));

        txtareaaatos.setColumns(20);
        txtareaaatos.setRows(5);
        jScrollPane1.setViewportView(txtareaaatos);

        btnIngresar.setBackground(new java.awt.Color(153, 153, 153));
        btnIngresar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(0, 0, 0));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(153, 153, 153));
        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(153, 153, 153));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 153, 153));
        btnSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(0, 0, 0));
        btnSalir.setText("Salir ");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel3.setText("Apellido:");

        txtapellido.setBackground(new java.awt.Color(204, 204, 204));

        btnlim.setBackground(new java.awt.Color(153, 153, 153));
        btnlim.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnlim.setForeground(new java.awt.Color(0, 0, 0));
        btnlim.setText("Limpiar");
        btnlim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimActionPerformed(evt);
            }
        });

        txtEdad.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(btnlim, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)))
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdad)
                            .addComponent(txtapellido)
                            .addComponent(txtnombre))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnIngresar)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(26, 26, 26)
                        .addComponent(btnlim)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir)
                        .addGap(0, 32, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
    
        pro.IngresarNombre(this.txtnombre.getText());
        pro.IngresarApellido(this.txtapellido.getText());
        pro.IngresarEdad(Integer.parseInt(txtEdad.getText()));
     
        
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        txtareaaatos.append("\nMOSTRAR INFORMACION: \n"+"\nNombre: " + pro.BuscarNombre(this.txtnombre.getText()));
        txtareaaatos.append("\nApellido: " + String.valueOf(pro.BuscarApellido(this.txtapellido.getText())));
        txtareaaatos.append("\nEdad: " + String.valueOf(pro.BuscarEdad(Integer.parseInt(txtEdad.getText()))));
    
        
       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       pro.EliminarNombre(this.txtnombre.getText());
       pro.EliminarApellido(this.txtapellido.getText());
       pro.EliminarEdad(Integer.parseInt(txtEdad.getText()));
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnlimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimActionPerformed
        //LIMPIA 
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtEdad.setText(null);
        
        
    }//GEN-LAST:event_btnlimActionPerformed

    private void txtedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtedadActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmArreyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmArreyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmArreyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmArreyList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmArreyList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnlim;
    private javax.swing.JButton btnmodificar;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextArea txtareaaatos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
