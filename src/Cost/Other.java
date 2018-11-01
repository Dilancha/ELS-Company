/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cost;

import Model.Reports;
import Model.Stocks;
import static java.awt.PageAttributes.MediaType.C;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Bimalka
 */
public class Other extends javax.swing.JInternalFrame {

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
    Connection con =null;
 PreparedStatement pst = null;
    public Other() {
        initComponents();
    }
    
    
    public Other (String para){
        initComponents();
    w.setText(para);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        w = new javax.swing.JTextField();
        x = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JButton();
        a4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JButton();
        c4 = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        d3 = new javax.swing.JButton();
        d4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        e1 = new javax.swing.JTextField();
        e2 = new javax.swing.JTextField();
        e3 = new javax.swing.JButton();
        e4 = new javax.swing.JTextField();
        f3 = new javax.swing.JButton();
        f2 = new javax.swing.JTextField();
        f1 = new javax.swing.JButton();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JTextField();
        qq = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(1920, 800));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Item Number");

        w.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        w.setText("         ");
        w.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wActionPerformed(evt);
            }
        });
        w.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                wKeyTyped(evt);
            }
        });

        x.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        x.setText("Start");
        x.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Prasantage(%)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText(" New Cost");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Tax");

        a1.setEditable(false);
        a1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a1.setPreferredSize(new java.awt.Dimension(7, 35));
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        a1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a1KeyTyped(evt);
            }
        });

        a2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a2.setPreferredSize(new java.awt.Dimension(7, 35));
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        a2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a2KeyTyped(evt);
            }
        });

        a3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a3.setText("Genarate");
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        a3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a3KeyPressed(evt);
            }
        });

        a4.setEditable(false);
        a4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        a4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        a4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                a4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                a4KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                a4KeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Westage");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Discount");

        c1.setEditable(false);
        c1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c1.setPreferredSize(new java.awt.Dimension(7, 35));
        c1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c1KeyTyped(evt);
            }
        });

        c2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c2.setPreferredSize(new java.awt.Dimension(7, 35));
        c2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                c2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c2KeyTyped(evt);
            }
        });

        c3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c3.setText("Genarate");
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c4.setEditable(false);
        c4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        c4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                c4KeyTyped(evt);
            }
        });

        d1.setEditable(false);
        d1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d1.setPreferredSize(new java.awt.Dimension(7, 35));
        d1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                d1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d1KeyTyped(evt);
            }
        });

        d2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d2.setPreferredSize(new java.awt.Dimension(7, 35));
        d2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                d2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d2KeyTyped(evt);
            }
        });

        d3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d3.setText("Genarate");
        d3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d3ActionPerformed(evt);
            }
        });

        d4.setEditable(false);
        d4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        d4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                d4KeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Day Change");

        e1.setEditable(false);
        e1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e1.setPreferredSize(new java.awt.Dimension(7, 35));
        e1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e1ActionPerformed(evt);
            }
        });
        e1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                e1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                e1KeyTyped(evt);
            }
        });

        e2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e2.setPreferredSize(new java.awt.Dimension(7, 35));
        e2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                e2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                e2KeyTyped(evt);
            }
        });

        e3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e3.setText("Genarate");
        e3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e3ActionPerformed(evt);
            }
        });

        e4.setEditable(false);
        e4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                e4KeyTyped(evt);
            }
        });

        f3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        f3.setText("All Save");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });

        f2.setEditable(false);
        f2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        f2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                f2KeyTyped(evt);
            }
        });

        f1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        f1.setText("Total Value");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });

        b1.setEditable(false);
        b1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b1.setPreferredSize(new java.awt.Dimension(7, 35));
        b1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b1KeyTyped(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b2.setPreferredSize(new java.awt.Dimension(7, 35));
        b2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                b2KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b2KeyTyped(evt);
            }
        });

        b3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b3.setText("Genarate");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b4.setEditable(false);
        b4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        b4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                b4KeyTyped(evt);
            }
        });

        qq.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        qq.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "7068-0001-01-F", "7068-0001-02-F", "7068-0001-03-F", "7068-0001-04-F", "7068-0001-05-F", "7068-0001-06-F", "7068-0001-07-F", "7068-0001-08-F", "7068-0001-09-F", "7068-0001-10-F", "7068-0001-11-F", "7068-0001-12-F", "7068-0002-01-F", "7068-0002-02-F", "7068-0002-03-F", "7068-0002-04-F", "7068-0002-05-F", "7068-0002-06-F", "7068-0002-07-F", "7068-0002-08-F", "7068-0002-09-F", "7068-0002-10-F", "7068-0002-11-F", "7068-0002-12-F", "7068-0002-13-F", "7068-0002-14-F", "7068-0002-15-F", "7068-0002-16-F", "7068-0002-17-F", "7068-0002-18-F", "7068-0002-19-F", "7068-0002-20-F", "7068-0002-21-F", "7068-0002-22-F", "7068-0003-01-F", "7068-0003-02-F", "7068-0003-03-F", "7068-0003-04-F", "7068-0003-01-F", "7068-0003-01-F", "7068-0004-01-F", "7068-0004-02-F", "7068-0004-03-F", "7068-0005-01-F", "7068-0005-02-F", "7068-0005-03-F", "7068-0005-04-F", "7068-0005-05-F", "7068-0005-06-F", "7068-0005-07-F", "7068-0005-08-F", "7068-0005-09-F", "7068-0005-10-F", "7068-0005-11-F", "7068-0005-12-F", "7068-0005-13-F", "7068-0005-14-F", "7068-0005-15-F", "7068-0005-16-F", "7068-0005-17-F", "7068-0005-18-F", "7068-0005-19-F", "7068-0005-20-F", "7068-0005-21-F", "7068-0005-22-F", "7068-0005-23-F", "7068-0005-24-F", "7068-0005-25-F", "7068-0005-26-F", "7068-0005-27-F", "7068-0005-28-F", "7068-0005-29-F", "7068-0005-30-F", "7068-0005-31-F", "7068-0005-32-F", "7068-0005-33-F", "7068-0005-34-F", "7068-0005-35-F", "7068-0005-36-F", "7068-0005-37-F", "7068-0005-38-F", "7068-0005-39-F", "7068-0005-40-F", "7068-0005-41-F", "7068-0005-42-F", "7068-0005-43-F", "7068-0005-44-F", "7068-0005-45-F", "7068-0005-46-F", "7068-0005-47-F", "7068-0005-48-F", "7068-0005-49-F", "7068-0005-50-F", "7068-0005-51-F", "7068-0005-52-F", "7068-0005-53-F", "7068-0005-54-F", "7068-0005-55-F", "7068-0005-56-F", "7068-0005-57-F", "7068-0005-58-F", "7068-0005-59-F", "7068-0006-01-F", "7068-0006-02-F", "7068-0006-03-F", "7068-0006-04-F", "7068-0006-05-F", "7068-0006-06-F", "7068-0007-01-F", "7068-0007-02-F", "7068-0007-03-F", "7068-0007-04-F", "7068-0007-05-F", "7068-0007-06-F", "7068-0007-07-F", "7068-0007-08-F", "7068-0007-09-F", "7068-0007-10-F", "7068-0007-11-F", "7068-0007-12-F", "7068-0008-01-F", "7068-0008-02-F", "7068-0008-03-F", "7068-0008-04-F", "7068-0008-05-F", "7068-0008-06-F", "7068-0008-07-F", "7068-0008-08-F", "7068-0008-09-F", "7068-0008-10-F", "7068-0008-11-F", "7068-0008-12-F", "7068-0008-13-F", "7068-0008-14-F", "7068-0008-15-F", "7068-0008-16-F", "7068-0008-17-F", "7068-0008-18-F", "7068-0008-19-F", "7068-0008-20-F", "7068-0008-21-F", "7068-0008-22-F", "7068-0008-23-F", "7068-0008-24-F", "7068-0008-25-F", "7068-0008-26-F", "7068-0008-27-F", "7068-0008-28-F", "7068-0008-29-F", "7068-0008-30-F", "7068-0008-31-F", "7068-0008-32-F", "7068-0008-33-F", "7068-0008-34-F", "7068-0008-35-F", "7068-0008-36-F", "7068-0008-37-F", "7068-0008-38-F", "7068-0008-39-F", "7068-0008-40-F", "7068-0008-41-F", "7068-0008-42-F", "7068-0008-43-F", "7068-0008-44-F", "7068-0008-45-F", "7068-0008-46-F", "7068-0008-47-F", "7068-0008-48-F", "7068-0008-49-F", "7068-0008-50-F", "7068-0008-51-F", "7068-0009-01-F", "7068-0009-02-F", "7068-0009-03-F", "7068-0009-04-F", "7068-0009-05-F", "7068-0009-06-F", "7068-0009-07-F", "7068-0010-01-F", "7068-0010-02-F", "7068-0010-03-F", "7068-0010-04-F", "7068-0010-05-F", "7068-0011-01-F", "7068-0011-02-F", "7068-0011-03-F", "7068-0011-04-F", "7068-0011-05-F", "7068-0011-06-F", "7068-0011-07-F", "7068-0011-08-F", "7068-0011-09-F", "7068-0011-10-F", "7068-0011-11-F", "7068-0011-12-F", "7068-0011-13-F", "7068-0011-14-F", "7068-0011-15-F", "7068-0011-16-F", "7068-0011-17-F", "7068-0011-18-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0012-01-F", "7068-0013-01-F", "7068-0013-02-F", "7068-0013-03-F", "7068-0013-04-F", "7068-0013-05-F", "7068-0013-06-F", "7068-0013-07-F", "7068-0013-08-F", "7068-0013-09-F", "7068-0013-10-F", "7068-0013-11-F", "7068-0013-12-F", "7068-0013-13-F", "7068-0013-14-F", "7068-0013-15-F", "7068-0013-16-F", "7068-0013-17-F", "7068-0013-18-F", "7068-0014-01-F", "7068-0014-02-F", "7068-0014-03-F", "7068-0014-04-F", "7068-0014-05-F", "7068-0014-06-F", "7068-0014-07-F", "7068-0014-08-F", "7068-0014-09-F", "7068-0014-10-F", "7068-0014-11-F", "7068-0014-12-F", "7068-0014-13-F", "7068-0014-14-F", "7068-0015-01-F", "7068-0015-02-F", "7068-0015-03-F", "7068-0015-04-F", "7068-0015-05-F", "7068-0015-06-F", "7068-0015-07-F", "7068-0015-08-F", "7068-0015-09-F", "7068-0015-10-F", "7068-0015-11-F", "7068-0015-12-F", "7068-0015-13-F", "7068-0015-14-F", "7068-0015-15-F", "7068-0016-01-F", "7068-0016-02-F", "7068-0016-03-F", "7068-0016-04-F", "7068-0016-05-F", "7068-0017-01-F", "7068-0017-02-F", "7068-0017-03-F", "7068-0017-04-F", "7068-0017-05-F", "7068-0017-06-F", "7068-0017-07-F", "7068-0017-08-F", "7068-0017-09-F", "7068-0017-10-F", "7068-0017-11-F", "7068-0017-12-F", "7068-0017-13-F", "7068-0017-14-F", "7068-0017-15-F", "7068-0017-16-F", "7068-0017-17-F", "7068-0017-18-F", "7068-0017-19-F", "7068-0017-20-F", "7068-0017-21-F", "7068-0017-22-F", "7068-0017-23-F", "7068-0017-24-F", "7068-0017-25-F", "7068-0017-26-F", " " }));
        qq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qqActionPerformed(evt);
            }
        });
        qq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                qqKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Extra");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(694, 694, 694)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(qq, 0, 195, Short.MAX_VALUE)
                .addGap(810, 810, 810))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d1, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addComponent(e1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(201, 201, 201))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(a1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(w, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))))
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a2, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(e2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(e3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(d3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(c3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f3, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(f2)
                    .addComponent(e4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(d4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(c4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(a4)
                    .addComponent(b4))
                .addGap(301, 301, 301))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(qq, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(w, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3)
                    .addComponent(a4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c3)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d3)
                    .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(f1)
                    .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(f3)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed

    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        double d =Double.parseDouble(a1.getText());
        double e =Double.parseDouble(a2.getText());
        DecimalFormat df = new DecimalFormat("#.###");
        e=Double.parseDouble(df.format(e));
        d=Double.parseDouble(df.format(d));

        double f=((d*e)/100.00)+d;
        f=Double.parseDouble(df.format(f));
        a4.setText(f+"" );
        
         String ww,aa1;
      ww = w.getText();
      b1.setText(ww);

    }//GEN-LAST:event_a3ActionPerformed

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a4ActionPerformed
        //       DecimalFormat a4 = new DecimalFormat("0.00");

        //double d = .3;

        //System.out.println(df.format(d));

    }//GEN-LAST:event_a4ActionPerformed

    private void a4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a4KeyReleased

    }//GEN-LAST:event_a4KeyReleased

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        double d =Double.parseDouble(c1.getText());
        double e =Double.parseDouble(c2.getText());
        DecimalFormat df = new DecimalFormat("#.###");
        e=Double.parseDouble(df.format(e));
        d=Double.parseDouble(df.format(d));
        double f=((d*e)/100.00)+d;
        f=Double.parseDouble(df.format(f));
        c4.setText(f+"" );
        
        
        String ww,aa1;
      ww = w.getText();
      d1.setText(ww);
    }//GEN-LAST:event_c3ActionPerformed

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c4ActionPerformed

    private void d3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d3ActionPerformed
         double d =Double.parseDouble(d1.getText());
      double e =Double.parseDouble(d2.getText());
           DecimalFormat df = new DecimalFormat("#.###");
        e=Double.parseDouble(df.format(e));
        d=Double.parseDouble(df.format(d));
         double f=((d*e)/100.00)+d;
         f=Double.parseDouble(df.format(f));
        d4.setText(f+"" );
        
          String ww,aa1;
      ww = w.getText();
      e1.setText(ww);
    }//GEN-LAST:event_d3ActionPerformed

    private void e1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e1ActionPerformed

    private void e3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e3ActionPerformed
        double d =Double.parseDouble(e1.getText());
        double e =Double.parseDouble(e2.getText());
        DecimalFormat df = new DecimalFormat("#.###");
        e=Double.parseDouble(df.format(e));
        d=Double.parseDouble(df.format(d));
        double f=((d*e)/100.00)+d;
        f=Double.parseDouble(df.format(f));
        e4.setText(f+"" );
    }//GEN-LAST:event_e3ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed

        String Itemnumber = qq.getSelectedItem().toString();
        String Tax = a4.getText();
        String Wasetage = b4.getText();
        String Discount = c4.getText();
        String Day_change = d4.getText();
        String Extra = e4.getText();
        String Total = f2.getText();

        try {
            String  q ="INSERT INTO other(Item_Number,Tax,Westage,Discount,Day_change,Extra,Total_value)"+
            "VALUES ('"+Itemnumber+"','"+Tax+"','"+Wasetage+"','"+Discount+"','"+Day_change+"','"+Extra+"','"+Total+"')";
              con = DriverManager.getConnection("jdbc:mysql://localhost/els?autoReconnect=true&useSSL=false","root","");

            pst = con.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(null, "inserted successfully");
        } catch (Exception e) {
        }
        
         e1.setText(" ");
        e2.setText(" ");
         a1.setText(" ");
        a2.setText(" ");
        b1.setText(" ");
        b2.setText(" ");
         c1.setText(" ");
        c2.setText(" ");
        d1.setText(" ");
        d2.setText(" ");
        e1.setText(" ");
        e2.setText(" ");
         a4.setText(" ");
        b4.setText(" ");
        c4.setText(" ");
        d4.setText(" ");
         e4.setText(" ");
     
         w.setText(" ");
        f2.setText(" ");
        
    }//GEN-LAST:event_f3ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f2ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
      /*
        
        double d12 =Double.parseDouble(w.getText());
        double d1 =Double.parseDouble(a4.getText());
        double e1 =Double.parseDouble(b4.getText());
        double g1 =Double.parseDouble(c4.getText());
        double h1 =Double.parseDouble(d4.getText());
        double i1 =Double.parseDouble(e4.getText());
        double f1=(d1+e1+g1+i1+h1)-(4*d12);
        DecimalFormat df = new DecimalFormat("#.###");
        f1=Double.parseDouble(df.format(f1));
        f2.setText(f1+"" );
              */
         float d12 =(float) Double.parseDouble(w.getText());
        double d1 =Double.parseDouble(a4.getText());
        double e1 =Double.parseDouble(b4.getText());
        double g1 =Double.parseDouble(c4.getText());
        double h1 =Double.parseDouble(d4.getText());
        double i1 =Double.parseDouble(e4.getText());
        double f1=(d1+e1+g1+i1+h1)-(4*d12);
        DecimalFormat df = new DecimalFormat("#.###");
        f1=Double.parseDouble(df.format(f1));
        f2.setText(f1+"" );
    }//GEN-LAST:event_f1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        double d =Double.parseDouble(b1.getText());
        double e =Double.parseDouble(b2.getText());
        DecimalFormat df = new DecimalFormat("#.###");
        e=Double.parseDouble(df.format(e));
        d=Double.parseDouble(df.format(d));
        double f=((d*e)/100.00)+d;
        f=Double.parseDouble(df.format(f));
        b4.setText(f+"" );
        
        String ww,aa1;
      ww = w.getText();
      c1.setText(ww);
        
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b4ActionPerformed

    private void qqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qqActionPerformed

    private void qqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qqKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_qqKeyReleased

    private void xActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xActionPerformed
      String ww,aa1;
      ww = w.getText();
      a1.setText(ww);
    }//GEN-LAST:event_xActionPerformed

    private void wActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wActionPerformed

    private void wKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wKeyReleased
       String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(w.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       w.setText("");
          }
    }//GEN-LAST:event_wKeyReleased

    private void wKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wKeyTyped
     char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_wKeyTyped

    private void a1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyTyped
    char a=evt.getKeyChar();
        if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_a1KeyTyped

    private void b1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyTyped
       char a=evt.getKeyChar();
        if(!(Character.isDigit(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        
        evt.consume();
        }
    }//GEN-LAST:event_b1KeyTyped

    private void c1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_c1KeyTyped

    private void d1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_d1KeyTyped

    private void e1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e1KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_e1KeyTyped

    private void a2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a2KeyTyped
     char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_a2KeyTyped

    private void b2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_b2KeyTyped

    private void c2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_c2KeyTyped

    private void d2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2KeyTyped
      char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_d2KeyTyped

    private void e2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e2KeyTyped
      char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_e2KeyTyped

    private void a4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a4KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_a4KeyTyped

    private void b4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b4KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_b4KeyTyped

    private void c4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c4KeyTyped
       char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_c4KeyTyped

    private void d4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d4KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_d4KeyTyped

    private void e4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e4KeyTyped
       char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_e4KeyTyped

    private void f2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_f2KeyTyped
        char a=evt.getKeyChar();
        if(!(Character.isBmpCodePoint(a) || (a==KeyEvent.VK_BACK_SPACE) || a==KeyEvent.VK_DELETE)){
        getToolkit().beep();
        evt.consume();
        }
    }//GEN-LAST:event_f2KeyTyped

    private void a1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a1KeyReleased
     String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(a1.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       a1.setText("");
          }
    }//GEN-LAST:event_a1KeyReleased

    private void b1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b1KeyReleased
        String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(b1.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       b1.setText("");
          }
    }//GEN-LAST:event_b1KeyReleased

    private void c1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c1KeyReleased
        String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(c1.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       c1.setText("");
          }
    }//GEN-LAST:event_c1KeyReleased

    private void d1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d1KeyReleased
        String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(d1.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       d1.setText("");
          }
    }//GEN-LAST:event_d1KeyReleased

    private void e1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e1KeyReleased
        String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(e1.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       e1.setText("");
          }
    }//GEN-LAST:event_e1KeyReleased

    private void a2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a2KeyReleased
        String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(a2.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       a2.setText("");
          }
    }//GEN-LAST:event_a2KeyReleased

    private void b2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_b2KeyReleased
         String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(b2.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       b2.setText("");
          }
    }//GEN-LAST:event_b2KeyReleased

    private void c2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_c2KeyReleased
         String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(c2.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       c2.setText("");
          }
    }//GEN-LAST:event_c2KeyReleased

    private void d2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_d2KeyReleased
         String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(d2.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       d2.setText("");
          }
    }//GEN-LAST:event_d2KeyReleased

    private void e2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_e2KeyReleased
         String PATTERN="^[.0-9+]{0,12}$";
        Pattern patjt=Pattern.compile(PATTERN);
        Matcher match=patjt.matcher(e2.getText());
        if(!match.matches())
        {
        JOptionPane.showMessageDialog(null, " invalid Quantity");
       e2.setText("");
          }
    }//GEN-LAST:event_e2KeyReleased

    private void a3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a3KeyPressed
      int key=evt.getKeyCode();
        if(key==13){
            a4.requestFocus();
        }
    }//GEN-LAST:event_a3KeyPressed

    private void a4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_a4KeyPressed
         int key=evt.getKeyCode();
        if(key==27){
            a3.requestFocus();
        }
    }//GEN-LAST:event_a4KeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JButton a3;
    private javax.swing.JTextField a4;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JButton b3;
    private javax.swing.JTextField b4;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JButton c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JButton d3;
    private javax.swing.JTextField d4;
    private javax.swing.JTextField e1;
    private javax.swing.JTextField e2;
    private javax.swing.JButton e3;
    private javax.swing.JTextField e4;
    private javax.swing.JButton f1;
    private javax.swing.JTextField f2;
    private javax.swing.JButton f3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox qq;
    private javax.swing.JTextField w;
    private javax.swing.JButton x;
    // End of variables declaration//GEN-END:variables
}
