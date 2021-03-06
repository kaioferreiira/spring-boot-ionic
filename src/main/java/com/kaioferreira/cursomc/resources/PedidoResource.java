package com.kaioferreira.cursomc.resources;

import com.kaioferreira.cursomc.domain.Pedido;
import com.kaioferreira.cursomc.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

    @Autowired
    private PedidoService pedidoService;

    @GetMapping(value="/{id}")
    public ResponseEntity <?> findById(@PathVariable Integer id){
        Pedido obj = pedidoService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
