package com.petshop.dao;

import com.petshop.model.Order;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public void add(Order order) throws SQLException {
        String sql = "INSERT INTO orders (customer_id, total_amount) VALUES (?, ?)"; // Date defaults to CURRENT_TIMESTAMP
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setInt(1, order.getCustomerId());
            stmt.setBigDecimal(2, order.getTotalAmount());
            stmt.executeUpdate();
            
            // Retrieve the auto-generated ID
            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    order.setId(generatedKeys.getInt(1));
                }
            }
        }
    }

    public List<Order> getByCustomerId(int customerId) throws SQLException {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM orders WHERE customer_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new Order(
                        rs.getInt("id"),
                        rs.getInt("customer_id"),
                        rs.getTimestamp("order_date").toLocalDateTime(),
                        rs.getBigDecimal("total_amount")
                    ));
                }
            }
        }
        return list;
    }
}
