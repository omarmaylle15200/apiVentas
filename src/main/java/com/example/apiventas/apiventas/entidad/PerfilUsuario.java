package com.example.apiventas.apiventas.entidad;

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
public class PerfilUsuario {
    private int IdPerfilUsuario;
    private String NombrePerfilUsuario;
    private boolean EsActivo;
}
