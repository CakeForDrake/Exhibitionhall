package com.cakefordrake.db;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

abstract class Manager {

    public Manager(){}

    abstract public void insertEntity(Object object, Connection connection);
    abstract public void changeEntity(Object object, Connection connection);
    abstract public void deleteEntity(Object object, Connection connection);
    abstract public ArrayList findAllEntity(Connection connection);
}
