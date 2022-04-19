package com.market.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "compras_productos")
public class CompraProducto {

    @EmbeddedId //Llave compuesta
    private CompraProductoPK id;
    private Integer cantidad;
    private BigDecimal total;
    private Boolean estado;


}
