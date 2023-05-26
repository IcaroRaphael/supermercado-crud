package br.iesp.edu.supermercado.controller;

import br.iesp.edu.supermercado.entity.Cliente;
import br.iesp.edu.supermercado.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> save(@RequestBody Cliente c) {
        Cliente cliente = service.save(c);
        return ResponseEntity.status(201).body(cliente);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Cliente> update(@RequestBody Cliente c) {
        Cliente cliente = service.save(c);
        return ResponseEntity.status(201).body(cliente);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @GetMapping("/nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findByNome(@PathVariable String nome){
        return service.findByNome(nome);
    }

    @GetMapping("/cpf/{cpf}")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findByCpf(@PathVariable String cpf){
        return service.findByCpf(cpf);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Cliente c) {
        service.delete(c);
    }

}
