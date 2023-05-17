package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
   // List<Cliente> findByNomeContainingIgnoreCase(String nome);
    List<Cliente> findByCpfContaining(String cpf);

    @Query(value = "SELECT * FROM cliente WHERE nome LIKE %?1%", nativeQuery = true)
    List<Cliente> findByNomeContaining(String nome);
    @Query("SELECT c FROM Cliente c WHERE c.data LIKE %:data%")
    List<Cliente> findByDataContaining(String data);
}
