package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    public static void connectToMysql (String url, String userName, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection (url, userName, password)){
            System.out.println("We're connected");
        }
    }
}
