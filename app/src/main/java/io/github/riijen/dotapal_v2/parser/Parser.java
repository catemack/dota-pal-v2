package io.github.riijen.dotapal_v2.parser;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.util.HashSet;
import java.util.Set;

public class Parser {

    /**
     * Returns the 10 most recently played games from a given account_id
     * @param rawJson - Raw JSON text buffered from dota 2 api
     *                using account_id - for Jandrix
     */
    public Set<Integer> parseByAccountId(String rawJson) {

        Set<Integer> matchIds = new HashSet<Integer>();
        JSONTokener convertedJson = new JSONTokener(rawJson);

        try {
            JSONObject jObject = new JSONObject(convertedJson);
            JSONObject result = jObject.getJSONObject("result");
            JSONArray matches = result.getJSONArray("matches");

            for (int i = 0 ; i < 10 ; i++) {
                JSONObject match = matches.getJSONObject(i);
                Integer matchId = match.getInt("match_id");
                matchIds.add(matchId);
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }

        return matchIds;
    }

}
