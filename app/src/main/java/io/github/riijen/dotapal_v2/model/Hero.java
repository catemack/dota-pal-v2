package io.github.riijen.dotapal_v2.model;

import java.util.HashMap;
import java.util.Map;

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
    NECROPHOS       ("necrolyte", "36", "Necrophos"),
    WARLOCK         ("warlock", "37", "Warlock"),
    BEASTMASTER     ("beastmaster", "38", "Beastmaster"),
    QUEENOFPAIN     ("queenofpain", "39", "Queen of Pain"),
    VENOMANCER      ("venomancer", "40", "Venomancer"),
    FACELESSVOID    ("faceless_void", "41", "Faceless Void"),
    WRAITHKING      ("skeleton_king", "42", "Wraith King"),
    DEATHPROPHET    ("death_prophet", "43", "Death Prophet"),
    PHANTOMASSASSIN ("phantom_assassin", "44", "Phantom Assassin"),
    PUGNA           ("pugna", "45", "Pugna"),
    TEMPLARASSASSIN ("templar_assassin", "46", "Templar Assassin"),
    VIPER           ("viper", "47", "Viper"),
    LUNA            ("luna", "48", "Luna"),
    DRAGONKNIGHT    ("dragon_knight", "49", "Dragon Knight"),
    DAZZLE          ("dazzle", "50", "Dazzle"),
    CLOCKWERK       ("rattletrap", "51", "Clockwerk"),
    NATURESPROPHET  ("furion", "53", "Nature's Prophet"),
    LIFESTEALER     ("life_stealer", "54", "Lifestealer"),
    DARKSEER        ("dark_seer", "55", "Dark Seer"),
    CLINKZ          ("clinkz", "56", "Clinkz"),
    OMNIKNIGHT      ("omniknight", "57", "Omniknight"),
    ENCHANTRESS     ("enchantress", "58", "Enchantress"),
    HUSKAR          ("huskar", "59", "Huskar"),
    NIGHTSTALKER    ("night_stalker", "60", "Night Stalker"),
    BROODMOTHER     ("broodmother", "61", "Broodmother"),
    BOUNTYHUNTER    ("bounty_hunter", "62", "Bounty Hunter"),
    WEAVER          ("weaver", "63", "Weaver"),
    JAKIRO          ("jakiro", "64", "Jakiro"),
    BATRIDER        ("batrider", "65", "Batrider"),
    CHEN            ("chen", "66", "Chen"),
    SPECTRE         ("spectre", "67", "Spectre"),
    DOOM            ("doom_bringer", "69", "Doom"),
    ANCIENTAPPARITION ("ancient_apparition", "68", "Ancient Apparition"),
    URSA            ("ursa", "70", "Ursa"),
    SPIRITBREAKER   ("spirit_breaker", "71", "Spirit Breaker"),
    GYROCOPTER      ("gyrocopter", "72", "Gyrocopter"),
    ALCHEMIST       ("alchemist", "73", "Alchemist"),
    INVOKER         ("invoker", "74", "Invoker"),
    SILENCER        ("silencer", "75", "Invoker"),
    OUTWORLDDEVOURER ("obsidian_destroyer", "76", "Outworld Devourer"),
    LYCAN           ("lycan", "77", "Lycan"),
    BREWMASTER      ("brewmaster", "78", "Brewmaster"),
    SHADOWDEMON     ("shadow_demon", "79", "Shadow Demon"),
    LONEDRUID       ("lone_druid", "80", "Lone Druid"),
    CHAOSKNIGHT     ("chaos_knight", "81", "Chaos Knight"),
    MEEPO           ("meepo", "82", "Meepo"),
    TREANTPROTECTOR ("treant", "83", "Treant Protector"),
    OGREMAGI        ("ogre_magi", "84", "Ogre Magi"),
    UNDYING         ("undying", "85", "Undying"),
    RUBICK          ("rubick", "86", "Rubick"),
    DISRUPTOR       ("disruptor", "87", "Disruptor"),
    NYXASSASSIN     ("nyx_assassin", "88", "Nyx Assassin"),
    NAGASIREN       ("naga_siren", "89", "Naga Siren"),
    KEEPEROFTHELIGHT ("keeper_of_the_light", "90", "Keeper of the Light"),
    WISP            ("wisp", "91", "Io"),
    VISAGE          ("visage", "92", "Visage"),
    SLARK           ("slark", "93", "Slark"),
    MEDUSA          ("medusa", "94", "Medusa"),
    TROLLWARLORD    ("troll_warlord", "95", "Troll Warlord"),
    CENTAURWARRUNNER ("centaur", "96", "Centaur Warrunner"),
    MAGNUS          ("magnataur", "97", "Magnus"),
    TIMBERSAW       ("shredder", "98", "Timbersaw"),
    BRISTLEBACK     ("bristleback", "99", "Bristleback"),
    TUSK            ("tusk", "100", "Tusk"),
    SKYWRATHMAGE    ("skywrath_mage", "101", "Skywrath Mage"),
    ABADDON         ("abaddon", "102", "Abaddon"),
    ELDERTITAN      ("elder_titan", "103", "Elder Titan"),
    LEGIONCOMMANDER ("legion_commander", "104", "Legion Commander"),
    EMBERSPIRIT     ("ember_spirit", "106", "Ember Spirit"),
    EARTHSPIRIT     ("earth_spirit", "107", "Earth Spirit"),
    TERRORBLADE     ("terrorblade", "109", "Terrorblade"),
    PHOENIX         ("phoenix", "110", "Phoenix"),
    ORACLE          ("oracle", "111", "Oracle"),
    TECHIES         ("techies", "105", "Techies"),
    WINTERWYVERN    ("winter_wyvern", "112", "Winter Wyvern");

    private final String name;
    private final String id;
    private final String localizedName;

    Hero(String name, String id, String localizedName) {
        this.name = name;
        this.id = id;
        this.localizedName = localizedName;
    }

    private static final Map<String, Hero> map;
    static {
        map = new HashMap<String, Hero>();
        for (Hero h : Hero.values()) {
            map.put(h.id, h);
        }
    }

    public static Hero findByID(String id) {
        return map.get(id);
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
