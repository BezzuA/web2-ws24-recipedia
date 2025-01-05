package de.fhdo.Recipedia.repository;

import de.fhdo.Recipedia.entity.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {
    List<Challenge> findAllByOrderByEndDateDesc();
}