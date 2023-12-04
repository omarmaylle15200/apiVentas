package com.example.apiventas.apiventas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiventas.apiventas.entidad.Pedido;
import com.example.apiventas.apiventas.mapper.PedidoMapper;

@Service
public class PedidoService {

    @Autowired
    PedidoMapper pedidoMapper;

    public List<Pedido> obtenerPedidos(int idTipoPedido,String fechaInicio, String fechaFin) {
        return pedidoMapper.obtenerPedidos(idTipoPedido,fechaInicio,fechaFin);
    }

    public Pedido obtenerPedidoPorId(int idProducto) {
        return pedidoMapper.obtenerPedidoPorId(idProducto);
    }

    public boolean registrar(Pedido pedido) {
        boolean response = false;
        try {
            int r = pedidoMapper.registrar(pedido);
            System.err.println(r);
        } catch (Exception error) {
            System.err.println(error.getMessage());
        }
        return response;
    }

}
