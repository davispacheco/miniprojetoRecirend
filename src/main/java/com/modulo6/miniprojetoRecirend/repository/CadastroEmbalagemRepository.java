package com.modulo6.miniprojetoRecirend.repository;

import com.modulo6.miniprojetoRecirend.model.CadastroEmbalagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroEmbalagemRepository extends JpaRepository<CadastroEmbalagemModel,Long> {
}
