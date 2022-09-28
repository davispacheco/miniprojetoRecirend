package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.service.EmbalagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/embalagem")
public class EmbalagemController {

    @Autowired
    EmbalagemService service;


    @PostMapping(path = "/{id}")
    public ResponseEntity<EmbalagemModel> cadastroEmbalagem(@RequestBody EmbalagemModel embalagemModel, @PathVariable Long id){
        return new ResponseEntity<>(service.cadastrar(embalagemModel,id),HttpStatus.CREATED);
    }
}
