package com.example.apiventas.apiventas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiventas.apiventas.entidad.Categoria;
import com.example.apiventas.apiventas.servicio.CategoriaService;

@CrossOrigin
@RestController
@RequestMapping("Categoria")
public class CategoriaController {
    
    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/obtenerCategorias")
    public List<Categoria> obtenerCategorias(){
        return categoriaService.obtenerCategorias();
    }
    
    @GetMapping("/obtenerCategoriaPorId")
    public Categoria obtenerCategoriaPorId(@RequestParam("idCategoria") int idCategoria){
        return categoriaService.obtenerCategoriaPorId(idCategoria);
    }

}
