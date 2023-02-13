package com.ulas;

import com.ulas.controller.CarController;
import com.ulas.controller.PersonController;
import com.ulas.controller.RentController;
import com.ulas.repository.CarRepository;
import com.ulas.repository.RentRepository;
import com.ulas.repository.entity.Car;
import com.ulas.repository.entity.Person;
import com.ulas.repository.entity.Rent;
import com.ulas.service.RentService;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int secim=0;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("*********************************************");
            System.out.println("***********   ARAC KIRALAMA UYGULAMASI   ************");
            System.out.println("*********************************************");
            System.out.println();
            System.out.println("1- Arac Ekleme");
            System.out.println("2- Arac Arama");
            System.out.println("3- Kisi Ekleme");
            System.out.println("4- Kiralama");
            System.out.println("5- Su anda Kirada Olan Araclar");
            System.out.println("6- Bosta olan Araclar");
            System.out.println("7- Herhangi bir Musterinin Kiraladigi araclar");
            secim= Integer.parseInt(scanner.nextLine());
            switch (secim){
                case 1: new CarController().aracEkleme();break;
                case 2:
                    System.out.println(new CarController().findByid());break;
                case 3:
                    new PersonController().kisiEkleme(); break;
                case 4:
                    new RentController().save(); break;
                case 5:
                    new RentController().listRentedCars(); break;
                case 6:
                    new RentController().listAvailableCars();break;
                case 7:
                    new RentController().listRentedCarsByPerson(); break;

            }
        }while(secim!=0);
        System.out.println("TEKRAR GORUSMEK UZERE");
    }
}