/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author LENOVO
 */
public class DBUtils {
        private static final String DB_NAME = "TTKPianoDB";
    private static final String USER_NAME = "sa";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() throws Exception {

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

        String url = "jdbc:sqlserver://localhost:1433;"
                   + "databaseName=" + DB_NAME
                   + ";encrypt=true;"
                   + "trustServerCertificate=true";

        return DriverManager.getConnection(url, USER_NAME, PASSWORD);
    }
}
