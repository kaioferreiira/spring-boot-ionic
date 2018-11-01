package com.kaioferreira.cursomc.repository;

import com.kaioferreira.cursomc.domain.Pagamento;
import com.kaioferreira.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
