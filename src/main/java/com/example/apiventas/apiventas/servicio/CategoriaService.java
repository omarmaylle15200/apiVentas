package com.example.apiventas.apiventas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiventas.apiventas.entidad.Categoria;
import com.example.apiventas.apiventas.mapper.CategoriaMapper;

@Service
public class CategoriaService {
    
    @Autowired
    CategoriaMapper categoriaMapper;

    public List<Categoria> obtenerCategorias(){
        return categoriaMapper.obtenerCategorias();
    }

    public Categoria obtenerCategoriaPorId(int idCategoria){
        return categoriaMapper.obtenerCategoriaPorId(idCategoria);
    }

}
