package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.service.EmbalagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/embalagem")
public class EmbalagemController {

    @Autowired
    EmbalagemService service;

    @PostMapping(path = "/{id}")
    public EmbalagemModel cadastroEmbalagem(@RequestBody EmbalagemModel embalagemModel, @PathVariable Long id){
        return service.cadastrar(embalagemModel,id);
    }
}
