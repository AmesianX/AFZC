/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

/**
 *
 * @author Nikhil
 */
public class CustomGroupUI extends javax.swing.JFrame {

    /**
     * Creates new form CustomGroupUI
     */
    public CustomGroupUI() {
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

        rbGroup = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        panelPermissions = new javax.swing.JPanel();
        cbOthersX = new javax.swing.JCheckBox();
        cbOwnerW = new javax.swing.JCheckBox();
        lblPermInDigit = new javax.swing.JLabel();
        cbGroupW = new javax.swing.JCheckBox();
        cbSticky = new javax.swing.JCheckBox();
        lblR = new javax.swing.JLabel();
        lblOwner = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        cbOwnerR = new javax.swing.JCheckBox();
        lblPermissions = new javax.swing.JLabel();
        llblW = new javax.swing.JLabel();
        lblGroup = new javax.swing.JLabel();
        cbGroupX = new javax.swing.JCheckBox();
        cbSetuid = new javax.swing.JCheckBox();
        cbGroupR = new javax.swing.JCheckBox();
        cbSetgid = new javax.swing.JCheckBox();
        lblPermInString = new javax.swing.JLabel();
        cbOthersW = new javax.swing.JCheckBox();
        cbOthersR = new javax.swing.JCheckBox();
        lblOthers = new javax.swing.JLabel();
        cbX = new javax.swing.JCheckBox();
        panelGroupDetails = new javax.swing.JPanel();
        lblGroupName = new javax.swing.JLabel();
        txtGroupName = new javax.swing.JTextField();
        lblInstallLocation = new javax.swing.JLabel();
        txtInstallLocation = new javax.swing.JTextField();
        lblFileInstructions = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelMain.setBackground(new java.awt.Color(255, 255, 255));

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        panelPermissions.setBackground(new java.awt.Color(255, 255, 255));

        cbOthersX.setBackground(new java.awt.Color(255, 255, 255));

        cbOwnerW.setBackground(new java.awt.Color(255, 255, 255));

        lblPermInDigit.setBackground(new java.awt.Color(255, 255, 255));
        lblPermInDigit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPermInDigit.setText("666");
        lblPermInDigit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbGroupW.setBackground(new java.awt.Color(255, 255, 255));

        cbSticky.setBackground(new java.awt.Color(255, 255, 255));
        cbSticky.setText("sticky");

        lblR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblR.setText(" R");
        lblR.setPreferredSize(new java.awt.Dimension(21, 21));

        lblOwner.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOwner.setText("Owner");

        lblX.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblX.setText("  X");
        lblX.setPreferredSize(new java.awt.Dimension(21, 21));

        cbOwnerR.setBackground(new java.awt.Color(255, 255, 255));

        lblPermissions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPermissions.setText("Permissions");

        llblW.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        llblW.setText(" W");
        llblW.setPreferredSize(new java.awt.Dimension(21, 21));

        lblGroup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGroup.setText("Group");

        cbGroupX.setBackground(new java.awt.Color(255, 255, 255));

        cbSetuid.setBackground(new java.awt.Color(255, 255, 255));
        cbSetuid.setText("setuid");

        cbGroupR.setBackground(new java.awt.Color(255, 255, 255));

        cbSetgid.setBackground(new java.awt.Color(255, 255, 255));
        cbSetgid.setText("setgid");

        lblPermInString.setBackground(new java.awt.Color(255, 255, 255));
        lblPermInString.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPermInString.setText("-rw-rw-rw-");
        lblPermInString.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cbOthersW.setBackground(new java.awt.Color(255, 255, 255));

        cbOthersR.setBackground(new java.awt.Color(255, 255, 255));

        lblOthers.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblOthers.setText("Others");

        cbX.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelPermissionsLayout = new javax.swing.GroupLayout(panelPermissions);
        panelPermissions.setLayout(panelPermissionsLayout);
        panelPermissionsLayout.setHorizontalGroup(
            panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPermissionsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                        .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGroup)
                            .addComponent(lblOthers)
                            .addComponent(lblOwner))
                        .addGap(18, 18, 18)
                        .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPermissionsLayout.createSequentialGroup()
                                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                                        .addComponent(cbGroupR)
                                        .addGap(40, 40, 40)
                                        .addComponent(cbGroupW))
                                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                                        .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbOwnerR))
                                        .addGap(40, 40, 40)
                                        .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbOwnerW)
                                            .addComponent(llblW, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(40, 40, 40)
                                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbX)
                                    .addComponent(cbGroupX)
                                    .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPermissionsLayout.createSequentialGroup()
                                .addComponent(cbOthersR)
                                .addGap(40, 40, 40)
                                .addComponent(cbOthersW)
                                .addGap(40, 40, 40)
                                .addComponent(cbOthersX))
                            .addGroup(panelPermissionsLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(lblPermInDigit))
                                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                                        .addComponent(cbSetgid)
                                        .addGap(38, 38, 38)
                                        .addComponent(cbSticky))
                                    .addComponent(lblPermInString)))))
                    .addComponent(cbSetuid)
                    .addGroup(panelPermissionsLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblPermissions)))
                .addGap(53, 53, 53))
        );
        panelPermissionsLayout.setVerticalGroup(
            panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPermissionsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblPermissions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(llblW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbOwnerR)
                    .addComponent(cbOwnerW)
                    .addComponent(cbX)
                    .addComponent(lblOwner, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGroup)
                    .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbGroupR)
                        .addComponent(cbGroupW)
                        .addComponent(cbGroupX)))
                .addGap(18, 18, 18)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOthers)
                    .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbOthersR)
                        .addComponent(cbOthersW)
                        .addComponent(cbOthersX)))
                .addGap(18, 18, 18)
                .addGroup(panelPermissionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSetuid)
                    .addComponent(cbSticky)
                    .addComponent(cbSetgid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPermInDigit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPermInString)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelGroupDetails.setBackground(new java.awt.Color(255, 255, 255));

        lblGroupName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGroupName.setText("Group Name ");
        lblGroupName.setToolTipText("This will contain set of files you will choose from in Aroma Installer");

        txtGroupName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtGroupName.setToolTipText("This will contain set of files you will choose from in Aroma Installer");

        lblInstallLocation.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInstallLocation.setText("Install Location");
        lblInstallLocation.setToolTipText("This is the location where your files will be installed (e.g. \\system\\framework)");

        txtInstallLocation.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtInstallLocation.setToolTipText("This is the location where your files will be installed (e.g. \\system\\framework)");

        lblFileInstructions.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblFileInstructions.setText("Install Instructions");
        lblFileInstructions.setToolTipText("Choose whether only one from the list of files can be installed or multiple can be installed. (select box will be there for former one and check box will be there for latter one)");

        lblDescription.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDescription.setText("Description");

        txtDescription.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Single File");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Multiple Files");

        javax.swing.GroupLayout panelGroupDetailsLayout = new javax.swing.GroupLayout(panelGroupDetails);
        panelGroupDetails.setLayout(panelGroupDetailsLayout);
        panelGroupDetailsLayout.setHorizontalGroup(
            panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGroupName)
                    .addComponent(lblInstallLocation)
                    .addComponent(txtGroupName, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtInstallLocation))
                .addGap(18, 18, 18)
                .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFileInstructions)
                    .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelGroupDetailsLayout.createSequentialGroup()
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2))
                        .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGroupDetailsLayout.setVerticalGroup(
            panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGroupName)
                    .addComponent(lblFileInstructions))
                .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblInstallLocation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInstallLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtGroupName)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(panelGroupDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                                .addComponent(lblDescription)
                                .addGap(34, 34, 34))
                            .addGroup(panelGroupDetailsLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(7, 7, 7))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Group");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelGroupDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(panelPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelGroupDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPermissions, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(CustomGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomGroupUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomGroupUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JCheckBox cbGroupR;
    private javax.swing.JCheckBox cbGroupW;
    private javax.swing.JCheckBox cbGroupX;
    private javax.swing.JCheckBox cbOthersR;
    private javax.swing.JCheckBox cbOthersW;
    private javax.swing.JCheckBox cbOthersX;
    private javax.swing.JCheckBox cbOwnerR;
    private javax.swing.JCheckBox cbOwnerW;
    private javax.swing.JCheckBox cbSetgid;
    private javax.swing.JCheckBox cbSetuid;
    private javax.swing.JCheckBox cbSticky;
    private javax.swing.JCheckBox cbX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblFileInstructions;
    private javax.swing.JLabel lblGroup;
    private javax.swing.JLabel lblGroupName;
    private javax.swing.JLabel lblInstallLocation;
    private javax.swing.JLabel lblOthers;
    private javax.swing.JLabel lblOwner;
    private javax.swing.JLabel lblPermInDigit;
    private javax.swing.JLabel lblPermInString;
    private javax.swing.JLabel lblPermissions;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel llblW;
    private javax.swing.JPanel panelGroupDetails;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelPermissions;
    private javax.swing.ButtonGroup rbGroup;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtGroupName;
    private javax.swing.JTextField txtInstallLocation;
    // End of variables declaration//GEN-END:variables
}