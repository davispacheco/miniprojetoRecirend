package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.service.EmbalagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/embalagem")
public class EmbalagemController {

    @Autowired
    EmbalagemService service;


    @GetMapping
    public ResponseEntity<List<EmbalagemModel>> buscarEmbalagensCadastradas(){
        return new ResponseEntity<>(service.buscarCadastros(),HttpStatus.OK);
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<EmbalagemModel>> buscarEmbalagemCadastradaPorId(Long id){
        return new ResponseEntity<>(service.buscarCadastroId(id),HttpStatus.OK);
    }

    @PostMapping(path = "/{id}")
    public ResponseEntity<EmbalagemModel> cadastroEmbalagem(@RequestBody EmbalagemModel embalagemModel, @PathVariable Long id){
        return new ResponseEntity<>(service.cadastrar(embalagemModel,id),HttpStatus.CREATED);
    }
}
