/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playersapp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class PlayersGUI extends javax.swing.JFrame {

    private Players p;
    private ArrayList<Players> play;
    /**
     * Creates new form PlayersGUI
     */
    public PlayersGUI() {
        initComponents();
        play = new ArrayList<>();
        readFromFile();
        p = new Dota2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblWinrate = new javax.swing.JLabel();
        lblGGMain = new javax.swing.JLabel();
        lblGGController = new javax.swing.JLabel();
        lblGGSponsor = new javax.swing.JLabel();
        fldGGController = new javax.swing.JTextField();
        fldName = new javax.swing.JTextField();
        fldRegion = new javax.swing.JTextField();
        fldStatus = new javax.swing.JTextField();
        fldWinrate = new javax.swing.JTextField();
        fldGGMain = new javax.swing.JTextField();
        fldGGSponsor = new javax.swing.JTextField();
        cbGame = new javax.swing.JComboBox<>();
        lblD2Team = new javax.swing.JLabel();
        fldD2Team = new javax.swing.JTextField();
        lblD2Role = new javax.swing.JLabel();
        lblD2Sponsor = new javax.swing.JLabel();
        fldD2Role = new javax.swing.JTextField();
        fldD2Sponsor = new javax.swing.JTextField();
        btnEnter = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        lblTeamCS = new javax.swing.JLabel();
        fldTeamCS = new javax.swing.JTextField();
        fldRoleCS = new javax.swing.JTextField();
        fldSponsorCS = new javax.swing.JTextField();
        lblRoleCS = new javax.swing.JLabel();
        lblSponsorCS = new javax.swing.JLabel();
        lblD2Main = new javax.swing.JLabel();
        fldD2Main = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Player Details");

        lblName.setText("Name");

        lblRegion.setText("Region");

        lblStatus.setText("Status");

        lblWinrate.setText("Winrate");

        lblGGMain.setText("Main");

        lblGGController.setText("Controller");

        lblGGSponsor.setText("Sponsor");

        fldStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldStatusActionPerformed(evt);
            }
        });

        fldGGMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldGGMainActionPerformed(evt);
            }
        });

        cbGame.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dota 2", "Couter Strike: Global Offensive", "Guilty Gear Xrd" }));
        cbGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGameActionPerformed(evt);
            }
        });

        lblD2Team.setText("Team");

        lblD2Role.setText("Standard role");

        lblD2Sponsor.setText("Sponsor");

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        lblTeamCS.setText("Team");

        fldTeamCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldTeamCSActionPerformed(evt);
            }
        });

        fldSponsorCS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fldSponsorCSActionPerformed(evt);
            }
        });

        lblRoleCS.setText("Role");

        lblSponsorCS.setText("Sponsor");

        lblD2Main.setText("Main");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(cbGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblTitle)))
                        .addGap(0, 96, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGGMain)
                                    .addComponent(lblWinrate)
                                    .addComponent(lblStatus)
                                    .addComponent(lblRegion)
                                    .addComponent(lblName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fldWinrate, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(fldStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(fldRegion, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(fldName, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(fldGGMain, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblGGSponsor)
                                    .addComponent(lblD2Team)
                                    .addComponent(lblD2Role)
                                    .addComponent(lblGGController))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fldD2Role)
                                    .addComponent(fldD2Team, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fldGGController)
                                    .addComponent(fldGGSponsor)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblD2Sponsor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fldD2Sponsor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                    .addComponent(fldSponsorCS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fldRoleCS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fldTeamCS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(fldD2Main))))))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTeamCS))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSponsorCS))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblRoleCS))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblD2Main)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbGame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(fldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(fldRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(fldStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWinrate)
                    .addComponent(fldWinrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGGMain)
                    .addComponent(fldGGMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGGController)
                    .addComponent(fldGGController, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGGSponsor)
                    .addComponent(fldGGSponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD2Team)
                    .addComponent(fldD2Team, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD2Role)
                    .addComponent(fldD2Role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD2Main)
                    .addComponent(fldD2Main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblD2Sponsor)
                    .addComponent(fldD2Sponsor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTeamCS)
                    .addComponent(fldTeamCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoleCS)
                    .addComponent(fldRoleCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSponsorCS)
                    .addComponent(fldSponsorCS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter)
                    .addComponent(btnDisplay))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fldStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldStatusActionPerformed

    private void cbGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGameActionPerformed
        // TODO add your handling code here:
        if(cbGame.getSelectedItem().equals("Dota 2")){
            lblD2Team.setVisible(true);
            lblD2Role.setVisible(true);
            lblD2Sponsor.setVisible(true);
            fldD2Team.setVisible(true);
            fldD2Role.setVisible(true);
            fldD2Sponsor.setVisible(true);
            
            lblTeamCS.setVisible(false);
            lblRoleCS.setVisible(false);
            lblSponsorCS.setVisible(false);
            fldTeamCS.setVisible(false);
            fldRoleCS.setVisible(false);
            fldSponsorCS.setVisible(false);
            
            lblGGMain.setVisible(false);
            lblGGController.setVisible(false);
            lblGGSponsor.setVisible(false);
            fldGGMain.setVisible(false);
            fldGGController.setVisible(false);
            fldGGSponsor.setVisible(false);
            
            p = new Dota2();
        }
        else if(cbGame.getSelectedItem().equals("Couter Strike: Global Offensive")){
            lblD2Team.setVisible(false);
            lblD2Role.setVisible(false);
            lblD2Sponsor.setVisible(false);
            fldD2Team.setVisible(false);
            fldD2Role.setVisible(false);
            fldD2Sponsor.setVisible(false);
            
            lblTeamCS.setVisible(true);
            lblRoleCS.setVisible(true);
            lblSponsorCS.setVisible(true);
            fldTeamCS.setVisible(true);
            fldRoleCS.setVisible(true);
            fldSponsorCS.setVisible(true);
            
            lblGGMain.setVisible(false);
            lblGGController.setVisible(false);
            lblGGSponsor.setVisible(false);
            fldGGMain.setVisible(false);
            fldGGController.setVisible(false);
            fldGGSponsor.setVisible(false);
            
            p = new CounterStrike();
        }
        else{
            lblD2Team.setVisible(false);
            lblD2Role.setVisible(false);
            lblD2Sponsor.setVisible(false);
            lblD2Main.setVisible(false);
            fldD2Team.setVisible(false);
            fldD2Role.setVisible(false);
            fldD2Sponsor.setVisible(false);
            fldD2Main.setVisible(false);
            
            lblTeamCS.setVisible(false);
            lblRoleCS.setVisible(false);
            lblSponsorCS.setVisible(false);
            fldTeamCS.setVisible(false);
            fldRoleCS.setVisible(false);
            fldSponsorCS.setVisible(false);
            
            lblGGMain.setVisible(true);
            lblGGController.setVisible(true);
            lblGGSponsor.setVisible(true);
            fldGGMain.setVisible(true);
            fldGGController.setVisible(true);
            fldGGSponsor.setVisible(true);
            
            
            p = new GuiltyGear();
        }
    }//GEN-LAST:event_cbGameActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        // TODO add your handling code here:
        if (p instanceof Dota2){
            p.setName(fldName.getText());
            p.setRegion(fldRegion.getText());
            p.setStatus(fldStatus.getText());
            p.setWinrate(fldWinrate.getText());
            ((Dota2) p).setTeam(fldD2Team.getText());
            ((Dota2) p).setRole(fldD2Role.getText());
            ((Dota2) p).setRole(fldD2Main.getText());
            ((Dota2) p).setRole(fldD2Sponsor.getText());
        }
        else if (p instanceof CounterStrike){
            p.setName(fldName.getText());
            p.setRegion(fldRegion.getText());
            p.setStatus(fldStatus.getText());
            p.setWinrate(fldWinrate.getText());
            ((CounterStrike) p).setRoleCS(fldRoleCS.getText());
            ((CounterStrike) p).setTeamCS(fldTeamCS.getText());
            ((CounterStrike) p).setSponsorCS(fldSponsorCS.getText());
        }
        else {
            p.setName(fldName.getText());
            p.setRegion(fldRegion.getText());
            p.setStatus(fldStatus.getText());
            p.setWinrate(fldWinrate.getText());
            ((GuiltyGear) p).setMain(fldGGMain.getText());
            ((GuiltyGear) p).setController(fldGGController.getText());
        }
        play.add(p);
        writeToFile();
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        for (Players i : play) {
            if (i instanceof Dota2) {
                JOptionPane.showMessageDialog(null, i.getName() + ", " + i.getRegion() + ", " + i.getStatus() + ", " + i.getWinrate() + ", " + ((Dota2) (i)).getTeam() + ", " + ((Dota2) (i)).getRole() + ", " + ((Dota2) (i)).getMain() + ", " + ((Dota2) (i)).getSponsor());
            }
            else if (i instanceof CounterStrike){
                JOptionPane.showMessageDialog(null, i.getName() + ", " + i.getRegion() + ", " + i.getStatus() + ", " + ", " + i.getWinrate() + ", " + ((CounterStrike) (i)).getTeamCS() + ", " + ((CounterStrike) (i)).getRoleCS() + ", " + ((CounterStrike) (i)).getSponsorCS());
            }
            else{
                JOptionPane.showMessageDialog(null, i.getName() + ", " + i.getRegion() + ", " + i.getStatus() + ", " + ", " + i.getWinrate() + ", " + ((GuiltyGear) (i)).getMain() + ", " + ((GuiltyGear) (i)).getController() + ", " + ((GuiltyGear) (i)).getSponsor());
            }
        }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void fldTeamCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldTeamCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldTeamCSActionPerformed

    private void fldSponsorCSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldSponsorCSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldSponsorCSActionPerformed

    private void fldGGMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fldGGMainActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fldGGMainActionPerformed
    
    public void writeToFile() {
        try{
            File f = new File("players.dat");
            FileOutputStream fStream = new FileOutputStream(f);
            ObjectOutputStream oStream = new ObjectOutputStream(fStream);
            
            oStream.writeObject(play);
            oStream.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
    public void readFromFile() {
        try {
            File f = new File("players.dat");
            FileInputStream fStream = new FileInputStream(f);
            ObjectInputStream oStream = new ObjectInputStream(fStream);
            
            play = (ArrayList<Players>) oStream.readObject();
            oStream.close();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
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
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayersGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayersGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnEnter;
    private javax.swing.JComboBox<String> cbGame;
    private javax.swing.JTextField fldD2Main;
    private javax.swing.JTextField fldD2Role;
    private javax.swing.JTextField fldD2Sponsor;
    private javax.swing.JTextField fldD2Team;
    private javax.swing.JTextField fldGGController;
    private javax.swing.JTextField fldGGMain;
    private javax.swing.JTextField fldGGSponsor;
    private javax.swing.JTextField fldName;
    private javax.swing.JTextField fldRegion;
    private javax.swing.JTextField fldRoleCS;
    private javax.swing.JTextField fldSponsorCS;
    private javax.swing.JTextField fldStatus;
    private javax.swing.JTextField fldTeamCS;
    private javax.swing.JTextField fldWinrate;
    private javax.swing.JLabel lblD2Main;
    private javax.swing.JLabel lblD2Role;
    private javax.swing.JLabel lblD2Sponsor;
    private javax.swing.JLabel lblD2Team;
    private javax.swing.JLabel lblGGController;
    private javax.swing.JLabel lblGGMain;
    private javax.swing.JLabel lblGGSponsor;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRoleCS;
    private javax.swing.JLabel lblSponsorCS;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTeamCS;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblWinrate;
    // End of variables declaration//GEN-END:variables
}
