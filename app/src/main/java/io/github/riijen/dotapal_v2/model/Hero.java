package io.github.riijen.dotapal_v2.model;

/**
 * Created by chase_000 on 2015-03-28.
 */
public enum Hero {
    ANTIMAGE        ("antimage", "1", "Anti-Mage"),
    AXE             ("axe", "2", "Axe"),
    BANE            ("bane", "3", "Bane"),
    BLOODSEEKER     ("bloodseeker", "4", "Bloodseeker"),
    CRYSTALMAIDEN   ("crystal_maiden", "5", "Crystal Maiden"),
    DROWRANGER      ("drow_ranger", "6", "Drow Ranger"),
    EARTHSHAKER     ("earthshaker", "7", "Earthshaker"),
    JUGGERNAUT      ("juggernaut", "8", "Juggernaut"),
    MIRANA          ("mirana", "9", "Mirana"),
    SHADOWFIEND     ("nevermore", "11", "Shadow Fiend"),
    MORPHLING       ("morphling", "10", "Morphling"),
    PHANTOMLANCER   ("phantom_lancer", "12", "Phantom Lancer"),
    PUCK            ("puck", "13", "Puck"),
    PUDGE           ("pudge", "14", "Pudge"),
    RAZOR           ("razor", "15", "Razor"),
    SANDKING        ("sand_king", "16", "Sand King"),
    STORMSPIRIT     ("storm_spirit", "17", "Storm Spirit"),
    SVEN            ("sven", "18", "Sven"),
    TINY            ("tiny", "19", "Tiny"),
    VENGEFULSPIRIT  ("vengefulspirit", "20", "Vengeful Spirit"),
    WINDRANGER      ("windrunner", "21", "Windranger"),
    ZEUS            ("zuus", "22", "Zeus"),
    KUNKKA          ("kunkka", "23", "Kunkka"),
    LINA            ("lina", "25", "Lina"),
    LICH            ("lich", "31", "Lich"),
    LION            ("lion", "26", "Lion"),
    SHADOWSHAMAN    ("shadow_shaman", "27", "Shadow Shaman"),
    SLARDAR         ("slardar", "28", "Slardar"),
    TIDEHUNTER      ("tidehunter", "29", "Tidehunter"),
    WITCHDOCTOR     ("witch_doctor", "30", "Witch Doctor"),
    RIKI            ("riki", "32", "Riki"),
    ENIGMA          ("enigma", "33", "Enigma"),
    TINKER          ("tinker", "34", "Tinker"),
    SNIPER          ("sniper", "35", "Sniper"),
    NECROPHOS       ("necrolyte", "36", "Necrophos");


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

    public String getFullName() { return "npc_dota_hero_" + name; }

    public String getId() {
        return id;
    }

    public String getLocalizedName() {
        return localizedName;
    }
}
