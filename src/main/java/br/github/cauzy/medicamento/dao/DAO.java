package br.github.cauzy.medicamento.dao;

import br.github.cauzy.medicamento.Base;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.io.Serializable;
import java.util.List;

public class DAO <T extends Base> implements Serializable {

    private static EntityManager manager = ConnectionFactory.getEntityManager();

    public T buscarPorID(Class<T> clazz, Long id) {
        return manager.find(clazz, id);
    }

    public void salvar(T t) {
        try{
            manager.getTransaction().begin();

            if(t.getId() == null){
                manager.persist(t); //save new
            } else {
                manager.merge(t); //update
            }

            manager.getTransaction().commit();
        }catch (Exception e){
            manager.getTransaction().rollback();
        }
    }

    public void remover(Long id, Class<T> clazz){
        T t = buscarPorID(clazz, id);

        try{
            manager.getTransaction().begin();
            manager.remove(t);
            manager.getTransaction().commit();
        }catch (Exception e){
            manager.getTransaction().rollback();
        }
    }

    @SuppressWarnings("unchecked")
    public List<T> buscarTodos(String jpql){
        Query query = manager.createQuery(jpql);
        return query.getResultList();
    }

}
