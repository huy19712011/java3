package com.mycompany.java3.p5_jdbc_sqlServer.statement;

import com.mycompany.java3.p5_jdbc_sqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {

    public static void main(String[] args) {

            DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql1 = """
                            INSERT INTO employee(Id, Name, Salary)
                            VALUES(4, 'Tim', 50000);
                          """;
            String sql2 = """
                            INSERT INTO employee(Id, Name, Salary)
                            VALUES(5, 'Messi', 50000);
                          """;

//            connection.setAutoCommit(false);

            statement.addBatch(sql1);
            statement.addBatch(sql2);

            statement.executeBatch();

//            connection.commit();

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
