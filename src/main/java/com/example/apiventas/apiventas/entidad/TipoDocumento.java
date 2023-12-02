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
public class TipoDocumento {
    public int IdTipoDocumento;
    public String CodigoTipoDocumento;
    public String NombreTipoDocumento;
    public boolean EsActivo;
}
