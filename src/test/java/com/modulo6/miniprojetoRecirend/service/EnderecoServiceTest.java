package com.modulo6.miniprojetoRecirend.service;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import com.modulo6.miniprojetoRecirend.model.EnderecoModel;
import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import com.modulo6.miniprojetoRecirend.repository.EnderecoRepository;
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

import static com.modulo6.miniprojetoRecirend.enumeration.Marca.LAYS;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService enderecoService;

    @MockBean
    private EnderecoRepository enderecoRepository;

    private EnderecoModel endereco;

    @BeforeEach
    private void inicializacao(){
        MockitoAnnotations.openMocks(this);
        UsuarioModel usuario = new UsuarioModel();
        endereco = new EnderecoModel(1L,"Rua x","bairro","referencia","cep","cidade","estado",usuario);
    }

    @Test
    void buscarEndereco() {
        List<EnderecoModel> enderecos = new ArrayList<>();
        Mockito.when(enderecoRepository.findAll()).thenReturn(enderecos);
        List<EnderecoModel> listaEnderecos = enderecoService.buscarEndereco();
        Assertions.assertEquals(listaEnderecos,enderecos);
    }

    @Test
    void cadastrarEndereco() {
        Mockito.when(enderecoRepository.save(endereco)).thenReturn(endereco);
        enderecoService.cadastrarEndereco(endereco);
        Mockito.verify(enderecoRepository, Mockito.times(1)).save(endereco);
    }

    @Test
    void alterarEndereco() {
        Mockito.when(enderecoRepository.save(endereco)).thenReturn(endereco);
        enderecoService.alterarEndereco(endereco);
        Mockito.verify(enderecoRepository, Mockito.times(1)).save(endereco);
    }

    @Test
    void deletarEndereco() {
        enderecoService.deletarEndereco(endereco.getId());
        Mockito.verify(enderecoRepository,Mockito.times(1)).deleteById(endereco.getId());
    }
}