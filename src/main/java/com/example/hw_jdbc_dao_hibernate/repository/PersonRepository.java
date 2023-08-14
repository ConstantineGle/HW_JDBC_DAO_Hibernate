package com.example.hw_jdbc_dao_hibernate.repository;

import com.example.hw_jdbc_dao_hibernate.entity.Person;
import com.example.hw_jdbc_dao_hibernate.entity.PersonId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, PersonId> {

    List<Person> findByCityOfLiving(String city);
    List<Person> findByAgeLessThanOrderByAge(int age);
    Optional<Person> findByNameAndSurname(String name, String surname);
}
