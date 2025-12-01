package com.nghiaduy.petshop.dao;
import java.sql.*;

//get connection to desired database
public class connectionProvider {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop?useSSL=false","root","nghia");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}