/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cost;

import Model.Reports;
import Model.Stocks;
import com.teknikindustries.bulksms.SMS;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;
///import net.proteanit.sql.DbUtils;
import net.proteanit.sql.DbUtils;


public class Description1 extends javax.swing.JInternalFrame {

   //db connection setup
  Connection con =null;
 PreparedStatement pst = null;
 ResultSet rs = null;
   // int d = 0;
    
    public Description1() {
        initComponents();
     //  con = DBconnect.connect();
        tebleload();
        // Connection con=null;
    }
    
     public void tebleload(){
    
        try {
       
            
                    String sql = "SELECT ID,Description,Job_number,Date,Item_number FROM cost";
                    pst =con.prepareStatement(sql);
                   ResultSet rs = pst.executeQuery();
                    
                    //jTable1.setModel(DbU);
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  //  DbUtils.updateTableModelData((DefaultTableModel) jTable1.getModel(), rs);
                     //tebleload();
        } catch (Exception e) {
        }
       
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Description = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Job_number = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        Item_number = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Daily Production Report");
        setPreferredSize(new java.awt.Dimension(1891, 800));

        Description.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescriptionActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Production Description");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Job Number");

        Job_number.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Job_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Job_numberActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Date");

        date.setDateFormatString("yyyy.MM.d");
        date.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        Item_number.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Item_number.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7068-0001-01-F", "7068-0001-02-F", "7068-0001-03-F", "7068-0001-04-F", "7068-0001-05-F", "7068-0001-06-F", "7068-0001-07-F", "7068-0001-08-F", "7068-0001-09-F", "7068-0001-10-F", "7068-0001-11-F", "7068-0001-12-F", "7068-0002-01-F", "7068-0002-02-F", "7068-0002-03-F", "7068-0002-04-F", "7068-0002-05-F", "7068-0002-06-F", "7068-0002-07-F", "7068-0002-08-F", "7068-0002-09-F", "7068-0002-10-F", "7068-0002-11-F", "7068-0002-12-F", "7068-0002-13-F", "7068-0002-14-F", "7068-0002-15-F", "7068-0002-16-F", "7068-0002-17-F", "7068-0002-18-F", "7068-0002-19-F", "7068-0002-20-F", "7068-0002-21-F", "7068-0002-22-F", "7068-0003-01-F", "7068-0003-02-F", "7068-0003-03-F", "7068-0003-04-F", "7068-0003-01-F", "7068-0003-01-F", "7068-0004-01-F", "7068-0004-02-F", "7068-0004-03-F", "7068-0005-01-F", "7068-0005-02-F", "7068-0005-03-F", "7068-0005-04-F", "7068-0005-05-F", "7068-0005-06-F", "7068-0005-07-F", "7068-0005-08-F", "7068-0005-09-F", "7068-0005-10-F", "7068-0005-11-F", "7068-0005-12-F", "7068-0005-13-F", "7068-0005-14-F", "7068-0005-15-F", "7068-0005-16-F", "7068-0005-17-F", "7068-0005-18-F", "7068-0005-19-F", "7068-0005-20-F", "7068-0005-21-F", "7068-0005-22-F", "7068-0005-23-F", "7068-0005-24-F", "7068-0005-25-F", "7068-0005-26-F", "7068-0005-27-F", "7068-0005-28-F", "7068-0005-29-F", "7068-0005-30-F", "7068-0005-31-F", "7068-0005-32-F", "7068-0005-33-F", "7068-0005-34-F", "7068-0005-35-F", "7068-0005-36-F", "7068-0005-37-F", "7068-0005-38-F", "7068-0005-39-F", "7068-0005-40-F", "7068-0005-41-F", "7068-0005-42-F", "7068-0005-43-F", "7068-0005-44-F", "7068-0005-45-F", "7068-0005-46-F", "7068-0005-47-F", "7068-0005-48-F", "7068-0005-49-F", "7068-0005-50-F", "7068-0005-51-F", "7068-0005-52-F", "7068-0005-53-F", "7068-0005-54-F", "7068-0005-55-F", "7068-0005-56-F", "7068-0005-57-F", "7068-0005-58-F", "7068-0005-59-F", "7068-0006-01-F", "7068-0006-02-F", "7068-0006-03-F", "7068-0006-04-F", "7068-0006-05-F", "7068-0006-06-F", "7068-0007-01-F", "7068-0007-02-F", "7068-0007-03-F", "7068-0007-04-F", "7068-0007-05-F", "7068-0007-06-F", "7068-0007-07-F", "7068-0007-08-F", "7068-0007-09-F", "7068-0007-10-F", "7068-0007-11-F", "7068-0007-12-F", "7068-0008-01-F", "7068-0008-02-F", "7068-0008-03-F", "7068-0008-04-F", "7068-0008-05-F", "7068-0008-06-F", "7068-0008-07-F", "7068-0008-08-F", "7068-0008-09-F", "7068-0008-10-F", "7068-0008-11-F", "7068-0008-12-F", "7068-0008-13-F", "7068-0008-14-F", "7068-0008-15-F", "7068-0008-16-F", "7068-0008-17-F", "7068-0008-18-F", "7068-0008-19-F", "7068-0008-20-F", "7068-0008-21-F", "7068-0008-22-F", "7068-0008-23-F", "7068-0008-24-F", "7068-0008-25-F", "7068-0008-26-F", "7068-0008-27-F", "7068-0008-28-F", "7068-0008-29-F", "7068-0008-30-F", "7068-0008-31-F", "7068-0008-32-F", "7068-0008-33-F", "7068-0008-34-F", "7068-0008-35-F", "7068-0008-36-F", "7068-0008-37-F", "7068-0008-38-F", "7068-0008-39-F", "7068-0008-40-F", "7068-0008-41-F", "7068-0008-42-F", "7068-0008-43-F", "7068-0008-44-F", "7068-0008-45-F", "7068-0008-46-F", "7068-0008-47-F", "7068-0008-48-F", "7068-0008-49-F", "7068-0008-50-F", "7068-0008-51-F", "7068-0009-01-F", "7068-0009-02-F", "7068-0009-03-F", "7068-0009-04-F", "7068-0009-05-F", "7068-0009-06-F", "7068-0009-07-F", "7068-0010-01-F", "7068-0010-02-F", "7068-0010-03-F", "7068-0010-04-F", "7068-0010-05-F", "7068-0011-01-F", "7068-0011-02-F", "7068-0011-03-F", "7068-0011-04-F", "7068-0011-05-F", "7068-0011-06-F", "7068-0011-07-F", "7068-0011-08-F", "7068-0011-09-F", "7068-0011-10-F", "7068-0011-11-F", "7068-0011-12-F", "7068-0011-13-F", "7068-0011-14-F", "7068-0011-15-F", "7068-0011-16-F", "7068-0011-17-F", "7068-0011-18-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0013-01-F", "7068-0013-02-F", "7068-0013-03-F", "7068-0013-04-F", "7068-0013-05-F", "7068-0013-06-F", "7068-0013-07-F", "7068-0013-08-F", "7068-0013-09-F", "7068-0013-10-F", "7068-0013-11-F", "7068-0013-12-F", "7068-0013-13-F", "7068-0013-14-F", "7068-0013-15-F", "7068-0013-16-F", "7068-0013-17-F", "7068-0013-18-F", "7068-0014-01-F", "7068-0014-02-F", "7068-0014-03-F", "7068-0014-04-F", "7068-0014-05-F", "7068-0014-06-F", "7068-0014-07-F", "7068-0014-08-F", "7068-0014-09-F", "7068-0014-10-F", "7068-0014-11-F", "7068-0014-12-F", "7068-0014-13-F", "7068-0014-14-F", "7068-0015-01-F", "7068-0015-02-F", "7068-0015-03-F", "7068-0015-04-F", "7068-0015-05-F", "7068-0015-06-F", "7068-0015-07-F", "7068-0015-08-F", "7068-0015-09-F", "7068-0015-10-F", "7068-0015-11-F", "7068-0015-12-F", "7068-0015-13-F", "7068-0015-14-F", "7068-0015-15-F", "7068-0016-01-F", "7068-0016-02-F", "7068-0016-03-F", "7068-0016-04-F", "7068-0016-05-F", "7068-0017-01-F", "7068-0017-02-F", "7068-0017-03-F", "7068-0017-04-F", "7068-0017-05-F", "7068-0017-06-F", "7068-0017-07-F", "7068-0017-08-F", "7068-0017-09-F", "7068-0017-10-F", "7068-0017-11-F", "7068-0017-12-F", "7068-0017-13-F", "7068-0017-14-F", "7068-0017-15-F", "7068-0017-16-F", "7068-0017-17-F", "7068-0017-18-F", "7068-0017-19-F", "7068-0017-20-F", "7068-0017-21-F", "7068-0017-22-F", "7068-0017-23-F", "7068-0017-24-F", "7068-0017-25-F", "7068-0017-26-F", " " }));
        Item_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Item_numberActionPerformed(evt);
            }
        });
        Item_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Item_numberKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Item number");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Update.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("ID");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)
                        .addComponent(jLabel5)
                        .addGap(114, 114, 114)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(Update)
                        .addGap(66, 66, 66)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Job_number, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(Item_number, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Job_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Item_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(Update)
                    .addComponent(jButton1)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DescriptionActionPerformed

    private void Job_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Job_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Job_numberActionPerformed

    private void Item_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Item_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_numberActionPerformed

    private void Item_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Item_numberKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Item_numberKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String sql = "INSERT INTO cost(Description,Job_number,Date,Item_number) "
            + "VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/els?autoReconnect=true&useSSL=false","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,Description.getText());
            pst.setString(2,Job_number.getText());
            // Create an instance of SimpleDateFormat used for formatting
            // the string representation of date (month/day/year)
            DateFormat df = new SimpleDateFormat("yyyy.MM.d");

            // Get the date today using Calendar object.
            Date today = (Date) date.getDate();
            // Using DateFormat format method we can create a string
            // representation of a date with the defined format.
            String reportDate = df.format(today);
            pst.setString(3, reportDate);
            pst.setString(4, (String) Item_number.getSelectedItem());

            pst.executeUpdate();
             tebleload();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        }
        catch(  SQLException | HeadlessException  ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
       int x =  JOptionPane.showConfirmDialog(null, "Do you really want to update");
       
        String id = jLabel6.getText();
              String des = Description.getText();
            String Item = Item_number.getSelectedItem().toString();
              String Job = Job_number.getText();
              String dat = date.getDateFormatString();
          
              String sql = "UPDATE cost SET Description='"+des+"',Job_number='"+Item+"',Date='"+Job+"',Item_number='"+dat+"' WHERE jLabel6 ='"+id+"'"; 
              
           try {
                 pst = con.prepareStatement(sql);
                 pst.execute();
                  tebleload();
           } catch (Exception e) {
           }
    }//GEN-LAST:event_UpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int x = JOptionPane.showConfirmDialog(null,"Do you want to delete this ");
       if(x==0){
      String id = jLabel6.getText();
      String sql = "DELETE FROM cost WHERE ID='"+id+"'";
      
      
           try {
                 pst = con.prepareStatement(sql);
                 pst.execute();
                  tebleload();
           } catch (Exception e) {
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        

    }//GEN-LAST:event_jButton1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int m = jTable1.getSelectedRow();
        
        String id = jTable1.getValueAt(m, 0).toString();
        String description = jTable1.getValueAt(m, 1).toString();
         String job = jTable1.getValueAt(m, 2).toString();
          String dat = jTable1.getValueAt(m, 3).toString();
           String item = jTable1.getValueAt(m, 4).toString();
           
         //  jLabel6.setText(id);
            Description.setText(description);
             Job_number.setText(job);
             Item_number.setSelectedItem(item);
             
               date.setDateFormatString(dat);
          
 
    }//GEN-LAST:event_jTable1MouseClicked

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Description;
    private javax.swing.JComboBox Item_number;
    private javax.swing.JTextField Job_number;
    private javax.swing.JButton Update;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
