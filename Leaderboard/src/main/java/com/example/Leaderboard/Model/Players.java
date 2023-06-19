package com.example.Leaderboard.Model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@Data
@Getter
@Setter
@Entity

public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;





}
