package com.flowerdesk.dao;

import com.flowerdesk.configuration.DatabaseConfig;
import com.flowerdesk.model.Tickets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TicketDAO {
    public boolean createTicket(Tickets ticket) throws SQLException {
        String sql = "INSERT INTO tickets(username, title, description, priority) VALUES(?, ?, ?, ?)";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, ticket.getUserName());
            ps.setString(2, ticket.getTitle());
            ps.setString(3, ticket.getDescription());
            ps.setString(4, ticket.getPriority());

            int res=ps.executeUpdate();
            return res>0;

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public boolean deleteTicket(String username,long id) throws SQLException {
        String sql = "DELETE FROM  tickets WHERE ticket_ID=? AND username=?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setLong(1,id);
            ps.setString(2,username);
            int res=ps.executeUpdate();
            return res>0;

        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public boolean viewTickets(String name) throws SQLException {
        String sql="SELECT * FROM tickets WHERE username = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1,name);
            try (ResultSet res = ps.executeQuery()) {
                boolean foundTickets = false;
                while (res.next()) {
                    foundTickets = true;
                    System.out.printf("Ticket ID: %d | Title: %s | Desc: %s | Priority: %s | Status: %s | Created: %s%n",
                            res.getLong("Ticket_ID"),
                            res.getString("title"),
                            res.getString("description"),
                            res.getString("priority"),
                            res.getString("status"),
                            res.getTimestamp("created_at")
                    );
                }
                return foundTickets;
            }
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public String viewAllTickets() throws SQLException {
        String sql = "SELECT * FROM tickets";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet res = ps.executeQuery()) {

            boolean foundTickets = false;

            while (res.next()) {
                foundTickets = true;
                System.out.printf("Ticket ID: %d | User: %s | Title: %s | Desc: %s | Priority: %s | Status: %s | Assigned To: %s | Created: %s | Updated: %s%n",
                        res.getLong("Ticket_ID"),
                        res.getString("username"),
                        res.getString("title"),
                        res.getString("description"),
                        res.getString("priority"),
                        res.getString("status"),
                        res.getString("Assigned"),
                        res.getTimestamp("created_at"),
                        res.getTimestamp("updated_at")
                );
            }

            if (!foundTickets) {
                return "There are currently no tickets in the system.";
            }

        } catch (SQLException e) {

            throw e;
        }
        return "Listed";
    }

    public boolean assignTo(long ticketId, String assignTo) throws SQLException {
        String sql = "UPDATE tickets SET Assigned = ? WHERE Ticket_ID = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(2,ticketId);
            ps.setString(1,assignTo);
            int res=ps.executeUpdate();
            return res>0;
        } catch (SQLException e) {
            throw new SQLException();
        }

    }

    public boolean updateStatus(long ticketIds, String updateStat) throws SQLException {
        String sql = "UPDATE tickets SET status = ? WHERE Ticket_ID = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setLong(2,ticketIds);
            ps.setString(1,updateStat);
            int res=ps.executeUpdate();
            return res>0;
        } catch (SQLException e) {
            throw new SQLException(e);
        }
    }

    public String  viewUsers() throws SQLException {
        String sql = "SELECT * FROM users WHERE role = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "u");
            try (ResultSet res = ps.executeQuery()) {
                boolean foundUsers = false;

                while (res.next()) {
                    foundUsers = true;

                    System.out.printf("ID: %d | EmpID: %s | Name: %s | Username: %s | Email: %s | Phone: %s | Dept: %s | Desig: %s | Role: %s | Status: %s | Created: %s | Updated: %s%n",
                            res.getLong("user_id"),
                            res.getString("employee_id"),
                            res.getString("full_name"),
                            res.getString("username"),
                            res.getString("email"),
                            res.getString("phone_number"),
                            res.getString("department"),
                            res.getString("designation"),
                            res.getString("role"),
                            res.getString("status"),
                            res.getTimestamp("created_at"),
                            res.getTimestamp("updated_at")
                    );
                }

                if (!foundUsers) {
                    return "No users found with the role: " ;
                }
            }

        } catch (SQLException e) {

            throw e;
        }
        return "listed";

    }

    public String viewITAgents() throws SQLException {
        String sql = "SELECT * FROM users WHERE role = ?";
        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "a");
            try (ResultSet res = ps.executeQuery()) {
                boolean foundUsers = false;
                while (res.next()) {
                    foundUsers = true;
                    System.out.printf("ID: %d | EmpID: %s | Name: %s | Username: %s | Email: %s | Phone: %s | Dept: %s | Desig: %s | Role: %s | Status: %s | Created: %s | Updated: %s%n",
                            res.getLong("user_id"),
                            res.getString("employee_id"),
                            res.getString("full_name"),
                            res.getString("username"),
                            res.getString("email"),
                            res.getString("phone_number"),
                            res.getString("department"),
                            res.getString("designation"),
                            res.getString("role"),
                            res.getString("status"),
                            res.getTimestamp("created_at"),
                            res.getTimestamp("updated_at")
                    );
                }
                if (!foundUsers) {
                    return "No users found with the role: " ;
                }
            }
        } catch (SQLException e) {
            throw e;
        }
        return "listed";
    }

    public boolean deleteUser(String userName) throws SQLException {
        String sql="DELETE FROM users WHERE username=?";

        try (Connection conn = DatabaseConfig.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1,userName);
            int res=ps.executeUpdate();
            return res>0;

        } catch (SQLException e) {
            throw new SQLException(e);
        }

    }
}
