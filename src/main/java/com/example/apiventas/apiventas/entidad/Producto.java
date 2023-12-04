package com.example.apiventas.apiventas.entidad;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
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
// @Entity(name = "Producto")
public class Producto {
    // @Id
    private int IdProducto;

    private String NombreProducto;
    private double Precio;
    private int Stock;
    // @Column(name = "IdCategoria")
    private int IdCategoria;

    // @ManyToOne(cascade=CascadeType.ALL)
    // @JoinTable(name = "Categoria",
    //         joinColumns = { @JoinColumn(name = "IdCategoria")})
    // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Categoria Categoria;
    
    private boolean EsActivo;
    private Date FechaRegistro;
    private Date FechaActualizacion;

    private int IdUsuarioActualizacion;
    private int IdUsuarioRegistro;
}
