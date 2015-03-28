package io.github.riijen.dotapal_v2.parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import io.github.riijen.dotapal_v2.model.Match;
import io.github.riijen.dotapal_v2.model.Player;

public class Parser {

    /**
     * Returns the 10 most recently played games from a given account_id
     * @param rawJson - Raw JSON text buffered from dota 2 api
     *                using account_id - for Jandrix
     */
    public List<Match> parseByAccountId(String rawJson) {

        List<Match> allMatches = null;
        JSONTokener convertedJson = new JSONTokener(rawJson);

        try {
            JSONObject jObject = new JSONObject(convertedJson);
            JSONObject result = jObject.getJSONObject("result");

            int status = result.getInt("status");

            if (status == 15) {
                return allMatches;
            }

            allMatches = new ArrayList<Match>();

            JSONArray matches = result.getJSONArray("matches");

            for (int i = 0 ; i < 10 ; i++) {

                List<Player> radiant = new ArrayList<Player>();
                List<Player> dire = new ArrayList<Player>();

                JSONObject jmatch = matches.getJSONObject(i);

                String matchId = jmatch.getString("match_id");
                JSONArray players = jmatch.getJSONArray("players");

                for (int j = 0 ; j < players.length() ; j++) {
                    JSONObject player = players.getJSONObject(i);
                    String account_id = player.getString("account_id");
                    String hero_id = player.getString("hero_id");
                    int player_slot = player.getInt("player_slot");

                    if (player_slot < 128) {
                        radiant.add(new Player(account_id, hero_id));
                    } else {
                        dire.add(new Player(account_id, hero_id));
                    }
                }

                Match match = new Match(matchId, radiant, dire);
                allMatches.add(match);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return allMatches;
    }

    /**
     * Parse the details of a specific match
     * @param rawJson
     */

    public void parseMatchDetails(String rawJson, String account_id) {

        JSONTokener convertedJson = new JSONTokener(rawJson);

        try {
            JSONObject jObject = new JSONObject(convertedJson);
            JSONObject result = jObject.getJSONObject("result");




        } catch (JSONException e) {
            e.printStackTrace();
        }

        // TODO

    }

}
