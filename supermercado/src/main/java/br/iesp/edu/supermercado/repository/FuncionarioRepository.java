package br.iesp.edu.supermercado.repository;

import br.iesp.edu.supermercado.entity.Funcionario;
import br.iesp.edu.supermercado.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    //FindByNome
    List<Funcionario> findByNomeContainingIgnoreCase(String nome);

    //FindByCpf
    List<Funcionario> findByCpfContainingIgnoreCase(String cpf);

    //FindFuncionarioByProfissao
    @Query("SELECT f from Funcionario f WHERE f.profissao.id = :profissaoId")
    List<Funcionario> findFuncionarioByProfissaoId(@Param("profissaoId") Integer clienteId);
}
