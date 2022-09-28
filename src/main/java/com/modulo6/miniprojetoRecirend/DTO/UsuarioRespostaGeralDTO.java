package com.modulo6.miniprojetoRecirend.DTO;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class UsuarioRespostaGeralDTO {
    private Long id;

    private String nomeUsuario;

    private String email;

    private Long pontuacao;

    public static UsuarioRespostaGeralDTO converterParaDTO(UsuarioModel usuario) {
        return new UsuarioRespostaGeralDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getEmail(), usuario.getPontuacao());
    }

    public static List<UsuarioRespostaGeralDTO> converterLista(List<UsuarioModel> usuarios) {
        List<UsuarioRespostaGeralDTO> novaLista = new ArrayList<>();
        for (UsuarioModel usuario : usuarios) {
            UsuarioRespostaGeralDTO novoUsuario = new UsuarioRespostaGeralDTO(usuario.getId(), usuario.getNomeUsuario(), usuario.getEmail(), usuario.getPontuacao());
            novaLista.add(novoUsuario);
        }
        return novaLista;
    }
}
