/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import Cost.Description1;
import DBConnection.DBConnection;
import Model.Orders;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import java.util.regex.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import org.apache.derby.iapi.services.classfile.VMDescriptor;

/**
 *
 * @author Bimalka
 */
public class AddNewJobFrame extends javax.swing.JInternalFrame {
    
    int dailyTarget=0;
    int daysLeft=0;
    
    DBConnection dbCon = new DBConnection();
    ResultSet rs = null;
    
    PreparedStatement pst = null;
     String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
 // ResultSet rs=null;
    
    public AddNewJobFrame() {
        initComponents();
    //  showOnGoingOrdersTable()
        setSize(2000,1000);
       showOnGoingOrdersTable();
      jTable1.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
       
    }
    
    //////////////////////////////////////////////////////////

    public ArrayList<Orders> OrderList(){
    
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
    //String query2 ="SELECT * FROM orders WHERE is_deleted=0";
    
  String query = "SELECT description,item_number,client,order_date,job_number,location,qty,deadline FROM orders";
  //     String query = "SELECT request_number,description,item_number,client,order_date,job_number,location,qty,deadline FROM orders";

    st =(Statement) con.createStatement();
    rs=st.executeQuery(query);
    Orders orders;
    while(rs.next()){
    orders = new Orders();
   // orders.setrequest(rs.getString("request_number"));
    orders.setDescription(rs.getString("description"));
    orders.setJobNumber(rs.getString("job_number"));
    orders.setClient(rs.getString("client"));
    orders.setItemNo(rs.getString("item_number"));
    orders.setLocation(rs.getString("location"));
    orders.setQuantity(rs.getInt("qty"));
    orders.setOrderDate(rs.getString("order_date"));
    orders.setDeadline(rs.getString("deadline"));
    
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
        Object[] row = new Object[8];
        for(int i=0;i<list.size();i++){
     //   row[0]=list.get(i).getrequest();
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getClient();
        row[2]=list.get(i).getItemNo();
        row[3]=list.get(i).getDescription();
        row[4]=list.get(i).getOrderDate();
        row[5]=list.get(i).getLocation();
        row[6]=list.get(i).getQuantity();
       row[7]=list.get(i).getDeadline();
      
        model.addRow(row);
        }
    }

    
    //KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK
    /*
    public ArrayList<Orders> OrderList(){
    
    ArrayList<Orders> OrdersList = new ArrayList<>();
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    con = (Connection)DriverManager.getConnection(url,username,password);
   // String query ="SELECT * FROM orders WHERE is_deleted=0";
    
   String query = "SELECT description,item_number,client,order_date,job_number,location,qty,deadline FROM orders";
    
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
        Object[] row = new Object[8];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getClient();
        row[2]=list.get(i).getItemNo();
        row[3]=list.get(i).getDescription();
        row[4]=list.get(i).getOrderDate();
        row[5]=list.get(i).getLocation();
        row[6]=list.get(i).getQuantity();
        row[7]=list.get(i).getDeadline();
        
        model.addRow(row);
        }
    }
 */
    //KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKkkkk
    
    ////////////////////////////////////////////////////////
    
    /*
   public void tableload(){
   
         try {
       
            
                    String sql = "SELECT description,item_number,client,order_date,job_number,location,deadline,qty FROM orders";
                    // pst = (PreparedStatement) con.prepareStatement(query);
                          pst =dbCon.prepareStatement(sql);
                  //  pst =dbcon.prepareStatement(sql);
                   rs = pst.executeQuery();
                  //  tebleload();
                    //jTable1.setModel(DbU);
                     jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  //  DbUtils.updateTableModelData((DefaultTableModel) jTable1.getModel(), rs);
                     //tebleload();
        } catch (Exception e) {
        }
   
   }
    
    */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtJobNumber = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ItemNo = new javax.swing.JComboBox();
        txtOrderDate = new com.toedter.calendar.JDateChooser();
        txtClient = new javax.swing.JTextField();
        txtDeadline = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Update = new javax.swing.JButton();
        Rnum = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setName("Add New Order"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1750, 800));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Description");

