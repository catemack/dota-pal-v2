package io.github.riijen.dotapal_v2.model;

import java.util.List;

/**
 * Created by chase_000 on 2015-03-28.
 */
public class MatchHistory {

    private List<Match> matches;

    public MatchHistory(List matches) {
        this.matches = matches;
    }

    public List getMatches() {
        return matches;
    }
}
