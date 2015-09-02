package com.training.lsouza.bostonteams;

import java.io.Serializable;

/**
 * Created by Livia on 01/09/2015.
 */
public class Team implements Serializable {

    public static final int CELTICS = 0;
    public static final int BRUINS = 1;
    public static final int SOX = 2;
    public static final int PATS = 3;
    public static final int REV = 4;


    public Team(int teamID, String sport, String name, String league, String captain) {
        this.teamID = teamID;
        this.sport = sport;
        this.name = name;
        this.league = league;
        this.captain = captain;
    }

    int teamID;
    String sport;
    String name;
    String league;
    String captain;
}
