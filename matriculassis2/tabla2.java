/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriculassis2;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ramir
 */
public class tabla2 extends javax.swing.JFrame {
    static DefaultTableModel modelo;
    static DefaultTableModel modelo2;
    /**
     * Creates new form tabla2
     */
    public tabla2() {
        initComponents();
       
        modelo = new DefaultTableModel();
        modelo.addColumn("Grupo");
        modelo.addColumn("Codigo");
        modelo.addColumn("Mateia");
        modelo.addColumn("Docente");
        this.tabla.setModel(modelo);
        
        modelo2 = new DefaultTableModel();
        modelo2.addColumn("Grupo");
        modelo2.addColumn("Codigo");
        modelo2.addColumn("Mateia");
        modelo2.addColumn("Docente");
        this.tabla2.setModel(modelo2);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnRetirar = new javax.swing.JButton();
        btnInscribirme = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        btnInscribirme.setText("Inscribirme");
        btnInscribirme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirmeActionPerformed(evt);
            }
        });

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRetirar)
                    .addComponent(btnInscribirme))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRetirar)
                .addGap(184, 184, 184)
                .addComponent(btnInscribirme)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //ESTE METODO SE ACTIVA AL HACER CLICK EN INSCRIBIRSE Y CADA QUE HAGO CLICK EN UNA FILA DE LAS MATERIAS HABILITADAS LO AGREGA A LA TABLA DE ARRIBA
    //PERO SERIA MEJOR SI SOLO SE AGREGA AL HACER CLIK EN INSCRIBIRSE
    private void btnInscribirmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirmeActionPerformed
        int filax;
        int codMateria=-1;
        tabla.addMouseListener(new MouseAdapter() 
   {
      public void mouseClicked(MouseEvent e) 
      { 
         String [] v = new String [4];
         int fila = tabla.rowAtPoint(e.getPoint());
          setCodMat((String)modelo.getValueAt(fila, 1));
         if(fila> -1){
             for (int i = 0; i < 4; i++) {
                 v[i]=(String)modelo.getValueAt(fila,i);
             }
         }
          aniadirATabla2(v);
            
      }
      
   });
        //String [] x = modelo.getDataVector();
        System.out.println("holaa");
        
    }//GEN-LAST:event_btnInscribirmeActionPerformed

    
    //ESTE LO QUIERO BORRAR PERO NO SE COMO
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
       /*
        tabla.addMouseListener(new MouseAdapter() 
   {
      public void mouseClicked(MouseEvent e) 
      {
         int fila = tabla.rowAtPoint(e.getPoint());
         //JOptionPane.showMessageDialog(tabla2, fila);
         int columna = tabla.columnAtPoint(e.getPoint());
         if ((fila > -1) && (columna > -1))
            System.out.println(modelo.getValueAt(fila,columna));
            
      }
      
   });
        */
        // TODO add your handlcing code here:
    }//GEN-LAST:event_tablaMouseClicked

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        try (Connection con = getCon();
            CallableStatement cstmt = con.prepareCall("select * from materias");){
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("nombre_materia"));
                
            }
            // TODO add your handling code here:
            //Connection conexion = getCon();
            
        } catch (SQLServerException ex) {
            Logger.getLogger(tabla2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(tabla2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRetirarActionPerformed

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
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tabla2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabla2().setVisible(true);
                matDisp();
            }
        });
    }
    void aniadirATabla2(String [] i){
        modelo2.addRow(i);
    }
    String codMMat="";
    void setCodMat(String d){
        codMMat=d;
    }
    void mostrarDatos(String[] i){
        for (String string : i) {
            System.out.print(string+" - ");
        }
        System.out.println("");
    }
    Connection getCon() throws SQLServerException{
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("ramiro");
        ds.setPassword("ramiro2021");
        ds.setServerName("localhost\\SQLEXPRESS");
        ds.setPortNumber(Integer.parseInt("1433"));
        ds.setDatabaseName("matriculas");
        Connection cnn= ds.getConnection();
        return cnn;
        
    }
    /*
    int getRango(int [] en){
        int res=-1;
        int may=0,men=10000;
        //int pos=nomMatPrueba.indexOf(nom);
        //ArrayList<Integer>a=prueba.get(pos);
        for (Integer integer : en) {
            if(may<integer) may=integer;
        }
        for (Integer integer1 : en) {
            if(men>integer1) men=integer1;
            
        }
        System.out.println(may+"  "+men);
        res=may-men;
        return res;
    }
    */
    static void matDisp(){
       //ArrayList<String> res=new ArrayList<>();
       String [] info=new String[4];
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("ramiro");
        ds.setPassword("ramiro2021");
        ds.setServerName("localhost\\SQLEXPRESS");
        ds.setPortNumber(Integer.parseInt("1433"));
        ds.setDatabaseName("matriculas");

        try (Connection con = ds.getConnection();
            CallableStatement cstmt = con.prepareCall(materiasDisp);) {
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                //System.out.println("materia: " + rs.getString("NOMBRE_MATERIA"));
                //res.add(rs.getString("numero_grupo"));
                info[0]=rs.getString("numero_grupo");
                info[1]=rs.getString("codigo_materia");
                info[2]=rs.getString("nombre_materia");
                info[3]=rs.getString("nombre_docente");
                modelo.addRow(info);
                //modelo.removeRow(1);
                
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    static String materiasDisp="select m.CODIGO_MATERIA,CODIGO_DOCETE,NUMERO_GRUPO into #table1\n" +
"from MATERIAS m\n" +
"inner join GRUPO g on  m.codigo_materia=g.codigo_materia\n" +
"\n" +
"SELECT m.CODIGO_MATERIA,m.NOMBRE_MATERIA into #table2\n" +
"FROM MATERIAS M\n" +
"INNER JOIN (SELECT	M.CODIGO_MATERIA\n" +
"FROM	MATERIAS M\n" +
"\n" +
"EXCEPT\n" +
"\n" +
"SELECT	MA.CODIGO_MATERIA\n" +
"FROM	MATERIAS_APROBADAS MA\n" +
"INNER	JOIN MATERIAS   M ON  MA.CODIGO_MATERIA=M.CODIGO_MATERIA) RES ON RES.CODIGO_MATERIA=M.CODIGO_MATERIA\n" +
"\n" +
"select t1.CODIGO_MATERIA,t2.nombre_materia,t1.CODIGO_DOCETE,t1.numero_grupo into #table3\n" +
"from #table1 t1\n" +
"inner join #table2 t2 on t1.CODIGO_MATERIA=t2.codigo_materia\n" +
"\n" +
"select t3.numero_grupo,t3.codigo_materia,t3.nombre_materia,d.nombre_docente \n" +
"from #table3 t3 inner join DOCENTES d on t3.codigo_docete=d.CODIGO_DOCETE drop table #table1\n" +
"drop table #table2\n" +
"drop table #table3";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribirme;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}

    /*
    int [] consulta(){
        int [] res=new int [2];
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("ramiro");
        ds.setPassword("ramiro2021");
        ds.setServerName("localhost\\SQLEXPRESS");
        ds.setPortNumber(Integer.parseInt("1433"));
        ds.setDatabaseName("matriculas");

        try (Connection con = ds.getConnection();
            CallableStatement cstmt = con.prepareCall(materiasDisp);) {
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                //System.out.println("materia: " + rs.getString("NOMBRE_MATERIA"));
                //res.add(rs.getString("numero_grupo"));
                info[0]=rs.getString("numero_grupo");
                info[1]=rs.getString("codigo_materia");
                info[2]=rs.getString("nombre_materia");
                info[3]=rs.getString("nombre_docente");
                modelo.addRow(info);
                
            }
            
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    */
