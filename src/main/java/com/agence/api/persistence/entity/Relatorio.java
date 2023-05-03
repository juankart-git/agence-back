package com.agence.api.persistence.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
public class Relatorio {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "usuario", nullable = false, length = 20)
    private String usuario;

    @Column(name = "mes", length = 69)
    private String mes;

    @Column(name = "salario", nullable = false)
    private Float salario;

    @Column(name = "valor_factura", nullable = false)
    private Float valorFactura;

    @Column(name = "ganancia_neta")
    private Double gananciaNeta;

    @Column(name = "impuesto", nullable = false)
    private Float impuesto;

    @Column(name = "comision")
    private Double comision;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getMes() {
        return mes;
    }

    public Float getSalario() {
        return salario;
    }

    public Float getValorFactura() {
        return valorFactura;
    }

    public Double getGananciaNeta() {
        return gananciaNeta;
    }

    public Float getImpuesto() {
        return impuesto;
    }

    public Double getComision() {
        return comision;
    }

    protected Relatorio() {
    }
}