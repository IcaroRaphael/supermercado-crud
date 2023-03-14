package br.iesp.edu.tecback2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter
@Setter
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="Campo nome é obrigatório.")
    private String nome;

    @NotEmpty(message="Campo salário é obrigatório.")
    private Double salario;

    @NotEmpty(message="Campo telefone é obrigatório.")
    private String telefone;

    @CPF
    @NotEmpty(message="Campo cpf é obrigatório.")
    private String cpf;

    @OneToOne
    private Setor setor;

    @OneToOne
    private Endereco endereco;
}
