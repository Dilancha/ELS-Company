/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames.Mypanels;

import Model.Orders;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OnGoingOrders extends javax.swing.JPanel {
    String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    public OnGoingOrders() {
        initComponents();
        showOnGoingOrdersTable();
          jTable_view_ongoing_orders.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
    }
    
    public ArrayList<Orders> OrderList(){
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    String query ="SELECT * FROM orders WHERE is_deleted=0";
    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
    orders.setJobNumber(rs.getString("job_number"));
    orders.setClient(rs.getString("client"));
    orders.setItemNo(rs.getString("item_number"));
    orders.setDescription(rs.getString("description"));
    orders.setOrderDate(rs.getString("order_date"));
    orders.setLocation(rs.getString("location"));
    orders.setQuantity(rs.getInt("qty"));
    orders.setDeadline(rs.getString("deadline"));
    orders.setDailyTarget(rs.getInt("daily_target"));
    orders.setToBeCast(rs.getInt("to_be_cast"));
    orders.setDeliveredQuantity(rs.getInt("delivered_quantity"));
    orders.setToBeDeliver(rs.getInt("to_be_deliver"));
    OrdersList.add(orders);
    }
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
    
    return OrdersList;
    
    }
    public void showOnGoingOrdersTable(){
      ArrayList<Orders> list = OrderList();
        DefaultTableModel model = (DefaultTableModel)jTable_view_ongoing_orders.getModel();
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_view_ongoing_orders = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setAutoscrolls(true);
        setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        setPreferredSize(new java.awt.Dimension(1650, 800));

        jTable_view_ongoing_orders.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable_view_ongoing_orders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Number", "Client", "Item Number", "Description", "Order Date", "Location", "Quantity", "Deadline", "Daily Target", "To Be Cast", "Delivered Quantity", "To Be Deliver"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_view_ongoing_orders.setMaximumSize(new java.awt.Dimension(500, 100));
        jTable_view_ongoing_orders.setMinimumSize(new java.awt.Dimension(180, 100));
        jTable_view_ongoing_orders.setRowHeight(25);
        jScrollPane1.setViewportView(jTable_view_ongoing_orders);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1726, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_view_ongoing_orders;
    // End of variables declaration//GEN-END:variables
}