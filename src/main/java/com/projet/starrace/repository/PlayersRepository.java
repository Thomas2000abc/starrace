package com.projet.starrace.repository;

import com.projet.starrace.entity.Account;
import com.projet.starrace.entity.Players;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository <Players, Integer> {


    public Players findById(int id);
    public void deleteById(int id);

}