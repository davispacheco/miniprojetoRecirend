package com.modulo6.miniprojetoRecirend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "enderecos")
@Entity
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Logradouro deve ser preenchido.")
    @Column(nullable = false)
    private String logradouro;

    @NotBlank(message = "Bairro deve ser preenchido.")
    @Column(nullable = false)
    private String bairro;

    private String pontoReferencia;

    @NotBlank(message = "CEP deve ser preenchido.")
    @Column(nullable = false)
    private String cep;

    @NotBlank(message = "Cidade deve ser preenchida.")
    @Column(nullable = false)
    private String cidade;

    @NotBlank(message = "Estado deve ser preenchido.")
    @Column(nullable = false)
    private String estado;

    @NotNull(message = "Usuário deve ser preenchido.")
    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;
}
