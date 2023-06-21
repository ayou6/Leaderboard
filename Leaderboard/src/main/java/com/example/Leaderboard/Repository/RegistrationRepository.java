package com.example.Leaderboard.Repository;

import com.example.Leaderboard.Model.Registeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Registeration,Long> {

}
