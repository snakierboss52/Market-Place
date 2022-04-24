package com.market.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "compras_productos")
public class CompraProducto {

    @EmbeddedId //Llave compuesta
    private CompraProductoPK id;
    private Integer cantidad;
    private double total;
    private Boolean estado;

    @ManyToOne
    @MapsId("idCompra")
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto",insertable = false, updatable = false)
    private Producto producto;



}
