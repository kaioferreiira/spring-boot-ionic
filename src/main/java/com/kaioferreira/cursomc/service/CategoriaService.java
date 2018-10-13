package com.kaioferreira.cursomc.service;

import com.kaioferreira.cursomc.domain.Categoria;
import com.kaioferreira.cursomc.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria buscar(Integer id){
       Optional <Categoria> objCategoria =  categoriaRepository.findById(id);
        return objCategoria.orElse(null) ;
    }

}
