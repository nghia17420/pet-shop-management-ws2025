package com.petshop.dao;

import com.petshop.model.Employee;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    // CREATE
    public void add(Employee emp) throws SQLException {
        String sql = "INSERT INTO employees (name, role, phone, salary, status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getRole());
            stmt.setString(3, emp.getPhone());
            stmt.setBigDecimal(4, emp.getSalary());
            stmt.setString(5, emp.getStatus());
            stmt.executeUpdate();
        }
    }

    // READ (All)
    public List<Employee> getAll() throws SQLException {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Employee(
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("role"),
                    rs.getString("phone"),
                    rs.getBigDecimal("salary"),
                    rs.getString("status")
                ));
            }
        }
        return list;
    }

    // UPDATE
    public void update(Employee emp) throws SQLException {
        String sql = "UPDATE employees SET name=?, role=?, phone=?, salary=?, status=? WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getRole());
            stmt.setString(3, emp.getPhone());
            stmt.setBigDecimal(4, emp.getSalary());
            stmt.setString(5, emp.getStatus());
            stmt.setInt(6, emp.getId());
            stmt.executeUpdate();
        }
    }

    // DELETE
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM employees WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
