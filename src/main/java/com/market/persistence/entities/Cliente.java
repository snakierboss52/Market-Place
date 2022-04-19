package com.market.persistence.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private Long id;
    private String nombre;
    @Column(name = "apellidos")
    private String apelido;
    private Integer celular;
    private String direccion;
    @Column(name = "correo_electronico")
    private String correoElectronico;

}
