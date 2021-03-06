/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bd.SqlServerConnection;
import interfaces.InscripcionFrame;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriela
 */
public class WebSis extends javax.swing.JFrame {

    Statement state;
    
    /**
     * Creates new form WebSis
     */
    public WebSis() {
        initComponents();
        setLocationRelativeTo(null);
        try {
            state = SqlServerConnection.conectar().createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(WebSis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textArea1 = new java.awt.TextArea();
        list2 = new java.awt.List();
        ingresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codigoSis = new javax.swing.JTextPane();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        mes = new javax.swing.JComboBox<>();
        dia = new javax.swing.JComboBox<>();
        anio = new javax.swing.JComboBox<>();
        contrasenia = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane4 = new javax.swing.JTextPane();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(400, 670));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresar.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        ingresar.setForeground(new java.awt.Color(0, 0, 255));
        ingresar.setText("INGRESAR");
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 600, 177, 53));

        jScrollPane1.setViewportView(codigoSis);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 229, -1));

        jTextField1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 255));
        jTextField1.setText("CODIGO SIS:");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jTextField2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 255));
        jTextField2.setText("CONTRASE??A:");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jTextField3.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 255));
        jTextField3.setText("FECHA DE NACIMIENTO:");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jTextField4.setFont(new java.awt.Font("Wide Latin", 0, 36)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 255));
        jTextField4.setText("WEBSIS");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 301, 65));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 985, -1, -1));

        jTextField5.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 255));
        jTextField5.setText("CODIGO");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 106, -1));

        jScrollPane2.setViewportView(jTextPane3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 141, 37));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setText("Copie el c??digo que aparece en la imagen de la izquierda");
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, -1, -1));

        jButton2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 0, 50, 40));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        getContentPane().add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 160, 20));

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 160, 20));

        anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004" }));
        getContentPane().add(anio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 160, 20));
        getContentPane().add(contrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 230, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/wEBSIS.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 700));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 660));

        jScrollPane4.setViewportView(jTextPane4);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 140, -1));

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        ResultSet rs = null;
        try {
            // TODO add your handling code here:
            rs = state.executeQuery("select * from estudiantes where codigo_sis = '"+ codigoSis.getText() +"' and contrasenia = '"+ Arrays.toString(contrasenia.getPassword()) +"'");
            InscripcionFrame inscripcion = new InscripcionFrame(rs);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(WebSis.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_ingresarActionPerformed

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
            java.util.logging.Logger.getLogger(WebSis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WebSis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WebSis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WebSis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WebSis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anio;
    private java.awt.Canvas canvas1;
    private javax.swing.JTextPane codigoSis;
    private javax.swing.JPasswordField contrasenia;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JButton ingresar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextPane jTextPane3;
    private javax.swing.JTextPane jTextPane4;
    private java.awt.List list2;
    private javax.swing.JComboBox<String> mes;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
