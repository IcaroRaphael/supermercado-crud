package br.iesp.edu.supermercado.repository;

import br.iesp.edu.supermercado.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    //FindByNome
    List<Cliente> findByNomeContainingIgnoreCase(String nome);

    //FindByCpf
    List<Cliente> findByCpfContainingIgnoreCase(String cpf);
}
