package com.example.apiventas.apiventas.entidad;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "pedidodetalle")
public class PedidoDetalle implements Serializable {
    @Id
    @Column(name="IdPedidoDetalle")
    private int IdPedidoDetalle;
    // private int IdPedido;
    private int IdProducto;
    private double Precio;
    private int Cantidad;
    private double SubTotal;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdPedido", nullable = false)
    @JsonIgnore
    private Pedido Pedido;
}
