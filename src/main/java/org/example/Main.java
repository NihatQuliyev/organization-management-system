package org.example;

import jakarta.persistence.*;

import org.example.repository.OrganizationRepo;
import org.example.repository.impl.OrganizationRepoImpl;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
        EntityManager entityManager =entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        OrganizationRepo organization = new OrganizationRepoImpl();

        entityTransaction.begin();
        organization.persist();
        organization.find();
        organization.merge();
        organization.remove();

        entityTransaction.commit();


    }
}