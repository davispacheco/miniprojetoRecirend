package com.modulo6.miniprojetoRecirend.calculoTrocaDePontos;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;

import static com.modulo6.miniprojetoRecirend.Enum.ProdutosTroca.*;

public class TrocaFactory {

    public ICalculoTroca trocaDePontosPorBeneficio(TrocaModel trocaModel, UsuarioModel usuarioModel){
        if(produtosTroca == SALGADINHO && usuarioModel.getPontosUsuario >= 3000){
            return new Salgadinho();
        }else if (produtosTroca == GARRAFA_TERMICA && usuarioModel.getPontosUsuario >= 10500 ) {
            return new GarrafaTermica();
        }else if (produtosTroca == HEADSET && usuarioModel.getPontosUsuario >= 37500) {
            return new Headset();
        }else if (produtosTroca == CADEIRA_GAMER && usuarioModel.getPontosUsuario >= 75000) {
            return new CadeiraGamer();
        }else if (produtosTroca == XBOX && usuarioModel.getPontosUsuario >= 285000) {
            return new Xbox();
        }
        throw new RuntimeException("Algum dos requisitos não foi cumprido, favor verificar quantidade de pontos e nome do produto. Obrigado!");
    }
}
