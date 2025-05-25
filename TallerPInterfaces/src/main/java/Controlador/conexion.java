/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author izzyc
 */
public class conexion {

    static String url = "jdbc:mysql://localhost:3306/escuela-taller";
    static String user = "root";
    static String pass = "cAicedx-17**";

    public static Connection conectar() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("No es posible conectar la base de datos");
            System.out.println("Mensaje de error: " + e.getMessage());
            e.printStackTrace(); 
        }
        return con;
    }
}
