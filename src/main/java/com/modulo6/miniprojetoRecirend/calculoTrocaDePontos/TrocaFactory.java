package com.modulo6.miniprojetoRecirend.calculoTrocaDePontos;

<<<<<<< Updated upstream
import com.modulo6.miniprojetoRecirend.Enum.ProdutosTroca;
=======
>>>>>>> Stashed changes
import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;

import static com.modulo6.miniprojetoRecirend.Enum.ProdutosTroca.*;

public class TrocaFactory {

//    public ICalculoTroca trocaDePontosPorBeneficio(TrocaModel trocaModel, UsuarioModel usuarioModel){
<<<<<<< Updated upstream
//        if(trocaModel.getProduto() == SALGADINHO && usuarioModel.getPontuacao() >= 3000){
=======
//        if(trocaModel.getProduto() == SALGADINHO && usuarioModel.getPontuacao()>= 3000){
>>>>>>> Stashed changes
//            return new Salgadinho();
//        }else if (trocaModel.getProduto() == GARRAFA_TERMICA && usuarioModel.getPontuacao() >= 10500 ) {
//            return new GarrafaTermica();
//        }else if (trocaModel.getProduto() == HEADSET && usuarioModel.getPontuacao() >= 37500) {
//            return new Headset();
//        }else if (trocaModel.getProduto() == CADEIRA_GAMER && usuarioModel.getPontuacao() >= 75000) {
//            return new CadeiraGamer();
//        }else if (trocaModel.getProduto() == XBOX && usuarioModel.getPontuacao() >= 285000) {
//            return new Xbox();
//        }
//        throw new RuntimeException("Algum dos requisitos não foi cumprido, favor verificar quantidade de pontos e nome do produto. Obrigado!");
//    }

    public Long trocaDePontosPorBeneficio(TrocaModel trocaModel, UsuarioModel usuarioModel){
<<<<<<< Updated upstream
        if(trocaModel.getProduto() == SALGADINHO && usuarioModel.getPontuacao() >= 3000){
=======
        if(trocaModel.getProduto() == SALGADINHO && usuarioModel.getPontuacao()>= 3000){
>>>>>>> Stashed changes
            return usuarioModel.getPontuacao()-3000L;
        }else if (trocaModel.getProduto() == GARRAFA_TERMICA && usuarioModel.getPontuacao() >= 10500 ) {
            return usuarioModel.getPontuacao()-10500L;
        }else if (trocaModel.getProduto() == HEADSET && usuarioModel.getPontuacao() >= 37500) {
            return usuarioModel.getPontuacao()-37500L;
        }else if (trocaModel.getProduto() == CADEIRA_GAMER && usuarioModel.getPontuacao() >= 75000) {
            return usuarioModel.getPontuacao()-75000L;
        }else if (trocaModel.getProduto() == XBOX && usuarioModel.getPontuacao() >= 285000) {
            return usuarioModel.getPontuacao()-285000L;
        }
        throw new RuntimeException("Algum dos requisitos não foi cumprido, favor verificar quantidade de pontos e nome do produto. Obrigado!");
    }
}
