package com.example.Leaderboard.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LeaderBoardRequest {

    Integer Id;
    String teamName;
    Integer winners;
    Integer losses;
}
