package br.iesp.edu.tecback2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message="Campo nome é obrigatório.")
    private String nome;

    @NotEmpty(message="Campo descrição é obrigatório.")
    private String descricao;

    @NotEmpty(message="Campo categoria é obrigatório.")
    private String categoria;

    @NotEmpty(message="Campo preço de custo é obrigatório.")
    private Double precoCusto;

    @NotEmpty(message="Campo preço de venda é obrigatório.")
    private Double precoVenda;

    @NotEmpty(message="Campo quantidade em estoque é obrigatório.")
    private Integer quantidadeEstoque;
}
