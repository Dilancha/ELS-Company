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
    }
    //////////////////////////////////////////////////////////////////////////////
       public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    //String query ="SELECT * FROM orders WHERE is_deleted=0";
    String query = "SELECT Item_Number,Cement,Ion,C_Aggregate,M_Sand,V_SL,V_MY,Stabilizer,D_Cement,W_Cement,Water,Total_Kg,Sub_total FROM ingredient";
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
    orders.setToBeDeliver(rs.getInt("Water"));
    orders.setDescription(rs.getString("Total_Kg"));
     orders.setDescription(rs.getString("Sub_total"));
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
    //////////////////////////////////////////////////////////////////////////////
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Daily Production Report");
        setPreferredSize(new java.awt.Dimension(1895, 800));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1350, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
