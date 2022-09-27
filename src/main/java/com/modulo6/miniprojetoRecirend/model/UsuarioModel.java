package com.modulo6.miniprojetoRecirend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
@Validated
@Getter
@Setter
@NoArgsConstructor
public class UsuarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String nomeUsuario;

    @Column(length = 11, nullable = false)
    private String cpf;

    @Column(length = 20, nullable = false)
    private String email;

    @Column(length = 20, nullable = false)
    private String senha;

    private Long pontuacao;

    public UsuarioModel(String nomeUsuario, String cpf, String email, String senha) {
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.email = email;
        this.senha = senha;
    }

    public void acrescimoPontuacao(){
        Long  pontuacaoTotal = getPontuacao()+1500;
        setPontuacao(pontuacaoTotal);
    }

}
