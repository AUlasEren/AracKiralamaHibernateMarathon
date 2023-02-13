package com.ulas.repository;

import com.ulas.repository.entity.Car;
import com.ulas.repository.entity.Rent;
import com.ulas.utility.MyFactoryRepository;

import javax.persistence.TypedQuery;
import java.time.LocalDate;
import java.util.List;

public class RentRepository extends MyFactoryRepository<Rent,Long> {
    public RentRepository() {
        super(new Rent());
    }
    public List<Rent> findAllRents() {
        TypedQuery<Rent> query = getEntityManager().createQuery("SELECT r FROM Rent r", Rent.class);
        return query.getResultList();
    }
    public List<Rent> findRentedCars() {
        TypedQuery<Rent> query = getEntityManager().createQuery("SELECT r FROM Rent r WHERE r.tarihBitis >= CURRENT_DATE", Rent.class);
        return query.getResultList();
    }

    public List<Rent> findRentsByPerson(Long personId) {
        TypedQuery<Rent> query = getEntityManager().createQuery("SELECT r FROM Rent r WHERE r.person.id = :personId", Rent.class);
        query.setParameter("personId", personId);
        return query.getResultList();
    }
}
