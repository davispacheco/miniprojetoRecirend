package com.modulo6.miniprojetoRecirend.service;

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

import java.util.ArrayList;
import java.util.List;

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

    @BeforeEach
    private void iniciarTeste(){
        MockitoAnnotations.openMocks(this);
        usuarioModel = new UsuarioModel("Joauim", "73166984038","joaquim@gmail.com.br", "teste123");
    }


    @Test
    void todaAsTroca() {
        List<TrocaModel> listTroca = new ArrayList<>();
        Mockito.when(trocaRepository.findAll(listTroca)).thenReturn(listTroca);
        List<TrocaModel> listTest = new ArrayList<>();
        listTest = trocaService.todaAsTroca();
        Assertions.assertEquals(listTest, listTroca);

    }

    @Test
    void buscaId() {
    }

    @Test
    void alteraNovaTroca() {
    }

    @Test
    void deleteTrocaId() {
    }
}