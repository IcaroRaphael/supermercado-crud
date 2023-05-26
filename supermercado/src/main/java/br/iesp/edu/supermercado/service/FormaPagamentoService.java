package br.iesp.edu.supermercado.service;

import br.iesp.edu.supermercado.entity.FormaPagamento;
import br.iesp.edu.supermercado.repository.FormaPagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormaPagamentoService {
    @Autowired
    private FormaPagamentoRepository repository;

    public FormaPagamento save(FormaPagamento formaPagamento){
        formaPagamento = repository.save(formaPagamento);
        return formaPagamento;
    }

    public FormaPagamento update(FormaPagamento formaPagamento){
        if(formaPagamento.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        formaPagamento = repository.save(formaPagamento);
        return formaPagamento;
    }

    public List<FormaPagamento> findAll(){
        return repository.findAll();
    }

    public Optional<FormaPagamento> findById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<FormaPagamento> findByNome(String nome){
        return repository.findByNomeContainingIgnoreCase(nome);
    }

    public void delete(FormaPagamento formaPagamento){
        if(formaPagamento.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(formaPagamento);
    }

    public void deleteById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
