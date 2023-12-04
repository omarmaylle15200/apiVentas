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
import com.example.apiventas.apiventas.entidad.Usuario;
import com.example.apiventas.apiventas.servicio.UsuarioService;

@CrossOrigin
@RestController
@RequestMapping("Usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/iniciarSesion")
    public Usuario iniciarSesion(@RequestBody Usuario Usuario) {
        return usuarioService.iniciarSesion(Usuario);
    }

    @GetMapping("/obtenerUsuarios")
    public List<Usuario> obtenerUsuarios() {
        return usuarioService.obtenerUsuarios();
    }
}
