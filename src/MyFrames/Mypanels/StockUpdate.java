/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames.Mypanels;

import DBConnection.DBConnection;
import Model.Orders;
import Model.Reports;
import Model.Stocks;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.List;
import java.awt.event.KeyEvent;
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
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class StockUpdate extends javax.swing.JPanel {
//    
    
    DBConnection dbcon = new DBConnection();
    Orders order = new Orders();
    Reports report = new Reports();
    Stocks stock = new Stocks();
 
     Connection con =null;
 PreparedStatement pst = null;
   
    ////////////////////////////////////////////////////////////

 //////////////////////////////////////////////////////////////////
    
    
    public StockUpdate() {
        initComponents();
        jTable1.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
        tableload();
    }

    public void tableload(){
    
        try {
       
            
                    String sql = "SELECT Date,ItemNumber,ProductionQ,IssuedQ FROM ssss";
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtProQty = new javax.swing.JTextField();
        txtIssQty = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtItemNo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1750, 800));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Date");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Item Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Production Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Issued Quantity");

        txtProQty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtProQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProQtyActionPerformed(evt);
            }
        });
        txtProQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtProQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtProQtyKeyTyped(evt);
            }
        });

        txtIssQty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtIssQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIssQtyActionPerformed(evt);
            }
        });
        txtIssQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIssQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIssQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIssQtyKeyTyped(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtDate.setDateFormatString("yyyy.MM.d");
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDatePropertyChange(evt);
            }
        });
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDateKeyPressed(evt);
            }
        });
        txtDate.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtDateVetoableChange(evt);
            }
        });

        txtItemNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtItemNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7068-0001-01-F", "7068-0001-02-F", "7068-0001-03-F", "7068-0001-04-F", "7068-0001-05-F", "7068-0001-06-F", "7068-0001-07-F", "7068-0001-08-F", "7068-0001-09-F", "7068-0001-10-F", "7068-0001-11-F", "7068-0001-12-F", "7068-0002-01-F", "7068-0002-02-F", "7068-0002-03-F", "7068-0002-04-F", "7068-0002-05-F", "7068-0002-06-F", "7068-0002-07-F", "7068-0002-08-F", "7068-0002-09-F", "7068-0002-10-F", "7068-0002-11-F", "7068-0002-12-F", "7068-0002-13-F", "7068-0002-14-F", "7068-0002-15-F", "7068-0002-16-F", "7068-0002-17-F", "7068-0002-18-F", "7068-0002-19-F", "7068-0002-20-F", "7068-0002-21-F", "7068-0002-22-F", "7068-0003-01-F", "7068-0003-02-F", "7068-0003-03-F", "7068-0003-04-F", "7068-0003-01-F", "7068-0003-01-F", "7068-0004-01-F", "7068-0004-02-F", "7068-0004-03-F", "7068-0005-01-F", "7068-0005-02-F", "7068-0005-03-F", "7068-0005-04-F", "7068-0005-05-F", "7068-0005-06-F", "7068-0005-07-F", "7068-0005-08-F", "7068-0005-09-F", "7068-0005-10-F", "7068-0005-11-F", "7068-0005-12-F", "7068-0005-13-F", "7068-0005-14-F", "7068-0005-15-F", "7068-0005-16-F", "7068-0005-17-F", "7068-0005-18-F", "7068-0005-19-F", "7068-0005-20-F", "7068-0005-21-F", "7068-0005-22-F", "7068-0005-23-F", "7068-0005-24-F", "7068-0005-25-F", "7068-0005-26-F", "7068-0005-27-F", "7068-0005-28-F", "7068-0005-29-F", "7068-0005-30-F", "7068-0005-31-F", "7068-0005-32-F", "7068-0005-33-F", "7068-0005-34-F", "7068-0005-35-F", "7068-0005-36-F", "7068-0005-37-F", "7068-0005-38-F", "7068-0005-39-F", "7068-0005-40-F", "7068-0005-41-F", "7068-0005-42-F", "7068-0005-43-F", "7068-0005-44-F", "7068-0005-45-F", "7068-0005-46-F", "7068-0005-47-F", "7068-0005-48-F", "7068-0005-49-F", "7068-0005-50-F", "7068-0005-51-F", "7068-0005-52-F", "7068-0005-53-F", "7068-0005-54-F", "7068-0005-55-F", "7068-0005-56-F", "7068-0005-57-F", "7068-0005-58-F", "7068-0005-59-F", "7068-0006-01-F", "7068-0006-02-F", "7068-0006-03-F", "7068-0006-04-F", "7068-0006-05-F", "7068-0006-06-F", "7068-0007-01-F", "7068-0007-02-F", "7068-0007-03-F", "7068-0007-04-F", "7068-0007-05-F", "7068-0007-06-F", "7068-0007-07-F", "7068-0007-08-F", "7068-0007-09-F", "7068-0007-10-F", "7068-0007-11-F", "7068-0007-12-F", "7068-0008-01-F", "7068-0008-02-F", "7068-0008-03-F", "7068-0008-04-F", "7068-0008-05-F", "7068-0008-06-F", "7068-0008-07-F", "7068-0008-08-F", "7068-0008-09-F", "7068-0008-10-F", "7068-0008-11-F", "7068-0008-12-F", "7068-0008-13-F", "7068-0008-14-F", "7068-0008-15-F", "7068-0008-16-F", "7068-0008-17-F", "7068-0008-18-F", "7068-0008-19-F", "7068-0008-20-F", "7068-0008-21-F", "7068-0008-22-F", "7068-0008-23-F", "7068-0008-24-F", "7068-0008-25-F", "7068-0008-26-F", "7068-0008-27-F", "7068-0008-28-F", "7068-0008-29-F", "7068-0008-30-F", "7068-0008-31-F", "7068-0008-32-F", "7068-0008-33-F", "7068-0008-34-F", "7068-0008-35-F", "7068-0008-36-F", "7068-0008-37-F", "7068-0008-38-F", "7068-0008-39-F", "7068-0008-40-F", "7068-0008-41-F", "7068-0008-42-F", "7068-0008-43-F", "7068-0008-44-F", "7068-0008-45-F", "7068-0008-46-F", "7068-0008-47-F", "7068-0008-48-F", "7068-0008-49-F", "7068-0008-50-F", "7068-0008-51-F", "7068-0009-01-F", "7068-0009-02-F", "7068-0009-03-F", "7068-0009-04-F", "7068-0009-05-F", "7068-0009-06-F", "7068-0009-07-F", "7068-0010-01-F", "7068-0010-02-F", "7068-0010-03-F", "7068-0010-04-F", "7068-0010-05-F", "7068-0011-01-F", "7068-0011-02-F", "7068-0011-03-F", "7068-0011-04-F", "7068-0011-05-F", "7068-0011-06-F", "7068-0011-07-F", "7068-0011-08-F", "7068-0011-09-F", "7068-0011-10-F", "7068-0011-11-F", "7068-0011-12-F", "7068-0011-13-F", "7068-0011-14-F", "7068-0011-15-F", "7068-0011-16-F", "7068-0011-17-F", "7068-0011-18-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0013-01-F", "7068-0013-02-F", "7068-0013-03-F", "7068-0013-04-F", "7068-0013-05-F", "7068-0013-06-F", "7068-0013-07-F", "7068-0013-08-F", "7068-0013-09-F", "7068-0013-10-F", "7068-0013-11-F", "7068-0013-12-F", "7068-0013-13-F", "7068-0013-14-F", "7068-0013-15-F", "7068-0013-16-F", "7068-0013-17-F", "7068-0013-18-F", "7068-0014-01-F", "7068-0014-02-F", "7068-0014-03-F", "7068-0014-04-F", "7068-0014-05-F", "7068-0014-06-F", "7068-0014-07-F", "7068-0014-08-F", "7068-0014-09-F", "7068-0014-10-F", "7068-0014-11-F", "7068-0014-12-F", "7068-0014-13-F", "7068-0014-14-F", "7068-0015-01-F", "7068-0015-02-F", "7068-0015-03-F", "7068-0015-04-F", "7068-0015-05-F", "7068-0015-06-F", "7068-0015-07-F", "7068-0015-08-F", "7068-0015-09-F", "7068-0015-10-F", "7068-0015-11-F", "7068-0015-12-F", "7068-0015-13-F", "7068-0015-14-F", "7068-0015-15-F", "7068-0016-01-F", "7068-0016-02-F", "7068-0016-03-F", "7068-0016-04-F", "7068-0016-05-F", "7068-0017-01-F", "7068-0017-02-F", "7068-0017-03-F", "7068-0017-04-F", "7068-0017-05-F", "7068-0017-06-F", "7068-0017-07-F", "7068-0017-08-F", "7068-0017-09-F", "7068-0017-10-F", "7068-0017-11-F", "7068-0017-12-F", "7068-0017-13-F", "7068-0017-14-F", "7068-0017-15-F", "7068-0017-16-F", "7068-0017-17-F", "7068-0017-18-F", "7068-0017-19-F", "7068-0017-20-F", "7068-0017-21-F", "7068-0017-22-F", "7068-0017-23-F", "7068-0017-24-F", "7068-0017-25-F", "7068-0017-26-F", " " }));
        txtItemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItemNoActionPerformed(evt);
            }
        });
        txtItemNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtItemNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtItemNoKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Item Number", "Production Quantity", "Issued Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38)
                        .addComponent(btnUpdate))
                    .addComponent(txtProQty, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIssQty, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(txtItemNo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtItemNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtProQty)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIssQty))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(478, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //String date=txtDate.getText();
         DateFormat df = new SimpleDateFormat("yyyy.MM.d");
           // report.setOrderDate(txtOrderDate.getJCalendar());//new
            Date today = (Date) txtDate.getDate(); 
            String reportDate1 = df.format(today);
          //  string.setOrderDate(reportDate1);
      // pst.setDate(3, txtDate);
        
        
        
        int issqty=new Integer(txtIssQty.getText()).intValue();
        int proqty=new Integer(txtProQty.getText()).intValue();
        int qty=proqty-issqty;
       // String itemno=txtItemNo.getText();
        //report.settxtItemNo(txtItemNo.getSelectedItem().toString());
        String itemno = txtItemNo.getSelectedItem().toString();
      report.setDate(reportDate1);
        report.setItemno(itemno);
        report.setQty(proqty);
        
        if(dbcon.updateReports(report)){
            JOptionPane.showMessageDialog(this,"Reports Updated Successfully");
            clearfields();
             tableload();
        }else{
            JOptionPane.showMessageDialog(this,"Error While Updating Reports");
            clearfields();
             
        }
        stock.setItemNO(itemno);
        stock.setQty(qty);
        if(dbcon.updateStocks(stock)){
        JOptionPane.showMessageDialog(this,"Stocks Updated Successfully");
        clearfields();
        }else{
        JOptionPane.showMessageDialog(this,"Error While Updating Stocks");
        clearfields();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    ////////////////////////////////////////////////////////////////
    
    
    
    ///////////////////////////////////////////////////////////////
    
    
    
    private void txtProQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProQtyKeyTyped
        // TODO add your handling code here:
           char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_txtProQtyKeyTyped

    private void txtIssQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssQtyKeyTyped
        // TODO add your handling code here:
        
        char a=evt.getKeyChar();
        if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_txtIssQtyKeyTyped

    private void txtDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDatePropertyChange

    private void txtDateVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtDateVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateVetoableChange

    private void txtItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNoActionPerformed

    private void txtItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNoKeyReleased

    private void txtProQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProQtyActionPerformed

    private void txtIssQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIssQtyActionPerformed
       
       
             
    }//GEN-LAST:event_txtIssQtyActionPerformed

    private void txtProQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProQtyKeyReleased
        String PATTERN="^[0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtProQty.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       txtProQty.setText("");
        }
    }//GEN-LAST:event_txtProQtyKeyReleased

    private void txtIssQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssQtyKeyReleased
         String PATTERN="^[0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtIssQty.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       txtIssQty.setText("");
        }
    }//GEN-LAST:event_txtIssQtyKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       ////////////////////////////////////////////////////////////////////////
        
          try{
            String sql = "INSERT INTO ssss(Date,ItemNumber,ProductionQ,IssuedQ) "
            + "VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/els?autoReconnect=true&useSSL=false","root","");
            pst = con.prepareStatement(sql);
            pst.setString(3,txtProQty.getText());
            pst.setString(4,txtIssQty.getText());
            // Create an instance of SimpleDateFormat used for formatting
            // the string representation of date (month/day/year)
            DateFormat df = new SimpleDateFormat("yyyy.MM.d");

            // Get the date today using Calendar object.
            Date today = (Date) txtDate.getDate();
            // Using DateFormat format method we can create a string
            // representation of a date with the defined format.
            String reportDate = df.format(today);
            pst.setString(1, reportDate);
            pst.setString(2, (String) txtItemNo.getSelectedItem());

            pst.executeUpdate();
            tableload();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        }
        catch(  SQLException | HeadlessException  ex){
            JOptionPane.showMessageDialog(null, ex);
        }
               
        /////////////////////////////////////////////////////////////////////
        
        ////////////////////////////////////////////////////////////////////////
        
        
        
        ///////////////////////////////////////////////////////////////////////////
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyPressed
         int key=evt.getKeyCode();
        if(key==40){
            txtItemNo.requestFocus();
            
        }
    }//GEN-LAST:event_txtDateKeyPressed

    private void txtItemNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNoKeyPressed
         int key=evt.getKeyCode();
        if(key==40){
            txtProQty.requestFocus();
            
        }
    }//GEN-LAST:event_txtItemNoKeyPressed

    private void txtProQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProQtyKeyPressed
        int key=evt.getKeyCode();
        if(key==40){
             txtIssQty.requestFocus();
            
        }
    }//GEN-LAST:event_txtProQtyKeyPressed

    private void txtIssQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIssQtyKeyPressed
         int key=evt.getKeyCode();
        if(key==40){
            txtDate.requestFocus();
            
        }
    }//GEN-LAST:event_txtIssQtyKeyPressed
    void clearfields(){
    txtDate.setCalendar(null);
    txtIssQty.setText("");
    txtProQty.setText("");
    txtItemNo.setSelectedIndex(0);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtIssQty;
    private javax.swing.JComboBox txtItemNo;
    private javax.swing.JTextField txtProQty;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
