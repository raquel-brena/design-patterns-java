package org.example;

public interface IRepository {
    void save(Person person);
    Person findById(Long id);
}
