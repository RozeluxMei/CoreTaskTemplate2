package jm.task.core.jdbc;

import jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // реализуйте алгоритм здесь
        String url = "jdbc:mysql://localhost:3306/learning";
        String user = "root";
        String password = "root";

        Util.connectToMysql(url,user,password);
    }
}

