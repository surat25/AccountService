package com.TekarchAccountService.AccountService.controller;

import com.TekarchAccountService.AccountService.Models.Account;
import com.TekarchAccountService.AccountService.Services.AccountServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class AccountController {

    private final AccountServiceImpl accountService;

    public AccountController(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/account")

    public List<Account>getAccount(){
        return accountService.getAllAccount();

    }

    @PostMapping("/account")
    public Account addAccount(@RequestBody Account account){
        return accountService.addAccount(account);
    }

}
