package com.iesp.tecback.resource;

import com.iesp.tecback.entity.Produto;
import com.iesp.tecback.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produto")
public class ProdutoResource {

    @Autowired
    private ProdutoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> save(@RequestBody Produto p) {
        Produto produto = service.save(p);
        return ResponseEntity.status(201).body(produto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Produto> update(@RequestBody Produto p) {
        Produto produto = service.save(p);
        return ResponseEntity.status(201).body(produto);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Produto> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Produto p) {
        service.delete(p);
    }
}
