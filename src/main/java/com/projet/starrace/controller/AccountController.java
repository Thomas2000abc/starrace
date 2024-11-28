package com.projet.starrace.controller;

import com.projet.starrace.entity.Account;
import com.projet.starrace.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("account")
public class AccountController {

    private AccountService accountService;
    public AccountController(AccountService accountService){
        this.accountService = accountService;
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path="all", produces = APPLICATION_JSON_VALUE)
    public List<Account> getAll(){
        return accountService.getAll();
    }

    @ResponseStatus(value = HttpStatus.OK)
    @GetMapping(path = "id/{id}", produces = APPLICATION_JSON_VALUE)
    public Account getById(@PathVariable int id) {
        return accountService.getById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public void add(@RequestBody Account account) {
        this.accountService.add(account);
    }


    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @PutMapping(path = "{id}" ,consumes = APPLICATION_JSON_VALUE)
    public void setById(@PathVariable int id, @RequestBody Account account){
        this.accountService.setById(id, account);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping(path = "{id}")
    public void removeById(@PathVariable int id){
        this.accountService.removeById(id);
    }

}
