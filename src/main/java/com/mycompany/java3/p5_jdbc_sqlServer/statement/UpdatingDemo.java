package com.mycompany.java3.p5_jdbc_sqlServer.statement;

import com.mycompany.java3.p5_jdbc_sqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdatingDemo {

    public static void main(String[] args) {

            DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                            UPDATE employee
                            SET Name = 'Other Name', Salary = 75000
                            WHERE Id = 3;
                          """;

//            statement.execute(sql);
            statement.executeUpdate(sql);

            System.out.println("done...");

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (resultSet != null)
            try {
                resultSet.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (statement != null)
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (connection != null)
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
}
