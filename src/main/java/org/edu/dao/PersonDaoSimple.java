package org.edu.dao;

import org.edu.domain.Person;

public class PersonDaoSimple implements PersonDao {

    public Person findByName(String name) {
        // TODO: 2. generate user not fount exception
        if ("Ivan".equals(name)) {
            return new Person(name, 18);
        }
        return null;
    }
}
