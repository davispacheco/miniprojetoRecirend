package com.modulo6.miniprojetoRecirend.repository;

import com.modulo6.miniprojetoRecirend.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {
}
