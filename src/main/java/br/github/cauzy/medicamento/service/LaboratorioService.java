package br.github.cauzy.medicamento.service;

import br.github.cauzy.medicamento.entity.Laboratorio;
import br.github.cauzy.medicamento.dao.DAO;
import br.github.cauzy.medicamento.entity.Medicamento;
import br.github.cauzy.medicamento.utility.NegocioException;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

@Dependent
public class LaboratorioService implements Serializable {

    @Inject
    private DAO<Laboratorio> dao;

    public void salvar(Laboratorio l) throws NegocioException {
        if (l.getNome() == null || l.getNome().trim().isEmpty()) {
            throw new NegocioException("O nome do Laboratório não pode ser vazio");
        }

        if (l.getNome().length() < 3) {
            throw new NegocioException("O nome do Laboratório deve ter pelo menos 3 caracteres");
        }

        dao.salvar(l);
    }

    public void remover(Laboratorio l) throws NegocioException {
        dao.remover(l.getId(), Laboratorio.class);
    }

    public List<Laboratorio> todosOsLaboratorios() {
        return dao.buscarTodos("select l from Laboratorio l");
    }

    public Laboratorio findById(Long id) {
        return dao.buscarPorID(Laboratorio.class , id);
    }
}
