package com.example.hw_jdbc_dao_hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons", schema = "hwsql")
@IdClass(PersonId.class)
@Entity
public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;
}