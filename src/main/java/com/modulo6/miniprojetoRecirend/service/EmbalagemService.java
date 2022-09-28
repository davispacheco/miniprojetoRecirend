package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.EmbalagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmbalagemService {

    @Autowired
    EmbalagemRepository repository;

    @Autowired
    UsuarioService service;

    public List<EmbalagemModel> buscarCadastros(){
        return repository.findAll();
    }

    public Optional<EmbalagemModel> buscarCadastroId(Long id){
        return repository.findById(id);
    }

    public EmbalagemModel cadastrar(EmbalagemModel embalagemModel, Long id){

       Optional<UsuarioModel> result =  service.buscarPorId(id);
        result.get().acrescimoPontuacao();
       embalagemModel.setUsuarioModel(result.get());

        return repository.save(embalagemModel);
    }
}
