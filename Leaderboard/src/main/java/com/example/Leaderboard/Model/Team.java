package com.example.Leaderboard.Model;
import java.util.List;
import lombok.*;
import javax.persistence.*;
@Data
@Setter
@Getter
@Entity
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String teamName;
    public String sport;

    @OneToMany
    List<Game> games;
    @OneToMany
    List<Players> players;

}
