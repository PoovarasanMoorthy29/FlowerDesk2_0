package com.flowerdesk.utils;

public class Validation {
    public static boolean checkEmailFormat(String email) {
        if (email == null) {
            return false;
        }
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return email.matches(emailRegex);
    }

    public static boolean checkPasswordFormat(String password) {
        if (password == null || password.trim().isEmpty()) {
            return false;
        }

        String passwordRegex = "^(?=.*[a-z])" + "(?=.*[A-Z])" + "(?=.*\\d)" +"(?=.*[@#$%^&+=!])"+ ".{8,}$";

        return password.matches(passwordRegex);
    }

    public static boolean checkPhoneNumberFormat(String phoneNo) {
        if (phoneNo == null) {
            return false;
        }
        phoneNo = phoneNo.trim();
        return phoneNo.matches("^[0-9]{10}$");
    }

    public static boolean checkValidRole(String role) {
        if(role==null){
            return false;
        }
        else return role.equals("u") || role.equals("a");
    }
}
