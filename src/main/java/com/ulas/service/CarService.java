package com.ulas.service;

import com.ulas.repository.CarRepository;
import com.ulas.repository.entity.Car;
import com.ulas.utility.MyFactoryService;

import java.util.List;

public class CarService extends MyFactoryService<CarRepository, Car,Long> {
    public CarService() {
        super(new CarRepository());
    }


}
