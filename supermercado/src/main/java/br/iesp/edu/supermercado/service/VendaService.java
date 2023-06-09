package br.iesp.edu.supermercado.service;

import br.iesp.edu.supermercado.entity.Produto;
import br.iesp.edu.supermercado.entity.Venda;
import br.iesp.edu.supermercado.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendaService {

    @Autowired
    private VendaRepository repository;

    public Venda save(Venda venda){
        venda = repository.save(venda);
        return venda;
    }

    public Venda update(Venda venda){
        if(venda.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        venda = repository.save(venda);
        return venda;
    }

    public List<Venda> findAll(){
        return repository.findAll();
    }

    public Optional<Venda> findById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        return repository.findById(id);
    }

    public List<Produto> findProdutosByVendaId(Integer vendaId){
        return repository.findProdutosByVendaId(vendaId);
    }

    public List<Venda> findVendaByFuncionarioId(Integer funcionarioId){
        return repository.findVendaByFuncionarioId(funcionarioId);
    }

    public List<Venda> findVendaByClienteId(Integer clienteId){
        return repository.findVendaByClienteId(clienteId);
    }

    public void delete(Venda venda){
        if(venda.getId() == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.delete(venda);
    }

    public void deleteById(Integer id){
        if(repository.findById(id).orElse(null) == null){
            throw new RuntimeException("Objeto inexistente.");
        }
        repository.deleteById(id);
    }
}
