package com.cakefordrake.db;

import com.cakefordrake.db.entity.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

public class DBManager {
    private static String URL = "";
    private static String LOGIN = "";
    private static String PASSWORD = "";
    private static DBManager dbManager = new DBManager();;
    private static Statement statement;
    private static ResultSet rs;

    private DBManager() {
    }

    public static DBManager getInstance() {
        return dbManager;
    }

    private static Connection getConnection(String connectionUrl, String login, String password) throws SQLException {
        return DriverManager.getConnection(connectionUrl, login, password);
    }

    static {
        Properties properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("app.properties");
            properties.load(file);
            URL = properties.getProperty("connectionURL");
            LOGIN = properties.getProperty("login");
            PASSWORD = properties.getProperty("password");
//            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public void insertUser(User user){
        try {
            statement = getConnection(URL, LOGIN, PASSWORD).createStatement();
            statement.executeUpdate("INSERT task8.users(login) " +
                    "VALUES ('"+user.getName()+"')");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public ArrayList findAllUsers(){
        ArrayList<User> users = new ArrayList<>();
        try {
            statement = getConnection(URL, LOGIN, PASSWORD).createStatement();
            rs = statement.executeQuery("SELECT login FROM task8.users;");
            while (rs.next()){
                users.add(new User(rs.getString(1)));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return users;
    }

}
