/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java3.p5_jdbc_sqlServer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

/**
 *
 * @author huynq
 */
public class NewMain {

    public static void main(String[] args) throws SQLException {

        System.out.println("Connecting to MySQL");

        DatabaseConnectionManager_SQLServer dcm = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();
            statement = connection.createStatement();

            String sql = "SELECT * FROM sales.customers";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("last_name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            resultSet.close();
            statement.close();
            connection.close();
        }

    }

}
