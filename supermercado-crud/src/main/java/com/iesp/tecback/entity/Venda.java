package com.iesp.tecback.entity;

import com.iesp.tecback.enums.FormaPagamento;
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
public class Venda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany
    private List<Produto> produtos;

    @OneToOne
    private Cliente cliente;

    @NotNull(message = "Campo forma de pagamento não pode ser nulo.")
    @Enumerated(EnumType.STRING)
    private FormaPagamento formaPagamento;

    @NotNull(message = "Campo funcionario não pode ser nulo.")
    @OneToOne
    private Funcionario funcionario;
}
