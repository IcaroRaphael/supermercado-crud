package br.iesp.edu.supermercado.controller;

import br.iesp.edu.supermercado.entity.Profissao;
import br.iesp.edu.supermercado.service.ProfissaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profissao")
public class ProfissaoController {
    @Autowired
    private ProfissaoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Profissao> save(@RequestBody Profissao p) {
        Profissao profissao = service.save(p);
        return ResponseEntity.status(201).body(profissao);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Profissao> update(@RequestBody Profissao p) {
        Profissao profissao = service.save(p);
        return ResponseEntity.status(201).body(profissao);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Profissao> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Profissao> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Profissao> findByNome(@PathVariable String nome){
        return service.findByNome(nome);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Profissao p) {
        service.delete(p);
    }
}
