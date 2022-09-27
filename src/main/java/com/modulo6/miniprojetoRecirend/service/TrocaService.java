package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.repository.TrocaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrocaService {

    @Autowired
    private TrocaRepository trocaRepository;


    //cadastrar a troca//
    public TrocaModel registraTroca(TrocaModel trocaModel){
        return trocaRepository.save(trocaModel);

    }
    //buscar todas as trocas//
    public List<TrocaModel> todaAsTroca(){
        return trocaRepository.findAll();
    }
    //buscar trocas pot Id//
    public Optional<TrocaModel> buscaId(long id){
        return trocaRepository.findById(id);
    }
    //alterar dados da troca//
    public TrocaModel alteraNovaTroca(TrocaModel trocaModel){
        return trocaRepository.save(trocaModel);

    }
    //Deletar a troca pot Id//
    public void deleteTrocaId(Long id) {
        trocaRepository.deleteById(id);
    }





}
