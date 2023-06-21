package com.example.Leaderboard.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Player {
    public Long id;
    public String userName;
    public String password;
}

