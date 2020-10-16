package BookShop.Publisher;

import BookShop.Methods.GetConnection;
import BookShop.Book.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsPublisher 
{
    GetConnection con = new GetConnection();

    public Vector getDataColumnPubli() 
    {
        Vector v = new Vector();
            v.add("Id");
            v.add("Name");
            v.add("Mail");
            v.add("Contact Name");
            v.add("Status");
            
            return v;
    }
    
    public Vector getDataRowPubli() {
        Vector vectorPublisher = new Vector();
        String query =  "SELECT p.PublisherId, PublisherName, PublisherMail, PublisherContactName, StatusTypeLabel\n" +
                        "FROM PUBLISHER p\n" +
                        "INNER JOIN SETPUBLISHER sp\n" +
                        "ON p.PublisherId = sp.PublisherId\n" +
                        "INNER JOIN STATUSTYPE st\n" +
                        "ON st.StatusTypeId = sp.StatusTypeId\n" +
                        "ORDER BY PublisherId";
            
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            
            while (rs.next()) {
                CompletePublisher p = new CompletePublisher(
                        rs.getLong("PublisherId"),
                        rs.getString("PublisherName"),
                        rs.getString("PublisherMail"),
                        rs.getString("PublisherContactName"),
                        rs.getString("StatusTypeLabel"));
                vectorPublisher.add(p.getVector());
            }
            
            return vectorPublisher;
        } catch (SQLException ex) {
            Logger.getLogger(Publisher_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorPublisher;
    }
    
    public Vector getDataColumnBook() 
    {
        Vector v = new Vector();
            v.add("ISBN");
            v.add("Title");
            v.add("Author");
            v.add("Sub-Theme");
            v.add("Price");

            return v;
    }

    public Vector getDataRowBook(String b)
    {
        Vector vectorBook = new Vector();
            
        String query =  "SELECT BookIsbn, BookTitle, CONCAT(AuthorLastname , ' ' ,AuthorFirstname)as BookAuthor, SubThemeLabel,\n" +
                        "BookPrice, BookNote\n" +
                        "FROM BOOK b\n" +
                        "LEFT JOIN AUTHOR a\n" +
                        "ON b.AuthorId = a.AuthorId\n" +
                        "LEFT JOIN SUBTHEME st\n" +
                        "ON b.SubThemeId = st.SubThemeId\n" +
                        "LEFT JOIN PUBLISHER p\n" +
                        "ON b.PublisherId = p.PublisherId\n" +
                        "WHERE PublisherName = '" + b + "'";
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while (rs.next()) {
                CompleteBook book = new CompleteBook(
                        rs.getString("BookIsbn"),
                        rs.getString("BookTitle"),
                        rs.getString("BookAuthor"),
                        rs.getString("SubThemeLabel"),
                        rs.getBigDecimal("BookPrice"));
                vectorBook.add(book.getVector());
            }
      
            return vectorBook;
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorBook;
    }
}