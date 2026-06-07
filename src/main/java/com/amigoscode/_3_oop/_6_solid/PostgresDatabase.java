package com.amigoscode._3_oop._6_solid;

public class PostgresDatabase implements Database {

    @Override
    public String query(String query) {
        return "PostgreSQL result for: " + query;

    }
}
