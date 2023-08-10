package com.example.hw_jdbc_dao_hibernate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
public class Person implements Serializable {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    private int phone_number;
    private String city_of_living;
}