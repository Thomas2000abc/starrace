package com.projet.starrace.repository;

import com.projet.starrace.entity.Tournaments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournamentsRepository extends JpaRepository<Tournaments, Integer> {

    public Tournaments findById(int id);
    public void deleteById(int id);

}