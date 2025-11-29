package com.petshop.dao;

import com.petshop.model.Pet;
import com.petshop.util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PetDAO {
    public void add(Pet pet) throws SQLException {
        String sql = "INSERT INTO pets (owner_id, name, species, health_status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, pet.getOwnerId());
            stmt.setString(2, pet.getName());
            stmt.setString(3, pet.getSpecies());
            stmt.setString(4, pet.getHealthStatus());
            stmt.executeUpdate();
        }
    }

    public List<Pet> getByOwnerId(int ownerId) throws SQLException {
        List<Pet> list = new ArrayList<>();
        String sql = "SELECT * FROM pets WHERE owner_id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ownerId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    list.add(new Pet(
                        rs.getInt("id"),
                        rs.getInt("owner_id"),
                        rs.getString("name"),
                        rs.getString("species"),
                        rs.getString("health_status")
                    ));
                }
            }
        }
        return list;
    }
    
    public void updateHealth(int petId, String healthStatus) throws SQLException {
        String sql = "UPDATE pets SET health_status=? WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, healthStatus);
            stmt.setInt(2, petId);
            stmt.executeUpdate();
        }
    }
}
