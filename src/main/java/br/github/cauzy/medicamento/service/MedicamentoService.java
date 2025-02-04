package br.github.cauzy.medicamento.service;

import br.github.cauzy.medicamento.Medicamento;
import br.github.cauzy.medicamento.dao.DAO;
import br.github.cauzy.medicamento.utility.NegocioException;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;

public class MedicamentoService implements Serializable {

    @Inject
    private DAO<Medicamento> dao;

    public void salvar(Medicamento m) throws NegocioException {
        if (m.getNome().length() < 3){
            throw new NegocioException("O nome do medicamento não pode ter menos que 3 caracteres");
        }

        dao.salvar(m);
    }

    public void remover(Medicamento m) throws NegocioException {
        dao.remover(m.getId(), Medicamento.class);
    }

    public List<Medicamento> todosOsMedicamentos() {
        return dao.buscarTodos("select m from Medicamento m.nome");
    }
}
