package com.cakefordrake.db.entity;

import java.util.Date;

public class Exhibition {
    private int id;
    private String theme;
    private int hall;
    private Date dateTime;
    private double price;
    private int views;

    private Exhibition(){}

    public Exhibition(String theme){
        this.theme = theme;
    }

    public Exhibition(String theme, int hall, Date dateTime, double price){
        this.theme = theme;
        this.hall = hall;
        this.dateTime = dateTime;
        this.price = price;
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

    public void setPrice(double price) {
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

    public double getPrice() {
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
