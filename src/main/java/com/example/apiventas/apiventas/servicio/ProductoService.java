package com.example.apiventas.apiventas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiventas.apiventas.entidad.Producto;
import com.example.apiventas.apiventas.mapper.ProductoMapper;

@Service
public class ProductoService {
    
    @Autowired
    ProductoMapper productoMapper;

    public List<Producto> obtenerProductos(int idCategoria){
        return productoMapper.obtenerProductos(idCategoria);
    }

    public Producto obtenerProductoPorId(int idProducto){
        return productoMapper.obtenerProductroPorId(idProducto);
    }

    public int registrar(Producto producto){
        return productoMapper.registrar(producto);
    }

    public int actualizar(Producto producto){
        return productoMapper.actualizar(producto);
    }

    public int habilitar(Producto producto){
        return productoMapper.habilitar(producto);
    }
}
