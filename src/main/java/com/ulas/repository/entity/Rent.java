package com.ulas.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "tblrent")
@Entity

    public class Rent{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private LocalDate tarihBaslangic;
    private LocalDate tarihBitis;
    @ManyToOne
    @JoinColumn(name = "car_id")
     Car car;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;

}
