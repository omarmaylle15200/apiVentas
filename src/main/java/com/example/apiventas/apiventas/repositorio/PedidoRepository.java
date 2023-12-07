package com.example.apiventas.apiventas.repositorio;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.apiventas.apiventas.entidad.Pedido;

import jakarta.transaction.Transactional;

@EnableJpaRepositories
@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {


    @Query(value = "select * from pedido where idtipopedido=:idTipoPedido and cast(fecharegistro as date) between :fechaInicio and :fechaFin", nativeQuery = true)
    public List<Pedido> obtenerPedidos(@Param("idTipoPedido") int _idTipoPedido,
            @Param("fechaInicio") String fechaInicio, @Param("fechaFin") String fechaFin);

    @Transactional
    @Query(value = "{call usp_registrarPedido(:_idTipoPedido,:_idUsuarioRegistro,:_detalleXml)}", nativeQuery = true)
    public int registrar(@Param("_idTipoPedido") int _idTipoPedido,
            @Param("_idUsuarioRegistro") int _idUsuarioRegistro, @Param("_detalleXml") String _detalleXml);
}
