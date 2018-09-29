package org.edu;

import org.edu.dao.PersonDao;
import org.edu.dao.PersonDaoSimple;
import org.edu.domain.Person;
import org.edu.service.PersonService;
import org.edu.service.PersonServiceImpl;

public class Main {

    private static PersonDao dao;
    private static PersonService service;

    public static void main(String[] args) {
        init();

        Person ivan = service.getByName("Ivan");
        System.out.println("name: " + ivan.getName() + " age: " + ivan.getAge());

        // TODO: 1. Здесь должно быть IllegalArgumentException
        ivan.setAge(200);

        // TODO: 2. Здесь должно быть UserNotFoundException
        dao.findByName("Non-Ivan");

        // TODO: 3. Здесь должно быть UserNotFoundException, обёрнутое в BusinessException
        service.getByName("Non-Ivan");
    }

    // Это типа спринга
    private static void init() {
        dao = new PersonDaoSimple();
        service = new PersonServiceImpl(dao);
    }
}
