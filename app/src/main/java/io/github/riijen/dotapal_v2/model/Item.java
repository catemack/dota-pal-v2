package io.github.riijen.dotapal_v2.model;

/**
 * Created by Ryan on 15-03-28.
 */
public enum Item {

    BLINKDAGGER ("blink", "1", "Blink Dagger"),
    BLADESOFATTACK ("blades_of_attack", "2", "Blades Of Attack"),
    BROADSWORD ("broadsword", "3", "Broadsword"),
    CHAINMAIL ("chainmail", "4", "Chainmail"),
    CLAYMORE ("claymore", "5", "Claymore");




    private final String name;
    private final String id;
    private final String localizedName;

    Item(String name, String id, String localizedName) {
        this.name = name;
        this.id = id;
        this.localizedName = localizedName;
    }

}
