package com.example.Leaderboard.Model;

import lombok.*;

import javax.persistence.*;
@AllArgsConstructor
@NoArgsConstructor
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
