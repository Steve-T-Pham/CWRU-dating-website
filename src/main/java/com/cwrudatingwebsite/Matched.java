package com.cwrudatingwebsite;

import javax.persistence.*;

@Entity
@Table(name="Match")
public class Matched {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    public String getMatcheUsername() {
        return matcheUsername;
    }

    public void setMatcheUsername(String matcheUsername) {
        this.matcheUsername = matcheUsername;
    }

    public int getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(int matchCount) {
        this.matchCount = matchCount;
    }

    @Column
    private String username;

    @Column
    private String matcheUsername;

    @Column
    private int matchCount;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
