package br.github.cauzy.medicamento.controller;

import br.github.cauzy.medicamento.entity.DTO.MedicamentoDTO;
import br.github.cauzy.medicamento.entity.Laboratorio;
import br.github.cauzy.medicamento.entity.Medicamento;
import br.github.cauzy.medicamento.service.LaboratorioService;
import br.github.cauzy.medicamento.service.MedicamentoService;
import br.github.cauzy.medicamento.utility.Message;
import br.github.cauzy.medicamento.utility.NegocioException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.PrimeFaces;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

@Named
@ViewScoped
public class MedicamentoMB implements Serializable {

    private MedicamentoDTO medicamentoDTO = new MedicamentoDTO();

    @Inject
    private LaboratorioService labService;

    @Inject
    private MedicamentoService service;

    private List<MedicamentoDTO> medicamentos;

    private Map<Long, String> nomesLaboratorios = new HashMap<Long, String>();

    @PostConstruct
    public void carregar() {
        medicamentos = service.todosOsMedicamentos();
        preencherNomesLaboratorios();
    }

    public void preencherNomesLaboratorios() {
        for (MedicamentoDTO medicamentoDTO : medicamentos) {
            Long idDoMedicamento = medicamentoDTO.getId();
            Long idDoLaboratorio = medicamentoDTO.getLaboratorioId();
            nomesLaboratorios.put(idDoMedicamento, labService.findById(idDoLaboratorio).getNome() );
        }
    }

    public String getNomeLaboratorio(Long id){
     return nomesLaboratorios.get(id);
    }

    public void adicionar() {
        try {
            service.salvar(medicamentoDTO);
            carregar();
            medicamentoDTO = new MedicamentoDTO();
            Message.info("Salvo Com Sucesso");
        } catch (NegocioException e) {
            Message.erro(e.getMessage());
        }
    }

    public void excluir() {
        try {
            service.remover(medicamentoDTO);
            medicamentoDTO = new MedicamentoDTO();
            carregar();
            Message.erro(medicamentoDTO.getNome() + " foi removido");
        } catch (NegocioException e) {
            Message.erro(e.getMessage());
        }
    }

    public List<MedicamentoDTO> getMedicamentos() {
        return medicamentos;
    }

    public MedicamentoDTO getMedicamentoDTO() {
        return medicamentoDTO;
    }

    public void setMedicamentoDTO(MedicamentoDTO medicamentoDTO) {
        this.medicamentoDTO = medicamentoDTO;
    }

}
