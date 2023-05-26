package br.iesp.edu.supermercado.repository;

import br.iesp.edu.supermercado.entity.FormaPagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Integer> {
    //FindByNome
    List<FormaPagamento> findByNomeContainingIgnoreCase(String nome);
}
