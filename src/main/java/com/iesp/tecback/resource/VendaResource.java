package com.iesp.tecback.resource;

import com.iesp.tecback.entity.Venda;
import com.iesp.tecback.service.VendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venda")
public class VendaResource {

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
    public Optional<Venda> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@RequestBody Venda v) {
        service.delete(v);
    }
}
