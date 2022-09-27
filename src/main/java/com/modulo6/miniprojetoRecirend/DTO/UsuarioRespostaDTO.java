package com.modulo6.miniprojetoRecirend.DTO;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRespostaDTO {
    private Long id;

    private String nomeUsuario;

    private String email;

    private Long pontuacao;

    public static UsuarioRespostaDTO converterParaDTO(UsuarioModel usuario) {
        return new UsuarioRespostaDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getEmail(), usuario.getPontuacao());
    }

    public static List<UsuarioRespostaDTO> converterLista(List<UsuarioModel> usuarios) {
        List<UsuarioRespostaDTO> novaLista = new ArrayList<>();
        for (UsuarioModel usuario : usuarios) {
            UsuarioRespostaDTO novoUsuario = new UsuarioRespostaDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getEmail(), usuario.getPontuacao());
            novaLista.add(novoUsuario);
        }
        return novaLista;
    }
}
