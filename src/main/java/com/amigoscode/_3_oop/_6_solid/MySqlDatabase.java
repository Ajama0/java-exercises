package com.amigoscode._3_oop._6_solid;

public class MySqlDatabase implements Database {
    @Override
    public String query(String query) {
        return "MySQL result for: " + query;
    }
}
