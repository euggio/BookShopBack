package BookShop.Author;

import BookShop.Book.*;
import BookShop.Methods.FilterJtable;
import BookShop.Methods.GetConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Author Panel
 * @author euggio
 */
public class Author_JPanel extends javax.swing.JPanel {

    /**
     * No-arg constructor
     */
    public Author_JPanel() {
        initComponents();
        fjt.FilterJtable(tbl_Attributes, txtFld_Research);
        tglBtn_AuthorStatus.setEnabled(false);
    }

    // HELPER METHODS ----------------------------------------------------------
    private DefaultTableModel initTable() {
        return new DefaultTableModel(author.getDataRowAuthor(), author.
                                                        getDataColumnAuthor()) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    private DefaultTableModel initTableBook() {
        return new DefaultTableModel(author.getDataRowBook(vInfoString), author.
                                                        getDataColumnBook()) {
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Consult = new javax.swing.JScrollPane();
        panel_Consult1 = new javax.swing.JPanel();
        Up = new javax.swing.JPanel();
        lbl_TitleManagePublisher = new javax.swing.JLabel();
        Left_SideBar = new javax.swing.JPanel();
        lbl_TitlePublisher = new javax.swing.JLabel();
        btn_AddAuthor = new javax.swing.JButton();
        sep_Customer3 = new javax.swing.JSeparator();
        lbl_Status1 = new javax.swing.JLabel();
        tglBtn_AuthorStatus = new javax.swing.JToggleButton();
        lbl_TitleAttributes1 = new javax.swing.JLabel();
        sep_Attirbutes1 = new javax.swing.JSeparator();
        scrBar_Attributes1 = new javax.swing.JScrollPane();
        tbl_Attributes = new javax.swing.JTable();
        lbl_TitleComments1 = new javax.swing.JLabel();
        scrBar_Comments1 = new javax.swing.JScrollPane();
        tbl_Book = new javax.swing.JTable();
        sep_Comments3 = new javax.swing.JSeparator();
        txtFld_Research = new javax.swing.JTextField();
        lbl_Research = new javax.swing.JLabel();
        lbl_Research1 = new javax.swing.JLabel();
        txtFld_Research1 = new javax.swing.JTextField();
        btn_DeleteAuthor = new javax.swing.JButton();
        Right_SideBar = new javax.swing.JPanel();
        LeftsideUp3 = new javax.swing.JPanel();
        lbl_TitleInfos3 = new javax.swing.JLabel();
        sep_Infos3 = new javax.swing.JSeparator();
        lbl_InfoName = new javax.swing.JLabel();
        lbl_InfoName1 = new javax.swing.JLabel();
        lbl_InfoBirthdate = new javax.swing.JLabel();
        lbl_InfoBirthdate1 = new javax.swing.JLabel();
        btn_EditAuthor = new javax.swing.JButton();
        Rightside3 = new javax.swing.JPanel();
        lbl_TitleNote3 = new javax.swing.JLabel();
        sep_Note3 = new javax.swing.JSeparator();
        scrBar_Note3 = new javax.swing.JScrollPane();
        txtArea_Note = new javax.swing.JTextArea();
        LeftsideDown3 = new javax.swing.JPanel();
        lbl_TitleOrder3 = new javax.swing.JLabel();
        sep_Order3 = new javax.swing.JSeparator();
        lbl_TotalTitle = new javax.swing.JLabel();
        lbl_TotalValue = new javax.swing.JLabel();
        btn_Details3 = new javax.swing.JButton();
        Down = new javax.swing.JPanel();
        tabPan_Address6 = new javax.swing.JTabbedPane();
        panel_Shipping6 = new javax.swing.JPanel();
        lbl_InfoDescription = new javax.swing.JLabel();
        lbl_InfoDeathdate = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea_Description = new javax.swing.JTextArea();
        lbl_InfoDeathdate1 = new javax.swing.JLabel();
        panel_Delivery3 = new javax.swing.JPanel();
        lbl_InfoLabel = new javax.swing.JLabel();
        lbl_InfoStreet = new javax.swing.JLabel();
        lbl_InfoStreet2 = new javax.swing.JLabel();
        lbl_InfoZip = new javax.swing.JLabel();
        lbl_InfoCity = new javax.swing.JLabel();
        lbl_InfoCountry = new javax.swing.JLabel();
        lbl_InfoPhone = new javax.swing.JLabel();
        lbl_InfoLabel1 = new javax.swing.JLabel();
        lbl_InfoStreet1 = new javax.swing.JLabel();
        lbl_InfoStreet21 = new javax.swing.JLabel();
        lbl_InfoZip1 = new javax.swing.JLabel();
        lbl_InfoCity1 = new javax.swing.JLabel();
        lbl_InfoCountry1 = new javax.swing.JLabel();
        lbl_InfoPhone1 = new javax.swing.JLabel();
        panel_Add = new javax.swing.JScrollPane();
        panel_Add1 = new javax.swing.JPanel();
        Up1 = new javax.swing.JPanel();
        lbl_TitleManageCustomer1 = new javax.swing.JLabel();
        Left_SideBar1 = new javax.swing.JPanel();
        lbl_Author = new javax.swing.JLabel();
        sep_Customer1 = new javax.swing.JSeparator();
        sep_Comments1 = new javax.swing.JSeparator();
        txtFld_AddLastname = new javax.swing.JTextField();
        txtFld_AddFirstname = new javax.swing.JTextField();
        txtFld_AddBirthdate = new javax.swing.JTextField();
        lbl_LastName = new javax.swing.JLabel();
        lbl_Title1 = new javax.swing.JLabel();
        lbl_Birthdate = new javax.swing.JLabel();
        lbl_Deathdate = new javax.swing.JLabel();
        lbl_Description = new javax.swing.JLabel();
        btn_AddPicture = new javax.swing.JButton();
        lbl_Picture = new javax.swing.JLabel();
        btn_ValidateAdd = new javax.swing.JButton();
        btn_BackAdd = new javax.swing.JButton();
        lbl_VLastname = new javax.swing.JLabel();
        lbl_VFirstname = new javax.swing.JLabel();
        lbl_VBirthdate = new javax.swing.JLabel();
        lbl_VDeathdate = new javax.swing.JLabel();
        lbl_VPicture = new javax.swing.JLabel();
        txtFld_AddDeathdate = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea_AddDescription = new javax.swing.JTextArea();
        lbl_Label = new javax.swing.JLabel();
        txtFld_AddAddressLabel = new javax.swing.JTextField();
        lbl_Street = new javax.swing.JLabel();
        txtFld_AddAddressStreet = new javax.swing.JTextField();
        txtFld_AddAddressStreet2 = new javax.swing.JTextField();
        lbl_Street2 = new javax.swing.JLabel();
        txtFld_AddAddressZip = new javax.swing.JTextField();
        lbl_Zip = new javax.swing.JLabel();
        lbl_City = new javax.swing.JLabel();
        txtFld_AddAddressCity = new javax.swing.JTextField();
        txtFld_AddAddressCountry = new javax.swing.JTextField();
        lbl_Country = new javax.swing.JLabel();
        lbl_Phone = new javax.swing.JLabel();
        txtFld_AddAddressPhone = new javax.swing.JTextField();
        lbl_Author3 = new javax.swing.JLabel();
        lbl_VLabel = new javax.swing.JLabel();
        lbl_VStreet2 = new javax.swing.JLabel();
        lbl_VStreet = new javax.swing.JLabel();
        lbl_VZip = new javax.swing.JLabel();
        lbl_VCity = new javax.swing.JLabel();
        lbl_VCountry = new javax.swing.JLabel();
        lbl_VPhone = new javax.swing.JLabel();
        Right_SideBar1 = new javax.swing.JPanel();
        LeftsideUp1 = new javax.swing.JPanel();
        lbl_TitleInfos1 = new javax.swing.JLabel();
        sep_Infos1 = new javax.swing.JSeparator();
        lbl_InfoName3 = new javax.swing.JLabel();
        lbl_InfoName4 = new javax.swing.JLabel();
        lbl_InfoBirthdate3 = new javax.swing.JLabel();
        lbl_InfoBirthdate4 = new javax.swing.JLabel();
        btn_EditBook = new javax.swing.JButton();
        Rightside1 = new javax.swing.JPanel();
        lbl_TitleNote1 = new javax.swing.JLabel();
        sep_Note1 = new javax.swing.JSeparator();
        scrBar_Note1 = new javax.swing.JScrollPane();
        txtArea_AddNote = new javax.swing.JTextArea();
        LeftsideDown1 = new javax.swing.JPanel();
        lbl_TitleOrder1 = new javax.swing.JLabel();
        sep_Order1 = new javax.swing.JSeparator();
        lbl_TotalTitle1 = new javax.swing.JLabel();
        lbl_TotalValue1 = new javax.swing.JLabel();
        btn_Details1 = new javax.swing.JButton();
        Down1 = new javax.swing.JPanel();
        tabPan_Address4 = new javax.swing.JTabbedPane();
        panel_Shipping4 = new javax.swing.JPanel();
        panel_Delivery1 = new javax.swing.JPanel();
        panel_Edit = new javax.swing.JScrollPane();
        panel_Edit1 = new javax.swing.JPanel();
        Up2 = new javax.swing.JPanel();
        lbl_TitleManageCustomer2 = new javax.swing.JLabel();
        Left_SideBar2 = new javax.swing.JPanel();
        lbl_Author1 = new javax.swing.JLabel();
        sep_Customer2 = new javax.swing.JSeparator();
        sep_Comments2 = new javax.swing.JSeparator();
        txtFld_EditLastname = new javax.swing.JTextField();
        txtFld_EditFirstname = new javax.swing.JTextField();
        txtFld_EditBirthdate = new javax.swing.JTextField();
        lbl_LastName1 = new javax.swing.JLabel();
        lbl_Title2 = new javax.swing.JLabel();
        lbl_Birthdate1 = new javax.swing.JLabel();
        lbl_Deathdate1 = new javax.swing.JLabel();
        lbl_Description1 = new javax.swing.JLabel();
        btn_EditPicture = new javax.swing.JButton();
        lbl_Picture1 = new javax.swing.JLabel();
        btn_ValidateEdit = new javax.swing.JButton();
        btn_BackEdit = new javax.swing.JButton();
        lbl_VLastname1 = new javax.swing.JLabel();
        lbl_VFirstname1 = new javax.swing.JLabel();
        lbl_VBirthdate1 = new javax.swing.JLabel();
        lbl_VDeathdate1 = new javax.swing.JLabel();
        lbl_VPicture1 = new javax.swing.JLabel();
        txtFld_EditDeathdate = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_EditDescription = new javax.swing.JTextArea();
        lbl_Label1 = new javax.swing.JLabel();
        lbl_Author2 = new javax.swing.JLabel();
        lbl_Stree1 = new javax.swing.JLabel();
        lbl_Street21 = new javax.swing.JLabel();
        lbl_Zip1 = new javax.swing.JLabel();
        lbl_City1 = new javax.swing.JLabel();
        lbl_Country1 = new javax.swing.JLabel();
        lbl_Phone1 = new javax.swing.JLabel();
        txtFld_EditAddressLabel = new javax.swing.JTextField();
        txtFld_EditAddressStreet = new javax.swing.JTextField();
        txtFld_EditAddressStreet2 = new javax.swing.JTextField();
        txtFld_EditAddressZip = new javax.swing.JTextField();
        txtFld_EditAddressCity = new javax.swing.JTextField();
        txtFld_EditAddressCountry = new javax.swing.JTextField();
        txtFld_EditAddressPhone = new javax.swing.JTextField();
        Right_SideBar2 = new javax.swing.JPanel();
        LeftsideUp2 = new javax.swing.JPanel();
        lbl_TitleInfos2 = new javax.swing.JLabel();
        sep_Infos2 = new javax.swing.JSeparator();
        lbl_InfoName5 = new javax.swing.JLabel();
        lbl_InfoName2 = new javax.swing.JLabel();
        lbl_InfoBirthdate5 = new javax.swing.JLabel();
        lbl_InfoBirthdate2 = new javax.swing.JLabel();
        btn_EditAuthor1 = new javax.swing.JButton();
        Rightside2 = new javax.swing.JPanel();
        lbl_TitleNote2 = new javax.swing.JLabel();
        sep_Note2 = new javax.swing.JSeparator();
        scrBar_Note2 = new javax.swing.JScrollPane();
        txtArea_EditNote = new javax.swing.JTextArea();
        LeftsideDown2 = new javax.swing.JPanel();
        lbl_TitleOrder2 = new javax.swing.JLabel();
        sep_Order2 = new javax.swing.JSeparator();
        lbl_TotalTitle2 = new javax.swing.JLabel();
        lbl_TotalValue2 = new javax.swing.JLabel();
        btn_Details2 = new javax.swing.JButton();
        Down2 = new javax.swing.JPanel();
        tabPan_Address5 = new javax.swing.JTabbedPane();
        panel_Shipping5 = new javax.swing.JPanel();
        panel_Delivery2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panel_Consult.setBorder(null);

        panel_Consult1.setBackground(new java.awt.Color(242, 242, 242));

        Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManagePublisher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManagePublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManagePublisher.setText("MANAGE AUTHOR");

        javax.swing.GroupLayout UpLayout = new javax.swing.GroupLayout(Up);
        Up.setLayout(UpLayout);
        UpLayout.setHorizontalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        UpLayout.setVerticalGroup(
            UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitlePublisher.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TitlePublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_TitlePublisher.setText("Author");

        btn_AddAuthor.setBackground(new java.awt.Color(135, 199, 213));
        btn_AddAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AddAuthor.setText("ADD");
        btn_AddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Author(evt);
            }
        });

        lbl_Status1.setText("Status:");

        tglBtn_AuthorStatus.setBackground(new java.awt.Color(135, 199, 213));
        tglBtn_AuthorStatus.setText("Enable");
        tglBtn_AuthorStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Author_Status(evt);
            }
        });

        lbl_TitleAttributes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes1.setText("Attributes");

        tbl_Attributes.setAutoCreateRowSorter(true);
        tbl_Attributes.setModel(initTable());
        tbl_Attributes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Attributes.setRowHeight(30);
        tbl_Attributes.setSelectionBackground(new java.awt.Color(135, 199, 213));
        tbl_Attributes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Attributes.setShowVerticalLines(false);
        tbl_Attributes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Select_Author(evt);
            }
        });
        scrBar_Attributes1.setViewportView(tbl_Attributes);

        lbl_TitleComments1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Comment_32px.png"))); // NOI18N
        lbl_TitleComments1.setText("Book");

        tbl_Book.setAutoCreateRowSorter(true);
        tbl_Book.setModel(initTableBook());
        tbl_Book.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Book.setRowHeight(30);
        tbl_Book.setSelectionBackground(new java.awt.Color(135, 199, 213));
        tbl_Book.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Book.setShowVerticalLines(false);
        scrBar_Comments1.setViewportView(tbl_Book);

        lbl_Research.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_Research.setText("Research :");
        lbl_Research.setAlignmentY(1.0F);

        lbl_Research1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_Research1.setText("Research :");
        lbl_Research1.setAlignmentY(1.0F);

        btn_DeleteAuthor.setBackground(new java.awt.Color(135, 199, 213));
        btn_DeleteAuthor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_DeleteAuthor.setText("Delete");
        btn_DeleteAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Author(evt);
            }
        });

        javax.swing.GroupLayout Left_SideBarLayout = new javax.swing.GroupLayout(Left_SideBar);
        Left_SideBar.setLayout(Left_SideBarLayout);
        Left_SideBarLayout.setHorizontalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Attirbutes1)
                            .addComponent(sep_Customer3)
                            .addComponent(scrBar_Comments1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Comments3)
                            .addComponent(scrBar_Attributes1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(lbl_TitlePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 29, Short.MAX_VALUE)
                                .addComponent(btn_AddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_Research1)
                                .addGap(18, 18, 18)
                                .addComponent(txtFld_Research1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_TitleComments1)
                                    .addComponent(lbl_TitleAttributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(btn_DeleteAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Research)
                                .addGap(18, 18, 18)
                                .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_Status1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglBtn_AuthorStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Left_SideBarLayout.setVerticalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitlePublisher)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                        .addComponent(btn_AddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(sep_Customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Status1)
                    .addComponent(tglBtn_AuthorStatus))
                .addGap(27, 27, 27)
                .addComponent(lbl_TitleAttributes1)
                .addGap(7, 7, 7)
                .addComponent(sep_Attirbutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Research)
                    .addComponent(btn_DeleteAuthor))
                .addGap(8, 8, 8)
                .addComponent(scrBar_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_TitleComments1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Comments3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Research1)
                    .addComponent(txtFld_Research1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right_SideBar.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos3.setText("Infos");

        lbl_InfoName.setText("Name :");

        lbl_InfoName1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoBirthdate.setText("Birth Date :");

        lbl_InfoBirthdate1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditAuthor.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditAuthor.setText("Edit Author");
        btn_EditAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Author(evt);
            }
        });

        javax.swing.GroupLayout LeftsideUp3Layout = new javax.swing.GroupLayout(LeftsideUp3);
        LeftsideUp3.setLayout(LeftsideUp3Layout);
        LeftsideUp3Layout.setHorizontalGroup(
            LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Infos3)
                    .addComponent(btn_EditAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addComponent(lbl_TitleInfos3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InfoBirthdate)
                            .addComponent(lbl_InfoName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InfoName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_InfoBirthdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        LeftsideUp3Layout.setVerticalGroup(
            LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoBirthdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoBirthdate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditAuthor)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote3.setText("Note");

        scrBar_Note3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Note.setEditable(false);
        txtArea_Note.setColumns(20);
        txtArea_Note.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_Note.setLineWrap(true);
        txtArea_Note.setRows(5);
        scrBar_Note3.setViewportView(txtArea_Note);

        javax.swing.GroupLayout Rightside3Layout = new javax.swing.GroupLayout(Rightside3);
        Rightside3.setLayout(Rightside3Layout);
        Rightside3Layout.setHorizontalGroup(
            Rightside3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Rightside3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Note3)
                    .addGroup(Rightside3Layout.createSequentialGroup()
                        .addComponent(lbl_TitleNote3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrBar_Note3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        Rightside3Layout.setVerticalGroup(
            Rightside3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleNote3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Note3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note3)
                .addContainerGap())
        );

        LeftsideDown3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder3.setText("Stock");

        lbl_TotalTitle.setText("Current Book :");

        lbl_TotalValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue.setText("120");

        btn_Details3.setBackground(new java.awt.Color(135, 199, 213));
        btn_Details3.setText("View details");

        javax.swing.GroupLayout LeftsideDown3Layout = new javax.swing.GroupLayout(LeftsideDown3);
        LeftsideDown3.setLayout(LeftsideDown3Layout);
        LeftsideDown3Layout.setHorizontalGroup(
            LeftsideDown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown3Layout.createSequentialGroup()
                .addGroup(LeftsideDown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDown3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_TotalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(LeftsideDown3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Details3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sep_Order3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDown3Layout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addContainerGap())
        );
        LeftsideDown3Layout.setVerticalGroup(
            LeftsideDown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleOrder3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Order3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideDown3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle))
                .addGap(18, 18, 18)
                .addComponent(btn_Details3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBarLayout = new javax.swing.GroupLayout(Right_SideBar);
        Right_SideBar.setLayout(Right_SideBarLayout);
        Right_SideBarLayout.setHorizontalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBarLayout.setVerticalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addComponent(LeftsideUp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping6.setBackground(new java.awt.Color(255, 255, 255));

        lbl_InfoDescription.setText("Description :");

        lbl_InfoDeathdate.setText("Death Date :");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Description.setColumns(20);
        txtArea_Description.setLineWrap(true);
        txtArea_Description.setRows(5);
        jScrollPane4.setViewportView(txtArea_Description);

        javax.swing.GroupLayout panel_Shipping6Layout = new javax.swing.GroupLayout(panel_Shipping6);
        panel_Shipping6.setLayout(panel_Shipping6Layout);
        panel_Shipping6Layout.setHorizontalGroup(
            panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Shipping6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(panel_Shipping6Layout.createSequentialGroup()
                        .addGroup(panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InfoDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_Shipping6Layout.createSequentialGroup()
                                .addComponent(lbl_InfoDeathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoDeathdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 245, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_Shipping6Layout.setVerticalGroup(
            panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Shipping6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_InfoDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoDeathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Shipping6Layout.createSequentialGroup()
                        .addComponent(lbl_InfoDeathdate1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addGap(234, 234, 234))
        );

        tabPan_Address6.addTab("Information Author", panel_Shipping6);

        panel_Delivery3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_InfoLabel.setText("Label :");

        lbl_InfoStreet.setText("Street :");

        lbl_InfoStreet2.setText("Street 2 :");

        lbl_InfoZip.setText("Zip Code :");

        lbl_InfoCity.setText("City : ");

        lbl_InfoCountry.setText("Country :");

        lbl_InfoPhone.setText("Phone :");

        javax.swing.GroupLayout panel_Delivery3Layout = new javax.swing.GroupLayout(panel_Delivery3);
        panel_Delivery3.setLayout(panel_Delivery3Layout);
        panel_Delivery3Layout.setHorizontalGroup(
            panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_InfoStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoPhone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoCountry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoCity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoZip1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(lbl_InfoStreet21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel_Delivery3Layout.setVerticalGroup(
            panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InfoStreet21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InfoZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoZip1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InfoCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_Delivery3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_InfoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Delivery3Layout.createSequentialGroup()
                        .addComponent(lbl_InfoPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        tabPan_Address6.addTab("Address Author", panel_Delivery3);

        javax.swing.GroupLayout DownLayout = new javax.swing.GroupLayout(Down);
        Down.setLayout(DownLayout);
        DownLayout.setHorizontalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address6)
                .addContainerGap())
        );
        DownLayout.setVerticalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addComponent(tabPan_Address6, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Consult1Layout = new javax.swing.GroupLayout(panel_Consult1);
        panel_Consult1.setLayout(panel_Consult1Layout);
        panel_Consult1Layout.setHorizontalGroup(
            panel_Consult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Consult1Layout.createSequentialGroup()
                .addComponent(Left_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Consult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Consult1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Consult1Layout.setVerticalGroup(
            panel_Consult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Consult1Layout.createSequentialGroup()
                .addComponent(Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Consult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Consult1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Left_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        panel_Consult.setViewportView(panel_Consult1);

        add(panel_Consult, "card5");

        panel_Add.setBorder(null);

        panel_Add1.setBackground(new java.awt.Color(242, 242, 242));

        Up1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageCustomer1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageCustomer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageCustomer1.setText("ADD AUTHOR");

        javax.swing.GroupLayout Up1Layout = new javax.swing.GroupLayout(Up1);
        Up1.setLayout(Up1Layout);
        Up1Layout.setHorizontalGroup(
            Up1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up1Layout.setVerticalGroup(
            Up1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Author.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author.setText("Author");

        txtFld_AddLastname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFld_AddLastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddLastnameMouseExited(evt);
            }
        });

        txtFld_AddFirstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddFirstnameMouseExited(evt);
            }
        });

        txtFld_AddBirthdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddBirthdateMouseExited(evt);
            }
        });

        lbl_LastName.setText("Last Name :");

        lbl_Title1.setText("First Name :");

        lbl_Birthdate.setText("Birthdate :");

        lbl_Deathdate.setText("Deathdate :");

        lbl_Description.setText("Description :");

        btn_AddPicture.setText("Picture");
        btn_AddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPictureActionPerformed(evt);
            }
        });

        lbl_Picture.setText("Add picture :");

        btn_ValidateAdd.setBackground(new java.awt.Color(135, 199, 213));
        btn_ValidateAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ValidateAdd.setText("Validate");
        btn_ValidateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Validate_Add(evt);
            }
        });

        btn_BackAdd.setBackground(new java.awt.Color(135, 199, 213));
        btn_BackAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_BackAdd.setText("Back");
        btn_BackAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Add(evt);
            }
        });

        lbl_VLastname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VFirstname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VBirthdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VDeathdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VPicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        txtFld_AddDeathdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddDeathdateMouseExited(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_AddDescription.setColumns(20);
        txtArea_AddDescription.setLineWrap(true);
        txtArea_AddDescription.setRows(5);
        jScrollPane3.setViewportView(txtArea_AddDescription);

        lbl_Label.setText("Label :");

        txtFld_AddAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressLabelMouseExited(evt);
            }
        });

        lbl_Street.setText("Street :");

        txtFld_AddAddressStreet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressStreetMouseExited(evt);
            }
        });

        txtFld_AddAddressStreet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressStreet2MouseExited(evt);
            }
        });

        lbl_Street2.setText("Street 2 :");

        txtFld_AddAddressZip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressZipMouseExited(evt);
            }
        });

        lbl_Zip.setText("Zip Code :");

        lbl_City.setText("City : ");

        txtFld_AddAddressCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressCityMouseExited(evt);
            }
        });

        txtFld_AddAddressCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressCountryMouseExited(evt);
            }
        });

        lbl_Country.setText("Country :");

        lbl_Phone.setText("Phone :");

        txtFld_AddAddressPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressPhoneMouseExited(evt);
            }
        });

        lbl_Author3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author3.setText("Address");

        lbl_VLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VStreet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VStreet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VZip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        javax.swing.GroupLayout Left_SideBar1Layout = new javax.swing.GroupLayout(Left_SideBar1);
        Left_SideBar1.setLayout(Left_SideBar1Layout);
        Left_SideBar1Layout.setHorizontalGroup(
            Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                        .addComponent(lbl_Birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddBirthdate))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar1Layout.createSequentialGroup()
                                        .addComponent(lbl_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddFirstname))
                                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                        .addComponent(lbl_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_Picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbl_Deathdate, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFld_AddDeathdate)
                                            .addComponent(btn_AddPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_VBirthdate)
                                    .addComponent(lbl_VDeathdate)
                                    .addComponent(lbl_VPicture)
                                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                                .addComponent(lbl_VFirstname)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lbl_VLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sep_Comments1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                .addComponent(lbl_Author, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_ValidateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_BackAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sep_Customer1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Author3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Street2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_City, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFld_AddAddressCountry, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txtFld_AddAddressCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressZip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressStreet2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressPhone))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_VLabel)
                            .addComponent(lbl_VStreet2)
                            .addComponent(lbl_VStreet)
                            .addComponent(lbl_VZip)
                            .addComponent(lbl_VCity)
                            .addComponent(lbl_VCountry)
                            .addComponent(lbl_VPhone))
                        .addGap(185, 185, 185)))
                .addContainerGap())
        );
        Left_SideBar1Layout.setVerticalGroup(
            Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Author)
                                    .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_BackAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_ValidateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sep_Customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_VLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lbl_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFld_AddLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(lbl_Description, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(16, 16, 16)
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFld_AddFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_VFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_Title1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Birthdate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtFld_AddBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_VBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                                .addComponent(lbl_VDeathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lbl_VPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(lbl_Deathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtFld_AddDeathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(11, 11, 11)
                                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btn_AddPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                                    .addComponent(lbl_Picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                    .addComponent(jScrollPane3))
                                .addGap(43, 43, 43)
                                .addComponent(sep_Comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_Author3)
                                .addGap(24, 24, 24)
                                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFld_AddAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Left_SideBar1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_VLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFld_AddAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_VStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_Street2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFld_AddAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_VStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Left_SideBar1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_VZip, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_City, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_VCity, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_VCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_VPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );

        Right_SideBar1.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos1.setText("Infos");

        lbl_InfoName3.setText("Name :");

        lbl_InfoName4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoBirthdate3.setText("Birth Date :");

        lbl_InfoBirthdate4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditBook.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditBook.setText("Edit Author");

        javax.swing.GroupLayout LeftsideUp1Layout = new javax.swing.GroupLayout(LeftsideUp1);
        LeftsideUp1.setLayout(LeftsideUp1Layout);
        LeftsideUp1Layout.setHorizontalGroup(
            LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp1Layout.createSequentialGroup()
                        .addGroup(LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp1Layout.createSequentialGroup()
                                .addComponent(lbl_InfoName3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUp1Layout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(LeftsideUp1Layout.createSequentialGroup()
                        .addGroup(LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp1Layout.createSequentialGroup()
                                .addComponent(lbl_InfoBirthdate3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoBirthdate4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sep_Infos1)
                            .addComponent(btn_EditBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        LeftsideUp1Layout.setVerticalGroup(
            LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoBirthdate3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoBirthdate4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditBook)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote1.setText("Note");

        scrBar_Note1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_AddNote.setColumns(20);
        txtArea_AddNote.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_AddNote.setLineWrap(true);
        txtArea_AddNote.setRows(5);
        scrBar_Note1.setViewportView(txtArea_AddNote);

        javax.swing.GroupLayout Rightside1Layout = new javax.swing.GroupLayout(Rightside1);
        Rightside1.setLayout(Rightside1Layout);
        Rightside1Layout.setHorizontalGroup(
            Rightside1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Rightside1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Note1)
                    .addGroup(Rightside1Layout.createSequentialGroup()
                        .addComponent(lbl_TitleNote1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrBar_Note1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        Rightside1Layout.setVerticalGroup(
            Rightside1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleNote1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Note1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note1)
                .addContainerGap())
        );

        LeftsideDown1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder1.setText("Book");

        lbl_TotalTitle1.setText("Current Book :");

        lbl_TotalValue1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue1.setText("120");

        btn_Details1.setBackground(new java.awt.Color(135, 199, 213));
        btn_Details1.setText("View details");

        javax.swing.GroupLayout LeftsideDown1Layout = new javax.swing.GroupLayout(LeftsideDown1);
        LeftsideDown1.setLayout(LeftsideDown1Layout);
        LeftsideDown1Layout.setHorizontalGroup(
            LeftsideDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown1Layout.createSequentialGroup()
                .addGroup(LeftsideDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDown1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_TotalTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(LeftsideDown1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Details1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sep_Order1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDown1Layout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addContainerGap())
        );
        LeftsideDown1Layout.setVerticalGroup(
            LeftsideDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleOrder1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Order1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideDown1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TotalValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle1))
                .addGap(18, 18, 18)
                .addComponent(btn_Details1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBar1Layout = new javax.swing.GroupLayout(Right_SideBar1);
        Right_SideBar1.setLayout(Right_SideBar1Layout);
        Right_SideBar1Layout.setHorizontalGroup(
            Right_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBar1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBar1Layout.setVerticalGroup(
            Right_SideBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBar1Layout.createSequentialGroup()
                .addComponent(LeftsideUp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down1.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Shipping4Layout = new javax.swing.GroupLayout(panel_Shipping4);
        panel_Shipping4.setLayout(panel_Shipping4Layout);
        panel_Shipping4Layout.setHorizontalGroup(
            panel_Shipping4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panel_Shipping4Layout.setVerticalGroup(
            panel_Shipping4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        tabPan_Address4.addTab("Information Author", panel_Shipping4);

        panel_Delivery1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Delivery1Layout = new javax.swing.GroupLayout(panel_Delivery1);
        panel_Delivery1.setLayout(panel_Delivery1Layout);
        panel_Delivery1Layout.setHorizontalGroup(
            panel_Delivery1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panel_Delivery1Layout.setVerticalGroup(
            panel_Delivery1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        tabPan_Address4.addTab("Address Author", panel_Delivery1);

        javax.swing.GroupLayout Down1Layout = new javax.swing.GroupLayout(Down1);
        Down1.setLayout(Down1Layout);
        Down1Layout.setHorizontalGroup(
            Down1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address4)
                .addContainerGap())
        );
        Down1Layout.setVerticalGroup(
            Down1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down1Layout.createSequentialGroup()
                .addComponent(tabPan_Address4, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Add1Layout = new javax.swing.GroupLayout(panel_Add1);
        panel_Add1.setLayout(panel_Add1Layout);
        panel_Add1Layout.setHorizontalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Add1Layout.createSequentialGroup()
                .addComponent(Left_SideBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Add1Layout.setVerticalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Add1Layout.createSequentialGroup()
                .addComponent(Up1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Left_SideBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Add.setViewportView(panel_Add1);

        add(panel_Add, "card5");

        panel_Edit.setBorder(null);

        panel_Edit1.setBackground(new java.awt.Color(242, 242, 242));

        Up2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageCustomer2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageCustomer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageCustomer2.setText("EDIT AUTHOR");

        javax.swing.GroupLayout Up2Layout = new javax.swing.GroupLayout(Up2);
        Up2.setLayout(Up2Layout);
        Up2Layout.setHorizontalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageCustomer2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up2Layout.setVerticalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageCustomer2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Author1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author1.setText("Author");

        txtFld_EditLastname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFld_EditLastname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditLastnameMouseExited(evt);
            }
        });

        txtFld_EditFirstname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditFirstnameMouseExited(evt);
            }
        });

        txtFld_EditBirthdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditBirthdateMouseExited(evt);
            }
        });

        lbl_LastName1.setText("Last Name :");

        lbl_Title2.setText("First Name :");

        lbl_Birthdate1.setText("Birthdate :");

        lbl_Deathdate1.setText("Deathdate :");

        lbl_Description1.setText("Description :");

        btn_EditPicture.setText("Picture");
        btn_EditPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditPictureActionPerformed(evt);
            }
        });

        lbl_Picture1.setText("Edit Picture :");

        btn_ValidateEdit.setBackground(new java.awt.Color(135, 199, 213));
        btn_ValidateEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ValidateEdit.setText("Validate");
        btn_ValidateEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Validate_Edit(evt);
            }
        });

        btn_BackEdit.setBackground(new java.awt.Color(135, 199, 213));
        btn_BackEdit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_BackEdit.setText("Back");
        btn_BackEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Edit(evt);
            }
        });

        lbl_VLastname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VFirstname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VBirthdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VDeathdate1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VPicture1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        txtFld_EditDeathdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditDeathdateMouseExited(evt);
            }
        });

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_EditDescription.setColumns(20);
        txtArea_EditDescription.setLineWrap(true);
        txtArea_EditDescription.setRows(5);
        txtArea_EditDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane2.setViewportView(txtArea_EditDescription);

        lbl_Label1.setText("Label :");

        lbl_Author2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author2.setText("Address");

        lbl_Stree1.setText("Street :");

        lbl_Street21.setText("Street 2 :");

        lbl_Zip1.setText("Zip Code :");

        lbl_City1.setText("City : ");

        lbl_Country1.setText("Country :");

        lbl_Phone1.setText("Phone :");

        txtFld_EditAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressLabelMouseExited(evt);
            }
        });

        txtFld_EditAddressStreet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressStreetMouseExited(evt);
            }
        });

        txtFld_EditAddressStreet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressStreet2MouseExited(evt);
            }
        });

        txtFld_EditAddressZip.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressZipMouseExited(evt);
            }
        });

        txtFld_EditAddressCity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressCityMouseExited(evt);
            }
        });

        txtFld_EditAddressCountry.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressCountryMouseExited(evt);
            }
        });

        txtFld_EditAddressPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressPhoneMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Left_SideBar2Layout = new javax.swing.GroupLayout(Left_SideBar2);
        Left_SideBar2.setLayout(Left_SideBar2Layout);
        Left_SideBar2Layout.setHorizontalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Birthdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditBirthdate))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditFirstname))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_LastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbl_Picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_Deathdate1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFld_EditDeathdate)
                                    .addComponent(btn_EditPicture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_VBirthdate1)
                            .addComponent(lbl_VDeathdate1)
                            .addComponent(lbl_VPicture1)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(lbl_VFirstname1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(lbl_VLastname1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(lbl_Description1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sep_Comments2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addComponent(lbl_Author1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sep_Customer2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Author2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Phone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Country1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_City1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Zip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Street21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Stree1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtFld_EditAddressStreet, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFld_EditAddressLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFld_EditAddressPhone, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFld_EditAddressCountry, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFld_EditAddressCity, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFld_EditAddressZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(txtFld_EditAddressStreet2))
                .addGap(264, 264, 264))
        );
        Left_SideBar2Layout.setVerticalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Author1)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_VLastname1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_LastName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFld_EditLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lbl_Description1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFld_EditFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_VFirstname1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Title2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Birthdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_EditBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_VBirthdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_VDeathdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_VPicture1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_Deathdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFld_EditDeathdate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_EditPicture, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                                    .addComponent(lbl_Picture1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jScrollPane2))
                .addGap(30, 30, 30)
                .addComponent(sep_Comments2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Author2)
                .addGap(35, 35, 35)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Stree1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Street21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Zip1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_City1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Country1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(142, 142, 142))
        );

        Right_SideBar2.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos2.setText("Infos");

        lbl_InfoName5.setText("Name :");

        lbl_InfoName2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoBirthdate5.setText("Birth Date :");

        lbl_InfoBirthdate2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditAuthor1.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditAuthor1.setText("Edit Author");

        javax.swing.GroupLayout LeftsideUp2Layout = new javax.swing.GroupLayout(LeftsideUp2);
        LeftsideUp2.setLayout(LeftsideUp2Layout);
        LeftsideUp2Layout.setHorizontalGroup(
            LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp2Layout.createSequentialGroup()
                        .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                                .addComponent(lbl_InfoName5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoName2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_TitleInfos2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(LeftsideUp2Layout.createSequentialGroup()
                        .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                                .addComponent(lbl_InfoBirthdate5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoBirthdate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sep_Infos2)
                            .addComponent(btn_EditAuthor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        LeftsideUp2Layout.setVerticalGroup(
            LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoBirthdate5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoBirthdate2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditAuthor1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote2.setText("Note");

        scrBar_Note2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_EditNote.setColumns(20);
        txtArea_EditNote.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_EditNote.setLineWrap(true);
        txtArea_EditNote.setRows(5);
        scrBar_Note2.setViewportView(txtArea_EditNote);

        javax.swing.GroupLayout Rightside2Layout = new javax.swing.GroupLayout(Rightside2);
        Rightside2.setLayout(Rightside2Layout);
        Rightside2Layout.setHorizontalGroup(
            Rightside2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Rightside2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Note2)
                    .addGroup(Rightside2Layout.createSequentialGroup()
                        .addComponent(lbl_TitleNote2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrBar_Note2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        Rightside2Layout.setVerticalGroup(
            Rightside2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleNote2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Note2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note2)
                .addContainerGap())
        );

        LeftsideDown2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder2.setText("Book");

        lbl_TotalTitle2.setText("Current Book :");

        lbl_TotalValue2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue2.setText("120");

        btn_Details2.setBackground(new java.awt.Color(135, 199, 213));
        btn_Details2.setText("View details");

        javax.swing.GroupLayout LeftsideDown2Layout = new javax.swing.GroupLayout(LeftsideDown2);
        LeftsideDown2.setLayout(LeftsideDown2Layout);
        LeftsideDown2Layout.setHorizontalGroup(
            LeftsideDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown2Layout.createSequentialGroup()
                .addGroup(LeftsideDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDown2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_TotalTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(LeftsideDown2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Details2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sep_Order2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDown2Layout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addContainerGap())
        );
        LeftsideDown2Layout.setVerticalGroup(
            LeftsideDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleOrder2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Order2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideDown2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TotalValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle2))
                .addGap(18, 18, 18)
                .addComponent(btn_Details2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBar2Layout = new javax.swing.GroupLayout(Right_SideBar2);
        Right_SideBar2.setLayout(Right_SideBar2Layout);
        Right_SideBar2Layout.setHorizontalGroup(
            Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBar2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBar2Layout.setVerticalGroup(
            Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBar2Layout.createSequentialGroup()
                .addComponent(LeftsideUp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down2.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Shipping5Layout = new javax.swing.GroupLayout(panel_Shipping5);
        panel_Shipping5.setLayout(panel_Shipping5Layout);
        panel_Shipping5Layout.setHorizontalGroup(
            panel_Shipping5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panel_Shipping5Layout.setVerticalGroup(
            panel_Shipping5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        tabPan_Address5.addTab("Information Author", panel_Shipping5);

        panel_Delivery2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Delivery2Layout = new javax.swing.GroupLayout(panel_Delivery2);
        panel_Delivery2.setLayout(panel_Delivery2Layout);
        panel_Delivery2Layout.setHorizontalGroup(
            panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(534, Short.MAX_VALUE))
        );
        panel_Delivery2Layout.setVerticalGroup(
            panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(464, Short.MAX_VALUE))
        );

        tabPan_Address5.addTab("Address Author", panel_Delivery2);

        javax.swing.GroupLayout Down2Layout = new javax.swing.GroupLayout(Down2);
        Down2.setLayout(Down2Layout);
        Down2Layout.setHorizontalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address5)
                .addContainerGap())
        );
        Down2Layout.setVerticalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addComponent(tabPan_Address5, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Edit1Layout = new javax.swing.GroupLayout(panel_Edit1);
        panel_Edit1.setLayout(panel_Edit1Layout);
        panel_Edit1Layout.setHorizontalGroup(
            panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Edit1Layout.createSequentialGroup()
                .addComponent(Left_SideBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Edit1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Edit1Layout.setVerticalGroup(
            panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Edit1Layout.createSequentialGroup()
                .addComponent(Up2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Edit1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Left_SideBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Edit.setViewportView(panel_Edit1);

        add(panel_Edit, "card5");
    }// </editor-fold>//GEN-END:initComponents

    private void Add_Author(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Author
        // TODO add your handling code here:
        lbl_VLastname.setVisible(false);
        lbl_VFirstname.setVisible(false);
        lbl_VPicture.setVisible(false);
        lbl_VBirthdate.setVisible(false);
        lbl_VDeathdate.setVisible(false);
        lbl_VLabel.setVisible(false);
        lbl_VStreet.setVisible(false);
        lbl_VStreet2.setVisible(false);
        lbl_VZip.setVisible(false);
        lbl_VCity.setVisible(false);
        lbl_VCountry.setVisible(false);
        lbl_VPhone.setVisible(false);
        panel_Add.setVisible(true);
        panel_Consult.setVisible(false);
    }//GEN-LAST:event_Add_Author

    private void txtFld_AddLastnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddLastnameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddLastname.getText() + " " + txtFld_AddFirstname
                                                                    .getText();
            String t = txtFld_AddLastname.getText();
            if (t.matches("[a-zA-Z ]+[a-zA-Z]")) {
                lbl_VLastname.setVisible(true);
                Vector v = new Vector();
                String query = "SELECT CONCAT(AuthorLastname , ' ' , "
                    + "AuthorFirstname) as Author\n"
                    + "FROM AUTHOR";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    v.add(rs.getString("Author"));
                }
                int p = 0;
                for (int i = 0; i < v.size(); i++) {
                    if (s.equals(v.get(i).toString())) {
                        p++;
                    }
                }
                if (p == 1) {
                    JOptionPane.showMessageDialog(this, "This author already "
                        + "exists !", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_AddLastname.setText("");
                    lbl_VLastname.setVisible(false);
                }
            } else if ("".equals(t)) {
                lbl_VLastname.setVisible(false);
            } else if (t.matches("[0-9. ]+[0-9. ]")) {
                JOptionPane.showMessageDialog(this, "Last name can only have "
                    + "letters!", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                txtFld_AddLastname.setText("");
                lbl_VLastname.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Problem with last name !", 
                    "Author Error !", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_txtFld_AddLastnameMouseExited

    private void txtFld_AddFirstnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddFirstnameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddLastname.getText() + " " + txtFld_AddFirstname.
                                                                    getText();
            String t = txtFld_AddFirstname.getText();
            if (t.matches("[a-zA-Z ]+[a-zA-Z]")) {
                lbl_VFirstname.setVisible(true);
                Vector v = new Vector();
                String query = "SELECT CONCAT(AuthorLastname , ' ' , "
                        + "AuthorFirstname) as Author\n"
                        + "FROM AUTHOR";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    v.add(rs.getString("Author"));
                }
                int p = 0;
                for (int i = 0; i < v.size(); i++) {
                    if (s.equals(v.get(i).toString())) {
                        p++;
                    }
                }
                if (p == 1) {
                    JOptionPane.showMessageDialog(this, "This author already "
                            + "exists !", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_AddFirstname.setText("");
                    lbl_VFirstname.setVisible(false);
                }
            } else if ("".equals(t)) {
                lbl_VFirstname.setVisible(false);
            } else if (t.matches("[0-9. ]+[0-9. ]")) {
                JOptionPane.showMessageDialog(this, "First name can only have "
                        + "letters!", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                txtFld_AddFirstname.setText("");
                lbl_VFirstname.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Problem with first name !",
                        "Author Error !", JOptionPane.WARNING_MESSAGE);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_txtFld_AddFirstnameMouseExited

    private void txtFld_AddBirthdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddBirthdateMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddBirthdate.getText();
        if (s.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)"
                + "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\"
                + "d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0"
                + "[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26"
                + "])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|"
                + "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
            lbl_VBirthdate.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VBirthdate.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "birth date", "Birth Date Error !", JOptionPane.
                                                            WARNING_MESSAGE);
            txtFld_AddBirthdate.setText("");
        }
    }//GEN-LAST:event_txtFld_AddBirthdateMouseExited

    private void txtFld_AddDeathdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddDeathdateMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddDeathdate.getText();
        if (s.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)"
                + "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\"
                + "d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0"
                + "[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26"
                + "])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|"
                + "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
            lbl_VDeathdate.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VDeathdate.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "birth date", "Birth Date Error !", JOptionPane.
                                                            WARNING_MESSAGE);
            txtFld_AddDeathdate.setText("");
        }
    }//GEN-LAST:event_txtFld_AddDeathdateMouseExited

    private void btn_AddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AddPictureActionPerformed

    private void txtFld_AddAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressLabelMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressLabel.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$")) {
            lbl_VLabel.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VLabel.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "street", "Street Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressLabel.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressLabelMouseExited

    private void txtFld_AddAddressStreetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressStreetMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressStreet.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$")) {
            lbl_VStreet.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VStreet.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "street", "Street Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressStreet.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressStreetMouseExited

    private void txtFld_AddAddressStreet2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressStreet2MouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressStreet2.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$")) {
            lbl_VStreet2.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VStreet2.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "street 2", "Street2 Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressStreet2.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressStreet2MouseExited

    private void txtFld_AddAddressZipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressZipMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressZip.getText();
        if (s.matches("^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$")) {
            lbl_VZip.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VZip.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "zip code", "Zip Code Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressZip.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressZipMouseExited

    private void txtFld_AddAddressCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressCityMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressCity.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$")) {
            lbl_VCity.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VCity.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "city", "City Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressCity.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressCityMouseExited

    private void txtFld_AddAddressCountryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressCountryMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressCountry.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$")) {
            lbl_VCountry.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VCountry.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "country", "Country Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressCountry.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressCountryMouseExited

    private void txtFld_AddAddressPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressPhoneMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddAddressPhone.getText();
            if (s.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
                lbl_VPhone.setVisible(true);
                Vector v = new Vector();
                String query = "SELECT AddressPhone\n"
                        + "FROM ADDRESS";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    v.add(rs.getString("AddressPhone"));
                }
                int p = 0;
                for (int i = 0; i < v.size(); i++) {
                    if (s.equals(v.get(i).toString())) {
                        p++;
                    }
                }
                if (p == 1) {
                    JOptionPane.showMessageDialog(this, "This phone already "
                        + "exists !", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_AddAddressPhone.setText("");
                    lbl_VPhone.setVisible(false);
                }
            } else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]")) {
                JOptionPane.showMessageDialog(this, "Phone can only have "
                    + "numbers !", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                txtFld_AddAddressPhone.setText("");
                lbl_VPhone.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                    null, ex);
        }
    }//GEN-LAST:event_txtFld_AddAddressPhoneMouseExited

    private void Validate_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Add
        // TODO add your handling code here:
        if (!"".equals(txtFld_AddLastname.getText()) | !"".equals(
                    txtFld_AddFirstname.getText()) | !"".equals(
                    txtFld_AddAddressLabel.getText()) | !"".equals(
                    txtFld_AddAddressPhone.getText())) {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", 
                "Confirmation", JOptionPane.OK_CANCEL_OPTION, JOptionPane.
                                                                ERROR_MESSAGE);
            if (result == JOptionPane.OK_OPTION) {
                Vector vAdd = new Vector();
                vAdd.add(txtFld_AddAddressLabel.getText());
                vAdd.add(txtFld_AddAddressStreet.getText());
                vAdd.add(txtFld_AddAddressStreet2.getText());
                vAdd.add(txtFld_AddAddressZip.getText());
                vAdd.add(txtFld_AddAddressCity.getText());
                vAdd.add(txtFld_AddAddressCountry.getText());
                vAdd.add(txtFld_AddAddressPhone.getText());

                try {
                    String query = ("INSERT INTO ADDRESS (AddressLabel, "
                        + "AddressStreet, AddressStreet2, AddressZip, "
                        + "AddressCity, AddressCountry, AddressPhone)\n"
                        + "VALUES (?,?,?,?,?,?,?)");

                    PreparedStatement pstmt = con.connectURL().prepareStatement(
                                                                        query);
                    int j = 0;
                    for (int i = 1; i <= vAdd.size(); i++) {
                        pstmt.setObject(i, vAdd.get(j));
                        j++;
                    }
                    pstmt.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Author_JPanel.class.getName()).log(Level.
                            SEVERE, null, ex);
                }
                try {

                    String query = "SELECT addressId\n"
                            + "FROM Address\n"
                            + "WHERE addressPhone = '" + txtFld_AddAddressPhone.
                                                                getText() + "'";
                    Statement stmt = con.connectURL().createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    rs.next();
                    addressId = rs.getLong("AddressId");

                } catch (SQLException ex) {
                    Logger.getLogger(Author_JPanel.class.getName()).log(Level.
                                                            SEVERE, null, ex);
                }
                String t = txtFld_AddLastname.getText() + " " + 
                                                txtFld_AddFirstname.getText();
                Vector v = new Vector();
                v.add(addressId);
                v.add(txtFld_AddLastname.getText());
                v.add(txtFld_AddFirstname.getText());
                v.add(txtFld_AddBirthdate.getText());
                v.add(txtFld_AddDeathdate.getText());
                v.add(txtArea_AddDescription.getText());
                v.add(txtArea_AddNote.getText());

                try {
                    String query = ("Insert into AUTHOR (AddressId, "
                        + "AuthorLastname, AuthorFirstname, AuthorBirthdate, "
                        + "AuthorDeathdate, AuthorDesc, AuthorNote)\n"
                        + "Values (?,?,?,?,?,?,?)");

                    PreparedStatement pstmt = con.connectURL().prepareStatement(
                                                                        query);
                    int j = 0;
                    for (int i = 1; i <= v.size(); i++) {
                        pstmt.setObject(i, v.get(j));
                        j++;
                    }
                    pstmt.executeUpdate();
                    Vector v2 = new Vector();
                    String query2 = "SELECT p.AuthorId, AuthorLastname, "
                        + "AuthorFirstname, AuthorBirthdate, AuthorDeathdate, "
                        + "StatusTypeLabel\n"
                        + "FROM AUTHOR p\n"
                        + "LEFT JOIN SETWRITER sw\n"
                        + "ON p.AuthorId = sw.AuthorId\n"
                        + "LEFT JOIN STATUSTYPE st\n"
                        + "ON sw.StatusTypeId = st.StatusTypeId\n"
                        + "WHERE CONCAT(AuthorLastname , ' ' ,AuthorFirstname) "
                        + "= '" + t + "'";
                    Statement stmt2 = con.connectURL().createStatement();
                    ResultSet rs2 = stmt2.executeQuery(query2);
                    while (rs2.next()) {
                        v2.add(rs2.getLong("AuthorId"));
                        v2.add(rs2.getString("AuthorFirstname"));
                        v2.add(rs2.getString("AuthorLastname"));
                        v2.add(rs2.getDate("AuthorBirthdate"));
                        v2.add(rs2.getDate("AuthorDeathdate"));
                        v2.add(rs2.getString("StatusTypeLabel"));
                    }
                    Statement st = con.connectURL().createStatement();
                    st.executeUpdate("INSERT INTO SETWRITER (AuthorId, "
                            + "StatusTypeId)\n"
                            + "VALUES (" + v2.get(0).toString() + " , 8)");
                    ((DefaultTableModel) tbl_Attributes.getModel()).addRow(v2);
                    ((DefaultTableModel) tbl_Attributes.getModel()).
                        setDataVector(author.getDataRowAuthor(), author.
                                                        getDataColumnAuthor());
                } catch (SQLException ex) {
                    Logger.getLogger(Author_JPanel.class.getName()).log(Level.
                                                            SEVERE, null, ex);
                }

                JOptionPane.showMessageDialog(this, "Add is complete !", 
                            "Confirmation !", JOptionPane.INFORMATION_MESSAGE);
                txtFld_AddLastname.setText("");
                txtFld_AddFirstname.setText("");
                txtFld_AddBirthdate.setText("");
                txtFld_AddDeathdate.setText("");
                txtArea_AddDescription.setText("");
                txtFld_AddAddressLabel.setText("");
                txtFld_AddAddressStreet.setText("");
                txtFld_AddAddressStreet2.setText("");
                txtFld_AddAddressZip.setText("");
                txtFld_AddAddressCity.setText("");
                txtFld_AddAddressCountry.setText("");
                txtFld_AddAddressPhone.setText("");
                txtArea_AddNote.setText("");
                panel_Add.setVisible(false);
                panel_Consult.setVisible(true);

            } else if (result == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(this, "Addition canceled !", 
                        "Cancellation !", JOptionPane.INFORMATION_MESSAGE);
                txtFld_AddLastname.setText("");
                txtFld_AddFirstname.setText("");
                txtFld_AddBirthdate.setText("");
                txtFld_AddDeathdate.setText("");
                txtArea_AddDescription.setText("");
                txtArea_AddNote.setText("");
                txtFld_AddAddressLabel.setText("");
                txtFld_AddAddressStreet.setText("");
                txtFld_AddAddressStreet2.setText("");
                txtFld_AddAddressZip.setText("");
                txtFld_AddAddressCity.setText("");
                txtFld_AddAddressCountry.setText("");
                txtFld_AddAddressPhone.setText("");
                panel_Add.setVisible(false);
                panel_Consult.setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Missing data !", "Warning !", 
                                                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Validate_Add

    private void Back_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Add
        // TODO add your handling code here:
        txtFld_AddLastname.setText("");
        txtFld_AddFirstname.setText("");
        txtFld_AddBirthdate.setText("");
        txtFld_AddDeathdate.setText("");
        txtArea_AddDescription.setText("");
        txtFld_AddAddressLabel.setText("");
        txtFld_AddAddressStreet.setText("");
        txtFld_AddAddressStreet2.setText("");
        txtFld_AddAddressZip.setText("");
        txtFld_AddAddressCity.setText("");
        txtFld_AddAddressCountry.setText("");
        txtFld_AddAddressPhone.setText("");
        txtArea_AddNote.setText("");
        panel_Add.setVisible(false);
        panel_Consult.setVisible(true);
    }//GEN-LAST:event_Back_Add

    private void Select_Author(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_Author
        // TODO add your handling code here:
        try {
            vInfo = new Vector();
            selectedRow = tbl_Attributes.getSelectedRow();
            String s = tbl_Attributes.getValueAt(selectedRow, 0).toString();
            String query = "SELECT AuthorId, CONCAT(AuthorLastName, ' ', "
                + "AuthorFirstName) as Author, AuthorLastName, AuthorFirstName,"
                + " AuthorBirthdate, AuthorDeathdate, AuthorDesc, AuthorNote\n"
                + ",a.AddressId, AddressLabel, AddressStreet, AddressStreet2, "
                + "AddressZip, AddressCity, AddressCountry, AddressPhone\n"
                + "FROM AUTHOR a\n"
                + "LEFT JOIN ADDRESS au\n"
                + "ON a.AddressId = au.AddressId\n"
                + "WHERE AuthorId = '" + s + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                vInfo.add(rs.getLong("AuthorId"));
                vInfo.add(rs.getString("Author"));
                vInfo.add(rs.getString("AuthorLastName"));
                vInfo.add(rs.getString("AuthorFirstName"));
                vInfo.add(rs.getDate("AuthorBirthdate"));
                vInfo.add(rs.getDate("AuthorDeathdate"));
                vInfo.add(rs.getString("AuthorDesc"));
                vInfo.add(rs.getString("AuthorNote"));
                vInfo.add(rs.getLong("AddressId"));
                vInfo.add(rs.getString("AddressLabel"));
                vInfo.add(rs.getString("AddressStreet"));
                vInfo.add(rs.getString("AddressStreet2"));
                vInfo.add(rs.getString("AddressZip"));
                vInfo.add(rs.getString("AddressCity"));
                vInfo.add(rs.getString("AddressCountry"));
                vInfo.add(rs.getString("AddressPhone"));
            }
            vInfoString = vInfo.get(1).toString();
            ((DefaultTableModel) tbl_Book.getModel()).setDataVector(author.
                                getDataRowBook(vInfoString), author.getDataColumnBook());

            try {
                query = "SELECT StatusTypeId\n"
                        + "FROM SetWriter\n"
                        + "WHERE AuthorId = '" + vInfo.get(0).toString() + "'";
                stmt = con.connectURL().createStatement();
                rs = stmt.executeQuery(query);
                Vector vType = new Vector();
                while (rs.next()) {
                    vType.add(rs.getLong("StatusTypeId"));
                }
                tglBtn_AuthorStatus.setEnabled(true);
                if ("8".equals(vType.get(0).toString())) {
                    tglBtn_AuthorStatus.setSelected(false);
                    tglBtn_AuthorStatus.setText("Disabled");
                } else {
                    tglBtn_AuthorStatus.setSelected(true);
                    tglBtn_AuthorStatus.setText("Enabled");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
            }

            if (vInfo.get(1) == null | vInfo.get(1) == "") {
                lbl_InfoName1.setText("");
            } else {
                lbl_InfoName1.setText(vInfo.get(1).toString());
            }
            lbl_InfoName2.setText(vInfo.get(1).toString());
            if (vInfo.get(4) == null | vInfo.get(4) == "") {
                lbl_InfoBirthdate1.setText("");
            } else {
                lbl_InfoBirthdate1.setText(vInfo.get(4).toString());
            }
            lbl_InfoBirthdate2.setText(vInfo.get(4).toString());
            if (vInfo.get(5) == null | vInfo.get(5) == "") {
                lbl_InfoDeathdate1.setText("");
            } else {
                lbl_InfoDeathdate1.setText(vInfo.get(5).toString());
            }
            if (vInfo.get(6) == null | vInfo.get(6) == "") {
                txtArea_Description.setText("");
            } else {
                txtArea_Description.setText(vInfo.get(6).toString());
            }
            if (vInfo.get(7) == null | vInfo.get(7) == "") {
                txtArea_Note.setText("");
            } else {
                txtArea_Note.setText(vInfo.get(7).toString());
            }
            if (vInfo.get(9) == null | vInfo.get(9) == "") {
                lbl_InfoLabel1.setText("");
            } else {
                lbl_InfoLabel1.setText(vInfo.get(9).toString());
            }
            if (vInfo.get(10) == null | vInfo.get(10) == "") {
                lbl_InfoStreet1.setText("");
            } else {
                lbl_InfoStreet1.setText(vInfo.get(10).toString());
            }
            if (vInfo.get(11) == null | vInfo.get(11) == "") {
                lbl_InfoStreet21.setText("");
            } else {
                lbl_InfoStreet21.setText(vInfo.get(11).toString());
            }
            if (vInfo.get(12) == null | vInfo.get(12) == "") {
                lbl_InfoZip1.setText("");
            } else {
                lbl_InfoZip1.setText(vInfo.get(12).toString());
            }
            if (vInfo.get(13) == null | vInfo.get(13) == "") {
                lbl_InfoCity1.setText("");
            } else {
                lbl_InfoCity1.setText(vInfo.get(13).toString());
            }
            if (vInfo.get(14) == null | vInfo.get(14) == "") {
                lbl_InfoCountry1.setText("");
            } else {
                lbl_InfoCountry1.setText(vInfo.get(14).toString());
            }
            if (vInfo.get(15) == null | vInfo.get(15) == "") {
                lbl_InfoPhone1.setText("");
            } else {
                lbl_InfoPhone1.setText(vInfo.get(15).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_Select_Author

    private void Delete_Author(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Author
        // TODO add your handling code here:
        if (vInfo != null) {
            try {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure "
                    + "?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, 
                    JOptionPane.ERROR_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    String s = vInfo.get(0).toString();
                    String query = "DELETE FROM SETWRITER\n"
                            + "WHERE AuthorId = '" + s + "'";
                    PreparedStatement pstmt = con.connectURL().prepareStatement(
                                                                        query);
                    pstmt.executeUpdate();
                    String query2 = "DELETE FROM AUTHOR\n"
                            + "WHERE AuthorId = '" + s + "'";
                    PreparedStatement pstmt2 = con.connectURL().
                                                    prepareStatement(query2);
                    pstmt2.executeUpdate();
                    ((DefaultTableModel) tbl_Attributes.getModel()).removeRow(
                                                                selectedRow);
                    lbl_InfoName1.setText("");
                    lbl_InfoBirthdate1.setText("");
                    lbl_InfoDeathdate1.setText("");
                    txtArea_Description.setText("");
                    txtArea_Note.setText("");
                    lbl_InfoLabel1.setText("");
                    lbl_InfoStreet1.setText("");
                    lbl_InfoStreet21.setText("");
                    lbl_InfoZip1.setText("");
                    lbl_InfoCity1.setText("");
                    lbl_InfoCountry1.setText("");
                    lbl_InfoPhone1.setText("");
                    vInfo = null;
                    JOptionPane.showMessageDialog(this, "Delete complete !", 
                                    "Delete !", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Author_JPanel.class.getName()).log(Level.
                                                            SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "You have to select an Author", 
                            "No Author found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Delete_Author

    private void Edit_Author(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Author
        // TODO add your handling code here:
        lbl_VFirstname1.setVisible(false);
        lbl_VLastname1.setVisible(false);
        lbl_VBirthdate1.setVisible(false);
        lbl_VDeathdate1.setVisible(false);
        lbl_VPicture1.setVisible(false);
        if (vInfo != null) {
            panel_Add.setVisible(false);
            panel_Consult.setVisible(false);
            panel_Edit.setVisible(true);
            txtFld_EditLastname.setText(vInfo.get(2).toString());
            txtFld_EditFirstname.setText(vInfo.get(3).toString());
            if (vInfo.get(4) == null | vInfo.get(4) == "") {
                txtFld_EditBirthdate.setText("");
            } else {
                txtFld_EditBirthdate.setText(vInfo.get(4).toString());
            }
            if (vInfo.get(5) == null | vInfo.get(5) == "") {
                txtFld_EditDeathdate.setText("");
            } else {
                txtFld_EditDeathdate.setText(vInfo.get(5).toString());
            }
            if (vInfo.get(6) == null | vInfo.get(6) == "") {
                txtArea_EditDescription.setText("");
            } else {
                txtArea_EditDescription.setText(vInfo.get(6).toString());
            }
            if (vInfo.get(7) == null | vInfo.get(7) == "") {
                txtArea_EditNote.setText("");
            } else {
                txtArea_EditNote.setText(vInfo.get(7).toString());
            }
            if (vInfo.get(9) == null | vInfo.get(9) == "") {
                txtFld_EditAddressLabel.setText("");
            } else {
                txtFld_EditAddressLabel.setText(vInfo.get(9).toString());
            }
            if (vInfo.get(10) == null | vInfo.get(10) == "") {
                txtFld_EditAddressStreet.setText("");
            } else {
                txtFld_EditAddressStreet.setText(vInfo.get(10).toString());
            }
            if (vInfo.get(11) == null | vInfo.get(11) == "") {
                txtFld_EditAddressStreet2.setText("");
            } else {
                txtFld_EditAddressStreet2.setText(vInfo.get(11).toString());
            }
            if (vInfo.get(12) == null | vInfo.get(12) == "") {
                txtFld_EditAddressZip.setText("");
            } else {
                txtFld_EditAddressZip.setText(vInfo.get(12).toString());
            }
            if (vInfo.get(13) == null | vInfo.get(13) == "") {
                txtFld_EditAddressCity.setText("");
            } else {
                txtFld_EditAddressCity.setText(vInfo.get(13).toString());
            }
            if (vInfo.get(14) == null | vInfo.get(14) == "") {
                txtFld_EditAddressCountry.setText("");
            } else {
                txtFld_EditAddressCountry.setText(vInfo.get(14).toString());
            }
            if (vInfo.get(15) == null | vInfo.get(15) == "") {
                txtFld_EditAddressPhone.setText("");
            } else {
                txtFld_EditAddressPhone.setText(vInfo.get(15).toString());
            }
        } else {
            vInfo = null;
            JOptionPane.showMessageDialog(this, "You have to select an author", 
                "No Author found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Edit_Author

    private void txtFld_EditLastnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditLastnameMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditLastname.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$")) {
            lbl_VLastname1.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VLastname1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "last name", "Last name Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditLastname.setText("");
        }
    }//GEN-LAST:event_txtFld_EditLastnameMouseExited

    private void txtFld_EditFirstnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditFirstnameMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditFirstname.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$")) {
            lbl_VFirstname1.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VFirstname1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "first name", "First Name Error !", JOptionPane.
                                                            WARNING_MESSAGE);
            txtFld_EditFirstname.setText("");
        }
    }//GEN-LAST:event_txtFld_EditFirstnameMouseExited

    private void txtFld_EditBirthdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditBirthdateMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditBirthdate.getText();
        if (s.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)"
                + "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\"
                + "d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0"
                + "[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26"
                + "])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|"
                + "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
            lbl_VBirthdate1.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VBirthdate1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "birth date", "Birth Date Error !", JOptionPane.
                                                            WARNING_MESSAGE);
            txtFld_EditBirthdate.setText("");
        }
    }//GEN-LAST:event_txtFld_EditBirthdateMouseExited

    private void txtFld_EditDeathdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditDeathdateMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditDeathdate.getText();
        if (s.matches("^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)"
                + "(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\"
                + "d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0"
                + "[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26"
                + "])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|"
                + "(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$")) {
            lbl_VDeathdate1.setVisible(true);
        } else if ("".equals(s)) {
            lbl_VDeathdate1.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "death date", "Death Date Error !", JOptionPane.
                                                            WARNING_MESSAGE);
            txtFld_EditDeathdate.setText("");
        }
    }//GEN-LAST:event_txtFld_EditDeathdateMouseExited

    private void btn_EditPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditPictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditPictureActionPerformed

    private void txtFld_EditAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressLabelMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressLabel.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "label", "Label Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressLabel.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressLabelMouseExited

    private void txtFld_EditAddressStreetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressStreetMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressStreet.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "street", "Street Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressStreet.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressStreetMouseExited

    private void txtFld_EditAddressStreet2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressStreet2MouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressStreet2.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "street 2", "Street2 Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressStreet2.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressStreet2MouseExited

    private void txtFld_EditAddressZipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressZipMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressZip.getText();
        if (s.matches("^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$") | "".equals(
                                                                        s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "zip code", "Zip Code Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressZip.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressZipMouseExited

    private void txtFld_EditAddressCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressCityMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressCity.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$") | "".equals(s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                    + "city", "City Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressCity.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressCityMouseExited

    private void txtFld_EditAddressCountryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressCountryMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressCountry.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$") | "".equals(s)) {
        } else {
            JOptionPane.showMessageDialog(this, "There is a problem with the "
                + "country", "Country Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressCountry.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressCountryMouseExited

    private void txtFld_EditAddressPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressPhoneMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditAddressPhone.getText();
            if (s.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$")) {
                Vector v = new Vector();
                String query = "SELECT AddressPhone\n"
                        + "FROM ADDRESS";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    v.add(rs.getString("AddressPhone"));
                }
                int p = 0;
                for (int i = 0; i < v.size(); i++) {
                    if (v.get(i).toString().equals(s)) {
                        p++;
                    }
                }
                for (int i = 0; i < v.size(); i++) {
                    if (vInfo.get(15).toString().equals(s)) {
                        p = 0;
                    }
                }
                if (p == 1) {
                    JOptionPane.showMessageDialog(this, "This phone already "
                        + "exists !", "Author Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_EditAddressPhone.setText(vInfo.get(15).toString());
                }
            } else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]")) {
                JOptionPane.showMessageDialog(this, "Phone can only have "
                        + "numbers!", "Author Error!", JOptionPane.
                                                            WARNING_MESSAGE);
                txtFld_EditAddressPhone.setText(vInfo.get(15).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_txtFld_EditAddressPhoneMouseExited

    private void Validate_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Edit
        // TODO add your handling code here:
        try {
            String s = vInfo.get(0).toString();
            String a = vInfo.get(8).toString();
            int r = 0;
            if (vInfo.get(4) == null) {
                vInfo.set(4, "");
            }
            if (vInfo.get(5) == null) {
                vInfo.set(5, "");
            }
            if (vInfo.get(6) == null) {
                vInfo.set(6, "");
            }
            if (vInfo.get(7) == null) {
                vInfo.set(7, "");
            }
            if (vInfo.get(9) == null) {
                vInfo.set(9, "");
            }
            if (vInfo.get(11) == null) {
                vInfo.set(11, "");
            }

            if (vInfo.get(2).toString() == null ? txtFld_EditLastname.getText() 
                == null : vInfo.get(2).toString().equals(txtFld_EditLastname.
                                                                getText())) {
                if (vInfo.get(3).toString() == null ? txtFld_EditFirstname.
                    getText() == null : vInfo.get(3).toString().equals(
                                            txtFld_EditFirstname.getText())) {
                    if (vInfo.get(4).toString() == null ? txtFld_EditBirthdate.
                        getText() == null : vInfo.get(4).toString().equals(
                                            txtFld_EditBirthdate.getText())) {
                        if (vInfo.get(5).toString() == null ? 
                            txtFld_EditDeathdate.getText() == null : vInfo.
                                get(5).toString().equals(txtFld_EditDeathdate.
                                                                getText())) {
                            if (vInfo.get(6).toString() == null ? 
                                txtArea_EditDescription.getText() == null : 
                                vInfo.get(6).toString().equals(
                                        txtArea_EditDescription.getText())) {
                                if (vInfo.get(7).toString() == null ? 
                                    txtArea_EditNote.getText() == null : vInfo.
                                    get(7).toString().equals(txtArea_EditNote.
                                                                getText())) {
                                    if (vInfo.get(9).toString() == null ? 
                                        txtFld_EditAddressLabel.getText() == null 
                                        : vInfo.get(9).toString().equals(
                                        txtFld_EditAddressLabel.getText())) {
                                        if (vInfo.get(10).toString() == null ? 
                                            txtFld_EditAddressStreet.getText() 
                                            == null : vInfo.get(10).toString().
                                            equals(txtFld_EditAddressStreet.
                                                                getText())) {
                                            if (vInfo.get(11).toString() == null
                                                ? txtFld_EditAddressStreet2.
                                                getText() == null : vInfo.
                                                get(11).toString().equals(
                                                txtFld_EditAddressStreet2.
                                                                getText())) {
                                                if (vInfo.get(12).toString() == 
                                                    null ? txtFld_EditAddressZip.
                                                    getText() == null : vInfo.
                                                    get(12).toString().equals(
                                                    txtFld_EditAddressZip.
                                                                getText())) {
                                                    if (vInfo.get(13).toString()
                                                        == null ? 
                                                        txtFld_EditAddressCity.
                                                        getText() == null : 
                                                        vInfo.get(13).toString().
                                                                        equals(
                                                        txtFld_EditAddressCity.
                                                                getText())) {
                                                        if (vInfo.get(14).
                                                            toString() == null ?
                                                            txtFld_EditAddressCountry.
                                                            getText() == null : 
                                                            vInfo.get(14).
                                                            toString().equals(
                                                            txtFld_EditAddressCountry.
                                                                getText())) {
                                                            if (vInfo.get(15).
                                                                toString() == 
                                                                null ? 
                                                                txtFld_EditAddressPhone.
                                                                getText() == 
                                                                null : vInfo.
                                                                get(15).toString().
                                                                        equals(
                                                                txtFld_EditAddressPhone.
                                                                getText())) {
                                                                JOptionPane.
                                                                showMessageDialog(
                                                                this, "There's "
                                                                + "no edit !", 
                                                                "Edit !", 
                                                                JOptionPane.
                                                                WARNING_MESSAGE);
                                                                r = 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (r == 0) {
                if (txtFld_EditLastname.getText().isEmpty()
                        | txtFld_EditFirstname.getText().isEmpty()
                        | txtFld_EditAddressStreet.getText().isEmpty()
                        | txtFld_EditAddressZip.getText().isEmpty()
                        | txtFld_EditAddressCity.getText().isEmpty()
                        | txtFld_EditAddressCountry.getText().isEmpty()
                        | txtFld_EditAddressPhone.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Missing Data !", "Edit"
                        + " !", JOptionPane.WARNING_MESSAGE);
                } else {
                    int result = JOptionPane.showConfirmDialog(null, "Are you "
                        + "sure ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION, 
                                                    JOptionPane.ERROR_MESSAGE);
                    if (result == JOptionPane.OK_OPTION) {
                        if (vInfo.get(2).toString() == null ? txtFld_EditLastname.
                            getText() != null : !vInfo.get(2).toString().equals(
                                            txtFld_EditLastname.getText())) {
                            String query = "UPDATE AUTHOR\n"
                                + "SET AuthorLastname = '" + 
                                txtFld_EditLastname.getText() + "'\n"
                                + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(2, txtFld_EditLastname.getText());
                            lbl_InfoName1.setText(txtFld_EditLastname.getText() 
                                    + " " + txtFld_EditFirstname.getText());
                        }
                        if (vInfo.get(3).toString() == null ? 
                            txtFld_EditFirstname.getText() != null : !vInfo.
                                get(3).toString().equals(txtFld_EditFirstname.
                                                                getText())) {
                            String query = "UPDATE AUTHOR\n"
                                    + "SET AuthorFirstname = '" + 
                                    txtFld_EditFirstname.getText() + "'\n"
                                    + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                    prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(3, txtFld_EditFirstname.getText());
                            lbl_InfoName1.setText(txtFld_EditLastname.getText() 
                                    + " " + txtFld_EditFirstname.getText());
                        }
                        if (vInfo.get(4).toString() == null ? 
                                txtFld_EditBirthdate.getText() != null : !vInfo.
                                get(4).toString().equals(txtFld_EditBirthdate.
                                                                getText())) {
                            String query = "UPDATE AUTHOR\n"
                                    + "SET AuthorBirthdate = '" + 
                                    txtFld_EditBirthdate.getText() + "'\n"
                                    + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(4, txtFld_EditBirthdate.getText());
                            lbl_InfoBirthdate1.setText(txtFld_EditBirthdate.
                                                                    getText());
                        }
                        if (vInfo.get(5).toString() == null ? txtFld_EditDeathdate.
                                getText() != null : !vInfo.get(5).toString().
                                        equals(txtFld_EditDeathdate.getText())) {
                            String query = "UPDATE AUTHOR\n"
                                    + "SET AuthorDeathdate = '" + 
                                    txtFld_EditDeathdate.getText() + "'\n"
                                    + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                    prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(5, txtFld_EditDeathdate.getText());
                            lbl_InfoDeathdate1.setText(txtFld_EditDeathdate.
                                                                    getText());
                        }
                        if (vInfo.get(6).toString() == null ? 
                                txtArea_EditDescription.getText() != null : 
                                !vInfo.get(6).toString().equals(
                                        txtArea_EditDescription.getText())) {
                            String query = "UPDATE AUTHOR\n"
                                    + "SET AuthorDesc = '" + 
                                    txtArea_EditDescription.getText() + "'\n"
                                    + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                    prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(6, txtArea_EditDescription.getText());
                            txtArea_Description.setText(txtArea_EditDescription.
                                    getText());
                        }
                        if (vInfo.get(7).toString() == null ? txtArea_EditNote.
                            getText() != null : !vInfo.get(7).toString().equals(
                                                txtArea_EditNote.getText())) {
                            String query = "UPDATE AUTHOR\n"
                                    + "SET AuthorNote = '" + txtArea_EditNote.
                                                            getText() + "'\n"
                                    + "WHERE AuthorId = '" + s + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(7, txtArea_EditNote.getText());
                            txtArea_Note.setText(txtArea_EditNote.getText());
                        }
                        if (vInfo.get(9).toString() == null ? 
                                txtFld_EditAddressLabel.getText() != null : 
                                !vInfo.get(9).toString().equals(
                                        txtFld_EditAddressLabel.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressLabel = '" + 
                                    txtFld_EditAddressLabel.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(9, txtFld_EditAddressLabel.getText());
                            lbl_InfoLabel1.setText(txtFld_EditAddressLabel.
                                                                    getText());
                        }
                        if (vInfo.get(10).toString() == null ? 
                                txtFld_EditAddressStreet.getText() != null : 
                                !vInfo.get(10).toString().equals(
                                        txtFld_EditAddressStreet.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressStreet = '" + 
                                    txtFld_EditAddressStreet.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(10, txtFld_EditAddressStreet.getText());
                            lbl_InfoStreet1.setText(txtFld_EditAddressStreet.
                                                                    getText());
                        }
                        if (vInfo.get(11).toString() == null ? 
                                txtFld_EditAddressStreet2.getText() != null : 
                                !vInfo.get(11).toString().equals(
                                        txtFld_EditAddressStreet2.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressStreet2 = '" + 
                                    txtFld_EditAddressStreet2.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(11, txtFld_EditAddressStreet2.getText());
                            lbl_InfoStreet21.setText(txtFld_EditAddressStreet2.
                                                                    getText());
                        }
                        if (vInfo.get(12).toString() == null ? 
                                txtFld_EditAddressZip.getText() != null : 
                                !vInfo.get(12).toString().equals(
                                        txtFld_EditAddressZip.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressZip = '" + 
                                    txtFld_EditAddressZip.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(12, txtFld_EditAddressZip.getText());
                            lbl_InfoZip1.setText(txtFld_EditAddressZip.getText());
                        }
                        if (vInfo.get(13).toString() == null ? 
                                txtFld_EditAddressCity.getText() != null : 
                                !vInfo.get(13).toString().equals(
                                        txtFld_EditAddressCity.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressCity = '" + 
                                    txtFld_EditAddressCity.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                    prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(13, txtFld_EditAddressCity.getText());
                            lbl_InfoCity1.setText(txtFld_EditAddressCity.
                                                                    getText());
                        }
                        if (vInfo.get(14).toString() == null ? 
                                txtFld_EditAddressCountry.getText() != null : 
                                !vInfo.get(14).toString().equals(
                                        txtFld_EditAddressCountry.getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressCountry = '" + 
                                    txtFld_EditAddressCountry.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(14, txtFld_EditAddressCountry.getText());
                            lbl_InfoCountry1.setText(txtFld_EditAddressCountry.
                                                                    getText());
                        }
                        if (vInfo.get(15).toString() == null ? 
                            txtFld_EditAddressPhone.getText() != null : !vInfo.
                            get(15).toString().equals(txtFld_EditAddressPhone.
                                                                getText())) {
                            String query = "UPDATE ADDRESS\n"
                                    + "SET AddressPhone = '" + 
                                    txtFld_EditAddressPhone.getText() + "'\n"
                                    + "WHERE AddressId = '" + a + "'";
                            PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                            pstmt.executeUpdate();
                            vInfo.set(15, txtFld_EditAddressPhone.getText());
                            lbl_InfoPhone1.setText(txtFld_EditAddressPhone.
                                                                    getText());
                        }
                        panel_Edit.setVisible(false);
                        panel_Consult.setVisible(true);
                        ((DefaultTableModel) tbl_Attributes.getModel()).
                            setDataVector(author.getDataRowAuthor(), author.
                                                        getDataColumnAuthor());
                        tbl_Attributes.getSelectionModel().setSelectionInterval(
                                                    selectedRow, selectedRow);
                        JOptionPane.showMessageDialog(this, "Edit complete !", 
                                    "Edit !", JOptionPane.INFORMATION_MESSAGE);

                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_Validate_Edit

    private void Back_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Edit
        // TODO add your handling code here:
        panel_Add.setVisible(false);
        panel_Edit.setVisible(false);
        panel_Consult.setVisible(true);
    }//GEN-LAST:event_Back_Edit

    private void Author_Status(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Author_Status
        // TODO add your handling code here:
        boolean selected = tglBtn_AuthorStatus.getModel().isSelected();
        try {

            String query = "SELECT StatusTypeId\n"
                    + "FROM SetWriter\n"
                    + "WHERE AuthorId = '" + vInfo.get(0).toString() + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Vector vType = new Vector();
            while (rs.next()) {
                vType.add(rs.getLong("StatusTypeId"));
            }
            if (selected == true) {
                query = "UPDATE SetWriter\n"
                        + "SET StatusTypeId = 7\n"
                        + "WHERE AuthorId = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel) tbl_Attributes.getModel()).setDataVector(
                    author.getDataRowAuthor(), author.getDataColumnAuthor());
                tglBtn_AuthorStatus.setText("Enable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(
                                                    selectedRow, selectedRow);
            } else if (selected == false) {
                query = "UPDATE SetWriter\n"
                        + "SET StatusTypeId = 8\n"
                        + "WHERE AuthorId = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel) tbl_Attributes.getModel()).setDataVector(
                    author.getDataRowAuthor(), author.getDataColumnAuthor());
                tglBtn_AuthorStatus.setText("Disable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(
                                                    selectedRow, selectedRow);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Author_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_Author_Status

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Down;
    private javax.swing.JPanel Down1;
    private javax.swing.JPanel Down2;
    private javax.swing.JPanel Left_SideBar;
    private javax.swing.JPanel Left_SideBar1;
    private javax.swing.JPanel Left_SideBar2;
    private javax.swing.JPanel LeftsideDown1;
    private javax.swing.JPanel LeftsideDown2;
    private javax.swing.JPanel LeftsideDown3;
    private javax.swing.JPanel LeftsideUp1;
    private javax.swing.JPanel LeftsideUp2;
    private javax.swing.JPanel LeftsideUp3;
    private javax.swing.JPanel Right_SideBar;
    private javax.swing.JPanel Right_SideBar1;
    private javax.swing.JPanel Right_SideBar2;
    private javax.swing.JPanel Rightside1;
    private javax.swing.JPanel Rightside2;
    private javax.swing.JPanel Rightside3;
    private javax.swing.JPanel Up;
    private javax.swing.JPanel Up1;
    private javax.swing.JPanel Up2;
    private javax.swing.JButton btn_AddAuthor;
    private javax.swing.JButton btn_AddPicture;
    private javax.swing.JButton btn_BackAdd;
    private javax.swing.JButton btn_BackEdit;
    private javax.swing.JButton btn_DeleteAuthor;
    private javax.swing.JButton btn_Details1;
    private javax.swing.JButton btn_Details2;
    private javax.swing.JButton btn_Details3;
    private javax.swing.JButton btn_EditAuthor;
    private javax.swing.JButton btn_EditAuthor1;
    private javax.swing.JButton btn_EditBook;
    private javax.swing.JButton btn_EditPicture;
    private javax.swing.JButton btn_ValidateAdd;
    private javax.swing.JButton btn_ValidateEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_Author;
    private javax.swing.JLabel lbl_Author1;
    private javax.swing.JLabel lbl_Author2;
    private javax.swing.JLabel lbl_Author3;
    private javax.swing.JLabel lbl_Birthdate;
    private javax.swing.JLabel lbl_Birthdate1;
    private javax.swing.JLabel lbl_City;
    private javax.swing.JLabel lbl_City1;
    private javax.swing.JLabel lbl_Country;
    private javax.swing.JLabel lbl_Country1;
    private javax.swing.JLabel lbl_Deathdate;
    private javax.swing.JLabel lbl_Deathdate1;
    private javax.swing.JLabel lbl_Description;
    private javax.swing.JLabel lbl_Description1;
    private javax.swing.JLabel lbl_InfoBirthdate;
    private javax.swing.JLabel lbl_InfoBirthdate1;
    private javax.swing.JLabel lbl_InfoBirthdate2;
    private javax.swing.JLabel lbl_InfoBirthdate3;
    private javax.swing.JLabel lbl_InfoBirthdate4;
    private javax.swing.JLabel lbl_InfoBirthdate5;
    private javax.swing.JLabel lbl_InfoCity;
    private javax.swing.JLabel lbl_InfoCity1;
    private javax.swing.JLabel lbl_InfoCountry;
    private javax.swing.JLabel lbl_InfoCountry1;
    private javax.swing.JLabel lbl_InfoDeathdate;
    private javax.swing.JLabel lbl_InfoDeathdate1;
    private javax.swing.JLabel lbl_InfoDescription;
    private javax.swing.JLabel lbl_InfoLabel;
    private javax.swing.JLabel lbl_InfoLabel1;
    private javax.swing.JLabel lbl_InfoName;
    private javax.swing.JLabel lbl_InfoName1;
    private javax.swing.JLabel lbl_InfoName2;
    private javax.swing.JLabel lbl_InfoName3;
    private javax.swing.JLabel lbl_InfoName4;
    private javax.swing.JLabel lbl_InfoName5;
    private javax.swing.JLabel lbl_InfoPhone;
    private javax.swing.JLabel lbl_InfoPhone1;
    private javax.swing.JLabel lbl_InfoStreet;
    private javax.swing.JLabel lbl_InfoStreet1;
    private javax.swing.JLabel lbl_InfoStreet2;
    private javax.swing.JLabel lbl_InfoStreet21;
    private javax.swing.JLabel lbl_InfoZip;
    private javax.swing.JLabel lbl_InfoZip1;
    private javax.swing.JLabel lbl_Label;
    private javax.swing.JLabel lbl_Label1;
    private javax.swing.JLabel lbl_LastName;
    private javax.swing.JLabel lbl_LastName1;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Phone1;
    private javax.swing.JLabel lbl_Picture;
    private javax.swing.JLabel lbl_Picture1;
    private javax.swing.JLabel lbl_Research;
    private javax.swing.JLabel lbl_Research1;
    private javax.swing.JLabel lbl_Status1;
    private javax.swing.JLabel lbl_Stree1;
    private javax.swing.JLabel lbl_Street;
    private javax.swing.JLabel lbl_Street2;
    private javax.swing.JLabel lbl_Street21;
    private javax.swing.JLabel lbl_Title1;
    private javax.swing.JLabel lbl_Title2;
    private javax.swing.JLabel lbl_TitleAttributes1;
    private javax.swing.JLabel lbl_TitleComments1;
    private javax.swing.JLabel lbl_TitleInfos1;
    private javax.swing.JLabel lbl_TitleInfos2;
    private javax.swing.JLabel lbl_TitleInfos3;
    private javax.swing.JLabel lbl_TitleManageCustomer1;
    private javax.swing.JLabel lbl_TitleManageCustomer2;
    private javax.swing.JLabel lbl_TitleManagePublisher;
    private javax.swing.JLabel lbl_TitleNote1;
    private javax.swing.JLabel lbl_TitleNote2;
    private javax.swing.JLabel lbl_TitleNote3;
    private javax.swing.JLabel lbl_TitleOrder1;
    private javax.swing.JLabel lbl_TitleOrder2;
    private javax.swing.JLabel lbl_TitleOrder3;
    private javax.swing.JLabel lbl_TitlePublisher;
    private javax.swing.JLabel lbl_TotalTitle;
    private javax.swing.JLabel lbl_TotalTitle1;
    private javax.swing.JLabel lbl_TotalTitle2;
    private javax.swing.JLabel lbl_TotalValue;
    private javax.swing.JLabel lbl_TotalValue1;
    private javax.swing.JLabel lbl_TotalValue2;
    private javax.swing.JLabel lbl_VBirthdate;
    private javax.swing.JLabel lbl_VBirthdate1;
    private javax.swing.JLabel lbl_VCity;
    private javax.swing.JLabel lbl_VCountry;
    private javax.swing.JLabel lbl_VDeathdate;
    private javax.swing.JLabel lbl_VDeathdate1;
    private javax.swing.JLabel lbl_VFirstname;
    private javax.swing.JLabel lbl_VFirstname1;
    private javax.swing.JLabel lbl_VLabel;
    private javax.swing.JLabel lbl_VLastname;
    private javax.swing.JLabel lbl_VLastname1;
    private javax.swing.JLabel lbl_VPhone;
    private javax.swing.JLabel lbl_VPicture;
    private javax.swing.JLabel lbl_VPicture1;
    private javax.swing.JLabel lbl_VStreet;
    private javax.swing.JLabel lbl_VStreet2;
    private javax.swing.JLabel lbl_VZip;
    private javax.swing.JLabel lbl_Zip;
    private javax.swing.JLabel lbl_Zip1;
    private javax.swing.JScrollPane panel_Add;
    private javax.swing.JPanel panel_Add1;
    private javax.swing.JScrollPane panel_Consult;
    private javax.swing.JPanel panel_Consult1;
    private javax.swing.JPanel panel_Delivery1;
    private javax.swing.JPanel panel_Delivery2;
    private javax.swing.JPanel panel_Delivery3;
    private javax.swing.JScrollPane panel_Edit;
    private javax.swing.JPanel panel_Edit1;
    private javax.swing.JPanel panel_Shipping4;
    private javax.swing.JPanel panel_Shipping5;
    private javax.swing.JPanel panel_Shipping6;
    private javax.swing.JScrollPane scrBar_Attributes1;
    private javax.swing.JScrollPane scrBar_Comments1;
    private javax.swing.JScrollPane scrBar_Note1;
    private javax.swing.JScrollPane scrBar_Note2;
    private javax.swing.JScrollPane scrBar_Note3;
    private javax.swing.JSeparator sep_Attirbutes1;
    private javax.swing.JSeparator sep_Comments1;
    private javax.swing.JSeparator sep_Comments2;
    private javax.swing.JSeparator sep_Comments3;
    private javax.swing.JSeparator sep_Customer1;
    private javax.swing.JSeparator sep_Customer2;
    private javax.swing.JSeparator sep_Customer3;
    private javax.swing.JSeparator sep_Infos1;
    private javax.swing.JSeparator sep_Infos2;
    private javax.swing.JSeparator sep_Infos3;
    private javax.swing.JSeparator sep_Note1;
    private javax.swing.JSeparator sep_Note2;
    private javax.swing.JSeparator sep_Note3;
    private javax.swing.JSeparator sep_Order1;
    private javax.swing.JSeparator sep_Order2;
    private javax.swing.JSeparator sep_Order3;
    private javax.swing.JTabbedPane tabPan_Address4;
    private javax.swing.JTabbedPane tabPan_Address5;
    private javax.swing.JTabbedPane tabPan_Address6;
    private javax.swing.JTable tbl_Attributes;
    private javax.swing.JTable tbl_Book;
    private javax.swing.JToggleButton tglBtn_AuthorStatus;
    private javax.swing.JTextArea txtArea_AddDescription;
    private javax.swing.JTextArea txtArea_AddNote;
    private javax.swing.JTextArea txtArea_Description;
    private javax.swing.JTextArea txtArea_EditDescription;
    private javax.swing.JTextArea txtArea_EditNote;
    private javax.swing.JTextArea txtArea_Note;
    private javax.swing.JTextField txtFld_AddAddressCity;
    private javax.swing.JTextField txtFld_AddAddressCountry;
    private javax.swing.JTextField txtFld_AddAddressLabel;
    private javax.swing.JTextField txtFld_AddAddressPhone;
    private javax.swing.JTextField txtFld_AddAddressStreet;
    private javax.swing.JTextField txtFld_AddAddressStreet2;
    private javax.swing.JTextField txtFld_AddAddressZip;
    private javax.swing.JTextField txtFld_AddBirthdate;
    private javax.swing.JTextField txtFld_AddDeathdate;
    private javax.swing.JTextField txtFld_AddFirstname;
    private javax.swing.JTextField txtFld_AddLastname;
    private javax.swing.JTextField txtFld_EditAddressCity;
    private javax.swing.JTextField txtFld_EditAddressCountry;
    private javax.swing.JTextField txtFld_EditAddressLabel;
    private javax.swing.JTextField txtFld_EditAddressPhone;
    private javax.swing.JTextField txtFld_EditAddressStreet;
    private javax.swing.JTextField txtFld_EditAddressStreet2;
    private javax.swing.JTextField txtFld_EditAddressZip;
    private javax.swing.JTextField txtFld_EditBirthdate;
    private javax.swing.JTextField txtFld_EditDeathdate;
    private javax.swing.JTextField txtFld_EditFirstname;
    private javax.swing.JTextField txtFld_EditLastname;
    private javax.swing.JTextField txtFld_Research;
    private javax.swing.JTextField txtFld_Research1;
    // End of variables declaration//GEN-END:variables

    // Other variables declaration
    GetConnection con = new GetConnection();
    JoinsAuthor author = new JoinsAuthor();
    FilterJtable fjt = new FilterJtable();
    Vector vInfo = null;
    Long addressId = null;
    int selectedRow;
    String vInfoString;
}
