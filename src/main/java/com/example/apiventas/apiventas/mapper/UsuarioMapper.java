package com.example.apiventas.apiventas.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;

import com.example.apiventas.apiventas.entidad.Usuario;

@Mapper
public interface UsuarioMapper {
    
    @Select("Select * from Usuario where numerodocumento=#{NumeroDocumento} and clave=#{Clave} limit 1")
    public Usuario iniciarSesion(Usuario usuario);

    @Select("Select * from Usuario")
    public List<Usuario> obtenerUsuarios();
}
