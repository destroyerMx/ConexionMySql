
//Carlos  el  sql  tiene dos conectores en su pagina,  el mensaje te dice que   la version de JAva no trabaja bien con la version antigua,
//necesita la nueva
//https://dev.mysql.com/downloads/connector/j/ 

package app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;

public class MySql {
    
   Connection conexion = null;
   Statement comando = null;
   ResultSet  registro;
   
   public Connection conexionMySql(){
       
       try{
           //Driver 
           Class.forName("com.mysql.jdbc.Driver");
           String servidor = "jdbc:mysql://localhost:3306:/Escuela";
           String usuario = "root";
           String password = "Defcon18";
           
           conexion = DriverManager.getConnection(servidor, usuario, password);
           
           
       }catch(ClassNotFoundException ex){
           JOptionPane.showMessageDialog(null,ex,"erro en la base de datos" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
           conexion = null;
           
       }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,ex,"erro en la base de datos" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
           conexion = null;       
       }catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex,"erro en la base de datos" + ex.getMessage(),JOptionPane.ERROR_MESSAGE);
           conexion = null;       
   }finally{
           JOptionPane.showMessageDialog(null,"Conexion exitosa");
           return conexion;
       }   
}
}
