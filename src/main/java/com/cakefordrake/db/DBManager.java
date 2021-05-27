package com.cakefordrake.db;

import com.cakefordrake.db.entity.Exhibition;
import com.cakefordrake.db.entity.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {
    private static Logger logger = Logger.getLogger(DBManager.class.getName());
    private static String URL = "jdbc:mysql://localhost:3306/exhibitionhall";
    private static String LOGIN = "root";
    private static String PASSWORD = "CakeForDrakeLukeluke321";
    private static DBManager dbManager = new DBManager();
    /*private static Statement statement = null;
    private static ResultSet rs = null;*/
    private static Connection connection = null;
    private static UsersManager um = UsersManager.getInstance();
    private static ExhibitionManager em = ExhibitionManager.getInstance();

    private DBManager() {
    }

    public static DBManager getInstance() {
        return dbManager;
    }

    private static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            logger.log(Level.SEVERE,
                    "Cannot connect to database",
                    e);
        }

        return connection;
    }

    public void insertUser(User user) {
        connection = getConnection();
        um.insertEntity(user, connection);
    }

    public void insertExhibition(Exhibition exhibition){
        connection = getConnection();
        em.insertEntity(exhibition, connection);
    }

    public ArrayList findAllUsers(){
        connection = getConnection();
        return um.findAllEntity(connection);

    }

    public ArrayList findAllExhibitions() {
        connection = getConnection();
        return um.findAllEntity(connection);
    }
}
