package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.EmbalagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EmbalagemService {

    @Autowired
    private EmbalagemRepository embalagemRepository;

    @Autowired
    private UsuarioService usuarioService;

    public List<EmbalagemModel> buscarCadastros() {
        return embalagemRepository.findAll();
    }

    public Optional<EmbalagemModel> buscarCadastroId(Long id) {
        return embalagemRepository.findById(id);
    }

    public EmbalagemModel cadastrar(EmbalagemModel embalagemModel, Long id) {

        Optional<UsuarioModel> result = usuarioService.buscarPorId(id);
        result.get().acrescimoPontuacao();
        embalagemModel.setUsuario(result.get());

        embalagemModel.setDataDoCadastro(LocalDate.now());

        return embalagemRepository.save(embalagemModel);
    }
}
