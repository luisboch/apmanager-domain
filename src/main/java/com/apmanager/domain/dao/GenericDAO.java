/*
 * GenericDAO
*/

package com.apmanager.domain.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author luis
 */
public class GenericDAO {
    private static EntityManager manager;
    private static EntityManagerFactory managerFactory;

    public GenericDAO() {
        managerFactory = Persistence.createEntityManagerFactory("testPU");
        manager = managerFactory.createEntityManager();
    }
}
