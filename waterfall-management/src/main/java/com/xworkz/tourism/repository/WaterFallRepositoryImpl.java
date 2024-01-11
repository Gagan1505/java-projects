package com.xworkz.tourism.repository;

import com.xworkz.tourism.dto.WaterFalldto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class WaterFallRepositoryImpl implements WaterFallRepository{
    String url = "jdbc:mysql://localhost:3306/tourism";
    String user = "root";
    String password = "Root@123";

    @Override
    public void saveWaterFall(WaterFalldto waterFall) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String insertQuery = "INSERT INTO WATERFALL(NAME,PLACE,RIVER_NAME,STATE) VALUES (?,?,?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.setString(1,waterFall.getName());
            preparedStatement.setString(2,waterFall.getPlace());
            preparedStatement.setString(3,waterFall.getRiverName());
            preparedStatement.setString(4,waterFall.getState());
            preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void saveWaterFall(List<WaterFalldto> waterFalldtos) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String insertQuery = "INSERT INTO WATERFALL(NAME,PLACE,RIVER_NAME,STATE) VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(insertQuery);
            for(WaterFalldto waterFalldto : waterFalldtos){
                System.out.println("Saving waterfall with name "+waterFalldto.getName());
                preparedStatement.setString(1,waterFalldto.getName());
                preparedStatement.setString(2,waterFalldto.getPlace());
                preparedStatement.setString(3,waterFalldto.getRiverName());
                preparedStatement.setString(4,waterFalldto.getState());
                preparedStatement.execute();
            }
            System.out.println("Inserted new entries into table---------");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void updateRiverByName(String waterFallName, String riverName) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String updateQuery = "UPDATE WATERFALL SET RIVER_NAME = ? WHERE NAME = ? ";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(updateQuery);

            preparedStatement.setString(1,riverName);
            preparedStatement.setString(2,waterFallName);

            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public boolean deleteWaterFallByName(String waterFallName) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        //try with resources------------------------------------------------------

        String deleteQuery = "DELETE FROM WATERFALL WHERE NAME = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(deleteQuery);

            preparedStatement.setString(1,waterFallName);
            preparedStatement.execute();
            System.out.println("Deleted the entry-------------------");
            return true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public WaterFalldto getWaterFallByName(String waterFallName) {
        WaterFalldto waterFalldto = new WaterFalldto();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String getWaterFallQuery = "SELECT * FROM WATERFALL WHERE NAME = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(getWaterFallQuery);
            preparedStatement.setString(1,waterFallName.toLowerCase());
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                waterFalldto.setName(resultSet.getString("NAME"));
                waterFalldto.setPlace(resultSet.getString("PLACE"));
                waterFalldto.setRiverName(resultSet.getString("RIVER_NAME"));
                waterFalldto.setState(resultSet.getString("STATE"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return waterFalldto;
    }

    @Override
    public List<WaterFalldto> getAllWaterFalls() {
        List<WaterFalldto> waterFalldtos = new ArrayList<>();

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String selectAllQuery = "SELECT * FROM WATERFALL";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;


        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(selectAllQuery);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                WaterFalldto waterFalldto = new WaterFalldto(resultSet.getString("NAME"),
                        resultSet.getString("PLACE"),
                        resultSet.getString("RIVER_NAME"),
                        resultSet.getString("STATE"));
                waterFalldtos.add(waterFalldto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return waterFalldtos;
    }


    @Override
    public String getRiverNameByName(String waterFallName) {
        String riverName = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        String selectNameQuery = "SELECT RIVER_NAME FROM WATERFALL WHERE NAME = ?";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DriverManager.getConnection(url,user,password);
            preparedStatement = connection.prepareStatement(selectNameQuery);

            preparedStatement.setString(1,waterFallName);
            resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                riverName = resultSet.getString("RIVER_NAME");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return riverName;
    }


}
