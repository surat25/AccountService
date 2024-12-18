package com.TekarchAccountService.AccountService.Services;

import com.TekarchAccountService.AccountService.Models.Account;
import com.TekarchAccountService.AccountService.Repository.AccountRepository;
import com.TekarchAccountService.AccountService.Services.Interfaces.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    public final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccount() {
        return accountRepository.findAll();
    }
}
