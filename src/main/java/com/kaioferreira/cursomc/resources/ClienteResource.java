package com.kaioferreira.cursomc.resources;

import com.kaioferreira.cursomc.domain.Categoria;
import com.kaioferreira.cursomc.domain.Cliente;
import com.kaioferreira.cursomc.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value="/{id}")
    public ResponseEntity <?> findById(@PathVariable Integer id){
        Cliente obj = clienteService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }
}
