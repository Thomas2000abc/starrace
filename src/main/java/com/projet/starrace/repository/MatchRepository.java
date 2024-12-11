package com.projet.starrace.repository;

import com.projet.starrace.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends JpaRepository<Match,Integer> {

    public void deleteById(int id);

    public Match findById(int id);
}