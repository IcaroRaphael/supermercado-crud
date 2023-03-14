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
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    private String complemento;

    @NotEmpty(message="Campo número é obrigatório.")
    private Integer numero;

    @NotEmpty(message="Campo bairro é obrigatório.")
    private String bairro;

    @NotEmpty(message="Campo cidade é obrigatório.")
    private String cidade;

    @NotEmpty(message="Campo estado é obrigatório.")
    private String Estado;

    @NotEmpty(message="Campo país é obrigatório.")
    private String pais;

    @NotEmpty(message="Campo cep é obrigatório.")
    private String cep;
}
