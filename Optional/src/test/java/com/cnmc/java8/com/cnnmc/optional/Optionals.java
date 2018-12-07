package com.cnmc.java8.com.cnnmc.optional;

import org.junit.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Optionals {

    PersonRepository personRepository = new PersonRepository();

    @Test
    public void idNull() {
        assertThrows(IllegalArgumentException.class,
                () ->
                        Optional
                                .ofNullable(personRepository.findNameById(null))
                                .orElseThrow(IllegalArgumentException::new));
    }

    @Test
    public void idNotNull() {
        assertAll(
                () ->
                        Optional
                                .ofNullable(personRepository.findNameById("id"))
                                .orElseThrow(RuntimeException::new));
        
    }

    @Test
    public void returniIdnotNull() {
        String name = Optional
                .ofNullable(personRepository.findNameById("id"))
                .map(String::toUpperCase)
                .orElseThrow(RuntimeException::new);        

        assertEquals("CRISTIAN", name);
        System.out.println(personRepository.findNameById("id"));
    }

}