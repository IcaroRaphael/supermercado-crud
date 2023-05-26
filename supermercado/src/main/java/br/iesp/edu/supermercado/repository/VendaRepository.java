package br.iesp.edu.supermercado.repository;

import br.iesp.edu.supermercado.entity.Produto;
import br.iesp.edu.supermercado.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer> {
    @Query("SELECT v.produtos FROM Venda v WHERE v.id = :vendaId")
    List<Produto> findProdutosByVendaId(@Param("vendaId") Integer vendaId);

    @Query("SELECT v from Venda v WHERE v.funcionario.id = :funcionarioId")
    List<Venda> findVendaByFuncionarioId(@Param("funcionarioId") Integer funcionarioId);

    @Query("SELECT v from Venda v WHERE v.cliente.id = :clienteId")
    List<Venda> findVendaByClienteId(@Param("clienteId") Integer clienteId);
}
