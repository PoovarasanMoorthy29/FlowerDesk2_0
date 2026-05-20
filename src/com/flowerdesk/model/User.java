package com.flowerdesk.model;

public class User {
    private String  employeeID;
    private String fullName;
    private String userName;
    private String email;
    private String password;
    private String phoneNumber;
    private String department;
    private String designation;
    private String role;


    public User(String employeeID, String fullName, String userName, String email, String password, String phoneNumber,
                String department, String designation, String role) {
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.department = department;
        this.designation = designation;
        this.role = role;

    }

    public String getEmployeeID() {
        return employeeID;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public String getRole() {
        return role;
    }


}
