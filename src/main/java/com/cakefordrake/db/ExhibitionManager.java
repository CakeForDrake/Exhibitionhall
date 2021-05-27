package com.cakefordrake.db;

import com.cakefordrake.db.entity.Exhibition;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExhibitionManager extends Manager {
    private static Logger logger = Logger.getLogger(DBManager.class.getName());
    private static ExhibitionManager exManager = new ExhibitionManager();
    private static Statement statement = null;
    private static ResultSet rs = null;
    private static Exhibition exhibition = null;

    private ExhibitionManager(){}

    public static ExhibitionManager getInstance() {
        return exManager;
    }

    @Override
    public void insertEntity(Object object, Connection connection) {
        exhibition = (Exhibition) object;
        try {
            statement = connection.createStatement();
            statement.executeUpdate(String.format("INSERT exhibitionhall.exhibition(theme, hall, datatime, price) " +
                            "VALUES(%s, %s, %s, %s",
                    exhibition.getTheme(),exhibition.getHall(),exhibition.getDateTime(),exhibition.getPrice()));
        } catch (SQLException e) {
            logger.log(Level.SEVERE,
                    "Cannot insert exhibition",
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
    public ArrayList findAllEntity(Connection connection) {
        ArrayList<Exhibition> exhibitions = new ArrayList<>();
        try {
            statement = connection.createStatement();
            rs = statement.executeQuery("SELECT name FROM exhibitionhall.exhibition;");
            while (rs.next()){
                exhibitions.add(new Exhibition(rs.getString(1)));
            }
        } catch (SQLException e) {
            logger.log(Level.SEVERE,
                    "Cannot find exhibitions",
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
        return exhibitions;
    }

}
