package com.example.Leaderboard.Model;

import lombok.*;


import javax.persistence.*;
@Data


public class Players {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;





}
