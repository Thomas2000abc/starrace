package com.projet.starrace.repository;

import com.projet.starrace.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface TeamsRepository extends JpaRepository<Team,Integer> {

    public void deleteById(int id);

    public Team findById(int id);


}
