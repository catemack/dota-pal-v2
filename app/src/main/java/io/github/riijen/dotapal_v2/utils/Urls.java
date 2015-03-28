package io.github.riijen.dotapal_v2.utils;

/**
 * Created by kanghee on 3/28/2015.
 */
public class Urls {

    public static String getHeroUrl(String heroID, String size) {
        // get hero name from heroID, put it into <name>
        // check online doc to see what suffix should be for size: tiny, small, etc
        return "http://cdn.dota2.com/apps/dota2/images/heroes/<name>_<suffix>";
    }
}
