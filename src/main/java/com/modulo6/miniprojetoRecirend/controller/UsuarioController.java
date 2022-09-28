package com.modulo6.miniprojetoRecirend.controller;

import com.modulo6.miniprojetoRecirend.DTO.UsuarioDTO;
import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaEspecificaDTO;
import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaGeralDTO;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<UsuarioRespostaGeralDTO>> buscarTodosUsuarios() {
        return ResponseEntity.ok(usuarioService.buscarTodos());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<UsuarioRespostaEspecificaDTO>> buscarUsuarioPorId(@PathVariable Long id) {
        return ResponseEntity.ok(usuarioService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<UsuarioRespostaGeralDTO> cadastrarUsuario(@Valid @RequestBody UsuarioDTO dto) {
UsuarioModel usuario = usuarioService.cadastrar(dto.converterParaObjeto());
        return new ResponseEntity<>(UsuarioRespostaGeralDTO.converterParaDTO(usuario), HttpStatus.CREATED);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<UsuarioRespostaGeralDTO> alterarUsuario(@RequestBody UsuarioDTO dto, @PathVariable Long id) {
        UsuarioModel usuario = usuarioService.alterar(dto.converterParaObjeto());
        return ResponseEntity.ok(UsuarioRespostaGeralDTO.converterParaDTO(usuario));
    }

    @DeleteMapping(path = " /{id}")
    public ResponseEntity<?> deletarUsuario(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
