package edu.act.moneytransfer.controllers;

import edu.act.moneytransfer.domains.Account;
import edu.act.moneytransfer.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    // For creating/inserting Account to the DB
    // call service class

    @PostMapping("/api/account/create")
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    // list all accounts
    @GetMapping("/api/account/list")
    public Iterable<Account> listAccounts() {
        return accountService.allAccounts();
    }
}
