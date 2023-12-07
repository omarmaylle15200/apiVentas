package com.example.apiventas.apiventas.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<Pedido>> obtenerPedidos(@RequestParam("idTipoPedido") int idTipoPedido,
            @RequestParam("fechaInicio") String fechaInicio, @RequestParam("fechaFin") String fechaFin) {

        List<Pedido> pedidos = pedidoService.obtenerPedidos(idTipoPedido, fechaInicio, fechaFin);
        return ResponseEntity.ok(pedidos);
    }

    @GetMapping("/obtenerPedidoPorId")
    public ResponseEntity<Optional<Pedido>> obtenerPedidoPorId(@RequestParam("idPedido") int idPedido) {
        Optional<Pedido> pedido = pedidoService.obtenerPedidoPorId(idPedido);
        return ResponseEntity.ok(pedido);
    }

    @PostMapping("/registrar")
    public boolean registrar(@RequestBody Pedido Pedido) {
        return pedidoService.registrar(Pedido);
    }
}
