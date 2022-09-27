package com.modulo6.miniprojetoRecirend.DTO;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UsuarioDTO {
    @NotBlank(message = "Nome do usuário deve ser preenchido.")
    @Length(min = 4, max = 20, message = "Nome do usuário deve conter de {min} a {max} caracteres.")
    private String nomeUsuario;

    @NotBlank(message = "CPF deve ser preenchido.")
    @CPF(message = "CPF inválido.")
    private String cpf;

    @NotBlank(message = "E-mail deve ser preenchido.")
    @Email(message = "E-mail inválido.")
    private String email;

    @NotBlank(message = "Senha deve ser preenchida.")
    @Length(min = 8, max = 20, message = "Senha deve conter de {min} a {max} caracteres.")
    private String senha;

    public UsuarioModel converterParaObjeto() {
        return new UsuarioModel(nomeUsuario, cpf, email, senha);
    }
}
