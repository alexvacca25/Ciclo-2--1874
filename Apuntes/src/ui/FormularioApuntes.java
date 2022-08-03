/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;


import controller.GestionApuntes;
import controller.utilidades;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import models.Apunte;

/**
 *
 * @author ALEX
 */
public class FormularioApuntes extends javax.swing.JFrame {

    public DefaultTableModel filas;
    
    /**
     * Creates new form FormularioApuntes
     */
    public FormularioApuntes() {
        initComponents();
        
        String[] titulos = {"Id","Descripcion"};
        filas = new DefaultTableModel(null, titulos);
        tblApuntes.setModel(filas);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtID = new javax.swing.JTextField();
        txtDetalle = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblApuntes = new javax.swing.JTable();
        txtMensajes = new javax.swing.JLabel();
        txtModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Detalle");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Agenda de Actividades");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdicionarMouseClicked(evt);
            }
        });

        tblApuntes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblApuntes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblApuntesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblApuntes);

        txtModificar.setText("Modificar");
        txtModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtModificarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addComponent(txtMensajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdicionar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtModificar)
                            .addGap(209, 209, 209)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtDetalle))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(94, 94, 94)
                                    .addComponent(jLabel2)))
                            .addGap(209, 209, 209))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(txtModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMensajes, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdicionarMouseClicked
        // TODO add your handling code here:
        
       String id = txtID.getText();
       String detalle = txtDetalle.getText();
       
       int idvalidado=utilidades.validarEnteros(id);
       
       String mensaje = GestionApuntes.cargarDatos(idvalidado, detalle);
       txtMensajes.setText(mensaje);
       
       llenarTabla();
        
        
    }//GEN-LAST:event_btnAdicionarMouseClicked

    private void tblApuntesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblApuntesMouseClicked
        // TODO add your handling code here:
        
        if(evt.getClickCount()==1){
            JTable seleccion= (JTable) evt.getSource();
            txtID.setText(seleccion.getModel().getValueAt(seleccion.getSelectedRow(), 0).toString());
            txtDetalle.setText(seleccion.getModel().getValueAt(seleccion.getSelectedRow(), 1).toString());
            btnAdicionar.setEnabled(false);
            txtID.setEnabled(false);
            
        }
        
    }//GEN-LAST:event_tblApuntesMouseClicked

    private void txtModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtModificarMouseClicked
        // TODO add your handling code here:
        
       String id = txtID.getText();
       String detalle = txtDetalle.getText();
       
       int idvalidado=utilidades.validarEnteros(id);
       
       String mensaje = GestionApuntes.modificarDatos(idvalidado, detalle);
       txtMensajes.setText(mensaje);
       
       llenarTabla();
       
       txtID.setEnabled(true);
       btnAdicionar.setEnabled(true);
        
    }//GEN-LAST:event_txtModificarMouseClicked

    
    public void llenarTabla(){
        
        filas.setRowCount(0);
        
        for(Apunte item:GestionApuntes.listaApuntes){
            Object[] apunte={item.getId(),item.getDetalle()};
            filas.addRow(apunte);
        }
        
    }
    
    public void limpiarDatos(){
        
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
            java.util.logging.Logger.getLogger(FormularioApuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioApuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioApuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioApuntes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioApuntes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblApuntes;
    private javax.swing.JTextField txtDetalle;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtMensajes;
    private javax.swing.JButton txtModificar;
    // End of variables declaration//GEN-END:variables
}
