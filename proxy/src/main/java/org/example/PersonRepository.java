package org.example;

import java.util.HashMap;
import java.util.Map;

public class PersonRepository implements IRepository{

    private Map<Long, Person> bd = new HashMap<>();

    private static Long countId = 1L;
    public void save (Person person) {bd.put(countId++, person);}



    public Person findById(Long id) {
        return bd.get(id);
    }

}
