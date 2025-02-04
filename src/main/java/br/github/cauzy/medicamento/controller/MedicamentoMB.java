package br.github.cauzy.medicamento.controller;

import br.github.cauzy.medicamento.Medicamento;
import br.github.cauzy.medicamento.service.MedicamentoService;
import br.github.cauzy.medicamento.utility.Message;
import br.github.cauzy.medicamento.utility.NegocioException;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class MedicamentoMB implements Serializable {

    @Inject
    private Medicamento medicamento;

    @Inject
    private MedicamentoService service;

    private List<Medicamento> medicamentos;

    @PostConstruct // é contruindo quando a classe é criada
    public void carregar(){
        medicamentos = service.todosOsMedicamentos();
    }

    public void adicionar(){
        try{
            service.salvar(medicamento);
            medicamento = new Medicamento();
            carregar();
            Message.info("Salvo Com Sucesso");
        } catch (NegocioException e){
            Message.erro(e.getMessage());
        }
    }

    public void excluir(){
        try {
            service.remover(medicamento);
            carregar();
            Message.info(medicamento.getNome() + " foi removido");
        } catch (NegocioException e){
            Message.erro(e.getMessage());
        }
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }


    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }
}
