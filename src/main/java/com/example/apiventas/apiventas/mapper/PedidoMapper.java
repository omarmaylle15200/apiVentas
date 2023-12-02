package com.example.apiventas.apiventas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.apiventas.apiventas.entidad.Pedido;

@Mapper
public interface PedidoMapper {
    
    @Select("Select * from Pedido")
    public List<Pedido> obtenerPedidos();

    @Select("Select * from Pedido where idPedido=#{idPedido}")
    public Pedido obtenerPedidoPorId(int idPedido);

}
