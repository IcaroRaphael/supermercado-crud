package com.iesp.tecback.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Produto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty(message = "Campor nome não pode ser vazio.")
    private String nome;

    @NotEmpty(message = "Campo descrição não pode ser vazio.")
    private String descricao;

    @NotNull(message = "Campo preço de custo não pode ser nulo.")
    private Double precoCusto;

    @NotNull(message = "Campo preço de venda não pode ser nulo.")
    private Double precoVenda;

    @NotNull(message = "Campo quantidade em estoque não pode ser nulo.")
    private Integer quantidadeEstoque;
}
