package com.modulo6.miniprojetoRecirend.model;

import com.modulo6.miniprojetoRecirend.enumeration.PontosDeColeta;
import com.modulo6.miniprojetoRecirend.enumeration.ProdutosTroca;
import lombok.*;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Validated
@Data
@Entity
@Table(name = "troca")
public class TrocaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trocaId;

    @NotNull
    @Enumerated(EnumType.STRING)
    private ProdutosTroca produto;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PontosDeColeta pontosDeColeta;


    @Column(length = 15, nullable = false)
    private LocalDate dataDeCadastro = LocalDate.now();

    @ManyToOne
    private UsuarioModel usuarioModel;

}
