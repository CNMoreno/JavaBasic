package com.cnmc.java8.com.cnnmc.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class OrElseAndOrElseGet {

    public static List<String> names = Arrays.asList("John", "Jones", "Kelly", "Cristina", "Raven");

    

    public static String getRandomName() {
        System.out.println("getRandomName() method - start");
        Random random = new Random();
        int index = random.nextInt(5);
        System.out.println(names.get(index));
        System.out.println("getRandomName() method - end");
        return names.get(index);
    }

    public String getNameUsingOrElse(String name) {
        return Optional.ofNullable(name)
            .orElse(getRandomName());
    }

    public String getNameUsingOrElseGet(String name) {
        return Optional.ofNullable(name)
            .orElseGet(() -> getRandomName());
    }
    public static void main(String[] args) {
    	getRandomName();
        

    }
}
