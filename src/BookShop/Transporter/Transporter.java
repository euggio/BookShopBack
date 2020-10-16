
package BookShop.Transporter;

import BookShop.Book.Book_JPanel;
import BookShop.Methods.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Transporter extends javax.swing.JPanel {
    JoinsTransporter transp = new JoinsTransporter();
    ComboBox cmb = new ComboBox();
    Long valueSelected;

    public Transporter() {
        initComponents();
    }
    
    private DefaultTableModel initTableTransp() {
        tbl_Transporters.setDefaultRenderer(Object.class, new AddButton());
        
        return new DefaultTableModel(transp.getDataRowTransporters(), transp.getDataColumnTransporters()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };        
    }
    
    private DefaultComboBoxModel initCmbBoxStatus () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxStatus());
    }
    
    private DefaultComboBoxModel initCmbBoxTranspCity () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxCity());
    }

    private DefaultComboBoxModel initCmbBoxTranspCountry () {
        return new DefaultComboBoxModel(cmb.getDataComboBoxCountry());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_Resume = new javax.swing.JPanel();
        resume_Up = new javax.swing.JPanel();
        lbl_TitleResumeTransporters = new javax.swing.JLabel();
        Resume_Transporters = new javax.swing.JPanel();
        lbl_TitleTransporters = new javax.swing.JLabel();
        btn_AddTransporters = new javax.swing.JButton();
        sep_Transporters = new javax.swing.JSeparator();
        scrBar_Transporters = new javax.swing.JScrollPane();
        tbl_Transporters = new javax.swing.JTable();
        txtFld_SearchTranspId = new javax.swing.JTextField();
        txtFld_SearchTranspName = new javax.swing.JTextField();
        txtFld_SearchTranspContactName = new javax.swing.JTextField();
        txtFld_SearchTranspMail = new javax.swing.JTextField();
        cmbBox_SearchTranspCity = new javax.swing.JComboBox();
        cmbBox_SearchTranspCountry = new javax.swing.JComboBox();
        txtFld_SearchTranspPhone = new javax.swing.JTextField();
        cmbBox_SearchTranspStatus = new javax.swing.JComboBox();
        btn_SearchTransp = new javax.swing.JButton();
        panel_Details = new javax.swing.JPanel();
        details_Up = new javax.swing.JPanel();
        lbl_TitleManageTransporter = new javax.swing.JLabel();
        btn_BackResume = new javax.swing.JButton();
        details_Middle = new javax.swing.JPanel();
        TranspAttributes = new javax.swing.JPanel();
        lbl_TitleAttributes = new javax.swing.JLabel();
        btn_EditAttributes = new javax.swing.JButton();
        sep_Attributes = new javax.swing.JSeparator();
        lbl_NameTransp = new javax.swing.JLabel();
        txtFld_NameTransp = new javax.swing.JTextField();
        lbl_ContactNameTransp = new javax.swing.JLabel();
        txtFld_ContactNameTransp = new javax.swing.JTextField();
        lbl_MailTransp = new javax.swing.JLabel();
        txtFld_MailTransp = new javax.swing.JTextField();
        lbl_PhoneTransp = new javax.swing.JLabel();
        txtFld_PhoneTransp = new javax.swing.JTextField();
        btn_SaveAttributes = new javax.swing.JButton();
        btn_CancelEditAttribute = new javax.swing.JButton();
        TranspContactDetails = new javax.swing.JPanel();
        lbl_TitleContactDetails = new javax.swing.JLabel();
        btn_EditContactDetails = new javax.swing.JButton();
        sep_ContactDetails = new javax.swing.JSeparator();
        lbl_StreetTransp = new javax.swing.JLabel();
        txtFld_StreetTransp = new javax.swing.JTextField();
        lbl_Street2Transp = new javax.swing.JLabel();
        txtFld_Street2Transp = new javax.swing.JTextField();
        lbl_ZipTransp = new javax.swing.JLabel();
        txtFld_ZipTransp = new javax.swing.JTextField();
        lbl_CityTransp = new javax.swing.JLabel();
        txtFld_CityTransp = new javax.swing.JTextField();
        lbl_CountryTransp = new javax.swing.JLabel();
        txtFld_CountryTransp = new javax.swing.JTextField();
        btn_SaveContactDet = new javax.swing.JButton();
        btn_CancelEditContactDet = new javax.swing.JButton();
        details_Down = new javax.swing.JPanel();
        TranspInfos = new javax.swing.JPanel();
        lbl_TitleInfos = new javax.swing.JLabel();
        sep_Infos = new javax.swing.JSeparator();
        lbl_TransitTime = new javax.swing.JLabel();
        btn_EditInfos = new javax.swing.JButton();
        txtFld_TransitTimeTransp = new javax.swing.JTextField();
        lbl_MeasureTransp = new javax.swing.JLabel();
        txtFld_MeasureTransp = new javax.swing.JTextField();
        lbl_WeightTransp = new javax.swing.JLabel();
        txtFld_WeightTransp = new javax.swing.JTextField();
        lbl_PriceTransp = new javax.swing.JLabel();
        txtFld_PriceTransp = new javax.swing.JTextField();
        lbl_StatusTransp = new javax.swing.JLabel();
        txtFld_StatusTransp = new javax.swing.JTextField();
        btn_SaveInfos = new javax.swing.JButton();
        btn_CancelEditInfos = new javax.swing.JButton();
        TranspNotes = new javax.swing.JPanel();
        lbl_TitleNote = new javax.swing.JLabel();
        btn_EditNote = new javax.swing.JButton();
        sep_Note = new javax.swing.JSeparator();
        scrBar_Note = new javax.swing.JScrollPane();
        txtArea_Note = new javax.swing.JTextArea();
        btn_SaveNote = new javax.swing.JButton();
        btn_CancelEditNote = new javax.swing.JButton();
        panel_Create = new javax.swing.JPanel();
        create_Up = new javax.swing.JPanel();
        lbl_TitleCreateTransporter = new javax.swing.JLabel();
        btn_BackResume2 = new javax.swing.JButton();
        create_Middle = new javax.swing.JPanel();
        txtFld_MailTransp1 = new javax.swing.JTextField();
        lbl_CompanyTransp1 = new javax.swing.JLabel();
        lbl_PhoneTransp1 = new javax.swing.JLabel();
        lbl_MailTransp1 = new javax.swing.JLabel();
        txtFld_CompanyTransp1 = new javax.swing.JTextField();
        lbl_ContactTransp1 = new javax.swing.JLabel();
        txtFld_ContactTransp1 = new javax.swing.JTextField();
        txtFld_PhoneTransp1 = new javax.swing.JTextField();
        lbl_AddressStreet = new javax.swing.JLabel();
        txtFld_AddressStreet = new javax.swing.JTextField();
        lbl_TitleAttributes1 = new javax.swing.JLabel();
        sep_Attributes1 = new javax.swing.JSeparator();
        sep_Attributes2 = new javax.swing.JSeparator();
        lbl_TitleAttributes2 = new javax.swing.JLabel();
        txtFld_AddressCountry = new javax.swing.JTextField();
        lbl_AddressCountry = new javax.swing.JLabel();
        lbl_AddressCity = new javax.swing.JLabel();
        txtFld_AddressCity = new javax.swing.JTextField();
        txtFld_AddressZip = new javax.swing.JTextField();
        lbl_AddressZip = new javax.swing.JLabel();
        lbl_AddressStreet2 = new javax.swing.JLabel();
        txtFld_AddressStreet2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_AddressNote = new javax.swing.JTextArea();
        lbl_Status1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_CancelEditCreate = new javax.swing.JButton();
        btn_SaveCreate = new javax.swing.JButton();
        sep_CreateInformations = new javax.swing.JSeparator();
        lbl_CreateTitleInformations = new javax.swing.JLabel();
        sep_CreateNote = new javax.swing.JSeparator();
        lb_CreateTitleNote = new javax.swing.JLabel();
        lbl_CreateTransitTimeTransp = new javax.swing.JLabel();
        txtFld_TransitTimeTransp1 = new javax.swing.JTextField();
        txtFld_PriceTransp1 = new javax.swing.JTextField();
        lbl_PriceTransp1 = new javax.swing.JLabel();
        lbl_MeasurementTransp1 = new javax.swing.JLabel();
        txtFld_MeasurementTransp1 = new javax.swing.JTextField();
        txtFld_WeightTransp1 = new javax.swing.JTextField();
        lbl_WeightTransp1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(242, 242, 242));
        setLayout(new java.awt.CardLayout());

        panel_Resume.setBackground(new java.awt.Color(242, 242, 242));
        panel_Resume.setPreferredSize(new java.awt.Dimension(1153, 1434));

        resume_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleResumeTransporters.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleResumeTransporters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleResumeTransporters.setText("RESUME TRANSPORTERS");

        javax.swing.GroupLayout resume_UpLayout = new javax.swing.GroupLayout(resume_Up);
        resume_Up.setLayout(resume_UpLayout);
        resume_UpLayout.setHorizontalGroup(
            resume_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resume_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleResumeTransporters, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(610, Short.MAX_VALUE))
        );
        resume_UpLayout.setVerticalGroup(
            resume_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resume_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleResumeTransporters, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        Resume_Transporters.setBackground(new java.awt.Color(255, 255, 255));
        Resume_Transporters.setMinimumSize(new java.awt.Dimension(150, 30));

        lbl_TitleTransporters.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/shiping.png"))); // NOI18N
        lbl_TitleTransporters.setText("Transporters");

        btn_AddTransporters.setBackground(new java.awt.Color(160, 181, 213));
        btn_AddTransporters.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AddTransporters.setText("ADD");
        btn_AddTransporters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddTransportersActionPerformed(evt);
            }
        });

        scrBar_Transporters.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        tbl_Transporters.setAutoCreateRowSorter(true);
        tbl_Transporters.setModel(initTableTransp());
        tbl_Transporters.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Transporters.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbl_Transporters.setGridColor(new java.awt.Color(197, 203, 214));
        tbl_Transporters.setRowHeight(30);
        tbl_Transporters.setSelectionBackground(new java.awt.Color(176, 190, 214));
        tbl_Transporters.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Transporters.setShowVerticalLines(false);
        tbl_Transporters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_TransportersMouseClicked(evt);
            }
        });
        scrBar_Transporters.setViewportView(tbl_Transporters);

        txtFld_SearchTranspId.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchTranspId.setMaximumSize(null);
        txtFld_SearchTranspId.setMinimumSize(new java.awt.Dimension(125, 30));

        txtFld_SearchTranspName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchTranspName.setMaximumSize(null);
        txtFld_SearchTranspName.setMinimumSize(new java.awt.Dimension(125, 30));

        txtFld_SearchTranspContactName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchTranspContactName.setMaximumSize(null);
        txtFld_SearchTranspContactName.setMinimumSize(new java.awt.Dimension(125, 30));

        txtFld_SearchTranspMail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchTranspMail.setMaximumSize(null);
        txtFld_SearchTranspMail.setMinimumSize(new java.awt.Dimension(125, 30));

        cmbBox_SearchTranspCity.setModel(initCmbBoxTranspCity());
        cmbBox_SearchTranspCity.setPreferredSize(new java.awt.Dimension(125, 30));

        cmbBox_SearchTranspCountry.setModel(initCmbBoxTranspCountry());
        cmbBox_SearchTranspCountry.setPreferredSize(new java.awt.Dimension(125, 30));

        txtFld_SearchTranspPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFld_SearchTranspPhone.setMaximumSize(null);
        txtFld_SearchTranspPhone.setMinimumSize(new java.awt.Dimension(125, 30));

        cmbBox_SearchTranspStatus.setModel(initCmbBoxStatus());
        cmbBox_SearchTranspStatus.setPreferredSize(new java.awt.Dimension(125, 30));

        btn_SearchTransp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Search_16px.png"))); // NOI18N
        btn_SearchTransp.setMinimumSize(new java.awt.Dimension(49, 30));

        javax.swing.GroupLayout Resume_TransportersLayout = new javax.swing.GroupLayout(Resume_Transporters);
        Resume_Transporters.setLayout(Resume_TransportersLayout);
        Resume_TransportersLayout.setHorizontalGroup(
            Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_TransportersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrBar_Transporters)
                    .addComponent(sep_Transporters)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Resume_TransportersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(txtFld_SearchTranspId, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchTranspName, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchTranspContactName, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchTranspMail, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchTranspCity, 0, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchTranspCountry, 0, 114, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFld_SearchTranspPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbBox_SearchTranspStatus, 0, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_SearchTransp, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE))
                    .addGroup(Resume_TransportersLayout.createSequentialGroup()
                        .addComponent(lbl_TitleTransporters, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_AddTransporters, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Resume_TransportersLayout.setVerticalGroup(
            Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Resume_TransportersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitleTransporters)
                    .addComponent(btn_AddTransporters))
                .addComponent(sep_Transporters, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Resume_TransportersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFld_SearchTranspId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchTranspName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchTranspContactName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchTranspMail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_SearchTranspPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchTranspCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchTranspCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbBox_SearchTranspStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_SearchTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrBar_Transporters, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_ResumeLayout = new javax.swing.GroupLayout(panel_Resume);
        panel_Resume.setLayout(panel_ResumeLayout);
        panel_ResumeLayout.setHorizontalGroup(
            panel_ResumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resume_Up, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Resume_Transporters, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel_ResumeLayout.setVerticalGroup(
            panel_ResumeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ResumeLayout.createSequentialGroup()
                .addComponent(resume_Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Resume_Transporters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(panel_Resume, "card3");

        panel_Details.setBackground(new java.awt.Color(242, 242, 242));

        details_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageTransporter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageTransporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageTransporter.setText("MANAGE TRANSPORTER");

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
                .addComponent(lbl_TitleManageTransporter, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_BackResume, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        details_UpLayout.setVerticalGroup(
            details_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleManageTransporter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BackResume, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        details_Middle.setBackground(new java.awt.Color(242, 242, 242));

        TranspAttributes.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleAttributes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes.setText("Attributes");

        btn_EditAttributes.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditAttributes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditAttributes.setText("EDIT");
        btn_EditAttributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditAttributesActionPerformed(evt);
            }
        });

        lbl_NameTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_NameTransp.setText("Company:");

        txtFld_NameTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_NameTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_NameTransp.setEnabled(false);
        txtFld_NameTransp.setSelectedTextColor(new java.awt.Color(204, 255, 255));

        lbl_ContactNameTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ContactNameTransp.setText("Contact:");

        txtFld_ContactNameTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_ContactNameTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ContactNameTransp.setEnabled(false);

        lbl_MailTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_MailTransp.setText("Email:");

        txtFld_MailTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_MailTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_MailTransp.setEnabled(false);

        lbl_PhoneTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_PhoneTransp.setText("Phone number:");

        txtFld_PhoneTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_PhoneTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_PhoneTransp.setEnabled(false);

        btn_SaveAttributes.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveAttributes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveAttributes.setText("SAVE");
        btn_SaveAttributes.setEnabled(false);
        btn_SaveAttributes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveAttributesActionPerformed(evt);
            }
        });

        btn_CancelEditAttribute.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditAttribute.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditAttribute.setText("CANCEL");
        btn_CancelEditAttribute.setEnabled(false);

        javax.swing.GroupLayout TranspAttributesLayout = new javax.swing.GroupLayout(TranspAttributes);
        TranspAttributes.setLayout(TranspAttributesLayout);
        TranspAttributesLayout.setHorizontalGroup(
            TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TranspAttributesLayout.createSequentialGroup()
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TranspAttributesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TranspAttributesLayout.createSequentialGroup()
                                .addComponent(lbl_TitleAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117)
                                .addComponent(btn_CancelEditAttribute)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_SaveAttributes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_EditAttributes)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(sep_Attributes)))
                    .addGroup(TranspAttributesLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_MailTransp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ContactNameTransp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_NameTransp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_PhoneTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtFld_ContactNameTransp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_MailTransp, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFld_PhoneTransp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                            .addComponent(txtFld_NameTransp))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        TranspAttributesLayout.setVerticalGroup(
            TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TranspAttributesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleAttributes)
                    .addComponent(btn_CancelEditAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SaveAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EditAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(sep_Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_NameTransp)
                    .addComponent(txtFld_NameTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ContactNameTransp)
                    .addComponent(txtFld_ContactNameTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MailTransp)
                    .addComponent(txtFld_MailTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspAttributesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PhoneTransp)
                    .addComponent(txtFld_PhoneTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        TranspContactDetails.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleContactDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        lbl_TitleContactDetails.setText("Contact details");

        btn_EditContactDetails.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditContactDetails.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditContactDetails.setText("EDIT");
        btn_EditContactDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditContactDetailsActionPerformed(evt);
            }
        });

        lbl_StreetTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_StreetTransp.setText("Street:");

        txtFld_StreetTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_StreetTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_StreetTransp.setEnabled(false);

        lbl_Street2Transp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Street2Transp.setText("Street2:");

        txtFld_Street2Transp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_Street2Transp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_Street2Transp.setEnabled(false);

        lbl_ZipTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ZipTransp.setText("Zip Code:");

        txtFld_ZipTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_ZipTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_ZipTransp.setEnabled(false);

        lbl_CityTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CityTransp.setText("City:");

        txtFld_CityTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_CityTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_CityTransp.setEnabled(false);

        lbl_CountryTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CountryTransp.setText("Country:");

        txtFld_CountryTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_CountryTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_CountryTransp.setEnabled(false);

        btn_SaveContactDet.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveContactDet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveContactDet.setText("SAVE");
        btn_SaveContactDet.setEnabled(false);

        btn_CancelEditContactDet.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditContactDet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditContactDet.setText("CANCEL");
        btn_CancelEditContactDet.setEnabled(false);

        javax.swing.GroupLayout TranspContactDetailsLayout = new javax.swing.GroupLayout(TranspContactDetails);
        TranspContactDetails.setLayout(TranspContactDetailsLayout);
        TranspContactDetailsLayout.setHorizontalGroup(
            TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TranspContactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_ContactDetails)
                    .addGroup(TranspContactDetailsLayout.createSequentialGroup()
                        .addComponent(lbl_TitleContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                        .addComponent(btn_CancelEditContactDet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SaveContactDet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EditContactDetails)))
                .addContainerGap())
            .addGroup(TranspContactDetailsLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_CountryTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_StreetTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Street2Transp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_ZipTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_CityTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFld_Street2Transp)
                    .addComponent(txtFld_ZipTransp)
                    .addComponent(txtFld_CityTransp)
                    .addComponent(txtFld_StreetTransp)
                    .addComponent(txtFld_CountryTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TranspContactDetailsLayout.setVerticalGroup(
            TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TranspContactDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CancelEditContactDet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SaveContactDet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_TitleContactDetails)
                        .addComponent(btn_EditContactDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_ContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StreetTransp)
                    .addComponent(txtFld_StreetTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Street2Transp)
                    .addComponent(txtFld_Street2Transp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_ZipTransp)
                    .addComponent(txtFld_ZipTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CityTransp)
                    .addComponent(txtFld_CityTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspContactDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_CountryTransp)
                    .addComponent(txtFld_CountryTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout details_MiddleLayout = new javax.swing.GroupLayout(details_Middle);
        details_Middle.setLayout(details_MiddleLayout);
        details_MiddleLayout.setHorizontalGroup(
            details_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_MiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(details_MiddleLayout.createSequentialGroup()
                        .addComponent(TranspAttributes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(634, 634, 634))
                    .addGroup(details_MiddleLayout.createSequentialGroup()
                        .addComponent(TranspContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        details_MiddleLayout.setVerticalGroup(
            details_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_MiddleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TranspAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TranspContactDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        details_Down.setBackground(new java.awt.Color(242, 242, 242));

        TranspInfos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos.setText("Infos");

        lbl_TransitTime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_TransitTime.setText("Transit time:");

        btn_EditInfos.setBackground(new java.awt.Color(160, 181, 213));
        btn_EditInfos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_EditInfos.setText("EDIT");
        btn_EditInfos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditInfosActionPerformed(evt);
            }
        });

        txtFld_TransitTimeTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_TransitTimeTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_TransitTimeTransp.setEnabled(false);

        lbl_MeasureTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_MeasureTransp.setText("Measurement max:");

        txtFld_MeasureTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_MeasureTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_MeasureTransp.setEnabled(false);

        lbl_WeightTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_WeightTransp.setText("Weight max:");

        txtFld_WeightTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_WeightTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_WeightTransp.setEnabled(false);

        lbl_PriceTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_PriceTransp.setText("Price:");

        txtFld_PriceTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_PriceTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_PriceTransp.setEnabled(false);

        lbl_StatusTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_StatusTransp.setText("Status:");

        txtFld_StatusTransp.setBackground(new java.awt.Color(242, 242, 242));
        txtFld_StatusTransp.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtFld_StatusTransp.setEnabled(false);

        btn_SaveInfos.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveInfos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveInfos.setText("SAVE");
        btn_SaveInfos.setEnabled(false);

        btn_CancelEditInfos.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditInfos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditInfos.setText("CANCEL");
        btn_CancelEditInfos.setEnabled(false);

        javax.swing.GroupLayout TranspInfosLayout = new javax.swing.GroupLayout(TranspInfos);
        TranspInfos.setLayout(TranspInfosLayout);
        TranspInfosLayout.setHorizontalGroup(
            TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TranspInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TranspInfosLayout.createSequentialGroup()
                        .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Infos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TranspInfosLayout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_CancelEditInfos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_SaveInfos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_EditInfos)))
                        .addGap(18, 18, 18))
                    .addGroup(TranspInfosLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_StatusTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_MeasureTransp, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(lbl_WeightTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_PriceTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_TransitTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFld_MeasureTransp)
                            .addComponent(txtFld_WeightTransp)
                            .addComponent(txtFld_PriceTransp)
                            .addComponent(txtFld_TransitTimeTransp)
                            .addComponent(txtFld_StatusTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(102, Short.MAX_VALUE))))
        );
        TranspInfosLayout.setVerticalGroup(
            TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TranspInfosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CancelEditInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SaveInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_TitleInfos)
                        .addComponent(btn_EditInfos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_TransitTimeTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TransitTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MeasureTransp)
                    .addComponent(txtFld_MeasureTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_WeightTransp)
                    .addComponent(txtFld_WeightTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PriceTransp)
                    .addComponent(txtFld_PriceTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(TranspInfosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_StatusTransp)
                    .addComponent(txtFld_StatusTransp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        TranspNotes.setBackground(new java.awt.Color(255, 255, 255));

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

        txtArea_Note.setEditable(false);
        txtArea_Note.setColumns(20);
        txtArea_Note.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        txtArea_Note.setLineWrap(true);
        txtArea_Note.setRows(5);
        txtArea_Note.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtArea_Note.setEnabled(false);
        scrBar_Note.setViewportView(txtArea_Note);

        btn_SaveNote.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveNote.setText("SAVE");
        btn_SaveNote.setEnabled(false);

        btn_CancelEditNote.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditNote.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditNote.setText("CANCEL");
        btn_CancelEditNote.setEnabled(false);

        javax.swing.GroupLayout TranspNotesLayout = new javax.swing.GroupLayout(TranspNotes);
        TranspNotes.setLayout(TranspNotesLayout);
        TranspNotesLayout.setHorizontalGroup(
            TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TranspNotesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TranspNotesLayout.createSequentialGroup()
                        .addGroup(TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrBar_Note)
                            .addComponent(sep_Note))
                        .addContainerGap())
                    .addGroup(TranspNotesLayout.createSequentialGroup()
                        .addComponent(lbl_TitleNote, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addComponent(btn_CancelEditNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_SaveNote)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_EditNote)
                        .addGap(19, 19, 19))))
        );
        TranspNotesLayout.setVerticalGroup(
            TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TranspNotesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_CancelEditNote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_SaveNote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TranspNotesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_TitleNote)
                        .addComponent(btn_EditNote, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(sep_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout details_DownLayout = new javax.swing.GroupLayout(details_Down);
        details_Down.setLayout(details_DownLayout);
        details_DownLayout.setHorizontalGroup(
            details_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_DownLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(details_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TranspNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TranspInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        details_DownLayout.setVerticalGroup(
            details_DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(details_DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TranspNotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TranspInfos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_DetailsLayout = new javax.swing.GroupLayout(panel_Details);
        panel_Details.setLayout(panel_DetailsLayout);
        panel_DetailsLayout.setHorizontalGroup(
            panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(details_Up, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_DetailsLayout.createSequentialGroup()
                .addComponent(details_Middle, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(details_Down, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_DetailsLayout.setVerticalGroup(
            panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DetailsLayout.createSequentialGroup()
                .addComponent(details_Up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_DetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(details_Middle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(details_Down, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        add(panel_Details, "card2");

        panel_Create.setBackground(new java.awt.Color(242, 242, 242));
        panel_Create.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleCreateTransporter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleCreateTransporter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleCreateTransporter.setText("CREATE TRANSPORTER");

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
                .addComponent(lbl_TitleCreateTransporter, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(btn_BackResume2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        create_UpLayout.setVerticalGroup(
            create_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_UpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(create_UpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_TitleCreateTransporter, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BackResume2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Create.add(create_Up, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, -1));

        create_Middle.setBackground(new java.awt.Color(255, 255, 255));

        lbl_CompanyTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CompanyTransp1.setText("Company:");

        lbl_PhoneTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_PhoneTransp1.setText("Phone number:");

        lbl_MailTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_MailTransp1.setText("Email:");

        lbl_ContactTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_ContactTransp1.setText("Contact:");

        lbl_AddressStreet.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_AddressStreet.setText("Address:");

        lbl_TitleAttributes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes1.setText("Attributes");

        lbl_TitleAttributes2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        lbl_TitleAttributes2.setText("Contact Details");

        lbl_AddressCountry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_AddressCountry.setText("Country:");

        lbl_AddressCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_AddressCity.setText("City:");

        lbl_AddressZip.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_AddressZip.setText("Zip code:");

        lbl_AddressStreet2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_AddressStreet2.setText("Address (2):");

        txtArea_AddressNote.setColumns(20);
        txtArea_AddressNote.setRows(5);
        jScrollPane1.setViewportView(txtArea_AddressNote);

        lbl_Status1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_Status1.setText("Status:");

        jPanel2.setBackground(new java.awt.Color(242, 242, 242));

        btn_CancelEditCreate.setBackground(new java.awt.Color(160, 181, 213));
        btn_CancelEditCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_CancelEditCreate.setText("CANCEL");

        btn_SaveCreate.setBackground(new java.awt.Color(160, 181, 213));
        btn_SaveCreate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_SaveCreate.setText("SAVE");
        btn_SaveCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveCreateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(btn_CancelEditCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_SaveCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_CancelEditCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_SaveCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 3, Short.MAX_VALUE))
        );

        lbl_CreateTitleInformations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        lbl_CreateTitleInformations.setText("Informations");

        lb_CreateTitleNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lb_CreateTitleNote.setText("Note");

        lbl_CreateTransitTimeTransp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_CreateTransitTimeTransp.setText("Transit time:");

        lbl_PriceTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_PriceTransp1.setText("Price:");

        lbl_MeasurementTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_MeasurementTransp1.setText("Measurement max:");

        lbl_WeightTransp1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_WeightTransp1.setText("Weight max:");

        jComboBox1.setModel(initCmbBoxStatus());

        javax.swing.GroupLayout create_MiddleLayout = new javax.swing.GroupLayout(create_Middle);
        create_Middle.setLayout(create_MiddleLayout);
        create_MiddleLayout.setHorizontalGroup(
            create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(create_MiddleLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(sep_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, create_MiddleLayout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_TitleAttributes2)
                                .addComponent(sep_Attributes2, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbl_TitleAttributes1)))
                .addGap(52, 52, 52)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_CreateTitleInformations)
                    .addComponent(sep_CreateInformations, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_CreateTitleNote)
                    .addComponent(sep_CreateNote, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbl_Status1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_CompanyTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_CompanyTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_ContactTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_ContactTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_MailTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_MailTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_PhoneTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_PhoneTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_AddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_AddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_AddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_AddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_AddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_AddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_AddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_AddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_AddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_AddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_CreateTransitTimeTransp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_TransitTimeTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_PriceTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_PriceTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_MeasurementTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_MeasurementTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_WeightTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtFld_WeightTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87))
        );
        create_MiddleLayout.setVerticalGroup(
            create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(create_MiddleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_TitleAttributes1)
                        .addGap(8, 8, 8)
                        .addComponent(sep_Attributes1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lb_CreateTitleNote)
                        .addGap(8, 8, 8)
                        .addComponent(sep_CreateNote, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CompanyTransp1)
                            .addComponent(txtFld_CompanyTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_ContactTransp1)
                            .addComponent(txtFld_ContactTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MailTransp1)
                            .addComponent(txtFld_MailTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_PhoneTransp1)
                            .addComponent(txtFld_PhoneTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Status1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(41, 41, 41)))
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_TitleAttributes2)
                        .addGap(8, 8, 8)
                        .addComponent(sep_Attributes2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addComponent(lbl_CreateTitleInformations)
                        .addGap(8, 8, 8)
                        .addComponent(sep_CreateInformations, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AddressStreet)
                            .addComponent(txtFld_AddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AddressStreet2)
                            .addComponent(txtFld_AddressStreet2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AddressZip)
                            .addComponent(txtFld_AddressZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AddressCity)
                            .addComponent(txtFld_AddressCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_AddressCountry)
                            .addComponent(txtFld_AddressCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(create_MiddleLayout.createSequentialGroup()
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_CreateTransitTimeTransp)
                            .addComponent(txtFld_TransitTimeTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_PriceTransp1)
                            .addComponent(txtFld_PriceTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_MeasurementTransp1)
                            .addComponent(txtFld_MeasurementTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(create_MiddleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_WeightTransp1)
                            .addComponent(txtFld_WeightTransp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_Create.add(create_Middle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 890, 620));

        add(panel_Create, "card4");
    }// </editor-fold>//GEN-END:initComponents
    private void consultTransporter() {
        int row = tbl_Transporters.getSelectedRow();
        String transpSelected = tbl_Transporters.getModel().getValueAt(row, 0).toString();
        valueSelected = Long.valueOf(transpSelected);
        JoinsSelectedTransporter joinSelecTransp = new JoinsSelectedTransporter(valueSelected);
        Vector v = joinSelecTransp.getTranspData();

        txtFld_NameTransp.setText(v.get(0).toString());
        txtFld_ContactNameTransp.setText(v.get(1).toString());
        txtFld_MailTransp.setText(v.get(2).toString());
        txtFld_PhoneTransp.setText(v.get(3).toString());
        txtFld_StreetTransp.setText(v.get(4).toString());
        txtFld_Street2Transp.setText(v.get(5).toString());
        txtFld_ZipTransp.setText(v.get(6).toString());
        txtFld_CityTransp.setText(v.get(7).toString());
        txtFld_CountryTransp.setText(v.get(8).toString());
        txtFld_TransitTimeTransp.setText(v.get(9).toString());
        txtFld_MeasureTransp.setText(v.get(10).toString());
        txtFld_WeightTransp.setText(v.get(11).toString());
        txtFld_PriceTransp.setText(v.get(12).toString());
        txtFld_StatusTransp.setText(v.get(13).toString());
        txtArea_Note.setText(v.get(14).toString());
        
    }
    
    private void tbl_TransportersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_TransportersMouseClicked
        int columnRef = tbl_Transporters.getColumnModel().getColumnIndexAtX(evt.getX());
        int rowRef = evt.getY()/tbl_Transporters.getRowHeight();
        if (rowRef < tbl_Transporters.getRowCount() && rowRef >= 0 && columnRef < tbl_Transporters.getColumnCount() && columnRef >= 0){
            Object value = tbl_Transporters.getValueAt(rowRef, columnRef);
            if (value instanceof JButton){
                    ((JButton)value).doClick();
                    
                    //call the new Pane
                    panel_Details.setVisible(true);
                    panel_Resume.setVisible(false);
                    
                    consultTransporter();
                    setValueSelected(valueSelected);

                    
            }
        }
    }//GEN-LAST:event_tbl_TransportersMouseClicked

    private void btn_BackResumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackResumeActionPerformed
        panel_Resume.setVisible(true);
        panel_Details.setVisible(false);
        panel_Create.setVisible(false);
        
        tbl_Transporters.clearSelection();
    }//GEN-LAST:event_btn_BackResumeActionPerformed

    private void btn_BackResume2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BackResume2ActionPerformed
        panel_Resume.setVisible(true);
        panel_Details.setVisible(false);
        panel_Create.setVisible(false);
        
        tbl_Transporters.clearSelection();
    }//GEN-LAST:event_btn_BackResume2ActionPerformed

    private void btn_AddTransportersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddTransportersActionPerformed
        panel_Resume.setVisible(false);
        panel_Details.setVisible(false);
        panel_Create.setVisible(true);
    }//GEN-LAST:event_btn_AddTransportersActionPerformed

    private void btn_EditAttributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditAttributesActionPerformed
        txtFld_NameTransp.setEnabled(true);
        txtFld_ContactNameTransp.setEnabled(true);
        txtFld_MailTransp.setEnabled(true);
        txtFld_PhoneTransp.setEnabled(true);
        
        btn_CancelEditAttribute.setEnabled(true);
        btn_SaveAttributes.setEnabled(true);
    }//GEN-LAST:event_btn_EditAttributesActionPerformed

    private void btn_EditContactDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditContactDetailsActionPerformed
        txtFld_StreetTransp.setEnabled(true);
        txtFld_Street2Transp.setEnabled(true);
        txtFld_ZipTransp.setEnabled(true);
        txtFld_CityTransp.setEnabled(true);
        txtFld_CountryTransp.setEnabled(true);
        
        btn_CancelEditContactDet.setEnabled(true);
        btn_SaveContactDet.setEnabled(true);
    }//GEN-LAST:event_btn_EditContactDetailsActionPerformed

    private void btn_EditInfosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditInfosActionPerformed
        txtFld_TransitTimeTransp.setEnabled(true);
        txtFld_MeasureTransp.setEnabled(true);
        txtFld_WeightTransp.setEnabled(true);
        txtFld_PriceTransp.setEnabled(true);
        txtFld_StatusTransp.setEnabled(true);
        
        btn_CancelEditInfos.setEnabled(true);
        btn_SaveInfos.setEnabled(true);
    }//GEN-LAST:event_btn_EditInfosActionPerformed

    private void btn_EditNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditNoteActionPerformed
        txtArea_Note.setEnabled(true);
        
        btn_CancelEditNote.setEnabled(true);
        btn_SaveNote.setEnabled(true);
    }//GEN-LAST:event_btn_EditNoteActionPerformed

    private void btn_SaveAttributesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveAttributesActionPerformed
        txtFld_NameTransp.setText(TOOL_TIP_TEXT_KEY);
        txtFld_ContactNameTransp.setEnabled(true);
        txtFld_MailTransp.setEnabled(true);
        txtFld_PhoneTransp.setEnabled(true);
        
        btn_EditAttributes.setEnabled(false);
        
        ////////////////////////////////////////////////////////////////////////
        Vector v = new Vector();
                v.add(txtFld_NameTransp.getText());
                v.add(txtFld_ContactNameTransp);
                v.add(txtFld_MailTransp);
                v.add(txtFld_PhoneTransp);
        
        ////////////////////////////////////////////////////////////////////////

    }//GEN-LAST:event_btn_SaveAttributesActionPerformed

    private void btn_SaveCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveCreateActionPerformed
        Vector v = new Vector();
                v.add(txtFld_CompanyTransp1.getText());
                v.add(txtFld_ContactTransp1);
                v.add(txtFld_MailTransp1);
                v.add(txtFld_PhoneTransp1);
                v.add(txtFld_AddressStreet);
                v.add(txtFld_AddressStreet2);
                v.add(txtFld_AddressZip);
                v.add(txtFld_AddressCity);
                v.add(txtFld_AddressCountry);
                v.add(txtFld_PhoneTransp1);
        
        ////////////////////////////////////////////////////////////////////////
        
    }//GEN-LAST:event_btn_SaveCreateActionPerformed

    public Long getValueSelected() {
        return valueSelected;
    }

    public void setValueSelected(Long valueSelected) {
        this.valueSelected = valueSelected;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Resume_Transporters;
    private javax.swing.JPanel TranspAttributes;
    private javax.swing.JPanel TranspContactDetails;
    private javax.swing.JPanel TranspInfos;
    private javax.swing.JPanel TranspNotes;
    private javax.swing.JButton btn_AddTransporters;
    private javax.swing.JButton btn_BackResume;
    private javax.swing.JButton btn_BackResume2;
    private javax.swing.JButton btn_CancelEditAttribute;
    private javax.swing.JButton btn_CancelEditContactDet;
    private javax.swing.JButton btn_CancelEditCreate;
    private javax.swing.JButton btn_CancelEditInfos;
    private javax.swing.JButton btn_CancelEditNote;
    private javax.swing.JButton btn_EditAttributes;
    private javax.swing.JButton btn_EditContactDetails;
    private javax.swing.JButton btn_EditInfos;
    private javax.swing.JButton btn_EditNote;
    private javax.swing.JButton btn_SaveAttributes;
    private javax.swing.JButton btn_SaveContactDet;
    private javax.swing.JButton btn_SaveCreate;
    private javax.swing.JButton btn_SaveInfos;
    private javax.swing.JButton btn_SaveNote;
    private javax.swing.JButton btn_SearchTransp;
    private javax.swing.JComboBox cmbBox_SearchTranspCity;
    private javax.swing.JComboBox cmbBox_SearchTranspCountry;
    private javax.swing.JComboBox cmbBox_SearchTranspStatus;
    private javax.swing.JPanel create_Middle;
    private javax.swing.JPanel create_Up;
    private javax.swing.JPanel details_Down;
    private javax.swing.JPanel details_Middle;
    private javax.swing.JPanel details_Up;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_CreateTitleNote;
    private javax.swing.JLabel lbl_AddressCity;
    private javax.swing.JLabel lbl_AddressCountry;
    private javax.swing.JLabel lbl_AddressStreet;
    private javax.swing.JLabel lbl_AddressStreet2;
    private javax.swing.JLabel lbl_AddressZip;
    private javax.swing.JLabel lbl_CityTransp;
    private javax.swing.JLabel lbl_CompanyTransp1;
    private javax.swing.JLabel lbl_ContactNameTransp;
    private javax.swing.JLabel lbl_ContactTransp1;
    private javax.swing.JLabel lbl_CountryTransp;
    private javax.swing.JLabel lbl_CreateTitleInformations;
    private javax.swing.JLabel lbl_CreateTransitTimeTransp;
    private javax.swing.JLabel lbl_MailTransp;
    private javax.swing.JLabel lbl_MailTransp1;
    private javax.swing.JLabel lbl_MeasureTransp;
    private javax.swing.JLabel lbl_MeasurementTransp1;
    private javax.swing.JLabel lbl_NameTransp;
    private javax.swing.JLabel lbl_PhoneTransp;
    private javax.swing.JLabel lbl_PhoneTransp1;
    private javax.swing.JLabel lbl_PriceTransp;
    private javax.swing.JLabel lbl_PriceTransp1;
    private javax.swing.JLabel lbl_Status1;
    private javax.swing.JLabel lbl_StatusTransp;
    private javax.swing.JLabel lbl_Street2Transp;
    private javax.swing.JLabel lbl_StreetTransp;
    private javax.swing.JLabel lbl_TitleAttributes;
    private javax.swing.JLabel lbl_TitleAttributes1;
    private javax.swing.JLabel lbl_TitleAttributes2;
    private javax.swing.JLabel lbl_TitleContactDetails;
    private javax.swing.JLabel lbl_TitleCreateTransporter;
    private javax.swing.JLabel lbl_TitleInfos;
    private javax.swing.JLabel lbl_TitleManageTransporter;
    private javax.swing.JLabel lbl_TitleNote;
    private javax.swing.JLabel lbl_TitleResumeTransporters;
    private javax.swing.JLabel lbl_TitleTransporters;
    private javax.swing.JLabel lbl_TransitTime;
    private javax.swing.JLabel lbl_WeightTransp;
    private javax.swing.JLabel lbl_WeightTransp1;
    private javax.swing.JLabel lbl_ZipTransp;
    private javax.swing.JPanel panel_Create;
    private javax.swing.JPanel panel_Details;
    private javax.swing.JPanel panel_Resume;
    private javax.swing.JPanel resume_Up;
    private javax.swing.JScrollPane scrBar_Note;
    private javax.swing.JScrollPane scrBar_Transporters;
    private javax.swing.JSeparator sep_Attributes;
    private javax.swing.JSeparator sep_Attributes1;
    private javax.swing.JSeparator sep_Attributes2;
    private javax.swing.JSeparator sep_ContactDetails;
    private javax.swing.JSeparator sep_CreateInformations;
    private javax.swing.JSeparator sep_CreateNote;
    private javax.swing.JSeparator sep_Infos;
    private javax.swing.JSeparator sep_Note;
    private javax.swing.JSeparator sep_Transporters;
    private javax.swing.JTable tbl_Transporters;
    private javax.swing.JTextArea txtArea_AddressNote;
    private javax.swing.JTextArea txtArea_Note;
    private javax.swing.JTextField txtFld_AddressCity;
    private javax.swing.JTextField txtFld_AddressCountry;
    private javax.swing.JTextField txtFld_AddressStreet;
    private javax.swing.JTextField txtFld_AddressStreet2;
    private javax.swing.JTextField txtFld_AddressZip;
    private javax.swing.JTextField txtFld_CityTransp;
    private javax.swing.JTextField txtFld_CompanyTransp1;
    private javax.swing.JTextField txtFld_ContactNameTransp;
    private javax.swing.JTextField txtFld_ContactTransp1;
    private javax.swing.JTextField txtFld_CountryTransp;
    private javax.swing.JTextField txtFld_MailTransp;
    private javax.swing.JTextField txtFld_MailTransp1;
    private javax.swing.JTextField txtFld_MeasureTransp;
    private javax.swing.JTextField txtFld_MeasurementTransp1;
    private javax.swing.JTextField txtFld_NameTransp;
    private javax.swing.JTextField txtFld_PhoneTransp;
    private javax.swing.JTextField txtFld_PhoneTransp1;
    private javax.swing.JTextField txtFld_PriceTransp;
    private javax.swing.JTextField txtFld_PriceTransp1;
    private javax.swing.JTextField txtFld_SearchTranspContactName;
    private javax.swing.JTextField txtFld_SearchTranspId;
    private javax.swing.JTextField txtFld_SearchTranspMail;
    private javax.swing.JTextField txtFld_SearchTranspName;
    private javax.swing.JTextField txtFld_SearchTranspPhone;
    private javax.swing.JTextField txtFld_StatusTransp;
    private javax.swing.JTextField txtFld_Street2Transp;
    private javax.swing.JTextField txtFld_StreetTransp;
    private javax.swing.JTextField txtFld_TransitTimeTransp;
    private javax.swing.JTextField txtFld_TransitTimeTransp1;
    private javax.swing.JTextField txtFld_WeightTransp;
    private javax.swing.JTextField txtFld_WeightTransp1;
    private javax.swing.JTextField txtFld_ZipTransp;
    // End of variables declaration//GEN-END:variables
}
