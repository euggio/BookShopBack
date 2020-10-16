/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop.Login;

import BookShop.Dashboard_JFrame;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Base64;
import java.util.Scanner;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author bolem
 */
public class AppLogin extends javax.swing.JFrame {
    private Timer timer = null;
    private ActionListener actionListener;
    private Connection connection;

    /**
     * Creates new form for the application login with complex complexConnection
     */
    public AppLogin(String string) {
        initComponents();
        
        /* Checks whether username and password are empty or null or are of length = 0
         * Disables login button if so
         */
        boolean condition = txtFld_Username.getText() == null 
            || txtFld_Username.getText().isEmpty() 
            || txtFld_Username.getText().contains(" ")
            || String.valueOf(pwdFld_Password.getPassword()) == null 
            || String.valueOf(pwdFld_Password.getPassword()).isEmpty() 
            || String.valueOf(pwdFld_Password.getPassword()).contains(" ");
        if (condition) btn_LogIn.setEnabled(false);
        
        // Disables items except for cancel button before complexConnection
        initItems();        
        
        // Calls timer to time complexConnection
        complexTimer();
    }
    
    /**
     * Creates new form for the application login with simple complexConnection
     */
    public AppLogin() {
        initComponents();
        
        /* Checks whether username and password are empty or null or are of length = 0
         * Disables login button if so
         */
        boolean condition = txtFld_Username.getText() == null 
            || txtFld_Username.getText().isEmpty() 
            || txtFld_Username.getText().contains(" ")
            || String.valueOf(pwdFld_Password.getPassword()) == null 
            || String.valueOf(pwdFld_Password.getPassword()).isEmpty() 
            || String.valueOf(pwdFld_Password.getPassword()).contains(" ");
        if (condition) btn_LogIn.setEnabled(false);
        
        // Disables items except for cancel button before complexConnection
        initItems();        
        
        // Calls timer to time complexConnection
        simpleTimer();
        
    }
    
    // Times the complexConnection
    private void simpleTimer() {
        actionListener = (ActionEvent e) -> {
            // Establishes complexConnection
            connection = simpleConnection();
            timer.stop();
        };
                
        // Sets timer
        timer = new Timer(1000, actionListener);
        timer.start();
    }
    
    // Times the complexConnection
    private void complexTimer() {
        actionListener = (ActionEvent e) -> {
            // Establishes complexConnection
            connection = complexConnection();
            timer.stop();
        };
                
        // Sets timer
        timer = new Timer(1000, actionListener);
        timer.start();
    }
    
    private void initItems() {
        lbl_SuccessImage.setVisible(false);
        lbl_FailureImage.setVisible(false);
        txtFld_Username.setEnabled(false);
        pwdFld_Password.setEnabled(false);
        btn_LogIn.setEnabled(false);
    }
    
    /**
     * Prepares a data source complexConnection object
     * @param serverNameField, a server name 
     * @param portNumberField, a port number
     * @param userNameField, a user name
     * @param passwordField, a password
     * @return the datasource complexConnection object thus prepared
     * @throws SQLServerException
     */    
    public Connection getConnection(
            String serverNameField, 
            String portNumberField,
            String userNameField,
            String passwordField
            ) throws SQLServerException {
        // Setting up the DataSource object
        com.microsoft.sqlserver.jdbc.SQLServerDataSource dataSource 
            = new com.microsoft.sqlserver.jdbc.SQLServerDataSource();
        dataSource.setServerName(serverNameField);
        dataSource.setPortNumber(Integer.parseInt(portNumberField));
        dataSource.setDatabaseName("BookShop");
        dataSource.setUser(userNameField);
        dataSource.setPassword(passwordField);
        
        return dataSource.getConnection();
    }
    
