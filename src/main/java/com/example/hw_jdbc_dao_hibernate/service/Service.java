package com.example.hw_jdbc_dao_hibernate.service;

import com.example.hw_jdbc_dao_hibernate.entity.Person;
import com.example.hw_jdbc_dao_hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    private final PersonRepository personRepository;

    public Service(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public List<Person> getPersonByCity(String city) {
        return personRepository.findByCityOfLiving(city);
    }

    public List<Person> getPersonByAgeLessThanOrderByAge(int age) {
        return personRepository.findByAgeLessThanOrderByAge(age);
    }

    public Optional<Person> getPersonByNameAndSurname(String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);
    }

}