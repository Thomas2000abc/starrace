package com.projet.starrace.repository;
import com.projet.starrace.entity.Participation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipationRepository extends JpaRepository<Participation, Integer> {
    public Participation findById(int id);
    public void deleteById(int id);

}