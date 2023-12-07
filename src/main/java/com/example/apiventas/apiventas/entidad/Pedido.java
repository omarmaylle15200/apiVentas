package com.example.apiventas.apiventas.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "pedido")
public class Pedido implements Serializable{

    @Id
    @Column(name="IdPedido")
    private int IdPedido;

    private int IdUsuarioRegistro;
    private int IdUsuarioActualizacion;
    private Date FechaRegistro;
    private Date FechaActualizacion;
    private boolean EsActivo;
    private double Total;
    private int IdTipoPedido;

    @OneToMany(mappedBy = "Pedido", fetch = FetchType.LAZY)
    private List<PedidoDetalle> PedidoDetalles;
}
