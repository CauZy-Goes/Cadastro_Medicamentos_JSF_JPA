package br.github.cauzy.medicamento.entity.DTO;


import java.io.Serializable;
import java.math.BigDecimal;

public class MedicamentoDTO implements Serializable {

    private Long id;
    private String nome;
    private String apresentacao;
    private String registro;
    private BigDecimal preco;
    private Long laboratorioId; // Aqui você pode armazenar apenas o ID do laboratório


    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApresentacao() {
        return apresentacao;
    }

    public void setApresentacao(String apresentacao) {
        this.apresentacao = apresentacao;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Long getLaboratorioId() {
        return laboratorioId;
    }

    public void setLaboratorioId(Long laboratorioId) {
        this.laboratorioId = laboratorioId;
    }
}

