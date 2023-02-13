package com.ulas.repository;

import com.ulas.repository.entity.Car;
import com.ulas.utility.MyFactoryRepository;

import javax.persistence.TypedQuery;
import java.util.List;

public class CarRepository extends MyFactoryRepository<Car,Long> {
    public CarRepository() {
        super(new Car());
    }

}
