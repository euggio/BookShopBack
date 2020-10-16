
package BookShop.Customer;

import BookShop.Class.*;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


public class JoinsCustomer {
    GetConnection connect = new GetConnection();
    CompleteCustomer customer = new CompleteCustomer();
    
    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
    // Init JTable Customers - ROW 
    public Vector getDataRowCusto() {
        Vector vector = new Vector();     
        String query = "select *\n" +
                        "from Customer custo\n" +
                        "inner join HasInvoiceAdr inv on (inv.CustomerId = custo.CustomerId)\n" +
                        "inner join HasDelivAdr del on (inv.CustomerId = del.AddressId and inv.AddressId = del.CustomerId)\n" +
                        "inner join Address addr on (addr.AddressId = inv.AddressId)\n" +
                        "inner join SocialTitle soc on (soc.SocialTitleId = custo.SocialTitleId)\n" +
                        "left join SetCustomer setc on (setc.CustomerId = custo.CustomerId)\n" +
                        "left join StatusType stat on (stat.StatusTypeId = setc.StatusTypeId)\n" +
                        "order by custo.CustomerId;";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastCusto = null;
            
            while (rs.next()) {
                // Creation Cutomer 1
                if (lastCusto == null) {
                    CompleteCustomer custo = new CompleteCustomer(
                        rs.getLong("CustomerId"),
                        rs.getString("SocialTitleLabel"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("CustomerMail"),
                        rs.getString("StatusTypeLabel"),
                        customer.getBtn_Details());
                    vector.add(custo.getVectorCusto()); // Init of values
                    lastCusto = rs.getLong("CustomerId");
                }
                // Check if Customer is alreay existing
                if (lastCusto != rs.getLong("CustomerId")) {
                    CompleteCustomer custo = new CompleteCustomer(
                        rs.getLong("CustomerId"),
                        rs.getString("SocialTitleLabel"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("CustomerMail"),
                        rs.getString("StatusTypeLabel"),
                        customer.getBtn_Details());
                    vector.add(custo.getVectorCusto()); // Init of values
                    lastCusto = rs.getLong("CustomerId");
            }}
            
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vector;
    }
    
    // Init JTable Customers - COLUMNS
    public Vector getDataColumnCusto() {
        Vector vector = new Vector();
            vector.add("ID");
            vector.add("Social title");
            vector.add("Lastname");
            vector.add("Firstname");
            vector.add("Email");
            vector.add("Status");
            vector.add("");
            
            return vector;
    }        

    
    //***********************************************//
    // Init JTable Addresses - ROW 
    public Vector getDataRowAddress() {
        Vector vector = new Vector();     
        String query = "select *\n" +
                        "from Address addr\n" +
                        "inner join HasInvoiceAdr inv on (inv.AddressId = addr.AddressId)\n" +
                        "inner join HasDelivAdr del on (inv.CustomerId = del.AddressId and inv.AddressId = del.CustomerId)\n" +
                        "inner join Customer custo on (custo.CustomerId = inv.CustomerId)\n" +
                        "order by addr.AddressId;";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastCusto = null;
            
            while (rs.next()) {
                if (lastCusto == null) {
                    CompleteCustomer custo = new CompleteCustomer(
                        rs.getLong("AddressId"),
                        rs.getLong("CustomerId"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        customer.getBtn_Details());
                    vector.add(custo.getVectorAddress()); // Init of values
                    lastCusto = rs.getLong("CustomerId");
                }
                if (lastCusto != rs.getLong("CustomerId")) {
                    CompleteCustomer custo = new CompleteCustomer(
                        rs.getLong("AddressId"),
                        rs.getLong("CustomerId"),
                        rs.getString("AddressLastname"),
                        rs.getString("AddressFirstname"),
                        rs.getString("AddressStreet"),
                        rs.getString("AddressZip"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("AddressPhone"),
                        customer.getBtn_Details());
                    vector.add(custo.getVectorAddress()); // Init of values
                    lastCusto = rs.getLong("CustomerId");
                }   
            }  
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vector;
    }
    
    // Init JTable Addresses - COLUMNS        
    public Vector getDataColumnAddress() {
        Vector vector = new Vector();
            vector.add("ID");
            vector.add("Lastname");
            vector.add("Firstname");
            vector.add("Street");
            vector.add("Zip code");
            vector.add("City");
            vector.add("Country");
            vector.add("Phone number");
            vector.add("Status");
            vector.add("");
            
            return vector;
    }        
            
    
    ////////////////////////////////////////////////////////////////////////////
    // JComboBox //
    
    // Init JComboBox Shipping Addresses
    public Vector getDataComboBoxDelivery() {
        Vector vector = new Vector();
        
        String query = "select * from Address addr\n" +
                        "left join HasDelivAdr deliv on (addr.AddressId = deliv.AddressId)\n" +
                        "left join Customer custo on (deliv.CustomerId = custo.CustomerId)";

        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String lastCountry = null;
                while (rs.next()) {
                    if (lastCountry == null) {
                        Address address = new Address(
                            rs.getLong("AddressId"),
                            rs.getString("AddressLastname"),
                            rs.getString("AddressFirstname"),
                            rs.getString("AddressStreet"),
                            rs.getString("AddressZip"),
                            rs.getString("AddressCity"),
                            rs.getString("AddressCountry"),
                            rs.getString("AddressPhone"));
                    vector.add(address.getAddressCountry());
                    lastCountry = rs.getString("AddressCountry");
                    }
                    if (!lastCountry.equalsIgnoreCase(rs.getString("AddressCountry"))) {
                        Address address = new Address(
                            rs.getLong("AddressId"),
                            rs.getString("AddressLastname"),
                            rs.getString("AddressFirstname"),
                            rs.getString("AddressStreet"),
                            rs.getString("AddressZip"),
                            rs.getString("AddressCity"),
                            rs.getString("AddressCountry"),
                            rs.getString("AddressPhone"));
                    vector.add(address.getAddressCountry());
                    lastCountry = rs.getString("AddressCountry");
                    }  
                }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    } 
    
}