        jLabel2.setBackground(new java.awt.Color(51, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Item Number");

        jLabel4.setBackground(new java.awt.Color(51, 51, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Order Date");

        jLabel5.setBackground(new java.awt.Color(51, 51, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Job Number");

        jLabel6.setBackground(new java.awt.Color(51, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Location");

        jLabel7.setBackground(new java.awt.Color(51, 51, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Quantity");

        jLabel8.setBackground(new java.awt.Color(51, 51, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Deadline");

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        txtDescription.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescriptionKeyReleased(evt);
            }
        });

        txtJobNumber.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtJobNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtJobNumberKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtJobNumberKeyReleased(evt);
            }
        });

        txtLocation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });
        txtLocation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtLocationKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLocationKeyReleased(evt);
            }
        });

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtQuantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtQuantityKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantityKeyTyped(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Client");

        ItemNo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ItemNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7068-0001-01-F", "7068-0001-02-F", "7068-0001-03-F", "7068-0001-04-F", "7068-0001-05-F", "7068-0001-06-F", "7068-0001-07-F", "7068-0001-08-F", "7068-0001-09-F", "7068-0001-10-F", "7068-0001-11-F", "7068-0001-12-F", "7068-0002-01-F", "7068-0002-02-F", "7068-0002-03-F", "7068-0002-04-F", "7068-0002-05-F", "7068-0002-06-F", "7068-0002-07-F", "7068-0002-08-F", "7068-0002-09-F", "7068-0002-10-F", "7068-0002-11-F", "7068-0002-12-F", "7068-0002-13-F", "7068-0002-14-F", "7068-0002-15-F", "7068-0002-16-F", "7068-0002-17-F", "7068-0002-18-F", "7068-0002-19-F", "7068-0002-20-F", "7068-0002-21-F", "7068-0002-22-F", "7068-0003-01-F", "7068-0003-02-F", "7068-0003-03-F", "7068-0003-04-F", "7068-0003-01-F", "7068-0003-01-F", "7068-0004-01-F", "7068-0004-02-F", "7068-0004-03-F", "7068-0005-01-F", "7068-0005-02-F", "7068-0005-03-F", "7068-0005-04-F", "7068-0005-05-F", "7068-0005-06-F", "7068-0005-07-F", "7068-0005-08-F", "7068-0005-09-F", "7068-0005-10-F", "7068-0005-11-F", "7068-0005-12-F", "7068-0005-13-F", "7068-0005-14-F", "7068-0005-15-F", "7068-0005-16-F", "7068-0005-17-F", "7068-0005-18-F", "7068-0005-19-F", "7068-0005-20-F", "7068-0005-21-F", "7068-0005-22-F", "7068-0005-23-F", "7068-0005-24-F", "7068-0005-25-F", "7068-0005-26-F", "7068-0005-27-F", "7068-0005-28-F", "7068-0005-29-F", "7068-0005-30-F", "7068-0005-31-F", "7068-0005-32-F", "7068-0005-33-F", "7068-0005-34-F", "7068-0005-35-F", "7068-0005-36-F", "7068-0005-37-F", "7068-0005-38-F", "7068-0005-39-F", "7068-0005-40-F", "7068-0005-41-F", "7068-0005-42-F", "7068-0005-43-F", "7068-0005-44-F", "7068-0005-45-F", "7068-0005-46-F", "7068-0005-47-F", "7068-0005-48-F", "7068-0005-49-F", "7068-0005-50-F", "7068-0005-51-F", "7068-0005-52-F", "7068-0005-53-F", "7068-0005-54-F", "7068-0005-55-F", "7068-0005-56-F", "7068-0005-57-F", "7068-0005-58-F", "7068-0005-59-F", "7068-0006-01-F", "7068-0006-02-F", "7068-0006-03-F", "7068-0006-04-F", "7068-0006-05-F", "7068-0006-06-F", "7068-0007-01-F", "7068-0007-02-F", "7068-0007-03-F", "7068-0007-04-F", "7068-0007-05-F", "7068-0007-06-F", "7068-0007-07-F", "7068-0007-08-F", "7068-0007-09-F", "7068-0007-10-F", "7068-0007-11-F", "7068-0007-12-F", "7068-0008-01-F", "7068-0008-02-F", "7068-0008-03-F", "7068-0008-04-F", "7068-0008-05-F", "7068-0008-06-F", "7068-0008-07-F", "7068-0008-08-F", "7068-0008-09-F", "7068-0008-10-F", "7068-0008-11-F", "7068-0008-12-F", "7068-0008-13-F", "7068-0008-14-F", "7068-0008-15-F", "7068-0008-16-F", "7068-0008-17-F", "7068-0008-18-F", "7068-0008-19-F", "7068-0008-20-F", "7068-0008-21-F", "7068-0008-22-F", "7068-0008-23-F", "7068-0008-24-F", "7068-0008-25-F", "7068-0008-26-F", "7068-0008-27-F", "7068-0008-28-F", "7068-0008-29-F", "7068-0008-30-F", "7068-0008-31-F", "7068-0008-32-F", "7068-0008-33-F", "7068-0008-34-F", "7068-0008-35-F", "7068-0008-36-F", "7068-0008-37-F", "7068-0008-38-F", "7068-0008-39-F", "7068-0008-40-F", "7068-0008-41-F", "7068-0008-42-F", "7068-0008-43-F", "7068-0008-44-F", "7068-0008-45-F", "7068-0008-46-F", "7068-0008-47-F", "7068-0008-48-F", "7068-0008-49-F", "7068-0008-50-F", "7068-0008-51-F", "7068-0009-01-F", "7068-0009-02-F", "7068-0009-03-F", "7068-0009-04-F", "7068-0009-05-F", "7068-0009-06-F", "7068-0009-07-F", "7068-0010-01-F", "7068-0010-02-F", "7068-0010-03-F", "7068-0010-04-F", "7068-0010-05-F", "7068-0011-01-F", "7068-0011-02-F", "7068-0011-03-F", "7068-0011-04-F", "7068-0011-05-F", "7068-0011-06-F", "7068-0011-07-F", "7068-0011-08-F", "7068-0011-09-F", "7068-0011-10-F", "7068-0011-11-F", "7068-0011-12-F", "7068-0011-13-F", "7068-0011-14-F", "7068-0011-15-F", "7068-0011-16-F", "7068-0011-17-F", "7068-0011-18-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0013-01-F", "7068-0013-02-F", "7068-0013-03-F", "7068-0013-04-F", "7068-0013-05-F", "7068-0013-06-F", "7068-0013-07-F", "7068-0013-08-F", "7068-0013-09-F", "7068-0013-10-F", "7068-0013-11-F", "7068-0013-12-F", "7068-0013-13-F", "7068-0013-14-F", "7068-0013-15-F", "7068-0013-16-F", "7068-0013-17-F", "7068-0013-18-F", "7068-0014-01-F", "7068-0014-02-F", "7068-0014-03-F", "7068-0014-04-F", "7068-0014-05-F", "7068-0014-06-F", "7068-0014-07-F", "7068-0014-08-F", "7068-0014-09-F", "7068-0014-10-F", "7068-0014-11-F", "7068-0014-12-F", "7068-0014-13-F", "7068-0014-14-F", "7068-0015-01-F", "7068-0015-02-F", "7068-0015-03-F", "7068-0015-04-F", "7068-0015-05-F", "7068-0015-06-F", "7068-0015-07-F", "7068-0015-08-F", "7068-0015-09-F", "7068-0015-10-F", "7068-0015-11-F", "7068-0015-12-F", "7068-0015-13-F", "7068-0015-14-F", "7068-0015-15-F", "7068-0016-01-F", "7068-0016-02-F", "7068-0016-03-F", "7068-0016-04-F", "7068-0016-05-F", "7068-0017-01-F", "7068-0017-02-F", "7068-0017-03-F", "7068-0017-04-F", "7068-0017-05-F", "7068-0017-06-F", "7068-0017-07-F", "7068-0017-08-F", "7068-0017-09-F", "7068-0017-10-F", "7068-0017-11-F", "7068-0017-12-F", "7068-0017-13-F", "7068-0017-14-F", "7068-0017-15-F", "7068-0017-16-F", "7068-0017-17-F", "7068-0017-18-F", "7068-0017-19-F", "7068-0017-20-F", "7068-0017-21-F", "7068-0017-22-F", "7068-0017-23-F", "7068-0017-24-F", "7068-0017-25-F", "7068-0017-26-F", " " }));
        ItemNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemNoActionPerformed(evt);
            }
        });
        ItemNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ItemNoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ItemNoKeyReleased(evt);
            }
        });

        txtOrderDate.setDateFormatString("yyyy.MM.d");
        txtOrderDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtOrderDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtOrderDatePropertyChange(evt);
            }
        });
        txtOrderDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOrderDateKeyPressed(evt);
            }
        });
        txtOrderDate.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtOrderDateVetoableChange(evt);
            }
        });

        txtClient.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClientActionPerformed(evt);
            }
        });
        txtClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClientKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientKeyReleased(evt);
            }
        });

        txtDeadline.setDateFormatString("yyyy.MM.d");
        txtDeadline.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDeadline.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtDeadlinePropertyChange(evt);
            }
        });
        txtDeadline.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDeadlineKeyTyped(evt);
            }
        });
        txtDeadline.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtDeadlineVetoableChange(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Number", "Client", "Item Number", "Description", "Order Date", "Location", "Quantity", "Deadline"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Update.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Update.setText("UPDATE");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Rnum.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtClient, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rnum, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtJobNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Update)
                            .addGap(61, 61, 61)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(140, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtJobNumber))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ItemNo)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtClient)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOrderDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Rnum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Update))))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            Orders orders = new Orders();
            orders.setRequestNumber(0);
            orders.setDescription(txtDescription.getText());
            //orders.setItemNo(txtItemNo.getText());
            orders.setItemNo(ItemNo.getSelectedItem().toString());
           orders.setClient(txtClient.getText());
            DateFormat df = new SimpleDateFormat("yyyy.MM.d");
            //orders.setOrderDate(txtOrderDate.getJCalendar());//new
          //  Date today = (Date) txtOrderDate.getDate();  new 2
            Date today =  txtOrderDate.getDate();
            String reportDate1 = df.format(today);
            
            orders.setOrderDate(reportDate1);
         // orders.setClient(txtClient.getDate());
           // Date today = (Date) txtClient.getDate();  
            orders.setJobNumber(txtJobNumber.getText());
            orders.setLocation(txtLocation.getText());
            orders.setQuantity(new Integer(txtQuantity.getText()).intValue());
            //orders.setDeadline(txtDeadline.getText());
          //  orders.setDeadline(txtClient.getJCalendar());
             DateFormat dff = new SimpleDateFormat("yyyy.MM.d");
            //Date today2 = (Date) txtDeadline.getDate();
            Date today2 =  txtDeadline.getDate();
            
            
            String reportDate2 = dff.format(today2);
            orders.setDeadline(reportDate2);
            orders.setToBeCast(new Integer(txtQuantity.getText()).intValue());
            //orders.setDeliveredQuantity(0);
            orders.setToBeDeliver(new Integer(txtQuantity.getText()).intValue());
            //calculate the daily target
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.d");
            
            Date d1=format.parse(reportDate1);
            Date d2=format.parse(reportDate2);
            daysLeft=getDifferenceDays(d1,d2);
            dailyTarget=(int) orders.getToBeCast()/daysLeft;
            orders.setDailyTarget(dailyTarget);
           // pst.execute();
       // showOnGoingOrdersTable();
            //orders.setIsDeleted(0);
            if(dbCon.addOrders(orders)){
                JOptionPane.showMessageDialog(this,"Successfully Inserted!!");
               clearFields();
            }else{
                JOptionPane.showMessageDialog(this, "Erroe while Inserting!!");
                clearFields();
            }
        } catch (ParseException ex) {
            System.out.println("Exception->>"+ex);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtDescriptionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyReleased
   
        String PATTERN="^[-&@^:.,/+*()' 'a-zA-Z0-9+]{0,50}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtDescription.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid jobnumber");
        txtDescription.setText("");
       // clearFields();
        }
        
    }//GEN-LAST:event_txtDescriptionKeyReleased

    private void txtJobNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJobNumberKeyReleased
        // TODO add your handling code here:
       String PATTERN="^[-/+*()' 'a-zA-Z0-9+]{0,25}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtJobNumber.getText());
                       
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid jobnumber");
       //clearFields();
        txtJobNumber.setText("");
       // clearFields();
        }
    }//GEN-LAST:event_txtJobNumberKeyReleased

    private void txtLocationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyReleased
        
        String PATTERN="^[-/+*()' 'a-zA-Z0-9+]{0,25}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtLocation.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Location");
       // clearFields();
       txtLocation.setText("");
        }
    
    
    }//GEN-LAST:event_txtLocationKeyReleased

    private void txtQuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyReleased
        String PATTERN="^[0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtQuantity.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       //clearFields();
       txtQuantity.setText("");
       // clearFields();
       
        }
    
        
    }//GEN-LAST:event_txtQuantityKeyReleased

    private void ItemNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNoActionPerformed

    private void ItemNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemNoKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_ItemNoKeyReleased

    private void txtOrderDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtOrderDatePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDatePropertyChange

    private void txtOrderDateVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtOrderDateVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderDateVetoableChange

    private void txtDeadlinePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtDeadlinePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeadlinePropertyChange

    private void txtDeadlineVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtDeadlineVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeadlineVetoableChange

    private void txtClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClientActionPerformed

    private void txtQuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantityKeyTyped
        char c=evt.getKeyChar();
        if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_txtQuantityKeyTyped

    private void txtDeadlineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDeadlineKeyTyped
      
    }//GEN-LAST:event_txtDeadlineKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     
        int r = jTable1.getSelectedRow();
      
         String job = jTable1.getValueAt(r, 0).toString();//
        String client = jTable1.getValueAt(r, 1).toString();//
        String item = jTable1.getValueAt(r, 2).toString();//

          String des = jTable1.getValueAt(r, 3).toString();//
                String Loca = jTable1.getValueAt(r, 5).toString();//
                  String datO = jTable1.getValueAt(r, 4).toString();
                    String q = jTable1.getValueAt(r, 6).toString();//
                       String datD = jTable1.getValueAt(r, 7).toString();
                    //   String id = jTable1.getValueAt(r, 8).toString();
                       // String description = jTable1.getValueAt(r, 0).toString();
        try {
            Date date1 =new SimpleDateFormat("yyyy.MM.d").parse(datO);
            Date date2 =new SimpleDateFormat("yyyy.MM.d").parse(datD);
             txtClient.setText(client);
    txtDescription.setText(des);
  // Rnum.setText(id);
    txtJobNumber.setText(job);
    txtLocation.setText(Loca);
   
    txtQuantity.setText(q);
  //  txtOrderDate.setDateFormatString(datO);
    txtOrderDate.setDate(date1);
  //  txtDeadline.setDateFormatString(datD);
         txtDeadline.setDate(date2);
    ItemNo.setSelectedItem(item); 
            
            
        } catch (ParseException ex) {
            Logger.getLogger(AddNewJobFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
                       
             
                
        
           
                       
     
  // txtDeadline.setDate(datD);
    /*    try {
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            int index = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy.MM.d").parse((String)model.getValueAt(index,0));
            txtOrderDate.setDate(dateO);
        } catch (ParseException e) {
            //Logger.getAnonymousLogger(VMDescriptor.JAVA_CLASS_FORMAT_MAJOR_VERSION);
           // Logger.getAnonymousLogger(AddNewJobFrame.class.getName()).log(Level.SEVERE);
        }
    
    */
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtClientKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientKeyReleased
    String PATTERN="^[-/+*()' 'a-zA-Z0-9+]{0,25}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(txtClient.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Client");
        //clearFields();
       txtClient.setText("");
        }
    
    }//GEN-LAST:event_txtClientKeyReleased

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
/*
        int x =  JOptionPane.showConfirmDialog(null, "Do you really want to update");
       if(x==0)
       {
         String R = Rnum.getText();
         String job = txtJobNumber.getText();
        String des = txtDescription.getText();
        String Item = ItemNo.getSelectedItem().toString();
        String client = txtClient.getText();
        String datO = txtOrderDate.getDateFormatString();
         String datD = txtDeadline.getDateFormatString();
          String Loca = txtLocation.getText();
        String q = txtQuantity.getText();

  //String sql = "UPDATE orders SET   txtDescription='"+des+"',ItemNo='"+Item+"',txtClient='"+client+"',txtOrderDate='"+datO+"',txtDeadline='"+datD+"',txtLocation='"+Loca+"',txtQuantity='"+q+"' WHERE txtJobNumber ='"+job+"'";
          String sql = "UPDATE orders SET request_number='"+R+"',txtDescription='"+des+"',ItemNo='"+Item+"',txtClient='"+client+"',txtOrderDate='"+datO+"',txtDeadline='"+datD+"',txtLocation='"+Loca+"',txtQuantity='"+q+"' WHERE txtJobNumber ='"+job+"'";
            try {
                 pst = con.prepareStatement(sql);
                 pst.execute();
                  //tebleload();
            } catch (Exception e) {
            }
       }
        */
  // String sql="UPDATE orders SET txtDescription=?,to_be_deliver=?,daily_target=?,to_be_cast=? WHERE job_number= '"+des+"' && item_number= '"+setitemno+"'";     

        
    }//GEN-LAST:event_UpdateActionPerformed

    private void txtDescriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescriptionKeyPressed
        int key=evt.getKeyCode();
        if(key==40){
            ItemNo.requestFocus();
            
        }
    }//GEN-LAST:event_txtDescriptionKeyPressed

    private void ItemNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ItemNoKeyPressed
      int key=evt.getKeyCode();
        if(key==40){
            txtClient.requestFocus();
            
        }
    }//GEN-LAST:event_ItemNoKeyPressed

    private void txtJobNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtJobNumberKeyPressed
       int key=evt.getKeyCode();
        if(key==40){
            txtLocation.requestFocus();
            
        }
    }//GEN-LAST:event_txtJobNumberKeyPressed

    private void txtLocationKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLocationKeyPressed
        int key=evt.getKeyCode();
        if(key==40){
             txtJobNumber.requestFocus();
            
        }
    }//GEN-LAST:event_txtLocationKeyPressed

    private void txtClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientKeyPressed
       int key=evt.getKeyCode();
        if(key==40){
             txtOrderDate.requestFocus();
            
        }
    }//GEN-LAST:event_txtClientKeyPressed

    private void txtOrderDateKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOrderDateKeyPressed
         int key=evt.getKeyCode();
        if(key==40){
             txtDescription.requestFocus();
            
        }
    }//GEN-LAST:event_txtOrderDateKeyPressed
        
    void clearFields(){
    
    txtClient.setText("");
   // txtDeadline.setText("");
   txtDescription.setText("");
    //ItemNo.setText("");
    txtJobNumber.setText("");
    txtLocation.setText("");
   // txtOrderDate.setText("");
    txtQuantity.setText("");
    txtOrderDate.setCalendar(null);
       txtDeadline.setCalendar(null);
         ItemNo.setSelectedIndex(0);
    }
   
    int getDifferenceDays(Date d1,Date d2){
    int dayDiff;
    long diff=d2.getTime()-d1.getTime();
    long diffDays=diff/(24*60*60*1000);
    dayDiff=(int)diffDays;
    return dayDiff;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ItemNo;
    private javax.swing.JLabel Rnum;
    private javax.swing.JButton Update;
    private javax.swing.JButton btnAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtClient;
    private com.toedter.calendar.JDateChooser txtDeadline;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtJobNumber;
    private javax.swing.JTextField txtLocation;
    private com.toedter.calendar.JDateChooser txtOrderDate;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
