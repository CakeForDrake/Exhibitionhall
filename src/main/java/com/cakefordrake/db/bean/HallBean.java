package com.cakefordrake.db.bean;

import java.io.Serializable;
import java.util.Date;

public class HallBean implements Serializable {
    private String name;
    private String description;
    private double price;
    private Date datetime;

    public HallBean(){
        this.name = "";
        this.description = "";
        this.price = 0.00;
        this.datetime = null;
    }

    public HallBean(String name, String description, double price, Date datetime) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.datetime = datetime;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString(){
        return name;
    }
}
