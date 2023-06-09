/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author charm
 */

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class DisplayAllAdminCredentialsRecords_Frame extends javax.swing.JFrame {

    /**
     * Creates new form
     * DisplayARecordFromAdminInformationForModifyOrDelete_Frame
     */
    
    DBHelper dbh = new DBHelper();
    
    public DisplayAllAdminCredentialsRecords_Frame() {
        initComponents();
        try {
            dbh.ConnectDB();
        } catch (Exception ex) {
            Logger.getLogger(UserRegistration_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        showDate();
        showTime();
    }
    
    void showDate(){     
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        Datelbl.setText(Datelbl.getText()+sdf.format(d));
    }
    
    void showTime(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Timelbl.setText(Timelbl.getText()+sdf.format(d));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DisplayAllButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Timelbl = new javax.swing.JLabel();
        Datelbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        DisplayAllAdminCredentialsRecordsTable = new javax.swing.JScrollPane();
        displayAllAdminCredentialsRecords = new javax.swing.JTable();
        DisplayAllButton = new javax.swing.JButton();

        DisplayAllButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DisplayAllButton1.setText("DISPLAY");
        DisplayAllButton1.setName("DisplayAllButton"); // NOI18N
        DisplayAllButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        Timelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Timelbl.setText("Time: ");
        Timelbl.setName(""); // NOI18N

        Datelbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Datelbl.setText("Date: ");
        Datelbl.setName(""); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("Senior Citizen Financial Aid Distribribution Application");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Click Display Button to Display All Records of Admin Log-in Credentials  in the Database");

        DisplayAllAdminCredentialsRecordsTable.setName("DisplayAllAdminCredentialsRecordsTable"); // NOI18N

        displayAllAdminCredentialsRecords.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Number", "UserName", "Password"
            }
        ));
        displayAllAdminCredentialsRecords.setName("displayAllAdminCredentialsRecords"); // NOI18N
        DisplayAllAdminCredentialsRecordsTable.setViewportView(displayAllAdminCredentialsRecords);
        displayAllAdminCredentialsRecords.getAccessibleContext().setAccessibleName("displayAllAdminCredentialsRecords");

        DisplayAllButton.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        DisplayAllButton.setText("DISPLAY");
        DisplayAllButton.setName("DisplayAllButton"); // NOI18N
        DisplayAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(215, 215, 215)
                        .addComponent(Datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Timelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DisplayAllAdminCredentialsRecordsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 711, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(DisplayAllButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Datelbl)
                    .addComponent(Timelbl))
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DisplayAllButton)
                .addGap(18, 18, 18)
                .addComponent(DisplayAllAdminCredentialsRecordsTable, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        DisplayAllAdminCredentialsRecordsTable.getAccessibleContext().setAccessibleName("DisplayAllAdminCredentialsRecordsTable");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DisplayAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllButtonActionPerformed
        ResultSet rs = dbh.displayAllAdminCredentialsRecords();
        try {
            while (displayAllAdminCredentialsRecords.getRowCount()>0){
                ((DefaultTableModel) displayAllAdminCredentialsRecords.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            while(rs.next()){
                Object [] row = new Object [columns];
                for(int i=1; i<=columns; i++){
                    row[i-1] = rs.getObject(i);
                }
                ((DefaultTableModel) displayAllAdminCredentialsRecords.getModel()).insertRow(rs.getRow()-1, row);
            }
        }catch (SQLException ex) {
            Logger.getLogger(DisplayAllUserInformationRecords_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DisplayAllButtonActionPerformed

    private void DisplayAllButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayAllButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DisplayAllAdminCredentialsRecords_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayAllAdminCredentialsRecords_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayAllAdminCredentialsRecords_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayAllAdminCredentialsRecords_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayAllAdminCredentialsRecords_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelbl;
    private javax.swing.JScrollPane DisplayAllAdminCredentialsRecordsTable;
    private javax.swing.JButton DisplayAllButton;
    private javax.swing.JButton DisplayAllButton1;
    private javax.swing.JLabel Timelbl;
    private javax.swing.JTable displayAllAdminCredentialsRecords;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
