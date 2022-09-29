package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.enumeration.PontosDeColeta;
import com.modulo6.miniprojetoRecirend.enumeration.ProdutosTroca;
import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.TrocaRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest

class TrocaServiceTest {

    @InjectMocks
    private TrocaService trocaService;

    @MockBean
    private TrocaRepository trocaRepository;

    @MockBean
    private UsuarioService usuarioService;

    private UsuarioModel usuarioModel;

    private TrocaModel troca;

    @BeforeEach
    private void iniciarTeste(){
        MockitoAnnotations.openMocks(this);
        usuarioModel = new UsuarioModel("Joauim", "73166984038","joaquim@gmail.com.br", "teste123");
        troca = new TrocaModel(1L, ProdutosTroca.CADEIRA_GAMER, PontosDeColeta.BAHIA, LocalDate.parse("2022-09-28"), usuarioModel);
    }

    @Test
    void registraTroca() {
        Mockito.when(trocaRepository.existsById(Mockito.anyLong())).thenReturn(false);
        trocaService.registraTroca(troca);
        Mockito.verify(trocaRepository, Mockito.times(1)).save(troca);
    }


    @Test
    void todaAsTroca() {
        List<TrocaModel> listTroca = new ArrayList<>();
        Mockito.when(trocaRepository.findAll()).thenReturn(listTroca);
        List<TrocaModel> listTest = new ArrayList<>();
        listTest = trocaService.todaAsTroca();
        Assertions.assertEquals(listTest, listTroca);

    }

    @Test
    void buscaId() {
        TrocaModel trocaModel = new TrocaModel();
        trocaModel.setId(1L);
        Mockito.when(trocaRepository.findById(Mockito.anyLong())).thenReturn(Optional.of(trocaModel));
        var status = trocaService.buscaId(1L);
        Assertions.assertEquals(status.get().getId(),trocaModel.getId());
    }

    @Test
    void alteraNovaTroca() {
        Mockito.when(trocaRepository.save(troca)).thenReturn(troca);
        trocaService.alteraNovaTroca(troca);
        Mockito.verify(trocaRepository, Mockito.times(1)).save(troca);

    }

    @Test
    void deleteTrocaId() {
        trocaService.deleteTrocaId(troca.getId());
        Mockito.verify(trocaRepository,Mockito.times(1)).deleteById(troca.getId());
    }
}