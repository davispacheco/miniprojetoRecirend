package com.modulo6.miniprojetoRecirend.repository;

import com.modulo6.miniprojetoRecirend.model.TrocaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrocaRepository extends JpaRepository <TrocaModel, Long> {
    Object findAll(List<TrocaModel> listTroca);
}
