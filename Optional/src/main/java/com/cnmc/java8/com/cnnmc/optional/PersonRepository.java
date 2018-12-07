package com.cnmc.java8.com.cnnmc.optional;

public class PersonRepository {

    public String findNameById(String id) {
        return id == null ? null : "Cristian";
    }

}
