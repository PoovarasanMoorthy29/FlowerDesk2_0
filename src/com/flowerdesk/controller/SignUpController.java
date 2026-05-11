package com.flowerdesk.controller;

import com.flowerdesk.services.SignUpService;
import com.flowerdesk.view.SignUpView;

import java.sql.SQLException;

public class SignUpController {
    private final SignUpView signView;
    private final SignUpService signService;

    public SignUpController(SignUpView view, SignUpService service) {
        this.signView = view;
        this.signService = service;
    }

    public void init() {
        proceedRegistration();
    }

    private void proceedRegistration() {
        String employeeID = signView.getEmployeeID();

        String fullName = signView.getFullName();
        String userName = signView.getUserName();
        String email = signView.getEmail();
        String password = signView.getPassword();
        String phoneNumber = signView.getPhoneNo();
        String department = signView.getDepartment();
        String designation = signView.getDesignation();
        String role = signView.getRole();

        if (signService.saveUser(employeeID, fullName, userName, email, password,
                phoneNumber, department, designation, role)) {
            signView.showMessage("Registration successfully completed!!");

        } else {
            signView.showMessage("Please try again!!!!");
        }


    }
}
