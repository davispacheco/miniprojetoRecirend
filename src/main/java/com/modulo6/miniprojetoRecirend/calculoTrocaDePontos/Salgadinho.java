package com.modulo6.miniprojetoRecirend.calculoTrocaDePontos;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;

public class Salgadinho implements ICalculoTroca{
    @Override
    public Long calculoTrocaPontos(UsuarioModel usuarioModel) {
        return setPontosUsuario(usuarioModel.getPontosUsuario-3000);
    }
}
