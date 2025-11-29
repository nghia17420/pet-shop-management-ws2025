package com.petshop.dao;

import com.petshop.model.Product;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    public void add(Product product) throws SQLException {
        String sql = "INSERT INTO products (name, price, stock_quantity) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, product.getName());
            stmt.setBigDecimal(2, product.getPrice());
            stmt.setInt(3, product.getStockQuantity());
            stmt.executeUpdate();
        }
    }

    public List<Product> getAll() throws SQLException {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM products";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Product(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getBigDecimal("price"),
                    rs.getInt("stock_quantity")
                ));
            }
        }
        return list;
    }
    
    public void updateStock(int productId, int newQuantity) throws SQLException {
        String sql = "UPDATE products SET stock_quantity=? WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, newQuantity);
            stmt.setInt(2, productId);
            stmt.executeUpdate();
        }
    }
}
