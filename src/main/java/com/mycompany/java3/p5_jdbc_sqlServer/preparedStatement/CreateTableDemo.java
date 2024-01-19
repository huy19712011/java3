package com.mycompany.java3.p5_jdbc_sqlServer.preparedStatement;

import com.mycompany.java3.p5_jdbc_sqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTableDemo {

    public static void main(String[] args) {

            DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                            CREATE TABLE employee2(
                               Id INT NOT NULL,
                               Name NVARCHAR(30) NOT NULL,
                               Salary DECIMAL NOT NULL,
                               PRIMARY KEY (ID)
                            );
                         """;

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.execute();

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

            if (preparedStatement != null)
            try {
                preparedStatement.close();
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
