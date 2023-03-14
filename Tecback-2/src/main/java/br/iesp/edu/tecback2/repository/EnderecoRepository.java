package br.iesp.edu.tecback2.repository;

import br.iesp.edu.tecback2.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository
        extends JpaRepository<Endereco, Long> {

}
