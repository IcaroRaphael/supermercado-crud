package br.iesp.edu.supermercado.repository;

import br.iesp.edu.supermercado.entity.Profissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfissaoRepository extends JpaRepository<Profissao, Integer> {
    //FindByNome
    List<Profissao> findByNomeContainingIgnoreCase(String nome);
}
