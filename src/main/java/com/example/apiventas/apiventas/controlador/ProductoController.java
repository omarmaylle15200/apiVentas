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

import com.example.apiventas.apiventas.entidad.Producto;
import com.example.apiventas.apiventas.servicio.ProductoService;

@CrossOrigin
@RestController
@RequestMapping("Producto")
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping("/obtenerProductos")
    public List<Producto> obtenerProductos(@RequestParam("idCategoria") int idCategoria){
        return productoService.obtenerProductos(idCategoria);
    }
    
    @GetMapping("/obtenerProductoPorId")
    public Producto obtenerProductoPorId(@RequestParam("idProducto") int idProducto){
        return productoService.obtenerProductoPorId(idProducto);
    }

    @PostMapping("/registrar")
    public int registrar(@RequestBody Producto producto){
        return productoService.registrar(producto);
    }

    @PutMapping("/actualizar")
    public int actualizar(@RequestBody Producto producto){
        return productoService.actualizar(producto);
    }

    @DeleteMapping("/habilitar")
    public int habilitar(@RequestBody Producto producto){
        return productoService.habilitar(producto);
    }
}
