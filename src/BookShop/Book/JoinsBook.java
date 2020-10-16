package BookShop.Book;

import BookShop.Comment.CompleteComment;
import BookShop.Methods.GetConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JoinsBook 
{
    GetConnection con = new GetConnection();
    
    public Vector getDataColumnBook() 
    {
        Vector v = new Vector();
            v.add("ISBN");
            v.add("Title");
            v.add("Author");
            v.add("Sub-Category");
            v.add("Price");
            v.add("Status");

            return v;
    }

    public Vector getDataRowBook()
    {
        Vector vectorBook = new Vector();
            
        String query =  "SELECT b.BookIsbn, BookTitle, CONCAT(AuthorLastname , ' ' ,AuthorFirstname)as BookAuthor, SubThemeLabel,\n" +
                        "BookPrice, BookNote, StatustypeLabel\n" +
                        "FROM BOOK b\n" +
                        "LEFT JOIN AUTHOR a\n" +
                        "ON b.AuthorId = a.AuthorId\n" +
                        "LEFT JOIN SUBTHEME st\n" +
                        "ON b.SubThemeId = st.SubThemeId\n" +
                        "LEFT JOIN SETBOOK sb\n" +
                        "ON b.bookIsbn = sb.bookisbn\n" +
                        "LEFT JOIN STATUSTYPE stp\n" +
                        "ON stp.StatusTypeId = sb.StatusTypeId\n" +
                        "ORDER BY AuthorFirstName";
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while (rs.next()) {
                CompleteBook b = new CompleteBook(
                        rs.getString("BookIsbn"),
                        rs.getString("BookTitle"),
                        rs.getString("BookAuthor"),
                        rs.getString("SubThemeLabel"),
                        rs.getBigDecimal("BookPrice"),
                        rs.getString("StatustypeLabel"));
                vectorBook.add(b.getVector());
            }
      
            return vectorBook;
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorBook;
    }
    
    public Vector getDataColumnComment() 
    {
        Vector v = new Vector();
            v.add("CustomerId");
            v.add("CustomerMail");
            v.add("CommentScore");
            v.add("CommentText");
            v.add("CustomerIp");
            
            return v;
    }

    public Vector getDataRowComment(String b)
    {
        Vector vectorComment = new Vector();
            
        String query =  "SELECT co.CustomerId, CustomerMail, CommentScore, CommentText, CommentCustomerIp\n" +
                        "FROM COMMENT co \n" +
                        "LEFT JOIN CUSTOMER cu\n" +
                        "ON co.CustomerId = cu.CustomerId\n" +
                        "WHERE BookIsbn = '" + b + "'";
        
        try {  
            Statement stmt = con.connectURL().createStatement();
            ResultSet rs= stmt.executeQuery(query);
            while (rs.next()) {
                CompleteComment c = new CompleteComment(
                        rs.getLong("CustomerId"),
                        rs.getString("CustomerMail"),
                        rs.getString("CommentScore"),
                        rs.getString("CommentText"),
                        rs.getString("CommentCustomerIp"));
                vectorComment.add(c.getVector());
            }
      
            return vectorComment;
        } catch (SQLException ex) {
            Logger.getLogger(Book_JPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return vectorComment;
    }
}