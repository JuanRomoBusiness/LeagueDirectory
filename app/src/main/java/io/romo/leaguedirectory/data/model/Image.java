package io.romo.leaguedirectory.data.model;

public class Image {

    private String full;
    private String group;
    private String sprite;
    private int h;
    private int w;
    private int y;
    private int x;

    public Image(String full, String group, String sprite, int h, int w, int y, int x) {
        full = full;
        group = group;
        sprite = sprite;
        h = h;
        w = w;
        y = y;
        x = x;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getSprite() {
        return sprite;
    }

    public void setSprite(String sprite) {
        this.sprite = sprite;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
