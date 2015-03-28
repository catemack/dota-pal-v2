package io.github.riijen.dotapal_v2.model;

import java.util.Map;

/**
 * Created by chase_000 on 2015-03-28.
 */
public class MatchHistory {

    private Map<String, Match> matches;

    public MatchHistory(Map<String, Match> matches) {
        this.matches = matches;
    }

    public Map<String, Match> getMatches() {
        return matches;
    }

    public Match getMatch(String key) {
        return matches.get(key);
    }
}
