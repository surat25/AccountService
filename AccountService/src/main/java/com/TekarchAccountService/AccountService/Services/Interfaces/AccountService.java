package com.TekarchAccountService.AccountService.Services.Interfaces;

import com.TekarchAccountService.AccountService.Models.Account;

import java.util.List;

public interface AccountService {

    Account addAccount(Account account);
    List<Account> getAllAccount();
}
