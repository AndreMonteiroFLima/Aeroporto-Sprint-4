package br.com.compass.dao;

import br.com.compass.factory.EManagerFactory;
import br.com.compass.models.Plane;
import jakarta.inject.Inject;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class FlightsDao {

    private EntityManager em;

    public FlightsDao() {
        this.em = EManagerFactory.getEm();
    }

    public void save(Plane plane){
        em.getTransaction().begin();
        em.persist(plane);
        em.getTransaction().commit();
    }
}
