package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Cliente;
import com.iesp.tecback.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {

    @Query(value = "SELECT * FROM funcionario WHERE nome LIKE %?1%", nativeQuery = true)
    List<Funcionario> findByNomeContaining(String nome);

    List<Funcionario> findByFuncaoContainingIgnoreCase(String funcao);
    List<Funcionario> findByCpfContaining(String cpf);
    @Query("SELECT f FROM Funcionario f WHERE f.data LIKE %:data%")
    List<Funcionario> findByDataContaining(String data);


}
