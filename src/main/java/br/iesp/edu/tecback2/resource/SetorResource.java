package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Setor;
import br.iesp.edu.tecback2.service.SetorService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/setor")
public class SetorResource {

    @Autowired
    private SetorService service;

    @PostMapping
    public Setor salvar(@RequestBody @Valid Setor setor){
        return service.salvar(setor);
    }

    @PutMapping
    public Setor atualizar(@RequestBody @Valid Setor setor){
        return service.atualizar(setor);
    }

    @DeleteMapping
    public void excluir(@RequestBody Setor setor){
        service.excluir(setor);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Setor> listarSetor(){
        return service.listarSetor();
    }

}
