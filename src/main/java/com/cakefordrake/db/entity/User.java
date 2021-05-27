package com.cakefordrake.db.entity;

public class User {
    private int id;
    private String login;
    private String password;
    private String sol;
    private boolean isAdmin;

    private User(){}

    public User(String login){
        this.login = login;
    }
    public User(String login, String password, String sol){
        this.login = login;
        this.password = password;
        this.sol = sol;
    }

    public String getLogin() {
        return login;
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

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
