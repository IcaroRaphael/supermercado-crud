package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNomeContainingIgnoreCase(String nome);

    List<Funcionario> findByFuncaoContainingIgnoreCase(String funcao);
    List<Funcionario> findByCpf(String cpf);
}
