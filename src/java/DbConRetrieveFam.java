
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
 * 
 * Code acquired and modified from https://www.youtube.com/watch?v=akW6bzoRcZo
 */
         //start of modify 

public class DbConRetrieveFam {
    
    Connection conretrievefam;
               
    public Connection getConRetrieveFam()
    //DB connection 
            {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
           conretrievefam =  DriverManager.getConnection("jdbc:mysql://localhost:3306/customer?useSSL=false","root","OmahonyCian@98");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConRetrieveFam.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DbConRetrieveFam.class.getName()).log(Level.SEVERE, null, ex);
        }
    
 
       return conretrievefam; 
       
       //end of modify 
    }
}
