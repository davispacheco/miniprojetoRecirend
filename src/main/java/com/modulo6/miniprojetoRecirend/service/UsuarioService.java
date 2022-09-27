package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaDTO;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioRespostaDTO> buscarTodos() {
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        return UsuarioRespostaDTO.converterLista(usuarios);
    }

    public Optional<UsuarioModel> buscarPorId(Long codigo) {
        return usuarioRepository.findById(codigo);
    }

    public UsuarioModel cadastrar(UsuarioModel usuarioModel) {
        usuarioModel.setPontuacao(0L);
        return usuarioRepository.save(usuarioModel);
    }

    public UsuarioModel alterar(UsuarioModel usuarioModel) {
        return usuarioRepository.save(usuarioModel);
    }

    public void deletar(Long id) {
        usuarioRepository.deleteById(id);
    }

}
