package com.flowerdesk.view;

import com.flowerdesk.utils.InputGetter;
import com.flowerdesk.utils.Validation;

import java.util.Scanner;

public class SignUpView {
    private final Scanner getInput= InputGetter.getScanner();

    public String getEmployeeID(){
        System.out.println("Enter your employee ID:");
        String empID=getInput.nextLine().trim();
        return empID;

    }
    public String getFullName(){
        System.out.println("Enter your full name:");
        String fullName=getInput.nextLine().trim();

        return fullName;
    }
    public String getUserName(){
        System.out.println("Set your UserName:");
        return getInput.nextLine().trim();

    }
    public String getEmail() {
        System.out.println("Enter your Email:");
        String email = getInput.nextLine().trim();
        while (true) {
            if (Validation.checkEmailFormat(email)) {
                return email;
            } else {
                System.out.println("Please enter valid email format (ex: yourexample@gmail.com)");
                System.out.println("Enter your Email:");
                email = getInput.nextLine().trim();
            }

        }

    }

    public String getPassword(){
        System.out.println("Set your Password:");
        String password= getInput.nextLine().trim();
        while (true) {
            if (Validation.checkPasswordFormat(password)) {
                return password;
            } else {
                System.out.println("< Please enter valid password follow the below rules > ");
                System.out.println("Password Rules:\n" +
                        "        - At least 8 characters\n" +
                        "        - One uppercase letter\n" +
                        "        - One lowercase letter\n" +
                        "        - One digit\n" +
                        "        - One special character\n" +
                        "example : Test@123");

                System.out.println("Enter your Password:");
                password = getInput.nextLine().trim();
            }

        }
    }
    public String getPhoneNo(){
        System.out.println("Enter your phone number:");
        String phoneNo=getInput.nextLine().trim();
        while (true) {
            if (Validation.checkPhoneNumberFormat(phoneNo)) {
                return phoneNo;
            } else {
                System.out.println("Please enter valid phone Number (contains only 10 digits) (ex: 9874563212)");
                System.out.println("Enter your Phone Number:");
                phoneNo = getInput.nextLine().trim();
            }

        }
    }
    public String getDepartment(){
        System.out.println("Enter your department (ex: HR ,Developer,etc.,):");
        String department=getInput.nextLine().trim();
        return department;
    }
    public String getDesignation(){
        System.out.println("Enter your designation (ex: QA,SD,Tester,Manager):");
        String designation=getInput.nextLine().trim();

        return designation;
    }
    public String getRole(){
        System.out.println("Roles:\nUser - U\nIT Agent - A\nEnter your Role( User / Agent ):");
        String role=getInput.nextLine().trim().toLowerCase();
        while (true) {
            if (Validation.checkValidRole(role)) {
                return role;
            } else {
                System.out.println("Please enter valid role (user -U Or IT agent -A)");
                System.out.println("Enter your Role:");
                role = getInput.nextLine().trim().toLowerCase();
            }

        }
    }
    public void showMessage(String message){
        System.out.println(message);
    }
}
