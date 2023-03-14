package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Cliente;
import br.iesp.edu.tecback2.service.ClienteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteService service;

    @PostMapping
    public Cliente salvar(@RequestBody @Valid Cliente cliente){
        return service.salvar(cliente);
    }

    @PutMapping
    public Cliente atualizar(@RequestBody @Valid Cliente cliente){
        return service.atualizar(cliente);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cliente cliente){
        service.excluir(cliente);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Cliente> listarCliente(){
        return service.listarCliente();
    }

}
