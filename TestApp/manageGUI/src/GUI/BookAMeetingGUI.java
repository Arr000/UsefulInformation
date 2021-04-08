/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import oru.inf.InfException;

/**
 *
 * @author nene5
 */
public class BookAMeetingGUI extends javax.swing.JFrame {

      ArrayList<Employee> Employees = new ArrayList<>();
      private Employee customer;      
    /**
     * Creates new form BookAMeetingGUI
     */
    public BookAMeetingGUI(Employee c) {
        initComponents();
        fillMyListEmployee();
        this.customer = c;
    }

    private BookAMeetingGUI() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void fillMyListEmployee()
    {
        var kunddb = new KundDB();
        
        var AllEmployees = kunddb.getEmployees();
        DefaultListModel employeelist = new DefaultListModel();
        listEmployee.setModel(employeelist);
        for(int i = 0; i < AllEmployees.size(); i++)
        {
            employeelist.add(i, AllEmployees.get(i).getforNamn());
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPlats = new javax.swing.JTextField();
        txtTid = new javax.swing.JTextField();
        txtDatum = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listEmployee = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        List_employeeForMeeting = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPlats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlatsActionPerformed(evt);
            }
        });

        jLabel1.setText("Plats");

        jLabel2.setText("Tid");

        jLabel3.setText("Datum");

        jLabel4.setText("Book a Meeting");

        jScrollPane1.setViewportView(listEmployee);

        jScrollPane2.setViewportView(List_employeeForMeeting);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SendRequest");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlats, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(txtTid)
                            .addComponent(txtDatum))
                        .addContainerGap(434, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addGap(66, 66, 66)
                .addComponent(jButton2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            var employeIndex = listEmployee.getSelectedIndex();
            var employeeID = employeIndex+1;
            
            DataBasAcess.Connect();
            var empQuery = "SELECT * FROM EMPLOYEE WHERE ID = " + employeeID + "";
            var result = DataBasAcess.getidb().fetchRow(empQuery);
          
            if(result != null)
            {
               var selectedFornamn = result.get("FORNAMN");
               var selectedEfternamn = result.get("EFTERNAMN");
               var selectedID = String.valueOf(result.get("ID"));
               
               var employe = new Employee(Integer.parseInt(selectedID), selectedFornamn, selectedEfternamn);
               
               DefaultListModel employeelist = new DefaultListModel();
               List_employeeForMeeting.setModel(employeelist);
               
               Employees.add(employe);
               
               for(int i = 0 ; i< Employees.size(); i++)
               {
                   employeelist.add(i, Employees.get(i).getforNamn());
               }
               
            }
            
        } catch (InfException ex) {
            Logger.getLogger(BookAMeetingGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
          try {
         
              var maxid = 0;
              var plats = txtPlats.getText();
              var tid = txtTid.getText(); 
              var datum = txtDatum.getText();
              var meetings = new ArrayList<Meeting>();
              DataBasAcess.Connect();
              
              for(int i = 0 ; i < Employees.size(); i ++)
              {
                  maxid = Meeting.getMaxID() + 1;
                  var selectedID = Employees.get(i).getID();
                  var meeting = new Meeting(maxid, plats, datum, tid, selectedID);
                  meetings.add(meeting);
                  
                   var bookMeetingQuery = "INSERT INTO MEETING (ID, PLATS, TID, DATUM, EMPLOYEEID) VALUES ( " + maxid + "," + DataBasAcess.MakeDBString(meetings.get(i).getPlats()) + "," + DataBasAcess.MakeDBString(meetings.get(i).getTid()) + "," + DataBasAcess.MakeDBString(meetings.get(i).getDate()) + "," + selectedID + ")";
                   DataBasAcess.getidb().insert(bookMeetingQuery);
                 
              }
              
          } catch (InfException ex) {
              Logger.getLogger(BookAMeetingGUI.class.getName()).log(Level.SEVERE, null, ex);
          }
              
        
             
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtPlatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlatsActionPerformed

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
            java.util.logging.Logger.getLogger(BookAMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookAMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookAMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookAMeetingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAMeetingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> List_employeeForMeeting;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listEmployee;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtPlats;
    private javax.swing.JTextField txtTid;
    // End of variables declaration//GEN-END:variables
}
