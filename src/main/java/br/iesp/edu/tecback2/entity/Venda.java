package br.iesp.edu.tecback2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double valorTotal;

    @OneToMany
    private List<Produto> produtos;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private FormaPagamento formaPagamento;

    @OneToOne
    private Funcionario funcionario;
}
