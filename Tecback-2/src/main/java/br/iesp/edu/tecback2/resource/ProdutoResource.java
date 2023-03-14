package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Produto;
import br.iesp.edu.tecback2.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @PostMapping
    public Produto salvar(@RequestBody @Valid Produto produto){
        return service.salvar(produto);
    }

    @PutMapping
    public Produto atualizar(@RequestBody @Valid Produto produto){
        return service.atualizar(produto);
    }

    @DeleteMapping
    public void excluir(@RequestBody Produto produto){
        service.excluir(produto);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Produto> listarProduto(){
        return service.listarProduto();
    }

}
