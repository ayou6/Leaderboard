package com.example.Leaderboard.Repository;

import com.example.Leaderboard.Model.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationRepository extends JpaRepository<Register,Long> {

}
