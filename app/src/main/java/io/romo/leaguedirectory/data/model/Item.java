package io.romo.leaguedirectory.data.model;

import android.support.annotation.NonNull;

public class Item implements Comparable<Item> {

    private int id;
    private String name;
    private String description;
    private Image image;
    private Gold gold;
    private String plaintext;

    public Item() {

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

    public Gold getGold() {
        return gold;
    }

    public void setGold(Gold gold) {
        this.gold = gold;
    }

    public String getPlaintext() {
        return plaintext;
    }

    public void setPlaintext(String plaintext) {
        this.plaintext = plaintext;
    }

    @Override
    public int compareTo(@NonNull Item item) {
        int goldCmp = Integer.compare(gold.getTotal(), item.gold.getTotal());
        return (goldCmp != 0 ? goldCmp : name.compareTo(item.name));
    }
}
