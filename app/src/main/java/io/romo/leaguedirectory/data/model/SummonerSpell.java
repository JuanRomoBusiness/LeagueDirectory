package io.romo.leaguedirectory.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class SummonerSpell {

    private int id;
    private String name;
    private List<Double> cooldown;
    @SerializedName("summonerLevel")
    private int requiredSummonerLevel;
    @SerializedName("modes")
    private List<GameMode> gameModes;
    private String description;
    private Image image;

    public SummonerSpell() {

    }

    public SummonerSpell(int id, String name, List<Double> cooldown, int requiredSummonerLevel,
                         List<GameMode> gameModes, String description, Image image) {
        this.id = id;
        this.name = name;
        this.cooldown = cooldown;
        this.requiredSummonerLevel = requiredSummonerLevel;
        this.gameModes = gameModes;
        this.description = description;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public int getRequiredSummonerLevel() {
        return requiredSummonerLevel;
    }

    public void setRequiredSummonerLevel(int requiredSummonerLevel) {
        this.requiredSummonerLevel = requiredSummonerLevel;
    }

    public List<GameMode> getGameModes() {
        return gameModes;
    }

    public void setGameModes(List<GameMode> gameModes) {
        this.gameModes = gameModes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
