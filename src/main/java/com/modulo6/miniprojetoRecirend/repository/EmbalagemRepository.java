package com.modulo6.miniprojetoRecirend.repository;

import com.modulo6.miniprojetoRecirend.model.EmbalagemModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmbalagemRepository extends JpaRepository<EmbalagemModel,Long> {

}
