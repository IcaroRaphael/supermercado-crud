package br.iesp.edu.supermercado.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotEmpty
    private String nome;

    @NotEmpty
    private String telefone;

    @NotNull
    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @CPF
    private String cpf;

    @OneToOne
    private Profissao profissao;
}
