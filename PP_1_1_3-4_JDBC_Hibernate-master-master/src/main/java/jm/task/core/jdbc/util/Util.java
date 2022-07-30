package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
        private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
        private static final String HOST = "jdbc:mysql://localhost:3306/pre_project?useSSL=false&serverTimezone=UTC";
        private static final String LOGIN = "root";
        private static final String PASSWORD = "789%TYU123";

        public static Connection getConnection() {
            Connection connection=null;
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(HOST, LOGIN, PASSWORD);
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            return connection;
        }
    }





