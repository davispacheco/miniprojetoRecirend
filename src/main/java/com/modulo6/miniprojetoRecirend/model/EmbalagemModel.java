package com.modulo6.miniprojetoRecirend.model;

import com.modulo6.miniprojetoRecirend.Enum.Marca;
import com.modulo6.miniprojetoRecirend.Enum.PontosDeColeta;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
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
public class EmbalagemModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "o número de série deve ser preenchido")
    @Length@Length(min = 8,max = 8,message = "O número de série deve conter 8 caracteres.")
    @Column(unique = true)
    private String numeroDeSerie;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Marca marca;

    private LocalDate dataDoCadastro = LocalDate.now();

    @ManyToOne
    private UsuarioModel usuarioModel;
}
