/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import Model.Orders;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class DailyProductionProgress extends javax.swing.JInternalFrame {
    //data to calculate date,target
    int dailyTarget=0;
    int duration=0;
    int remaining;
    int casted;
    
    
    //db connection settings
    String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st=null;
    ResultSet rs=null;
    
    /**
     * Creates new form DailyProductionProgress
     */
    public DailyProductionProgress() {
        initComponents();
        showDailyProductionProgressReport();
        jTable_daily_production_progress_report.getTableHeader().setFont(new Font("Times New Roman",Font.BOLD,20));
    }
    
    /*
    public ArrayList<Orders> ordersList(){
       
        //////////////////////////////////////////////////////////
        
        ArrayList<Orders> StocksList=new ArrayList<>();
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=(Connection) DriverManager.getConnection(url,username,password);
        String query="SELECT * FROM orders WHERE is_deleted=0";
        st=(Statement)con.createStatement();
        rs=st.executeQuery(query);
        while(rs.next()){
        Orders o=new Orders();
        o.setJobNumber(rs.getString("job_number"));
        o.setItemNo(rs.getString("item_number"));
        o.setDescription(rs.getString("description"));
    
        o.setOrderDate(rs.getString("order_date"));
        o.setDeadline(rs.getString("deadline"));
        o.setToBeCast(rs.getInt("to_be_cast"));
        //calculate the daily target
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.d");
             //DateFormat format = new SimpleDateFormat("yyyy.MM.d");
             //SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.d");
            //calculate duration
            String date1 =o.getOrderDate();
            String date2 =o.getDeadline();
            Date d1=format.parse(date1);
            Date d2=format.parse(date2);
            duration=getDifferenceDays(d1,d2);
             System.out.println("remainnnnnnnnnnnnnnnnnnnnnnnnnng222222222222");
            //System.out.println(duration);
            o.setDuration(duration);
            //getCurrentDate
            long millis=System.currentTimeMillis();
             //SimpleDateFormat format1 = new SimpleDateFormat("yyyy.MM.d");
            java.sql.Date date=new java.sql.Date(millis);
            //Date d10=format1.parse(date);
            
            // date=new java.sql.Date(millis);
            
            long yourmilliseconds = System.currentTimeMillis();
SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.d");    
Date resultdate = new Date(yourmilliseconds);
System.out.println(resultdate);
System.out.println(sdf.format(resultdate));

DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.d"); 
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
            //Date d10 = (Date)sdf.format(resultdate);
            
           
            //calculate remaining
            remaining= getDifferenceDays(dtf, d2)+1; 
            System.out.println("remainnnnnnnnnnnnnnnnnnnnnnnnnng");
            System.out.println(remaining);
            
                  System.out.println(date);     
                  System.out.println(d2);
                  
            o.setRemaining(remaining);
            //calculate daily target
            
            dailyTarget=(int) o.getToBeCast()/remaining;
           // dailyTarget=(int) o.getToBeCast()/10;
            o.setDailyTarget(dailyTarget);
            o.setQuantity(rs.getInt("qty"));
            //calculate casted
            casted=o.getQuantity()-o.getToBeCast();
            o.setCasted(casted);
            StocksList.add(o);
           
        }
     
    }catch(Exception e){
        System.out.println("Exception -->"+e);
        
    }
    return StocksList;
   
    /////////////////////////////////////////////////////////////////////////////
    
    }
    */
    
    //PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP
     
    public ArrayList<Orders> ordersList(){
        ArrayList<Orders> StocksList=new ArrayList<>();
    try{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        con=(Connection) DriverManager.getConnection(url,username,password);
        String query="SELECT * FROM orders WHERE is_deleted=0";
        st=(Statement)con.createStatement();
        rs=st.executeQuery(query);
        while(rs.next()){
        Orders o=new Orders();
        o.setJobNumber(rs.getString("job_number"));
        o.setItemNo(rs.getString("item_number"));
        o.setDescription(rs.getString("description"));
        o.setOrderDate(rs.getString("order_date"));
        o.setDeadline(rs.getString("deadline"));
        o.setToBeCast(rs.getInt("to_be_cast"));
        //calculate the daily target
            SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.d");
            //calculate duration
            String date1 =o.getOrderDate();
            String date2 =o.getDeadline();
            Date d1=format.parse(date1);
            Date d2=format.parse(date2);
            duration=getDifferenceDays(d1,d2);
            o.setDuration(duration);
            //getCurrentDate
            long millis=System.currentTimeMillis();  
            java.sql.Date date=new java.sql.Date(millis);
           
            //calculate remaining
            remaining=getDifferenceDays(date, d2)+1;
            o.setRemaining(remaining);
            //calculate daily target
            dailyTarget=(int) o.getToBeCast()/remaining;
            o.setDailyTarget(dailyTarget);
            o.setQuantity(rs.getInt("qty"));
            //calculate casted
            casted=o.getQuantity()-o.getToBeCast();
            o.setCasted(casted);
            StocksList.add(o);
           
        }
     
    }catch(Exception e){
        System.out.println("Exception -->"+e);
        
    }
    return StocksList;
    }
    //ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppppp
    
    int getDifferenceDays(Date d1,Date d2){
    int dayDiff;
    long diff=d2.getTime()-d1.getTime();
    long diffDays=diff/(24*60*60*1000);
    dayDiff=(int)diffDays;
    return dayDiff;
    }
    
    public void showDailyProductionProgressReport(){
    
        ArrayList<Orders> list=ordersList();
        DefaultTableModel model=(DefaultTableModel)jTable_daily_production_progress_report.getModel();
        Object[] row=new Object[11];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getJobNumber();
        row[1]=list.get(i).getItemNo();
        row[2]=list.get(i).getDescription();
        row[3]=list.get(i).getOrderDate();
        row[4]=list.get(i).getDeadline();
        row[5]=list.get(i).getDuration();
        row[6]=list.get(i).getRemaining();
        row[7]=list.get(i).getQuantity();
        row[8]=list.get(i).getCasted();
        row[9]=list.get(i).getDailyTarget();
        row[10]=list.get(i).getToBeCast();
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
        jTable_daily_production_progress_report = new javax.swing.JTable();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setResizable(true);
        setAutoscrolls(true);
        setFocusable(false);
        setPreferredSize(new java.awt.Dimension(1920, 800));
        setVisible(false);

        jTable_daily_production_progress_report.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable_daily_production_progress_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Job Number", "Item Number", "Description", "Start Date", "Deadline", "Duration", "Remaining", "Order Quantity", "Casted", "Daily Target", "To Be Cast"
            }
        ));
        jTable_daily_production_progress_report.setMaximumSize(new java.awt.Dimension(500, 100));
        jTable_daily_production_progress_report.setMinimumSize(new java.awt.Dimension(180, 100));
        jScrollPane1.setViewportView(jTable_daily_production_progress_report);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1893, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_daily_production_progress_report;
    // End of variables declaration//GEN-END:variables
}
