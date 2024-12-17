package com.TekarchAccountService.AccountService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @GetMapping("/getAccount")

    public String GetAccount(){
        return  "This is Account Microservices";

    }
}
