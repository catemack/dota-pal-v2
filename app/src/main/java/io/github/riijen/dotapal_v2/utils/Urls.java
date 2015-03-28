package io.github.riijen.dotapal_v2.utils;

import io.github.riijen.dotapal_v2.model.Hero;

/**
 * Created by kanghee on 3/28/2015.
 */
public class Urls {

    public static String getHeroUrl(String heroID) {
        return "http://cdn.dota2.com/apps/dota2/images/heroes/" + Hero.findByID(heroID).getName() + "_sb.png";
    }
}
