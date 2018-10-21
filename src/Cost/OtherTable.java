/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cost;

import Model.Orders;
import Model.Reports;
import Model.Stocks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Bimalka
 */
public class OtherTable extends javax.swing.JInternalFrame {
  String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
   //db connection setup
   /* 
    String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st1=null;
    ResultSet rs1=null;
    Statement st2=null;
    ResultSet rs2=null;
    */
   // ResultSet rs = null;
    //Connection con =null;
 PreparedStatement pst = null;
    public OtherTable() {
        initComponents();
        //tebleload();
           showOnGoingOrdersTable();
    }
    /*
  public void tebleload(){
    
        try {
        //    PreparedStatement pst = con.prepareStatement("SELECT Description,Job_number,Date,Item_number FROM cost");
//R/esultSet rs = pst.executeQuery();
 //jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
                    //String sql = "SELECT Description,Job_number,Date,Item_number FROM cost";
                    String sql = "SELECT Item_Number,Tax,Westage,Discount,Day_change,Extra,Total_value FROM other";
                    pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    
                    System.out.println(rs);
                    tebleload();
                    //jTable1.setModel(DbU);
                     Otable.setModel(DbUtils.resultSetToTableModel(rs));
                  //  DbUtils.updateTableModelData((DefaultTableModel) jTable1.getModel(), rs);
                    
        } catch (Exception e) {
        }
       
    
    }
  */  
    ////////////////////////////////////////////////////////////////////////////////
    
       public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    //String query ="SELECT * FROM other WHERE is_deleted=0";
      String query = "SELECT Item_Number,Tax,Westage,Discount,Day_change,Extra,Total_value FROM other";
    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
    orders.setJobNumber(rs.getString("Item_Number"));
    orders.setClient(rs.getString("Tax"));
    orders.setItemNo(rs.getString("Westage"));
    orders.setDescription(rs.getString("Discount"));
    orders.setOrderDate(rs.getString("Day_change"));
    orders.setLocation(rs.getString("Extra"));
    orders.setQuantity(rs.getInt("Total_value"));
    
    OrdersList.add(orders);
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return OrdersList;
    
    }
    public void showOnGoingOrdersTable(){
      ArrayList<Orders> list = OrderList();
        DefaultTableModel model = (DefaultTableModel)Otable.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getClient();
        row[2]=list.get(i).getItemNo();
        row[3]=list.get(i).getDescription();
        row[4]=list.get(i).getOrderDate();
        row[5]=list.get(i).getLocation();
        row[6]=list.get(i).getQuantity();
        
        model.addRow(row);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        Otable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Daily Production Report");
        setPreferredSize(new java.awt.Dimension(1895, 800));

        Otable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Otable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item_Number", "Tax", "Wastege", "Discount", "Day_Change", "Extra", "Total"
            }
        ));
        Otable.setPreferredSize(new java.awt.Dimension(1795, 800));
        jScrollPane2.setViewportView(Otable);

        jButton1.setText("Load");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(54, 54, 54)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1039, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            //  tebleload();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Otable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
