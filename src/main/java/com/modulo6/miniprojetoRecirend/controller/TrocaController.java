package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.service.TrocaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TrocaController {

    @Autowired
    private TrocaService trocaService;

    // Cadastrar a troca//
    @PostMapping(path = "/troca")
    public ResponseEntity <TrocaModel> cadastraTroca(@RequestBody TrocaModel cadastreTroca) {
        TrocaModel novaTroca = trocaService.registraTroca(cadastreTroca);
        return new ResponseEntity<>(novaTroca, HttpStatus.CREATED);
    }

    //Buscar todas as trocas//
    @GetMapping(path = "/troca")
    public ResponseEntity<List<TrocaModel>> buscarTroca(){
        return ResponseEntity.ok (trocaService.todaAsTroca());

    }

    //Buscar trocas por ID //
    @GetMapping(path = "/troca/{id}")
    public ResponseEntity<Optional<TrocaModel>> buscarIdTroca(@PathVariable long id){
        return ResponseEntity.ok (trocaService.buscaId(id));

    }

    //Alterar a troca//

    @PutMapping(path = "/troca/{id}")
    ResponseEntity<TrocaModel>alterarTroca (@RequestBody TrocaModel altereTroca, @PathVariable Long id){
        altereTroca.setTrocaId(id);
        return ResponseEntity.ok(trocaService.alteraNovaTroca(altereTroca));

    }

    //Deletar a troca//
    @DeleteMapping(path = "/troca/{id}")
    public ResponseEntity<Void>deletarTroca(@PathVariable long id) {
        trocaService.deleteTrocaId(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
