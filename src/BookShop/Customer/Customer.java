
package BookShop.Customer;

import BookShop.Class.Address;
import BookShop.Methods.*;
import BookShop.Methods.FilterJtable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;

public class Customer extends javax.swing.JPanel {
    GetConnection connect = new GetConnection();
    Long valueSelected;
    
    JoinsCustomer joinCusto = new JoinsCustomer();
    JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
    FilterJtable fjt = new FilterJtable();
    ComboBox cmb = new ComboBox();
    

    public Customer() {
        initComponents();

    }
    
    /// INIT JTables /// CUSTOMERS
    private DefaultTableModel initTableCusto() {
        tbl_Customers.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(joinCusto.getDataRowCusto(), joinCusto.getDataColumnCusto()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    /// INIT JTables /// TRANSPORTERS
    private DefaultTableModel initTableAddress() {
        tbl_Addresses.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(joinCusto.getDataRowAddress(), joinCusto.getDataColumnAddress()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    /// INIT JTables /// ORDERS by CUSTOMERS
    private DefaultTableModel initTableOrderCusto() {
        JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
        tbl_OrderCusto.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(joinSelecCusto.getDataRowOrderCusto(valueSelected), joinSelecCusto.getDataColumnOrderCusto()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    /// INIT JTables /// ORDERS by CUSTOMERS
    private DefaultTableModel initTableCommentCusto() {
        JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
        tbl_CommentCusto.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(joinSelecCusto.getDataRowCommentCusto(valueSelected), joinSelecCusto.getDataColumnCommentCusto()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    /// INIT ComboBoxes ///
    // Status Type
    private DefaultComboBoxModel initCmbBoxStatus () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxStatus());
    }
    
    // Social Title
    private DefaultComboBoxModel initCmbBoxSocial () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxSocial());
    }
    
    // City
    private DefaultComboBoxModel initCmbBoxCustoCity () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxCity());
    }

    // Country
    private DefaultComboBoxModel initCmbBoxCustoCountry () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxCountry());
    }
    
    // Customer shipping addresses
    private DefaultComboBoxModel initCmbBoxShippingAddress () {
        return new DefaultComboBoxModel(getDataComboBoxShipping());
    }
    
    // Customer delivery addresses
    private DefaultComboBoxModel initCmbBoxDeliveryAddress () {
        return new DefaultComboBoxModel(getDataComboBoxDelivery());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGp_SocialTitle = new javax.swing.ButtonGroup();
        panel_Resume = new javax.swing.JPanel();
        resume_Up = new javax.swing.JPanel();
        lbl_TitleResumeCustomer = new javax.swing.JLabel();
        Resume_Customers = new javax.swing.JPanel();
        lbl_TitleCustomer1 = new javax.swing.JLabel();
        btn_AddCustomer = new javax.swing.JButton();
        sep_Customers = new javax.swing.JSeparator();
        scrBar_Customers = new javax.swing.JScrollPane();
        tbl_Customers = new javax.swing.JTable();
        txtFld_SearchCustoId = new javax.swing.JTextField();
        txtFld_SearchCustoLastname = new javax.swing.JTextField();
        txtFld_SearchCustoFirstname = new javax.swing.JTextField();
        txtFld_SearchCustoMail = new javax.swing.JTextField();
        btn_SearchCusto = new javax.swing.JButton();
        cmbBox_SearchCustoSocialTitle = new javax.swing.JComboBox();
        cmbBox_SearchCustoStatus = new javax.swing.JComboBox();
        Resume_Addresses = new javax.swing.JPanel();
        lbl_TitleAddresses = new javax.swing.JLabel();
        sep_Adresses = new javax.swing.JSeparator();
        scrBar_Addresses = new javax.swing.JScrollPane();
        tbl_Addresses = new javax.swing.JTable();
        btn_SearchAddress = new javax.swing.JButton();
        txtFld_SearchAddressId = new javax.swing.JTextField();
        txtFld_SearchAddressLastname = new javax.swing.JTextField();
        txtFld_SearchAddressFirstname = new javax.swing.JTextField();
        txtFld_SearchAddressStreet = new javax.swing.JTextField();
        txtFld_SearchAddressZip = new javax.swing.JTextField();
        cmbBox_SearchAddressCity = new javax.swing.JComboBox();
        cmbBox_SearchAddressCountry = new javax.swing.JComboBox();
        txtFld_SearchAddressPhone = new javax.swing.JTextField();
        cmbBox_SearchAddressStatus = new javax.swing.JComboBox();
        panel_Details = new javax.swing.JPanel();
        details_Up = new javax.swing.JPanel();
        lbl_TitleManageCustomer = new javax.swing.JLabel();
        btn_BackResume = new javax.swing.JButton();
        details_Left_SideBar = new javax.swing.JPanel();
        lbl_TitleAttributes = new javax.swing.JLabel();
        btn_EditCustomer = new javax.swing.JButton();
        sep_Attributes = new javax.swing.JSeparator();
        lbl_TitleComments = new javax.swing.JLabel();
        scrBar_Comments = new javax.swing.JScrollPane();
        tbl_CommentCusto = new javax.swing.JTable();
        sep_Comments = new javax.swing.JSeparator();
        custoAttributes = new javax.swing.JPanel();
        AvatarM_Icon = new javax.swing.JLabel();
        AvatarF_Icon1 = new javax.swing.JLabel();
        lbl_SocialTitleCusto = new javax.swing.JLabel();
        rBtn_Mrs = new javax.swing.JRadioButton();
        rBtn_Mr = new javax.swing.JRadioButton();
        lbl_LastnameCusto = new javax.swing.JLabel();
        txtFld_LastnameCusto = new javax.swing.JTextField();
        lbl_FirstnameCusto = new javax.swing.JLabel();
        txtFld_FirstnameCusto = new javax.swing.JTextField();
        lbl_MailCusto = new javax.swing.JLabel();
        txtFld_MailCusto = new javax.swing.JTextField();
        lbl_BitrhdateCusto = new javax.swing.JLabel();
        txtFld_BirthdateCusto = new javax.swing.JTextField();
        btn_CancelEditAttribute = new javax.swing.JButton();
        btn_SaveAttributes = new javax.swing.JButton();
        sep_Comments1 = new javax.swing.JSeparator();
        lbl_TitleComments1 = new javax.swing.JLabel();
        scrBar_Comments1 = new javax.swing.JScrollPane();
        tbl_OrderCusto = new javax.swing.JTable();
        details_Right_SideBar = new javax.swing.JPanel();
        LeftsideUp = new javax.swing.JPanel();
        lbl_TitleInfos = new javax.swing.JLabel();
        sep_Infos = new javax.swing.JSeparator();
        lbl_RegistrationTitle = new javax.swing.JLabel();
        lbl_RegistrationValue = new javax.swing.JLabel();
        lbl_Status = new javax.swing.JLabel();
        tglBtn_CustomerEnable = new javax.swing.JToggleButton();
        lbl_StatusValue = new javax.swing.JLabel();
        Rightside = new javax.swing.JPanel();
        lbl_TitleNote = new javax.swing.JLabel();
        btn_EditNote = new javax.swing.JButton();
        sep_Note = new javax.swing.JSeparator();
        scrBar_Note = new javax.swing.JScrollPane();
        txtArea_Note = new javax.swing.JTextArea();
        btn_CancelEditNote = new javax.swing.JButton();
        btn_SaveNote = new javax.swing.JButton();
        LeftsideDown = new javax.swing.JPanel();
        lbl_TitleOrder = new javax.swing.JLabel();
        sep_Order = new javax.swing.JSeparator();
        lbl_TotalTitle = new javax.swing.JLabel();
        lbl_TotalValue = new javax.swing.JLabel();
        details_Down = new javax.swing.JPanel();
        tabPan_Address = new javax.swing.JTabbedPane();
        panel_Shipping = new javax.swing.JPanel();
        cmbBox_ShippingAddress = new javax.swing.JComboBox();
        btn_EditShipping = new javax.swing.JButton();
        btn_CancelEditShipping = new javax.swing.JButton();
        btn_SaveShipping = new javax.swing.JButton();
        lbl_ShippingAddressPhone = new javax.swing.JLabel();
        txtFld_ShippingAddressPhone = new javax.swing.JTextField();
        txtFld_ShippingAddressLabel = new javax.swing.JTextField();
        lbl_ShippingAddressLabel = new javax.swing.JLabel();
        lbl_ShippingAddressCompany = new javax.swing.JLabel();
        txtFld_ShippingAddressCompany = new javax.swing.JTextField();
        lbl_ShippingAddressStreet = new javax.swing.JLabel();
        txtFld_ShippingAddressStreet = new javax.swing.JTextField();
        txtFld_ShippingAddressCountry = new javax.swing.JTextField();
        lbl_ShippingAddressCountry = new javax.swing.JLabel();
        lbl_ShippingAddressCity = new javax.swing.JLabel();
        txtFld_ShippingAddressCity = new javax.swing.JTextField();
        txtFld_ShippingAddressZip = new javax.swing.JTextField();
        lbl_ShippingAddressZip = new javax.swing.JLabel();
        lbl_ShippingAddressStreet2 = new javax.swing.JLabel();
        txtFld_ShippingAddressStreet2 = new javax.swing.JTextField();
        lbl_ShippingAddressNote = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArea_ShippingAddressNote = new javax.swing.JTextArea();
        panel_Delivery = new javax.swing.JPanel();
        btn_SaveDeliv = new javax.swing.JButton();
        btn_CancelEditDeliv = new javax.swing.JButton();
        btn_EditDeliv = new javax.swing.JButton();
        cmbBox_DeliveryAddress = new javax.swing.JComboBox();
        txtFld_DeliveryAddressCountry = new javax.swing.JTextField();
        lbl_DeliveryAddressCountry = new javax.swing.JLabel();
        lbl_DeliveryAddressCity = new javax.swing.JLabel();
        lbl_DeliveryAddressPhone = new javax.swing.JLabel();
        txtFld_DeliveryAddressCity = new javax.swing.JTextField();
        txtFld_DeliveryAddressPhone = new javax.swing.JTextField();
        txtFld_DeliveryAddressZip = new javax.swing.JTextField();
        txtFld_DeliveryAddressLabel = new javax.swing.JTextField();
        lbl_DeliveryAddressZip = new javax.swing.JLabel();
        lbl_DeliveryAddressLabel = new javax.swing.JLabel();
        lbl_DeliveryAddressStreet2 = new javax.swing.JLabel();
        lbl_DeliveryAddressCompany = new javax.swing.JLabel();
        txtFld_DeliveryAddressStreet2 = new javax.swing.JTextField();
        txtFld_DeliveryAddressCompany = new javax.swing.JTextField();
        lbl_DeliveryAddressStreet = new javax.swing.JLabel();
        txtFld_DeliveryAddressStreet = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtArea_DeliveryAddressNote = new javax.swing.JTextArea();
        lbl_DeliveryAddressNote = new javax.swing.JLabel();
        panel_Create = new javax.swing.JPanel();
        create_Up = new javax.swing.JPanel();
        lbl_TitleCreateCustomer = new javax.swing.JLabel();
        btn_BackResume2 = new javax.swing.JButton();
        create_Middle = new javax.swing.JPanel();
        txtFld_CreateMailCusto = new javax.swing.JTextField();
        lbl_CreateLastnameCusto = new javax.swing.JLabel();
        lbl_CreatePasswordCusto = new javax.swing.JLabel();
        lbl_CreateMailCusto = new javax.swing.JLabel();
        txtFld_CreateLastnameCusto = new javax.swing.JTextField();
        rBtn_CreateMr = new javax.swing.JRadioButton();
        lbl_SocialTitleCusto1 = new javax.swing.JLabel();
        lbl_CreateFirstnameCusto = new javax.swing.JLabel();
        rBtn_CreateMrs = new javax.swing.JRadioButton();
        txtFld_CreateFirstnameCusto = new javax.swing.JTextField();
        txtFld_CreatePasswordeCusto = new javax.swing.JTextField();
        txtFld_CreateAddressLabel = new javax.swing.JTextField();
        lbl_CreateAddressLabel = new javax.swing.JLabel();
        lbl_CreateAddressCompany = new javax.swing.JLabel();
        txtFld_CreateAddressCompany = new javax.swing.JTextField();
        lbl_CreateAddressStreet = new javax.swing.JLabel();
        txtFld_CreateAddressStreet = new javax.swing.JTextField();
        lbl_TitleAttributes1 = new javax.swing.JLabel();
        sep_Attributes1 = new javax.swing.JSeparator();
        sep_Attributes2 = new javax.swing.JSeparator();
        lbl_TitleAttributes2 = new javax.swing.JLabel();
        txtFld_CreateAddressCountry = new javax.swing.JTextField();
        lbl_CreateAddressCountry = new javax.swing.JLabel();
        lbl_CreateAddressCity = new javax.swing.JLabel();
        txtFld_CreateAddressCity = new javax.swing.JTextField();
        txtFld_CreateAddressZip = new javax.swing.JTextField();
        lbl_CreateAddressZip = new javax.swing.JLabel();
        lbl_CreateAddressStreet2 = new javax.swing.JLabel();
        txtFld_CreateAddressStreet2 = new javax.swing.JTextField();
        lbl_CreateAddressPhone = new javax.swing.JLabel();
        txtFld_CreateAddressPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_CreateAddressNote = new javax.swing.JTextArea();
        lbl_CreateAddressNote = new javax.swing.JLabel();
        lbl_CreateBitrhdateCusto = new javax.swing.JLabel();
        txtFld_CreateBitrhdateCusto = new javax.swing.JTextField();
        lbl_CreateStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_CancelEdiCreate = new javax.swing.JButton();
        btn_SaveCreate = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.CardLayout());

