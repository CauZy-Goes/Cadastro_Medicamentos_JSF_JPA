package br.github.cauzy.medicamento.service.mapper;

import br.github.cauzy.medicamento.entity.DTO.MedicamentoDTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import br.github.cauzy.medicamento.entity.Medicamento;

@Mapper(componentModel = "cdi")
public interface MedicamentoMapper {

    @Mapping(source = "laboratorio.id", target = "laboratorioId")
    MedicamentoDTO toDTO(Medicamento medicamento);

    @Mapping(source = "laboratorioId", target = "laboratorio.id")
    Medicamento toEntity(MedicamentoDTO medicamentoDTO);
}

