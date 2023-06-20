package com.example.Leaderboard.Model;

import java.util.List;

public record AssignTeamRequest(
        List<Long> teamIds
) {
}
