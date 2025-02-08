package br.github.cauzy.medicamento.service;


import br.github.cauzy.medicamento.dao.DAO;
import br.github.cauzy.medicamento.entity.DTO.MedicamentoDTO;
import br.github.cauzy.medicamento.entity.Medicamento;
import br.github.cauzy.medicamento.service.mapper.MedicamentoMapper;
import br.github.cauzy.medicamento.utility.NegocioException;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

@Dependent
public class MedicamentoService implements Serializable {
    @Inject
    private DAO<Medicamento> dao;

    @Inject
    private MedicamentoMapper medicamentoMapper;

    public void salvar(MedicamentoDTO medicamentoDTO) throws NegocioException {
        if (medicamentoDTO.getNome().length() < 3) {
            throw new NegocioException("O nome do Medicamento não pode ter menos que 3 caracteres");
        }

        Medicamento medicamento = medicamentoMapper.toEntity(medicamentoDTO);
        dao.salvar(medicamento);
    }

    public void remover(MedicamentoDTO medicamentoDTO) throws NegocioException {
        if (medicamentoDTO == null || medicamentoDTO.getId() == null) {
            throw new NegocioException("Medicamento inválido para remoção.");
        }
        dao.remover(medicamentoDTO.getId(), Medicamento.class);
    }

    public List<MedicamentoDTO> todosOsMedicamentos() {
        List<Medicamento> medicamentos = dao.buscarTodos("select m from Medicamento m");
        return medicamentos.stream()
                .map(medicamentoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public Medicamento findById(Long id) {
        return dao.buscarPorID(Medicamento.class , id);
    }
}

