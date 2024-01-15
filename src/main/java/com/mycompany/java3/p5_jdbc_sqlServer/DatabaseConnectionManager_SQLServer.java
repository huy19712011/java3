package com.mycompany.java3.p5_jdbc_sqlServer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnectionManager_SQLServer {

    private final String url;

    public DatabaseConnectionManager_SQLServer(String databaseName, String username, String password) {

        this.url = "jdbc:sqlserver://localhost:1433;database=" + databaseName
                + ";user=" + username
                + ";password=" + password
                + ";encrypt=true;" + "trustServerCertificate=true;" + "loginTimeout=30;";
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url);
    }

}
