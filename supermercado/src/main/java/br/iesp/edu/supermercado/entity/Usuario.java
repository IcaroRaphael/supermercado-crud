package br.iesp.edu.supermercado.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    @NotEmpty(message = "Campo Login é obrigatório.")
    private String login;
    @Column
    @NotEmpty(message = "Campo Senha é obrigatório.")
    private String senha;
    
    @Column
    @JsonIgnore
    private boolean administrador = true;

}
