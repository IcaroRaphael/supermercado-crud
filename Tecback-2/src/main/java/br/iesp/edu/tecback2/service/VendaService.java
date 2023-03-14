package br.iesp.edu.tecback2.service;

import br.iesp.edu.tecback2.entity.Venda;
import br.iesp.edu.tecback2.repository.VendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendaService {
    @Autowired
    private VendaRepository repository;

    public Venda salvar(Venda venda){
        venda = repository.save(venda);
        return venda;
    }

    public Venda atualizar(Venda venda){
        if(venda.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        venda = repository.save(venda);
        return venda;
    }

    public void excluir(Venda venda){
        if(venda.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(venda);
    }


    public void excluirPorID(Long id){
        repository.deleteById(id);
    }

    public List<Venda> listarVenda(){
        return repository.findAll();
    }

}