package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.EmbalagemRepository;
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

@SpringBootTest
class EmbalagemServiceTest {

    @InjectMocks
    private EmbalagemService service;

    @MockBean
    private EmbalagemRepository repository;

    @MockBean
    private UsuarioService usuarioService;

    private UsuarioModel usuario;

    @BeforeEach
    private void inicializacao(){
        MockitoAnnotations.openMocks(this);
        usuario = new UsuarioModel("Tansen Gabriel","73166984038","tansen@gmail.com","123456");
    }


    @Test
    void buscarCadastros() {
        List<EmbalagemModel> embalagens = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(embalagens);
        List<EmbalagemModel> listaDeEmbalagens = service.buscarCadastros();
        Assertions.assertEquals(listaDeEmbalagens,embalagens);
    }

    @Test
    void buscarCadastroId() {
    }

    @Test
    void cadastrar() {
    }
}