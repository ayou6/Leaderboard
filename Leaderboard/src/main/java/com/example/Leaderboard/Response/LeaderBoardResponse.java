package com.example.Leaderboard.Response;

import com.example.Leaderboard.Model.Leaderboard;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class LeaderBoardResponse {
    private List<Leaderboard> standings;

}
