package br.github.cauzy.medicamento.dao;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@ApplicationScoped
public class ConnectionFactory {

    // Criação estática da fábrica de EntityManager
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("meuPU");

    @Produces // O CDI vai fornecer este EntityManager onde necessário
    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}

