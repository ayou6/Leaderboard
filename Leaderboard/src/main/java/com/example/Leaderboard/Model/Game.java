package com.example.Leaderboard.Model;
import lombok.*;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long gameId;
    @OneToOne
    @JoinColumn(name = "team1Id", referencedColumnName = "teamId")
    Team team1;

    @OneToOne
    @JoinColumn(name = "team2Id", referencedColumnName = "teamId")
    Team team2;
    public int score1;
    public int score2;


}

