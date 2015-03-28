package io.github.riijen.dotapal_v2.model;

/**
 * Created by chase_000 on 2015-03-28.
 */
public enum Hero {
    ANTIMAGE    ("antimage", "1", "Anti-Mage"),


    private final String name;
    private final String id;
    private final String localizedName;

    Hero(String name, String id, String localizedName) {
        this.name = name;
        this.id = id;
        this.localizedName = localizedName;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getLocalizedName() {
        return localizedName;
    }
}
