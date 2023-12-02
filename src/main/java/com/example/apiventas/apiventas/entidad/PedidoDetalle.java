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
public class PedidoDetalle {
    private int IdPedidoDetalle;
    private int IdPedido;
    private int IdProducto;
    private double Precio;
    private int Cantidad;
    private double SubTotal;
}