        panel_Resume.setBackground(new java.awt.Color(242, 242, 242));
        panel_Resume.setPreferredSize(new java.awt.Dimension(1153, 1434));

        resume_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleResumeCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleResumeCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleResumeCustomer.setText("RESUME CUSTOMERS");

        javax.swing.GroupLayout resume_UpLayout = new javax.swing.GroupLayout(resume_Up);
        resume_Up.setLayout(resume_UpLayout);
        resume_UpLayout.setHorizontalGroup(
            resume_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resume_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleResumeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(610, Short.MAX_VALUE))
        );
        resume_UpLayout.setVerticalGroup(
            resume_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resume_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleResumeCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Resume_Customers.setBackground(new java.awt.Color(255, 255, 255));
        Resume_Customers.setMinimumSize(new java.awt.Dimension(150, 30));

        lbl_TitleCustomer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_TitleCustomer1.setText("Customers");

        btn_AddCustomer.setBackground(new java.awt.Color(160, 181, 213));
        btn_AddCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AddCustomer.setText("ADD");
        btn_AddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddCustomerActionPerformed(evt);
            }
        });

        tbl_Customers.setAutoCreateRowSorter(true);
        tbl_Customers.setModel(initTableCusto());
        tbl_Customers.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Customers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_Customers.setGridColor(new java.awt.Color(197, 203, 214));
        tbl_Customers.setRowHeight(30);
        tbl_Customers.setSelectionBackground(new java.awt.Color(176, 190, 214));
        tbl_Customers.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Customers.setShowVerticalLines(false);
        tbl_Customers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CustomersMouseClicked(evt);
            }
        });
        scrBar_Customers.setViewportView(tbl_Customers);

        txtFld_SearchCustoId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchCustoId.setMaximumSize(null);
        txtFld_SearchCustoId.setMinimumSize(new java.awt.Dimension(150, 30));

        txtFld_SearchCustoLastname.setMaximumSize(null);
        txtFld_SearchCustoLastname.setMinimumSize(new java.awt.Dimension(150, 30));

        txtFld_SearchCustoFirstname.setMaximumSize(null);
        txtFld_SearchCustoFirstname.setMinimumSize(new java.awt.Dimension(150, 30));

        txtFld_SearchCustoMail.setMaximumSize(null);
        txtFld_SearchCustoMail.setMinimumSize(new java.awt.Dimension(150, 30));

        btn_SearchCusto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Search_16px.png"))); // NOI18N
        btn_SearchCusto.setMinimumSize(new java.awt.Dimension(49, 30));

        cmbBox_SearchCustoSocialTitle.setModel(initCmbBoxSocial());
        cmbBox_SearchCustoSocialTitle.setMaximumSize(null);
        cmbBox_SearchCustoSocialTitle.setMinimumSize(new java.awt.Dimension(150, 30));
        cmbBox_SearchCustoSocialTitle.setPreferredSize(null);

        cmbBox_SearchCustoStatus.setModel(initCmbBoxStatus());
        cmbBox_SearchCustoStatus.setMaximumSize(null);
        cmbBox_SearchCustoStatus.setMinimumSize(new java.awt.Dimension(150, 30));
        cmbBox_SearchCustoStatus.setPreferredSize(null);

        Resume_Addresses.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleAddresses.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        lbl_TitleAddresses.setText("Addresses");

        tbl_Addresses.setAutoCreateRowSorter(true);
        tbl_Addresses.setModel(initTableAddress());
        tbl_Addresses.setGridColor(new java.awt.Color(197, 203, 214));
        tbl_Addresses.setRowHeight(30);
        tbl_Addresses.setSelectionBackground(new java.awt.Color(176, 190, 214));
        tbl_Addresses.setShowVerticalLines(false);
        tbl_Addresses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_AddressesMouseClicked(evt);
            }
        });
        scrBar_Addresses.setViewportView(tbl_Addresses);

        btn_SearchAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Search_16px.png"))); // NOI18N
        btn_SearchAddress.setMinimumSize(new java.awt.Dimension(49, 30));

        txtFld_SearchAddressId.setMaximumSize(null);
        txtFld_SearchAddressId.setMinimumSize(new java.awt.Dimension(109, 30));

        txtFld_SearchAddressLastname.setMaximumSize(null);
        txtFld_SearchAddressLastname.setMinimumSize(new java.awt.Dimension(109, 30));

        txtFld_SearchAddressFirstname.setMaximumSize(null);
        txtFld_SearchAddressFirstname.setMinimumSize(new java.awt.Dimension(109, 30));

        txtFld_SearchAddressStreet.setMaximumSize(null);
        txtFld_SearchAddressStreet.setMinimumSize(new java.awt.Dimension(109, 30));

        txtFld_SearchAddressZip.setMaximumSize(null);
        txtFld_SearchAddressZip.setMinimumSize(new java.awt.Dimension(109, 30));

        cmbBox_SearchAddressCity.setModel(initCmbBoxCustoCity());
        cmbBox_SearchAddressCity.setMaximumSize(null);
        cmbBox_SearchAddressCity.setMinimumSize(new java.awt.Dimension(109, 30));
        cmbBox_SearchAddressCity.setPreferredSize(null);

        cmbBox_SearchAddressCountry.setModel(initCmbBoxCustoCountry());
        cmbBox_SearchAddressCountry.setMaximumSize(null);
        cmbBox_SearchAddressCountry.setMinimumSize(new java.awt.Dimension(109, 30));
        cmbBox_SearchAddressCountry.setPreferredSize(null);

        txtFld_SearchAddressPhone.setMaximumSize(null);
        txtFld_SearchAddressPhone.setMinimumSize(new java.awt.Dimension(109, 30));

        cmbBox_SearchAddressStatus.setModel(initCmbBoxStatus());
        cmbBox_SearchAddressStatus.setMaximumSize(null);
        cmbBox_SearchAddressStatus.setMinimumSize(new java.awt.Dimension(109, 30));
        cmbBox_SearchAddressStatus.setPreferredSize(null);

        javax.swing.GroupLayout Resume_AddressesLayout = new javax.swing.GroupLayout(Resume_Addresses);
        Resume_Addresses.setLayout(Resume_AddressesLayout);
        Resume_AddressesLayout.setHorizontalGroup(
            Resume_AddressesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_AddressesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Resume_AddressesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrBar_Addresses)
                    .addComponent(sep_Adresses)
                    .addGroup(Resume_AddressesLayout.createSequentialGroup()
                        .addComponent(lbl_TitleAddresses, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Resume_AddressesLayout.createSequentialGroup()
                        .addComponent(txtFld_SearchAddressId, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchAddressLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchAddressFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchAddressStreet, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchAddressZip, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchAddressCity, 0, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchAddressCountry, 0, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchAddressPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchAddressStatus, 0, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_SearchAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Resume_AddressesLayout.setVerticalGroup(
            Resume_AddressesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_AddressesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleAddresses)
                .addGap(0, 0, 0)
                .addComponent(sep_Adresses, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Resume_AddressesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Resume_AddressesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(txtFld_SearchAddressId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchAddressLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchAddressFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchAddressStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_SearchAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrBar_Addresses, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Resume_CustomersLayout = new javax.swing.GroupLayout(Resume_Customers);
        Resume_Customers.setLayout(Resume_CustomersLayout);
        Resume_CustomersLayout.setHorizontalGroup(
            Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_CustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrBar_Customers)
                    .addComponent(sep_Customers)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Resume_CustomersLayout.createSequentialGroup()
                        .addComponent(txtFld_SearchCustoId, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBox_SearchCustoSocialTitle, 0, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFld_SearchCustoLastname, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFld_SearchCustoFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFld_SearchCustoMail, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBox_SearchCustoStatus, 0, 168, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_SearchCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(Resume_CustomersLayout.createSequentialGroup()
                        .addComponent(lbl_TitleCustomer1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(Resume_Addresses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Resume_CustomersLayout.setVerticalGroup(
            Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_CustomersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitleCustomer1)
                    .addComponent(btn_AddCustomer))
                .addComponent(sep_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Resume_CustomersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        .addComponent(txtFld_SearchCustoId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchCustoSocialTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchCustoLastname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchCustoFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchCustoMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchCustoStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_SearchCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrBar_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(Resume_Addresses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout panel_ResumeLayout = new javax.swing.GroupLayout(panel_Resume);
        panel_Resume.setLayout(panel_ResumeLayout);
        panel_ResumeLayout.setHorizontalGroup(
            panel_ResumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Resume_Customers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ResumeLayout.setVerticalGroup(
            panel_ResumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ResumeLayout.createSequentialGroup()
                .addComponent(resume_Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resume_Customers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(panel_Resume, "card3");

        panel_Details.setBackground(new java.awt.Color(242, 242, 242));

        details_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageCustomer.setText("MANAGE CUSTOMER");

        btn_BackResume.setBackground(new java.awt.Color(160, 181, 213));
        btn_BackResume.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_BackResume.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Previous_page_32px_1.png"))); // NOI18N
        btn_BackResume.setText("BACK");
        btn_BackResume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackResumeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout details_UpLayout = new javax.swing.GroupLayout(details_Up);
        details_Up.setLayout(details_UpLayout);
        details_UpLayout.setHorizontalGroup(
            details_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_BackResume, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        details_UpLayout.setVerticalGroup(
            details_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(details_UpLayout.createSequentialGroup()
                        .addComponent(btn_BackResume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(lbl_TitleManageCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        details_Left_SideBar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleAttributes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes.setText("Attributes");

        btn_EditCustomer.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditCustomer.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditCustomer.setText("EDIT");
        btn_EditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditCustomerActionPerformed(evt);
            }
        });

        lbl_TitleComments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Comment_32px.png"))); // NOI18N
        lbl_TitleComments.setText("Comments");

        scrBar_Comments.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbl_CommentCusto.setModel(initTableCommentCusto());
        tbl_CommentCusto.setGridColor(new java.awt.Color(176, 190, 214));
        tbl_CommentCusto.setRowHeight(30);
        tbl_CommentCusto.setSelectionBackground(new java.awt.Color(176, 190, 214));
        tbl_CommentCusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CommentCustoMouseClicked(evt);
            }
        });
        scrBar_Comments.setViewportView(tbl_CommentCusto);

        custoAttributes.setBackground(new java.awt.Color(242, 242, 242));
        custoAttributes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AvatarM_Icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvatarM_Icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/AvatarM_Icon_149px.png"))); // NOI18N
        custoAttributes.add(AvatarM_Icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 180));

        AvatarF_Icon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AvatarF_Icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/AvatarF_Icon_149px.png"))); // NOI18N
        custoAttributes.add(AvatarF_Icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 180));

        lbl_SocialTitleCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_SocialTitleCusto.setText("Social title:");
        custoAttributes.add(lbl_SocialTitleCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 39, 100, -1));

        rBtn_Mrs.setBackground(new java.awt.Color(242, 242, 242));
        btnGp_SocialTitle.add(rBtn_Mrs);
        rBtn_Mrs.setText("Mrs.");
        rBtn_Mrs.setEnabled(false);
        custoAttributes.add(rBtn_Mrs, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 39, -1, 14));

        rBtn_Mr.setBackground(new java.awt.Color(242, 242, 242));
        btnGp_SocialTitle.add(rBtn_Mr);
        rBtn_Mr.setText("Mr.");
        rBtn_Mr.setEnabled(false);
        custoAttributes.add(rBtn_Mr, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 39, -1, 14));

        lbl_LastnameCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_LastnameCusto.setText("Lastname:");
        custoAttributes.add(lbl_LastnameCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 67, 100, -1));

        txtFld_LastnameCusto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_LastnameCusto.setEnabled(false);
        custoAttributes.add(txtFld_LastnameCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 64, 270, -1));

        lbl_FirstnameCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_FirstnameCusto.setText("Firstname:");
        custoAttributes.add(lbl_FirstnameCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 98, 100, -1));

        txtFld_FirstnameCusto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_FirstnameCusto.setEnabled(false);
        custoAttributes.add(txtFld_FirstnameCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 95, 270, -1));

        lbl_MailCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_MailCusto.setText("Email:");
        custoAttributes.add(lbl_MailCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 129, 100, -1));

        txtFld_MailCusto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_MailCusto.setEnabled(false);
        custoAttributes.add(txtFld_MailCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 126, 270, -1));

        lbl_BitrhdateCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_BitrhdateCusto.setText("Birthdate:");
        custoAttributes.add(lbl_BitrhdateCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 160, 100, -1));

        txtFld_BirthdateCusto.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_BirthdateCusto.setEnabled(false);
        custoAttributes.add(txtFld_BirthdateCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 157, 270, -1));

        btn_CancelEditAttribute.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditAttribute.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditAttribute.setText("CANCEL");
        btn_CancelEditAttribute.setEnabled(false);

        btn_SaveAttributes.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveAttributes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveAttributes.setText("SAVE");
        btn_SaveAttributes.setEnabled(false);

        lbl_TitleComments1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleComments1.setText("Orders");

        scrBar_Comments1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbl_OrderCusto.setModel(initTableOrderCusto());
        tbl_OrderCusto.setGridColor(new java.awt.Color(176, 190, 214));
        tbl_OrderCusto.setRowHeight(30);
        tbl_OrderCusto.setSelectionBackground(new java.awt.Color(176, 190, 214));
        tbl_OrderCusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_OrderCustoMouseClicked(evt);
            }
        });
        scrBar_Comments1.setViewportView(tbl_OrderCusto);

        javax.swing.GroupLayout details_Left_SideBarLayout = new javax.swing.GroupLayout(details_Left_SideBar);
        details_Left_SideBar.setLayout(details_Left_SideBarLayout);
        details_Left_SideBarLayout.setHorizontalGroup(
            details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                .addGroup(details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                                .addComponent(lbl_TitleAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CancelEditAttribute)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_SaveAttributes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_EditCustomer))
                            .addComponent(sep_Attributes)))
                    .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(custoAttributes, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
                    .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrBar_Comments, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Comments)
                            .addComponent(scrBar_Comments1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Comments1)
                            .addComponent(lbl_TitleComments)
                            .addComponent(lbl_TitleComments1))))
                .addContainerGap())
        );
        details_Left_SideBarLayout.setVerticalGroup(
            details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_TitleAttributes)
                    .addGroup(details_Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CancelEditAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SaveAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_EditCustomer))
                .addGap(7, 7, 7)
                .addComponent(sep_Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(custoAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lbl_TitleComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrBar_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lbl_TitleComments1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrBar_Comments1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        details_Right_SideBar.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos.setText("Infos");

        lbl_RegistrationTitle.setText("Account registration date: ");

        lbl_RegistrationValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_Status.setText("Status:");

        tglBtn_CustomerEnable.setText("ON/OFF");

        javax.swing.GroupLayout LeftsideUpLayout = new javax.swing.GroupLayout(LeftsideUp);
        LeftsideUp.setLayout(LeftsideUpLayout);
        LeftsideUpLayout.setHorizontalGroup(
            LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUpLayout.createSequentialGroup()
                        .addComponent(lbl_RegistrationTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_RegistrationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideUpLayout.createSequentialGroup()
                        .addComponent(sep_Infos)
                        .addContainerGap())
                    .addGroup(LeftsideUpLayout.createSequentialGroup()
                        .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUpLayout.createSequentialGroup()
                                .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_StatusValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUpLayout.createSequentialGroup()
                                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_TitleInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tglBtn_CustomerEnable))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        LeftsideUpLayout.setVerticalGroup(
            LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_RegistrationTitle)
                    .addComponent(lbl_RegistrationValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_Status)
                    .addComponent(lbl_StatusValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tglBtn_CustomerEnable)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote.setText("Note");

        btn_EditNote.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditNote.setText("EDIT");
        btn_EditNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditNoteActionPerformed(evt);
            }
        });

        scrBar_Note.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Note.setColumns(20);
        txtArea_Note.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        txtArea_Note.setLineWrap(true);
        txtArea_Note.setRows(5);
        txtArea_Note.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtArea_Note.setEnabled(false);
        scrBar_Note.setViewportView(txtArea_Note);

        btn_CancelEditNote.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditNote.setText("CANCEL");
        btn_CancelEditNote.setEnabled(false);

        btn_SaveNote.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveNote.setText("SAVE");
        btn_SaveNote.setEnabled(false);

        javax.swing.GroupLayout RightsideLayout = new javax.swing.GroupLayout(Rightside);
        Rightside.setLayout(RightsideLayout);
        RightsideLayout.setHorizontalGroup(
            RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Note)
                    .addGroup(RightsideLayout.createSequentialGroup()
                        .addComponent(lbl_TitleNote, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_CancelEditNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SaveNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EditNote))
                    .addComponent(scrBar_Note))
                .addContainerGap())
        );
        RightsideLayout.setVerticalGroup(
            RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_TitleNote)
                    .addGroup(RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CancelEditNote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SaveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_EditNote))
                .addComponent(sep_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note)
                .addContainerGap())
        );

        LeftsideDown.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder.setText("Orders");

        lbl_TotalTitle.setText("Total spent since registration:");

        lbl_TotalValue.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_TotalValue.setText("200€");

        javax.swing.GroupLayout LeftsideDownLayout = new javax.swing.GroupLayout(LeftsideDown);
        LeftsideDown.setLayout(LeftsideDownLayout);
        LeftsideDownLayout.setHorizontalGroup(
            LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDownLayout.createSequentialGroup()
                .addGroup(LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDownLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_TotalTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDownLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sep_Order)
                            .addGroup(LeftsideDownLayout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addGap(3, 3, 3))
        );
        LeftsideDownLayout.setVerticalGroup(
            LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleOrder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Order, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TotalValue, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotalTitle))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout details_Right_SideBarLayout = new javax.swing.GroupLayout(details_Right_SideBar);
        details_Right_SideBar.setLayout(details_Right_SideBarLayout);
        details_Right_SideBarLayout.setHorizontalGroup(
            details_Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_Right_SideBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(details_Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rightside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        details_Right_SideBarLayout.setVerticalGroup(
            details_Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_Right_SideBarLayout.createSequentialGroup()
                .addGroup(details_Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Rightside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, details_Right_SideBarLayout.createSequentialGroup()
                        .addComponent(LeftsideUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LeftsideDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        details_Down.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping.setBackground(new java.awt.Color(255, 255, 255));

        cmbBox_ShippingAddress.setModel(initCmbBoxShippingAddress());
        cmbBox_ShippingAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_ShippingAddressActionPerformed(evt);
            }
        });

        btn_EditShipping.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditShipping.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditShipping.setText("EDIT");
        btn_EditShipping.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditShippingActionPerformed(evt);
            }
        });

        btn_CancelEditShipping.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditShipping.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditShipping.setText("CANCEL");
        btn_CancelEditShipping.setEnabled(false);

        btn_SaveShipping.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveShipping.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveShipping.setText("SAVE");
        btn_SaveShipping.setEnabled(false);

        lbl_ShippingAddressPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressPhone.setText("Phone number:");

        txtFld_ShippingAddressPhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressPhone.setEnabled(false);

        txtFld_ShippingAddressLabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressLabel.setEnabled(false);

        lbl_ShippingAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressLabel.setText("Address alias:");

        lbl_ShippingAddressCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressCompany.setText("Company:");

        txtFld_ShippingAddressCompany.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressCompany.setEnabled(false);

        lbl_ShippingAddressStreet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressStreet.setText("Address:");

        txtFld_ShippingAddressStreet.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressStreet.setEnabled(false);

        txtFld_ShippingAddressCountry.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressCountry.setEnabled(false);

        lbl_ShippingAddressCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressCountry.setText("Country:");

        lbl_ShippingAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressCity.setText("City:");

        txtFld_ShippingAddressCity.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressCity.setEnabled(false);

        txtFld_ShippingAddressZip.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressZip.setEnabled(false);

        lbl_ShippingAddressZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressZip.setText("Zip code:");

        lbl_ShippingAddressStreet2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressStreet2.setText("Address (2):");

        txtFld_ShippingAddressStreet2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ShippingAddressStreet2.setEnabled(false);

        lbl_ShippingAddressNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ShippingAddressNote.setText("Note:");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setEnabled(false);

        txtArea_ShippingAddressNote.setColumns(20);
        txtArea_ShippingAddressNote.setLineWrap(true);
        txtArea_ShippingAddressNote.setRows(5);
        txtArea_ShippingAddressNote.setEnabled(false);
        jScrollPane3.setViewportView(txtArea_ShippingAddressNote);

        javax.swing.GroupLayout panel_ShippingLayout = new javax.swing.GroupLayout(panel_Shipping);
        panel_Shipping.setLayout(panel_ShippingLayout);
        panel_ShippingLayout.setHorizontalGroup(
            panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ShippingLayout.createSequentialGroup()
                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ShippingLayout.createSequentialGroup()
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel_ShippingLayout.createSequentialGroup()
                                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel_ShippingLayout.createSequentialGroup()
                                        .addGap(93, 93, 93)
                                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_ShippingAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_ShippingAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_ShippingAddressZip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_ShippingAddressCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ShippingLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lbl_ShippingAddressPhone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_ShippingAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFld_ShippingAddressCountry)
                                    .addComponent(txtFld_ShippingAddressCity)
                                    .addComponent(txtFld_ShippingAddressZip)
                                    .addComponent(txtFld_ShippingAddressStreet2)
                                    .addComponent(txtFld_ShippingAddressStreet)
                                    .addComponent(txtFld_ShippingAddressPhone, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panel_ShippingLayout.createSequentialGroup()
                                .addGap(0, 95, Short.MAX_VALUE)
                                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panel_ShippingLayout.createSequentialGroup()
                                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_ShippingAddressLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_ShippingAddressCompany, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtFld_ShippingAddressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                            .addComponent(txtFld_ShippingAddressCompany)))
                                    .addGroup(panel_ShippingLayout.createSequentialGroup()
                                        .addComponent(lbl_ShippingAddressNote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ShippingLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cmbBox_ShippingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelEditShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_SaveShipping, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(btn_EditShipping, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panel_ShippingLayout.setVerticalGroup(
            panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ShippingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBox_ShippingAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditShipping, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_SaveShipping)
                .addGap(18, 18, 18)
                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelEditShipping)
                    .addGroup(panel_ShippingLayout.createSequentialGroup()
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFld_ShippingAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShippingAddressLabel))
                        .addGap(10, 10, 10)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFld_ShippingAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShippingAddressCompany))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ShippingAddressStreet)
                            .addComponent(txtFld_ShippingAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFld_ShippingAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShippingAddressStreet2))
                        .addGap(10, 10, 10)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ShippingAddressZip)
                            .addComponent(txtFld_ShippingAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ShippingAddressCity)
                            .addComponent(txtFld_ShippingAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ShippingAddressCountry)
                            .addGroup(panel_ShippingLayout.createSequentialGroup()
                                .addComponent(txtFld_ShippingAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtFld_ShippingAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_ShippingAddressPhone))))))
                .addGap(49, 49, 49)
                .addGroup(panel_ShippingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ShippingAddressNote))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        tabPan_Address.addTab("Shipping address", panel_Shipping);

        panel_Delivery.setBackground(new java.awt.Color(255, 255, 255));

        btn_SaveDeliv.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveDeliv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveDeliv.setText("SAVE");
        btn_SaveDeliv.setEnabled(false);

        btn_CancelEditDeliv.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditDeliv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditDeliv.setText("CANCEL");
        btn_CancelEditDeliv.setEnabled(false);

        btn_EditDeliv.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditDeliv.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditDeliv.setText("EDIT");
        btn_EditDeliv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditDelivActionPerformed(evt);
            }
        });

        cmbBox_DeliveryAddress.setModel(initCmbBoxDeliveryAddress());
        cmbBox_DeliveryAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_DeliveryAddressActionPerformed(evt);
            }
        });

        txtFld_DeliveryAddressCountry.setEditable(false);
        txtFld_DeliveryAddressCountry.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressCountry.setEnabled(false);

        lbl_DeliveryAddressCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressCountry.setText("Country:");

        lbl_DeliveryAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressCity.setText("City:");

        lbl_DeliveryAddressPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressPhone.setText("Phone number:");

        txtFld_DeliveryAddressCity.setEditable(false);
        txtFld_DeliveryAddressCity.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressCity.setEnabled(false);

        txtFld_DeliveryAddressPhone.setEditable(false);
        txtFld_DeliveryAddressPhone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressPhone.setEnabled(false);

        txtFld_DeliveryAddressZip.setEditable(false);
        txtFld_DeliveryAddressZip.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressZip.setEnabled(false);

        txtFld_DeliveryAddressLabel.setEditable(false);
        txtFld_DeliveryAddressLabel.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressLabel.setEnabled(false);

        lbl_DeliveryAddressZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressZip.setText("Zip code:");

        lbl_DeliveryAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressLabel.setText("Address alias:");

        lbl_DeliveryAddressStreet2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressStreet2.setText("Address (2):");

        lbl_DeliveryAddressCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressCompany.setText("Company:");

        txtFld_DeliveryAddressStreet2.setEditable(false);
        txtFld_DeliveryAddressStreet2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressStreet2.setEnabled(false);

        txtFld_DeliveryAddressCompany.setEditable(false);
        txtFld_DeliveryAddressCompany.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressCompany.setEnabled(false);

        lbl_DeliveryAddressStreet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressStreet.setText("Address:");

        txtFld_DeliveryAddressStreet.setEditable(false);
        txtFld_DeliveryAddressStreet.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_DeliveryAddressStreet.setEnabled(false);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setEnabled(false);

        txtArea_DeliveryAddressNote.setColumns(20);
        txtArea_DeliveryAddressNote.setLineWrap(true);
        txtArea_DeliveryAddressNote.setRows(5);
        txtArea_DeliveryAddressNote.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtArea_DeliveryAddressNote.setEnabled(false);
        jScrollPane2.setViewportView(txtArea_DeliveryAddressNote);

        lbl_DeliveryAddressNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_DeliveryAddressNote.setText("Note:");

        javax.swing.GroupLayout panel_DeliveryLayout = new javax.swing.GroupLayout(panel_Delivery);
        panel_Delivery.setLayout(panel_DeliveryLayout);
        panel_DeliveryLayout.setHorizontalGroup(
            panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DeliveryLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DeliveryLayout.createSequentialGroup()
                        .addComponent(cmbBox_DeliveryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_DeliveryLayout.createSequentialGroup()
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                    .addComponent(lbl_DeliveryAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(250, 250, 250))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                            .addComponent(lbl_DeliveryAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(250, 250, 250))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                                    .addComponent(lbl_DeliveryAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(250, 250, 250))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                                        .addComponent(lbl_DeliveryAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtFld_DeliveryAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DeliveryLayout.createSequentialGroup()
                                                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(lbl_DeliveryAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(lbl_DeliveryAddressNote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(10, 10, 10)
                                                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtFld_DeliveryAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(txtFld_DeliveryAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                                .addComponent(lbl_DeliveryAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtFld_DeliveryAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(txtFld_DeliveryAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                        .addComponent(lbl_DeliveryAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtFld_DeliveryAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtFld_DeliveryAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_DeliveryLayout.createSequentialGroup()
                                .addComponent(lbl_DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(txtFld_DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(60, 60, 60)))
                .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelEditDeliv, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn_SaveDeliv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(btn_EditDeliv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18))
        );
        panel_DeliveryLayout.setVerticalGroup(
            panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DeliveryLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbBox_DeliveryAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditDeliv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btn_SaveDeliv)
                .addGap(18, 18, 18)
                .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CancelEditDeliv)
                    .addGroup(panel_DeliveryLayout.createSequentialGroup()
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressLabel)
                            .addComponent(txtFld_DeliveryAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressCompany)
                            .addComponent(txtFld_DeliveryAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressStreet)
                            .addComponent(txtFld_DeliveryAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressStreet2)
                            .addComponent(txtFld_DeliveryAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressZip)
                            .addComponent(txtFld_DeliveryAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressCity)
                            .addComponent(txtFld_DeliveryAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressCountry)
                            .addComponent(txtFld_DeliveryAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_DeliveryAddressPhone)
                            .addComponent(txtFld_DeliveryAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel_DeliveryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_DeliveryAddressNote))
                .addContainerGap(106, Short.MAX_VALUE))
        );

        tabPan_Address.addTab("Delivery address", panel_Delivery);

        javax.swing.GroupLayout details_DownLayout = new javax.swing.GroupLayout(details_Down);
        details_Down.setLayout(details_DownLayout);
        details_DownLayout.setHorizontalGroup(
            details_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        details_DownLayout.setVerticalGroup(
            details_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address))
        );

        tabPan_Address.getAccessibleContext().setAccessibleName("shipping adress");

        javax.swing.GroupLayout panel_DetailsLayout = new javax.swing.GroupLayout(panel_Details);
        panel_Details.setLayout(panel_DetailsLayout);
        panel_DetailsLayout.setHorizontalGroup(
            panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(details_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_DetailsLayout.createSequentialGroup()
                .addComponent(details_Left_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(details_Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(details_Right_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panel_DetailsLayout.setVerticalGroup(
            panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DetailsLayout.createSequentialGroup()
                .addComponent(details_Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DetailsLayout.createSequentialGroup()
                        .addComponent(details_Right_SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(details_Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(details_Left_SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(panel_Details, "card2");

        panel_Create.setBackground(new java.awt.Color(242, 242, 242));

        create_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleCreateCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleCreateCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleCreateCustomer.setText("CREATE CUSTOMER");

        btn_BackResume2.setBackground(new java.awt.Color(160, 181, 213));
        btn_BackResume2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_BackResume2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Previous_page_32px_1.png"))); // NOI18N
        btn_BackResume2.setText("BACK");
        btn_BackResume2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BackResume2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout create_UpLayout = new javax.swing.GroupLayout(create_Up);
        create_Up.setLayout(create_UpLayout);
        create_UpLayout.setHorizontalGroup(
            create_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_BackResume2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        create_UpLayout.setVerticalGroup(
            create_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(create_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleCreateCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BackResume2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        create_Middle.setBackground(new java.awt.Color(255, 255, 255));

        lbl_CreateLastnameCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateLastnameCusto.setText("Lastname:");

        lbl_CreatePasswordCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreatePasswordCusto.setText("Password:");

        lbl_CreateMailCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateMailCusto.setText("Email:");

        rBtn_CreateMr.setBackground(new java.awt.Color(242, 242, 242));
        btnGp_SocialTitle.add(rBtn_CreateMr);
        rBtn_CreateMr.setText("Mr.");

        lbl_SocialTitleCusto1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_SocialTitleCusto1.setText("Social title:");

        lbl_CreateFirstnameCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateFirstnameCusto.setText("Firstname:");

        rBtn_CreateMrs.setBackground(new java.awt.Color(242, 242, 242));
        btnGp_SocialTitle.add(rBtn_CreateMrs);
        rBtn_CreateMrs.setSelected(true);
        rBtn_CreateMrs.setText("Mrs.");

        lbl_CreateAddressLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressLabel.setText("Address alias:");

        lbl_CreateAddressCompany.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressCompany.setText("Company:");

        lbl_CreateAddressStreet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressStreet.setText("Address:");

        lbl_TitleAttributes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes1.setText("Attributes");

        lbl_TitleAttributes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        lbl_TitleAttributes2.setText("Contact Details");

        lbl_CreateAddressCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressCountry.setText("Country:");

        lbl_CreateAddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressCity.setText("City:");

        lbl_CreateAddressZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressZip.setText("Zip code:");

        lbl_CreateAddressStreet2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressStreet2.setText("Address (2):");

        lbl_CreateAddressPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressPhone.setText("Phone number:");

        txtArea_CreateAddressNote.setColumns(20);
        txtArea_CreateAddressNote.setRows(5);
        jScrollPane1.setViewportView(txtArea_CreateAddressNote);

        lbl_CreateAddressNote.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateAddressNote.setText("Note:");

        lbl_CreateBitrhdateCusto.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateBitrhdateCusto.setText("Birthdate:");

        lbl_CreateStatus.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateStatus.setText("Status:");

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        btn_CancelEdiCreate.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEdiCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEdiCreate.setText("CANCEL");

        btn_SaveCreate.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveCreate.setText("SAVE");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_CancelEdiCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_SaveCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CancelEdiCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SaveCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        jComboBox1.setModel(initCmbBoxStatus());

        javax.swing.GroupLayout create_MiddleLayout = new javax.swing.GroupLayout(create_Middle);
        create_Middle.setLayout(create_MiddleLayout);
        create_MiddleLayout.setHorizontalGroup(
            create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitleAttributes2)
                    .addComponent(sep_Attributes2, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TitleAttributes1)
                    .addComponent(sep_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(create_MiddleLayout.createSequentialGroup()
                                .addGap(215, 215, 215)
                                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                        .addComponent(lbl_CreateAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(txtFld_CreateAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(create_MiddleLayout.createSequentialGroup()
                                            .addComponent(lbl_CreateAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(txtFld_CreateAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(create_MiddleLayout.createSequentialGroup()
                                                .addComponent(lbl_CreateAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtFld_CreateAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(create_MiddleLayout.createSequentialGroup()
                                                    .addComponent(lbl_CreateAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(txtFld_CreateAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                                        .addComponent(lbl_CreateAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtFld_CreateAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(create_MiddleLayout.createSequentialGroup()
                                                            .addComponent(lbl_CreateAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(10, 10, 10)
                                                            .addComponent(txtFld_CreateAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(create_MiddleLayout.createSequentialGroup()
                                                                .addComponent(lbl_CreateAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(10, 10, 10)
                                                                .addComponent(txtFld_CreateAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(create_MiddleLayout.createSequentialGroup()
                                                                    .addComponent(lbl_CreateAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(10, 10, 10)
                                                                    .addComponent(txtFld_CreateAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(create_MiddleLayout.createSequentialGroup()
                                                                    .addComponent(lbl_CreateAddressNote, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGap(10, 10, 10)
                                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))))
                            .addGroup(create_MiddleLayout.createSequentialGroup()
                                .addGap(207, 207, 207)
                                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                        .addComponent(lbl_SocialTitleCusto1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(rBtn_CreateMrs)
                                        .addGap(13, 13, 13)
                                        .addComponent(rBtn_CreateMr))
                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(lbl_CreateStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(create_MiddleLayout.createSequentialGroup()
                                            .addComponent(lbl_CreateLastnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(txtFld_CreateLastnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(create_MiddleLayout.createSequentialGroup()
                                                .addComponent(lbl_CreateFirstnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtFld_CreateFirstnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(create_MiddleLayout.createSequentialGroup()
                                                    .addComponent(lbl_CreateMailCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(10, 10, 10)
                                                    .addComponent(txtFld_CreateMailCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                                        .addComponent(lbl_CreatePasswordCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtFld_CreatePasswordeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(create_MiddleLayout.createSequentialGroup()
                                                        .addComponent(lbl_CreateBitrhdateCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(10, 10, 10)
                                                        .addComponent(txtFld_CreateBitrhdateCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        create_MiddleLayout.setVerticalGroup(
            create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lbl_TitleAttributes1)
                .addGap(8, 8, 8)
                .addComponent(sep_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_SocialTitleCusto1)
                    .addComponent(rBtn_CreateMrs, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rBtn_CreateMr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateLastnameCusto)
                    .addComponent(txtFld_CreateLastnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateFirstnameCusto)
                    .addComponent(txtFld_CreateFirstnameCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateMailCusto)
                    .addComponent(txtFld_CreateMailCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreatePasswordCusto)
                    .addComponent(txtFld_CreatePasswordeCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateBitrhdateCusto)
                    .addComponent(txtFld_CreateBitrhdateCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CreateStatus)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_TitleAttributes2)
                .addGap(8, 8, 8)
                .addComponent(sep_Attributes2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressLabel)
                    .addComponent(txtFld_CreateAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressCompany)
                    .addComponent(txtFld_CreateAddressCompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressStreet)
                    .addComponent(txtFld_CreateAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressStreet2)
                    .addComponent(txtFld_CreateAddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressZip)
                    .addComponent(txtFld_CreateAddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressCity)
                    .addComponent(txtFld_CreateAddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressCountry)
                    .addComponent(txtFld_CreateAddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressPhone)
                    .addComponent(txtFld_CreateAddressPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateAddressNote)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout panel_CreateLayout = new javax.swing.GroupLayout(panel_Create);
        panel_Create.setLayout(panel_CreateLayout);
        panel_CreateLayout.setHorizontalGroup(
            panel_CreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CreateLayout.createSequentialGroup()
                .addGroup(panel_CreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(create_Up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(create_Middle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        panel_CreateLayout.setVerticalGroup(
            panel_CreateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CreateLayout.createSequentialGroup()
                .addComponent(create_Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(create_Middle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel_Create, "card4");
    }// </editor-fold>//GEN-END:initComponents
    /// Value of selected row JTable Customers  ///
    private void consultCustomer() {
        int row = tbl_Customers.getSelectedRow();
        String custoSelected = tbl_Customers.getModel().getValueAt(row, 0).toString();
        valueSelected = Long.valueOf(custoSelected);
        JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
        Vector v = joinSelecCusto.getCustoData();
        

        // RadioButton will be selected
        Long socialTitle = Long.valueOf(v.get(1).toString());
        if (socialTitle == 2) {
            rBtn_Mr.setSelected(true);
            AvatarF_Icon1.setVisible(false);
            AvatarM_Icon.setVisible(true);
        } else if (socialTitle == 1){
            rBtn_Mrs.setSelected(true);
            AvatarF_Icon1.setVisible(true);
            AvatarM_Icon.setVisible(false);
        }

        txtFld_LastnameCusto.setText(v.get(2).toString());
        txtFld_FirstnameCusto.setText(v.get(3).toString());
        txtFld_MailCusto.setText(v.get(4).toString());
        txtFld_BirthdateCusto.setText(v.get(5).toString());
        lbl_RegistrationValue.setText(v.get(6).toString());
        lbl_StatusValue.setText(v.get(7).toString());
        txtArea_Note.setText(v.get(8).toString());
 
    }
    
    /// Value of selected row JTable Addresses  ///
    private void consultAddress() {
        int row = tbl_Addresses.getSelectedRow();
        String custoSelected = tbl_Addresses.getModel().getValueAt(row, 0).toString();
        valueSelected = Long.valueOf(custoSelected);
        JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
        Vector v = joinSelecCusto.getAdressCustoInvoiceData();
        
        // set Customer from Address
        // RadioButton will be selected
        Long socialTitle = Long.valueOf(v.get(1).toString());
        if (socialTitle == 2) {
            rBtn_Mr.setSelected(true);
            AvatarF_Icon1.setVisible(false);
            AvatarM_Icon.setVisible(true);
        } else if (socialTitle == 1){
            rBtn_Mrs.setSelected(true);
            AvatarF_Icon1.setVisible(true);
            AvatarM_Icon.setVisible(false);
        }
//        txtFld_LastnameCusto.setText(v.get(2).toString());
//        txtFld_FirstnameCusto.setText(v.get(3).toString());
//        txtFld_MailCusto.setText(v.get(4).toString());
//        txtFld_BirthdateCusto.setText(v.get(5).toString());
//        lbl_RegistrationValue.setText(v.get(6).toString());
//        lbl_StatusValue.setText(v.get(7).toString());
//        txtArea_Note.setText(v.get(8).toString());
        
    }
    
    private void tbl_CustomersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CustomersMouseClicked
        tbl_Addresses.clearSelection();
        
        int columnRef = tbl_Customers.getColumnModel().getColumnIndexAtX(evt.getX());
        int rowRef = evt.getY()/tbl_Customers.getRowHeight();
        if (rowRef < tbl_Customers.getRowCount() && rowRef >= 0 && columnRef < tbl_Customers.getColumnCount() && columnRef >= 0){
            Object value = tbl_Customers.getValueAt(rowRef, columnRef);
            if (value instanceof JButton){
                ((JButton)value).doClick();
                    
                // call the new Pane
                panel_Details.setVisible(true);
                panel_Resume.setVisible(false);

                consultCustomer();
                setValueSelected(valueSelected);
                
                cmbBox_ShippingAddress.setSelectedIndex(0);
                cmbBox_DeliveryAddress.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_tbl_CustomersMouseClicked
    // Init JComboBox Shipping Addresses
    public Vector getDataComboBoxShipping() {
        Vector vector = new Vector();
        
        String query = "select *\n" +
                        "from Address addr\n" +
                        "inner join HasInvoiceAdr inv on (inv.AddressId = addr.AddressId)\n" +
                        //"inner join HasDelivAdr del on (inv.CustomerId = del.AddressId and inv.AddressId = del.CustomerId)\n" +
                        "inner join Customer custo on (custo.CustomerId = inv.CustomerId);";//\n" +
                        //"where (custo.CustomerId = " + valueSelected + ")\n" +
                        //"order by addr.AddressId;";

        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastAddress = null;
                while (rs.next()) {
                    if (lastAddress == null) {
                    vector.add(new Address(
                        rs.getLong("AddressId"),
                        rs.getString("AddressLabel"),
                        rs.getString("AddressCompany"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressStreet2"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressNote")));
                    lastAddress = rs.getLong("CustomerId");
                }
                if (lastAddress == rs.getLong("CustomerId")) {
                    vector.add(new Address(
                        rs.getLong("AddressId"),
                        rs.getString("AddressLabel"),
                        rs.getString("AddressCompany"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressStreet2"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressNote")));
                    lastAddress = rs.getLong("CustomerId");
                }   
            } 
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    } 
    
    // Init JComboBox Shipping Addresses
    public Vector getDataComboBoxDelivery() {
        Vector vector = new Vector();
        
        String query = "select *\n" +
                        "from Address addr\n" +
                        "inner join HasDelivAdr del on (del.AddressId = addr.AddressId)\n" +
                        //"inner join HasDelivAdr del on (inv.CustomerId = del.AddressId and inv.AddressId = del.CustomerId)\n" +
                        "inner join Customer custo on (custo.CustomerId = del.CustomerId);";//\n" +
                        //"where (custo.CustomerId = " + valueSelected + ")\n" +
                        //"order by addr.AddressId;";

        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastAddress = null;
                while (rs.next()) {
                    if (lastAddress == null) {
                    vector.add(new Address(
                        rs.getLong("AddressId"),
                        rs.getString("AddressLabel"),
                        rs.getString("AddressCompany"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressStreet2"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressNote")));
                    lastAddress = rs.getLong("AddressId");
                }
                if (lastAddress != rs.getLong("AddressId")) {
                    vector.add(new Address(
                        rs.getLong("AddressId"),
                        rs.getString("AddressLabel"),
                        rs.getString("AddressCompany"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressStreet2"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressNote")));
                    lastAddress = rs.getLong("AddressId");
                }   
            } 
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    } 
    
    private void tbl_AddressesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_AddressesMouseClicked
        tbl_Customers.clearSelection();
        
        int columnRef = tbl_Addresses.getColumnModel().getColumnIndexAtX(evt.getX());
        int rowRef = evt.getY()/tbl_Addresses.getRowHeight();
        if (rowRef < tbl_Addresses.getRowCount() && rowRef >= 0 && columnRef < tbl_Addresses.getColumnCount() && columnRef >= 0){
            Object value = tbl_Addresses.getValueAt(rowRef, columnRef);
            if (value instanceof JButton){
                ((JButton)value).doClick();
                    
                // call the new Pane
                panel_Details.setVisible(true);
                panel_Resume.setVisible(false);

                consultAddress();
                   
            }
        }
    }//GEN-LAST:event_tbl_AddressesMouseClicked

    private void btn_BackResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackResumeActionPerformed
        panel_Resume.setVisible(true);
        panel_Details.setVisible(false);
        panel_Create.setVisible(false);
        
        tbl_Addresses.clearSelection();
        tbl_CommentCusto.clearSelection();
        tbl_Customers.clearSelection();
        tbl_OrderCusto.clearSelection();
    }//GEN-LAST:event_btn_BackResumeActionPerformed

    private void btn_BackResume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackResume2ActionPerformed
        panel_Resume.setVisible(true);
        panel_Details.setVisible(false);
        panel_Create.setVisible(false);
        
        tbl_Addresses.clearSelection();
        tbl_CommentCusto.clearSelection();
        tbl_Customers.clearSelection();
        tbl_OrderCusto.clearSelection();
    }//GEN-LAST:event_btn_BackResume2ActionPerformed

    private void btn_AddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddCustomerActionPerformed
        panel_Resume.setVisible(false);
        panel_Details.setVisible(false);
        panel_Create.setVisible(true);
    }//GEN-LAST:event_btn_AddCustomerActionPerformed

    private void cmbBox_DeliveryAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_DeliveryAddressActionPerformed
        Address address = (Address) cmbBox_DeliveryAddress.getSelectedItem();
        
        txtFld_DeliveryAddressLabel.setText(address.getAddressLabel());
        txtFld_DeliveryAddressCompany.setText(address.getAddressCompany());
        txtFld_DeliveryAddressStreet.setText(address.getAddressStreet());
        txtFld_DeliveryAddressStreet2.setText(address.getAddressStreet2());
        txtFld_DeliveryAddressZip.setText(address.getAddressZip());
        txtFld_DeliveryAddressCity.setText(address.getAddressCity());
        txtFld_DeliveryAddressCountry.setText(address.getAddressCountry());
        txtFld_DeliveryAddressPhone.setText(address.getAddressPhone());
        txtArea_DeliveryAddressNote.setText(address.getAddressNote());
    }//GEN-LAST:event_cmbBox_DeliveryAddressActionPerformed

    private void btn_EditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditCustomerActionPerformed
        rBtn_Mr.setEnabled(true);
        rBtn_Mrs.setEnabled(true);
        txtFld_LastnameCusto.setEnabled(true);
        txtFld_FirstnameCusto.setEnabled(true);
        txtFld_MailCusto.setEnabled(true);
        txtFld_BirthdateCusto.setEnabled(true);
        
        btn_CancelEditAttribute.setEnabled(true);
        btn_SaveAttributes.setEnabled(true);
    }//GEN-LAST:event_btn_EditCustomerActionPerformed

    private void btn_EditNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditNoteActionPerformed
        txtArea_Note.setEnabled(true);
        
        btn_CancelEditNote.setEnabled(true);
        btn_SaveNote.setEnabled(true);
    }//GEN-LAST:event_btn_EditNoteActionPerformed

    private void btn_EditDelivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditDelivActionPerformed
        txtFld_DeliveryAddressLabel.setEnabled(true);
        txtFld_DeliveryAddressCompany.setEnabled(true);
        txtFld_DeliveryAddressStreet.setEnabled(true);
        txtFld_DeliveryAddressStreet2.setEnabled(true);
        txtFld_DeliveryAddressZip.setEnabled(true);
        txtFld_DeliveryAddressCity.setEnabled(true);
        txtFld_DeliveryAddressCountry.setEnabled(true);
        txtFld_DeliveryAddressPhone.setEnabled(true);
        txtArea_DeliveryAddressNote.setEnabled(true);
        
        btn_CancelEditDeliv.setEnabled(true);
        btn_SaveDeliv.setEnabled(true);
    }//GEN-LAST:event_btn_EditDelivActionPerformed

    private void btn_EditShippingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditShippingActionPerformed
        txtFld_ShippingAddressLabel.setEnabled(true);
        txtFld_ShippingAddressCompany.setEnabled(true);
        txtFld_ShippingAddressStreet.setEnabled(true);
        txtFld_ShippingAddressStreet2.setEnabled(true);
        txtFld_ShippingAddressZip.setEnabled(true);
        txtFld_ShippingAddressCity.setEnabled(true);
        txtFld_ShippingAddressCountry.setEnabled(true);
        txtFld_ShippingAddressPhone.setEnabled(true);
        txtArea_ShippingAddressNote.setEnabled(true);

        btn_CancelEditShipping.setEnabled(true);
        btn_SaveShipping.setEnabled(true);
    }//GEN-LAST:event_btn_EditShippingActionPerformed

    private void cmbBox_ShippingAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_ShippingAddressActionPerformed
        Address address = (Address) cmbBox_ShippingAddress.getSelectedItem();

        txtFld_ShippingAddressLabel.setText(address.getAddressLabel());
        txtFld_ShippingAddressCompany.setText(address.getAddressCompany());
        txtFld_ShippingAddressStreet.setText(address.getAddressStreet());
        txtFld_ShippingAddressStreet2.setText(address.getAddressStreet2());
        txtFld_ShippingAddressZip.setText(address.getAddressZip());
        txtFld_ShippingAddressCity.setText(address.getAddressCity());
        txtFld_ShippingAddressCountry.setText(address.getAddressCountry());
        txtFld_ShippingAddressPhone.setText(address.getAddressPhone());
        txtArea_ShippingAddressNote.setText(address.getAddressNote());
    }//GEN-LAST:event_cmbBox_ShippingAddressActionPerformed

    private void tbl_CommentCustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CommentCustoMouseClicked
       tbl_OrderCusto.clearSelection();
    }//GEN-LAST:event_tbl_CommentCustoMouseClicked

    private void tbl_OrderCustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_OrderCustoMouseClicked
        tbl_CommentCusto.clearSelection();
    }//GEN-LAST:event_tbl_OrderCustoMouseClicked

    public Long getValueSelected() {
        return valueSelected;
    }

    public void setValueSelected(Long valueSelected) {
        this.valueSelected = valueSelected;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvatarF_Icon1;
    private javax.swing.JLabel AvatarM_Icon;
    private javax.swing.JPanel LeftsideDown;
    private javax.swing.JPanel LeftsideUp;
    private javax.swing.JPanel Resume_Addresses;
    private javax.swing.JPanel Resume_Customers;
    private javax.swing.JPanel Rightside;
    private javax.swing.ButtonGroup btnGp_SocialTitle;
    private javax.swing.JButton btn_AddCustomer;
    private javax.swing.JButton btn_BackResume;
    private javax.swing.JButton btn_BackResume2;
    private javax.swing.JButton btn_CancelEdiCreate;
    private javax.swing.JButton btn_CancelEditAttribute;
    private javax.swing.JButton btn_CancelEditDeliv;
    private javax.swing.JButton btn_CancelEditNote;
    private javax.swing.JButton btn_CancelEditShipping;
    private javax.swing.JButton btn_EditCustomer;
    private javax.swing.JButton btn_EditDeliv;
    private javax.swing.JButton btn_EditNote;
    private javax.swing.JButton btn_EditShipping;
    private javax.swing.JButton btn_SaveAttributes;
    private javax.swing.JButton btn_SaveCreate;
    private javax.swing.JButton btn_SaveDeliv;
    private javax.swing.JButton btn_SaveNote;
    private javax.swing.JButton btn_SaveShipping;
    private javax.swing.JButton btn_SearchAddress;
    private javax.swing.JButton btn_SearchCusto;
    private javax.swing.JComboBox cmbBox_DeliveryAddress;
    private javax.swing.JComboBox cmbBox_SearchAddressCity;
    private javax.swing.JComboBox cmbBox_SearchAddressCountry;
    private javax.swing.JComboBox cmbBox_SearchAddressStatus;
    private javax.swing.JComboBox cmbBox_SearchCustoSocialTitle;
    private javax.swing.JComboBox cmbBox_SearchCustoStatus;
    private javax.swing.JComboBox cmbBox_ShippingAddress;
    private javax.swing.JPanel create_Middle;
    private javax.swing.JPanel create_Up;
    private javax.swing.JPanel custoAttributes;
    private javax.swing.JPanel details_Down;
    private javax.swing.JPanel details_Left_SideBar;
    private javax.swing.JPanel details_Right_SideBar;
    private javax.swing.JPanel details_Up;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_BitrhdateCusto;
    private javax.swing.JLabel lbl_CreateAddressCity;
    private javax.swing.JLabel lbl_CreateAddressCompany;
    private javax.swing.JLabel lbl_CreateAddressCountry;
    private javax.swing.JLabel lbl_CreateAddressLabel;
    private javax.swing.JLabel lbl_CreateAddressNote;
    private javax.swing.JLabel lbl_CreateAddressPhone;
    private javax.swing.JLabel lbl_CreateAddressStreet;
    private javax.swing.JLabel lbl_CreateAddressStreet2;
    private javax.swing.JLabel lbl_CreateAddressZip;
    private javax.swing.JLabel lbl_CreateBitrhdateCusto;
    private javax.swing.JLabel lbl_CreateFirstnameCusto;
    private javax.swing.JLabel lbl_CreateLastnameCusto;
    private javax.swing.JLabel lbl_CreateMailCusto;
    private javax.swing.JLabel lbl_CreatePasswordCusto;
    private javax.swing.JLabel lbl_CreateStatus;
    private javax.swing.JLabel lbl_DeliveryAddressCity;
    private javax.swing.JLabel lbl_DeliveryAddressCompany;
    private javax.swing.JLabel lbl_DeliveryAddressCountry;
    private javax.swing.JLabel lbl_DeliveryAddressLabel;
    private javax.swing.JLabel lbl_DeliveryAddressNote;
    private javax.swing.JLabel lbl_DeliveryAddressPhone;
    private javax.swing.JLabel lbl_DeliveryAddressStreet;
    private javax.swing.JLabel lbl_DeliveryAddressStreet2;
    private javax.swing.JLabel lbl_DeliveryAddressZip;
    private javax.swing.JLabel lbl_FirstnameCusto;
    private javax.swing.JLabel lbl_LastnameCusto;
    private javax.swing.JLabel lbl_MailCusto;
    private javax.swing.JLabel lbl_RegistrationTitle;
    private javax.swing.JLabel lbl_RegistrationValue;
    private javax.swing.JLabel lbl_ShippingAddressCity;
    private javax.swing.JLabel lbl_ShippingAddressCompany;
    private javax.swing.JLabel lbl_ShippingAddressCountry;
    private javax.swing.JLabel lbl_ShippingAddressLabel;
    private javax.swing.JLabel lbl_ShippingAddressNote;
    private javax.swing.JLabel lbl_ShippingAddressPhone;
    private javax.swing.JLabel lbl_ShippingAddressStreet;
    private javax.swing.JLabel lbl_ShippingAddressStreet2;
    private javax.swing.JLabel lbl_ShippingAddressZip;
    private javax.swing.JLabel lbl_SocialTitleCusto;
    private javax.swing.JLabel lbl_SocialTitleCusto1;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JLabel lbl_StatusValue;
    private javax.swing.JLabel lbl_TitleAddresses;
    private javax.swing.JLabel lbl_TitleAttributes;
    private javax.swing.JLabel lbl_TitleAttributes1;
    private javax.swing.JLabel lbl_TitleAttributes2;
    private javax.swing.JLabel lbl_TitleComments;
    private javax.swing.JLabel lbl_TitleComments1;
    private javax.swing.JLabel lbl_TitleCreateCustomer;
    private javax.swing.JLabel lbl_TitleCustomer1;
    private javax.swing.JLabel lbl_TitleInfos;
    private javax.swing.JLabel lbl_TitleManageCustomer;
    private javax.swing.JLabel lbl_TitleNote;
    private javax.swing.JLabel lbl_TitleOrder;
    private javax.swing.JLabel lbl_TitleResumeCustomer;
    private javax.swing.JLabel lbl_TotalTitle;
    private javax.swing.JLabel lbl_TotalValue;
    private javax.swing.JPanel panel_Create;
    private javax.swing.JPanel panel_Delivery;
    private javax.swing.JPanel panel_Details;
    private javax.swing.JPanel panel_Resume;
    private javax.swing.JPanel panel_Shipping;
    private javax.swing.JRadioButton rBtn_CreateMr;
    private javax.swing.JRadioButton rBtn_CreateMrs;
    private javax.swing.JRadioButton rBtn_Mr;
    private javax.swing.JRadioButton rBtn_Mrs;
    private javax.swing.JPanel resume_Up;
    private javax.swing.JScrollPane scrBar_Addresses;
    private javax.swing.JScrollPane scrBar_Comments;
    private javax.swing.JScrollPane scrBar_Comments1;
    private javax.swing.JScrollPane scrBar_Customers;
    private javax.swing.JScrollPane scrBar_Note;
    private javax.swing.JSeparator sep_Adresses;
    private javax.swing.JSeparator sep_Attributes;
    private javax.swing.JSeparator sep_Attributes1;
    private javax.swing.JSeparator sep_Attributes2;
    private javax.swing.JSeparator sep_Comments;
    private javax.swing.JSeparator sep_Comments1;
    private javax.swing.JSeparator sep_Customers;
    private javax.swing.JSeparator sep_Infos;
    private javax.swing.JSeparator sep_Note;
    private javax.swing.JSeparator sep_Order;
    private javax.swing.JTabbedPane tabPan_Address;
    private javax.swing.JTable tbl_Addresses;
    private javax.swing.JTable tbl_CommentCusto;
    private javax.swing.JTable tbl_Customers;
    private javax.swing.JTable tbl_OrderCusto;
    private javax.swing.JToggleButton tglBtn_CustomerEnable;
    private javax.swing.JTextArea txtArea_CreateAddressNote;
    private javax.swing.JTextArea txtArea_DeliveryAddressNote;
    private javax.swing.JTextArea txtArea_Note;
    private javax.swing.JTextArea txtArea_ShippingAddressNote;
    private javax.swing.JTextField txtFld_BirthdateCusto;
    private javax.swing.JTextField txtFld_CreateAddressCity;
    private javax.swing.JTextField txtFld_CreateAddressCompany;
    private javax.swing.JTextField txtFld_CreateAddressCountry;
    private javax.swing.JTextField txtFld_CreateAddressLabel;
    private javax.swing.JTextField txtFld_CreateAddressPhone;
    private javax.swing.JTextField txtFld_CreateAddressStreet;
    private javax.swing.JTextField txtFld_CreateAddressStreet2;
    private javax.swing.JTextField txtFld_CreateAddressZip;
    private javax.swing.JTextField txtFld_CreateBitrhdateCusto;
    private javax.swing.JTextField txtFld_CreateFirstnameCusto;
    private javax.swing.JTextField txtFld_CreateLastnameCusto;
    private javax.swing.JTextField txtFld_CreateMailCusto;
    private javax.swing.JTextField txtFld_CreatePasswordeCusto;
    private javax.swing.JTextField txtFld_DeliveryAddressCity;
    private javax.swing.JTextField txtFld_DeliveryAddressCompany;
    private javax.swing.JTextField txtFld_DeliveryAddressCountry;
    private javax.swing.JTextField txtFld_DeliveryAddressLabel;
    private javax.swing.JTextField txtFld_DeliveryAddressPhone;
    private javax.swing.JTextField txtFld_DeliveryAddressStreet;
    private javax.swing.JTextField txtFld_DeliveryAddressStreet2;
    private javax.swing.JTextField txtFld_DeliveryAddressZip;
    private javax.swing.JTextField txtFld_FirstnameCusto;
    private javax.swing.JTextField txtFld_LastnameCusto;
    private javax.swing.JTextField txtFld_MailCusto;
    private javax.swing.JTextField txtFld_SearchAddressFirstname;
    private javax.swing.JTextField txtFld_SearchAddressId;
    private javax.swing.JTextField txtFld_SearchAddressLastname;
    private javax.swing.JTextField txtFld_SearchAddressPhone;
    private javax.swing.JTextField txtFld_SearchAddressStreet;
    private javax.swing.JTextField txtFld_SearchAddressZip;
    private javax.swing.JTextField txtFld_SearchCustoFirstname;
    private javax.swing.JTextField txtFld_SearchCustoId;
    private javax.swing.JTextField txtFld_SearchCustoLastname;
    private javax.swing.JTextField txtFld_SearchCustoMail;
    private javax.swing.JTextField txtFld_ShippingAddressCity;
    private javax.swing.JTextField txtFld_ShippingAddressCompany;
    private javax.swing.JTextField txtFld_ShippingAddressCountry;
    private javax.swing.JTextField txtFld_ShippingAddressLabel;
    private javax.swing.JTextField txtFld_ShippingAddressPhone;
    private javax.swing.JTextField txtFld_ShippingAddressStreet;
    private javax.swing.JTextField txtFld_ShippingAddressStreet2;
    private javax.swing.JTextField txtFld_ShippingAddressZip;
    // End of variables declaration//GEN-END:variables
}
