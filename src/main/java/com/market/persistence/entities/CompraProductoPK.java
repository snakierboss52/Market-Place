package com.market.persistence.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Setter
@Getter
@Embeddable
public class CompraProductoPK implements Serializable {

    @Column(name = "id_producto")
    private Long idProducto;
    @Column(name = "id_compra")
    private Long idCompra;
}
