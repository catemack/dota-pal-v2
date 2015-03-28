package io.github.riijen.dotapal_v2.model;

import java.util.List;

/**
 * Created by chase_000 on 2015-03-28.
 */
public class Player {

    private String playerID;
    private String heroID;
    private boolean isSet;

    private List<String> items;
    private int gpm;
    private int xpm;
    private int totalGold;
    private int denies;
    private int creeps;
    private int level;
    private int kills;
    private int deaths;
    private int assists;

    public Player(String playerID, String heroID) {
        this.playerID = playerID;
        this.heroID = heroID;
        isSet = false;
    }

    public void setGameStats() {

    }



}
