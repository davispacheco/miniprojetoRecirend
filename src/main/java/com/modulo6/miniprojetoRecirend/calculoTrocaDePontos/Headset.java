package com.modulo6.miniprojetoRecirend.calculoTrocaDePontos;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;

public class Headset implements ICalculoTroca{
    @Override
    public Long calculoTrocaPontos(UsuarioModel usuarioModel) {
        Long resultado = usuarioModel.getPontuacao()-37500L;
        return resultado;
    }
}
