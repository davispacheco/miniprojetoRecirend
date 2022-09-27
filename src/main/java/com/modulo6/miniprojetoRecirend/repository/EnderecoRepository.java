package com.modulo6.miniprojetoRecirend.repository;

import com.modulo6.miniprojetoRecirend.model.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel,Long> {
}
