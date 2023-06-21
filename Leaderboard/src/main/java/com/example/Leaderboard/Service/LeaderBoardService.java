package com.example.Leaderboard.Service;

import com.example.Leaderboard.Model.Leaderboard;
import com.example.Leaderboard.Repository.LeaderBoardRepository;
import com.example.Leaderboard.Request.LeaderBoardRequest;
import org.springframework.beans.factory.annotation.Autowired;

public class LeaderBoardService {
    @Autowired
    LeaderBoardRepository leaderBoardRepository;

    public void createLeaderBoard(LeaderBoardRequest leaderBoardRequest) {
        Leaderboard leaderBoard = new Leaderboard();
        leaderBoard.setTeamName(leaderBoardRequest.getTeamName());
        leaderBoard.setTeamWins(leaderBoardRequest.getWinners());
        leaderBoard.setTeamLosses(leaderBoardRequest.getLosses());
        leaderBoardRepository.save(leaderBoard);


    }
}
