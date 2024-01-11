package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcApplication {

    public static void main(String[] args) {

        // 6 steps
        //1.load and register in Driver class ------------------------------------------------------------
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Loaded and Registered successfully in Driver class");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //2.get a connection with url using DriverManager class-------------------------------------------
        String jdbcUrl = "jdbc:mysql://localhost:3306/playstore";
        String userName = "root";
        String password = "Root@123";

        String insertQuery = "INSERT INTO application (ID,NAME,VERSION,SIZE,COMPANY) VALUES (7,'uber',1.3,67.67,'META')";

        //3.creating a statement -------------------------------------------------------------------------
        //4.executing a sql query ------------------------------------------------------------------------
        //5.Process the  Resultant data-------------------------------------------------------------------
        //6.Close the costly resources -------------------------------------------------------------------

        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(jdbcUrl,userName,password);
            statement = connection.createStatement();
            boolean result = statement.execute(insertQuery);
            System.out.println("Execute return type is " +result);
            System.out.println("inserted a data into the table !!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Connection established using url !!!!!!!!!!!!!!!!!!");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally{

            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
