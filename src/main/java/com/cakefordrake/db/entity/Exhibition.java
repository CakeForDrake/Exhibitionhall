package com.cakefordrake.db.entity;

import java.util.Date;

public class Exhibition {
    private int id;
    private String name;
    private String theme;
    private int hall;
    private Date dateTime;
    private String time;
    private int price;
    private int views;

    private Exhibition(){}

    public Exhibition(String theme){
        this.theme = theme;
    }

    public Exhibition(String name, String theme, int hall, String time, int price){
        this.name = name;
        this.theme = theme;
        this.hall = hall;
        this.price = price;
        this.time = time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHall(int hall) {
        this.hall = hall;
    }

    public int getHall() {
        return hall;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public int getPrice() {
        return price;
    }

    public int getViews() {
        return views;
    }

    public String getTheme() {
        return theme;
    }

    public void setViews(int views) {
        this.views = views;
    }
}
