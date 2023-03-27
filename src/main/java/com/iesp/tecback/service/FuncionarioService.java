package com.iesp.tecback.service;

import com.iesp.tecback.entity.Funcionario;
import com.iesp.tecback.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository repository;

    public Funcionario save(Funcionario funcionario){
        funcionario = repository.save(funcionario);
        return funcionario;
    }

    public Funcionario update(Funcionario funcionario){
        if(funcionario.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        funcionario = repository.save(funcionario);
        return funcionario;
    }

    public List<Funcionario> findAll(){
        return repository.findAll();
    }

    public Optional<Funcionario> findById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Funcionario> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Funcionario> findByFuncao(String funcao){
        return repository.findByFuncaoContainingIgnoreCase(funcao);
    }

    public List<Funcionario> findByCpf(String cpf){
        return repository.findByCpf(cpf);
    }

    public void delete(Funcionario funcionario){
        if(funcionario.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(funcionario);
    }

    public void deleteById(Long id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
