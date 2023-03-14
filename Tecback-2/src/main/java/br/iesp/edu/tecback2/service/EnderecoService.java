package br.iesp.edu.tecback2.service;

import br.iesp.edu.tecback2.entity.Endereco;
import br.iesp.edu.tecback2.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository repository;

    public Endereco salvar(Endereco endereco){
        endereco = repository.save(endereco);
        return endereco;
    }

    public Endereco atualizar(Endereco endereco){
        if(endereco.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        endereco = repository.save(endereco);
        return endereco;
    }

    public void excluir(Endereco endereco){
        if(endereco.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(endereco);
    }


    public void excluirPorID(Long id){
        repository.deleteById(id);
    }

    public List<Endereco> listarEndereco(){
        return repository.findAll();
    }

}