    public Connection simpleConnection() {
        Base64.Decoder decoder = Base64.getDecoder();
        String[] line = null;
        // Reads database properties from a file
        try (Scanner scanner = new Scanner (new FileInputStream("database."
            + "properties.txt"));) {
            line = scanner.nextLine().trim().split(" ");
        } catch (FileNotFoundException ex) {
            /* JOptionPane.showMessageDialog(panel_Properties, "Not Connected. Contact Admin",
                "Connection Data Saving Error", JOptionPane.ERROR_MESSAGE);
            */
        }
        
        // Calls complexConnection method
        Connection connect = null;
        try {
            connect = getConnection(
            new String(decoder.decode(line[0])),
            new String(decoder.decode(line[1])), 
            new String(decoder.decode(line[2])), 
            new String(decoder.decode(line[3]))); 
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseLogin.class.getName()).log(Level.
                SEVERE, null, ex);
        }
        return connect;
    }
    
    public final Connection complexConnection() {
        Base64.Decoder decoder = Base64.getDecoder();
        String[] line = null;
        // Reads database properties from a file
        try (Scanner scanner = new Scanner (new FileInputStream("database."
            + "properties.txt"));) {
            line = scanner.nextLine().trim().split(" ");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(panel_Properties, "Not Connected. Contact Admin",
                "Connection Data Saving Error", JOptionPane.ERROR_MESSAGE);
        }
        
        // Calls complexConnection method
        Connection connect = null;
        try {
            connect = getConnection(
            new String(decoder.decode(line[0])),
            new String(decoder.decode(line[1])), 
            new String(decoder.decode(line[2])), 
            new String(decoder.decode(line[3]))); 
            
            // Displays green icon and sets panel and label colors
            panel_Banner.setBackground(Color.WHITE);
            lbl_CompanyName.setForeground(Color.BLACK);
            lbl_VersionNumber.setForeground(Color.BLACK);
            lbl_SuccessImage.setVisible(true);
            txtFld_Username.requestFocusInWindow();
            
            // Enables fields
            txtFld_Username.setEnabled(true);
            pwdFld_Password.setEnabled(true);
            btn_LogIn.setEnabled(true);
            
            JOptionPane.showMessageDialog(panel_Properties, "Connection Successful",
                "Connection Sucess", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            initItems();
            // Displays red icon
            panel_Banner.setBackground(Color.BLACK);
            lbl_CompanyName.setForeground(Color.WHITE);
            lbl_VersionNumber.setForeground(Color.WHITE);
            lbl_FailureImage.setVisible(true);
            JOptionPane.showMessageDialog(panel_Properties, "Not Connected. Contact Admin",
                "Connection Failure", JOptionPane.ERROR_MESSAGE);
            this.requestFocusInWindow();
            Logger.getLogger(DatabaseLogin.class.getName()).log(Level.
                SEVERE, null, ex);
        }
        return connect;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Properties = new javax.swing.JPanel();
        lbl_Username = new javax.swing.JLabel();
        lbl_PortNumber = new javax.swing.JLabel();
        txtFld_Username = new javax.swing.JTextField();
        btn_LogIn = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        lbl_UsernameCheck = new javax.swing.JLabel();
        lbl_PasswordCheck = new javax.swing.JLabel();
        pwdFld_Password = new javax.swing.JPasswordField();
        panel_Banner = new javax.swing.JPanel();
        lbl_FailureImage = new javax.swing.JLabel();
        lbl_SuccessImage = new javax.swing.JLabel();
        lbl_CompanyName = new javax.swing.JLabel();
        lbl_VersionNumber = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App User Login");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        panel_Properties.setLayout(null);

        lbl_Username.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_Username.setText("Username:");
        panel_Properties.add(lbl_Username);
        lbl_Username.setBounds(20, 40, 62, 20);

        lbl_PortNumber.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_PortNumber.setText("Password:");
        panel_Properties.add(lbl_PortNumber);
        lbl_PortNumber.setBounds(20, 100, 73, 20);

        txtFld_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFld_UsernameActionPerformed(evt);
            }
        });
        panel_Properties.add(txtFld_Username);
        txtFld_Username.setBounds(120, 30, 140, 30);

        btn_LogIn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_LogIn.setText("Log In");
        btn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LogInActionPerformed(evt);
            }
        });
        panel_Properties.add(btn_LogIn);
        btn_LogIn.setBounds(60, 160, 87, 26);

        btn_Cancel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        panel_Properties.add(btn_Cancel);
        btn_Cancel.setBounds(170, 160, 87, 26);

        lbl_UsernameCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_UsernameCheck);
        lbl_UsernameCheck.setBounds(260, 40, 30, 20);

        lbl_PasswordCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_PasswordCheck);
        lbl_PasswordCheck.setBounds(260, 100, 30, 20);

        pwdFld_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFld_PasswordActionPerformed(evt);
            }
        });
        panel_Properties.add(pwdFld_Password);
        pwdFld_Password.setBounds(120, 90, 140, 30);

        panel_Banner.setLayout(null);

        lbl_FailureImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FailureImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/blinking-red-dot.gif"))); // NOI18N
        lbl_FailureImage.setText("jLabel13");
        panel_Banner.add(lbl_FailureImage);
        lbl_FailureImage.setBounds(10, 10, 60, 40);

        lbl_SuccessImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SuccessImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/blinking-green-dot.gif"))); // NOI18N
        lbl_SuccessImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panel_Banner.add(lbl_SuccessImage);
        lbl_SuccessImage.setBounds(10, 10, 60, 40);

        lbl_CompanyName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_CompanyName.setText("BookShop");
        panel_Banner.add(lbl_CompanyName);
        lbl_CompanyName.setBounds(10, 150, 70, 16);

        lbl_VersionNumber.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_VersionNumber.setText("Version 1.0");
        panel_Banner.add(lbl_VersionNumber);
        lbl_VersionNumber.setBounds(10, 180, 70, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
            .addComponent(panel_Banner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFld_UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFld_UsernameActionPerformed
        // Tests whether string is null or blank (empty and with white space(s))
        // Also activates and deactivates corresponding check marks
        boolean condition = txtFld_Username.getText() == null || txtFld_Username.
                getText().isEmpty() || txtFld_Username.getText().contains(" ");
        if (condition) {
            lbl_UsernameCheck.setForeground(Color.RED);
            lbl_UsernameCheck.setText("\u274C"); // Cross Mark Unicode
            lbl_UsernameCheck.setVisible(true);
            txtFld_Username.requestFocusInWindow();
        } else {
            lbl_UsernameCheck.setForeground(Color.GREEN);
            lbl_UsernameCheck.setText("\u2714"); // Heavy Check Mark Unicode
            lbl_UsernameCheck.setVisible(true);
            pwdFld_Password.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFld_UsernameActionPerformed

    private void btn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LogInActionPerformed
        Vector vectorNickName = new Vector();
        Vector vectorPassword = new Vector();
        // Retrieves nickname and password
        String query = "SELECT [EmployeeNickName], [EmployeePassword] "
            + "FROM [BookShop].[dbo].[Employee]";
        try (
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
            ) {
            
            while (resultSet.next()) {
                vectorNickName.add(resultSet.getString("EmployeeNickName"));
                vectorPassword.add(resultSet.getString("EmployeePassword"));
            }
            
            // Compares user inputs with row set data
            for (Object nickName : vectorNickName) {
                if (txtFld_Username.getText().equals((String) nickName)) {
                    System.out.println("Good Username");
                    for (Object password : vectorPassword) {
                        if ((String.valueOf(pwdFld_Password.getPassword()).equals((String) password))) {
                            System.out.println("Good Password");
                            JOptionPane.showMessageDialog(this, "Access Granted", "Successful Login", JOptionPane.INFORMATION_MESSAGE);
                            new Dashboard_JFrame().setVisible(true);
                            dispose();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(this, "Invalid Password", "Password Error", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                
                    }     
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Username", "Username Error", JOptionPane.ERROR_MESSAGE);
                    break;
                }
            }
        } catch (SQLException ex) {
            dispose();
            setVisible(true);
            System.out.println("No");
            Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_LogInActionPerformed

    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

    private void pwdFld_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdFld_PasswordActionPerformed
        // Tests whether string is null or blank (empty and with white space(s))
        // Also activates and deactivates corresponding check marks
        boolean condition = String.valueOf(pwdFld_Password.getPassword()) == null 
            || String.valueOf(pwdFld_Password.getPassword()).isEmpty() 
            || String.valueOf(pwdFld_Password.getPassword()).contains(" ");
        if (condition) {
            lbl_PasswordCheck.setForeground(Color.RED);
            lbl_PasswordCheck.setText("\u274C"); // Cross Mark Unicode
            lbl_PasswordCheck.setVisible(true);
            pwdFld_Password.requestFocusInWindow();
        } else {
            lbl_PasswordCheck.setForeground(Color.GREEN);
            lbl_PasswordCheck.setText("\u2714"); // Heavy Check Mark Unicode
            lbl_PasswordCheck.setVisible(true);
            btn_LogIn.requestFocusInWindow();
        }
    }//GEN-LAST:event_pwdFld_PasswordActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F10) new DatabaseLogin().setVisible(true);
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(AppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppLogin(null).setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_LogIn;
    private javax.swing.JLabel lbl_CompanyName;
    private javax.swing.JLabel lbl_FailureImage;
    private javax.swing.JLabel lbl_PasswordCheck;
    private javax.swing.JLabel lbl_PortNumber;
    private javax.swing.JLabel lbl_SuccessImage;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JLabel lbl_UsernameCheck;
    private javax.swing.JLabel lbl_VersionNumber;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_Properties;
    private javax.swing.JPasswordField pwdFld_Password;
    private javax.swing.JTextField txtFld_Username;
    // End of variables declaration//GEN-END:variables
}