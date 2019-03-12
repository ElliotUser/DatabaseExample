package ru.ivmiit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program {
    public static void main(String[] args) throws Exception {
        String dbUser = "postgres";
        String dbPassword = "qwerty";
        String connectionUrl = "jdbc:postgresql://localhost:5432/fix_users";

        Connection connection = DriverManager.getConnection(connectionUrl,dbUser,dbPassword);


        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM fix_user");

        while(resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
    }
}
