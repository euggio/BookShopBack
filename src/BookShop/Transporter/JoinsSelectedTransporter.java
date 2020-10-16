
package BookShop.Transporter;

import BookShop.Customer.Customer;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsSelectedTransporter {
    GetConnection connect = new GetConnection();
    CompleteTransporter transp = new CompleteTransporter();
    Long valueSelected;

    public JoinsSelectedTransporter(Long valueSelected) {
        this.valueSelected = valueSelected;
    }
    
    public Vector getTranspData() {
        Vector vector = new Vector();
        String query = "select *" +
                        "from Transporter transp\n" +
                        "left join Address addr on (transp.AddressId = addr.AddressId)\n" +
                        "left join SetTransporter setTransp on (transp.TransporterId = setTransp.StatusTypeId)\n" +
                        "left join StatusType stat on (setTransp.TransporterId = transp.TransporterId)" + 
                        "where (transp.TransporterId = " + valueSelected + ");";
    
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            int lastTransp;
            while (rs.next()) {
                vector.add(rs.getString("TransporterName"));
                vector.add(rs.getString("TransporterContactname"));
                vector.add(rs.getString("TransporterMail"));
                vector.add(rs.getString("AddressPhone"));
                vector.add(rs.getString("AddressStreet"));
                vector.add(rs.getString("AddressStreet2"));
                vector.add(rs.getString("AddressZip"));
                vector.add(rs.getString("AddressCity"));
                vector.add(rs.getString("AddressCountry"));
                vector.add(rs.getInt("TransporterTransittime"));
                vector.add(rs.getInt("TransporterMesurementmax"));
                vector.add(rs.getInt("TransporterWeightmax"));
                vector.add(rs.getBigDecimal("TransporterPrice"));
                vector.add(rs.getString("StatusTypeLabel"));
                vector.add(rs.getString("TransporterNote"));
            }
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return vector;
    }
    
}
