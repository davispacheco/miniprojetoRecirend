package com.modulo6.miniprojetoRecirend.model;

import com.modulo6.miniprojetoRecirend.enumeration.Marca;
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
@Table(name = "embalagens")
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
    @Length(min = 8, max = 8, message = "O número de série deve conter 8 caracteres.")
    @Column(unique = true)
    private String numeroDeSerie;

    @NotNull(message = "Marca deve ser preenchida.")
    @Enumerated(EnumType.STRING)
    private Marca marca;

    private LocalDate dataDoCadastro;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private UsuarioModel usuario;
}
