/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghiaduy.petshop.dao;

import java.sql.*;
import com.nghiaduy.petshop.model.user;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author nghia
 */
public class userDAO {

    public static void save(user user) {
        String query = "insert into user(fullName, email, phone, password, status) values('" + user.getFullName() + "','" + user.getEmail() + "','" + user.getPhone() + "','" + user.getPassword() + "','false')";
        DBOperations.setDataOrDelete(query, "Registered Successfully! Wait for Admin Approval");
    }

    //login check method
    public static user login(String phone, String password) {
        user user = null;
        try {
            ResultSet rs = DBOperations.getData("select * from user where phone='" + phone + "' and password = '" + password + "'");
            while (rs.next()) {
                user = new user();
                user.setStatus(rs.getString("status"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return user;
    }

    public static void updatePassword(String phone, String newPassword) {
        String query = "update user set password = '" + newPassword + "' where phone = '" + phone + "'";
        DBOperations.setDataOrDelete(query, "Password Changed Successfully");
    }
    
    public static ArrayList<user> getAllRecords (String phone) {
        ArrayList<user> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperations.getData("select * from user where phone like '%"+phone+"%'");
            while (rs.next()){
                user user = new user();
                user.setId(rs.getInt("id"));
                user.setFullName(rs.getString("fullName"));
                user.setEmail(rs.getString("email"));
                user.setPhone(rs.getString("phone"));
                user.setStatus(rs.getString("status"));
                arrayList.add(user);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void changeStatus(String phone, String status) {
        String query = "update user set status = '"+status+"' where phone = '"+phone+"'";
        DBOperations.setDataOrDelete(query, "Status Changed Successfully");
    }

}
