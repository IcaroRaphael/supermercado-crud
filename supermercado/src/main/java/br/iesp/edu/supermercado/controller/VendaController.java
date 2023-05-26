package br.iesp.edu.supermercado.controller;

import br.iesp.edu.supermercado.entity.Produto;
import br.iesp.edu.supermercado.entity.Venda;
import br.iesp.edu.supermercado.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venda")
public class VendaController {
    @Autowired
    private VendaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Venda> save(@RequestBody Venda v) {
        Venda venda = service.save(v);
        return ResponseEntity.status(201).body(venda);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Venda> update(@RequestBody Venda v) {
        Venda venda = service.save(v);
        return ResponseEntity.status(201).body(venda);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Venda> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/produtos/{vendaId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> findProdutosByVendaId(@PathVariable Integer vendaId){
        return service.findProdutosByVendaId(vendaId);
    }

    @GetMapping("/funcionario/{funcionarioId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> findVendaByFuncionarioId(@PathVariable Integer funcionarioId){
        return service.findVendaByFuncionarioId(funcionarioId);
    }

    @GetMapping("/cliente/{clienteId}")
    @ResponseStatus(HttpStatus.OK)
    public List<Venda> findVendaByClienteId(@PathVariable Integer clienteId){
        return service.findVendaByClienteId(clienteId);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Venda v) {
        service.delete(v);
    }
}
