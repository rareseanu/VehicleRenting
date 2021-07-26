package com.renting.persistence;

import com.renting.models.Person;

import java.util.ArrayList;

public class PersonDao implements Dao<Person> {
    ArrayList<Person> persons = new ArrayList<>();

    @Override
    public Person get(String identification) {
        return persons.stream()
                .filter(person -> person.getPersonalIdNumber().equals(identification))
                .findFirst()
                .get();
    }

    @Override
    public ArrayList<Person> getAll() {
        return persons;
    }

    @Override
    public void add(Person person) {
        persons.add(person);
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
}
