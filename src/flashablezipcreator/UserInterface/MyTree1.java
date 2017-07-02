/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flashablezipcreator.UserInterface;

import flashablezipcreator.Core.ProjectItemNode;
import flashablezipcreator.Core.ProjectTreeBuilder;
import flashablezipcreator.Operations.TreeOperations;
import flashablezipcreator.Operations.MyFileFilter;
import flashablezipcreator.Operations.UpdaterScriptOperations;
import flashablezipcreator.Protocols.Export;
import flashablezipcreator.Protocols.Import;
import flashablezipcreator.Protocols.Jar;
import flashablezipcreator.Protocols.Logs;
import flashablezipcreator.Protocols.Project;
import flashablezipcreator.Protocols.Update;
import flashablezipcreator.Protocols.Web;
import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author Nikhil
 */
public class MyTree1 extends JFrame {

    /**
     * Creates new form MyTree
     */
    /**
     * Setting these to static so as to avoid fetching objects again and again
     * this will be stored in main thread processing time to fetch objects will
     * be saved we will have only one JTree, rootNode and DefaultTreeModel
     * instance
     */
    public static JTree tree;
    public static DefaultTreeModel model;
    public static ProjectItemNode rootNode;
    public static JPanel panelLower;
    public static JProgressBar progressBarImportExport;
    public static int progressBarFlag = 0;
    TreeOperations to;
    UpdaterScriptOperations uso;
    //ProjectOperations po = new ProjectOperations();

    MyFileFilter uio = new MyFileFilter();

