package com.ulas.controller;

import com.ulas.repository.entity.Person;
import com.ulas.service.PersonService;

import java.util.Scanner;

public class PersonController {
    Scanner scanner;
    PersonService personService;

    public PersonController() {
        personService = new PersonService();
        scanner = new Scanner(System.in);
    }
    public void kisiEkleme(){
        System.out.println("Lutfen adinizi giriniz.");
        String ad = scanner.nextLine();
        System.out.println("Lutfen soyadinizi giriniz.");
        String soyad = scanner.nextLine();
        System.out.println("Lutfen Telefon numaranizi giriniz.");
        String telefon = scanner.nextLine();
        personService.save(Person.builder().name(ad).surname(soyad).phone_number(telefon).build());
    }
}
