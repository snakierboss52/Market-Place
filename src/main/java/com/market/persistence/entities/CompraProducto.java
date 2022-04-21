package com.market.persistence.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.servlet.mvc.condition.ProducesRequestCondition;

import javax.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private Compra compra;

    @ManyToOne
    @JoinColumn(name = "id_producto",insertable = false, updatable = false)
    private Producto producto;



}
