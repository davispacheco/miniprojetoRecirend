package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.Enum.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.repository.TrocaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrocaService {

    @Autowired
    private TrocaRepository trocaRepository;


    public TrocaModel registraTroca(TrocaModel trocaModel){
        return trocaRepository.save(trocaModel);

    }

    public List<TrocaModel> todaAsTroca(){
        return trocaRepository.findAll();
    }

    public Optional<TrocaModel> buscaId(long id){
        return trocaRepository.findById(id);
    }

    public TrocaModel alteraNovaTroca(TrocaModel trocaModel){
        return trocaRepository.save(trocaModel);

    }
    public void deleteTrocaId(Long id) {
        trocaRepository.deleteById(id);
    }





}
