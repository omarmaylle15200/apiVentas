package com.example.apiventas.apiventas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiventas.apiventas.entidad.Pedido;
import com.example.apiventas.apiventas.servicio.PedidoService;

@CrossOrigin
@RestController
@RequestMapping("Pedido")
public class PedidoController {
    
    @Autowired
    PedidoService pedidoService;

    @GetMapping("/obtenerPedidos")
    public List<Pedido> obtenerPedidos(@RequestParam("idTipoPedido") int idTipoPedido,@RequestParam("fechaInicio") String fechaInicio,@RequestParam("fechaFin") String fechaFin){
        return pedidoService.obtenerPedidos(idTipoPedido,fechaInicio,fechaFin);
    }
    
    @GetMapping("/obtenerPedidoPorId")
    public Pedido obtenerPedidoPorId(@RequestParam("idPedido") int idPedido){
        return pedidoService.obtenerPedidoPorId(idPedido);
    }

    @PostMapping("/registrar")
    public boolean registrar(@RequestBody Pedido Pedido){
        return pedidoService.registrar(Pedido);
    }
}
