package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.EnderecoModel;
import com.modulo6.miniprojetoRecirend.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<EnderecoModel> buscarEndereco (){
        return enderecoRepository.findAll();
    }

    public EnderecoModel cadastrarEndereco (EnderecoModel enderecoModel){
        return enderecoRepository.save(enderecoModel);
    }

    public EnderecoModel alterarEndereco (EnderecoModel enderecoModel){
        return enderecoRepository.save(enderecoModel);
    }

    public void deletarEndereco (Long id){
        enderecoRepository.deleteById(id);
    }
}
