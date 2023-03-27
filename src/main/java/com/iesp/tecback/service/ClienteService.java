package com.iesp.tecback.service;

import com.iesp.tecback.entity.Cliente;
import com.iesp.tecback.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente save(Cliente cliente){
        cliente = repository.save(cliente);
        return cliente;
    }

    public Cliente update(Cliente cliente){
        if(cliente.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        cliente = repository.save(cliente);
        return cliente;
    }

    public List<Cliente> findAll(){
        return repository.findAll();
    }

    public Optional<Cliente> findById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Cliente> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Cliente> findByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public void delete(Cliente cliente){
        if(cliente.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(cliente);
    }

    public void deleteById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
