package com.flowerdesk.services;

import com.flowerdesk.data.dao.RegistrationDAO;

public class SignUpService {
    private final RegistrationDAO regDAO;
    public SignUpService(RegistrationDAO dao){
        this.regDAO=dao;
    }
}
