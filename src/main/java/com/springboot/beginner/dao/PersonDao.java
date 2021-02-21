package com.springboot.beginner.dao;

import com.springboot.beginner.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);

    default int addPerson(Person person){
        UUID id = UUID.randomUUID();
        return inserPerson(id, person);
    }
}
