package io.github.riijen.dotapal_v2.model;

import java.util.List;

/**
 * Created by chase_000 on 2015-03-28.
 */
public class Match implements Comparable<Match> {

    private String matchID;
    private List<Player> radiantPlayers;
    private List<Player> direPlayers;

    private int duration;
    public String lobbyType;
    public String gameMode;

    private boolean radiantWin;

    public Match(String id, List<Player> radiantPlayers, List<Player> direPlayers, String lobbyType) {

        this.matchID = id;
        this.radiantPlayers = radiantPlayers;
        this.direPlayers = direPlayers;
        this.lobbyType = lobbyType;

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

    public Player getPlayer(String playerID) {
        for (Player player : radiantPlayers) {
            if (player.getPlayerID().equals(playerID)) {
                return player;
            }
        }
        for (Player player : direPlayers) {
            if (player.getPlayerID().equals(playerID)) {
                return player;
            }
        }
        return null;
    }

    public boolean hasWon(String playerID) {
        for (Player radiantPlayer : radiantPlayers) {
            if (playerID.equals(radiantPlayer.getPlayerID())) {
                return radiantWin;
            }
        }
        for (Player direPlayer : direPlayers) {
            if (playerID.equals(direPlayer.getPlayerID())) {
                return !radiantWin;
            }
        }
        return false;
    }

    public boolean isRadiantWin() {
        return radiantWin;
    }

    public void setRadiantWin(boolean radiantWin) {
        this.radiantWin = radiantWin;
    }

    @Override
    public int compareTo(Match another) {
        int matchID = Integer.parseInt(this.matchID);
        int anotherMatchID = Integer.parseInt(another.getMatchID());

        if (matchID > anotherMatchID) {
            return 1;
        }
        else if (matchID == anotherMatchID) {
            return 0;
        }
        else return -1;
    }
}
