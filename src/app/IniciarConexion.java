package app;

import com.sun.istack.internal.logging.Logger;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author defcon
 */
public class IniciarConexion {
    
    public static void main(String []args)
    {
        try{
        MySql db = new MySql();
        db.conexionMySql();
        String nombre = "Persona";
        String Query ="SELECT *  FROM"+ nombre;
        db.comando = db.conexion.createStatement();
        db.registro = db.comando.executeQuery(Query);
        
        while(db.registro.next())
        {
            System.out.println("Nombre: "+ db.registro.getString(1)+ "\nApellido:" +
                    db.registro.getString(2));
            System.out.println("--------------------------------------------------");
            
        }
        
        
    }catch(SQLException ex){
        //Logger.getLogger(MySQL_Test.class.getName().log)
    }
}
}
