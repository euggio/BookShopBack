
package BookShop.Transporter;

import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsTransporter {
    GetConnection connect = new GetConnection();
    CompleteTransporter transporter = new CompleteTransporter();
    
    ////////////////////////////////////////////////////////////////////////////
    // JTable //
    
    // Init JTable Transporters - ROW 
    public Vector getDataRowTransporters() {
        Vector vector = new Vector();     
        String query = "select transp.TransporterId,\n" +
                        "transp.TransporterName,\n" +
                        "transp.TransporterMail,\n" +
                        "transp.TransporterContactname,\n" +
                        "addr.AddressCity,\n" +
                        "addr.AddressCountry,\n" +
                        "addr.AddressPhone,\n" +
                        "stat.StatusTypeLabel\n" +
                        "from Transporter transp\n" +
                        "left join Address addr on (transp.AddressId = addr.AddressId)\n" +
                        "left join SetTransporter setTransp on (transp.TransporterId = setTransp.StatusTypeId)\n" +
                        "left join StatusType stat on (setTransp.TransporterId = transp.TransporterId);";
            
        try {  
            Statement stmt = connect.connectURL().createStatement();
            ResultSet rs = stmt.executeQuery(query);
            
            Long lastTransp = null;
            
            while (rs.next()) {
                if (lastTransp == null) {
                    CompleteTransporter custo = new CompleteTransporter(
                        rs.getLong("TransporterId"),
                        rs.getString("TransporterName"),
                        rs.getString("TransporterContactName"),
                        rs.getString("TransporterMail"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("StatusTypeLabel"),
                        transporter.getBtn_Details());
                    vector.add(custo.getVectorTransp()); // Init of values
                    lastTransp = rs.getLong("TransporterId");
                }
                if (lastTransp != rs.getLong("TransporterId")) {
                    CompleteTransporter custo = new CompleteTransporter(
                        rs.getLong("TransporterId"),
                        rs.getString("TransporterName"),
                        rs.getString("TransporterContactName"),
                        rs.getString("TransporterMail"),
                        rs.getString("AddressPhone"),
                        rs.getString("AddressCity"),
                        rs.getString("AddressCountry"),
                        rs.getString("StatusTypeLabel"),
                        transporter.getBtn_Details());
                    vector.add(custo.getVectorTransp()); // Init of values
                    lastTransp = rs.getLong("TransporterId");
                }   
            }  
            return vector;
        } catch (SQLException ex) {
            Logger.getLogger(Transporter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vector;
    }
    
    // Init JTable Transporters - COLUMNS        
    public Vector getDataColumnTransporters() {
        Vector vector = new Vector();
            vector.add("ID");
            vector.add("Company");
            vector.add("Contact");
            vector.add("Email");
            vector.add("City");
            vector.add("Country");
            vector.add("Phone number");
            vector.add("Status");
            vector.add("");
            
            return vector;
    }               
    
    ////////////////////////////////////////////////////////////////////////////
    // JComboBox //
    
    

}
