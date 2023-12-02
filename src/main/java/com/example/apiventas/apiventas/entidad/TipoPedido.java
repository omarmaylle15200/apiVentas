package com.example.apiventas.apiventas.entidad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TipoPedido {
    private int IdTipoPedido;
    private String NombreTipoPedido;
    private boolean EsActivo;
}
