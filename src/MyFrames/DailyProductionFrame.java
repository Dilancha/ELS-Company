/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import Model.Reports;
import Model.Stocks;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class DailyProductionFrame extends javax.swing.JInternalFrame {

   //db connection setup
    String url="jdbc:mysql://localhost:3306/els";
    String username="root";
    String password="";
    Connection con=null;
    Statement st1=null;
    ResultSet rs1=null;
    Statement st2=null;
    ResultSet rs2=null;
    
    
    public DailyProductionFrame() {
        initComponents();
    }
    
    public ArrayList<Stocks> dailyProduction(Reports r){
        ArrayList<Stocks> productionList=new ArrayList<>();
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con=(Connection) DriverManager.getConnection(url,username,password);
            String query1="SELECT * FROM stocks";
            st1=(Statement) con.createStatement();
            rs1=st1.executeQuery(query1);
            while(rs1.next()){
                Stocks s = new Stocks();
                s.setItemNO(rs1.getString("item_number"));
                s.setDescription(rs1.getString("description"));
                try{
                    String query2="SELECT `"+s.getItemNO()+"` FROM report WHERE Date='"+r.getDate()+"'";
                    st2=(Statement) con.createStatement();
                    rs2=st2.executeQuery(query2);
                    while(rs2.next()){
                    s.setQty(rs2.getInt(s.getItemNO()));
                    if(s.getQty()>0){
                    productionList.add(s);
                     }
                    }
                }catch(Exception e){
                    System.out.println("Exception -->"+e);
                
                }
                
            }
        }catch(Exception e){
            System.out.println("exception -->"+e);
        }
        
    return productionList;
    } 
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_production_report = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDate = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Daily Production Report");
        setPreferredSize(new java.awt.Dimension(1895, 800));

        jTable_production_report.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable_production_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Description", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(jTable_production_report);

        btnSearch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Enter Date Here :");

        txtDate.setDateFormatString("yyyy.MM.d");
        txtDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
  //String date=txtDate.getText();
         DateFormat df = new SimpleDateFormat("yyyy.MM.d");
           // report.setOrderDate(txtOrderDate.getJCalendar());//new
            Date today = (Date) txtDate.getDate(); 
            String reportDate1 = df.format(today);
            
        Reports report = new Reports();
        //report.setDate(txtDate.getText());
        report.setDate(reportDate1);
        ArrayList<Stocks> list=dailyProduction(report);
        DefaultTableModel model=(DefaultTableModel)jTable_production_report.getModel();
        int rowCount = model.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
        model.removeRow(i);
        }
        Object[] row=new Object[3];
        for(int i=0;i<list.size();i++){
        row[0]=list.get(i).getItemNO();
        row[1]=list.get(i).getDescription();
        row[2]=list.get(i).getQty();
        model.addRow(row);
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_production_report;
    private com.toedter.calendar.JDateChooser txtDate;
    // End of variables declaration//GEN-END:variables
}
