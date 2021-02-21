package com.springboot.beginner.service;

import com.springboot.beginner.dao.PersonDao;

public class PersonService {

    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson() {
        return personDao.addPerson(person);
    }
}
