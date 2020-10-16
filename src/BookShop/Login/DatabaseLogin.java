/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop.Login;

import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author bolem
 */
public class DatabaseLogin extends javax.swing.JFrame {

    /**
     * Creates new form DatabaseLogin
     */
    public DatabaseLogin() {
        initComponents();
        initDisplay();
    }
    
    /*
     * Initializes components' primary display
     */
    private void initDisplay() {
        // Empties first text field
        txtFld_serverName.setText("");
        
        // Displays default items
        lbl_DefaultImage.setVisible(true);
        lbl_DatabaseNameCheck.setText("\u2714");
        
        // Disables some text fields
        txtFld_PortNumber.setEnabled(false);
        txtFld_Username.setEnabled(false);
        pwdFld_Password.setEnabled(false);
        
        // Hides check marks
        lbl_ServerNameCheck.setVisible(false);
        lbl_PortNumberCheck.setVisible(false);
        lbl_UsernameCheck.setVisible(false);
        lbl_PasswordCheck.setVisible(false);
        lbl_SuccessImage.setVisible(false);
        lbl_FailureImage.setVisible(false);
        
        // Disables login button
        btn_Connect.setEnabled(false);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Properties = new javax.swing.JPanel();
        lbl_ServerName = new javax.swing.JLabel();
        lbl_PortNumber = new javax.swing.JLabel();
        lbl_DatabaseName = new javax.swing.JLabel();
        lbl_Username = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        txtFld_serverName = new javax.swing.JTextField();
        txtFld_PortNumber = new javax.swing.JTextField();
        txtFld_DatabaseName = new javax.swing.JTextField();
        txtFld_Username = new javax.swing.JTextField();
        btn_Connect = new javax.swing.JButton();
        btn_Cancel = new javax.swing.JButton();
        pwdFld_Password = new javax.swing.JPasswordField();
        lbl_ServerNameCheck = new javax.swing.JLabel();
        lbl_PortNumberCheck = new javax.swing.JLabel();
        lbl_DatabaseNameCheck = new javax.swing.JLabel();
        lbl_UsernameCheck = new javax.swing.JLabel();
        lbl_PasswordCheck = new javax.swing.JLabel();
        panel_Banner = new javax.swing.JPanel();
        lbl_SuccessImage = new javax.swing.JLabel();
        lbl_FailureImage = new javax.swing.JLabel();
        lbl_DefaultImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Database Login");

        panel_Properties.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Database Properties", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12))); // NOI18N
        panel_Properties.setLayout(null);

        lbl_ServerName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_ServerName.setText("Server Name:");
        panel_Properties.add(lbl_ServerName);
        lbl_ServerName.setBounds(20, 40, 75, 20);

        lbl_PortNumber.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_PortNumber.setText("Port Number:");
        panel_Properties.add(lbl_PortNumber);
        lbl_PortNumber.setBounds(20, 70, 73, 20);

        lbl_DatabaseName.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_DatabaseName.setText("Database Name:");
        panel_Properties.add(lbl_DatabaseName);
        lbl_DatabaseName.setBounds(20, 100, 94, 20);

        lbl_Username.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_Username.setText("Username:");
        panel_Properties.add(lbl_Username);
        lbl_Username.setBounds(20, 130, 62, 20);

        lbl_Password.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_Password.setText("Password:");
        panel_Properties.add(lbl_Password);
        lbl_Password.setBounds(20, 160, 59, 20);

        txtFld_serverName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFld_serverNameActionPerformed(evt);
            }
        });
        panel_Properties.add(txtFld_serverName);
        txtFld_serverName.setBounds(120, 30, 140, 30);

        txtFld_PortNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFld_PortNumberActionPerformed(evt);
            }
        });
        panel_Properties.add(txtFld_PortNumber);
        txtFld_PortNumber.setBounds(120, 60, 140, 30);

        txtFld_DatabaseName.setText("BookShop");
        txtFld_DatabaseName.setEnabled(false);
        txtFld_DatabaseName.setRequestFocusEnabled(false);
        panel_Properties.add(txtFld_DatabaseName);
        txtFld_DatabaseName.setBounds(120, 90, 140, 30);

        txtFld_Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFld_UsernameActionPerformed(evt);
            }
        });
        panel_Properties.add(txtFld_Username);
        txtFld_Username.setBounds(120, 120, 140, 30);

        btn_Connect.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_Connect.setText("Connect");
        btn_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConnectActionPerformed(evt);
            }
        });
        panel_Properties.add(btn_Connect);
        btn_Connect.setBounds(60, 200, 87, 25);

        btn_Cancel.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        btn_Cancel.setText("Cancel");
        btn_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelActionPerformed(evt);
            }
        });
        panel_Properties.add(btn_Cancel);
        btn_Cancel.setBounds(170, 200, 87, 25);

        pwdFld_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdFld_PasswordActionPerformed(evt);
            }
        });
        panel_Properties.add(pwdFld_Password);
        pwdFld_Password.setBounds(120, 150, 140, 30);

        lbl_ServerNameCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_ServerNameCheck);
        lbl_ServerNameCheck.setBounds(260, 40, 30, 20);

        lbl_PortNumberCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_PortNumberCheck);
        lbl_PortNumberCheck.setBounds(260, 70, 30, 20);

        lbl_DatabaseNameCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_DatabaseNameCheck.setForeground(new java.awt.Color(51, 255, 51));
        lbl_DatabaseNameCheck.setText(" ");
        panel_Properties.add(lbl_DatabaseNameCheck);
        lbl_DatabaseNameCheck.setBounds(258, 100, 30, 20);

        lbl_UsernameCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_UsernameCheck);
        lbl_UsernameCheck.setBounds(260, 130, 30, 20);

        lbl_PasswordCheck.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        panel_Properties.add(lbl_PasswordCheck);
        lbl_PasswordCheck.setBounds(260, 160, 30, 20);

        panel_Banner.setLayout(null);

        lbl_SuccessImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SuccessImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/database.connected.png"))); // NOI18N
        panel_Banner.add(lbl_SuccessImage);
        lbl_SuccessImage.setBounds(0, 10, 136, 140);

        lbl_FailureImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FailureImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/database.notConnected.png"))); // NOI18N
        panel_Banner.add(lbl_FailureImage);
        lbl_FailureImage.setBounds(0, 10, 140, 140);

        lbl_DefaultImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_DefaultImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/database.default.png"))); // NOI18N
        panel_Banner.add(lbl_DefaultImage);
        lbl_DefaultImage.setBounds(0, 10, 140, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Properties, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panel_Banner, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 78, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_Properties, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFld_serverNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFld_serverNameActionPerformed
        // Tests whether string is null or blank (empty and with white space(s))
        // Also activates and deactivates corresponding check marks
        boolean condition = txtFld_serverName.getText() == null || txtFld_serverName.
                getText().isEmpty() || txtFld_serverName.getText().contains(" ");
        if (condition) {
            lbl_ServerNameCheck.setForeground(Color.RED);
            lbl_ServerNameCheck.setText("\u274C"); // Cross Mark Unicode
            lbl_ServerNameCheck.setVisible(true);
            txtFld_serverName.requestFocusInWindow();
            txtFld_serverName.setText("");
        } else {
            lbl_ServerNameCheck.setForeground(Color.GREEN);
            lbl_ServerNameCheck.setText("\u2714"); // Heavy Check Mark Unicode
            lbl_ServerNameCheck.setVisible(true);
            txtFld_PortNumber.setEnabled(true);
            txtFld_PortNumber.requestFocusInWindow();
        }
    }//GEN-LAST:event_txtFld_serverNameActionPerformed

    private void txtFld_PortNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFld_PortNumberActionPerformed
        // Tests whether string contains digits only
        // Also activates and deactivates corresponding check marks
        boolean condition = txtFld_PortNumber.getText() == null || txtFld_PortNumber.
                getText().isEmpty() || txtFld_PortNumber.getText().contains(" ");
        if (condition) {  
            lbl_PortNumberCheck.setForeground(Color.RED);
            lbl_PortNumberCheck.setText("\u274C"); // Cross Mark Unicode
            lbl_PortNumberCheck.setVisible(true);
            txtFld_PortNumber.requestFocusInWindow();
            txtFld_PortNumber.setText("");
        } else {
            try {
                Integer.parseInt(txtFld_PortNumber.getText());
                lbl_PortNumberCheck.setForeground(Color.GREEN);
                lbl_PortNumberCheck.setText("\u2714"); // Heavy Check Mark Unicode
                lbl_PortNumberCheck.setVisible(true);
                txtFld_Username.setEnabled(true);
                txtFld_Username.requestFocusInWindow();
            } catch (NumberFormatException ex) {
                lbl_PortNumberCheck.setForeground(Color.RED);
                lbl_PortNumberCheck.setText("\u274C"); // Cross Mark Unicode
                lbl_PortNumberCheck.setVisible(true);
                txtFld_PortNumber.setText("");
                txtFld_PortNumber.requestFocusInWindow(); 
            }
        }
    }//GEN-LAST:event_txtFld_PortNumberActionPerformed

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
            txtFld_Username.setText("");
        } else {
            lbl_UsernameCheck.setForeground(Color.GREEN);
            lbl_UsernameCheck.setText("\u2714"); // Heavy Check Mark Unicode
            lbl_UsernameCheck.setVisible(true);
            pwdFld_Password.requestFocusInWindow();
            pwdFld_Password.setEnabled(true);
        }
    }//GEN-LAST:event_txtFld_UsernameActionPerformed

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
            pwdFld_Password.setText("");
        } else {
            lbl_PasswordCheck.setForeground(Color.GREEN);
            lbl_PasswordCheck.setText("\u2714"); // Heavy Check Mark Unicode
            lbl_PasswordCheck.setVisible(true);
            btn_Connect.requestFocusInWindow();
            btn_Connect.setEnabled(true);
        }
    }//GEN-LAST:event_pwdFld_PasswordActionPerformed

    private void btn_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConnectActionPerformed
        // Establishes the complexConnection with actual arguments
        try (Connection connection = getConnection(txtFld_serverName.getText(), 
            txtFld_PortNumber.getText(),
            txtFld_Username.getText(),
            String.valueOf(pwdFld_Password.getPassword()));) {
            // Sets new database image 
            lbl_DefaultImage.setVisible(false);
            lbl_SuccessImage.setVisible(true);
            
            // Saves properties in a file for future use and overwrite existing
            // data in file
            // For use only in case of frequent database ons and offs
            Encoder encoder = Base64.getEncoder();
            PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(new FileOutputStream(
                "database.properties.txt", false), "UTF-8"), true);
            printWriter.print(encoder.encodeToString(txtFld_serverName.getText().getBytes()));
            printWriter.print(" ");
            printWriter.print(encoder.encodeToString(txtFld_PortNumber.getText().getBytes()));
            printWriter.print(" ");
            printWriter.print(encoder.encodeToString(txtFld_Username.getText().getBytes()));
            printWriter.print(" ");
            printWriter.println(encoder.encodeToString(String.valueOf(pwdFld_Password.getPassword()).getBytes()));
                    
            // Informs of complexConnection success
            JOptionPane.showMessageDialog(panel_Properties, "Database connection has "
                + "succeeded!", "" + connection.getMetaData().
                getDatabaseProductName() + " " + connection.getMetaData().
                getDatabaseProductVersion(), JOptionPane.INFORMATION_MESSAGE);
            
            // calls user login app and closes itself
            new AppLogin(null).setVisible(true);
            dispose();
        } catch (SQLException | FileNotFoundException | UnsupportedEncodingException ex) {
            // Sets new database image 
            lbl_DefaultImage.setVisible(false);
            lbl_FailureImage.setVisible(true);
            
            // Informs of complexConnection failure
            JOptionPane.showMessageDialog(panel_Properties, "Database connection has "
                + "failed!", "Connection Error", JOptionPane.ERROR_MESSAGE);
            
            // Sets primary display
            initDisplay();
            Logger.getLogger(DatabaseLogin.class.getName()).log(Level.
                SEVERE, null, ex);    
        }
        
