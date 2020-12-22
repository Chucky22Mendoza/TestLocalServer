/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import test.connection.ConnectionDB;
import test.data.GetData;
import test.model.TestModel;

/**
 *
 * @author login
 */
public class Test {

    private static ConnectionDB connection;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        connection = new ConnectionDB();
        connection.createConnection();
        List<TestModel> list = GetData.all(connection.getConnection());
        System.out.println("||\t\tID\t\t||\t\tDESCRIPCION\t\t||\t\tVALOR\t\t||");
        System.out.println("--------------------------------------------------------------");
        list.forEach((val) -> {
            System.out.println("|\t\t" + val.getId() + "\t\t|\t\t" + val.getDescripcion() + "\t\t|\t\t" + val.getValor()+ "\t\t|");
        });
        connection.closeConnection();
    }
    
}
