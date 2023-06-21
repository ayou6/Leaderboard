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
        private Long gameId;

        @OneToOne
        @JoinColumn(name = "team1Id", referencedColumnName = "teamId")
        private Team team1;

        @OneToOne
        @JoinColumn(name = "team2Id", referencedColumnName = "teamId")
        private Team team2;

        private Integer score1;
        private Integer score2;
}
