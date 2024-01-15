package com.mycompany.java3.p5_jdbc_sqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDatabaseConnection {
    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=test1;"
                        + "user=sa;"
                        + "password=123456;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=30;";

        ResultSet result = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
                Statement statement = connection.createStatement();) {
            // Code here.
            System.out.println("Connected...");
            String sql = "SELECT * FROM sales.customers";
            result = statement.executeQuery(sql);

            while (result.next()) {
                System.out.println(result.getString(2));
            }

        }
        // Handle any errors that may have occurred.
        catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
