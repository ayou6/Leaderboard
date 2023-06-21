package com.example.Leaderboard.Repository;

import com.example.Leaderboard.Model.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeaderBoardRepository extends JpaRepository<Leaderboard ,Long> {
    List<Leaderboard> findBySport(String sport);

}
