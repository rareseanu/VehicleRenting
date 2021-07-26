package com.renting.persistence;

import java.util.ArrayList;

public interface Dao<T>{
    T get(String identification);

    ArrayList<T> getAll();

    void add(T t);

    void update(T t);

    void delete(T t);
}
