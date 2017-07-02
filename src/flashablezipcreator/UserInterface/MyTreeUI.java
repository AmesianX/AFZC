/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

import flashablezipcreator.Core.FileSystemModel;
import java.io.File;

/**
 *
 * @author Nikhil
 */
public class MyTreeUI extends javax.swing.JFrame {

    /**
     * Creates new form MyTreeUI
     */
    public MyTreeUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layeredPaneHome = new javax.swing.JLayeredPane();
        panelMain = new javax.swing.JPanel();
        panel_logo = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        SP_tree = new javax.swing.JScrollPane();
        tree = new javax.swing.JTree();
        panelLower = new javax.swing.JPanel();
        layeredPaneButtons = new javax.swing.JLayeredPane();
        panelImportZip = new javax.swing.JPanel();
        btnImportZip = new javax.swing.JButton();
        panelCreateZip = new javax.swing.JPanel();
        btnCreateZip = new javax.swing.JButton();
        layeredPaneProgressBar = new javax.swing.JLayeredPane();
        progressBarImportExport = new javax.swing.JProgressBar();
        layeredPaneProgress = new javax.swing.JLayeredPane();
        panelProgressBar = new javax.swing.JPanel();
        circularProgressBar = new flashablezipcreator.UserInterface.CircularProgressBar();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemPreferences = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuItemDevelopers = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuItemInstructions = new javax.swing.JMenuItem();
        menuItemCheckForUpdates = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        panel_logo.setBackground(new java.awt.Color(0, 121, 107));
        panel_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("   Android Flashable Zip Creator");

        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVersion.setText("v4.0 beta 2");

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_logoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblVersion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_logoLayout.setVerticalGroup(
            panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tree.setModel(new FileSystemModel(new File("src")));
        tree.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tree.setRowHeight(21);
        tree.setVisibleRowCount(18);
        SP_tree.setViewportView(tree);

        panelLower.setBackground(new java.awt.Color(255, 255, 255));
        panelLower.setLayout(new java.awt.CardLayout());

        panelImportZip.setBackground(new java.awt.Color(255, 255, 255));

        btnImportZip.setBackground(new java.awt.Color(153, 153, 255));
        btnImportZip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnImportZip.setForeground(new java.awt.Color(62, 39, 35));
        btnImportZip.setText("Import Zip");
        btnImportZip.setBorder(null);
        btnImportZip.setContentAreaFilled(false);
        btnImportZip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnImportZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportZipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImportZipLayout = new javax.swing.GroupLayout(panelImportZip);
        panelImportZip.setLayout(panelImportZipLayout);
        panelImportZipLayout.setHorizontalGroup(
            panelImportZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImportZip, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        panelImportZipLayout.setVerticalGroup(
            panelImportZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnImportZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        panelCreateZip.setBackground(new java.awt.Color(255, 255, 255));

        btnCreateZip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCreateZip.setForeground(new java.awt.Color(62, 39, 35));
        btnCreateZip.setText("Create Zip");
        btnCreateZip.setBorder(null);
        btnCreateZip.setContentAreaFilled(false);
        btnCreateZip.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateZipActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCreateZipLayout = new javax.swing.GroupLayout(panelCreateZip);
        panelCreateZip.setLayout(panelCreateZipLayout);
        panelCreateZipLayout.setHorizontalGroup(
            panelCreateZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateZip, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
        );
        panelCreateZipLayout.setVerticalGroup(
            panelCreateZipLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCreateZip, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layeredPaneButtons.setLayer(panelImportZip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneButtons.setLayer(panelCreateZip, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneButtonsLayout = new javax.swing.GroupLayout(layeredPaneButtons);
        layeredPaneButtons.setLayout(layeredPaneButtonsLayout);
        layeredPaneButtonsLayout.setHorizontalGroup(
            layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneButtonsLayout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(panelImportZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCreateZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layeredPaneButtonsLayout.setVerticalGroup(
            layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layeredPaneButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layeredPaneButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelImportZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCreateZip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panelLower.add(layeredPaneButtons, "card1");

        progressBarImportExport.setBackground(new java.awt.Color(255, 255, 255));
        progressBarImportExport.setForeground(new java.awt.Color(0, 121, 107));
        progressBarImportExport.setToolTipText("Click To Change Progress Mode");
        progressBarImportExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        progressBarImportExport.setDoubleBuffered(true);
        progressBarImportExport.setStringPainted(true);
        progressBarImportExport.setVerifyInputWhenFocusTarget(false);
        progressBarImportExport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressBarImportExportMouseClicked(evt);
            }
        });

        layeredPaneProgressBar.setLayer(progressBarImportExport, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneProgressBarLayout = new javax.swing.GroupLayout(layeredPaneProgressBar);
        layeredPaneProgressBar.setLayout(layeredPaneProgressBarLayout);
        layeredPaneProgressBarLayout.setHorizontalGroup(
            layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBarImportExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
        );
        layeredPaneProgressBarLayout.setVerticalGroup(
            layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(progressBarImportExport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        panelLower.add(layeredPaneProgressBar, "card2");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panelLower, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panel_logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(SP_tree)
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(panel_logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(SP_tree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelLower, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layeredPaneHome.setLayer(panelMain, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneHomeLayout = new javax.swing.GroupLayout(layeredPaneHome);
        layeredPaneHome.setLayout(layeredPaneHomeLayout);
        layeredPaneHomeLayout.setHorizontalGroup(
            layeredPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layeredPaneHomeLayout.setVerticalGroup(
            layeredPaneHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(layeredPaneHome, "L2");

        panelProgressBar.setBackground(new java.awt.Color(255, 255, 255));

        circularProgressBar.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout circularProgressBarLayout = new javax.swing.GroupLayout(circularProgressBar);
        circularProgressBar.setLayout(circularProgressBarLayout);
        circularProgressBarLayout.setHorizontalGroup(
            circularProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 252, Short.MAX_VALUE)
        );
        circularProgressBarLayout.setVerticalGroup(
            circularProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 275, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelProgressBarLayout = new javax.swing.GroupLayout(panelProgressBar);
        panelProgressBar.setLayout(panelProgressBarLayout);
        panelProgressBarLayout.setHorizontalGroup(
            panelProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgressBarLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(circularProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
        );
        panelProgressBarLayout.setVerticalGroup(
            panelProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelProgressBarLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(circularProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(198, 198, 198))
        );

        layeredPaneProgress.setLayer(panelProgressBar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneProgressLayout = new javax.swing.GroupLayout(layeredPaneProgress);
        layeredPaneProgress.setLayout(layeredPaneProgressLayout);
        layeredPaneProgressLayout.setHorizontalGroup(
            layeredPaneProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layeredPaneProgressLayout.setVerticalGroup(
            layeredPaneProgressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getContentPane().add(layeredPaneProgress, "L1");

        menuFile.setText("File");

        menuItemPreferences.setText("Preferences");
        menuItemPreferences.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemPreferencesActionPerformed(evt);
            }
        });
        menuFile.add(menuItemPreferences);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuAbout.setText("About");

        menuItemDevelopers.setText("Developers");
        menuItemDevelopers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemDevelopersActionPerformed(evt);
            }
        });
        menuAbout.add(menuItemDevelopers);

        menuBar.add(menuAbout);

        menuHelp.setText("Help");

        menuItemInstructions.setText("Instructions");
        menuItemInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInstructionsActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemInstructions);

        menuItemCheckForUpdates.setText("Check For Update");
        menuItemCheckForUpdates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemCheckForUpdatesActionPerformed(evt);
            }
        });
        menuHelp.add(menuItemCheckForUpdates);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        getAccessibleContext().setAccessibleParent(layeredPaneHome);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnImportZipActionPerformed

    private void btnCreateZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateZipActionPerformed

    private void progressBarImportExportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_progressBarImportExportMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_progressBarImportExportMouseClicked

    private void menuItemPreferencesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemPreferencesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemPreferencesActionPerformed

    private void menuItemDevelopersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemDevelopersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemDevelopersActionPerformed

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInstructionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemInstructionsActionPerformed

    private void menuItemCheckForUpdatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemCheckForUpdatesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemCheckForUpdatesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MyTreeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyTreeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyTreeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyTreeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyTreeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane SP_tree;
    private javax.swing.JButton btnCreateZip;
    private javax.swing.JButton btnImportZip;
    private flashablezipcreator.UserInterface.CircularProgressBar circularProgressBar;
    private javax.swing.JLayeredPane layeredPaneButtons;
    private javax.swing.JLayeredPane layeredPaneHome;
    private javax.swing.JLayeredPane layeredPaneProgress;
    private javax.swing.JLayeredPane layeredPaneProgressBar;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemCheckForUpdates;
    private javax.swing.JMenuItem menuItemDevelopers;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemInstructions;
    private javax.swing.JMenuItem menuItemPreferences;
    private javax.swing.JPanel panelCreateZip;
    private javax.swing.JPanel panelImportZip;
    public static javax.swing.JPanel panelLower;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelProgressBar;
    private javax.swing.JPanel panel_logo;
    public static javax.swing.JProgressBar progressBarImportExport;
    public static javax.swing.JTree tree;
    // End of variables declaration//GEN-END:variables
}
