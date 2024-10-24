package com.example.ex23;

import android.graphics.Bitmap;

public class List {
    private Bitmap img;
    private String title;
    private String info;
    private String link;

    public List(Bitmap img, String title, String info, String link) {
        this.img = img;
        this.title = title;
        this.info = info;
        this.link = link;
    }

    public Bitmap getImg() {
        return img;
    }

    public void setImg(Bitmap img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}