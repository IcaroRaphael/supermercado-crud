package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.Funcionario;
import br.iesp.edu.tecback2.service.FuncionarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioResource {

    @Autowired
    private FuncionarioService service;

    @PostMapping
    public Funcionario salvar(@RequestBody @Valid Funcionario funcionario){
        return service.salvar(funcionario);
    }

    @PutMapping
    public Funcionario atualizar(@RequestBody @Valid Funcionario funcionario){
        return service.atualizar(funcionario);
    }

    @DeleteMapping
    public void excluir(@RequestBody Funcionario funcionario){
        service.excluir(funcionario);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Funcionario> listarFuncionario(){
        return service.listarFuncionario();
    }

}
