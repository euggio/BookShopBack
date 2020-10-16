package BookShop;

import BookShop.Author.*;
import BookShop.Book.Book_JPanel;
import BookShop.Category.*;
import BookShop.Customer.*;
import BookShop.Event.*;
import BookShop.OrderCat.*;
import BookShop.Publisher.*;
import BookShop.Transporter.Transporter;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Dashboard Frame
 * @author euggio 
 */
public class Dashboard_JFrame extends javax.swing.JFrame 
{
    
    /**
     * No-arg constructor
     */
    public Dashboard_JFrame() 
    {
        initComponents();
        panel_PageBody.add(customer); 
        customer.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        panel_Logo = new javax.swing.JPanel();
        lbl_Logo = new javax.swing.JLabel();
        scrollPane_Menu = new javax.swing.JScrollPane();
        MenuSideBar = new javax.swing.JTree();
        panel_PageBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        Header.setBackground(new java.awt.Color(255, 255, 255));

        panel_Logo.setBackground(new java.awt.Color(255, 255, 255));
        panel_Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbl_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ressources/Pics/logo.png"))); // NOI18N

        javax.swing.GroupLayout panel_LogoLayout = new javax.swing.GroupLayout(panel_Logo);
        panel_Logo.setLayout(panel_LogoLayout);
        panel_LogoLayout.setHorizontalGroup(
            panel_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LogoLayout.createSequentialGroup()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_LogoLayout.setVerticalGroup(
            panel_LogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_LogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(panel_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        scrollPane_Menu.setBorder(null);

        MenuSideBar.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Home");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Customer");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Order");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Category");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Product");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Author");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Publisher");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Transporter");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Event");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Comment");
        treeNode1.add(treeNode2);
        MenuSideBar.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        MenuSideBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSideBarMouseClicked(evt);
            }
        });
        scrollPane_Menu.setViewportView(MenuSideBar);

        panel_PageBody.setBackground(new java.awt.Color(242, 242, 242));
        panel_PageBody.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        panel_PageBody.setMinimumSize(new java.awt.Dimension(0, 0));
        panel_PageBody.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(scrollPane_Menu)
                    .addComponent(Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_PageBody, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(scrollPane_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE))
                    .addComponent(panel_PageBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1009, 761));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSideBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSideBarMouseClicked
        // TreeNode for the menu side bar
        DefaultMutableTreeNode tn = (DefaultMutableTreeNode) MenuSideBar.
            getLastSelectedPathComponent();
        
        // Conditions on each element on the menu
        if (tn != null) 
        {
            if ( "Home".equals(tn.getUserObject().toString()))
            {
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                order.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
            }
            if ( "Order".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(order);
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                order.setVisible(true);
                order.updateUI();
            }
            if ( "Customer".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(customer);
                order.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                customer.setVisible(true);
                customer.updateUI();
            } 
            if ( "Event".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(event);
                order.setVisible(false);
                customer.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                event.setVisible(true);
                event.updateUI();
            }
            if ( "Category".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(category);
                order.setVisible(false);
                customer.setVisible(false);
                event.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                category.setVisible(true);
               category.updateUI();
            }
            if ( "Product".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(book);
                order.setVisible(false);
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                book.setVisible(true);
                book.updateUI();
            }
            if ( "Author".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(author);
                order.setVisible(false);
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(false);
                author.setVisible(true);
                author.updateUI();
            }
            if ( "Publisher".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(publisher);
                order.setVisible(false);
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                transporter.setVisible(false);
                publisher.setVisible(true);
                publisher.updateUI();
            }

            if ( "Transporter".equals(tn.getUserObject().toString()))
            {
                panel_PageBody.add(transporter);
                order.setVisible(false);
                customer.setVisible(false);
                event.setVisible(false);
                category.setVisible(false);
                book.setVisible(false);
                author.setVisible(false);
                publisher.setVisible(false);
                transporter.setVisible(true);
                transporter.updateUI();
            }
        }
    }//GEN-LAST:event_MenuSideBarMouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard_JFrame().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JTree MenuSideBar;
    private javax.swing.JLabel lbl_Logo;
    private javax.swing.JPanel panel_Logo;
    private javax.swing.JPanel panel_PageBody;
    private javax.swing.JScrollPane scrollPane_Menu;
    // End of variables declaration//GEN-END:variables

    // Other variables declaration
    private final Orders order = new Orders();
    private final Customer customer = new Customer();
    private final Event_JPanel event = new Event_JPanel();
    private final Category category = new Category();
    private final Book_JPanel book = new Book_JPanel();
    private final Author_JPanel author = new Author_JPanel();
    private final Publisher_JPanel publisher = new Publisher_JPanel();
    private final Transporter transporter = new Transporter();
}