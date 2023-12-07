package com.example.apiventas.apiventas.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import com.example.apiventas.apiventas.entidad.Pedido;

@Mapper
public interface PedidoMapper {

    @Select("Select * from Pedido where idtipopedido=#{idTipoPedido} and CAST(fecharegistro AS DATE) BETWEEN #{fechaInicio} AND #{fechaFin}")
    public List<Pedido> obtenerPedidos(int idTipoPedido, String fechaInicio, String fechaFin);

    @Select("Select * from Pedido where idPedido=#{idPedido}")
    public Pedido obtenerPedidoPorId(int idPedido);

    @Select(value = "{ CALL usp_registrarPedido( #{idTipoPedido, mode=IN, jdbcType=INTEGER},#{idUsuarioRegistro, mode=IN, jdbcType=INTEGER}, #{xmlDetalle, mode=IN, jdbcType=VARCHAR})}")
    @Options(statementType = StatementType.CALLABLE)
    public void registrar(Pedido pedido,String xmlDetalle );

}
