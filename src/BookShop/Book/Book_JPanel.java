package BookShop.Book;

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
 * Book Panel
 * @author euggio
 */
public class Book_JPanel extends javax.swing.JPanel 
{
    GetConnection con = new GetConnection();
    JoinsBook book = new JoinsBook();
    FilterJtable fjt = new FilterJtable();
    int selectedRow;
    Vector vInfo = null;
    Long authorId = null;
    Long categoryId = null;
    Long subcategoryId = null;
    Long publisherId = null;
    Long taxId = null; 
    String b;
    
    /**
     * No-arg constructor
     */
    public Book_JPanel() 
    {
        initComponents();
        initComboAuthor();
        initComboCategory();
        initComboPublisher();
        fjt.FilterJtable(tbl_Attributes, txtFld_Research);
        tglBtn_BookStatus.setEnabled(false);
    }
    
    private DefaultTableModel initTable() 
    {
            return new DefaultTableModel(book.getDataRowBook(), book.
                                                        getDataColumnBook()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
            };
    }
    
    private DefaultTableModel initTableComment() 
    {
            return new DefaultTableModel(book.getDataRowComment(b), book.
                                                    getDataColumnComment()) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
            };
    }
 
    /**
     * Initializes combo box with author's data
     */
    public void initComboAuthor()
    {
        try {
            String query = "SELECT DISTINCT a.AuthorId, CONCAT (AuthorLastname,"
                    + " ' ' ,AuthorFirstname) as Author\n" +
                            "FROM author a\n" +
                            "INNER JOIN book b\n" +
                            "On a.AuthorId = b.AuthorId";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_AddAuthor.addItem(rs.getString("Author"));
                cmbBox_EditAuthor.addItem(rs.getString("Author"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }
    
    /**
     * Initializes combo box with category
     */
    public void initComboCategory(){
         try {
            String query = "select ThemeLabel FROM THEME";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_AddCategory.addItem(rs.getString("ThemeLabel"));
                cmbBox_EditCategory.addItem(rs.getString("ThemeLabel"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Initializes combo box with subcategories
     */
    public void initComboSubcategoryAdd(){
         try {
            cmbBox_AddSubcategory.removeAllItems();
            String t = cmbBox_AddCategory.getSelectedItem().toString();
            String query =  "select SubThemeLabel\n" +
                            "from subtheme st\n" +
                            "inner join theme t\n" +
                            "on st.themeId = t.themeId\n" +
                            "where ThemeLabel = '" + t + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_AddSubcategory.addItem(rs.getString("SubThemeLabel"));
            } 
            } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Initializes and edits combo box with subcategories (first method)
     */
    public void initComboSubcategoryEdit(){
         try {
            cmbBox_EditSubcategory.removeAllItems();
            String query =  "select SubThemeLabel\n" +
                            "from subtheme st\n" +
                            "inner join theme t\n" +
                            "on st.themeId = t.themeId\n" +
                            "where ThemeLabel = '" + vInfo.get(4).toString() + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_EditSubcategory.addItem(rs.getString("SubThemeLabel"));
            } 
            } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Initializes and edits combo box with subcategories (second method)
     */
    public void initComboSubcategoryEdit2(){
         try {
            // TODO add your handling code here:
            cmbBox_EditSubcategory.removeAllItems();
            String t = cmbBox_EditCategory.getSelectedItem().toString();
            String query =  "select SubThemeLabel\n" +
                            "from subtheme st\n" +
                            "inner join theme t\n" +
                            "on st.themeId = t.themeId\n" +
                            "where ThemeLabel = '" + t + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_EditSubcategory.addItem(rs.getString("SubThemeLabel"));
            } 
            } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Initializes combo box with publisher's data
     */
    public void initComboPublisher(){
         try {
            String query = "select PublisherName FROM Publisher";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                cmbBox_AddPublisher.addItem(rs.getString("PublisherName"));
                cmbBox_EditPublisher.addItem(rs.getString("PublisherName"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
    /**
     * Checks ISBN
     */
    public void verifIsbn()
    {
        try {
            Vector v = new Vector();
            String query =  "select BookIsbn\n" +
                            "from BOOK";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                v.add(rs.getString("BookIsbn"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_Consult = new javax.swing.JScrollPane();
        panel_Consult1 = new javax.swing.JPanel();
        Up = new javax.swing.JPanel();
        lbl_TitleManageBook = new javax.swing.JLabel();
        Left_SideBar = new javax.swing.JPanel();
        lbl_TitleBook = new javax.swing.JLabel();
        btn_AddBook = new javax.swing.JButton();
        sep_Customer = new javax.swing.JSeparator();
        lbl_Status = new javax.swing.JLabel();
        tglBtn_BookStatus = new javax.swing.JToggleButton();
        lbl_TitleAttributes = new javax.swing.JLabel();
        sep_Attirbutes = new javax.swing.JSeparator();
        scrBar_Attributes = new javax.swing.JScrollPane();
        tbl_Attributes = new javax.swing.JTable();
        lbl_TitleComments = new javax.swing.JLabel();
        scrBar_Comments = new javax.swing.JScrollPane();
        tbl_Comments = new javax.swing.JTable();
        sep_Comments = new javax.swing.JSeparator();
        txtFld_Research = new javax.swing.JTextField();
        lbl_Research = new javax.swing.JLabel();
        lbl_Research2 = new javax.swing.JLabel();
        txtFld_Research2 = new javax.swing.JTextField();
        btn_DeleteBook = new javax.swing.JButton();
        Right_SideBar = new javax.swing.JPanel();
        LeftsideUp = new javax.swing.JPanel();
        lbl_TitleInfos = new javax.swing.JLabel();
        sep_Infos = new javax.swing.JSeparator();
        lbl_InfoTitle = new javax.swing.JLabel();
        lbl_InfoTitle2 = new javax.swing.JLabel();
        lbl_InfoAuthor = new javax.swing.JLabel();
        lbl_InfoAuthor2 = new javax.swing.JLabel();
        btn_EditBook = new javax.swing.JButton();
        Rightside = new javax.swing.JPanel();
        lbl_TitleNote = new javax.swing.JLabel();
        sep_Note = new javax.swing.JSeparator();
        scrBar_Note = new javax.swing.JScrollPane();
        txtArea_Note = new javax.swing.JTextArea();
        LeftsideDown = new javax.swing.JPanel();
        lbl_TitleOrder = new javax.swing.JLabel();
        sep_Order = new javax.swing.JSeparator();
        lbl_InfoStock = new javax.swing.JLabel();
        lbl_InfoStock2 = new javax.swing.JLabel();
        btn_Details = new javax.swing.JButton();
        Down = new javax.swing.JPanel();
        tabPan_Address4 = new javax.swing.JTabbedPane();
        panel_Shipping3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Summary = new javax.swing.JTextArea();
        lbl_InfoSummary = new javax.swing.JLabel();
        lbl_InfoSubtitle = new javax.swing.JLabel();
        lbl_InfoSubtitle2 = new javax.swing.JLabel();
        lbl_InfoPublisher = new javax.swing.JLabel();
        lbl_InfoPublisher2 = new javax.swing.JLabel();
        lbl_InfoCategory = new javax.swing.JLabel();
        lbl_InfoCategory2 = new javax.swing.JLabel();
        lbl_InfoSubcategory = new javax.swing.JLabel();
        lbl_InfoSubcategory2 = new javax.swing.JLabel();
        panel_Add = new javax.swing.JScrollPane();
        panel_Add1 = new javax.swing.JPanel();
        Up3 = new javax.swing.JPanel();
        lbl_TitleAddBook = new javax.swing.JLabel();
        Left_SideBar3 = new javax.swing.JPanel();
        sep_Customer1 = new javax.swing.JSeparator();
        lbl_ISBN = new javax.swing.JLabel();
        txtFld_AddISBN = new javax.swing.JTextField();
        txtFld_AddTitle = new javax.swing.JTextField();
        lbl_Title = new javax.swing.JLabel();
        txtFld_AddSubtitle = new javax.swing.JTextField();
        lbl_Subtitle = new javax.swing.JLabel();
        lbl_Author = new javax.swing.JLabel();
        lbl_Vauthor = new javax.swing.JLabel();
        lbl_Vsubtitle = new javax.swing.JLabel();
        lbl_Vtitle = new javax.swing.JLabel();
        lbl_Visbn = new javax.swing.JLabel();
        lbl_Summary = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtArea_AddSummary = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lbl_Picture2 = new javax.swing.JLabel();
        btn_AddPicture = new javax.swing.JButton();
        lbl_Vpicture = new javax.swing.JLabel();
        rBtn_AddTax1 = new javax.swing.JRadioButton();
        rBtn_AddTax2 = new javax.swing.JRadioButton();
        cmbBox_AddAuthor = new javax.swing.JComboBox();
        lbl_Theme = new javax.swing.JLabel();
        cmbBox_AddCategory = new javax.swing.JComboBox();
        lbl_Vcategory = new javax.swing.JLabel();
        lbl_Subtheme = new javax.swing.JLabel();
        cmbBox_AddSubcategory = new javax.swing.JComboBox();
        lbl_Vsubtheme = new javax.swing.JLabel();
        lbl_Publisher = new javax.swing.JLabel();
        cmbBox_AddPublisher = new javax.swing.JComboBox();
        lbl_Vpublisher = new javax.swing.JLabel();
        lbl_Price = new javax.swing.JLabel();
        txtFld_AddPrice = new javax.swing.JTextField();
        lbl_Vprice = new javax.swing.JLabel();
        lbl_Stock = new javax.swing.JLabel();
        txtFld_AddStock = new javax.swing.JTextField();
        lbl_Vstock = new javax.swing.JLabel();
        sep_Comments3 = new javax.swing.JSeparator();
        lbl_Tax = new javax.swing.JLabel();
        btn_BackAdd = new javax.swing.JButton();
        lbl_Book = new javax.swing.JLabel();
        btn_ValidateAdd = new javax.swing.JButton();
        Right_SideBar3 = new javax.swing.JPanel();
        LeftsideUp3 = new javax.swing.JPanel();
        lbl_TitleInfos3 = new javax.swing.JLabel();
        sep_Infos3 = new javax.swing.JSeparator();
        lbl_InfoTitle7 = new javax.swing.JLabel();
        lbl_InfoTitle8 = new javax.swing.JLabel();
        lbl_InfoAuthor7 = new javax.swing.JLabel();
        lbl_InfoAuthor8 = new javax.swing.JLabel();
        btn_EditBook1 = new javax.swing.JButton();
        Rightside3 = new javax.swing.JPanel();
        lbl_TitleNote3 = new javax.swing.JLabel();
        sep_Note3 = new javax.swing.JSeparator();
        scrBar_Note3 = new javax.swing.JScrollPane();
        txtArea_AddNote = new javax.swing.JTextArea();
        LeftsideDown3 = new javax.swing.JPanel();
        lbl_TitleOrder3 = new javax.swing.JLabel();
        sep_Order3 = new javax.swing.JSeparator();
        lbl_InfoStock7 = new javax.swing.JLabel();
        lbl_InfoStock8 = new javax.swing.JLabel();
        btn_Details3 = new javax.swing.JButton();
        Down3 = new javax.swing.JPanel();
        tabPan_Address8 = new javax.swing.JTabbedPane();
        panel_Shipping6 = new javax.swing.JPanel();
        panel_Edit = new javax.swing.JScrollPane();
        panel_Edit1 = new javax.swing.JPanel();
        Up2 = new javax.swing.JPanel();
        lbl_TitleManageBook3 = new javax.swing.JLabel();
        Left_SideBar2 = new javax.swing.JPanel();
        lbl_Book3 = new javax.swing.JLabel();
        sep_Customer2 = new javax.swing.JSeparator();
        sep_Comments2 = new javax.swing.JSeparator();
        btn_ValidateEdit = new javax.swing.JButton();
        btn_BackEdit = new javax.swing.JButton();
        txtFld_EditISBN = new javax.swing.JTextField();
        lbl_ISBN1 = new javax.swing.JLabel();
        lbl_Title1 = new javax.swing.JLabel();
        txtFld_EditTitle = new javax.swing.JTextField();
        txtFld_EditSubtitle = new javax.swing.JTextField();
        lbl_Subtitle1 = new javax.swing.JLabel();
        cmbBox_EditAuthor = new javax.swing.JComboBox();
        lbl_Author1 = new javax.swing.JLabel();
        lbl_Theme1 = new javax.swing.JLabel();
        cmbBox_EditCategory = new javax.swing.JComboBox();
        cmbBox_EditSubcategory = new javax.swing.JComboBox();
        lbl_Subtheme1 = new javax.swing.JLabel();
        lbl_Publisher1 = new javax.swing.JLabel();
        cmbBox_EditPublisher = new javax.swing.JComboBox();
        txtFld_EditPrice = new javax.swing.JTextField();
        lbl_Price1 = new javax.swing.JLabel();
        lbl_Stock1 = new javax.swing.JLabel();
        txtFld_EditStock = new javax.swing.JTextField();
        lbl_Vstock1 = new javax.swing.JLabel();
        lbl_Vprice1 = new javax.swing.JLabel();
        lbl_Vpublisher1 = new javax.swing.JLabel();
        lbl_Vsubcategory1 = new javax.swing.JLabel();
        lbl_Vauthor1 = new javax.swing.JLabel();
        lbl_Vcategory1 = new javax.swing.JLabel();
        lbl_Vsubtitle1 = new javax.swing.JLabel();
        lbl_Vtitle1 = new javax.swing.JLabel();
        lbl_Visbn1 = new javax.swing.JLabel();
        lbl_Tax1 = new javax.swing.JLabel();
        lbl_Picture1 = new javax.swing.JLabel();
        lbl_Summary1 = new javax.swing.JLabel();
        btn_EditPicture = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtArea_EditSummary = new javax.swing.JTextArea();
        rBtn_EditTax1 = new javax.swing.JRadioButton();
        rBtn_EditTax2 = new javax.swing.JRadioButton();
        lbl_Vpicture2 = new javax.swing.JLabel();
        Right_SideBar2 = new javax.swing.JPanel();
        LeftsideUp2 = new javax.swing.JPanel();
        lbl_TitleInfos2 = new javax.swing.JLabel();
        sep_Infos2 = new javax.swing.JSeparator();
        lbl_InfoTitle5 = new javax.swing.JLabel();
        lbl_InfoTitle6 = new javax.swing.JLabel();
        lbl_InfoAuthor5 = new javax.swing.JLabel();
        lbl_InfoAuthor6 = new javax.swing.JLabel();
        btn_EditBook2 = new javax.swing.JButton();
        Rightside2 = new javax.swing.JPanel();
        lbl_TitleNote2 = new javax.swing.JLabel();
        sep_Note2 = new javax.swing.JSeparator();
        scrBar_Note2 = new javax.swing.JScrollPane();
        txtArea_EditNote = new javax.swing.JTextArea();
        LeftsideDown2 = new javax.swing.JPanel();
        lbl_TitleOrder2 = new javax.swing.JLabel();
        sep_Order2 = new javax.swing.JSeparator();
        lbl_InfoStock5 = new javax.swing.JLabel();
        lbl_InfoStock6 = new javax.swing.JLabel();
        btn_Details2 = new javax.swing.JButton();
        Down2 = new javax.swing.JPanel();
        tabPan_Address7 = new javax.swing.JTabbedPane();
        panel_Shipping5 = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        panel_Consult.setBorder(null);

        panel_Consult1.setBackground(new java.awt.Color(242, 242, 242));

        Up.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageBook.setText("MANAGE BOOK");

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

        Left_SideBar.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleBook.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_TitleBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_TitleBook.setText("Book");

        btn_AddBook.setBackground(new java.awt.Color(135, 199, 213));
        btn_AddBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_AddBook.setText("ADD");
        btn_AddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_Book(evt);
            }
        });

        lbl_Status.setText("Status:");

        tglBtn_BookStatus.setBackground(new java.awt.Color(135, 199, 213));
        tglBtn_BookStatus.setText("Enable");
        tglBtn_BookStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Book_Status(evt);
            }
        });

        lbl_TitleAttributes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Identity_32px.png"))); // NOI18N
        lbl_TitleAttributes.setText("Attributes");

        tbl_Attributes.setAutoCreateRowSorter(true);
        tbl_Attributes.setModel(initTable());
        tbl_Attributes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Attributes.setRowHeight(30);
        tbl_Attributes.setSelectionBackground(new java.awt.Color(135, 199, 213));
        tbl_Attributes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Attributes.setShowVerticalLines(false);
        tbl_Attributes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Select_Book(evt);
            }
        });
        scrBar_Attributes.setViewportView(tbl_Attributes);

        lbl_TitleComments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Comment_32px.png"))); // NOI18N
        lbl_TitleComments.setText("Comment");

        tbl_Comments.setAutoCreateRowSorter(true);
        tbl_Comments.setModel(initTableComment());
        tbl_Comments.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbl_Comments.setRowHeight(30);
        tbl_Comments.setSelectionBackground(new java.awt.Color(135, 199, 213));
        tbl_Comments.setSelectionForeground(new java.awt.Color(0, 0, 0));
        tbl_Comments.setShowVerticalLines(false);
        scrBar_Comments.setViewportView(tbl_Comments);

        lbl_Research.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_Research.setText("Research :");
        lbl_Research.setAlignmentY(1.0F);

        lbl_Research2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        lbl_Research2.setText("Research :");
        lbl_Research2.setAlignmentY(1.0F);

        btn_DeleteBook.setBackground(new java.awt.Color(135, 199, 213));
        btn_DeleteBook.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_DeleteBook.setText("Delete");
        btn_DeleteBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_Book(evt);
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
                            .addComponent(sep_Attirbutes)
                            .addComponent(sep_Customer)
                            .addComponent(scrBar_Comments, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sep_Comments)
                            .addComponent(scrBar_Attributes)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(lbl_TitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 39, Short.MAX_VALUE)
                                .addComponent(btn_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                .addComponent(btn_DeleteBook, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                        .addComponent(lbl_Research2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFld_Research2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                                        .addComponent(lbl_Research)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Left_SideBarLayout.createSequentialGroup()
                                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_TitleAttributes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_TitleComments, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(Left_SideBarLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tglBtn_BookStatus)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        Left_SideBarLayout.setVerticalGroup(
            Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_TitleBook)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBarLayout.createSequentialGroup()
                        .addComponent(btn_AddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(sep_Customer, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Status)
                    .addComponent(tglBtn_BookStatus))
                .addGap(27, 27, 27)
                .addComponent(lbl_TitleAttributes)
                .addGap(7, 7, 7)
                .addComponent(sep_Attirbutes, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_Research, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Research)
                    .addComponent(btn_DeleteBook))
                .addGap(7, 7, 7)
                .addComponent(scrBar_Attributes, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_TitleComments)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(Left_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Research2)
                    .addComponent(txtFld_Research2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Comments, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Right_SideBar.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos.setText("Infos");

        lbl_InfoTitle.setText("Title : ");

        lbl_InfoTitle2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoAuthor.setText("Author : ");

        lbl_InfoAuthor2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditBook.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditBook.setText("Edit Book");
        btn_EditBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_Book(evt);
            }
        });

        javax.swing.GroupLayout LeftsideUpLayout = new javax.swing.GroupLayout(LeftsideUp);
        LeftsideUp.setLayout(LeftsideUpLayout);
        LeftsideUpLayout.setHorizontalGroup(
            LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUpLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Infos)
                    .addComponent(btn_EditBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(LeftsideUpLayout.createSequentialGroup()
                        .addComponent(lbl_TitleInfos, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(LeftsideUpLayout.createSequentialGroup()
                        .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_InfoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_InfoAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InfoAuthor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_InfoTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        LeftsideUpLayout.setVerticalGroup(
            LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleInfos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Infos, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoAuthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoAuthor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditBook)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote.setText("Note");

        scrBar_Note.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Note.setEditable(false);
        txtArea_Note.setColumns(20);
        txtArea_Note.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
        txtArea_Note.setLineWrap(true);
        txtArea_Note.setRows(5);
        scrBar_Note.setViewportView(txtArea_Note);

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
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrBar_Note, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        RightsideLayout.setVerticalGroup(
            RightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleNote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrBar_Note)
                .addContainerGap())
        );

        LeftsideDown.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        lbl_TitleOrder.setText("Stock");

        lbl_InfoStock.setText("Current Book :");

        lbl_InfoStock2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_InfoStock2.setText("120");

        btn_Details.setBackground(new java.awt.Color(135, 199, 213));
        btn_Details.setText("View details");

        javax.swing.GroupLayout LeftsideDownLayout = new javax.swing.GroupLayout(LeftsideDown);
        LeftsideDown.setLayout(LeftsideDownLayout);
        LeftsideDownLayout.setHorizontalGroup(
            LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftsideDownLayout.createSequentialGroup()
                .addGroup(LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftsideDownLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lbl_InfoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(LeftsideDownLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(LeftsideDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Details, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sep_Order, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LeftsideDownLayout.createSequentialGroup()
                                .addComponent(lbl_TitleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)))))
                .addContainerGap())
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
                    .addComponent(lbl_InfoStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStock))
                .addGap(18, 18, 18)
                .addComponent(btn_Details)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBarLayout = new javax.swing.GroupLayout(Right_SideBar);
        Right_SideBar.setLayout(Right_SideBarLayout);
        Right_SideBarLayout.setHorizontalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBarLayout.setVerticalGroup(
            Right_SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBarLayout.createSequentialGroup()
                .addComponent(LeftsideUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down.setBackground(new java.awt.Color(242, 242, 242));

        panel_Shipping3.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_Summary.setEditable(false);
        txtArea_Summary.setColumns(20);
        txtArea_Summary.setLineWrap(true);
        txtArea_Summary.setRows(5);
        jScrollPane1.setViewportView(txtArea_Summary);

        lbl_InfoSummary.setText("Summary :");

        lbl_InfoSubtitle.setText("Sub-Title :");

        lbl_InfoPublisher.setText("Publisher :");

        lbl_InfoCategory.setText("Category :");

        lbl_InfoSubcategory.setText("Sub-Category :");

        javax.swing.GroupLayout panel_Shipping3Layout = new javax.swing.GroupLayout(panel_Shipping3);
        panel_Shipping3.setLayout(panel_Shipping3Layout);
        panel_Shipping3Layout.setHorizontalGroup(
            panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Shipping3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InfoSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Shipping3Layout.createSequentialGroup()
                        .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Shipping3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoPublisher)
                                .addGap(18, 18, 18)
                                .addComponent(lbl_InfoPublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(lbl_InfoSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_Shipping3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoSubtitle)
                                .addGap(28, 28, 28)
                                .addComponent(lbl_InfoSubtitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lbl_InfoCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_Shipping3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoCategory2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addContainerGap())
                            .addComponent(lbl_InfoSubcategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        panel_Shipping3Layout.setVerticalGroup(
            panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Shipping3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(lbl_InfoSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InfoCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Shipping3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_InfoSubtitle)
                            .addComponent(lbl_InfoSubtitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_InfoCategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(panel_Shipping3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_InfoPublisher)
                    .addComponent(lbl_InfoPublisher2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Shipping3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lbl_InfoSubcategory))
                    .addComponent(lbl_InfoSubcategory2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        tabPan_Address4.addTab("Information Book", panel_Shipping3);

        javax.swing.GroupLayout DownLayout = new javax.swing.GroupLayout(Down);
        Down.setLayout(DownLayout);
        DownLayout.setHorizontalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address4)
                .addContainerGap())
        );
        DownLayout.setVerticalGroup(
            DownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DownLayout.createSequentialGroup()
                .addComponent(tabPan_Address4, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        Up3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleAddBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleAddBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleAddBook.setText("ADD BOOK");

        javax.swing.GroupLayout Up3Layout = new javax.swing.GroupLayout(Up3);
        Up3.setLayout(Up3Layout);
        Up3Layout.setHorizontalGroup(
            Up3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up3Layout.setVerticalGroup(
            Up3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleAddBook, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_ISBN.setText("ISBN :");

        txtFld_AddISBN.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFld_AddISBN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddISBNMouseExited(evt);
            }
        });

        txtFld_AddTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddTitleMouseExited(evt);
            }
        });

        lbl_Title.setText("Ttile :");

        txtFld_AddSubtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddSubtitleMouseExited(evt);
            }
        });

        lbl_Subtitle.setText("Sub-Title :");

        lbl_Author.setText("Author :");

        lbl_Vauthor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vsubtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vtitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Visbn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Summary.setText("Summary :");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_AddSummary.setColumns(20);
        txtArea_AddSummary.setLineWrap(true);
        txtArea_AddSummary.setRows(5);
        jScrollPane4.setViewportView(txtArea_AddSummary);

        jLabel1.setText("Ex : 978-0-000-00000-0");

        lbl_Picture2.setText("Add picture :");

        btn_AddPicture.setText("Picture");
        btn_AddPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddPictureActionPerformed(evt);
            }
        });

        lbl_Vpicture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        buttonGroup1.add(rBtn_AddTax1);
        rBtn_AddTax1.setText("2,1 %");
        rBtn_AddTax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn_AddTax1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtn_AddTax2);
        rBtn_AddTax2.setText("5,5 %");
        rBtn_AddTax2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn_AddTax2ActionPerformed(evt);
            }
        });

        cmbBox_AddAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_AddAuthorActionPerformed(evt);
            }
        });

        lbl_Theme.setText("Theme :");

        cmbBox_AddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_AddCategoryActionPerformed(evt);
            }
        });

        lbl_Vcategory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Subtheme.setText("Sub-Theme :");

        cmbBox_AddSubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_AddSubcategoryActionPerformed(evt);
            }
        });

        lbl_Vsubtheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Publisher.setText("Publisher :");

        cmbBox_AddPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_AddPublisherActionPerformed(evt);
            }
        });

        lbl_Vpublisher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Price.setText("Price :");

        txtFld_AddPrice.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_AddPrice.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_AddPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddPriceMouseExited(evt);
            }
        });

        lbl_Vprice.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Stock.setText("Stock :");

        txtFld_AddStock.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_AddStock.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_AddStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_AddStockMouseExited(evt);
            }
        });

        lbl_Vstock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Tax.setText("Tax");

        btn_BackAdd.setBackground(new java.awt.Color(135, 199, 213));
        btn_BackAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_BackAdd.setText("Back");
        btn_BackAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_Add(evt);
            }
        });

        lbl_Book.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Book.setText("Book");

        btn_ValidateAdd.setBackground(new java.awt.Color(135, 199, 213));
        btn_ValidateAdd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ValidateAdd.setText("Validate");
        btn_ValidateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Validate_Add(evt);
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
                        .addComponent(sep_Customer1))
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBox_AddPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Subtheme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBox_AddSubcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Theme, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBox_AddCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Subtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddSubtitle, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddTitle))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFld_AddISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbBox_AddAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_Vsubtitle)
                                                    .addComponent(lbl_Vauthor)
                                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(lbl_Vtitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(lbl_Visbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_Summary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbl_Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbl_Picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lbl_Vcategory)
                                                    .addComponent(lbl_Vsubtheme)
                                                    .addComponent(lbl_Vpublisher)
                                                    .addComponent(lbl_Vprice))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                                .addComponent(btn_AddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbl_Vpicture))
                                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                                .addComponent(rBtn_AddTax1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rBtn_AddTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(40, 40, 40))))
                                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                        .addComponent(lbl_Vstock)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sep_Comments3))
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_Book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_ValidateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BackAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Left_SideBar3Layout.setVerticalGroup(
            Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Book)
                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BackAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ValidateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Customer1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar3Layout.createSequentialGroup()
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Vtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Title, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFld_AddTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Picture2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_AddPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbl_Vpicture, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Left_SideBar3Layout.createSequentialGroup()
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_Subtitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtFld_AddSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_Vsubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbl_Summary, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Author, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_AddAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Vauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Vcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Theme, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_AddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Subtheme, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBox_AddSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Vsubtheme, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Vpublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Publisher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_AddPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFld_AddPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Vprice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_AddISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rBtn_AddTax1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBtn_AddTax2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tax, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Visbn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_AddStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Vstock, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sep_Comments3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Right_SideBar3.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos3.setText("Infos");

        lbl_InfoTitle7.setText("Title : ");

        lbl_InfoTitle8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoAuthor7.setText("Author : ");

        lbl_InfoAuthor8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditBook1.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditBook1.setText("Edit Book");

        javax.swing.GroupLayout LeftsideUp3Layout = new javax.swing.GroupLayout(LeftsideUp3);
        LeftsideUp3.setLayout(LeftsideUp3Layout);
        LeftsideUp3Layout.setHorizontalGroup(
            LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoTitle7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoTitle8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(LeftsideUp3Layout.createSequentialGroup()
                        .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp3Layout.createSequentialGroup()
                                .addComponent(lbl_InfoAuthor7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoAuthor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sep_Infos3)
                            .addComponent(btn_EditBook1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lbl_InfoTitle7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoTitle8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoAuthor7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoAuthor8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditBook1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside3.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote3.setText("Note");

        scrBar_Note3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_AddNote.setColumns(20);
        txtArea_AddNote.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
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
        lbl_TitleOrder3.setText("Stock");

        lbl_InfoStock7.setText("Current Book :");

        lbl_InfoStock8.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_InfoStock8.setText("120");

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
                        .addComponent(lbl_InfoStock7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lbl_InfoStock8, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStock7))
                .addGap(18, 18, 18)
                .addComponent(btn_Details3)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Right_SideBar3Layout = new javax.swing.GroupLayout(Right_SideBar3);
        Right_SideBar3.setLayout(Right_SideBar3Layout);
        Right_SideBar3Layout.setHorizontalGroup(
            Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Right_SideBar3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LeftsideUp3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LeftsideDown3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(Rightside3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        Right_SideBar3Layout.setVerticalGroup(
            Right_SideBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rightside3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(Right_SideBar3Layout.createSequentialGroup()
                .addComponent(LeftsideUp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LeftsideDown3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Down3.setBackground(new java.awt.Color(242, 242, 242));

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

        tabPan_Address8.addTab("Information Book", panel_Shipping6);

        javax.swing.GroupLayout Down3Layout = new javax.swing.GroupLayout(Down3);
        Down3.setLayout(Down3Layout);
        Down3Layout.setHorizontalGroup(
            Down3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address8)
                .addContainerGap())
        );
        Down3Layout.setVerticalGroup(
            Down3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down3Layout.createSequentialGroup()
                .addComponent(tabPan_Address8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_Add1Layout = new javax.swing.GroupLayout(panel_Add1);
        panel_Add1.setLayout(panel_Add1Layout);
        panel_Add1Layout.setHorizontalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Up3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Add1Layout.createSequentialGroup()
                .addComponent(Left_SideBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Down3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Right_SideBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        panel_Add1Layout.setVerticalGroup(
            panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Add1Layout.createSequentialGroup()
                .addComponent(Up3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(panel_Add1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_Add1Layout.createSequentialGroup()
                        .addComponent(Right_SideBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Down3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Left_SideBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_Add.setViewportView(panel_Add1);

        add(panel_Add, "card6");

        panel_Edit.setBorder(null);

        panel_Edit1.setBackground(new java.awt.Color(242, 242, 242));

        Up2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleManageBook3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_TitleManageBook3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Google_Drive_96px.png"))); // NOI18N
        lbl_TitleManageBook3.setText("EDIT BOOK");

        javax.swing.GroupLayout Up2Layout = new javax.swing.GroupLayout(Up2);
        Up2.setLayout(Up2Layout);
        Up2Layout.setHorizontalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Up2Layout.setVerticalGroup(
            Up2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Up2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_TitleManageBook3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        Left_SideBar2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Book3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        lbl_Book3.setText("Book");

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

        txtFld_EditISBN.setPreferredSize(new java.awt.Dimension(150, 25));

        lbl_ISBN1.setText("ISBN :");

        lbl_Title1.setText("Ttile :");

        txtFld_EditTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditTitleMouseExited(evt);
            }
        });

        txtFld_EditSubtitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditSubtitleMouseExited(evt);
            }
        });

        lbl_Subtitle1.setText("Sub-Title :");

        cmbBox_EditAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_EditAuthorActionPerformed(evt);
            }
        });

        lbl_Author1.setText("Author :");

        lbl_Theme1.setText("Theme :");

        cmbBox_EditCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_EditCategoryActionPerformed(evt);
            }
        });

        cmbBox_EditSubcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_EditSubcategoryActionPerformed(evt);
            }
        });

        lbl_Subtheme1.setText("Sub-Theme :");

        lbl_Publisher1.setText("Publisher :");

        cmbBox_EditPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBox_EditPublisherActionPerformed(evt);
            }
        });

        txtFld_EditPrice.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_EditPrice.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_EditPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditPriceMouseExited(evt);
            }
        });

        lbl_Price1.setText("Price :");

        lbl_Stock1.setText("Stock :");

        txtFld_EditStock.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        txtFld_EditStock.setMinimumSize(new java.awt.Dimension(100, 25));
        txtFld_EditStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtFld_EditStockMouseExited(evt);
            }
        });

        lbl_Vstock1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vprice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vpublisher1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vsubcategory1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vauthor1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vcategory1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vsubtitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Vtitle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Visbn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        lbl_Tax1.setText("Tax");

        lbl_Picture1.setText("Add picture :");

        lbl_Summary1.setText("Summary :");

        btn_EditPicture.setText("Picture");
        btn_EditPicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EditPictureActionPerformed(evt);
            }
        });

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setToolTipText("");

        txtArea_EditSummary.setColumns(20);
        txtArea_EditSummary.setLineWrap(true);
        txtArea_EditSummary.setRows(5);
        jScrollPane5.setViewportView(txtArea_EditSummary);

        buttonGroup1.add(rBtn_EditTax1);
        rBtn_EditTax1.setText("2,1 %");
        rBtn_EditTax1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn_EditTax1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rBtn_EditTax2);
        rBtn_EditTax2.setText("5,5 %");
        rBtn_EditTax2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtn_EditTax2ActionPerformed(evt);
            }
        });

        lbl_Vpicture2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/valid_32px.gif"))); // NOI18N

        javax.swing.GroupLayout Left_SideBar2Layout = new javax.swing.GroupLayout(Left_SideBar2);
        Left_SideBar2.setLayout(Left_SideBar2Layout);
        Left_SideBar2Layout.setHorizontalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sep_Comments2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addComponent(lbl_Book3, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sep_Customer2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Publisher1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBox_EditPublisher, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Subtheme1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBox_EditSubcategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Theme1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBox_EditCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Subtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditSubtitle))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditTitle))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_ISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_EditISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Author1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbBox_EditAuthor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Vsubtitle1)
                                            .addComponent(lbl_Vauthor1)
                                            .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbl_Vtitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbl_Visbn1)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Summary1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbl_Tax1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbl_Picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_Vcategory1)
                                            .addComponent(lbl_Vsubcategory1)
                                            .addComponent(lbl_Vpublisher1)
                                            .addComponent(lbl_Vprice1))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(btn_EditPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_Vpicture2))
                                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                        .addComponent(rBtn_EditTax1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rBtn_EditTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(40, 40, 40))))
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Vstock1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        Left_SideBar2Layout.setVerticalGroup(
            Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_Book3)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_BackEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_ValidateEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sep_Customer2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Left_SideBar2Layout.createSequentialGroup()
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbl_Vtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFld_EditTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Picture1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn_EditPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Left_SideBar2Layout.createSequentialGroup()
                                .addComponent(lbl_Vpicture2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Left_SideBar2Layout.createSequentialGroup()
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_Subtitle1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtFld_EditSubtitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_Vsubtitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lbl_Summary1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Author1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_EditAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Vauthor1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Vcategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Theme1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_EditCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Subtheme1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbBox_EditSubcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_Vsubcategory1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Vpublisher1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Publisher1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbBox_EditPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_Price1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFld_EditPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbl_Vprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_ISBN1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFld_EditISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rBtn_EditTax1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rBtn_EditTax2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_Tax1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_Visbn1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Left_SideBar2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_Stock1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFld_EditStock, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_Vstock1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sep_Comments2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
        );

        Right_SideBar2.setBackground(new java.awt.Color(242, 242, 242));

        LeftsideUp2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleInfos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Idea_32px.png"))); // NOI18N
        lbl_TitleInfos2.setText("Infos");

        lbl_InfoTitle5.setText("Title : ");

        lbl_InfoTitle6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        lbl_InfoAuthor5.setText("Author : ");

        lbl_InfoAuthor6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N

        btn_EditBook2.setBackground(new java.awt.Color(135, 199, 213));
        btn_EditBook2.setText("Edit Book");

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
                                .addComponent(lbl_InfoTitle5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                                .addComponent(lbl_TitleInfos2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(LeftsideUp2Layout.createSequentialGroup()
                        .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(LeftsideUp2Layout.createSequentialGroup()
                                .addComponent(lbl_InfoAuthor5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_InfoAuthor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sep_Infos2)
                            .addComponent(btn_EditBook2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(lbl_InfoTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(LeftsideUp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_InfoAuthor5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_InfoAuthor6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_EditBook2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        Rightside2.setBackground(new java.awt.Color(255, 255, 255));

        lbl_TitleNote2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_TitleNote2.setText("Note");

        scrBar_Note2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtArea_EditNote.setColumns(20);
        txtArea_EditNote.setFont(new java.awt.Font("Arial Narrow", 0, 13)); // NOI18N
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
        lbl_TitleOrder2.setText("Stock");

        lbl_InfoStock5.setText("Current Book :");

        lbl_InfoStock6.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lbl_InfoStock6.setText("120");

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
                        .addComponent(lbl_InfoStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_InfoStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(lbl_InfoStock6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_InfoStock5))
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
            .addGap(0, 477, Short.MAX_VALUE)
        );

        tabPan_Address7.addTab("Information Book", panel_Shipping5);

        javax.swing.GroupLayout Down2Layout = new javax.swing.GroupLayout(Down2);
        Down2.setLayout(Down2Layout);
        Down2Layout.setHorizontalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabPan_Address7)
                .addContainerGap())
        );
        Down2Layout.setVerticalGroup(
            Down2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Down2Layout.createSequentialGroup()
                .addComponent(tabPan_Address7, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        add(panel_Edit, "card7");
    }// </editor-fold>//GEN-END:initComponents

    private void Add_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_Book
        // TODO add your handling code here:
        lbl_Vprice.setVisible(false);
        lbl_Visbn.setVisible(false);
        lbl_Vtitle.setVisible(false);
        lbl_Vcategory.setVisible(false);
        lbl_Vauthor.setVisible(false);
        lbl_Vpicture.setVisible(false);
        lbl_Vsubtitle.setVisible(false);
        lbl_Vsubtheme.setVisible(false);
        lbl_Vpublisher.setVisible(false);
        btn_AddPicture.setEnabled(false);
        lbl_Vstock.setVisible(false);
        panel_Add.setVisible(true);
        panel_Consult.setVisible(false);
        verifIsbn();
    }//GEN-LAST:event_Add_Book

    private void txtFld_AddISBNMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddISBNMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddISBN.getText();
            if (s.matches("[9][7][8-9]*[-| ][0-9]*[-| ][0-9]*[-| ][0-9]*[-| ]"
                    + "[0-9]*[0-9]"))
            {
                lbl_Visbn.setVisible(true);
                Vector v = new Vector();
                String query =  "select BookIsbn\n" +
                                "from BOOK";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("BookIsbn"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"ISBN is already use !",
                            "ISBN Error !", JOptionPane.WARNING_MESSAGE);
                    txtFld_AddISBN.setText("");
                    lbl_Visbn.setVisible(false);
                }
            }
            else if ("".equals(s))
            {
                lbl_Visbn.setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"The ISBN has 13 digits and "
                    + "starts with 978 or 979 !","ISBN Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                txtFld_AddISBN.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_txtFld_AddISBNMouseExited

    private void txtFld_AddTitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddTitleMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_AddTitle.getText();
            if (s.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$"))
            {
                lbl_Vtitle.setVisible(true);
                Vector v = new Vector();
                String query =  "select BookTitle\n" +
                                "from BOOK";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("BookTitle"));
                }
                int p = 0;
                for (int i = 0 ; i < v.size(); i++)
                {
                    if ( s.equals(v.get(i).toString())) p++;
                }
                if ( p == 1)
                {
                    JOptionPane.showMessageDialog(this,"This book already "
                        + "exists !","Title Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_AddTitle.setText("");
                    lbl_Vtitle.setVisible(false);
                }
            }
            else
            {
                lbl_Vtitle.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_txtFld_AddTitleMouseExited

    private void txtFld_AddSubtitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddSubtitleMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddSubtitle.getText();
        if (s.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$"))
        {
            lbl_Vsubtitle.setVisible(true);
        }
        else
        {
            lbl_Vsubtitle.setVisible(false);
        }
    }//GEN-LAST:event_txtFld_AddSubtitleMouseExited

    private void cmbBox_AddAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_AddAuthorActionPerformed
        // TODO add your handling code here:
        try {
            String s = cmbBox_AddAuthor.getSelectedItem().toString();
            String query =  "select a.AuthorId\n" +
                            "from author a\n" +
                            "where '" + s + "' = CONCAT( AuthorLastname, ' ' , "
                    + "AuthorFirstname)";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            authorId = rs.getLong("AuthorId");
            lbl_Vauthor.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_cmbBox_AddAuthorActionPerformed

    private void cmbBox_AddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_AddCategoryActionPerformed
        // TODO add your handling code here:
        try {
            cmbBox_AddSubcategory.setSelectedItem(evt);
            String s = cmbBox_AddCategory.getSelectedItem().toString();
            String query =  "select ThemeId\n" +
                            "from Theme\n" +
                            "where '" + s + "' = ThemeLabel";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            categoryId = rs.getLong("ThemeId");
            initComboSubcategoryAdd();
            lbl_Vcategory.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, 
                                                                    null, ex);
        }
    }//GEN-LAST:event_cmbBox_AddCategoryActionPerformed

    private void cmbBox_AddSubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_AddSubcategoryActionPerformed
        // TODO add your handling code here:
        try {
            if ( cmbBox_AddSubcategory.getSelectedItem() != null )
            {
                String s = cmbBox_AddSubcategory.getSelectedItem().toString();
                String query =  "select SubThemeId\n" +
                "from subtheme\n" +
                "where subthemeLabel = '" + s + "'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                subcategoryId = rs.getLong("SubThemeId");
                lbl_Vsubtheme.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_AddSubcategoryActionPerformed

    private void cmbBox_AddPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_AddPublisherActionPerformed
        // TODO add your handling code here:
        try {
            String s = cmbBox_AddPublisher.getSelectedItem().toString();
            String query =  "select PublisherId\n" +
                            "from Publisher \n" +
                            "where '" + s + "' = PublisherName";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            rs.next();
            publisherId = rs.getLong("PublisherId");
            lbl_Vpublisher.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_AddPublisherActionPerformed

    private void txtFld_AddPriceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddPriceMouseExited
        // TODO add your handling code here:
         String s = txtFld_AddPrice.getText();
        if (s.matches("[0-9]{1,}[.,]{0,1}[0-9]{0,2}?$"))
        {
            lbl_Vprice.setVisible(true);
        }
        else if ( "".equals(s))
        {
            lbl_Vprice.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the "
                    + "price","Price Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_AddPrice.setText("");
        }
    }//GEN-LAST:event_txtFld_AddPriceMouseExited

    private void txtFld_AddStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_AddStockMouseExited
        // TODO add your handling code here:
        String s = txtFld_AddStock.getText();
        if (s.matches("^[0-9]+(-[0-9]+)?$"))
        {
            lbl_Vstock.setVisible(true);
        }
        else
        {
            lbl_Vstock.setVisible(false);
        }
    }//GEN-LAST:event_txtFld_AddStockMouseExited

    private void rBtn_AddTax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn_AddTax1ActionPerformed
        // TODO add your handling code here:
        try
        {
            if (rBtn_AddTax1.isSelected())
            {
                String query =  "SELECT taxId\n" +
                                "FROM TAX a\n" +
                                "WHERE TaxLabel = '2.1'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                taxId = rs.getLong("taxId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rBtn_AddTax1ActionPerformed

    private void rBtn_AddTax2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn_AddTax2ActionPerformed
        // TODO add your handling code here:
        try
        {
            if (rBtn_AddTax2.isSelected())
            {
                String query =  "SELECT taxId\n" +
                "FROM TAX a\n" +
                "WHERE TaxLabel = '5.5'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                taxId = rs.getLong("taxId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rBtn_AddTax2ActionPerformed

    private void btn_AddPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddPictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_AddPictureActionPerformed

    private void Validate_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Add
        // TODO add your handling code here:
        if ( !"".equals(txtFld_AddISBN.getText()) & !"".equals(txtFld_AddTitle.
                                                    getText()) & taxId != null)
        {
            int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", 
                "Confirmation", JOptionPane.OK_CANCEL_OPTION,JOptionPane.
                                                                ERROR_MESSAGE);
            if ( result == JOptionPane.OK_OPTION)
            {
                Vector v = new Vector();
                v.add(txtFld_AddISBN.getText());
                v.add(subcategoryId);
                v.add(authorId);
                v.add(publisherId);
                v.add(taxId);
                v.add(txtFld_AddTitle.getText());
                v.add(txtFld_AddSubtitle.getText());
                v.add(txtArea_AddSummary.getText());
                v.add(txtFld_AddPrice.getText());
                v.add(txtFld_AddStock.getText());
                v.add(txtArea_AddNote.getText());

                try {
                    String query = ("Insert into book (BookISBN, SubThemeId, "
                        + "AuthorId, PublisherId, TaxId, BookTitle, BookSubTitle,"
                            + " BookSummary, BookPrice, BookStock, BookNote)\n" +
                                    "Values (?,?,?,?,?,?,?,?,?,?,?)");

                    PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                    int j = 0;
                    for (int i = 1; i <= v.size(); i++)
                    {
                        pstmt.setObject(i, v.get(j));
                        j++;
                    }
                    pstmt.executeUpdate();
                    Vector v2 = new Vector();
                    String query2 = "SELECT b.BookIsbn, BookCover, BookTitle, "
                        + "CONCAT(AuthorLastname , ' ' ,AuthorFirstname)as "
                        + "BookAuthor, SubThemeLabel,\n" +
                        "BookPrice, StatusTypeLabel\n" +
                        "FROM BOOK b\n" +
                        "LEFT JOIN AUTHOR a\n" +
                        "ON b.AuthorId = a.AuthorId\n" +
                        "LEFT JOIN SUBTHEME st\n" +
                        "ON b.SubThemeId = st.SubThemeId\n" +
                        "LEFT JOIN SETBOOK sb\n" +
                        "ON b.BookIsbn = sb.BookIsbn\n" +
                        "LEFT JOIN STATUSTYPE stp\n" +
                        "ON sb.StatusTypeId = stp.StatusTypeId\n" +
                        "WHERE b.BookIsbn = '" + txtFld_AddISBN.getText() +"'";
                    System.out.println(txtFld_AddISBN.getText());
                    Statement stmt2 = con.connectURL().createStatement();
                    ResultSet rs2 = stmt2.executeQuery(query2);
                    while(rs2.next())
                    {
                        v2.add(rs2.getString("BookIsbn"));
                        v2.add(rs2.getBytes("BookCover"));   
                        v2.add(rs2.getString("BookTitle"));
                        v2.add(rs2.getString("BookAuthor"));
                        v2.add(rs2.getString("SubThemeLabel"));
                        v2.add(rs2.getBigDecimal("BookPrice"));
                        v2.add(rs2.getString("StatusTypeLabel"));
                        
                    } 
                    Statement st = con.connectURL().createStatement();
                    st.executeUpdate("INSERT INTO SETBOOK (StatusTypeId, BookIsbn)\n" +
                                     "VALUES (8, '" + v2.get(0).toString() + "')");
                    int row = tbl_Attributes.getRowCount();
                    ((DefaultTableModel)tbl_Attributes.getModel()).addRow(v2);
                    ((DefaultTableModel)tbl_Attributes.getModel()).
                    setDataVector(book.getDataRowBook(), book.getDataColumnBook());
                } catch (SQLException ex) {
                    Logger.getLogger(Book_JPanel.class.getName()).log(Level.
                                                            SEVERE, null, ex);
                }
                txtFld_AddISBN.setText("");
                txtFld_AddTitle.setText("");
                txtFld_AddSubtitle.setText("");
                txtFld_AddPrice.setText("");
                txtFld_AddStock.setText("");
                txtArea_AddSummary.setText("");
                txtArea_AddNote.setText("");
                panel_Add.setVisible(false);
                panel_Consult.setVisible(true);
                JOptionPane.showMessageDialog(this,"Add is complete !",
                        "Confirmation !", JOptionPane.INFORMATION_MESSAGE);
            }
            else if ( result == JOptionPane.CANCEL_OPTION)
            {
                JOptionPane.showMessageDialog(this,"Addition canceled !",
                        "Cancellation !", JOptionPane.INFORMATION_MESSAGE);
                txtFld_AddISBN.setText("");
                txtFld_AddTitle.setText("");
                txtFld_AddSubtitle.setText("");
                txtFld_AddPrice.setText("");
                txtFld_AddStock.setText("");
                txtArea_AddSummary.setText("");
                txtArea_AddNote.setText("");
                panel_Add.setVisible(false);
                panel_Consult.setVisible(true);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Missing data !","Warning !", 
                                                JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Validate_Add

    private void Back_Add(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Add
        // TODO add your handling code here:
        txtFld_AddISBN.setText("");
        txtFld_AddTitle.setText("");
        txtFld_AddSubtitle.setText("");
        txtFld_AddPrice.setText("");
        txtFld_AddStock.setText("");
        txtArea_AddSummary.setText("");
        txtArea_AddNote.setText("");
        panel_Add.setVisible(false);
        panel_Edit.setVisible(false);
        panel_Consult.setVisible(true);
    }//GEN-LAST:event_Back_Add

    private void Select_Book(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Select_Book
        // TODO add your handling code here:
        try {
            vInfo = new Vector();
            selectedRow = tbl_Attributes.getSelectedRow();
            String s = tbl_Attributes.getValueAt(selectedRow, 0).toString();
            String query =  "SELECT BookIsbn, BookTitle, BookSubtitle, "
                + "SubThemeLabel, ThemeLabel, CONCAT(AuthorLastname , ' ' ,"
                + "AuthorFirstname) as Author, BookSummary, PublisherName,"
                + " BookPrice, BookStock, BookNote\n" +
                "FROM BOOK b\n" +
                "LEFT join AUTHOR a\n" +
                "ON b.AuthorId = a.AuthorId\n" +
                "LEFT join SUBTHEME st\n" +
                "ON b.SubThemeId = st.SubThemeId\n" +
                "LEFT join THEME t\n" +
                "ON t.ThemeId = st.ThemeId\n" +
                "LEFT join PUBLISHER p\n" +
                "ON p.PublisherId = b.PublisherId\n" +
                "WHERE bookIsbn = '" + s + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
                vInfo.add(rs.getString("BookIsbn"));
                vInfo.add(rs.getString("BookTitle"));
                vInfo.add(rs.getString("BookSubtitle"));
                vInfo.add(rs.getString("SubThemeLabel"));
                vInfo.add(rs.getString("ThemeLabel"));
                vInfo.add(rs.getString("Author"));
                vInfo.add(rs.getString("BookSummary"));
                vInfo.add(rs.getString("PublisherName"));
                vInfo.add(rs.getBigDecimal("BookPrice"));
                vInfo.add(rs.getInt("BookStock"));
                vInfo.add(rs.getString("BookNote"));
            }

            b = vInfo.get(0).toString();
            ((DefaultTableModel)tbl_Comments.getModel()).setDataVector(book.
                            getDataRowComment(b), book.getDataColumnComment());
            
            try {
                query =  "SELECT StatusTypeId\n" +
                         "FROM SetBook\n" +
                         "WHERE bookIsbn = '" + vInfo.get(0).toString() + "'";
                stmt = con.connectURL().createStatement();
                rs = stmt.executeQuery(query);
                Vector vType = new Vector();
                while(rs.next())
                {
                    vType.add(rs.getLong("StatusTypeId"));
                }               
                tglBtn_BookStatus.setEnabled(true);
                if ("8".equals(vType.get(0).toString()))
                {
                    tglBtn_BookStatus.setSelected(false);
                    tglBtn_BookStatus.setText("Disabled");
                }
                else
                {
                    tglBtn_BookStatus.setSelected(true);
                    tglBtn_BookStatus.setText("Enabled");
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if ( vInfo.get(1) == null | vInfo.get(1) == "")lbl_InfoTitle2.
                setText(""); else lbl_InfoTitle2.setText(vInfo.get(1).toString()); 
                lbl_InfoTitle6.setText(vInfo.get(1).toString());
            if ( vInfo.get(2) == null | vInfo.get(2) == "")lbl_InfoSubtitle2.
                setText(""); else lbl_InfoSubtitle2.setText(vInfo.get(2).
                                                                    toString());
            if ( vInfo.get(3) == null | vInfo.get(3) == "")lbl_InfoSubcategory2.
                setText(""); else lbl_InfoSubcategory2.setText(vInfo.get(3).
                                                                    toString());
            if ( vInfo.get(4) == null | vInfo.get(4) == "")lbl_InfoCategory2.
                setText(""); else lbl_InfoCategory2.setText(vInfo.get(4).
                                                                    toString());
            if ( vInfo.get(5) == null | vInfo.get(5) == "")lbl_InfoAuthor2.
                setText(""); else lbl_InfoAuthor2.setText(vInfo.get(5).
                toString()); lbl_InfoAuthor6.setText(vInfo.get(5).toString());
            if ( vInfo.get(6) == null | vInfo.get(6) == "")txtArea_Summary.
                setText(""); else txtArea_Summary.setText(vInfo.get(6).
                                                                    toString());
            if ( vInfo.get(7) == null | vInfo.get(7) == "")lbl_InfoPublisher2.
                setText(""); else lbl_InfoPublisher2.setText(vInfo.get(7).
                                                                    toString());
            if ( vInfo.get(9) == null | vInfo.get(9) == "")lbl_InfoStock2.
                setText(""); else lbl_InfoStock2.setText(vInfo.get(9).toString());
            if ( vInfo.get(10) == null | vInfo.get(10) == "")txtArea_Note.
                setText(""); else txtArea_Note.setText(vInfo.get(10).toString());
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Select_Book

    private void Delete_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_Book
        // TODO add your handling code here:
        if(vInfo != null)
        {
            String s = vInfo.get(0).toString();
            try {
                String query = "select CmdLineId\n" +
                                "from commandline\n" +
                                "where bookisbn ='" + s + "'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                boolean b = rs.next();
                String query2 = "select commentId\n" +
                                "from comment\n" +
                                "where bookisbn = '" + s + "'";
                Statement stmt2 = con.connectURL().createStatement();
                ResultSet rs2 = stmt2.executeQuery(query2);
                boolean c = rs2.next();
                if (b == false & c == false)
                {   
                    int result = JOptionPane.showConfirmDialog(null, "Are you "
                        + "sure ?", "Confirmation", JOptionPane.OK_CANCEL_OPTION,
                                                    JOptionPane.ERROR_MESSAGE);
                    if ( result == JOptionPane.OK_OPTION)
                    {   
                        String query3 = "DELETE FROM SETBOOK\n" +
                                        "WHERE BookISBN = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                    prepareStatement(query3);
                        pstmt.executeUpdate();
                        String query4 =  "DELETE FROM BOOK\n" +
                                        "WHERE BookISBN = '" + s + "'";
                        PreparedStatement pstmt2 = con.connectURL().
                                                    prepareStatement(query4);
                        pstmt2.executeUpdate();
                        ((DefaultTableModel)tbl_Attributes.getModel()).
                                                    removeRow(selectedRow);
                        lbl_InfoTitle2.setText("");
                        lbl_InfoSubtitle2.setText("");
                        lbl_InfoSubcategory2.setText("");
                        lbl_InfoCategory2.setText("");
                        lbl_InfoAuthor2.setText("");
                        txtArea_Summary.setText("");
                        lbl_InfoPublisher2.setText("");
                        lbl_InfoStock2.setText(""); 
                        txtArea_Note.setText("");
                        JOptionPane.showMessageDialog(this,"Delete complete !",
                                    "Delete !", JOptionPane.WARNING_MESSAGE);
                    vInfo = null;
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"You can't delete this "
                            + "book","Book !", JOptionPane.WARNING_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You have to select a book","No "
                    + "book found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Delete_Book

    private void Edit_Book(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_Book
        // TODO add your handling code here:
        lbl_Vprice1.setVisible(false);
        lbl_Visbn1.setVisible(false);
        lbl_Vtitle1.setVisible(false);
        lbl_Vpicture2.setVisible(false);
        lbl_Vsubtitle1.setVisible(false);
        lbl_Vstock1.setVisible(false);
        lbl_Vpublisher1.setVisible(false);
        lbl_Vauthor1.setVisible(false);
        lbl_Vcategory1.setVisible(false);
        lbl_Vsubcategory1.setVisible(false);
        txtFld_EditISBN.setEnabled(false);
        cmbBox_EditSubcategory.removeAllItems();
        cmbBox_EditCategory.removeAllItems();
        cmbBox_EditAuthor.removeAllItems();
        cmbBox_EditPublisher.removeAllItems();
        if (vInfo != null)
        {
            panel_Add.setVisible(false);
            panel_Consult.setVisible(false);
            panel_Edit.setVisible(true);
            txtFld_EditISBN.setText(vInfo.get(0).toString());
            txtFld_EditTitle.setText(vInfo.get(1).toString());
            if ( vInfo.get(2) == null | vInfo.get(2) == "")txtFld_EditSubtitle.
                setText(""); else txtFld_EditSubtitle.setText(vInfo.get(2).
                                                                    toString());
            if ( vInfo.get(6) == null | vInfo.get(6) == "")txtArea_EditSummary.
                setText(""); else txtArea_EditSummary.setText(vInfo.get(6).
                                                                    toString());
            txtFld_EditPrice.setText(vInfo.get(8).toString());
            txtFld_EditStock.setText(vInfo.get(9).toString());
            if ( vInfo.get(10) == null | vInfo.get(10) == "")txtArea_EditNote.
                setText(""); else txtArea_EditNote.setText(vInfo.get(10).
                                                                    toString());

            initComboCategory();
            cmbBox_EditCategory.setSelectedItem(vInfo.get(4));
            initComboSubcategoryEdit();
            cmbBox_EditSubcategory.setSelectedItem(vInfo.get(3));
            initComboAuthor();
            cmbBox_EditAuthor.setSelectedItem(vInfo.get(5));
            initComboPublisher();
            cmbBox_EditPublisher.setSelectedItem(vInfo.get(7));
        }
        else
        {
            JOptionPane.showMessageDialog(this,"You have to select a book","No "
                    + "book found !", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_Edit_Book

    private void txtFld_EditTitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditTitleMouseExited
        // TODO add your handling code here:
        try {
            String s = txtFld_EditTitle.getText();
            if (s.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$"))
            {
                Vector v = new Vector();
                String query =  "SELECT BookTitle\n" +
                                "FROM BOOK";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next())
                {
                    v.add(rs.getString("BookTitle"));
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
                    JOptionPane.showMessageDialog(this,"This title book already"
                        + " exists !","Book Error !", JOptionPane.
                                                            WARNING_MESSAGE);
                    txtFld_EditTitle.setText(vInfo.get(1).toString());
                    lbl_Vtitle1.setVisible(false);
                }
            }
            else if (s.matches("[a-zA-Z0-9\\-. ]+[a-zA-Z0-9]"))
            {
                lbl_Vtitle1.setVisible(false);
                JOptionPane.showMessageDialog(this,"Book title error !","Book "
                        + "Error !", JOptionPane.WARNING_MESSAGE);
                txtFld_EditTitle.setText(vInfo.get(1).toString());
            }
            else
            {
                lbl_Vtitle1.setVisible(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtFld_EditTitleMouseExited

    private void txtFld_EditSubtitleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditSubtitleMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditSubtitle.getText();
        if (s.matches("^[a-zA-Z0-9\\. ]+(-[a-zA-Z0-9\\. ]+)?$"))
        {}
        else if ( "".equals(s))
        {
            lbl_Vsubtitle1.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the "
                    + "title","Title Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditSubtitle.setText("");
        }
    }//GEN-LAST:event_txtFld_EditSubtitleMouseExited

    private void cmbBox_EditAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_EditAuthorActionPerformed
        // TODO add your handling code here:
        try {
            if ( cmbBox_EditAuthor.getSelectedItem() != null )
            {
                String s = cmbBox_EditAuthor.getSelectedItem().toString();
                String query =  "select a.AuthorId\n" +
                                "from author a\n" +
                                "where '" + s + "' = CONCAT( AuthorLastname, ' '"
                        + " , AuthorFirstname)";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                authorId = rs.getLong("AuthorId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_EditAuthorActionPerformed

    private void cmbBox_EditCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_EditCategoryActionPerformed
        // TODO add your handling code here:
        try {
            cmbBox_EditSubcategory.setSelectedItem(evt);
            if ( cmbBox_EditCategory.getSelectedItem() != null )
            {
                String s = cmbBox_EditCategory.getSelectedItem().toString();
                String query =  "select ThemeId\n" +
                "from Theme\n" +
                "where '" + s + "' = ThemeLabel";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                categoryId = rs.getLong("ThemeId");
                initComboSubcategoryEdit2();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_EditCategoryActionPerformed

    private void cmbBox_EditSubcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_EditSubcategoryActionPerformed
        // TODO add your handling code here:
        try {
            if ( cmbBox_EditSubcategory.getSelectedItem() != null )
            {
                String s = cmbBox_EditSubcategory.getSelectedItem().toString();
                String query =  "select SubThemeId\n" +
                "from subtheme\n" +
                "where subthemeLabel = '" + s + "'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                subcategoryId = rs.getLong("SubThemeId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_EditSubcategoryActionPerformed

    private void cmbBox_EditPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBox_EditPublisherActionPerformed
        // TODO add your handling code here:
        try {
            if ( cmbBox_EditPublisher.getSelectedItem() != null )
            {
                String s = cmbBox_EditPublisher.getSelectedItem().toString();
                String query =  "select PublisherId\n" +
                                "from Publisher \n" +
                                "where '" + s + "' = PublisherName";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                publisherId = rs.getLong("PublisherId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbBox_EditPublisherActionPerformed

    private void txtFld_EditPriceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditPriceMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditPrice.getText();
        if (s.matches("[0-9]{1,}[.,]{0,1}[0-9]{0,2}?$"))
        {}
        else if ( "".equals(s))
        {
            lbl_Vprice1.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the "
                    + "price","Price Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditPrice.setText("");
        }
    }//GEN-LAST:event_txtFld_EditPriceMouseExited

    private void txtFld_EditStockMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFld_EditStockMouseExited
        // TODO add your handling code here:
        String s = txtFld_EditStock.getText();
        if (s.matches("^[0-9]+(-[0-9]+)?$"))
        {}
        else if ( "".equals(s))
        {
            lbl_Vstock1.setVisible(false);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"There is a problem with the "
                    + "stock","Stock Error !", JOptionPane.WARNING_MESSAGE);
            txtFld_EditStock.setText("");
        }
    }//GEN-LAST:event_txtFld_EditStockMouseExited

    private void rBtn_EditTax1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn_EditTax1ActionPerformed
        // TODO add your handling code here:
        try
        {
            if (rBtn_EditTax1.isSelected())
            {
                String query =  "SELECT taxId\n" +
                                "FROM TAX a\n" +
                                "WHERE TaxLabel = '2.1'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                taxId = rs.getLong("taxId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rBtn_EditTax1ActionPerformed

    private void rBtn_EditTax2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtn_EditTax2ActionPerformed
        // TODO add your handling code here:
        try
        {
            if (rBtn_EditTax2.isSelected())
            {
                String query =  "SELECT taxId\n" +
                                "FROM TAX a\n" +
                                "WHERE TaxLabel = '5.5'";
                Statement stmt = con.connectURL().createStatement();
                ResultSet rs = stmt.executeQuery(query);
                rs.next();
                taxId = rs.getLong("taxId");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rBtn_EditTax2ActionPerformed

    private void btn_EditPictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EditPictureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_EditPictureActionPerformed

    private void Validate_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Validate_Edit
        // TODO add your handling code here:
        try {
            String s = vInfo.get(0).toString();
            int r = 0;
            if(vInfo.get(2) == null)
            {
                vInfo.set(2, "");
            }
            if(vInfo.get(10)==null)
            {
                vInfo.set(10, "");
            }
            if (vInfo.get(1).toString() == null ? txtFld_EditTitle.getText() ==
                null : vInfo.get(1).toString().equals(txtFld_EditTitle.getText()))
            {
                if (vInfo.get(2).toString() == null ? txtFld_EditSubtitle.
                    getText() == null : vInfo.get(2).toString().equals(
                                                txtFld_EditSubtitle.getText()))
                {
                    if (vInfo.get(3).toString() == null ? cmbBox_EditSubcategory.
                        getSelectedItem().toString() == null : vInfo.get(3).
                        toString().equals(cmbBox_EditSubcategory.getSelectedItem().
                                                                    toString()))
                    {
                        if (vInfo.get(5).toString() == null ? cmbBox_EditAuthor.
                            getSelectedItem().toString() == null : vInfo.get(5).
                            toString().equals(cmbBox_EditAuthor.getSelectedItem().
                                                                    toString()))
                        {
                            if (vInfo.get(6).toString() == null ? txtArea_EditSummary.
                                getText() == null : vInfo.get(6).toString().
                                        equals(txtArea_EditSummary.getText()))
                            {
                                if (vInfo.get(7).toString() == null ? 
                                    cmbBox_EditPublisher.getSelectedItem().
                                    toString() == null : vInfo.get(7).toString().
                                    equals(cmbBox_EditPublisher.getSelectedItem().
                                                                    toString()))
                                {
                                    if (vInfo.get(8).toString() == null ? 
                                        txtFld_EditPrice.getText() == null : 
                                        vInfo.get(8).toString().equals(
                                                    txtFld_EditPrice.getText()))
                                    {
                                        if (vInfo.get(9).toString() == null ? 
                                            txtFld_EditStock.getText() == null : 
                                            vInfo.get(9).toString().equals(
                                                    txtFld_EditStock.getText()))
                                        {
                                            if (vInfo.get(10).toString() == null
                                                ? txtArea_EditNote.getText() == 
                                                null : vInfo.get(10).toString().
                                                equals(txtArea_EditNote.getText()))
                                            {
                                                JOptionPane.showMessageDialog(this,
                                                "There's no edit !","Edit !", 
                                                JOptionPane.WARNING_MESSAGE);
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
            if ( r == 0)
            {
                if ( txtFld_EditTitle.getText().isEmpty() |
                     txtFld_EditPrice.getText().isEmpty() |
                     txtFld_EditStock.getText().isEmpty())
                { 
                    JOptionPane.showMessageDialog(this,"Missing Data !","Edit !",
                                                JOptionPane.WARNING_MESSAGE);
                }
                else
                {
                int result = JOptionPane.showConfirmDialog(null, "Are you sure ?", 
                    "Confirmation", JOptionPane.OK_CANCEL_OPTION,JOptionPane.
                                                                ERROR_MESSAGE);
                if ( result == JOptionPane.OK_OPTION)
                {
                    if (vInfo.get(1).toString() == null ? txtFld_EditTitle.
                        getText() != null : !vInfo.get(1).toString().equals(
                                                    txtFld_EditTitle.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                                        "SET BookTitle = '" + txtFld_EditTitle.
                                                            getText() + "'\n" +
                                        "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(1, txtFld_EditTitle.getText());
                        lbl_InfoTitle2.setText(txtFld_EditTitle.getText());
                        
                    }
                    if (vInfo.get(2).toString() == null ? txtFld_EditSubtitle.
                        getText() != null : !vInfo.get(2).toString().equals(
                                                txtFld_EditSubtitle.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                                        "SET BookSubtitle = '" + 
                                        txtFld_EditSubtitle.getText() + "'\n" +
                                        "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(2, txtFld_EditSubtitle.getText());
                        lbl_InfoSubtitle2.setText(txtFld_EditSubtitle.getText());
                    }
                    if (vInfo.get(3).toString() == null ? cmbBox_EditSubcategory.
                        getSelectedItem().toString() != null : !vInfo.get(3).
                        toString().equals(cmbBox_EditSubcategory.getSelectedItem().
                                                                    toString()))
                    {
                        String query =  "update book\n" +
                            "set subthemeId = (select subthemeId\n" +
                            "from subtheme\n" +
                            "where subthemeLabel ='" + 
                            cmbBox_EditSubcategory.getSelectedItem().toString()
                            + "')\n" +
                            "where Bookisbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(3, cmbBox_EditSubcategory.getSelectedItem().
                                                                    toString());
                        lbl_InfoSubcategory2.setText(cmbBox_EditSubcategory.
                                                getSelectedItem().toString());
                    }
                    if (vInfo.get(5).toString() == null ? cmbBox_EditAuthor.
                            getSelectedItem().toString() != null : !vInfo.get(5).
                            toString().equals(cmbBox_EditAuthor.getSelectedItem().
                                                                    toString()))
                    {
                        String query =  "update book\n" +
                            "set authorId = (select authorId\n" +
                            "from author\n" +
                            "where CONCAT(AuthorLastname , ' ' ,"
                            + "AuthorFirstname) ='" + cmbBox_EditAuthor.
                            getSelectedItem().toString() + "')\n" +
                            "where Bookisbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(5, cmbBox_EditAuthor.getSelectedItem().
                                                                    toString());
                        lbl_InfoAuthor2.setText(cmbBox_EditAuthor.getSelectedItem().
                                                                    toString());
                    }
                    if (vInfo.get(6).toString() == null ? txtArea_EditSummary.
                        getText() != null : !vInfo.get(6).toString().equals(
                                                txtArea_EditSummary.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                            "SET BookSummary = '" + 
                            txtArea_EditSummary.getText() + "'\n" +
                            "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(6, txtArea_EditSummary.getText());
                        txtArea_Summary.setText(txtArea_EditSummary.getText());
                    }
                    if (vInfo.get(7).toString() == null ? cmbBox_EditPublisher.
                        getSelectedItem().toString() != null : !vInfo.get(7).
                        toString().equals(cmbBox_EditPublisher.getSelectedItem().
                                                                    toString()))
                    {
                        String query =  "UPDATE BOOK\n" +
                            "SET publisherId = (select publisherId\n" +
                            "from publisher\n" +
                            "where publisherName ='" + 
                            cmbBox_EditPublisher.getSelectedItem().toString() + "')\n" +
                            "WHERE Bookisbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(7, cmbBox_EditPublisher.getSelectedItem().
                                                                    toString());
                        lbl_InfoPublisher2.setText(cmbBox_EditPublisher.
                                                getSelectedItem().toString());
                    }
                    if (vInfo.get(8).toString() == null ? txtFld_EditPrice.
                        getText() != null : !vInfo.get(8).toString().equals(
                                                    txtFld_EditPrice.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                            "SET BookPrice = '" + txtFld_EditPrice.
                            getText() + "'\n" +
                            "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(8, txtFld_EditPrice.getText());
                    }
                    if (vInfo.get(9).toString() == null ? txtFld_EditStock.
                        getText() != null : !vInfo.get(9).toString().equals(
                                                    txtFld_EditStock.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                            "SET BookStock = '" + txtFld_EditStock.
                            getText() + "'\n" +
                            "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(9, txtFld_EditStock.getText());
                        lbl_InfoStock2.setText(txtFld_EditStock.getText());
                    }
                    if (vInfo.get(10).toString() == null ? txtArea_EditNote.
                        getText() != null : !vInfo.get(10).toString().equals(
                                                    txtArea_EditNote.getText()))
                    {
                        String query =  "UPDATE BOOK\n" +
                            "SET BookNote = '" + txtArea_EditNote.
                            getText() + "'\n" +
                            "WHERE BookIsbn = '" + s + "'";
                        PreparedStatement pstmt = con.connectURL().
                                                        prepareStatement(query);
                        pstmt.executeUpdate();
                        vInfo.set(10, txtArea_EditNote.getText());
                        txtArea_Note.setText(txtArea_EditNote.getText());
                    }
                    panel_Edit.setVisible(false);
                    panel_Consult.setVisible(true);
                    ((DefaultTableModel)tbl_Attributes.getModel()).
                        setDataVector(book.getDataRowBook(), book.
                                                            getDataColumnBook());
                    tbl_Attributes.getSelectionModel().setSelectionInterval(selectedRow, selectedRow);
                    JOptionPane.showMessageDialog(this,"Edit complete !","Edit "
                            + "!", JOptionPane.INFORMATION_MESSAGE);
                }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Validate_Edit

    private void Back_Edit(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_Edit
        // TODO add your handling code here:
        panel_Add.setVisible(false);
        panel_Edit.setVisible(false);
        panel_Consult.setVisible(true);
    }//GEN-LAST:event_Back_Edit

    private void Book_Status(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Book_Status
        // TODO add your handling code here:
        boolean selected = tglBtn_BookStatus.getModel().isSelected();
        try {
            
            String query =  "SELECT StatusTypeId\n" +
                            "FROM SetBook\n" +
                            "WHERE bookIsbn = '" + vInfo.get(0).toString() + "'";
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            Vector vType = new Vector();
            while(rs.next())
            {
                vType.add(rs.getLong("StatusTypeId"));
            }   
            if ( selected == true)
            {
                query =  "UPDATE SetBook\n" +
                         "SET StatusTypeId = 7\n" +
                         "WHERE BookIsbn = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(book.
                                    getDataRowBook(), book.getDataColumnBook());
                tglBtn_BookStatus.setText("Enable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(
                                                    selectedRow, selectedRow);
            }
            else if ( selected == false)
            {
                query =  "UPDATE SetBook\n" +
                         "SET StatusTypeId = 8\n" +
                         "WHERE BookIsbn = '" + vInfo.get(0).toString() + "'";
                PreparedStatement pstmt = con.connectURL().prepareStatement(query);
                pstmt.executeUpdate();
                ((DefaultTableModel)tbl_Attributes.getModel()).setDataVector(book.
                                    getDataRowBook(), book.getDataColumnBook());
                tglBtn_BookStatus.setText("Disable");
                tbl_Attributes.getSelectionModel().setSelectionInterval(
                                                    selectedRow, selectedRow);
            }
            } catch (SQLException ex) {
                Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Book_Status

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Down;
    private javax.swing.JPanel Down2;
    private javax.swing.JPanel Down3;
    private javax.swing.JPanel Left_SideBar;
    private javax.swing.JPanel Left_SideBar2;
    private javax.swing.JPanel Left_SideBar3;
    private javax.swing.JPanel LeftsideDown;
    private javax.swing.JPanel LeftsideDown2;
    private javax.swing.JPanel LeftsideDown3;
    private javax.swing.JPanel LeftsideUp;
    private javax.swing.JPanel LeftsideUp2;
    private javax.swing.JPanel LeftsideUp3;
    private javax.swing.JPanel Right_SideBar;
    private javax.swing.JPanel Right_SideBar2;
    private javax.swing.JPanel Right_SideBar3;
    private javax.swing.JPanel Rightside;
    private javax.swing.JPanel Rightside2;
    private javax.swing.JPanel Rightside3;
    private javax.swing.JPanel Up;
    private javax.swing.JPanel Up2;
    private javax.swing.JPanel Up3;
    private javax.swing.JButton btn_AddBook;
    private javax.swing.JButton btn_AddPicture;
    private javax.swing.JButton btn_BackAdd;
    private javax.swing.JButton btn_BackEdit;
    private javax.swing.JButton btn_DeleteBook;
    private javax.swing.JButton btn_Details;
    private javax.swing.JButton btn_Details2;
    private javax.swing.JButton btn_Details3;
    private javax.swing.JButton btn_EditBook;
    private javax.swing.JButton btn_EditBook1;
    private javax.swing.JButton btn_EditBook2;
    private javax.swing.JButton btn_EditPicture;
    private javax.swing.JButton btn_ValidateAdd;
    private javax.swing.JButton btn_ValidateEdit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbBox_AddAuthor;
    private javax.swing.JComboBox cmbBox_AddCategory;
    private javax.swing.JComboBox cmbBox_AddPublisher;
    private javax.swing.JComboBox cmbBox_AddSubcategory;
    private javax.swing.JComboBox cmbBox_EditAuthor;
    private javax.swing.JComboBox cmbBox_EditCategory;
    private javax.swing.JComboBox cmbBox_EditPublisher;
    private javax.swing.JComboBox cmbBox_EditSubcategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lbl_Author;
    private javax.swing.JLabel lbl_Author1;
    private javax.swing.JLabel lbl_Book;
    private javax.swing.JLabel lbl_Book3;
    private javax.swing.JLabel lbl_ISBN;
    private javax.swing.JLabel lbl_ISBN1;
    private javax.swing.JLabel lbl_InfoAuthor;
    private javax.swing.JLabel lbl_InfoAuthor2;
    private javax.swing.JLabel lbl_InfoAuthor5;
    private javax.swing.JLabel lbl_InfoAuthor6;
    private javax.swing.JLabel lbl_InfoAuthor7;
    private javax.swing.JLabel lbl_InfoAuthor8;
    private javax.swing.JLabel lbl_InfoCategory;
    private javax.swing.JLabel lbl_InfoCategory2;
    private javax.swing.JLabel lbl_InfoPublisher;
    private javax.swing.JLabel lbl_InfoPublisher2;
    private javax.swing.JLabel lbl_InfoStock;
    private javax.swing.JLabel lbl_InfoStock2;
    private javax.swing.JLabel lbl_InfoStock5;
    private javax.swing.JLabel lbl_InfoStock6;
    private javax.swing.JLabel lbl_InfoStock7;
    private javax.swing.JLabel lbl_InfoStock8;
    private javax.swing.JLabel lbl_InfoSubcategory;
    private javax.swing.JLabel lbl_InfoSubcategory2;
    private javax.swing.JLabel lbl_InfoSubtitle;
    private javax.swing.JLabel lbl_InfoSubtitle2;
    private javax.swing.JLabel lbl_InfoSummary;
    private javax.swing.JLabel lbl_InfoTitle;
    private javax.swing.JLabel lbl_InfoTitle2;
    private javax.swing.JLabel lbl_InfoTitle5;
    private javax.swing.JLabel lbl_InfoTitle6;
    private javax.swing.JLabel lbl_InfoTitle7;
    private javax.swing.JLabel lbl_InfoTitle8;
    private javax.swing.JLabel lbl_Picture1;
    private javax.swing.JLabel lbl_Picture2;
    private javax.swing.JLabel lbl_Price;
    private javax.swing.JLabel lbl_Price1;
    private javax.swing.JLabel lbl_Publisher;
    private javax.swing.JLabel lbl_Publisher1;
    private javax.swing.JLabel lbl_Research;
    private javax.swing.JLabel lbl_Research2;
    private javax.swing.JLabel lbl_Status;
    private javax.swing.JLabel lbl_Stock;
    private javax.swing.JLabel lbl_Stock1;
    private javax.swing.JLabel lbl_Subtheme;
    private javax.swing.JLabel lbl_Subtheme1;
    private javax.swing.JLabel lbl_Subtitle;
    private javax.swing.JLabel lbl_Subtitle1;
    private javax.swing.JLabel lbl_Summary;
    private javax.swing.JLabel lbl_Summary1;
    private javax.swing.JLabel lbl_Tax;
    private javax.swing.JLabel lbl_Tax1;
    private javax.swing.JLabel lbl_Theme;
    private javax.swing.JLabel lbl_Theme1;
    private javax.swing.JLabel lbl_Title;
    private javax.swing.JLabel lbl_Title1;
    private javax.swing.JLabel lbl_TitleAddBook;
    private javax.swing.JLabel lbl_TitleAttributes;
    private javax.swing.JLabel lbl_TitleBook;
    private javax.swing.JLabel lbl_TitleComments;
    private javax.swing.JLabel lbl_TitleInfos;
    private javax.swing.JLabel lbl_TitleInfos2;
    private javax.swing.JLabel lbl_TitleInfos3;
    private javax.swing.JLabel lbl_TitleManageBook;
    private javax.swing.JLabel lbl_TitleManageBook3;
    private javax.swing.JLabel lbl_TitleNote;
    private javax.swing.JLabel lbl_TitleNote2;
    private javax.swing.JLabel lbl_TitleNote3;
    private javax.swing.JLabel lbl_TitleOrder;
    private javax.swing.JLabel lbl_TitleOrder2;
    private javax.swing.JLabel lbl_TitleOrder3;
    private javax.swing.JLabel lbl_Vauthor;
    private javax.swing.JLabel lbl_Vauthor1;
    private javax.swing.JLabel lbl_Vcategory;
    private javax.swing.JLabel lbl_Vcategory1;
    private javax.swing.JLabel lbl_Visbn;
    private javax.swing.JLabel lbl_Visbn1;
    private javax.swing.JLabel lbl_Vpicture;
    private javax.swing.JLabel lbl_Vpicture2;
    private javax.swing.JLabel lbl_Vprice;
    private javax.swing.JLabel lbl_Vprice1;
    private javax.swing.JLabel lbl_Vpublisher;
    private javax.swing.JLabel lbl_Vpublisher1;
    private javax.swing.JLabel lbl_Vstock;
    private javax.swing.JLabel lbl_Vstock1;
    private javax.swing.JLabel lbl_Vsubcategory1;
    private javax.swing.JLabel lbl_Vsubtheme;
    private javax.swing.JLabel lbl_Vsubtitle;
    private javax.swing.JLabel lbl_Vsubtitle1;
    private javax.swing.JLabel lbl_Vtitle;
    private javax.swing.JLabel lbl_Vtitle1;
    private javax.swing.JScrollPane panel_Add;
    private javax.swing.JPanel panel_Add1;
    private javax.swing.JScrollPane panel_Consult;
    private javax.swing.JPanel panel_Consult1;
    private javax.swing.JScrollPane panel_Edit;
    private javax.swing.JPanel panel_Edit1;
    private javax.swing.JPanel panel_Shipping3;
    private javax.swing.JPanel panel_Shipping5;
    private javax.swing.JPanel panel_Shipping6;
    private javax.swing.JRadioButton rBtn_AddTax1;
    private javax.swing.JRadioButton rBtn_AddTax2;
    private javax.swing.JRadioButton rBtn_EditTax1;
    private javax.swing.JRadioButton rBtn_EditTax2;
    private javax.swing.JScrollPane scrBar_Attributes;
    private javax.swing.JScrollPane scrBar_Comments;
    private javax.swing.JScrollPane scrBar_Note;
    private javax.swing.JScrollPane scrBar_Note2;
    private javax.swing.JScrollPane scrBar_Note3;
    private javax.swing.JSeparator sep_Attirbutes;
    private javax.swing.JSeparator sep_Comments;
    private javax.swing.JSeparator sep_Comments2;
    private javax.swing.JSeparator sep_Comments3;
    private javax.swing.JSeparator sep_Customer;
    private javax.swing.JSeparator sep_Customer1;
    private javax.swing.JSeparator sep_Customer2;
    private javax.swing.JSeparator sep_Infos;
    private javax.swing.JSeparator sep_Infos2;
    private javax.swing.JSeparator sep_Infos3;
    private javax.swing.JSeparator sep_Note;
    private javax.swing.JSeparator sep_Note2;
    private javax.swing.JSeparator sep_Note3;
    private javax.swing.JSeparator sep_Order;
    private javax.swing.JSeparator sep_Order2;
    private javax.swing.JSeparator sep_Order3;
    private javax.swing.JTabbedPane tabPan_Address4;
    private javax.swing.JTabbedPane tabPan_Address7;
    private javax.swing.JTabbedPane tabPan_Address8;
    private javax.swing.JTable tbl_Attributes;
    private javax.swing.JTable tbl_Comments;
    private javax.swing.JToggleButton tglBtn_BookStatus;
    private javax.swing.JTextArea txtArea_AddNote;
    private javax.swing.JTextArea txtArea_AddSummary;
    private javax.swing.JTextArea txtArea_EditNote;
    private javax.swing.JTextArea txtArea_EditSummary;
    private javax.swing.JTextArea txtArea_Note;
    private javax.swing.JTextArea txtArea_Summary;
    private javax.swing.JTextField txtFld_AddISBN;
    private javax.swing.JTextField txtFld_AddPrice;
    private javax.swing.JTextField txtFld_AddStock;
    private javax.swing.JTextField txtFld_AddSubtitle;
    private javax.swing.JTextField txtFld_AddTitle;
    private javax.swing.JTextField txtFld_EditISBN;
    private javax.swing.JTextField txtFld_EditPrice;
    private javax.swing.JTextField txtFld_EditStock;
    private javax.swing.JTextField txtFld_EditSubtitle;
    private javax.swing.JTextField txtFld_EditTitle;
    private javax.swing.JTextField txtFld_Research;
    private javax.swing.JTextField txtFld_Research2;
    // End of variables declaration//GEN-END:variables
}
