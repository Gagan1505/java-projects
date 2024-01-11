package com.xworkz.playstore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteApplicationDetails {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){

        }

        String deleteQuery = "DELETE FROM APPLICATION WHERE ID = ?";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/playstore","root","root@123");
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

            pstmt.setInt(1,2);
            pstmt.execute();

//            pstmt.setDouble(1,3.5);
//            pstmt.setInt(2,2);
//            pstmt.execute();
//
//            pstmt.setDouble(1,7.0);
//            pstmt.setInt(2,3);
//            pstmt.execute();

            System.out.println("Deleted entries using prepared statement----------------------------");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
