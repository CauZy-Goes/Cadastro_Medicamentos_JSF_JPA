package br.github.cauzy.medicamento.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ConnectionFactory {

    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("meuPU");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
