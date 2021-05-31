package com.cakefordrake.db;

import com.cakefordrake.db.entity.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsersManager extends Manager {
    private static Logger logger = Logger.getLogger(DBManager.class.getName());
    private static UsersManager usersManager = new UsersManager();
    private static Statement statement = null;
    private static ResultSet rs = null;
    private static User user = null;

    private UsersManager(){
        super();
    }

    public static UsersManager getInstance() {
        return usersManager;
    }

    @Override
    public void insertEntity(Object object, Connection connection) {
        user = (User) object;
        try {
            System.out.println("IN METHOD");
            statement = connection.createStatement();
            statement.executeUpdate("INSERT exhibitionhall.users(login, password, sol) " +
                    "VALUES ('"+user.getLogin()+"', '"+user.getPassword()+"', '"+user.getSol()+"')");
        } catch (SQLException e) {
            logger.log(Level.SEVERE,
                    "Cannot insert user",
                    e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                logger.log(Level.SEVERE,
                        "Cannot close statement",
                        e);
            }
        }
    }

    @Override
    public void changeEntity(Object object, Connection connection) {

    }

    @Override
    public void deleteEntity(Object object, Connection connection) {

    }

    @Override
    public ArrayList<User> findAllEntity(Connection connection) {
        ArrayList<User> users = new ArrayList<>();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT name FROM exhibitionhall.users;");
            while (rs.next()){
                users.add(new User(rs.getString(1)));
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE,
                    "Cannot find users",
                    e);
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                logger.log(Level.SEVERE,
                        "Cannot close statement",
                        e);
            }
        }
        return users;

    }


}
