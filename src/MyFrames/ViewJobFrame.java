/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyFrames;

import MyFrames.Mypanels.DeleteCompletedOrders;
import MyFrames.Mypanels.OnGoingOrders;
import MyFrames.Mypanels.OrdersTimeline;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ViewJobFrame extends javax.swing.JInternalFrame {
 
    GridBagLayout layout = new GridBagLayout();
    OnGoingOrders p1;
    DeleteCompletedOrders p2;
    OrdersTimeline p3;
    
    public ViewJobFrame() {
        initComponents();
        p1 = new OnGoingOrders();
        p2 = new DeleteCompletedOrders();
        p3 = new OrdersTimeline();
        Dynamicpannel.setLayout(layout);
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        Dynamicpannel.add(p1,c);
        c.gridx = 0;
        c.gridy = 0;
        Dynamicpannel.add(p2,c);
        c.gridx = 0;
        c.gridy = 0;
        Dynamicpannel.add(p3,c);
        p1.setVisible(true);
        p2.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonPannel = new javax.swing.JPanel();
        btnView = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Dynamicpannel = new javax.swing.JPanel();

        setClosable(true);
        setTitle("On Going Projects");

        ButtonPannel.setBackground(new java.awt.Color(255, 255, 255));

        btnView.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ButtonPannelLayout = new javax.swing.GroupLayout(ButtonPannel);
        ButtonPannel.setLayout(ButtonPannelLayout);
        ButtonPannelLayout.setHorizontalGroup(
            ButtonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPannelLayout.createSequentialGroup()
                .addGroup(ButtonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        ButtonPannelLayout.setVerticalGroup(
            ButtonPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPannelLayout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(251, Short.MAX_VALUE))
        );

        getContentPane().add(ButtonPannel, java.awt.BorderLayout.LINE_START);

        Dynamicpannel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Dynamicpannel.setPreferredSize(new java.awt.Dimension(1795, 800));

        javax.swing.GroupLayout DynamicpannelLayout = new javax.swing.GroupLayout(Dynamicpannel);
        Dynamicpannel.setLayout(DynamicpannelLayout);
        DynamicpannelLayout.setHorizontalGroup(
            DynamicpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1177, Short.MAX_VALUE)
        );
        DynamicpannelLayout.setVerticalGroup(
            DynamicpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 674, Short.MAX_VALUE)
        );

        getContentPane().add(Dynamicpannel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        p1.setVisible(true);
        p2.setVisible(false);
        p3.setVisible(false);
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        p2.setVisible(true);
        p1.setVisible(false);
        p3.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPannel;
    private javax.swing.JPanel Dynamicpannel;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
