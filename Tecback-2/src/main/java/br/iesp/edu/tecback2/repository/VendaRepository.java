package br.iesp.edu.tecback2.repository;

import br.iesp.edu.tecback2.entity.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository
        extends JpaRepository<Venda, Long> {

}