//        String password = System.getProperty("password");
//        if (password == null) {
//            throw new IllegalArgumentException("Run with -Dpassword=<password>");
//        }
//
//        // The salt (probably) can be stored along with the encrypted data
//        byte[] salt = new String("12345678").getBytes();
//
//        // Decreasing this speeds down startup time and can be useful during testing, but it also makes it easier for brute force attackers
//        int iterationCount = 40000;
//        // Other values give java.security.InvalidKeyException: Illegal key size or default parameters
//        int keyLength = 128;
//        
//        try {
//            SecretKeySpec key = createSecretKey(password.toCharArray(),
//                    salt, iterationCount, keyLength);
//            System.out.println("" + key);
//        } catch (NoSuchAlgorithmException ex) {
//            Logger.getLogger(DatabaseLogin.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InvalidKeySpecException ex) {
//            Logger.getLogger(DatabaseLogin.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btn_ConnectActionPerformed
    
//    private SecretKeySpec createSecretKey(char[] password, byte[] salt, int iterationCount, int keyLength) throws NoSuchAlgorithmException, InvalidKeySpecException {
//        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
//        PBEKeySpec keySpec = new PBEKeySpec(password, salt, iterationCount, keyLength);
//        SecretKey keyTmp = keyFactory.generateSecret(keySpec);
//        return new SecretKeySpec(keyTmp.getEncoded(), "AES");
//    }
//
//    private static String encrypt(String property, SecretKeySpec key) throws GeneralSecurityException, UnsupportedEncodingException {
//        Cipher pbeCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        pbeCipher.init(Cipher.ENCRYPT_MODE, key);
//        AlgorithmParameters parameters = pbeCipher.getParameters();
//        IvParameterSpec ivParameterSpec = parameters.getParameterSpec(IvParameterSpec.class);
//        byte[] cryptoText = pbeCipher.doFinal(property.getBytes("UTF-8"));
//        byte[] iv = ivParameterSpec.getIV();
//        return base64Encode(iv) + ":" + base64Encode(cryptoText);
//    }
//
//    private static String base64Encode(byte[] bytes) {
//        return Base64.getEncoder().encodeToString(bytes);
//    }
//    
//    private static byte[] base64Decode(String property) throws IOException {
//        return Base64.getDecoder().decode(property);
//    }
//
//    private static String decrypt(String string, SecretKeySpec key) throws GeneralSecurityException, IOException {
//        String iv = string.split(":")[0];
//        String property = string.split(":")[1];
//        Cipher pbeCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
//        pbeCipher.init(Cipher.DECRYPT_MODE, key, new IvParameterSpec(base64Decode(iv)));
//        return new String(pbeCipher.doFinal(base64Decode(property)), "UTF-8");
//    }
    
    
    private void btn_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(DatabaseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatabaseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatabaseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatabaseLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatabaseLogin().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cancel;
    private javax.swing.JButton btn_Connect;
    private javax.swing.JLabel lbl_DatabaseName;
    private javax.swing.JLabel lbl_DatabaseNameCheck;
    private javax.swing.JLabel lbl_DefaultImage;
    private javax.swing.JLabel lbl_FailureImage;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_PasswordCheck;
    private javax.swing.JLabel lbl_PortNumber;
    private javax.swing.JLabel lbl_PortNumberCheck;
    private javax.swing.JLabel lbl_ServerName;
    private javax.swing.JLabel lbl_ServerNameCheck;
    private javax.swing.JLabel lbl_SuccessImage;
    private javax.swing.JLabel lbl_Username;
    private javax.swing.JLabel lbl_UsernameCheck;
    private javax.swing.JPanel panel_Banner;
    private javax.swing.JPanel panel_Properties;
    private javax.swing.JPasswordField pwdFld_Password;
    private javax.swing.JTextField txtFld_DatabaseName;
    private javax.swing.JTextField txtFld_PortNumber;
    private javax.swing.JTextField txtFld_Username;
    private javax.swing.JTextField txtFld_serverName;
    // End of variables declaration//GEN-END:variables
}
