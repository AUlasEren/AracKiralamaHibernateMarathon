package com.ulas.controller;

import com.ulas.repository.entity.Car;
import com.ulas.repository.entity.Person;
import com.ulas.repository.entity.Rent;
import com.ulas.service.RentService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class RentController {
    Scanner scanner;
    RentService rentService;
    PersonController personController;
    CarController carController;

    public RentController() {
        rentService = new RentService();
        scanner = new Scanner(System.in);
        personController = new PersonController();
        carController = new CarController();
    }

    public void save() {
        System.out.println("Lutfen kiralama baslangic tarihini giriniz(yil-ay-gun)");
        LocalDate baslangicTarih = LocalDate.parse(scanner.nextLine());
        System.out.println("Lutfen kiralama bitis tarihini giriniz(yil-ay-gun)");
        LocalDate bitisTarih = LocalDate.parse(scanner.nextLine());
        System.out.println("Lutfen kiralamak istediginiz arabanın idsini giriniz");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Lutfen kiralama yapmak istediginiz id yigiriniz");
        Long personid = Long.parseLong(scanner.nextLine());
        rentService.save(Rent.builder().car(Car.builder().id(id).build()).person(Person.builder().id(personid).build())
                .tarihBaslangic(baslangicTarih).tarihBitis(bitisTarih).build());
    }

    public void listRentedCars() {
        List<Rent> rentedCars = rentService.findRentedCars();
        System.out.println("Rented cars:");
        for (Rent rent : rentedCars) {
            System.out.println(rent);
        }
    }

    public void listRentedCarsByPerson() {
        System.out.println("Hangi musterinin daha once kiraladigini sorgulamak icin lutfen kisi id giriniz");
        Long personId = scanner.nextLong();
        List<Rent> rentedCarsByPerson = rentService.findRentsByPerson(personId);
        System.out.println("Kiralayan kişinin id'si " + personId + " olan kiraladığı araçlar:");
        for (Rent rent : rentedCarsByPerson) {
            System.out.println("Arabanın id: " + rent.getCar().getId() + " Arabanın marka: " + rent.getCar().getMarka());
        }
    }
    public void listAvailableCars() {
        List<Car> availableCars = rentService.findAvailableCars();
        System.out.println("Boşta olan araçlar:");
        for (Car car : availableCars) {
            System.out.println("Arabanın id: " + car.getId() + " Arabanın marka: " + car.getMarka());
        }
    }
    }

