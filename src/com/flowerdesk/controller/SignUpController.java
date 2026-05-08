package com.flowerdesk.controller;

import com.flowerdesk.services.SignUpService;
import com.flowerdesk.view.SignUpView;

public class SignUpController {
    private final SignUpView signView;
    private final SignUpService signService;
    public SignUpController(SignUpView view,SignUpService service){
        this.signView=view;
        this.signService=service;
    }
    public void init(){


    }
}
