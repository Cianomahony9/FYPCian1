
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cian
 */
public class DbFamCon {
    Connection confam;
    public Connection getFamCon()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
           confam=  DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?useSSL=false","root","OmahonyCian@98");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbFamCon.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbFamCon.class.getName()).log(Level.SEVERE, null, ex);
        }
    
 
       return confam; 
    }
}
