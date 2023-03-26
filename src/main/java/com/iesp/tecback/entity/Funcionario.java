package com.iesp.tecback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Campo nome não pode ser vazio.")
    private String nome;

    @NotNull(message = "Campo telefone não pode ser nulo.")
    private String telefone;

    @NotNull(message = "Campo salario não pode ser nulo.")
    private Double salario;

    @NotEmpty(message = "Campo função não pode ser vazio.")
    private String funcao;

    @CPF(message = "CPF inválido.")
    private String cpf;
}
