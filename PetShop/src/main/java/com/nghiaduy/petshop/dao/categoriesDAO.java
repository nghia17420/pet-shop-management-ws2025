package com.nghiaduy.petshop.dao;

import com.mysql.cj.protocol.Resultset;
import com.nghiaduy.petshop.model.categories;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class categoriesDAO {
    public static void save(categories categories) {
        String query = "insert into categories (name) values ('"+categories.getName()+"')";
        DBOperations.setDataOrDelete(query, "Categories Added Successfully");
    }
    
    public static ArrayList<categories> getAllRecords () {
        ArrayList<categories> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DBOperations.getData("select * from categories");
            while(rs.next()){
                categories categories = new categories();
                categories.setId(rs.getInt("id"));
                categories.setName(rs.getString("name"));
                arrayList.add(categories);
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return arrayList;
    }
    
    public static void delete(String id) {
        String query = "delete from categories where id = '"+id+"'";
        DBOperations.setDataOrDelete(query, "Category Deleted Successfully");
    }
}
