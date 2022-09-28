package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaEspecificaDTO;
import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaGeralDTO;
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

    public List<UsuarioRespostaGeralDTO> buscarTodos() {
        List<UsuarioModel> usuarios = usuarioRepository.findAll();
        return UsuarioRespostaGeralDTO.converterLista(usuarios);
    }

    public Optional<UsuarioRespostaEspecificaDTO> buscarPorId(Long codigo) {
        Optional<UsuarioModel> usuario = usuarioRepository.findById(codigo);
        return UsuarioRespostaEspecificaDTO.converterOptional(usuario);
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
