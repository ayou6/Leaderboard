package com.example.Leaderboard.Model;
import lombok.*;
import javax.persistence.*;
import java.util.List;
@Data
@Getter
@Setter
@Entity

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String playerName;
    public String teamName;
    public String sportName;
//    @OneToMany
//    public List<Game> games;
//    @OneToOne
//    Team team;
}
