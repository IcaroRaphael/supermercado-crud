package br.iesp.edu.supermercado.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "venda")
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToMany
    @JoinTable(name="venda_produtos", joinColumns=
            {@JoinColumn(name="venda_id")}, inverseJoinColumns=
            {@JoinColumn(name="produtos_id")})
    private List<Produto> produtos;

    @OneToOne
    private Cliente cliente;

    @OneToOne
    private FormaPagamento formaPagamento;

    @NotNull
    @OneToOne
    private Funcionario funcionario;
}
