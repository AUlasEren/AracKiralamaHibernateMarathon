package com.ulas.repository;

import com.ulas.repository.entity.Person;
import com.ulas.utility.MyFactoryRepository;

public class PersonRepository extends MyFactoryRepository<Person,Long> {
    public PersonRepository() {
        super(new Person());
    }
}
