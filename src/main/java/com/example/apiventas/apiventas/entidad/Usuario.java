package com.example.apiventas.apiventas.entidad;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Usuario {
    private int IdUsuario;
    private int IdTipoDocumento;
    private int IdPerfilUsuario;
    private String NumeroDocumento;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Email;
    private String Clave;
    private boolean EsActivo;
    private Date FechaRegistro;
    private Date FechaActualizacion;
}
