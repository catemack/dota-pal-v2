package io.github.riijen.dotapal_v2.model;

import java.util.List;

/**
 * Created by chase_000 on 2015-03-28.
 */
public class Match implements Comparable {

    private String matchID;
    private List<Player> radiantPlayers;
    private List<Player> direPlayers;

    private boolean radiantWin;

    public Match(String id, List<Player> radiantPlayers, List<Player> direPlayers) {

        this.matchID = id;
        this.radiantPlayers = radiantPlayers;
        this.direPlayers = direPlayers;

    }

    public String getMatchID() {
        return matchID;
    }

    public List<Player> getRadiantPlayers() {
        return radiantPlayers;
    }

    public List<Player> getDirePlayers() {
        return direPlayers;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    @Override
    public int compareTo(Object another) {
        return 0;
    }
}
