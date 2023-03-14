package br.iesp.edu.tecback2.service;

import br.iesp.edu.tecback2.entity.Funcionario;
import br.iesp.edu.tecback2.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {
    @Autowired
    private FuncionarioRepository repository;

    public Funcionario salvar(Funcionario funcionario){
        funcionario = repository.save(funcionario);
        return funcionario;
    }

    public Funcionario atualizar(Funcionario funcionario){
        if(funcionario.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        funcionario = repository.save(funcionario);
        return funcionario;
    }

    public void excluir(Funcionario funcionario){
        if(funcionario.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(funcionario);
    }


    public void excluirPorID(Long id){
        repository.deleteById(id);
    }

    public List<Funcionario> listarFuncionario(){
        return repository.findAll();
    }

}