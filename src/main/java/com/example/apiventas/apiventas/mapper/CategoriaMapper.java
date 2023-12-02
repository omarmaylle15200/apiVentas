package com.example.apiventas.apiventas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.apiventas.apiventas.entidad.Categoria;

@Mapper
public interface CategoriaMapper {
    
    @Select("Select * from Categoria")
    public List<Categoria> obtenerCategorias();

    @Select("Select * from Categoria where idcategoria=#{idCategoria}")
    public Categoria obtenerCategoriaPorId(int idCategoria);

}
