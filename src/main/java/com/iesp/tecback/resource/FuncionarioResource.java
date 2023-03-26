package com.iesp.tecback.resource;

import com.iesp.tecback.entity.Funcionario;
import com.iesp.tecback.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Funcionario> save(@RequestBody Funcionario f) {
        Funcionario funcionario = service.save(f);
        return ResponseEntity.status(201).body(funcionario);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Funcionario> update(@RequestBody Funcionario f) {
        Funcionario funcionario = service.save(f);
        return ResponseEntity.status(201).body(funcionario);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Funcionario> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Funcionario f) {
        service.delete(f);
    }
}
