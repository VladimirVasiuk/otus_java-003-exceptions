package org.edu.service;

import org.edu.dao.PersonDao;
import org.edu.domain.Person;

public class PersonServiceImpl implements PersonService {

    private PersonDao dao;

    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    public Person getByName(String name) {
        // TODO: 3. оберните UserNotFoundException в BusinessException
        return dao.findByName(name);
    }
}
