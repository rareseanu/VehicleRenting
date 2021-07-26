package com.renting.services;

import com.renting.models.Person;
import com.renting.persistence.PersonDao;

import java.util.ArrayList;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public void addPerson(Person person) {
        personDao.add(person);
    }

    public ArrayList<Person> getAllPersons() {
        return personDao.getAll();
    }
}
