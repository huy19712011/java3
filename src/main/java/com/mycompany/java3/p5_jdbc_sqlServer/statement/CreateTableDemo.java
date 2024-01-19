package com.mycompany.java3.p5_jdbc_sqlServer.statement;

import com.mycompany.java3.p5_jdbc_sqlServer.DatabaseConnectionManager_SQLServer;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateTableDemo {

    public static void main(String[] args) {

        DatabaseConnectionManager_SQLServer dcm
                = new DatabaseConnectionManager_SQLServer("test1", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = "CREATE TABLE employee("
			+ "Id INT NOT NULL,"
			+ "Name NVARCHAR(30) NOT NULL,"
			+ "Salary DECIMAL NOT NULL,"
			+ "PRIMARY KEY (Id));";

            String sql2 = """
                            CREATE TABLE employee(
                               Id INT NOT NULL,
                               Name NVARCHAR(30) NOT NULL,
                               Salary DECIMAL NOT NULL,
                               PRIMARY KEY (ID)
                            );
                         """;



            statement.execute(sql2);

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

            if (statement!=null)
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            if (connection!=null)
            try {
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }

}
