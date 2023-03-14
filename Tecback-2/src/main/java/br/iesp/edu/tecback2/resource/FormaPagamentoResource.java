package br.iesp.edu.tecback2.resource;

import br.iesp.edu.tecback2.entity.FormaPagamento;
import br.iesp.edu.tecback2.service.FormaPagamentoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formaPagamento")
public class FormaPagamentoResource {

    @Autowired
    private FormaPagamentoService service;

    @PostMapping
    public FormaPagamento salvar(@RequestBody @Valid FormaPagamento formaPagamento){
        return service.salvar(formaPagamento);
    }

    @PutMapping
    public FormaPagamento atualizar(@RequestBody @Valid FormaPagamento formaPagamento){
        return service.atualizar(formaPagamento);
    }

    @DeleteMapping
    public void excluir(@RequestBody FormaPagamento formaPagamento){
        service.excluir(formaPagamento);
    }
    @DeleteMapping("/{id}")
    public void excluirPorId(@PathVariable Long id){
        service.excluirPorID(id);
    }

    @GetMapping
    public List<FormaPagamento> listarFormaPagamento(){
        return service.listarFormaPagamento();
    }

}
