package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.calculoTrocaDePontos.TrocaFactory;
import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.TrocaRepository;
import com.modulo6.miniprojetoRecirend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class TrocaService {
    @Autowired
    private TrocaRepository trocaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public TrocaModel registraTroca(TrocaModel trocaModel, Long id, TrocaFactory troca) {
        Optional<UsuarioModel> result = usuarioRepository.findById(id);
        trocaModel.setDataDeCadastro(LocalDate.now());
        var pontuacao = troca.trocaDePontosPorBeneficio(trocaModel, result.get()).calculoTrocaPontos(result.get());
        result.get().setPontuacao(pontuacao);

        return trocaRepository.save(trocaModel);
    }

    public List<TrocaModel> todaAsTroca() {
        return trocaRepository.findAll();
    }

    public Optional<TrocaModel> buscaId(long id) {
        return trocaRepository.findById(id);
    }

    public TrocaModel alteraNovaTroca(TrocaModel trocaModel) {
        return trocaRepository.save(trocaModel);

    }

    public void deleteTrocaId(Long id) {
        trocaRepository.deleteById(id);
    }


}
