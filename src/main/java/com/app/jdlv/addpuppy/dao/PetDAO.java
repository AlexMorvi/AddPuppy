package com.app.jdlv.addpuppy.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import com.app.jdlv.addpuppy.entity.Pet;

public class PetDAO {
    private EntityManagerFactory factory;

    public PetDAO() {
        factory = Persistence.createEntityManagerFactory("AddPuppyPU");
    }

    public void savePet(Pet pet) {
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(pet);
        em.getTransaction().commit();
        em.close();
    }
}
