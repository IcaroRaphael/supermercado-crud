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

    @GetMapping("/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findByNome(@PathVariable String nome){
        return service.findByNome(nome);
    }

    @GetMapping("/funcao/{funcao}")
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findByFuncao(@PathVariable String funcao){
        return service.findByFuncao(funcao);
    }

    @GetMapping("/cpf/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public List<Funcionario> findByCpf(@PathVariable String cpf){
        return service.findByCpf(cpf);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Funcionario f) {
        service.delete(f);
    }
}
