package br.iesp.edu.supermercado.service;

import br.iesp.edu.supermercado.entity.Produto;
import br.iesp.edu.supermercado.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto){
        produto = repository.save(produto);
        return produto;
    }

    public Produto update(Produto produto){
        if(produto.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        produto = repository.save(produto);
        return produto;
    }

    public List<Produto> findAll(){
        return repository.findAll();
    }

    public Optional<Produto> findById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Produto> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public void delete(Produto produto){
        if(produto.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(produto);
    }

    public void deleteById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
