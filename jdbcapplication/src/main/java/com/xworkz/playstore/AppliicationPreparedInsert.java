package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AppliicationPreparedInsert {

    public static void main(String[] args) {


        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){

        }

        String insertQuery = "INSERT INTO APPLICATION(ID,NAME,VERSION,SIZE,COMPANY) VALUES(?,?,?,?,?)";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/playstore","root","Root@123");
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);

            pstmt.setInt(1,1);
            pstmt.setString(2,"Instagram");
            pstmt.setDouble(3,6.7);
            pstmt.setDouble(4,117.98);
            pstmt.setString(5,"Meta");
            pstmt.execute();

            pstmt.setInt(1,4);
            pstmt.setString(2,"Whatsapp");
            pstmt.setDouble(3,1.7);
            pstmt.setDouble(4,79.83);
            pstmt.setString(5,"Meta");
            pstmt.execute();

            System.out.println("Inserted new entries using prepared statement");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
