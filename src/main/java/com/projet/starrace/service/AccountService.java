package com.projet.starrace.service;

import com.projet.starrace.entity.Account;
import com.projet.starrace.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAll() {
        return accountRepository.findAll();
    }


    public void add(Account account) {
        accountRepository.save(account);
    }


    public Account getById(int id) {
        return accountRepository.findById(id);
    }

    public void setById(int id, Account account){
        Account updatedAccount = this.getById(id);
        updatedAccount.setFirstName(account.getFirstName());
        updatedAccount.setLastName(account.getLastName());
        updatedAccount.setDiscordPseudo(account.getDiscordPseudo());
        updatedAccount.setBirthDate(account.getBirthDate());
        updatedAccount.setNationality(account.getNationality());
        updatedAccount.setSynopsis(account.getSynopsis());
        updatedAccount.setEmail(account.getEmail());
        this.accountRepository.save(updatedAccount);
    }

    public void removeById(int id){
        this.accountRepository.deleteById(id);
    }
}
