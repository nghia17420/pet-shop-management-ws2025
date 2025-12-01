/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nghiaduy.petshop.dao;

import com.nghiaduy.petshop.model.Product;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProductDAO {
    public static void save(Product product) {
        String query = "insert into products(name, category, price) values ('"+product.getName()+"','"+product.getCategory()+"','"+product.getPrice()+"')";
        DBOperations.setDataOrDelete(query, "Product added Successfully");
    }
    
    
    //display all products
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DBOperations.getData("select * from products");
            while(rs.next()){
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        } 
        return arrayList;
    }
    
    public static void update(Product product){
        String query = "update products set name = '"+product.getName()+"',category = '"+product.getCategory()+"',price = '"+product.getPrice()+"' where id = '"+product.getId()+"'";
        DBOperations.setDataOrDelete(query, "Product Updated Successfully");
    }
    
    public static void delete(String id) {
        String query = "delete from products where id = '"+id+"'";
        DBOperations.setDataOrDelete(query, "Product Deleted Successfully");
    }
    
    public static ArrayList<Product> getAllRecordsByCategory(String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from products where category = '"+category+"'");
            while(rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Product> filterProductByName(String name, String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from products where name like '%"+name+"%' and category = '"+category+"'");
            while(rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static Product getProductByName (String name) {
        Product product = new Product();
        try{
            ResultSet rs = DBOperations.getData("select * from products where name = '"+name+"'");
            while(rs.next()) {
                product.setName(rs.getString(2));
                product.setCategory(rs.getString(3));
                product.setPrice(rs.getString(4));
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return product;
    }
}
