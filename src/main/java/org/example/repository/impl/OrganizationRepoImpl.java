package org.example.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.repository.OrganizationRepo;
import org.example.service.OrganizationService;
import org.example.service.impl.OrganizationServiceImpl;

public class OrganizationRepoImpl implements OrganizationRepo {
    static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence-unit");
    static EntityManager entityManager = entityManagerFactory.createEntityManager();
    static OrganizationService organization = new OrganizationServiceImpl();

    public void persist(){
        entityManager.persist(organization.bmwOrganization());
        entityManager.persist(organization.mercedesOrganization());
        entityManager.persist(organization.toyotaOrganization());
    }

    public void find() {
        System.out.println(entityManager.find(organization.bmwOrganization().getClass(),1));
        System.out.println("-------");
        System.out.println(entityManager.find(organization.mercedesOrganization().getClass(),2));
        System.out.println("-------");
        System.out.println(entityManager.find(organization.toyotaOrganization().getClass(),3));
        System.out.println("-------");
    }

    public void merge() {
        entityManager.merge(organization.bmwOrganization());
        entityManager.merge(organization.mercedesOrganization());
        entityManager.merge(organization.toyotaOrganization());
    }

    public void remove() {
        entityManager.remove(organization.bmwOrganization());
        entityManager.remove(organization.mercedesOrganization());
        entityManager.remove(organization.toyotaOrganization());
    }
}