    public MyTree1() throws IOException, ParserConfigurationException, TransformerException, SAXException {
        tree = ProjectTreeBuilder.buildTree();
        model = ProjectTreeBuilder.buildModel();
        rootNode = ProjectTreeBuilder.rootNode;
        progressBarImportExport = new JProgressBar();
        if (Jar.isExecutingThrough()) {
            Jar.addThemesToTree();
        }
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException, ParserConfigurationException, TransformerException, SAXException {

        panelMain = new javax.swing.JPanel();
        panelLower = new javax.swing.JPanel();
        layeredPaneButtons = new javax.swing.JLayeredPane();
        panelImportZip = new javax.swing.JPanel();
        btnImportZip = new javax.swing.JButton();
        panelCreateZip = new javax.swing.JPanel();
        btnCreateZip = new javax.swing.JButton();
        layeredPaneProgressBar = new javax.swing.JLayeredPane();
        panel_logo = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        lblVersion = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemPreference = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuAboutTool = new javax.swing.JMenuItem();
        menuAboutDeveloper = new javax.swing.JMenuItem();
        menuUpdateStable = new javax.swing.JMenuItem();
        menuUpdateBeta = new javax.swing.JMenuItem();
        menuUpdateTest = new javax.swing.JMenuItem();
        menuUpcomingFeatures = new javax.swing.JMenuItem();
        menuAbout = new javax.swing.JMenu();
        menuUpdate = new javax.swing.JMenu();
        SP_tree = ProjectTreeBuilder.buildScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel_logo.setBackground(new java.awt.Color(78, 52, 46));
        panel_logo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblHeader.setForeground(new java.awt.Color(255, 255, 255));
        lblHeader.setText("   Android Flashable Zip Creator");

        this.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                exitMenuItemActionPerformed();
            }
        });

        lblVersion.setForeground(new java.awt.Color(255, 255, 255));
        lblVersion.setText(Preference.pp.currentVersion + " " + Preference.pp.versionType);

        javax.swing.GroupLayout panel_logoLayout = new javax.swing.GroupLayout(panel_logo);
        panel_logo.setLayout(panel_logoLayout);
        panel_logoLayout.setHorizontalGroup(
                panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_logoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        panel_logoLayout.setVerticalGroup(
                panel_logoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblHeader, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_logoLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblVersion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnImportZipActionPerformed(evt);
                } catch (IOException | ParserConfigurationException | TransformerException | SAXException | InterruptedException ex) {
                    Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
                }
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
        btnCreateZip.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                btnCreateZipActionPerformed(evt);
            } catch (IOException | ParserConfigurationException | TransformerException ex) {
                Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
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
        layeredPaneButtons.setLayer(panelImportZip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layeredPaneButtons.setLayer(panelCreateZip, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelLower.add(layeredPaneButtons, "card1");

        progressBarImportExport.setForeground(new java.awt.Color(78, 52, 46));
        progressBarImportExport.setToolTipText("Click To Change Progress Mode");
        progressBarImportExport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        progressBarImportExport.setStringPainted(true);
        progressBarImportExport.setVerifyInputWhenFocusTarget(false);
        progressBarImportExport.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                progressBarImportExportMouseClicked(evt);
            }
        });

        layeredPaneProgressBar.setLayer(progressBarImportExport, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layeredPaneProgressBarLayout = new javax.swing.GroupLayout(layeredPaneProgressBar);
        layeredPaneProgressBar.setLayout(layeredPaneProgressBarLayout);
        layeredPaneProgressBarLayout.setHorizontalGroup(
                layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 423, Short.MAX_VALUE)
                        .addGroup(layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(progressBarImportExport, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE))
        );
        layeredPaneProgressBarLayout.setVerticalGroup(
                layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 66, Short.MAX_VALUE)
                        .addGroup(layeredPaneProgressBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(progressBarImportExport, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
        );
        layeredPaneProgressBar.setLayer(progressBarImportExport, javax.swing.JLayeredPane.DEFAULT_LAYER);

        panelLower.add(layeredPaneProgressBar, "card2");

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
                panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
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

        menuFile.setText("File");

        menuItemPreference.setText("Preference");
        menuItemPreference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    menuItemPreferenceActionPerformed(evt);
                } catch (ParserConfigurationException ex) {
                    Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SAXException ex) {
                    Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        menuFile.add(menuItemPreference);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed();
            }
        });
        menuFile.add(menuItemExit);

        menuBar.add(menuFile);

        menuAbout.setText("About");

        menuAboutTool.setText("Instructions");
        menuAboutTool.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutToolMenuItemActionPerformed();
            }
        });

        menuAboutDeveloper.setText("Developers");
        menuAboutDeveloper.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutDeveloperMenuItemActionPerformed();
            }
        });

        menuAbout.add(menuAboutTool);
        menuAbout.add(menuAboutDeveloper);
        menuBar.add(menuAbout);

        menuUpdate.setText("Update");

        menuUpdateTest.setText("Test Version");
        menuUpdateTest.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUpdateTestMenuItemActionPerformed();
            }
        });

        menuUpdateBeta.setText("Beta Version");
        menuUpdateBeta.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUpdateBetaMenuItemActionPerformed();
            }
        });

        menuUpdateStable.setText("Stable Version");
        menuUpdateStable.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    aboutUpdateStableMenuItemActionPerformed();
                } catch (URISyntaxException ex) {
                    Logger.getLogger(MyTree1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

        menuUpcomingFeatures.setText("Upcoming Features");
        menuUpcomingFeatures.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUpdateUpcomingFeaturesMenuItemActionPerformed();
            }
        });

        if (Update.CurrentVersionType.equals("Test")) {
            menuUpdate.add(menuUpdateTest);
        }
        menuUpdate.add(menuUpdateBeta);
        menuUpdate.add(menuUpdateStable);
        menuUpdate.add(menuUpcomingFeatures);
        menuBar.add(menuUpdate);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>     

    private void exitMenuItemActionPerformed() {
        try {
            String dir = "AFZC Projects";
            if ((new File(dir).exists())) {
                int dialogResult = JOptionPane.showConfirmDialog(this, "Do you want to delete temporary files?", "", JOptionPane.YES_NO_CANCEL_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    deleteDirectory(new File(dir));
                    System.out.println("Window Closing..");
                    System.exit(0);
                }else if(dialogResult == JOptionPane.NO_OPTION){
                    System.out.println("Window Closing..");
                    System.exit(0);
                }
            }
        } catch (Exception e) {
            Logs.write("Deleting Temporary Files");
            Logs.write(Logs.getExceptionTrace(e));
            JOptionPane.showMessageDialog(this, "Something Went Wrong!\nCouldn't delete Temp files!");
        }

    }

    public boolean deleteDirectory(File directory) {
        if (directory.exists()) {
            File[] files = directory.listFiles();
            if (null != files) {
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    } else {
                        files[i].delete();
                    }
                }
            }
        }
        return (directory.delete());
    }

    private void aboutUpdateTestMenuItemActionPerformed() {
        Logs.write("Checking if internet is available!");
        if (Web.netIsAvailable()) {
            try {
                Logs.write("Running update check!");
                Update.runTestUpdateCheck();
                Logs.write("Checking if Test update is available!");
                if (Update.isTestUpdateAvailable) {
                    String changelog = Update.getTestChangelog();
                    Logs.write("Changelog: " + changelog);
                    String message = "A new update is available with following changelog\n" + changelog;
                    if (!changelog.equals("")) {
                        int dialogResult = JOptionPane.showConfirmDialog(this, message, "Test Update Changelog", JOptionPane.YES_NO_OPTION);
                        if (dialogResult == JOptionPane.YES_OPTION) {
                            Update.downloadTestVersion();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Your version is uptodate");
                }
            } catch (Exception e) {
                Logs.write(Logs.getExceptionTrace(e));
                JOptionPane.showMessageDialog(this, "Something went wrong!\n" + Logs.getExceptionTrace(e));
            }
        } else {
            Logs.write("Internet not available!");
            JOptionPane.showMessageDialog(this, "Please check your internet connection!");
        }
    }

    private void aboutUpdateStableMenuItemActionPerformed() throws URISyntaxException {
        Logs.write("Checking if internet is available!");
        if (Web.netIsAvailable()) {
            try {
                Logs.write("Running update check!");
                Update.runStableUpdateCheck();
                Logs.write("Checking if Stable update is available!");
                if (Update.isStableUpdateAvailable) {
                    String changelog = Update.getStableChangelog();
                    Logs.write("Changelog: " + changelog);
                    String message = "A new update is available with following changelog\n" + changelog;
                    if (!changelog.equals("")) {
                        int dialogResult = JOptionPane.showConfirmDialog(this, message, "Stable Update Changelog", JOptionPane.YES_NO_OPTION);
                        if (dialogResult == JOptionPane.YES_OPTION) {
                            Update.downloadStableVersion();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Your version is uptodate");
                }
            } catch (Exception e) {
                Logs.write(Logs.getExceptionTrace(e));
                JOptionPane.showMessageDialog(this, "Something went wrong!\n" + Logs.getExceptionTrace(e));
            }
        } else {
            Logs.write("Internet not available!");
            JOptionPane.showMessageDialog(this, "Please check your internet connection!");
        }
    }

    private void aboutUpdateUpcomingFeaturesMenuItemActionPerformed() {
        Logs.write("Checking if internet is available!");
        if (Web.netIsAvailable()) {
            try {
                Logs.write("Running update check!");
                //Update.runUpdateCheck();
                String upcomingFeatures = Update.getUpcomingFeatures();
                Logs.write("Upcoming Features: " + upcomingFeatures);
                String message = "These are the features that you will see in future builds\n" + upcomingFeatures;
                if (!upcomingFeatures.equals("")) {
                    JOptionPane.showMessageDialog(this, message, "Upcoming Features", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No New Features Planned as of now, Please come back later and share if you have any suggestion on thread!");
                }
            } catch (Exception e) {
                Logs.write(Logs.getExceptionTrace(e));
                JOptionPane.showMessageDialog(this, "Something went wrong!\n" + Logs.getExceptionTrace(e));
            }
        } else {
            Logs.write("Internet not available!");
            JOptionPane.showMessageDialog(this, "Please check your internet connection!");
        }
    }

    private void aboutUpdateBetaMenuItemActionPerformed() {
        Logs.write("Checking if internet is available!");
        if (Web.netIsAvailable()) {
            try {
                Logs.write("Running update check!");
                Update.runBetaUpdateCheck();
                Logs.write("Checking if Beta update is available!");
                if (Update.isBetaUpdateAvailable) {
                    String changelog = Update.getBetaChangelog();
                    Logs.write("Changelog: " + changelog);
                    String message = "A new update is available with following changelog\n" + changelog;
                    if (!changelog.equals("")) {
                        int dialogResult = JOptionPane.showConfirmDialog(this, message, "Beta Update Changelog", JOptionPane.YES_NO_OPTION);
                        if (dialogResult == JOptionPane.YES_OPTION) {
                            Update.downloadBetaVersion();
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Your version is uptodate");
                }
            } catch (Exception e) {
                Logs.write(Logs.getExceptionTrace(e));
                JOptionPane.showMessageDialog(this, "Something went wrong!\n" + Logs.getExceptionTrace(e));
            }
        } else {
            Logs.write("Internet not available!");
            JOptionPane.showMessageDialog(this, "Please check your internet connection!");
        }
    }

    private void aboutToolMenuItemActionPerformed() {
        new Instructions().setVisible(true);
    }

    private void aboutDeveloperMenuItemActionPerformed() {
        new About().setVisible(true);
    }

    private void menuItemPreferenceActionPerformed(java.awt.event.ActionEvent evt) throws ParserConfigurationException, SAXException, IOException {
        new Preference().setVisible(true);
    }

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void progressBarImportExportMouseClicked(java.awt.event.MouseEvent evt) {
        //switch case for future extensibility
        switch (progressBarFlag) {
            case 0:
                progressBarFlag = 1;
                break;
            case 1:
                progressBarFlag = 0;
                break;
            //not using case 2 as of now
//            case 2:
//                progressBarFlag = 0;
//                break;
        }
    }

    private void btnImportZipActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParserConfigurationException, TransformerException, SAXException, InterruptedException {
        try {
            String importFrom = MyFileFilter.browseZipDestination();
            if (importFrom != null) {
                Thread importZip = new Thread(new Import(importFrom), "ImportZip");
                importZip.start();
            }
        } catch (Exception e) {
            Logs.write(e.getMessage());
            setCardLayout(1);
        }
    }

    private void btnCreateZipActionPerformed(java.awt.event.ActionEvent evt) throws IOException, ParserConfigurationException, TransformerException {
        try {
            Project.outputPath = MyFileFilter.browseZipDestination();
            if (!Project.outputPath.equals("")) {
                Thread exportZip = new Thread(new Export(), "ExportZip");
                exportZip.start();
            }
        } catch (Exception e) {
            Logs.write(e.getMessage());
            setCardLayout(1);
        }
//        Export.zip();
    }

    public static void setCardLayout(int cardNo) {
        CardLayout cardLayout = (CardLayout) panelLower.getLayout();
        cardLayout.show(panelLower, "card" + Integer.toString(cardNo));
    }

    private javax.swing.JButton btnCreateZip;
    private javax.swing.JButton btnImportZip;
    private javax.swing.JScrollPane SP_tree;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblVersion;
    private javax.swing.JPanel panel_logo;
    private javax.swing.JMenu menuAbout;
    private javax.swing.JMenu menuUpdate;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemPreference;
    private javax.swing.JMenuItem menuAboutTool;
    private javax.swing.JMenuItem menuAboutDeveloper;
    private javax.swing.JMenuItem menuUpdateBeta;
    private javax.swing.JMenuItem menuUpdateTest;
    private javax.swing.JMenuItem menuUpdateStable;
    private javax.swing.JMenuItem menuUpcomingFeatures;
    private javax.swing.JMenu menuFile;
    private javax.swing.JLayeredPane layeredPaneButtons;
    private javax.swing.JLayeredPane layeredPaneProgressBar;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelCreateZip;
    private javax.swing.JPanel panelImportZip;

}
