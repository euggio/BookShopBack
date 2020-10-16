package BookShop.OrderCat;
//JScrollPane pane =  new JScrollPane(txtFld_OrdNote,JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
import BookShop.Customer.JoinsSelectedCustomer;
import BookShop.Methods.AddButton;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import java.lang.*;

public class Orders extends javax.swing.JPanel  {
    Long valueSelected;
    JoinsOrder jo = new JoinsOrder();
    JoinsSelectedOrder jo2 = new JoinsSelectedOrder();

    
    public Orders() {
        initComponents();
    }
    
     
    public DefaultTableModel initTableOrder  (){
        tbl_orders.setDefaultRenderer(Object.class, new AddButton());
    
        return new DefaultTableModel(jo.getOrderResumeRow(), jo.getOrderResumeColumn()){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_orders = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lbl_OrderNum = new javax.swing.JLabel();
        lbl_OrderNumValue = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_shipping = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_payment = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_products = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        right_sidebar = new javax.swing.JPanel();
        leftside = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_Mail = new javax.swing.JLabel();
        txtFld_Mail = new javax.swing.JLabel();
        lbl_AccountRegDate = new javax.swing.JLabel();
        txtFld_AccRegDate = new javax.swing.JLabel();
        txtFld_TotSpent = new javax.swing.JLabel();
        lbl_TotSpent = new javax.swing.JLabel();
        btn_CustoDetails = new javax.swing.JToggleButton();
        jLabel18 = new javax.swing.JLabel();
        rightside = new javax.swing.JPanel();
        lbl_Note = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtFld_OrdNote = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        lbl_ShipAddName = new javax.swing.JLabel();
        lbl_ShipAdd = new javax.swing.JLabel();
        lbl_ShipAdd2 = new javax.swing.JLabel();
        lbl_ShipZip = new javax.swing.JLabel();
        lbl_ShipCity = new javax.swing.JLabel();
        lbl_ShipPhone = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        lbl_ShipNote = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbl_DelAddName = new javax.swing.JLabel();
        lbl_DelAdd = new javax.swing.JLabel();
        lbl_DelAdd2 = new javax.swing.JLabel();
        lbl_DelZip = new javax.swing.JLabel();
        lbl_DelCity = new javax.swing.JLabel();
        lbl_DelPhone = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        lbl_DelNote = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Orders");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        tbl_orders.setModel(initTableOrder());
        tbl_orders.setRowHeight(30);
        tbl_orders.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_ordersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_orders);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 1229, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1597, Short.MAX_VALUE))
        );

        add(jPanel1, "card3");

        jPanel3.setBackground(new java.awt.Color(242, 242, 242));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Print");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Products");

        jLabel4.setText("2");

        jLabel3.setText("999.00€");

        jLabel6.setText("Total");

        jTextField1.setText("2020/12/08");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel37.setText("Date");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lbl_OrderNum.setText("Order Number");

        lbl_OrderNumValue.setText("2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_OrderNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_OrderNumValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 787, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_OrderNum)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(btnBack))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel37))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(lbl_OrderNumValue))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Calculator_32px.png"))); // NOI18N
        jLabel7.setText("Order");

        jLabel8.setText("Status :");

        jLabel9.setForeground(new java.awt.Color(102, 204, 0));
        jLabel9.setText("Payment approved");

        jLabel10.setForeground(new java.awt.Color(0, 51, 204));
        jLabel10.setText("Transporter in progress");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/shiping.png"))); // NOI18N
        jLabel17.setText("Shipping");

        tbl_shipping.setModel(initTableShipping());
        jScrollPane1.setViewportView(tbl_shipping);

        tbl_payment.setModel(initTablePayment());
        tbl_payment.setAutoscrolls(false);
        jScrollPane3.setViewportView(tbl_payment);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/payment_32_1.png"))); // NOI18N
        jLabel19.setText("Payment");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/iconfinder_.png"))); // NOI18N
        jLabel21.setText("Products");

        tbl_products.setModel(initTableProducts());
        jScrollPane4.setViewportView(tbl_products);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Products :");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Shipping :");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Total :");

        jLabel24.setText("200.00€");

        jLabel25.setText("210.00€");

        jLabel26.setText("10.00€");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel26))))
                    .addComponent(jSeparator6)
                    .addComponent(jSeparator7))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addComponent(jLabel19)
                            .addComponent(jLabel21))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(312, Short.MAX_VALUE))
        );

        right_sidebar.setBackground(new java.awt.Color(242, 242, 242));

        leftside.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Mail.setText("Email :");

        txtFld_Mail.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtFld_Mail.setText("toto@gmail.com");

        lbl_AccountRegDate.setText("Account registration date: ");

        txtFld_AccRegDate.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtFld_AccRegDate.setText("01/01/2020");

        txtFld_TotSpent.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtFld_TotSpent.setText("200€");

        lbl_TotSpent.setText("Total spent since registration :");

        btn_CustoDetails.setText("View details");
        btn_CustoDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CustoDetailsActionPerformed(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/customer_32px_1.png"))); // NOI18N
        jLabel18.setText("Customer");

        javax.swing.GroupLayout leftsideLayout = new javax.swing.GroupLayout(leftside);
        leftside.setLayout(leftsideLayout);
        leftsideLayout.setHorizontalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_CustoDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(leftsideLayout.createSequentialGroup()
                        .addGroup(leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(leftsideLayout.createSequentialGroup()
                                .addComponent(lbl_TotSpent, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFld_TotSpent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(leftsideLayout.createSequentialGroup()
                                .addComponent(lbl_Mail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_Mail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(leftsideLayout.createSequentialGroup()
                                .addComponent(lbl_AccountRegDate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFld_AccRegDate, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        leftsideLayout.setVerticalGroup(
            leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Mail)
                    .addComponent(txtFld_Mail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_AccountRegDate)
                    .addComponent(txtFld_AccRegDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(leftsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFld_TotSpent, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_TotSpent))
                .addGap(18, 18, 18)
                .addComponent(btn_CustoDetails)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        rightside.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Note.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Icons/Menu_32px.png"))); // NOI18N
        lbl_Note.setText("Note");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        txtFld_OrdNote.setEditable(false);
        txtFld_OrdNote.setColumns(20);
        txtFld_OrdNote.setLineWrap(true);
        txtFld_OrdNote.setRows(5);
        jScrollPane5.setViewportView(txtFld_OrdNote);

        javax.swing.GroupLayout rightsideLayout = new javax.swing.GroupLayout(rightside);
        rightside.setLayout(rightsideLayout);
        rightsideLayout.setHorizontalGroup(
            rightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightsideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8)
                    .addGroup(rightsideLayout.createSequentialGroup()
                        .addComponent(lbl_Note, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5))
                .addContainerGap())
        );
        rightsideLayout.setVerticalGroup(
            rightsideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightsideLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Note)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5)
                .addContainerGap())
        );

        javax.swing.GroupLayout right_sidebarLayout = new javax.swing.GroupLayout(right_sidebar);
        right_sidebar.setLayout(right_sidebarLayout);
        right_sidebarLayout.setHorizontalGroup(
            right_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(right_sidebarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(leftside, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightside, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        right_sidebarLayout.setVerticalGroup(
            right_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rightside, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(leftside, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(242, 242, 242));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(243, 243, 243));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lbl_ShipNote.setColumns(20);
        lbl_ShipNote.setLineWrap(true);
        lbl_ShipNote.setRows(5);
        jScrollPane6.setViewportView(lbl_ShipNote);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_ShipAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShipZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShipCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShipPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_ShipAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_ShipAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_ShipAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ShipAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ShipAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ShipCity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ShipZip, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_ShipPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Shipping address", jPanel8);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(243, 243, 243));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lbl_DelNote.setColumns(20);
        lbl_DelNote.setRows(5);
        jScrollPane7.setViewportView(lbl_DelNote);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_DelAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DelZip, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_DelAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_DelAdd2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_DelAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DelAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DelAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DelCity, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DelZip, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_DelPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delivry address", jPanel10);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(right_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(right_sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(405, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1330, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1663, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        add(jPanel2, "card4");
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_ordersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_ordersMouseClicked
        int columnRef= tbl_orders.getColumnModel().getColumnIndexAtX(evt.getX());
        int rowRef= evt.getY()/tbl_orders.getRowHeight();
        if (rowRef<tbl_orders.getRowCount() && rowRef>=0 && columnRef<tbl_orders.getColumnCount() && columnRef>=0){
            Object value = tbl_orders.getValueAt(rowRef, columnRef);
            if (value instanceof JButton){
                ((JButton)value).doClick();
                
                //call the new Pane
                jPanel2.setVisible(true);
                jPanel1.setVisible(false);
                consultCustomer();
                setValueSelected(valueSelected);
                
                getVectorShippingRow();
                
            }
        }
        
    }//GEN-LAST:event_tbl_ordersMouseClicked

    private void consultCustomer() {
        int row = tbl_orders.getSelectedRow();
        String test = tbl_orders.getModel().getValueAt(row, 0).toString();
        valueSelected = Long.valueOf(test);
        
        // Select dedicated informations with the order selection
        //JoinsSelectedOrder joinSelectOrd = new JoinsSelectedOrder(valueSelected);
        JoinsSelectedCustomer joinSelecCusto = new JoinsSelectedCustomer(valueSelected);
        // Create a vector with the customer informations 
        Vector selectCusto = joinSelecCusto.getCustoData();
        

        // Test de la valeur enregistrée (en dans le header ;) )
        lbl_OrderNumValue.setText(String.valueOf(valueSelected));
        
        // jLabel12.setText(custo.getCustomerMail());
        txtFld_Mail.setText(selectCusto.get(4).toString());
        txtFld_AccRegDate.setText(selectCusto.get(6).toString());
        
        // Order note
        Vector selectOrd = jo2.getOrderData(valueSelected);
        txtFld_OrdNote.setText(selectOrd.get(8).toString());
        // Shipping informations lbl_Shipping Address
        Vector selectShip = jo2.getShipAddressData(valueSelected);
        if ( selectShip.get(1) == null)lbl_ShipAddName.setText(""); else lbl_ShipAddName.setText(selectShip.get(1).toString());
        if ( selectShip.get(5) == null)lbl_ShipAdd.setText(""); else lbl_ShipAdd.setText(selectShip.get(5).toString());
        if ( selectShip.get(6) == null)lbl_ShipAdd2.setText(""); else lbl_ShipAdd2.setText(selectShip.get(6).toString());
        if ( selectShip.get(8) == null)lbl_ShipCity.setText(""); else lbl_ShipCity.setText(selectShip.get(8).toString());
        if ( selectShip.get(7) == null)lbl_ShipZip.setText(""); else lbl_ShipZip.setText(selectShip.get(7).toString());
        if ( selectShip.get(9) == null)lbl_ShipPhone.setText(""); else lbl_ShipPhone.setText(selectShip.get(9).toString());
        if ( selectShip.get(12) == null)lbl_ShipNote.setText(""); else lbl_ShipNote.setText(selectShip.get(12).toString());
        
        // Shipping informations lbl_Delivery Address
        Vector selectDel = jo2.getDelAddressData(valueSelected);
        if ( selectDel.get(1) == null)lbl_DelAddName.setText(""); else lbl_DelAddName.setText(selectDel.get(1).toString());
        if ( selectDel.get(5) == null)lbl_DelAdd.setText(""); else lbl_DelAdd.setText(selectDel.get(5).toString());
        if ( selectDel.get(6) == null)lbl_DelAdd2.setText(""); else lbl_DelAdd2.setText(selectDel.get(6).toString());
        if ( selectDel.get(8) == null)lbl_DelCity.setText(""); else lbl_DelCity.setText(selectDel.get(8).toString());
        if ( selectDel.get(7) == null)lbl_DelZip.setText(""); else lbl_DelZip.setText(selectDel.get(7).toString());
        if ( selectDel.get(9) == null)lbl_DelPhone.setText(""); else lbl_DelPhone.setText(selectDel.get(9).toString());
        if ( selectDel.get(12) == null)lbl_DelNote.setText(""); else lbl_DelNote.setText(selectDel.get(12).toString());
        
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    // SHIPPING JTable - start //
    
    public DefaultTableModel initTableShipping(){
        tbl_shipping.setRowHeight(30);
        
        GetConnection connect = new GetConnection();
       
        Long test = getValueSelected();
        Vector vector = new Vector();
        
        String query =  "SELECT TOP 1 *\n" +
                        "FROM Package p\n" +
                        "left join SETPACKAGE s on s.PackageId = p.PackageId\n" +
                        "left join TRANSPORTER t on t.TransporterId = p.TransporterId\n" +
                        "WHERE p.PackageId = 1 and s.StatusTypeId = 1";
       
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet shippingRs= stmt.executeQuery(query);
            
            String lastShip = null;
            while (shippingRs.next()) {
                vector.add(shippingRs.getDate("DeliveryStatusDate"));
                        vector.add(shippingRs.getString("TransporterName"));
                        vector.add(shippingRs.getInt("PackageWeight"));
                        vector.add(shippingRs.getBigDecimal("PackageShippingCost"));
                        vector.add(shippingRs.getString("PackageNumber"));
                        }
            
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        Vector orderListColumn = new Vector();
            orderListColumn.add("Delivery date");
            orderListColumn.add("Transporter");
            orderListColumn.add("Weight");
            orderListColumn.add("Shipping Cost");
            orderListColumn.add("Tracking number");
        
            Vector vector2 = new Vector();
            vector2.add(vector);
        return new DefaultTableModel(vector2, orderListColumn){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
        
    }
    
    
    public Vector getVectorShippingRow () {
            GetConnection connect = new GetConnection();
       
        Long test = getValueSelected();
        Vector vector = new Vector();
        
        String query =  "SELECT TOP 1 *\n" +
                        "FROM Package p\n" +
                        "left join SETPACKAGE s on s.PackageId = p.PackageId\n" +
                        "left join TRANSPORTER t on t.TransporterId = p.TransporterId\n" +
                        "WHERE p.PackageId = " + test + " and s.StatusTypeId = 1";
       
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet shippingRs= stmt.executeQuery(query);
            
            String lastShip = null;
            while (shippingRs.next()) {
                vector.add(shippingRs.getDate("DeliveryStatusDate"));
                        vector.add(shippingRs.getString("TransporterName"));
                        vector.add(shippingRs.getInt("PackageWeight"));
                        vector.add(shippingRs.getBigDecimal("PackageShippingCost"));
                        vector.add(shippingRs.getString("PackageNumber"));
                    
            }
            
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Orders.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
        return vector;
    }
    
    public Vector getVectorShippingColumn() {
        Vector orderListColumn = new Vector();
            orderListColumn.add("Delivery date");
            orderListColumn.add("Transporter");
            orderListColumn.add("Weight");
            orderListColumn.add("Shipping Cost");
            orderListColumn.add("Tracking number");
            
            return orderListColumn;
    }
    // SHIPPING JTable - end // 
    ////////////////////////////////////////////////////////////////////////////
   
    
    ////////////////////////////////////////////////////////////////////////////
    // SHIPPING JTable - start //
    
    public DefaultTableModel initTablePayment(){
        tbl_payment.setDefaultRenderer(Object.class, new AddButton());
        tbl_payment.setRowHeight(30);
        return new DefaultTableModel(jo2.getVectorPaymentRow(getValueSelected()), jo2.getVectorPaymentColumn()){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
            int rowIndex = 5;
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
     
    public DefaultTableModel initTableProducts(){
        
        tbl_products.setRowHeight(30);
       
       return new DefaultTableModel(jo2.getVectorShippingRow(valueSelected), jo2.getVectorShippingColumn()){
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };
            int rowIndex = 5;
           @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        };
    }
     
    public Long getValueSelected() {
        return valueSelected;
    }

    
    public void setValueSelected(Long valueSelected) {
        this.valueSelected = valueSelected;
    }
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_CustoDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CustoDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CustoDetailsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JToggleButton btn_CustoDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_AccountRegDate;
    private javax.swing.JLabel lbl_DelAdd;
    private javax.swing.JLabel lbl_DelAdd2;
    private javax.swing.JLabel lbl_DelAddName;
    private javax.swing.JLabel lbl_DelCity;
    private javax.swing.JTextArea lbl_DelNote;
    private javax.swing.JLabel lbl_DelPhone;
    private javax.swing.JLabel lbl_DelZip;
    private javax.swing.JLabel lbl_Mail;
    private javax.swing.JLabel lbl_Note;
    private javax.swing.JLabel lbl_OrderNum;
    private javax.swing.JLabel lbl_OrderNumValue;
    private javax.swing.JLabel lbl_ShipAdd;
    private javax.swing.JLabel lbl_ShipAdd2;
    private javax.swing.JLabel lbl_ShipAddName;
    private javax.swing.JLabel lbl_ShipCity;
    private javax.swing.JTextArea lbl_ShipNote;
    private javax.swing.JLabel lbl_ShipPhone;
    private javax.swing.JLabel lbl_ShipZip;
    private javax.swing.JLabel lbl_TotSpent;
    private javax.swing.JPanel leftside;
    private javax.swing.JPanel right_sidebar;
    private javax.swing.JPanel rightside;
    private javax.swing.JTable tbl_orders;
    private javax.swing.JTable tbl_payment;
    private javax.swing.JTable tbl_products;
    private javax.swing.JTable tbl_shipping;
    private javax.swing.JLabel txtFld_AccRegDate;
    private javax.swing.JLabel txtFld_Mail;
    private javax.swing.JTextArea txtFld_OrdNote;
    private javax.swing.JLabel txtFld_TotSpent;
    // End of variables declaration//GEN-END:variables
}
