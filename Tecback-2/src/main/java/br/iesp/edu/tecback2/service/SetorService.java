package br.iesp.edu.tecback2.service;

import br.iesp.edu.tecback2.entity.Setor;
import br.iesp.edu.tecback2.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {
    @Autowired
    private SetorRepository repository;

    public Setor salvar(Setor setor){
        setor = repository.save(setor);
        return setor;
    }

    public Setor atualizar(Setor setor){
        if(setor.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        setor = repository.save(setor);
        return setor;
    }

    public void excluir(Setor setor){
        if(setor.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(setor);
    }


    public void excluirPorID(Long id){
        repository.deleteById(id);
    }

    public List<Setor> listarSetor(){
        return repository.findAll();
    }

}