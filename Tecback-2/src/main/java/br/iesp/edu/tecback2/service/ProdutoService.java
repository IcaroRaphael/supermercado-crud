package br.iesp.edu.tecback2.service;

import br.iesp.edu.tecback2.entity.Produto;
import br.iesp.edu.tecback2.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto salvar(Produto produto){
        produto = repository.save(produto);
        return produto;
    }

    public Produto atualizar(Produto produto){
        if(produto.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        produto = repository.save(produto);
        return produto;
    }

    public void excluir(Produto produto){
        if(produto.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(produto);
    }


    public void excluirPorID(Long id){
        repository.deleteById(id);
    }

    public List<Produto> listarProduto(){
        return repository.findAll();
    }

}