package com.cakefordrake.db.entity;

public class User {
    private int id;
    private String name;
    private String password;
    private String sol;
    private boolean isAdmin;

    private User(){}

    public User(String name){
        this.name = name;
    }
    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getSol() {
        return sol;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSol(String sol) {
        this.sol = sol;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
