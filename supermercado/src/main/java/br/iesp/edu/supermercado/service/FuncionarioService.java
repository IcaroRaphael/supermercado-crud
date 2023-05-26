package br.iesp.edu.supermercado.service;

import br.iesp.edu.supermercado.entity.Funcionario;
import br.iesp.edu.supermercado.repository.FuncionarioRepository;
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

    public Optional<Funcionario> findById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Funcionario> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public List<Funcionario> findByCpf(String cpf){
        return repository.findByCpfContainingIgnoreCase(cpf);
    }

    public List<Funcionario> findByProfissao(Integer id){
        return repository.findFuncionarioByProfissaoId(id);
    }

    public void delete(Funcionario funcionario){
        if(funcionario.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(funcionario);
    }

    public void deleteById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
