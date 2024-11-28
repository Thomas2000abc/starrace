package com.projet.starrace.repository;

import com.projet.starrace.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    public Account findById(int id);
    public void deleteById(int id);

}
