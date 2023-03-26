package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    List<Funcionario> findByNome(String nome);

    @Query("SELECT f FROM Funcionario f WHERE SUBSTRING_INDEX(f.nome, ' ', 1) LIKE %:primeiroNome%")
    List<Funcionario> findByFirstNome(@Param("primeiroNome") String primeiroNome);
    List<Funcionario> findByFuncao(String funcao);
    List<Funcionario> findByCpf(String cpf);
}
