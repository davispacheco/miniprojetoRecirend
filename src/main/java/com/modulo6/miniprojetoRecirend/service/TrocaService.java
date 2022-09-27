package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.calculoTrocaDePontos.TrocaFactory;
import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.TrocaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrocaService {

    @Autowired
    private TrocaRepository trocaRepository;

    @Autowired
    UsuarioService service;


    public TrocaModel registraTroca(TrocaModel trocaModel, Long id){

        TrocaFactory troca = new TrocaFactory();
        Optional<UsuarioModel> result =  service.buscarPorId(id);
        var pontuacao = troca.trocaDePontosPorBeneficio(trocaModel,result.get());
        result.get().setPontuacao(pontuacao);

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
