/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cost;

import Model.Orders;
import Model.Reports;
import Model.Stocks;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bimalka
 */
public class IngredientTable extends javax.swing.JInternalFrame {

     String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    
    public IngredientTable() {
        initComponents();
         showOnGoingOrdersTable();
          jTable1.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
    }
    //////////////////////////////////////////////////////////////////////////////
    /*
       public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    //String query ="SELECT * FROM orders WHERE is_deleted=0";
    String query = "SELECT Item_Number,Cement,Ion,C_Aggregate,M_Sand,V_SL,V_MY,Stabilizer,D_Cement,W_Cement,Total_Kg,Sub_total FROM ingredient";
    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
    orders.setJobNumber(rs.getString("Item_Number"));
    orders.setClient(rs.getString("Cement"));
    orders.setItemNo(rs.getString("Ion"));
  
    orders.setOrderDate(rs.getString("C_Aggregate"));
    orders.setLocation(rs.getString("M_Sand"));
    orders.setQuantity(rs.getInt("V_SL"));
    orders.setDeadline(rs.getString("V_MY"));
    orders.setDailyTarget(rs.getInt("Stabilizer"));
    orders.setToBeCast(rs.getInt("D_Cement"));
    orders.setDeliveredQuantity(rs.getInt("W_Cement"));
      orders.setDescription(rs.getString("Sub_total"));
    //orders.setToBeDeliver(rs.getInt("Water"));
    orders.setDescription(rs.getString("Total_Kg"));
     //orders.setDescription(rs.getString("Sub_total"));
    OrdersList.add(orders);
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return OrdersList;
    
    }
    public void showOnGoingOrdersTable(){
      ArrayList<Orders> list = OrderList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[12];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getClient();
        row[2]=list.get(i).getItemNo();
        row[3]=list.get(i).getDescription();
        row[4]=list.get(i).getOrderDate();
        row[5]=list.get(i).getLocation();
        row[6]=list.get(i).getQuantity();
        row[7]=list.get(i).getDeadline();
        row[8]=list.get(i).getDailyTarget();
        row[9]=list.get(i).getToBeCast();
        row[10]=list.get(i).getDeliveredQuantity();
        row[11]=list.get(i).getToBeDeliver();
        model.addRow(row);
        }
    }
    */
    //////////////////////////////////////////////////////////////////////////////
    
    //9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
    
     public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
  //  String query ="SELECT * FROM orders WHERE is_deleted=0";
     String query = "SELECT Item_Number,Cement,Ion,C_Aggregate,M_Sand,V_SL,V_MY,Stabilizer,D_Cement,W_Cement,Total_Kg,Sub_total FROM ingredient";
    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
    orders.setJobNumber(rs.getString("Item_Number"));
    orders.setClient(rs.getString("Cement"));
    orders.setItemNo(rs.getString("Ion"));
    orders.setDescription(rs.getString("C_Aggregate"));
    orders.setOrderDate(rs.getString("M_Sand"));
    orders.setLocation(rs.getString("V_SL"));
    orders.setQuantity(rs.getInt("V_MY"));
    orders.setDeadline(rs.getString("Stabilizer"));
    orders.setDailyTarget(rs.getInt("D_Cement"));
    orders.setToBeCast((int) rs.getFloat("W_Cement"));
    orders.setDeliveredQuantity(rs.getInt("Total_Kg"));
    orders.setToBeDeliver(rs.getInt("Sub_total"));
    OrdersList.add(orders);
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return OrdersList;
    
    }
    public void showOnGoingOrdersTable(){
      ArrayList<Orders> list = OrderList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row = new Object[12];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getClient();
        row[2]=list.get(i).getItemNo();
        row[3]=list.get(i).getDescription();
        row[4]=list.get(i).getOrderDate();
        row[5]=list.get(i).getLocation();
        row[6]=list.get(i).getQuantity();
        row[7]=list.get(i).getDeadline();
        row[8]=list.get(i).getDailyTarget();
        row[9]=list.get(i).getToBeCast();
        row[10]=list.get(i).getDeliveredQuantity();
        row[11]=list.get(i).getToBeDeliver();
        model.addRow(row);
        }
    }

    
    //9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setResizable(true);
        setAutoscrolls(true);
        setPreferredSize(new java.awt.Dimension(1920, 800));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ItemNumber", "Cement", "Ion", "CAgregate", "MSand", "VSL", "VMY", "Stabilizer", "DCement", "WCement", "Total Kg", "Sub total"
            }
        ));
        jTable1.setRowHeight(25);
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
