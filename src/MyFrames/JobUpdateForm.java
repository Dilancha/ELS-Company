/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import DBConnection.DBConnection;
import Model.Orders;
import java.awt.Font;
import java.awt.HeadlessException;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class JobUpdateForm extends javax.swing.JInternalFrame {
    Orders order = new Orders();
    DBConnection dbcon =new DBConnection();
   // ResultSet rs = null;
     String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    PreparedStatement pst = null;
    
    
   // PreparedStatement pst = null;
    /**
     * Creates new form JobUpdateForm
     */
    public JobUpdateForm() {
        initComponents();
       
        jTable1.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
       tebleload();
    }
    
    public void tebleload(){
    
        try {
       
            
                    String sql = "SELECT Job_number,Item_number,ProducedQ,DeliveredQ FROM dddd";
                    pst =con.prepareStatement(sql);
                   ResultSet rs = pst.executeQuery();
                    
                    //jTable1.setModel(DbU);
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  //  DbUtils.updateTableModelData((DefaultTableModel) jTable1.getModel(), rs);
                     //tebleload();
        } catch (Exception e) {
        }
       
    
    }
   
    
    
    
       //////////////////////////////////////////////////////////////////////
   
    /*
    public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    //String query ="SELECT * FROM orders WHERE is_deleted=0";
    String query ="SELECT job_number,item_number,delivered_quantity FROM orders";
    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
    orders.setJobNumber(rs.getString("job_number"));
    
    orders.setItemNo(rs.getString("item_number"));
   
   
    orders.setDeliveredQuantity(rs.getInt("delivered_quantity"));
    
    OrdersList.add(orders);
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return OrdersList;
    
    }
    public void showOnUpdateTable(){
      ArrayList<Orders> list = OrderList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[3];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
       
        row[1]=list.get(i).getItemNo();
       
        row[2]=list.get(i).getDailyTarget();
      
        model.addRow(row);
        }
    }
    */
    ///////////////////////////////////////////////////////////////////////

    
    ////////////////////////////////////////////////////////////////////////////////////////
    
 
    
    ////////////////////////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtJobNo = new javax.swing.JTextField();
        txtProQty = new javax.swing.JTextField();
        txtDelQty = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtItemNo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1895, 800));

        jLabel1.setBackground(new java.awt.Color(102, 102, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Job Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Item Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Produced Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Delivered Quantity");

        txtJobNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtJobNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJobNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJobNoKeyReleased(evt);
            }
        });

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

        txtDelQty.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDelQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDelQtyActionPerformed(evt);
            }
        });
        txtDelQty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDelQtyKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDelQtyKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDelQtyKeyTyped(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
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

            },
            new String [] {
                "Job Number", "Item Number", "Produced Quantity", "Delivered Quantity"
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtItemNo, javax.swing.GroupLayout.Alignment.TRAILING, 0, 299, Short.MAX_VALUE)
                    .addComponent(txtJobNo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtProQty, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDelQty, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1042, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJobNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtItemNo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProQty))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDelQty))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // order.setJobNumber(txtJobNo.getText());
        String orederNo = new String(txtJobNo.getText()).toString();
       // order.setItemNo(txtItemNo.getText());
        String setitemno = txtItemNo.getSelectedItem().toString();
        int proqty=new Integer(txtProQty.getText()).intValue();
        int delqty=new Integer(txtDelQty.getText()).intValue();
//        if(dbcon.updateJob(order,proqty,delqty)){
//        JOptionPane.showMessageDialog(this,"Successfully  job Updated");
//        Clearfields();
//        }
        if(dbcon.updateJob(orederNo,setitemno,proqty,delqty)){
        JOptionPane.showMessageDialog(this,"Successfully  job Updated");
        Clearfields();
        }
        else{
        JOptionPane.showMessageDialog(this,"Error While Updating");
        Clearfields();
        }
        
         double dd1=0;
        double ee1=0;
        
          if (txtProQty.getText().isEmpty()) {
            dd1 = 0 ;
        }else{
           dd1 = Double.parseDouble(txtProQty.getText());
        }
        //
          if (txtDelQty.getText().isEmpty()) {
            ee1 = 0 ;
        }else{
           ee1 = Double.parseDouble(txtDelQty.getText());
        }
         
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtProQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProQtyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtProQtyActionPerformed

    private void txtProQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProQtyKeyTyped
        // TODO add your handling code here:
         char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_txtProQtyKeyTyped

    private void txtDelQtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDelQtyKeyTyped
        // TODO add your handling code here:
        
        char a=evt.getKeyChar();
        if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_txtDelQtyKeyTyped

    private void txtJobNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJobNoKeyReleased
        // TODO add your handling code here:
          String PATTERN="^[-/+*()' 'a-zA-Z0-9+]{0,25}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtJobNo.getText());
                       
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid jobnumber");
       //clearFields();
        txtJobNo.setText("");
       // clearFields();
        }
    }//GEN-LAST:event_txtJobNoKeyReleased

    private void txtItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNoActionPerformed

    private void txtItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItemNoKeyReleased

    private void txtDelQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDelQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDelQtyActionPerformed

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

    private void txtDelQtyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDelQtyKeyReleased
         String PATTERN="^[0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtDelQty.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       txtDelQty.setText("");
        }
    }//GEN-LAST:event_txtDelQtyKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //////////////////////////////////////////////////////////////////////
     
        try{
            String sql = "INSERT INTO dddd(Job_number,Item_number,ProducedQ,DeliveredQ)"
            + "VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/els?autoReconnect=true&useSSL=false","root","");
            pst = con.prepareStatement(sql);
            pst.setString(4,txtDelQty.getText());
            pst.setString(1,txtJobNo.getText());
            pst.setString(3,txtProQty.getText());
            
            pst.setString(2, (String) txtItemNo.getSelectedItem());

            pst.executeUpdate();
            tebleload();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        }
        catch(  SQLException | HeadlessException  ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        
        ///////////////////////////////////////////////////////////
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtJobNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJobNoKeyPressed
        int key=evt.getKeyCode();
        if(key==40){
            txtItemNo.requestFocus();
            
        }
    }//GEN-LAST:event_txtJobNoKeyPressed

    private void txtItemNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtItemNoKeyPressed
       int key=evt.getKeyCode();
        if(key==40){
             txtProQty.requestFocus();
            
        }
    }//GEN-LAST:event_txtItemNoKeyPressed

    private void txtProQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProQtyKeyPressed
        int key=evt.getKeyCode();
        if(key==40){
            txtDelQty.requestFocus();
            
        }
    }//GEN-LAST:event_txtProQtyKeyPressed

    private void txtDelQtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDelQtyKeyPressed
       int key=evt.getKeyCode();
        if(key==40){
            txtJobNo.requestFocus();
            
        }
    }//GEN-LAST:event_txtDelQtyKeyPressed
    void Clearfields(){
    txtJobNo.setText("");
  //  txtItemNo.setText("");
    txtProQty.setText("");
    txtDelQty.setText("");
     txtItemNo.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtDelQty;
    private javax.swing.JComboBox txtItemNo;
    private javax.swing.JTextField txtJobNo;
    private javax.swing.JTextField txtProQty;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
