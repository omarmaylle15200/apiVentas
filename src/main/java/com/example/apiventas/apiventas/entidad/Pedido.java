package com.example.apiventas.apiventas.entidad;

import java.util.Date;

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
public class Pedido {
    private int IdPedido;
    private int IdTipoPedido;
    private int IdUsuarioRegistro;
    private int IdUsuarioActualizacion;
    private Date FechaRegistro;
    private Date FechaActualizacion;
    private boolean EsActivo;
}
