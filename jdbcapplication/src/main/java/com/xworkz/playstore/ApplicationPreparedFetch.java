package com.xworkz.playstore;

import java.sql.*;

public class ApplicationPreparedFetch {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String url = "jdbc:mysql://localhost:3306/playstore";
        String username = "root";
        String password = "root@123";
        String fetchQuery = "select * from application";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url,username,password);
            preparedStatement = connection.prepareStatement(fetchQuery);
            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(" {  ID = "+resultSet.getInt(1)
                +",  NAME = "+resultSet.getString("name")
                +",  VERSION = "+resultSet.getDouble("version")
                +",  SIZE = "+resultSet.getDouble("size")
                +",  COMPANY = "+resultSet.getString("company")+" } ");
                System.out.println();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
