package com.modulo6.miniprojetoRecirend.model;

import com.modulo6.miniprojetoRecirend.Enum.Marca;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "cadastro_de_embalagens")
@Validated
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CadastroEmbalagemModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @NotNull
    @Column(unique = true)
    private String numeroDeSerie;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Marca marca;

    @NotNull
    private LocalDate dataDoCadastro = LocalDate.now();

    @ManyToOne
    private UsuarioModel usuarioModel;
}
