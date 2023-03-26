package com.iesp.tecback.repository;

import com.iesp.tecback.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	@Query(value = "SELECT * FROM cliente c WHERE c.cpf LIKE %:clienteCpf%", nativeQuery = true)
    List<Cliente> findByCpf(String clienteCpf);
	
	
	@Query(value = "SELECT * FROM cliente c WHERE c.telefone LIKE %:clienteTelefone%", nativeQuery = true)
    List<Cliente> findByTelefone(String clienteTelefone);


    List<Cliente> findByNomeContainingIgnoreCase(String nome);
	
	 /*@Query("SELECT c FROM Cliente c WHERE c.endereco.rua LIKE %:nomeRua%")
	public List<Cliente> findByNomeRuaContaining(@Param("nomeRua") String nomeRua);*/

	/*@Query("SELECT c FROM Cliente c WHERE c.endereco.bairro LIKE %:nomeBairro%")
	public List<Cliente> findByNomeBairroContaining(@Param("nomeBairro") String nomeBairro);*/
}
