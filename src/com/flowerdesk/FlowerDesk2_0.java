package com.flowerdesk;

import com.flowerdesk.controller.*;
import com.flowerdesk.dao.LoginDAO;
import com.flowerdesk.dao.RegistrationDAO;
import com.flowerdesk.dao.TicketDAO;
import com.flowerdesk.services.LoginService;
import com.flowerdesk.services.SignUpService;
import com.flowerdesk.services.TicketServices;
import com.flowerdesk.utils.AppInfo;
import com.flowerdesk.utils.InputGetter;
import com.flowerdesk.view.*;


public class FlowerDesk2_0 {

    public static void main(String[] args) {
        LandingPageController landingPageController =new LandingPageController();
        landingPageController.init();

    }
}
