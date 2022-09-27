package com.modulo6.miniprojetoRecirend.calculoTrocaDePontos;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;

public class Salgadinho implements ICalculoTroca{
    @Override
    public Long calculoTrocaPontos(UsuarioModel usuarioModel) {
        Long resultado = usuarioModel.getPontuacao()-3000L;
        usuarioModel.setPontuacao(resultado);
        return usuarioModel.getPontuacao();
    }
}
