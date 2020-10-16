package BookShop.Publisher;

import BookShop.Methods.AddButton;
import BookShop.Methods.FilterJtable;
import BookShop.Methods.GetConnection;
import BookShop.Author.JoinsAuthor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Publisher_JPanel extends javax.swing.JPanel
{
    GetConnection con = new GetConnection();
    JoinsPublisher publi = new JoinsPublisher();
    JoinsAuthor author = new JoinsAuthor();
    FilterJtable fjt = new FilterJtable();
    Vector vInfo = null;
    Long addressId = null;
    int ligneSelectionne;
    String b;
    
    public Publisher_JPanel() 
    {
        initComponents();
        fjt.FilterJtable(tbl_Attributes, txtFld_Research);
        tglBtn_PublisherStatus.setEnabled(false);
    }
    
    private DefaultTableModel initTable() {
        tbl_Attributes.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(publi.getDataRowPubli(), publi.getDataColumnPubli()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    private DefaultTableModel initTableBook() 
    {
            return new DefaultTableModel(author.getDataRowBook(b), author.getDataColumnBook()) {
            boolean[] canEdit = new boolean [] {
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
        btn_AddPublisher = new javax.swing.JButton();
        sep_Customer2 = new javax.swing.JSeparator();
        lbl_Status1 = new javax.swing.JLabel();
        tglBtn_PublisherStatus = new javax.swing.JToggleButton();
        lbl_TitleAttributes1 = new javax.swing.JLabel();
        sep_Attirbutes1 = new javax.swing.JSeparator();
        scrBar_Attributes1 = new javax.swing.JScrollPane();
        tbl_Attributes = new javax.swing.JTable();
        lbl_TitleComments1 = new javax.swing.JLabel();
        scrBar_Comments1 = new javax.swing.JScrollPane();
        tbl_Book = new javax.swing.JTable();
        sep_Comments2 = new javax.swing.JSeparator();
        txtFld_Research = new javax.swing.JTextField();
        lbl_Research = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFld_Research3 = new javax.swing.JTextField();
        btn_DeletePublisher = new javax.swing.JButton();
        Right_SideBar = new javax.swing.JPanel();
        LeftsideUp2 = new javax.swing.JPanel();
        lbl_TitleInfos2 = new javax.swing.JLabel();
        sep_Infos2 = new javax.swing.JSeparator();
        lbl_InfoContactname = new javax.swing.JLabel();
        lbl_InfoContactname2 = new javax.swing.JLabel();
        lbl_InfoMail = new javax.swing.JLabel();
        lbl_InfoMail2 = new javax.swing.JLabel();
        btn_EditPublisher = new javax.swing.JButton();
        Rightside2 = new javax.swing.JPanel();
        lbl_TitleNote2 = new javax.swing.JLabel();
        sep_Note2 = new javax.swing.JSeparator();
        scrBar_Note2 = new javax.swing.JScrollPane();
        txtArea_Note = new javax.swing.JTextArea();
        LeftsideDown2 = new javax.swing.JPanel();
        lbl_TitleOrder2 = new javax.swing.JLabel();
        sep_Order2 = new javax.swing.JSeparator();
        lbl_TotalTitle = new javax.swing.JLabel();
        lbl_TotalValue = new javax.swing.JLabel();
        btn_Details2 = new javax.swing.JButton();
        Down = new javax.swing.JPanel();
        tabPan_Address5 = new javax.swing.JTabbedPane();
        panel_Delivery2 = new javax.swing.JPanel();
        lbl_InfoLabel1 = new javax.swing.JLabel();
        lbl_InfoLabel = new javax.swing.JLabel();
        lbl_InfoStreet = new javax.swing.JLabel();
        lbl_InfoStreet1 = new javax.swing.JLabel();
        lbl_InfoStreet21 = new javax.swing.JLabel();
        lbl_InfoStreet2 = new javax.swing.JLabel();
        lbl_InfoZip = new javax.swing.JLabel();
        lbl_InfoZip1 = new javax.swing.JLabel();
        lbl_InfoCity = new javax.swing.JLabel();
        lbl_InfoCity1 = new javax.swing.JLabel();
        lbl_InfoCountry1 = new javax.swing.JLabel();
        lbl_InfoCountry = new javax.swing.JLabel();
        lbl_InfoPhone = new javax.swing.JLabel();
        lbl_InfoPhone1 = new javax.swing.JLabel();
        panel_Add = new javax.swing.JScrollPane();
        panel_Add1 = new javax.swing.JPanel();
        Up2 = new javax.swing.JPanel();
        lbl_TitleManagePublisher2 = new javax.swing.JLabel();
        Left_SideBar2 = new javax.swing.JPanel();
        lbl_Publisher2 = new javax.swing.JLabel();
        sep_Customer3 = new javax.swing.JSeparator();
        sep_Comments3 = new javax.swing.JSeparator();
        txtFld_AddName = new javax.swing.JTextField();
        txtFld_AddMail = new javax.swing.JTextField();
        txtFld_AddContactname = new javax.swing.JTextField();
        lbl_Name = new javax.swing.JLabel();
        lbl_Mail = new javax.swing.JLabel();
        lbl_Contactname = new javax.swing.JLabel();
        Validate_Add = new javax.swing.JButton();
        Back_Add = new javax.swing.JButton();
        lbl_VName = new javax.swing.JLabel();
        lbl_VMail = new javax.swing.JLabel();
        lbl_VContactname = new javax.swing.JLabel();
        lbl_Author3 = new javax.swing.JLabel();
        lbl_Label = new javax.swing.JLabel();
        txtFld_AddAddressLabel = new javax.swing.JTextField();
        txtFld_AddAddressStreet = new javax.swing.JTextField();
        lbl_Street = new javax.swing.JLabel();
        lbl_Street2 = new javax.swing.JLabel();
        txtFld_AddAddressStreet2 = new javax.swing.JTextField();
        txtFld_AddAddressZip = new javax.swing.JTextField();
        lbl_Zip = new javax.swing.JLabel();
        lbl_City = new javax.swing.JLabel();
        txtFld_AddAddressCity = new javax.swing.JTextField();
        txtFld_AddAddressCountry = new javax.swing.JTextField();
        lbl_Country = new javax.swing.JLabel();
        lbl_Phone = new javax.swing.JLabel();
        txtFld_AddAddressPhone = new javax.swing.JTextField();
        lbl_VLabel = new javax.swing.JLabel();
        lbl_VStreet = new javax.swing.JLabel();
        lbl_VStreet2 = new javax.swing.JLabel();
        lbl_VZip = new javax.swing.JLabel();
        lbl_VCity = new javax.swing.JLabel();
        lbl_VCountry = new javax.swing.JLabel();
        lbl_VPhone = new javax.swing.JLabel();
        Right_SideBar2 = new javax.swing.JPanel();
        LeftsideUp3 = new javax.swing.JPanel();
        lbl_TitleInfos3 = new javax.swing.JLabel();
        sep_Infos3 = new javax.swing.JSeparator();
        lbl_InfoContactname3 = new javax.swing.JLabel();
        lbl_InfoContactname4 = new javax.swing.JLabel();
        lbl_InfoMail3 = new javax.swing.JLabel();
        lbl_InfoMail4 = new javax.swing.JLabel();
        btn_EditPublisher2 = new javax.swing.JButton();
        Rightside3 = new javax.swing.JPanel();
        lbl_TitleNote3 = new javax.swing.JLabel();
        sep_Note3 = new javax.swing.JSeparator();
        scrBar_Note3 = new javax.swing.JScrollPane();
        txtArea_AddNote = new javax.swing.JTextArea();
        LeftsideDown3 = new javax.swing.JPanel();
        lbl_TitleOrder3 = new javax.swing.JLabel();
        sep_Order3 = new javax.swing.JSeparator();
        lbl_TotalTitle2 = new javax.swing.JLabel();
        lbl_TotalValue2 = new javax.swing.JLabel();
        btn_Details3 = new javax.swing.JButton();
        Down2 = new javax.swing.JPanel();
        tabPan_Address6 = new javax.swing.JTabbedPane();
        panel_Shipping6 = new javax.swing.JPanel();
        panel_Edit = new javax.swing.JScrollPane();
        panel_Edit1 = new javax.swing.JPanel();
        Up3 = new javax.swing.JPanel();
        lbl_TitleManagePublisher3 = new javax.swing.JLabel();
        Left_SideBar3 = new javax.swing.JPanel();
        lbl_Publisher3 = new javax.swing.JLabel();
        sep_Customer4 = new javax.swing.JSeparator();
        sep_Comments4 = new javax.swing.JSeparator();
        txtFld_EditName = new javax.swing.JTextField();
        txtFld_EditMail = new javax.swing.JTextField();
        txtFld_EditContactname = new javax.swing.JTextField();
        lbl_Name1 = new javax.swing.JLabel();
        lbl_Mail1 = new javax.swing.JLabel();
        lbl_Contactname1 = new javax.swing.JLabel();
        btn_ValidateEdit = new javax.swing.JButton();
        btn_BackEdit = new javax.swing.JButton();
        lbl_VName1 = new javax.swing.JLabel();
        lbl_VMail1 = new javax.swing.JLabel();
        lbl_VContactname1 = new javax.swing.JLabel();
        lbl_Author2 = new javax.swing.JLabel();
        lbl_Label1 = new javax.swing.JLabel();
        txtFld_EditAddressLabel = new javax.swing.JTextField();
        txtFld_EditAddressStreet = new javax.swing.JTextField();
        lbl_Stree1 = new javax.swing.JLabel();
        lbl_Street21 = new javax.swing.JLabel();
        txtFld_EditAddressStreet2 = new javax.swing.JTextField();
        txtFld_EditAddressZip = new javax.swing.JTextField();
        lbl_Zip1 = new javax.swing.JLabel();
        lbl_City1 = new javax.swing.JLabel();
        txtFld_EditAddressCity = new javax.swing.JTextField();
        txtFld_EditAddressCountry = new javax.swing.JTextField();
        lbl_Country1 = new javax.swing.JLabel();
        lbl_Phone1 = new javax.swing.JLabel();
        txtFld_EditAddressPhone = new javax.swing.JTextField();
        Right_SideBar3 = new javax.swing.JPanel();
        LeftsideUp4 = new javax.swing.JPanel();
        lbl_TitleInfos4 = new javax.swing.JLabel();
        sep_Infos4 = new javax.swing.JSeparator();
        lbl_InfoContactname5 = new javax.swing.JLabel();
        lbl_InfoContactname6 = new javax.swing.JLabel();
        lbl_InfoMail5 = new javax.swing.JLabel();
        lbl_InfoMail6 = new javax.swing.JLabel();
        btn_EditPublisher3 = new javax.swing.JButton();
        Rightside4 = new javax.swing.JPanel();
        lbl_TitleNote4 = new javax.swing.JLabel();
        sep_Note4 = new javax.swing.JSeparator();
        scrBar_Note4 = new javax.swing.JScrollPane();
        txtArea_EditNote = new javax.swing.JTextArea();
        LeftsideDown4 = new javax.swing.JPanel();
        lbl_TitleOrder4 = new javax.swing.JLabel();
        sep_Order4 = new javax.swing.JSeparator();
        lbl_TotalTitle3 = new javax.swing.JLabel();
        lbl_TotalValue3 = new javax.swing.JLabel();
        btn_Details4 = new javax.swing.JButton();
        Down3 = new javax.swing.JPanel();
        tabPan_Address7 = new javax.swing.JTabbedPane();
        panel_Shipping7 = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        panel_Consult.setBorder(null);

        panel_Consult1.setBackground(new java.awt.Color(242, 242, 242));

        Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManagePublisher.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManagePublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManagePublisher.setText("MANAGE PUBLISHER");

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
        lbl_TitlePublisher.setText("Publisher");

        btn_AddPublisher.setBackground(new java.awt.Color(135, 199, 213));
        btn_AddPublisher.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AddPublisher.setText("ADD");
        btn_AddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Publisher(evt);
            }
        });

        lbl_Status1.setText("Status:");

        tglBtn_PublisherStatus.setBackground(new java.awt.Color(135, 199, 213));
        tglBtn_PublisherStatus.setText("Enable");
        tglBtn_PublisherStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Publisher_Status(evt);
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
                Select_Publisher(evt);
            }
        });
        scrBar_Attributes1.setViewportView(tbl_Attributes);

        lbl_TitleComments1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Comment_32px.png"))); // NOI18N
        lbl_TitleComments1.setText("Book");

        tbl_Book.setAutoCreateRowSorter(true);
        tbl_Book.setModel(initTableBook());
        tbl_Book.setRowHeight(30);
        tbl_Book.setSelectionBackground(new java.awt.Color(135, 199, 213));
        tbl_Book.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Book.setShowVerticalLines(false);
        scrBar_Comments1.setViewportView(tbl_Book);

        lbl_Research.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_Research.setText("Research :");
        lbl_Research.setAlignmentY(1.0F);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel4.setText("Research :");
        jLabel4.setAlignmentY(1.0F);

        btn_DeletePublisher.setBackground(new java.awt.Color(135, 199, 213));
        btn_DeletePublisher.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_DeletePublisher.setText("Delete");
        btn_DeletePublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Publisher(evt);
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
                            .addComponent(sep_Customer2)
                            .addComponent(scrBar_Comments1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Comments2)
                            .addComponent(scrBar_Attributes1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(lbl_TitlePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 62, Short.MAX_VALUE)
                                .addComponent(btn_AddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(txtFld_Research3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_TitleComments1)
                                    .addComponent(lbl_TitleAttributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(btn_DeletePublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Research)
                                .addGap(18, 18, 18)
                                .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_Status1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglBtn_PublisherStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Left_SideBarLayout.setVerticalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitlePublisher)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                        .addComponent(btn_AddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(sep_Customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Status1)
                    .addComponent(tglBtn_PublisherStatus))
                .addGap(27, 27, 27)
                .addComponent(lbl_TitleAttributes1)
                .addGap(7, 7, 7)
                .addComponent(sep_Attirbutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Research)
                    .addComponent(btn_DeletePublisher))
                .addGap(8, 8, 8)
                .addComponent(scrBar_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_TitleComments1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Comments2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFld_Research3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right_SideBar.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos2.setText("Infos");

        lbl_InfoContactname.setText("Contact :");

        lbl_InfoContactname2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoMail.setText("Mail :");

        lbl_InfoMail2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditPublisher.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditPublisher.setText("Edit Publisher");
        btn_EditPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Publisher(evt);
            }
        });

        javax.swing.GroupLayout LeftsideUp2Layout = new javax.swing.GroupLayout(LeftsideUp2);
        LeftsideUp2.setLayout(LeftsideUp2Layout);
        LeftsideUp2Layout.setHorizontalGroup(
            LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp2Layout.createSequentialGroup()
                        .addComponent(lbl_InfoContactname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_InfoContactname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_TitleInfos2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftsideUp2Layout.createSequentialGroup()
                        .addComponent(lbl_InfoMail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoMail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(sep_Infos2)
                    .addComponent(btn_EditPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(lbl_InfoContactname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoContactname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoMail2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditPublisher)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote2.setText("Note");

        scrBar_Note2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Note.setEditable(false);
        txtArea_Note.setColumns(20);
        txtArea_Note.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_Note.setLineWrap(true);
        txtArea_Note.setRows(5);
        scrBar_Note2.setViewportView(txtArea_Note);

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

        lbl_TotalTitle.setText("Current Book :");

        lbl_TotalValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue.setText("120");

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
                        .addComponent(lbl_TotalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle))
                .addGap(18, 18, 18)
                .addComponent(btn_Details2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBarLayout = new javax.swing.GroupLayout(Right_SideBar);
        Right_SideBar.setLayout(Right_SideBarLayout);
        Right_SideBarLayout.setHorizontalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBarLayout.setVerticalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addComponent(LeftsideUp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down.setBackground(new java.awt.Color(242, 242, 242));

        panel_Delivery2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_InfoLabel.setText("Label :");

        lbl_InfoStreet.setText("Street :");

        lbl_InfoStreet2.setText("Street 2 :");

        lbl_InfoZip.setText("Zip Code :");

        lbl_InfoCity.setText("City : ");

        lbl_InfoCountry.setText("Country :");

        lbl_InfoPhone.setText("Phone :");

        javax.swing.GroupLayout panel_Delivery2Layout = new javax.swing.GroupLayout(panel_Delivery2);
        panel_Delivery2.setLayout(panel_Delivery2Layout);
        panel_Delivery2Layout.setHorizontalGroup(
            panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbl_InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_InfoStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_InfoStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoPhone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoCountry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoCity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoZip1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                    .addComponent(lbl_InfoStreet21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panel_Delivery2Layout.setVerticalGroup(
            panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Delivery2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InfoStreet21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InfoZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoZip1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_InfoCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoCountry1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panel_Delivery2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_InfoPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Delivery2Layout.createSequentialGroup()
                        .addComponent(lbl_InfoPhone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)))
                .addContainerGap(185, Short.MAX_VALUE))
        );

        tabPan_Address5.addTab("Address Publisher", panel_Delivery2);

        javax.swing.GroupLayout DownLayout = new javax.swing.GroupLayout(Down);
        Down.setLayout(DownLayout);
        DownLayout.setHorizontalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address5)
                .addContainerGap())
        );
        DownLayout.setVerticalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addComponent(tabPan_Address5, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGroup(panel_Consult1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Consult1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Left_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Consult.setViewportView(panel_Consult1);

        add(panel_Consult, "card5");

        panel_Add.setBorder(null);

        panel_Add1.setBackground(new java.awt.Color(242, 242, 242));

        Up2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManagePublisher2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManagePublisher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManagePublisher2.setText("ADD PUBLISHER");

        javax.swing.GroupLayout Up2Layout = new javax.swing.GroupLayout(Up2);
        Up2.setLayout(Up2Layout);
        Up2Layout.setHorizontalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up2Layout.setVerticalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Publisher2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Publisher2.setText("Publisher");

        txtFld_AddName.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_AddName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddNameMouseExited(evt);
            }
        });

        txtFld_AddMail.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_AddMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddMailMouseExited(evt);
            }
        });

        txtFld_AddContactname.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_AddContactname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddContactnameMouseExited(evt);
            }
        });

        lbl_Name.setText("Name :");

        lbl_Mail.setText("Mail :");

        lbl_Contactname.setText("Contact Name :");

        Validate_Add.setBackground(new java.awt.Color(135, 199, 213));
        Validate_Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Validate_Add.setText("Validate");
        Validate_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Validate_Add(evt);
            }
        });

        Back_Add.setBackground(new java.awt.Color(135, 199, 213));
        Back_Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Back_Add.setText("Back");
        Back_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Add(evt);
            }
        });

        lbl_VName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VMail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VContactname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Author3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author3.setText("Address");

        lbl_Label.setText("Label :");

        txtFld_AddAddressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressLabelMouseExited(evt);
            }
        });

        txtFld_AddAddressStreet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressStreetMouseExited(evt);
            }
        });

        lbl_Street.setText("Street :");

        lbl_Street2.setText("Street 2 :");

        txtFld_AddAddressStreet2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddAddressStreet2MouseExited(evt);
            }
        });

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

        lbl_VLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VStreet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VStreet2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VZip.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VCity.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VCountry.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VPhone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        javax.swing.GroupLayout Left_SideBar2Layout = new javax.swing.GroupLayout(Left_SideBar2);
        Left_SideBar2.setLayout(Left_SideBar2Layout);
        Left_SideBar2Layout.setHorizontalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(lbl_Contactname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddContactname, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(lbl_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddMail))
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                                .addComponent(lbl_VMail)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lbl_VName, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                                        .addGap(287, 287, 287))
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(lbl_VContactname)
                                        .addGap(180, 180, 180))))
                            .addComponent(sep_Comments3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Publisher2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(Validate_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Back_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sep_Customer3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Author3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Street2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_City, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFld_AddAddressStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressStreet2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressZip, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressCountry, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_AddAddressPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addComponent(txtFld_AddAddressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_VLabel)
                            .addComponent(lbl_VStreet2)
                            .addComponent(lbl_VStreet)
                            .addComponent(lbl_VZip)
                            .addComponent(lbl_VCity)
                            .addComponent(lbl_VCountry)
                            .addComponent(lbl_VPhone))
                        .addGap(206, 206, 206)))
                .addContainerGap())
        );
        Left_SideBar2Layout.setVerticalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Publisher2)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Back_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Validate_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Customer3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_VName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFld_AddMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_VMail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contactname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_AddContactname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_VContactname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sep_Comments3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Author3)
                .addGap(26, 26, 26)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_VLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Street, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Street2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addComponent(lbl_VStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_VStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Zip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_City, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addComponent(lbl_VZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(lbl_VCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Country, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_Phone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addComponent(lbl_VCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_VPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );

        Right_SideBar2.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos3.setText("Infos");

        lbl_InfoContactname3.setText("Contact : ");

        lbl_InfoContactname4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoMail3.setText("Mail :");

        lbl_InfoMail4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditPublisher2.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditPublisher2.setText("Edit Publisher");

        javax.swing.GroupLayout LeftsideUp3Layout = new javax.swing.GroupLayout(LeftsideUp3);
        LeftsideUp3.setLayout(LeftsideUp3Layout);
        LeftsideUp3Layout.setHorizontalGroup(
            LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addComponent(lbl_InfoMail3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoMail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoContactname3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoContactname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideUp3Layout.createSequentialGroup()
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Infos3)
                            .addComponent(btn_EditPublisher2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
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
                    .addComponent(lbl_InfoContactname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoContactname4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoMail3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoMail4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditPublisher2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote3.setText("Note");

        scrBar_Note3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_AddNote.setColumns(20);
        txtArea_AddNote.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_AddNote.setLineWrap(true);
        txtArea_AddNote.setRows(5);
        scrBar_Note3.setViewportView(txtArea_AddNote);

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
        lbl_TitleOrder3.setText("Book");

        lbl_TotalTitle2.setText("Current Book :");

        lbl_TotalValue2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue2.setText("120");

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
                        .addComponent(lbl_TotalTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lbl_TotalValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle2))
                .addGap(18, 18, 18)
                .addComponent(btn_Details3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBar2Layout = new javax.swing.GroupLayout(Right_SideBar2);
        Right_SideBar2.setLayout(Right_SideBar2Layout);
        Right_SideBar2Layout.setHorizontalGroup(
            Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBar2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBar2Layout.setVerticalGroup(
            Right_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBar2Layout.createSequentialGroup()
                .addComponent(LeftsideUp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down2.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Shipping6Layout = new javax.swing.GroupLayout(panel_Shipping6);
        panel_Shipping6.setLayout(panel_Shipping6Layout);
        panel_Shipping6Layout.setHorizontalGroup(
            panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panel_Shipping6Layout.setVerticalGroup(
            panel_Shipping6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        tabPan_Address6.addTab("Information Publisher", panel_Shipping6);

        javax.swing.GroupLayout Down2Layout = new javax.swing.GroupLayout(Down2);
        Down2.setLayout(Down2Layout);
        Down2Layout.setHorizontalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address6)
                .addContainerGap())
        );
        Down2Layout.setVerticalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addComponent(tabPan_Address6, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Add1Layout = new javax.swing.GroupLayout(panel_Add1);
        panel_Add1.setLayout(panel_Add1Layout);
        panel_Add1Layout.setHorizontalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Add1Layout.createSequentialGroup()
                .addComponent(Left_SideBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Add1Layout.setVerticalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Add1Layout.createSequentialGroup()
                .addComponent(Up2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Left_SideBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        panel_Add.setViewportView(panel_Add1);

        add(panel_Add, "card6");

        panel_Edit.setBorder(null);

        panel_Edit1.setBackground(new java.awt.Color(242, 242, 242));

        Up3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManagePublisher3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManagePublisher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManagePublisher3.setText("EDIT PUBLISHER");

        javax.swing.GroupLayout Up3Layout = new javax.swing.GroupLayout(Up3);
        Up3.setLayout(Up3Layout);
        Up3Layout.setHorizontalGroup(
            Up3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up3Layout.setVerticalGroup(
            Up3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManagePublisher3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Publisher3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Publisher3.setText("Publisher");

        txtFld_EditName.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_EditName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditNameMouseExited(evt);
            }
        });

        txtFld_EditMail.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_EditMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditMailMouseExited(evt);
            }
        });

        txtFld_EditContactname.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_EditContactname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditContactnameMouseExited(evt);
            }
        });

        lbl_Name1.setText("Name :");

        lbl_Mail1.setText("Mail :");

        lbl_Contactname1.setText("Contact Name :");

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

        lbl_VName1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VMail1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_VContactname1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Author2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Author2.setText("Address");

        lbl_Label1.setText("Label :");

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

        lbl_Stree1.setText("Street :");

        lbl_Street21.setText("Street 2 :");

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

        lbl_Zip1.setText("Zip Code :");

        lbl_City1.setText("City : ");

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

        lbl_Country1.setText("Country :");

        lbl_Phone1.setText("Phone :");

        txtFld_EditAddressPhone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditAddressPhoneMouseExited(evt);
            }
        });

        javax.swing.GroupLayout Left_SideBar3Layout = new javax.swing.GroupLayout(Left_SideBar3);
        Left_SideBar3.setLayout(Left_SideBar3Layout);
        Left_SideBar3Layout.setHorizontalGroup(
            Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Contactname1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_EditContactname, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Mail1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_EditMail))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_EditName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                                .addComponent(lbl_VMail1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(lbl_VName1, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                                        .addGap(287, 287, 287))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_VContactname1)
                                        .addGap(180, 180, 180))))
                            .addComponent(sep_Comments4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addComponent(lbl_Publisher3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(30, 30, 30)
                                .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(sep_Customer4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_Author2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_Phone1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Country1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_City1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Zip1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Street21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Stree1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFld_EditAddressStreet, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_EditAddressLabel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_EditAddressPhone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_EditAddressCountry, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_EditAddressCity, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_EditAddressZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtFld_EditAddressStreet2))
                        .addGap(230, 230, 230)))
                .addContainerGap())
        );
        Left_SideBar3Layout.setVerticalGroup(
            Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Publisher3)
                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Customer4, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_VName1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Name1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_EditName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFld_EditMail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_Mail1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lbl_VMail1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Contactname1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditContactname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_VContactname1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sep_Comments4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Author2)
                .addGap(28, 28, 28)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Stree1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Street21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Zip1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFld_EditAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_City1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Country1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_EditAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Phone1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(293, 293, 293))
        );

        Right_SideBar3.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos4.setText("Infos");

        lbl_InfoContactname5.setText("Contact : ");

        lbl_InfoContactname6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoMail5.setText("Mail :");

        lbl_InfoMail6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditPublisher3.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditPublisher3.setText("Edit Publisher");

        javax.swing.GroupLayout LeftsideUp4Layout = new javax.swing.GroupLayout(LeftsideUp4);
        LeftsideUp4.setLayout(LeftsideUp4Layout);
        LeftsideUp4Layout.setHorizontalGroup(
            LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp4Layout.createSequentialGroup()
                        .addComponent(lbl_InfoMail5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoMail6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(LeftsideUp4Layout.createSequentialGroup()
                        .addGroup(LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp4Layout.createSequentialGroup()
                                .addComponent(lbl_InfoContactname5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoContactname6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUp4Layout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideUp4Layout.createSequentialGroup()
                        .addGroup(LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Infos4)
                            .addComponent(btn_EditPublisher3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        LeftsideUp4Layout.setVerticalGroup(
            LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoContactname5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoContactname6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoMail5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoMail6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditPublisher3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote4.setText("Note");

        scrBar_Note4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_EditNote.setColumns(20);
        txtArea_EditNote.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtArea_EditNote.setLineWrap(true);
        txtArea_EditNote.setRows(5);
        scrBar_Note4.setViewportView(txtArea_EditNote);

        javax.swing.GroupLayout Rightside4Layout = new javax.swing.GroupLayout(Rightside4);
        Rightside4.setLayout(Rightside4Layout);
        Rightside4Layout.setHorizontalGroup(
            Rightside4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Rightside4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Note4)
                    .addGroup(Rightside4Layout.createSequentialGroup()
                        .addComponent(lbl_TitleNote4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrBar_Note4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        Rightside4Layout.setVerticalGroup(
            Rightside4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Rightside4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleNote4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Note4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note4)
                .addContainerGap())
        );

        LeftsideDown4.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder4.setText("Book");

        lbl_TotalTitle3.setText("Current Book :");

        lbl_TotalValue3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue3.setText("120");

        btn_Details4.setBackground(new java.awt.Color(135, 199, 213));
        btn_Details4.setText("View details");

        javax.swing.GroupLayout LeftsideDown4Layout = new javax.swing.GroupLayout(LeftsideDown4);
        LeftsideDown4.setLayout(LeftsideDown4Layout);
        LeftsideDown4Layout.setHorizontalGroup(
            LeftsideDown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown4Layout.createSequentialGroup()
                .addGroup(LeftsideDown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDown4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_TotalTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_TotalValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(LeftsideDown4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Details4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sep_Order4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDown4Layout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addContainerGap())
        );
        LeftsideDown4Layout.setVerticalGroup(
            LeftsideDown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDown4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleOrder4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Order4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideDown4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TotalValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle3))
                .addGap(18, 18, 18)
                .addComponent(btn_Details4)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBar3Layout = new javax.swing.GroupLayout(Right_SideBar3);
        Right_SideBar3.setLayout(Right_SideBar3Layout);
        Right_SideBar3Layout.setHorizontalGroup(
            Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBar3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBar3Layout.setVerticalGroup(
            Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBar3Layout.createSequentialGroup()
                .addComponent(LeftsideUp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down3.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_Shipping7Layout = new javax.swing.GroupLayout(panel_Shipping7);
        panel_Shipping7.setLayout(panel_Shipping7Layout);
        panel_Shipping7Layout.setHorizontalGroup(
            panel_Shipping7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 546, Short.MAX_VALUE)
        );
        panel_Shipping7Layout.setVerticalGroup(
            panel_Shipping7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );

        tabPan_Address7.addTab("Information Publisher", panel_Shipping7);

        javax.swing.GroupLayout Down3Layout = new javax.swing.GroupLayout(Down3);
        Down3.setLayout(Down3Layout);
        Down3Layout.setHorizontalGroup(
            Down3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address7)
                .addContainerGap())
        );
        Down3Layout.setVerticalGroup(
            Down3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down3Layout.createSequentialGroup()
                .addComponent(tabPan_Address7, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Edit1Layout = new javax.swing.GroupLayout(panel_Edit1);
        panel_Edit1.setLayout(panel_Edit1Layout);
        panel_Edit1Layout.setHorizontalGroup(
            panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Edit1Layout.createSequentialGroup()
                .addComponent(Left_SideBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Edit1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Edit1Layout.setVerticalGroup(
            panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Edit1Layout.createSequentialGroup()
                .addComponent(Up3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Edit1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Edit1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Left_SideBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Edit.setViewportView(panel_Edit1);

        add(panel_Edit, "card7");
    }// </editor-fold>//GEN-END:initComponents
    
    private void Add_Publisher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Publisher
        // TODO add your handling code here:
        lbl_VName.setVisible(false);
        lbl_VMail.setVisible(false);
        lbl_VContactname.setVisible(false);
        lbl_VLabel.setVisible(false);
        lbl_VStreet.setVisible(false);
        lbl_VStreet2.setVisible(false);
        lbl_VZip.setVisible(false);
        lbl_VCity.setVisible(false);
        lbl_VCountry.setVisible(false);
        lbl_VPhone.setVisible(false);
        panel_Add.setVisible(true);
        panel_Consult.setVisible(false);
    }//GEN-LAST:event_Add_Publisher

    private void txtFld_AddNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddNameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddName.getText();
            if (s.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$"))
            {
                lbl_VName.setVisible(true);
                Vector v = new Vector();
                String query =  "SELECT PublisherName\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherName"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This publisher already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_AddName.setText("");
                    lbl_VName.setVisible(false);
                }
            }
            else
            {
                lbl_VName.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_AddNameMouseExited

    private void txtFld_AddMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddMailMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddMail.getText();
            if (s.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?"))
            {
                lbl_VMail.setVisible(true);
                Vector v = new Vector();
                String query =  "SELECT PublisherMail\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherMail"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This mail already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_AddMail.setText("");
                    lbl_VMail.setVisible(false);
                }
            }
            else
            {
                lbl_VMail.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_AddMailMouseExited

    private void txtFld_AddContactnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddContactnameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddContactname.getText();
            if (s.matches("^[a-zA-Z0-9 ]+(-[a-zA-Z0-9 ]+)?$"))
            {
                lbl_VContactname.setVisible(true);
                Vector v = new Vector();
                String query =  "SELECT PublisherContactName\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherContactName"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This contact name already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_AddContactname.setText("");
                    lbl_VContactname.setVisible(false);
                }
            }
            else
            {
                lbl_VContactname.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_AddContactnameMouseExited

    private void txtFld_AddAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressLabelMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressLabel.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$"))
        {
            lbl_VLabel.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VLabel.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the label","Label Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressLabel.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressLabelMouseExited

    private void txtFld_AddAddressStreetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressStreetMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressStreet.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$"))
        {
            lbl_VStreet.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VStreet.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the street","Street Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressStreet.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressStreetMouseExited

    private void txtFld_AddAddressStreet2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressStreet2MouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressStreet2.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$"))
        {
            lbl_VStreet2.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VStreet2.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the street 2","Street2 Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressStreet2.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressStreet2MouseExited

    private void txtFld_AddAddressZipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressZipMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressZip.getText();
        if (s.matches("^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$"))
        {
            lbl_VZip.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VZip.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the zip code","Zip Code Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressZip.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressZipMouseExited

    private void txtFld_AddAddressCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressCityMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressCity.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$"))
        {
            lbl_VCity.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VCity.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the city","City Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressCity.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressCityMouseExited

    private void txtFld_AddAddressCountryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressCountryMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddAddressCountry.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$"))
        {
            lbl_VCountry.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_VCountry.setVisible(false);
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the country","Country Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddAddressCountry.setText("");
        }
    }//GEN-LAST:event_txtFld_AddAddressCountryMouseExited

    private void txtFld_AddAddressPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddAddressPhoneMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddAddressPhone.getText();
            if (s.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$"))
            {
                lbl_VPhone.setVisible(true);
                Vector v = new Vector();
                String query =  "SELECT AddressPhone\n" +
                                "FROM ADDRESS";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("AddressPhone"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This phone already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_AddAddressPhone.setText("");
                    lbl_VPhone.setVisible(false);
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                JOptionPane.showMessageDialog(this,"Phone can only have numbers !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_AddAddressPhone.setText("");
                lbl_VPhone.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_AddAddressPhoneMouseExited

    private void Validate_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Add
        // TODO add your handling code here:
        if ( !"".equals(txtFld_AddName.getText()) & !"".equals(txtFld_AddMail.getText()) | !"".equals(txtFld_AddAddressLabel.getText()) | !"".equals(txtFld_AddAddressPhone.getText()))
        {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
            if ( result == JOptionPane.OK_OPTION)
            {
                Vector vAdd = new Vector();
                vAdd.add(txtFld_AddAddressLabel.getText());
                vAdd.add(txtFld_AddAddressStreet.getText());
                vAdd.add(txtFld_AddAddressStreet2.getText());
                vAdd.add(txtFld_AddAddressZip.getText());
                vAdd.add(txtFld_AddAddressCity.getText());
                vAdd.add(txtFld_AddAddressCountry.getText());
                vAdd.add(txtFld_AddAddressPhone.getText());

                try {
                    String query = ("Insert into ADDRESS (AddressLabel, AddressStreet, AddressStreet2, AddressZip, AddressCity, AddressCountry, AddressPhone)\n" +
                                    "Values (?,?,?,?,?,?,?)");

                    PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                    int j = 0;
                    for (int i = 1; i <= vAdd.size(); i++)
                    {
                        pstmt.setObject(i, vAdd.get(j));
                        j++;
                    }
                    pstmt.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                try { 
                    
                    String query =  "SELECT addressId\n" +
                                    "FROM Address\n" +
                                    "WHERE addressPhone = '" + txtFld_AddAddressPhone.getText() + "'"; 
                    Statement stmt = con.connectURL().createStatement();
                    ResultSet rs = stmt.executeQuery(query);
                    rs.next();
                    addressId = rs.getLong("AddressId");
                    
                } catch (SQLException ex) {
                    Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                Vector v = new Vector();
                v.add(addressId);
                v.add(txtFld_AddName.getText());
                v.add(txtFld_AddMail.getText());
                v.add(txtFld_AddContactname.getText());
                v.add(txtArea_AddNote.getText());

                try {
                    String query = ("Insert into PUBLISHER (AddressId, PublisherName, PublisherMail, PublisherContactName, PublisherNote)\n" +
                                    "Values (?,?,?,?,?)");

                    PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                    int j = 0;
                    for (int i = 1; i <= v.size(); i++)
                    {
                        pstmt.setObject(i, v.get(j));
                        j++;
                    }
                    pstmt.executeUpdate();
                    
                    Vector v2 = new Vector();
                    String query2 = "SELECT p.PublisherId, PublisherName, PublisherMail, PublisherContactName, StatusTypeLabel\n" +
                                    "FROM PUBLISHER p\n" +
                                    "LEFT JOIN SETPUBLISHER sp\n" +
                                    "ON sp.PublisherId = p.PublisherId\n" +
                                    "LEFT JOIN STATUSTYPE st\n" +
                                    "ON sp.StatusTypeId = st.StatusTypeId\n" +
                                    "WHERE PublisherName = '" + txtFld_AddName.getText() +"'";
                    Statement stmt = con.connectURL().createStatement();
                    ResultSet rs2 = stmt.executeQuery(query2);
                    while(rs2.next())
                    {
                        v2.add(rs2.getLong("PublisherId"));
                        v2.add(rs2.getString("PublisherName"));   
                        v2.add(rs2.getString("PublisherMail"));
                        v2.add(rs2.getString("PublisherContactName"));
                        v2.add(rs2.getString("StatusTypeLabel"));
                    } 
                    Statement stmt2 = con.connectURL().createStatement();
                    stmt2.executeUpdate("INSERT INTO SETPUBLISHER (StatusTypeId, PublisherId)\n" +
                                        "VALUES ( 8 , " + v2.get(0).toString() + ")");
                    ((DefaultTableModel)tbl_Attributes.getModel()).addRow(v2);
                    ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(publi.getDataRowPubli(), publi.getDataColumnPubli());
                } catch (SQLException ex) {
                    Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this,"Add is complete !","Confirmation !", JOptionPane.INFORMATION_MESSAGE);
                panel_Add.setVisible(false);
                panel_Consult.setVisible(true);
                
            }
            else if ( result == JOptionPane.CANCEL_OPTION)
            {
                JOptionPane.showMessageDialog(this,"Addition canceled !","Cancellation !", JOptionPane.INFORMATION_MESSAGE);
                txtFld_AddName.setText("");
                txtFld_AddMail.setText("");
                txtFld_AddContactname.setText("");
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
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Missing data !","Warning !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Validate_Add

    private void Back_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Add
        // TODO add your handling code here:
        txtFld_AddName.setText("");
        txtFld_AddMail.setText("");
        txtFld_AddContactname.setText("");
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
    }//GEN-LAST:event_Back_Add

    private void Select_Publisher(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_Publisher
        // TODO add your handling code here:
        try {
            vInfo = new Vector();
            ligneSelectionne = tbl_Attributes.getSelectedRow();
            String s = tbl_Attributes.getValueAt(ligneSelectionne, 0).toString();
            String query =  "SELECT PublisherId, PublisherName, PublisherMail, PublisherContactName, PublisherNote\n" +
                            ",p.AddressId, AddressLabel, AddressStreet, AddressStreet2, AddressZip, AddressCity, AddressCountry, AddressPhone\n" +
                            "FROM PUBLISHER p\n" +
                            "LEFT JOIN ADDRESS ad\n" +
                            "ON p.AddressId = ad.AddressId\n" +
                            "WHERE PublisherId = '" + s + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                vInfo.add(rs.getLong("PublisherId"));
                vInfo.add(rs.getString("PublisherName"));
                vInfo.add(rs.getString("PublisherMail"));
                vInfo.add(rs.getString("PublisherContactName"));
                vInfo.add(rs.getString("PublisherNote"));
                vInfo.add(rs.getLong("AddressId"));
                vInfo.add(rs.getString("AddressLabel"));
                vInfo.add(rs.getString("AddressStreet"));
                vInfo.add(rs.getString("AddressStreet2"));
                vInfo.add(rs.getString("AddressZip"));
                vInfo.add(rs.getString("AddressCity"));
                vInfo.add(rs.getString("AddressCountry"));
                vInfo.add(rs.getString("AddressPhone"));
            }
            
            b = vInfo.get(1).toString();
            ((DefaultTableModel)tbl_Book.getModel()).setDataVector(publi.getDataRowBook(b), publi.getDataColumnBook());
            
            try {
                query = "SELECT StatusTypeId\n" +
                        "FROM SetPublisher\n" +
                        "WHERE PublisherId = '" + vInfo.get(0).toString() + "'";
                stmt = con.connectURL().createStatement();
                rs = stmt.executeQuery(query);
                Vector vType = new Vector();
                while(rs.next())
                {
                    vType.add(rs.getLong("StatusTypeId"));
                }               
                tglBtn_PublisherStatus.setEnabled(true);
                if ("8".equals(vType.get(0).toString()))
                {
                    tglBtn_PublisherStatus.setSelected(false);
                    tglBtn_PublisherStatus.setText("Disabled");
                }
                else
                {
                    tglBtn_PublisherStatus.setSelected(true);
                    tglBtn_PublisherStatus.setText("Enabled");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if ( vInfo.get(2) == null | vInfo.get(2) == "")lbl_InfoMail2.setText(""); else lbl_InfoMail2.setText(vInfo.get(2).toString()); lbl_InfoMail6.setText(vInfo.get(2).toString()); 
            if ( vInfo.get(3) == null | vInfo.get(3) == "")lbl_InfoContactname2.setText(""); else lbl_InfoContactname2.setText(vInfo.get(3).toString()); lbl_InfoContactname6.setText(vInfo.get(3).toString());
            if ( vInfo.get(4) == null | vInfo.get(4) == "")txtArea_Note.setText(""); else txtArea_Note.setText(vInfo.get(4).toString());
            if ( vInfo.get(6) == null | vInfo.get(6) == "")lbl_InfoLabel1.setText(""); else lbl_InfoLabel1.setText(vInfo.get(6).toString());
            if ( vInfo.get(7) == null | vInfo.get(7) == "")lbl_InfoStreet1.setText(""); else lbl_InfoStreet1.setText(vInfo.get(7).toString());
            if ( vInfo.get(8) == null | vInfo.get(8) == "")lbl_InfoStreet21.setText(""); else lbl_InfoStreet21.setText(vInfo.get(8).toString());
            if ( vInfo.get(9) == null | vInfo.get(9) == "")lbl_InfoZip1.setText(""); else lbl_InfoZip1.setText(vInfo.get(9).toString());
            if ( vInfo.get(10) == null | vInfo.get(10) == "")lbl_InfoCity1.setText(""); else lbl_InfoCity1.setText(vInfo.get(10).toString());
            if ( vInfo.get(11) == null | vInfo.get(11) == "")lbl_InfoCountry1.setText(""); else lbl_InfoCountry1.setText(vInfo.get(11).toString());
            if ( vInfo.get(12) == null | vInfo.get(12) == "")lbl_InfoPhone1.setText(""); else lbl_InfoPhone1.setText(vInfo.get(12).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Select_Publisher

    private void Delete_Publisher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Publisher
        // TODO add your handling code here:
        if(vInfo != null)
        {
            try {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
                if ( result == JOptionPane.OK_OPTION)
                {
                    String s = vInfo.get(0).toString();
                    String query = "DELETE FROM SETPUBLISHER\n" +
                                    "WHERE PublisherId = '" + s + "'";
                    PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                    pstmt.executeUpdate();
                    String query2 =  "DELETE FROM PUBLISHER\n" +
                                    "WHERE PublisherId = '" + s + "'";
                    PreparedStatement pstmt2 = con.connectURL().prepareStatement(query2);
                    pstmt2.executeUpdate();
                    ((DefaultTableModel)tbl_Attributes.getModel()).removeRow(ligneSelectionne);
                    lbl_InfoMail2.setText("");
                    lbl_InfoContactname2.setText("");
                    txtArea_Note.setText("");
                    lbl_InfoLabel1.setText("");
                    lbl_InfoStreet1.setText("");
                    lbl_InfoStreet21.setText("");
                    lbl_InfoZip1.setText("");
                    lbl_InfoCity1.setText("");
                    lbl_InfoCountry1.setText(""); 
                    lbl_InfoPhone1.setText("");
                    vInfo = null;
                    JOptionPane.showMessageDialog(this,"Delete complete !","Delete !", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You have to select a Publisher","No publisher found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Delete_Publisher

    private void Edit_Publisher(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Publisher
        // TODO add your handling code here:
        lbl_VName1.setVisible(false);
        lbl_VContactname1.setVisible(false);
        lbl_VMail1.setVisible(false);
        if(vInfo != null)
        {
            panel_Add.setVisible(false);
            panel_Consult.setVisible(false);
            panel_Edit.setVisible(true);
            if ( vInfo.get(1) == null | vInfo.get(1) == "")txtFld_EditName.setText(""); else txtFld_EditName.setText(vInfo.get(1).toString());
            if ( vInfo.get(2) == null | vInfo.get(2) == "")txtFld_EditMail.setText(""); else txtFld_EditMail.setText(vInfo.get(2).toString());
            if ( vInfo.get(3) == null | vInfo.get(3) == "")txtFld_EditContactname.setText(""); else txtFld_EditContactname.setText(vInfo.get(3).toString());
            if ( vInfo.get(4) == null | vInfo.get(4) == "")txtArea_EditNote.setText(""); else txtArea_EditNote.setText(vInfo.get(4).toString());
            if ( vInfo.get(6) == null | vInfo.get(6) == "")txtFld_EditAddressLabel.setText(""); else txtFld_EditAddressLabel.setText(vInfo.get(6).toString());
            if ( vInfo.get(7) == null | vInfo.get(7) == "")txtFld_EditAddressStreet.setText(""); else txtFld_EditAddressStreet.setText(vInfo.get(7).toString());
            if ( vInfo.get(8) == null | vInfo.get(8) == "")txtFld_EditAddressStreet2.setText(""); else txtFld_EditAddressStreet2.setText(vInfo.get(8).toString());
            if ( vInfo.get(9) == null | vInfo.get(9) == "")txtFld_EditAddressZip.setText(""); else txtFld_EditAddressZip.setText(vInfo.get(9).toString());
            if ( vInfo.get(10) == null | vInfo.get(10) == "")txtFld_EditAddressCity.setText(""); else txtFld_EditAddressCity.setText(vInfo.get(10).toString());
            if ( vInfo.get(11) == null | vInfo.get(11) == "")txtFld_EditAddressCountry.setText(""); else txtFld_EditAddressCountry.setText(vInfo.get(11).toString());
            if ( vInfo.get(12) == null | vInfo.get(12) == "")txtFld_EditAddressPhone.setText(""); else txtFld_EditAddressPhone.setText(vInfo.get(12).toString());
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You have to select a publisher","No Publisher found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Edit_Publisher

    private void txtFld_EditNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditNameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditName.getText();
            if (s.matches("^[a-zA-Z0-9 ]+(-[a-zA-Z0-9 ]+)?$"))
            {
                Vector v = new Vector();
                String query =  "SELECT PublisherName\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherName"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if( v.get(i).toString().equals(s)) p++;
                }
                for (int i = 0 ; i < v.size(); i++)
                {
                    if (vInfo.get(1).toString().equals(s)) p = 0;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This publisher name already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_EditName.setText(vInfo.get(1).toString());
                    lbl_VName1.setVisible(false);
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                lbl_VName1.setVisible(false);
                JOptionPane.showMessageDialog(this,"Publisher name error !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_EditName.setText(vInfo.get(1).toString());
            }
            else
            {
                lbl_VName1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_EditNameMouseExited

    private void txtFld_EditMailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditMailMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditMail.getText();
            if (s.matches("[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-zA-Z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?.)+[a-zA-Z0-9](?:[a-zA-Z0-9-]*[a-zA-Z0-9])?"))
            {
                Vector v = new Vector();
                String query =  "SELECT PublisherMail\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherMail"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if( v.get(i).toString().equals(s)) p++;
                }
                for (int i = 0 ; i < v.size(); i++)
                {
                    if (vInfo.get(2).toString().equals(s)) p = 0;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This publisher mail already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_EditMail.setText(vInfo.get(2).toString());
                    lbl_VMail1.setVisible(false);
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                lbl_VMail1.setVisible(false);
                JOptionPane.showMessageDialog(this,"Publisher mail is not good !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_EditMail.setText(vInfo.get(2).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_EditMailMouseExited

    private void txtFld_EditContactnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditContactnameMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditContactname.getText();
            if (s.matches("^[a-zA-Z0-9 ]+(-[a-zA-Z0-9 ]+)?$"))
            {
                Vector v = new Vector();
                String query =  "SELECT PublisherContactName\n" +
                                "FROM PUBLISHER";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("PublisherContactName"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if( v.get(i).toString().equals(s)) p++;
                }
                for (int i = 0 ; i < v.size(); i++)
                {
                    if (vInfo.get(3).toString().equals(s)) p = 0;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This publisher contact name already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_EditContactname.setText(vInfo.get(3).toString());
                    lbl_VContactname1.setVisible(false);
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                lbl_VContactname1.setVisible(false);
                JOptionPane.showMessageDialog(this,"Publisher contact name error !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_EditContactname.setText(vInfo.get(3).toString());
            }
            else
            {
                lbl_VContactname1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_EditContactnameMouseExited

    private void txtFld_EditAddressLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressLabelMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressLabel.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the label","Label Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressLabel.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressLabelMouseExited

    private void txtFld_EditAddressStreetMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressStreetMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressStreet.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the street","Street Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressStreet.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressStreetMouseExited

    private void txtFld_EditAddressStreet2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressStreet2MouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressStreet2.getText();
        if (s.matches("^[a-zA-Z0-9\\\\. ]+(-[a-zA-Z0-9\\\\. ]+)?$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the street 2","Street2 Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressStreet2.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressStreet2MouseExited

    private void txtFld_EditAddressZipMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressZipMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressZip.getText();
        if (s.matches("^(([0-8][0-9])|(9[0-5])|(2[ab]))[0-9]{3}$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the zip code","Zip Code Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressZip.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressZipMouseExited

    private void txtFld_EditAddressCityMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressCityMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressCity.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the city","City Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressCity.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressCityMouseExited

    private void txtFld_EditAddressCountryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressCountryMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditAddressCountry.getText();
        if (s.matches("^[a-zA-Z ]+(-[a-zA-Z ]+)?$") | "".equals(s))
        {
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the country","Country Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditAddressCountry.setText("");
        }
    }//GEN-LAST:event_txtFld_EditAddressCountryMouseExited

    private void txtFld_EditAddressPhoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditAddressPhoneMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditAddressPhone.getText();
            if (s.matches("^[+]*[(]{0,1}[0-9]{1,4}[)]{0,1}[-\\s\\./0-9]*$"))
            {
                Vector v = new Vector();
                String query =  "SELECT AddressPhone\n" +
                                "FROM ADDRESS";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("AddressPhone"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if( v.get(i).toString().equals(s)) p++;
                }
                for (int i = 0 ; i < v.size(); i++)
                {
                    if (vInfo.get(12).toString().equals(s)) p = 0;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This phone already exists !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_EditAddressPhone.setText(vInfo.get(12).toString());
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                JOptionPane.showMessageDialog(this,"Phone can only have numbers !","Publisher Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_EditAddressPhone.setText(vInfo.get(12).toString());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_EditAddressPhoneMouseExited

    private void Validate_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Edit
        // TODO add your handling code here:
        try {
        String s = vInfo.get(0).toString();
        String a = vInfo.get(5).toString();
        int r = 0;
        if(vInfo.get(2) == null) vInfo.set(2, "");
        if(vInfo.get(3)==null) vInfo.set(3, "");
        if(vInfo.get(4)==null) vInfo.set(4, "");
        if(vInfo.get(6)==null) vInfo.set(6, "");
        if(vInfo.get(8)==null) vInfo.set(8, "");
        
        if (vInfo.get(1).toString() == null ? txtFld_EditName.getText() == null : vInfo.get(1).toString().equals(txtFld_EditName.getText()))
        {
            if (vInfo.get(2).toString() == null ? txtFld_EditMail.getText() == null : vInfo.get(2).toString().equals(txtFld_EditMail.getText()))
            {
                if (vInfo.get(3).toString() == null ? txtFld_EditContactname.getText() == null : vInfo.get(3).toString().equals(txtFld_EditContactname.getText()))
                {
                    if (vInfo.get(4).toString() == null ? txtArea_EditNote.getText() == null : vInfo.get(4).toString().equals(txtArea_EditNote.getText()))
                    {
                        if (vInfo.get(6).toString() == null ? txtFld_EditAddressLabel.getText() == null : vInfo.get(6).toString().equals(txtFld_EditAddressLabel.getText()))
                        {
                            if (vInfo.get(7).toString() == null ? txtFld_EditAddressStreet.getText() == null : vInfo.get(7).toString().equals(txtFld_EditAddressStreet.getText()))
                            {
                                if (vInfo.get(8).toString() == null ? txtFld_EditAddressStreet2.getText() == null : vInfo.get(8).toString().equals(txtFld_EditAddressStreet2.getText()))
                                {
                                    if (vInfo.get(9).toString() == null ? txtFld_EditAddressZip.getText() == null : vInfo.get(9).toString().equals(txtFld_EditAddressZip.getText()))
                                    {
                                        if (vInfo.get(10).toString() == null ? txtFld_EditAddressCity.getText() == null : vInfo.get(10).toString().equals(txtFld_EditAddressCity.getText()))
                                        {
                                            if (vInfo.get(11).toString() == null ? txtFld_EditAddressCountry.getText() == null : vInfo.get(11).toString().equals(txtFld_EditAddressCountry.getText()))
                                            {
                                                if (vInfo.get(12).toString() == null ? txtFld_EditAddressPhone.getText() == null : vInfo.get(12).toString().equals(txtFld_EditAddressPhone.getText()))
                                                {
                                                    JOptionPane.showMessageDialog(this,"There's no edit !","Edit !", JOptionPane.WARNING_MESSAGE);  
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
        if (r == 0)
        {
            if ( txtFld_EditName.getText().isEmpty() |
                 txtFld_EditMail.getText().isEmpty() |
                 txtFld_EditContactname.getText().isEmpty() |
                 txtFld_EditAddressStreet.getText().isEmpty() |
                 txtFld_EditAddressZip.getText().isEmpty() |
                 txtFld_EditAddressCity.getText().isEmpty()|
                 txtFld_EditAddressCountry.getText().isEmpty()|
                 txtFld_EditAddressPhone.getText().isEmpty())
                { 
                    JOptionPane.showMessageDialog(this,"Missing Data !","Edit !", JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,JOptionPane.ERROR_MESSAGE);
                if ( result == JOptionPane.OK_OPTION)
                {
                    if (vInfo.get(1).toString() == null ? txtFld_EditName.getText() != null : !vInfo.get(1).toString().equals(txtFld_EditName.getText()))
                    {
                        String query =  "UPDATE PUBLISHER\n" +
                                        "SET PublisherName = '" + txtFld_EditName.getText() + "'\n" +
                                        "WHERE PublisherId = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(1, txtFld_EditName.getText());
                    
                    }
                    if (vInfo.get(2).toString() == null ? txtFld_EditMail.getText() != null : !vInfo.get(2).toString().equals(txtFld_EditMail.getText()))
                    {
                        String query =  "UPDATE PUBLISHER\n" +
                                        "SET PublisherMail = '" + txtFld_EditMail.getText() + "'\n" +
                                        "WHERE PublisherId = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(2, txtFld_EditMail.getText());
                        lbl_InfoMail2.setText(txtFld_EditMail.getText());
                    }
                    if (vInfo.get(3).toString() == null ? txtFld_EditContactname.getText() != null : !vInfo.get(3).toString().equals(txtFld_EditContactname.getText()))
                    {
                        String query =  "UPDATE PUBLISHER\n" +
                                        "SET PublisherContactName = '" + txtFld_EditContactname.getText() + "'\n" +
                                        "WHERE PublisherId = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(3, txtFld_EditContactname.getText());
                        lbl_InfoContactname2.setText(txtFld_EditContactname.getText());
                    }
                    if (vInfo.get(4).toString() == null ? txtArea_EditNote.getText() != null : !vInfo.get(4).toString().equals(txtArea_EditNote.getText()))
                    {
                        String query =  "UPDATE PUBLISHER\n" +
                                        "SET PublisherNote = '" + txtArea_EditNote.getText() + "'\n" +
                                        "WHERE PublisherId = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(4, txtArea_EditNote.getText());
                        txtArea_Note.setText(txtArea_EditNote.getText());
                    }
                    if (vInfo.get(6).toString() == null ? txtFld_EditAddressLabel.getText() != null : !vInfo.get(6).toString().equals(txtFld_EditAddressLabel.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressLabel = '" + txtFld_EditAddressLabel.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(6, txtFld_EditAddressLabel.getText());
                        lbl_InfoLabel1.setText(txtFld_EditAddressLabel.getText());
                    }
                    if (vInfo.get(7).toString() == null ? txtFld_EditAddressStreet.getText() != null : !vInfo.get(7).toString().equals(txtFld_EditAddressStreet.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressStreet = '" + txtFld_EditAddressStreet.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(7, txtFld_EditAddressStreet.getText());
                        lbl_InfoStreet1.setText(txtFld_EditAddressStreet.getText());
                     }
                    if (vInfo.get(8).toString() == null ? txtFld_EditAddressStreet2.getText() != null : !vInfo.get(8).toString().equals(txtFld_EditAddressStreet2.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressStreet2 = '" + txtFld_EditAddressStreet2.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(8, txtFld_EditAddressStreet2.getText());
                        lbl_InfoStreet21.setText(txtFld_EditAddressStreet2.getText());
                     }
                    if (vInfo.get(9).toString() == null ? txtFld_EditAddressZip.getText() != null : !vInfo.get(9).toString().equals(txtFld_EditAddressZip.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressZip = '" + txtFld_EditAddressZip.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(9, txtFld_EditAddressZip.getText());
                        lbl_InfoZip1.setText(txtFld_EditAddressZip.getText());
                    }
                    if (vInfo.get(10).toString() == null ? txtFld_EditAddressCity.getText() != null : !vInfo.get(10).toString().equals(txtFld_EditAddressCity.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressCity = '" + txtFld_EditAddressCity.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(10, txtFld_EditAddressCity.getText());
                        lbl_InfoCity1.setText(txtFld_EditAddressCity.getText());
                    }
                    if (vInfo.get(11).toString() == null ? txtFld_EditAddressCountry.getText() != null : !vInfo.get(11).toString().equals(txtFld_EditAddressCountry.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressCountry = '" + txtFld_EditAddressCountry.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(11, txtFld_EditAddressCountry.getText());
                        lbl_InfoCountry1.setText(txtFld_EditAddressCountry.getText());
                    }
                    if (vInfo.get(12).toString() == null ? txtFld_EditAddressPhone.getText() != null : !vInfo.get(12).toString().equals(txtFld_EditAddressPhone.getText()))
                    {
                        String query =  "UPDATE ADDRESS\n" +
                                        "SET AddressPhone = '" + txtFld_EditAddressPhone.getText() + "'\n" +
                                        "WHERE AddressId = '" + a + "'";
                        PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(12, txtFld_EditAddressPhone.getText());
                        lbl_InfoPhone1.setText(txtFld_EditAddressPhone.getText());
                    }
                    panel_Edit.setVisible(false);
                    panel_Consult.setVisible(true);
                    ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(publi.getDataRowPubli(), publi.getDataColumnPubli());
                    tbl_Attributes.getSelectionModel().setSelectionInterval(ligneSelectionne, ligneSelectionne);
                    JOptionPane.showMessageDialog(this,"Edit complete !","Edit !", JOptionPane.INFORMATION_MESSAGE);
                 }
                }
        }
        } catch (SQLException ex) {
                Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Validate_Edit

    private void Back_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Edit
        // TODO add your handling code here:
        panel_Add.setVisible(false);
        panel_Edit.setVisible(false);
        panel_Consult.setVisible(true);
    }//GEN-LAST:event_Back_Edit

    private void Publisher_Status(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Publisher_Status
        // TODO add your handling code here:
        boolean selected = tglBtn_PublisherStatus.getModel().isSelected();
        try {
            
            String query =  "SELECT StatusTypeId\n" +
                            "FROM SetPublisher\n" +
                            "WHERE PublisherId = '" + vInfo.get(0).toString() + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Vector vType = new Vector();
            while(rs.next())
            {
                vType.add(rs.getLong("StatusTypeId"));
            }   
            if ( selected == true)
            {
                query =  "UPDATE SetPublisher\n" +
                         "SET StatusTypeId = 7\n" +
                         "WHERE PublisherId = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(publi.getDataRowPubli(), publi.getDataColumnPubli());
                tglBtn_PublisherStatus.setText("Enable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(ligneSelectionne, ligneSelectionne);
            }
            else if ( selected == false)
            {
                query =  "UPDATE SetPublisher\n" +
                         "SET StatusTypeId = 8\n" +
                         "WHERE PublisherId = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(publi.getDataRowPubli(), publi.getDataColumnPubli());
                tglBtn_PublisherStatus.setText("Disable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(ligneSelectionne, ligneSelectionne);
            }
            } catch (SQLException ex) {
                Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Publisher_Status

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_Add;
    private javax.swing.JPanel Down;
    private javax.swing.JPanel Down2;
    private javax.swing.JPanel Down3;
    private javax.swing.JPanel Left_SideBar;
    private javax.swing.JPanel Left_SideBar2;
    private javax.swing.JPanel Left_SideBar3;
    private javax.swing.JPanel LeftsideDown2;
    private javax.swing.JPanel LeftsideDown3;
    private javax.swing.JPanel LeftsideDown4;
    private javax.swing.JPanel LeftsideUp2;
    private javax.swing.JPanel LeftsideUp3;
    private javax.swing.JPanel LeftsideUp4;
    private javax.swing.JPanel Right_SideBar;
    private javax.swing.JPanel Right_SideBar2;
    private javax.swing.JPanel Right_SideBar3;
    private javax.swing.JPanel Rightside2;
    private javax.swing.JPanel Rightside3;
    private javax.swing.JPanel Rightside4;
    private javax.swing.JPanel Up;
    private javax.swing.JPanel Up2;
    private javax.swing.JPanel Up3;
    private javax.swing.JButton Validate_Add;
    private javax.swing.JButton btn_AddPublisher;
    private javax.swing.JButton btn_BackEdit;
    private javax.swing.JButton btn_DeletePublisher;
    private javax.swing.JButton btn_Details2;
    private javax.swing.JButton btn_Details3;
    private javax.swing.JButton btn_Details4;
    private javax.swing.JButton btn_EditPublisher;
    private javax.swing.JButton btn_EditPublisher2;
    private javax.swing.JButton btn_EditPublisher3;
    private javax.swing.JButton btn_ValidateEdit;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_Author2;
    private javax.swing.JLabel lbl_Author3;
    private javax.swing.JLabel lbl_City;
    private javax.swing.JLabel lbl_City1;
    private javax.swing.JLabel lbl_Contactname;
    private javax.swing.JLabel lbl_Contactname1;
    private javax.swing.JLabel lbl_Country;
    private javax.swing.JLabel lbl_Country1;
    private javax.swing.JLabel lbl_InfoCity;
    private javax.swing.JLabel lbl_InfoCity1;
    private javax.swing.JLabel lbl_InfoContactname;
    private javax.swing.JLabel lbl_InfoContactname2;
    private javax.swing.JLabel lbl_InfoContactname3;
    private javax.swing.JLabel lbl_InfoContactname4;
    private javax.swing.JLabel lbl_InfoContactname5;
    private javax.swing.JLabel lbl_InfoContactname6;
    private javax.swing.JLabel lbl_InfoCountry;
    private javax.swing.JLabel lbl_InfoCountry1;
    private javax.swing.JLabel lbl_InfoLabel;
    private javax.swing.JLabel lbl_InfoLabel1;
    private javax.swing.JLabel lbl_InfoMail;
    private javax.swing.JLabel lbl_InfoMail2;
    private javax.swing.JLabel lbl_InfoMail3;
    private javax.swing.JLabel lbl_InfoMail4;
    private javax.swing.JLabel lbl_InfoMail5;
    private javax.swing.JLabel lbl_InfoMail6;
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
    private javax.swing.JLabel lbl_Mail;
    private javax.swing.JLabel lbl_Mail1;
    private javax.swing.JLabel lbl_Name;
    private javax.swing.JLabel lbl_Name1;
    private javax.swing.JLabel lbl_Phone;
    private javax.swing.JLabel lbl_Phone1;
    private javax.swing.JLabel lbl_Publisher2;
    private javax.swing.JLabel lbl_Publisher3;
    private javax.swing.JLabel lbl_Research;
    private javax.swing.JLabel lbl_Status1;
    private javax.swing.JLabel lbl_Stree1;
    private javax.swing.JLabel lbl_Street;
    private javax.swing.JLabel lbl_Street2;
    private javax.swing.JLabel lbl_Street21;
    private javax.swing.JLabel lbl_TitleAttributes1;
    private javax.swing.JLabel lbl_TitleComments1;
    private javax.swing.JLabel lbl_TitleInfos2;
    private javax.swing.JLabel lbl_TitleInfos3;
    private javax.swing.JLabel lbl_TitleInfos4;
    private javax.swing.JLabel lbl_TitleManagePublisher;
    private javax.swing.JLabel lbl_TitleManagePublisher2;
    private javax.swing.JLabel lbl_TitleManagePublisher3;
    private javax.swing.JLabel lbl_TitleNote2;
    private javax.swing.JLabel lbl_TitleNote3;
    private javax.swing.JLabel lbl_TitleNote4;
    private javax.swing.JLabel lbl_TitleOrder2;
    private javax.swing.JLabel lbl_TitleOrder3;
    private javax.swing.JLabel lbl_TitleOrder4;
    private javax.swing.JLabel lbl_TitlePublisher;
    private javax.swing.JLabel lbl_TotalTitle;
    private javax.swing.JLabel lbl_TotalTitle2;
    private javax.swing.JLabel lbl_TotalTitle3;
    private javax.swing.JLabel lbl_TotalValue;
    private javax.swing.JLabel lbl_TotalValue2;
    private javax.swing.JLabel lbl_TotalValue3;
    private javax.swing.JLabel lbl_VCity;
    private javax.swing.JLabel lbl_VContactname;
    private javax.swing.JLabel lbl_VContactname1;
    private javax.swing.JLabel lbl_VCountry;
    private javax.swing.JLabel lbl_VLabel;
    private javax.swing.JLabel lbl_VMail;
    private javax.swing.JLabel lbl_VMail1;
    private javax.swing.JLabel lbl_VName;
    private javax.swing.JLabel lbl_VName1;
    private javax.swing.JLabel lbl_VPhone;
    private javax.swing.JLabel lbl_VStreet;
    private javax.swing.JLabel lbl_VStreet2;
    private javax.swing.JLabel lbl_VZip;
    private javax.swing.JLabel lbl_Zip;
    private javax.swing.JLabel lbl_Zip1;
    private javax.swing.JScrollPane panel_Add;
    private javax.swing.JPanel panel_Add1;
    private javax.swing.JScrollPane panel_Consult;
    private javax.swing.JPanel panel_Consult1;
    private javax.swing.JPanel panel_Delivery2;
    private javax.swing.JScrollPane panel_Edit;
    private javax.swing.JPanel panel_Edit1;
    private javax.swing.JPanel panel_Shipping6;
    private javax.swing.JPanel panel_Shipping7;
    private javax.swing.JScrollPane scrBar_Attributes1;
    private javax.swing.JScrollPane scrBar_Comments1;
    private javax.swing.JScrollPane scrBar_Note2;
    private javax.swing.JScrollPane scrBar_Note3;
    private javax.swing.JScrollPane scrBar_Note4;
    private javax.swing.JSeparator sep_Attirbutes1;
    private javax.swing.JSeparator sep_Comments2;
    private javax.swing.JSeparator sep_Comments3;
    private javax.swing.JSeparator sep_Comments4;
    private javax.swing.JSeparator sep_Customer2;
    private javax.swing.JSeparator sep_Customer3;
    private javax.swing.JSeparator sep_Customer4;
    private javax.swing.JSeparator sep_Infos2;
    private javax.swing.JSeparator sep_Infos3;
    private javax.swing.JSeparator sep_Infos4;
    private javax.swing.JSeparator sep_Note2;
    private javax.swing.JSeparator sep_Note3;
    private javax.swing.JSeparator sep_Note4;
    private javax.swing.JSeparator sep_Order2;
    private javax.swing.JSeparator sep_Order3;
    private javax.swing.JSeparator sep_Order4;
    private javax.swing.JTabbedPane tabPan_Address5;
    private javax.swing.JTabbedPane tabPan_Address6;
    private javax.swing.JTabbedPane tabPan_Address7;
    private javax.swing.JTable tbl_Attributes;
    private javax.swing.JTable tbl_Book;
    private javax.swing.JToggleButton tglBtn_PublisherStatus;
    private javax.swing.JTextArea txtArea_AddNote;
    private javax.swing.JTextArea txtArea_EditNote;
    private javax.swing.JTextArea txtArea_Note;
    private javax.swing.JTextField txtFld_AddAddressCity;
    private javax.swing.JTextField txtFld_AddAddressCountry;
    private javax.swing.JTextField txtFld_AddAddressLabel;
    private javax.swing.JTextField txtFld_AddAddressPhone;
    private javax.swing.JTextField txtFld_AddAddressStreet;
    private javax.swing.JTextField txtFld_AddAddressStreet2;
    private javax.swing.JTextField txtFld_AddAddressZip;
    private javax.swing.JTextField txtFld_AddContactname;
    private javax.swing.JTextField txtFld_AddMail;
    private javax.swing.JTextField txtFld_AddName;
    private javax.swing.JTextField txtFld_EditAddressCity;
    private javax.swing.JTextField txtFld_EditAddressCountry;
    private javax.swing.JTextField txtFld_EditAddressLabel;
    private javax.swing.JTextField txtFld_EditAddressPhone;
    private javax.swing.JTextField txtFld_EditAddressStreet;
    private javax.swing.JTextField txtFld_EditAddressStreet2;
    private javax.swing.JTextField txtFld_EditAddressZip;
    private javax.swing.JTextField txtFld_EditContactname;
    private javax.swing.JTextField txtFld_EditMail;
    private javax.swing.JTextField txtFld_EditName;
    private javax.swing.JTextField txtFld_Research;
    private javax.swing.JTextField txtFld_Research3;
    // End of variables declaration//GEN-END:variables
}
