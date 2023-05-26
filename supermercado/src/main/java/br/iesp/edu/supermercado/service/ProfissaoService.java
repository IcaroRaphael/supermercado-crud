package br.iesp.edu.supermercado.service;

import br.iesp.edu.supermercado.entity.Profissao;
import br.iesp.edu.supermercado.repository.ProfissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfissaoService {
    @Autowired
    private ProfissaoRepository repository;

    public Profissao save(Profissao profissao){
        profissao = repository.save(profissao);
        return profissao;
    }

    public Profissao update(Profissao profissao){
        if(profissao.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        profissao = repository.save(profissao);
        return profissao;
    }

    public List<Profissao> findAll(){
        return repository.findAll();
    }

    public Optional<Profissao> findById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Profissao> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public void delete(Profissao profissao){
        if(profissao.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(profissao);
    }

    public void deleteById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
