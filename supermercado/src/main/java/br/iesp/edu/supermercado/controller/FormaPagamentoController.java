package br.iesp.edu.supermercado.controller;

import br.iesp.edu.supermercado.entity.FormaPagamento;
import br.iesp.edu.supermercado.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/formaPagamento")
public class FormaPagamentoController {
    @Autowired
    private FormaPagamentoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<FormaPagamento> save(@RequestBody FormaPagamento fp) {
        FormaPagamento formaPagamento = service.save(fp);
        return ResponseEntity.status(201).body(formaPagamento);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<FormaPagamento> update(@RequestBody FormaPagamento fp) {
        FormaPagamento formaPagamento = service.save(fp);
        return ResponseEntity.status(201).body(formaPagamento);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<FormaPagamento> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<FormaPagamento> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<FormaPagamento> findByNome(@PathVariable String nome){
        return service.findByNome(nome);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody FormaPagamento fp) {
        service.delete(fp);
    }
}
