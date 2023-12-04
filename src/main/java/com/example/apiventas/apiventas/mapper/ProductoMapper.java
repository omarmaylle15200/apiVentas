package com.example.apiventas.apiventas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.data.jpa.repository.EntityGraph;

import com.example.apiventas.apiventas.entidad.Producto;

@Mapper
public interface ProductoMapper {

    // @EntityGraph(attributePaths = {"Producto", "Categoria"})
    @Select("Select * from producto where idCategoria=if(#{idProducto}=0,idCategoria,#{idProducto})")
    public List<Producto> obtenerProductos(int idCategoria);

    @Select("Select * from producto where idProducto=#{idProducto}")
    public Producto obtenerProductroPorId(int idProducto);

    @Insert("insert into producto(NombreProducto,Precio,Stock,IdCategoria,IdUsuarioRegistro,IdUsuarioActualizacion) values(#{NombreProducto}, #{Precio}, #{Stock}, #{IdCategoria},#{IdUsuarioRegistro},#{IdUsuarioActualizacion})")
    public int registrar(Producto producto);

    @Update("update producto set NombreProducto=#{NombreProducto},Precio=#{Precio},Stock=#{Stock},IdCategoria=#{IdCategoria},FechaActualizacion=current_date(),IdUsuarioActualizacion=#{IdUsuarioActualizacion} where idProducto=#{idProducto}")
    public int actualizar(Producto producto);

    @Update("update producto set EsActivo=#{EsActivo},FechaActualizacion=current_date(),IdUsuarioActualizacion=#{IdUsuarioActualizacion} where idProducto=#{idProducto}")
    public int habilitar(Producto producto);
}
