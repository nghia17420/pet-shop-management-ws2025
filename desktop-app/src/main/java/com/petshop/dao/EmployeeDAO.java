package com.petshop.dao;

import com.petshop.model.Employee;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employees (name, role, phone, salary) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getRole());
            stmt.setString(3, emp.getPhone());
            stmt.setDouble(4, emp.getSalary());
            stmt.executeUpdate();
        } catch (SQLException e) { e.printStackTrace(); }
    }

    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employees";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Employee(rs.getInt("id"), rs.getString("name"),
                        rs.getString("role"), rs.getString("phone"), rs.getDouble("salary"), rs.getBoolean("isActive")));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return list;
    }
}
