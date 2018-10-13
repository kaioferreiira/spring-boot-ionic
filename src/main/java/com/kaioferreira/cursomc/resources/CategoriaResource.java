package com.kaioferreira.cursomc.resources;

import com.kaioferreira.cursomc.domain.Categoria;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @GetMapping
    public  List<Categoria> listar(){
        Categoria categoria1 = new Categoria(1, "informática");
        Categoria categoria2 = new Categoria(2, "escritorio");

        List<Categoria> categoriaList =  new ArrayList<>();
        categoriaList.add(categoria1);
        categoriaList.add(categoria2);

        return categoriaList;
    }
}
