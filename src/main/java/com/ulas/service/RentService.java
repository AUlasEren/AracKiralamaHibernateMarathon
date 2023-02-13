package com.ulas.service;

import com.ulas.repository.RentRepository;
import com.ulas.repository.entity.Car;
import com.ulas.repository.entity.Rent;
import com.ulas.utility.MyFactoryService;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class RentService extends MyFactoryService<RentRepository, Rent, Long> {
    public RentService() {
        super(new RentRepository());
    }

    public List<Rent> findRentedCars() {
        return getRepository().findRentedCars();
    }
    public List<Rent> findRentsByPerson(Long person_id){
        return getRepository().findRentsByPerson(person_id);
    }
    public List<Car> findAvailableCars() {
        TypedQuery<Car> query = getRepository().getEntityManager().createQuery("SELECT c FROM Car c WHERE c.id NOT IN (SELECT r.car.id FROM Rent r WHERE r.tarihBitis >= CURRENT_DATE)", Car.class);
        return query.getResultList();
    }
}

