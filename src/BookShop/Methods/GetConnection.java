/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BookShop.Methods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cda607
 */
public class GetConnection {
    
    public Connection connectURL() {
        // Establish the connection.
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Oups:ClassNotFound" + ex.getMessage());
        }

       // Declare the JDBC objects.
        Connection connexion = null;
        
        try {
        // Create a variable for the connection string.
            String Url = "jdbc:sqlserver://localhost:1433;" +
            "databaseName=BookShop;user=sa;password=sa";            
        //Connection à la base de données
            connexion = DriverManager.getConnection(Url);
            
        } catch (SQLException ex) {
            System.out.println("oups : connection" + ex.getMessage());
        }

        return connexion;
    }
    
    
}
