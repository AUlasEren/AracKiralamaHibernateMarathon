package com.ulas.controller;

import com.ulas.repository.entity.Car;
import com.ulas.service.CarService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class CarController {
    private Scanner scanner;
    CarService carService;

    public CarController() {
        carService = new CarService();
        scanner = new Scanner(System.in);
    }
    public void aracEkleme() {
       ;
        System.out.print("Arac Markası giriniz ");
        String marka = scanner.nextLine();
        carService.save(Car.builder().marka(marka).build());
    }
    public Optional<Car> findByid(){
        System.out.print("Aradıgınız aracın idsini giriniz ");
         Long id = Long.parseLong(scanner.nextLine());
        return carService.findById(id);
    }

    }

