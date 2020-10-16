package BookShop.Category;

import BookShop.Login.AppLogin;
import BookShop.Methods.FilterJtable;
import com.microsoft.sqlserver.jdbc.SQLServerException;
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
import javax.swing.table.DefaultTableModel;

public final class Category extends javax.swing.JPanel 
{
    Vector vectorThemes = new Vector();
    Vector vectorSubThemes = new Vector();
    String name = null;
    String parent = null;
    
    public Category() 
    {
        initComponents();
        panel_Consult.setVisible(true);
        new FilterJtable().FilterJtable(tbl_Themes, jTextField1);        
        new FilterJtable().FilterJtable(tbl_SubThemes, jTextField2);     
        
    }
    
    /**
     * Prepares a data source connection object
     * @param serverNameField, a server name 
     * @param portNumberField, a port number
     * @param userNameField, a user name
     * @param passwordField, a password
     * @return the datasource connection object thus prepared
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
            /* JOptionPane.showMessageDialog(panel_Properties, "Not Connected. 
             *  Contact Admin",
             *  "Connection Data Saving Error", JOptionPane.ERROR_MESSAGE);
             */
        }
        
        // Calls connection method
        Connection connect = null;
        try {
            connect = getConnection(
            new String(decoder.decode(line[0])),
            new String(decoder.decode(line[1])), 
            new String(decoder.decode(line[2])), 
            new String(decoder.decode(line[3]))); 
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.
                SEVERE, null, ex);
        }
        return connect;
    } 
    
    public DefaultTableModel initTableThemes() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("List Of Categories");
         
        return new DefaultTableModel(getThemes(), vectorTitle) {
            boolean[] canEdit = new boolean [] {
                false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    private Vector getThemes() {
        String query =  "SELECT [ThemeLabel] FROM [BookShop].[dbo].[Theme]\n" 
            + " ORDER BY [ThemeLabel] ASC";
        vectorThemes.removeAllElements();
        // Fills vector with themes
        try (  
            Statement statement = simpleConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ) {
            
            while (resultSet.next()) {
                Themes theme = new Themes(
                        resultSet.getString("ThemeLabel")
                );
                vectorThemes.add(theme.getVector());
            }          
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vectorThemes;
    }
    
    public DefaultTableModel initTableSubThemes() {
        Vector vectorTitle = new Vector();
        vectorTitle.add("List Of SubCategories");
         
        return new DefaultTableModel(getSubThemes(), vectorTitle) {
            boolean[] canEdit = new boolean [] {
                false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
    
    private Vector getSubThemes() {
        String query =  "SELECT [SubThemeLabel] FROM [BookShop].[dbo].[SubTheme]\n" 
            + " ORDER BY [SubThemeLabel] ASC";
        
        // Fills vector with themes
        try (  
            Statement statement = simpleConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            ) {
            
            while (resultSet.next()) {
                SubThemes subTheme = new SubThemes(
                        resultSet.getString("SubThemeLabel")
                );
                vectorSubThemes.add(subTheme.getVector());
                
            }  
        } catch (SQLException ex) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vectorSubThemes;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbl_B1 = new javax.swing.JTable();
        panel_Consult = new javax.swing.JPanel();
        Up = new javax.swing.JPanel();
        lbl_TitleManageBook = new javax.swing.JLabel();
        Bar = new javax.swing.JPanel();
        lbl_TitleBook = new javax.swing.JLabel();
        sep_Customer = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_Add = new javax.swing.JButton();
        btn_Edit = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Themes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_SubThemes = new javax.swing.JTable();

        tbl_B1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Title 1"
            }
        ));

        setLayout(new java.awt.CardLayout());

        panel_Consult.setBackground(new java.awt.Color(242, 242, 242));

        Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageBook.setText("MANAGE CATEGORY");

        javax.swing.GroupLayout UpLayout = new javax.swing.GroupLayout(Up);
        Up.setLayout(UpLayout);
        UpLayout.setHorizontalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpLayout.setVerticalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Bar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Globe_32px.png"))); // NOI18N
        lbl_TitleBook.setText("List of All Categories in Alphabetical Order");

        jLabel2.setText("Search Categories:");

        btn_Add.setBackground(new java.awt.Color(135, 199, 213));
        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Add.setText("Add a Category or a SubCategory");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Edit.setBackground(new java.awt.Color(135, 199, 213));
        btn_Edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Edit.setText("Edit a Category or a SubCategory");
        btn_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditActionPerformed(evt);
            }
        });

        jLabel3.setText("Search SubCategories:");

        tbl_Themes.setModel(initTableThemes());
        jScrollPane1.setViewportView(tbl_Themes);

        tbl_SubThemes.setModel(initTableSubThemes());
        jScrollPane2.setViewportView(tbl_SubThemes);

        javax.swing.GroupLayout BarLayout = new javax.swing.GroupLayout(Bar);
        Bar.setLayout(BarLayout);
        BarLayout.setHorizontalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BarLayout.createSequentialGroup()
                        .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Customer)
                            .addGroup(BarLayout.createSequentialGroup()
                                .addComponent(lbl_TitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Add)
                                .addGap(93, 93, 93)
                                .addComponent(btn_Edit)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(BarLayout.createSequentialGroup()
                        .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BarLayout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(190, 190, 190))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BarLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BarLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(851, 851, 851))))
        );
        BarLayout.setVerticalGroup(
            BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleBook)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(sep_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(BarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(889, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_ConsultLayout = new javax.swing.GroupLayout(panel_Consult);
        panel_Consult.setLayout(panel_ConsultLayout);
        panel_ConsultLayout.setHorizontalGroup(
            panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ConsultLayout.createSequentialGroup()
                .addGroup(panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Bar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_ConsultLayout.setVerticalGroup(
            panel_ConsultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ConsultLayout.createSequentialGroup()
                .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panel_Consult, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditActionPerformed
        String category = (String) JOptionPane.showInputDialog(
            btn_Edit,    
            "Enter Category",
            "Enter Category Dialog",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            null);
        
        int themeSelected = tbl_Themes.getSelectedRow();
        int subThemeSelected = tbl_SubThemes.getSelectedRow();
        
//        if (themeSelected != ) {
            
//        }
//        String s = tbl_Attributes.getValueAt(ligneSelectionne, 0).toString();
//            JOptionPane.showMessageDialog(this,"You have to select a book","No
//        book found !", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btn_EditActionPerformed

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // Enter category in a JDialog
        String label = (String)JOptionPane.showInputDialog(
            btn_Add,
            "Enter Category:",
            "Enter Category Dialog",
            JOptionPane.PLAIN_MESSAGE,
            null,
            null,
            null);
        // Tests category if one was returned,
        if (label.matches("[a-zA-Z ]+[a-zA-Z]")) {
            // Lists parents in a JDialog
            int i = 0;
            Object[] parents = new Object[getThemes().size()];
            parents[i] = "None";
            for (i = 1; i < getThemes().size(); i++) {
                parents[i] = getThemes().get(i);         
            }
            parent = (String)JOptionPane.showInputDialog(
                btn_Add,
                "Enter Parent:",
                "Enter Parent Dialog",
                JOptionPane.PLAIN_MESSAGE,
                null,
                parents,
                parents[0]);

            // Tests whether there is no parent                
            if (parent.equals(parents[0])) {
                PreparedStatement preparedStatement = null;
                try {
                    String insert = "INSERT INTO [dbo].[THEME] ([ThemeLabel])\n"
                    + " VALUES (?)";
                    preparedStatement = new AppLogin().simpleConnection().
                                                        prepareStatement(insert);
                    preparedStatement.setString(1, label);
                    int result = preparedStatement.executeUpdate();

                    // Compares user inputs with row set data
                    if (result != 0) {
                        this.setVisible(false);
                        this.setVisible(true);
                    } else {
                    }
                } catch (SQLException ex) {
                    setVisible(true);
                    Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                PreparedStatement preparedStatement = null;
                try {
                    String insert = "INSERT INTO [dbo].[SUBTHEME] ([SubThemeLabel])\n"
                    + " VALUES (?)";
                    preparedStatement = new AppLogin().simpleConnection().
                                                        prepareStatement(insert);
                    preparedStatement.setString(1, parent);
                    int result = preparedStatement.executeUpdate();
                    // Compares user inputs with row set data
                    if (result != 0) {
                        this.setVisible(false);
                        this.setVisible(true);
                    } else {
                    }
                } catch (SQLException ex) {
                    setVisible(true);
                    Logger.getLogger(AppLogin.class.getName()).log(Level.SEVERE, null, ex);
                } 
            }

        } else {
            JOptionPane.showMessageDialog(btn_Add, "Incorrect Label", "Label "
                    + "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_AddActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Bar;
    private javax.swing.JPanel Up;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Edit;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel lbl_TitleBook;
    private javax.swing.JLabel lbl_TitleManageBook;
    private javax.swing.JPanel panel_Consult;
    private javax.swing.JSeparator sep_Customer;
    private javax.swing.JTable tbl_B1;
    private javax.swing.JTable tbl_SubThemes;
    private javax.swing.JTable tbl_Themes;
    // End of variables declaration//GEN-END:variables
}