/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conecction;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author plus_
 */   

public class Conectar {

    public static Connection AbrirConexion() {
        // Ruta donde está al db creada

        String sjdbc = "jdbc:sqlite";
        Path path = Paths.get("src/Conecction/Cuerpo de agua.db");
        String url = sjdbc + ":\\" + path.toAbsolutePath();
        
        Connection conn = null;

        try {
            // Creamos la conexión
            conn = DriverManager.getConnection(url);
            //JOptionPane.showMessageDialog(null, "CONECTADOS");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void CerrarConexion(Connection conn){
        
        try {
            // Creamos la conexión
            
            conn.close();
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void IngresarDatos(){
        
    }
    public static void EditarDatos(){
        
    }
    public static void ActualizarDatos(){
        
    }
    public static void EliminarDatos(){
        
    }
}
