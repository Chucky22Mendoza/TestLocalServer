/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author login
 */
public class ConnectionDB {
    private Connection CONNECTION;
    private final String HOST = "192.168.1.52";
    private final String PORT = "3306";
    private final String DBNAME = "test";
    private final String URLDB = "jdbc:mysql://" + HOST + ":" + PORT + "/" + DBNAME;
    private final String USER = "pdv_admin";
    private final String PASSWORD = "admin1234";
    
    public Connection getConnection() {
	return CONNECTION;
    }

    public void setConnection(Connection CONNECTION) {
	this.CONNECTION = CONNECTION;
    }
    
    public void createConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            CONNECTION = DriverManager.getConnection(URLDB, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
	} finally {
            System.out.println("Conexión creada correctamente");
        }
    }
    
    public void closeConnection() {
        try {
            CONNECTION.close();
            
            System.out.println("Conexión cerrsada correctamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
