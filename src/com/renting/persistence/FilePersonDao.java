package com.renting.persistence;

import com.renting.models.Person;

import java.io.*;
import java.util.ArrayList;

public class FilePersonDao implements PersonDao {
    String fileName;
    ArrayList<Person> persons = new ArrayList<>();

    public FilePersonDao(String fileName) {
        this.fileName = fileName;
        loadPersons();
    }

    public void updatePersonsFile() {
        try(FileOutputStream fileOutputStream = new FileOutputStream(this.fileName);
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this.persons);
            objectOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadPersons() {
        try(FileInputStream fileInputStream = new FileInputStream(this.fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            persons = (ArrayList<Person>) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Person get(String identification) {
        return null;
    }

    @Override
    public ArrayList<Person> getAll() {
        return persons;
    }

    @Override
    public void add(Person person) {
        persons.add(person);
        updatePersonsFile();
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }
}
