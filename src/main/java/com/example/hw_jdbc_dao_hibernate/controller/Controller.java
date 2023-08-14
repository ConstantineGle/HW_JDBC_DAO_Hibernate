package com.example.hw_jdbc_dao_hibernate.controller;

import com.example.hw_jdbc_dao_hibernate.entity.Person;
import com.example.hw_jdbc_dao_hibernate.service.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    public List<Person> getPersonByCity(String city) {
        return service.getPersonByCity(city);
    }

    @GetMapping("/age-less-than")
    public List<Person> getPersonByAgeLessThanOrderBy(int age) {
        return service.getPersonByAgeLessThanOrderByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return service.getPersonByNameAndSurname(name, surname);
    }

}
