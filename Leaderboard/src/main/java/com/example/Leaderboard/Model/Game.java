package com.example.Leaderboard.Model;
import lombok.*;
import javax.persistence.*;
@Data
@Setter
@Getter
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @OneToOne
    public Team team1;
    @OneToOne
    public Team team2;
    public int score1;
    public int score2;

}
