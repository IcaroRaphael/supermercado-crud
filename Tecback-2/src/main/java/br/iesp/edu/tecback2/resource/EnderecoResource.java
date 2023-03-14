package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Endereco;
import br.iesp.edu.tecback2.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoResource {

    @Autowired
    private EnderecoService service;

    @PostMapping
    public Endereco salvar(@RequestBody @Valid Endereco endereco){
        return service.salvar(endereco);
    }

    @PutMapping
    public Endereco atualizar(@RequestBody @Valid Endereco endereco){
        return service.atualizar(endereco);
    }

    @DeleteMapping
    public void excluir(@RequestBody Endereco endereco){
        service.excluir(endereco);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Endereco> listarEndereco(){
        return service.listarEndereco();
    }

}
