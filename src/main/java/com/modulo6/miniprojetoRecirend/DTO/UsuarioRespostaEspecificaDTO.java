package com.modulo6.miniprojetoRecirend.DTO;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRespostaEspecificaDTO {
    private Long id;

    private String nomeUsuario;

    private String cpf;

    private String email;

    private Long pontuacao;

    public static UsuarioRespostaEspecificaDTO converterParaDTO(UsuarioModel usuario) {
        return new UsuarioRespostaEspecificaDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getCpf(), usuario.getEmail(), usuario.getPontuacao());
    }

    public static List<UsuarioRespostaEspecificaDTO> converterLista(List<UsuarioModel> usuarios) {
        List<UsuarioRespostaEspecificaDTO> novaLista = new ArrayList<>();
        for (UsuarioModel usuario : usuarios) {
            UsuarioRespostaEspecificaDTO novoUsuario = new UsuarioRespostaEspecificaDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getCpf(), usuario.getEmail(), usuario.getPontuacao());
            novaLista.add(novoUsuario);
        }
        return novaLista;
    }
}
