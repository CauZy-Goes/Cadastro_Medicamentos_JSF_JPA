package br.github.cauzy.medicamento.controller;

import br.github.cauzy.medicamento.entity.Laboratorio;
import br.github.cauzy.medicamento.service.LaboratorioService;
import br.github.cauzy.medicamento.utility.Message;
import br.github.cauzy.medicamento.utility.NegocioException;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class LaboratorioMB implements Serializable {

    @Inject
    private Laboratorio laboratorio;

    @Inject
    private LaboratorioService service;

    private List<Laboratorio> laboratorios;

    @PostConstruct // Inicializa os laboratórios ao carregar a página
    public void carregar() {
        laboratorios = service.todosOsLaboratorios();
    }

    public void adicionar() {
        try {
            service.salvar(laboratorio);
            laboratorio = new Laboratorio(); // Reseta o objeto após salvar
            carregar();
            Message.info("Laboratório salvo com sucesso!");
        } catch (NegocioException e) {
            Message.erro(e.getMessage());
        }
    }

    public void excluir() {
        try {
            if (laboratorio == null || laboratorio.getId() == null) {
                Message.erro("Laboratório ou ID null");
                return;
            }
                service.remover(laboratorio);
                carregar();
                Message.erro(laboratorio.getNome() + " foi removido!");
        } catch (NegocioException e) {
            Message.erro(e.getMessage());
        }
    }

    public List<Laboratorio> getLaboratorios() {
        return laboratorios;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }
}
