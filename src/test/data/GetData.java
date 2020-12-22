/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import test.model.TestModel;

/**
 *
 * @author login
 */
public class GetData {
    public static List<TestModel> all(Connection connection) {
        List<TestModel> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM test;";

            PreparedStatement preparedStatement = connection.prepareStatement(sql); //Evitar inyeccion SQL
            ResultSet result = preparedStatement.executeQuery(sql);
            
            while (result.next()) {
                list.add(new TestModel(
                                result.getInt("id"),
                                result.getString("descripcion"),
                                result.getInt("valor")
                        )
                );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return list;
    }
}
