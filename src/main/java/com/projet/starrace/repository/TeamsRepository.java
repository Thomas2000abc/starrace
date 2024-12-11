package com.projet.starrace.repository;

import com.projet.starrace.entity.Account;
import com.projet.starrace.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamsRepository extends JpaRepository<Team, Integer> {


    public Team findById(int id);
    public void deleteById(int id);
}
