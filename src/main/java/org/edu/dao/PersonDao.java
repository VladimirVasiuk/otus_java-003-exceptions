package org.edu.dao;

import org.edu.domain.Person;

public interface PersonDao {

    Person findByName(String name);
}
