package com.modulo6.miniprojetoRecirend.model;

import com.modulo6.miniprojetoRecirend.Enum.Marca;
import lombok.*;
import javax.persistence.*;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "troca")
public class TrocaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trocaId;

    @Column(name = "Marca")
    @Enumerated(value = EnumType.STRING)
    private Marca marca ;

    @Column(length = 30, nullable = false)
    private String codigoEmbalagem;

    @Column(length = 15, nullable = false)
    private LocalDate dataDeCadastro;

}
