package br.github.cauzy.medicamento.entity;

import br.github.cauzy.medicamento.Base;
import jakarta.enterprise.context.Dependent;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "laboratorio", schema = "public")
@Dependent
public class Laboratorio implements Serializable, Base {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = true)
    private String telefone;

    @Column(nullable = true)
    private String email;

    @Column(nullable = false)
    private String cnpf;

    @OneToMany(mappedBy = "laboratorio")
    private List<Medicamento> medicamentos;

    @Override
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

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpf() {
        return cnpf;
    }

    public void setCnpf(String cnpf) {
        this.cnpf = cnpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laboratorio that = (Laboratorio) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

