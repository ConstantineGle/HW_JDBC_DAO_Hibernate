package com.example.hw_jdbc_dao_hibernate.repository;

import com.example.hw_jdbc_dao_hibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Person> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM Person p WHERE p.city_of_living = :city")
                .setParameter("city", city).getResultList();
    }
}
