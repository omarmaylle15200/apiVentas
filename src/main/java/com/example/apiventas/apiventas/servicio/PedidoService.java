package com.example.apiventas.apiventas.servicio;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiventas.apiventas.entidad.Pedido;
import com.example.apiventas.apiventas.entidad.PedidoDetalle;
import com.example.apiventas.apiventas.mapper.PedidoMapper;
import com.example.apiventas.apiventas.repositorio.PedidoRepository;

import jakarta.persistence.EntityManager;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> obtenerPedidos(int idTipoPedido, String fechaInicio, String fechaFin) {
        List<Pedido> pedidos = new ArrayList<>();
        try {
            pedidos = pedidoRepository.obtenerPedidos(idTipoPedido,fechaInicio,fechaFin);
        } catch (Error error) {
            System.err.println(error.getMessage());
        }
        return pedidos;
    }

    public Optional<Pedido> obtenerPedidoPorId(int idProducto) {
        return pedidoRepository.findById(idProducto);
    }

    public boolean registrar(Pedido pedido) {
        boolean response = false;
        try {

            String xmlDetalle = "<PedidoDetalle>";
            for (PedidoDetalle item : pedido.getPedidoDetalles()) {
                xmlDetalle = xmlDetalle.concat(String.format("<Producto idProducto='%d'cantidad='%d'></Producto>",
                        item.getIdProducto(), item.getCantidad()));
            }
            xmlDetalle = xmlDetalle.concat("</PedidoDetalle>");

            int r= pedidoRepository.registrar(pedido.getIdTipoPedido(), pedido.getIdUsuarioRegistro(), xmlDetalle);

            response = r==1?true:false;
        } catch (Exception error) {
            System.err.println(error.getMessage());
        }
        return response;
    }

}
