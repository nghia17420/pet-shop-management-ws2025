package com.petshop.dao;

import com.petshop.model.Shift;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShiftDAO {
    public void add(Shift shift) throws SQLException {
        String sql = "INSERT INTO shifts (employee_id, shift_date, start_time, end_time, attendance_status) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, shift.getEmployeeId());
            stmt.setDate(2, Date.valueOf(shift.getShiftDate()));
            stmt.setTime(3, Time.valueOf(shift.getStartTime()));
            stmt.setTime(4, Time.valueOf(shift.getEndTime()));
            stmt.setString(5, shift.getAttendanceStatus());
            stmt.executeUpdate();
        }
    }

    public List<Shift> getByEmployeeId(int empId) throws SQLException {
        List<Shift> list = new ArrayList<>();
        String sql = "SELECT * FROM shifts WHERE employee_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, empId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new Shift(
                        rs.getInt("id"),
                        rs.getInt("employee_id"),
                        rs.getDate("shift_date").toLocalDate(),
                        rs.getTime("start_time").toLocalTime(),
                        rs.getTime("end_time").toLocalTime(),
                        rs.getString("attendance_status")
                    ));
                }
            }
        }
        return list;
    }
}
