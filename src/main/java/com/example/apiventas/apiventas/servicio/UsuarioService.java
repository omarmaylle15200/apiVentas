package com.example.apiventas.apiventas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiventas.apiventas.entidad.Producto;
import com.example.apiventas.apiventas.entidad.Usuario;
import com.example.apiventas.apiventas.mapper.UsuarioMapper;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioMapper usuarioMapper;

    public Usuario iniciarSesion(Usuario usuario){
        return usuarioMapper.iniciarSesion(usuario);
    }
     public List<Usuario> obtenerUsuarios(){
        return usuarioMapper.obtenerUsuarios();
    }

}
