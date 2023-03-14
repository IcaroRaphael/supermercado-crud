package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Venda;
import br.iesp.edu.tecback2.service.VendaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/venda")
public class VendaResource {

    @Autowired
    private VendaService service;

    @PostMapping
    public Venda salvar(@RequestBody @Valid Venda venda){
        return service.salvar(venda);
    }

    @PutMapping
    public Venda atualizar(@RequestBody @Valid Venda venda){
        return service.atualizar(venda);
    }

    @DeleteMapping
    public void excluir(@RequestBody Venda venda){
        service.excluir(venda);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Venda> listarVenda(){
        return service.listarVenda();
    }

}
