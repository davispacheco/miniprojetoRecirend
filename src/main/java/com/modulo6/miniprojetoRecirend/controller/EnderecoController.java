package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.model.EnderecoModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<EnderecoModel> buscarEndereco() {
        return enderecoService.buscarEndereco();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EnderecoModel cadastrarEndereco (@RequestBody EnderecoModel enderecoModel) {
        return enderecoService.cadastrarEndereco(enderecoModel);
    }

    @PutMapping(path = "/{idEndereco}")
    public EnderecoModel alterarEndereco (@RequestBody EnderecoModel enderecoModel){
        return enderecoService.alterarEndereco(enderecoModel);
    }

   @DeleteMapping (path = "/{idEndereco}")
    public void deletarEndereco (@PathVariable Long idEndereco){
        enderecoService.deletarEndereco(idEndereco);
   }


}
