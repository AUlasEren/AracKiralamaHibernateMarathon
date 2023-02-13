package com.ulas.repository.entity;

import lombok.*;

import javax.persistence.*;
    @Builder
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Table(name = "tblcar")
    @Entity
    public class Car {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        String marka;



    }

