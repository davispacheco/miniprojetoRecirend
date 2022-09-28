package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.DTO.UsuarioRespostaGeralDTO;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.UsuarioRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Collections;
import java.util.List;

@SpringBootTest
public class UsuarioServiceTest {
    @Mock
    UsuarioRepository usuarioRepository;

    @InjectMocks
    UsuarioService usuarioService;

    UsuarioModel usuarioModel;

    @BeforeEach
    private void inicializacao() {
        MockitoAnnotations.openMocks(this);
        usuarioModel = new UsuarioModel("Joaquim", "12345678901", "joaquim@gmail.com", "joaquim123");
    }

    @Test
    void mostrarTodosUsuarios() {
        Mockito.when(usuarioRepository.findAll()).thenReturn(Collections.emptyList());
        List<UsuarioRespostaGeralDTO> usuarios = usuarioService.buscarTodos();
        Assertions.assertTrue(usuarios.isEmpty());
    }

    @Test
    void testeCadastrarUsuario() {
        Mockito.when(usuarioRepository.existsById(Mockito.anyLong())).thenReturn(false);
        usuarioService.cadastrar(usuarioModel);
        Mockito.verify(usuarioRepository, Mockito.times(1)).save(usuarioModel);
    }

    void testeContagemUsuarios() {
        Mockito.when(usuarioRepository.findAll()).thenReturn(List.of(usuarioModel));
        List<UsuarioRespostaGeralDTO> usuarios = usuarioService.buscarTodos();
        Assertions.assertEquals(1, usuarios.size());
    }
}
