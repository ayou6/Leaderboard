package com.example.Leaderboard.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
@Setter
@Getter
@Entity
public class Leaderboard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String teamName;
    Integer teamWins;
    Integer teamLosses;
}
