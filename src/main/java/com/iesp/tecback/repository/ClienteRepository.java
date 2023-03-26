package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNome(String nome);
    List<Cliente> findByCpf(String cpf);

    @Query("SELECT f FROM Cliente f WHERE SUBSTRING_INDEX(f.nome, ' ', 1) LIKE %:primeiroNome%")
    List<Cliente> findByFirstNome(@Param("primeiroNome") String primeiroNome);

	
	/*
    List<Cliente> findByNomeContainingIgnoreCase(String nome);
	
	 @Query("SELECT c FROM Cliente c WHERE c.endereco.rua LIKE %:nomeRua%")
	public List<Cliente> findByNomeRuaContaining(@Param("nomeRua") String nomeRua);

	@Query("SELECT c FROM Cliente c WHERE c.endereco.bairro LIKE %:nomeBairro%")
	public List<Cliente> findByNomeBairroContaining(@Param("nomeBairro") String nomeBairro);*/
}
