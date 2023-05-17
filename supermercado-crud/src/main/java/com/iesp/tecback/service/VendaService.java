package com.iesp.tecback.service;

import com.iesp.tecback.entity.Venda;
import com.iesp.tecback.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public Venda save(Venda venda){
        venda = repository.save(venda);
        return venda;
    }

    public Venda update(Venda venda){
        if(venda.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        venda = repository.save(venda);
        return venda;
    }

    public List<Venda> findAll(){
        return repository.findAll();
    }

    public Optional<Venda> findById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public void delete(Venda venda){
        if(venda.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(venda);
    }

    public void deleteById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
