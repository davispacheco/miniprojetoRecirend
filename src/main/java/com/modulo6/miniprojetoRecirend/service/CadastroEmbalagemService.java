package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.CadastroEmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.CadastroEmbalagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroEmbalagemService {

    @Autowired
    CadastroEmbalagemRepository repository;

    @Autowired
    UsuarioService service;

    public List<CadastroEmbalagemModel> buscarCadastros(){
        return repository.findAll();
    }

    public Optional<CadastroEmbalagemModel> buscarCadastroId(Long id){
        return repository.findById(id);
    }

    public CadastroEmbalagemModel cadastrar(CadastroEmbalagemModel cadastroEmbalagemModel, Long id){

       Optional<UsuarioModel> result =  service.buscarPorId(id);
        result.get().acrescimoPontuacao();
       cadastroEmbalagemModel.setUsuarioModel(result.get());

        return repository.save(cadastroEmbalagemModel);
    }
}
