/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class ConectaBd { 
    
    public static Connection conectabd() throws ClassNotFoundException{
        
        try {
            Class.forName("org.postgresql.Driver");
          Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetoppc", "postgres", "920500");
          /*JOptionPane.showMessageDialog (null, "Conectado com suceso!");*/
          return con;
        }
            
        catch(SQLException error){
            
            JOptionPane.showMessageDialog (null, error);
            return null;
            
        }
          
    }
    
}
