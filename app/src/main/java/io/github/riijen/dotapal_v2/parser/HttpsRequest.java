package io.github.riijen.dotapal_v2.parser;

/**
 * Created by Ryan on 15-03-28.
 */
public class HttpsRequest {

    private static String STEAM_KEY = "29A1879DE34083B387041CE96FBA45E7";

    /**
     * Jandrix account_id for testing purposes
     */
    private String JANDRIX_ID = "4841978";

    public static String generateGeneralRequest(String account_id) {
        return "https://api.steampowered.com/IDOTA2Match_570/GetMatchHistory/V001/?" +
                "account_id=" + account_id +
                "&key=" + STEAM_KEY;
    }

    public static String generateRequestByMatchId(String match_id) {
        return "https://api.steampowered.com/IDOTA2Match_570/GetMatchDetails/V001/?" +
                "match_id=" + match_id +
                "&key=" + STEAM_KEY;
    }
}
