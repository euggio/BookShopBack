
package BookShop.Methods;

import BookShop.Class.Address;
import BookShop.Class.SocialTitle;
import BookShop.Class.StatusType;
import BookShop.Customer.Customer;
import BookShop.Transporter.Transporter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ComboBox {
    GetConnection connect = new GetConnection();
    
    // Init JComboBox StatusType
    public Vector getDataComboBoxStatus() {
        Vector vector = new Vector();
        
        String query = "select * from StatusType order by StatusTypeLabel ASC;";
        
        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    StatusType status = new StatusType(rs.getLong("StatusTypeId"), rs.getString("StatusTypeLabel"));
                    vector.add(status.getStatusTypeLabel());
                }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Transporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
        
    }
    
    // Init JComboBox SocialTitle
    public Vector getDataComboBoxSocial() {
        Vector vector = new Vector();
        
        String query = "select * from SocialTitle order by SocialTitleId ASC;";
        
        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
                while (rs.next()) {
                    SocialTitle social = new SocialTitle(rs.getLong("SocialtitleId"), rs.getString("SocialtitleLabel"));
                    vector.add(social.getSocialtitleLabel());
                }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
        
    }
    
     // Init JComboBox City
    public Vector getDataComboBoxCity() {
        Vector vector = new Vector();
        
        String query = "select * from Address order by AddressCity ASC;";
        
        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String lastCity = null;
                while (rs.next()) {
                    if (lastCity == null) {
                    Address address = new Address(rs.getString("AddressCity"), rs.getString("AddressCountry"));
                    vector.add(address.getAddressCity());
                    lastCity = rs.getString("AddressCity");
                    }
                    if (!lastCity.equalsIgnoreCase(rs.getString("AddressCity"))) {
                        Address address = new Address(rs.getString("AddressCity"), rs.getString("AddressCountry"));
                    vector.add(address.getAddressCity());
                    lastCity = rs.getString("AddressCity");
                    }
                }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vector;
    }
    
    // Init JComboBox Country
    public Vector getDataComboBoxCountry() {
        Vector vector = new Vector();
        
        String query = "select * from Address order by AddressCountry ASC;";

        try {
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            String lastCountry = null;
                while (rs.next()) {
                    if (lastCountry == null) {
                        Address address = new Address(rs.getString("AddressCity"), rs.getString("AddressCountry"));
                    vector.add(address.getAddressCountry());
                    lastCountry = rs.getString("AddressCountry");
                    }
                    if (!lastCountry.equalsIgnoreCase(rs.getString("AddressCountry"))) {
                        Address address = new Address(rs.getString("AddressCity"), rs.getString("AddressCountry"));
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
