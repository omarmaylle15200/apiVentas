package com.example.apiventas.apiventas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.apiventas.apiventas.entidad.Pedido;

@Mapper
public interface PedidoMapper {
    
    @Select("Select * from Pedido where idtipopedido=#{idTipoPedido} and CAST(fecharegistro AS DATE) BETWEEN #{fechaInicio} AND #{fechaFin}")
    public List<Pedido> obtenerPedidos(int idTipoPedido,String fechaInicio, String fechaFin);

    @Select("Select * from Pedido where idPedido=#{idPedido}")
    public Pedido obtenerPedidoPorId(int idPedido);

     @Insert("insert into producto(NombreProducto,Precio,Stock,IdCategoria,IdUsuarioRegistro,IdUsuarioActualizacion) values(#{NombreProducto}, #{Precio}, #{Stock}, #{IdCategoria},#{IdUsuarioRegistro},#{IdUsuarioActualizacion})")
    public int registrar(Pedido pedido);

}
