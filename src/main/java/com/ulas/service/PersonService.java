package com.ulas.service;

import com.ulas.repository.PersonRepository;
import com.ulas.repository.entity.Person;
import com.ulas.utility.MyFactoryService;

public class PersonService extends MyFactoryService<PersonRepository, Person,Long> {
    public PersonService() {
        super(new PersonRepository());
    }
}
