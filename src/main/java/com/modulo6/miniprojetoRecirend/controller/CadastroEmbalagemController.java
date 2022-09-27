package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.CadastroEmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.service.CadastroEmbalagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/embalagem")
public class CadastroEmbalagemController {

    @Autowired
    CadastroEmbalagemService service;

    @PostMapping(path = "/{id}")
    public CadastroEmbalagemModel cadastroEmbalagem(@RequestBody CadastroEmbalagemModel embalagemModel,@PathVariable Long id){
        return service.cadastrar(embalagemModel,id);
    }
}
