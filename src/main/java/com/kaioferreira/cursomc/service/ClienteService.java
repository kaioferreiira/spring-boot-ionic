package com.kaioferreira.cursomc.service;

import com.kaioferreira.cursomc.domain.Categoria;
import com.kaioferreira.cursomc.domain.Cliente;
import com.kaioferreira.cursomc.repository.CategoriaRepository;
import com.kaioferreira.cursomc.repository.ClienteRepository;
import com.kaioferreira.cursomc.service.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar(Integer id){
        Optional<Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
    }

}
