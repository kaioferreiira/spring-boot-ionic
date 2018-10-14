package com.kaioferreira.cursomc.repository;

import com.kaioferreira.cursomc.domain.Categoria;
import com.kaioferreira.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
