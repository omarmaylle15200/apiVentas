package com.example.apiventas.apiventas.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
// @Entity(name = "Categoria")
public class Categoria {
    // @Id
    private int IdCategoria;
    private String NombreCategoria;
    private boolean EsActivo;

    // @OneToMany(mappedBy = "Categoria", cascade = { CascadeType.ALL })
    // private List<Producto> Productos;
}
