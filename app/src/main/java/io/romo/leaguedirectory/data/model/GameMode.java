package io.romo.leaguedirectory.data.model;

public enum GameMode {
    CLASSIC("Summoner's Rift", "Twisted Treeline"),
    ODIN("Dominion"),
    ARAM("ARAM"),
    TUTORIAL("Tutorial"),
    ONEFORALL("One for All"),
    ASCENSION("Ascension"),
    FIRSTBLOOD("Snowdown Showdown"),
    KINGPORO("King Poro"),
    SIEGE("Nexus Siege"),
    ASSASSINATE("Blood Hunt Assassin"),
    URF("URF"),
    ARSR("All Random Summoner's Rift"),
    DOOMBOTSTEEMO("Doom Bot"),
    DARKSTAR("Dark Star"),
    STARGUARDIAN("Star Guardian Invasion");

    private String[] maps;

    GameMode(String... maps) {
        this.maps = maps;
    }

    public String[] getMaps() {
        return maps;
    }
}
