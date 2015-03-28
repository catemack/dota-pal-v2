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

    public void setGameStats(List<String> items, int gpm, int xpm, int totalGold, int denies,
                             int creeps, int level, int kills, int deaths, int assists) {
        isSet = true;
        this.items = items;
        this.gpm = gpm;
        this.xpm = xpm;
        this.totalGold = totalGold;
        this.denies = denies;
        this.creeps = creeps;
        this.level = level;
        this.kills = kills;
        this.deaths = deaths;
        this.assists = assists;
    }

    public String getPlayerID() {
        return playerID;
    }

    public String getHeroID() {
        return heroID;
    }

    public boolean isSet() {
        return isSet;
    }

    public List<String> getItems() {
        return items;
    }

    public int getGpm() {
        return gpm;
    }

    public int getXpm() {
        return xpm;
    }

    public int getTotalGold() {
        return totalGold;
    }

    public int getDenies() {
        return denies;
    }

    public int getCreeps() {
        return creeps;
    }

    public int getLevel() {
        return level;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public int getAssists() {
        return assists;
    }
}
