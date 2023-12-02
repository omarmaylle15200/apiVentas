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

    public List<Pedido> obtenerPedidos(){
        return pedidoMapper.obtenerPedidos();
    }

    public Pedido obtenerProductoPorId(int idProducto){
        return pedidoMapper.obtenerPedidoPorId(idProducto);
    }

}
