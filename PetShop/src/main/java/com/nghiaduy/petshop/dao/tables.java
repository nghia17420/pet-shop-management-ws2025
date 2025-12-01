package com.nghiaduy.petshop.dao;

import javax.swing.JOptionPane;

//sql script to create tables for database
public class tables {
    public static void main(String args[]) {
        try {
            //script for user table
            String userTable = "create table user (id int AUTO_INCREMENT primary key, fullName varchar(100), email varchar(100), phone varchar(10), password varchar(100), status varchar(20), role varchar(20))";
            //DBOperations.setDataOrDelete(userTable, "User Table Cteated Successfully");
            
            //script for categories table
            String categories = "create table categories(id int AUTO_INCREMENT primary key, name varchar(200))";
            //DBOperations.setDataOrDelete(categories, "Categories Table Cteated Successfully");
            
            //script for products table
            String products = "create table products(id int AUTO_INCREMENT primary key, name varchar(200), category varchar(200), price varchar(200))";
            //DBOperations.setDataOrDelete(products, "Products Table Cteated Successfully");
            
            String bills = "create table bills(id int primary key, name varchar(200), phone varchar(10), email varchar(200), date varchar(50), total varchar(200), createdBy varchar(200))";
            //DBOperations.setDataOrDelete(bills, "bills Table Cteated Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
