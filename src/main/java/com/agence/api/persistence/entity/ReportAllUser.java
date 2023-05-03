package com.agence.api.persistence.entity;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "ReportAllUsers")
public class ReportAllUser implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user", nullable = false, length = 20)
    private String user;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "period", length = 69)
    private String period;

    @Column(name = "net_earnings")
    private Double netEarnings;

    public Integer getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public String getPeriod() {
        return period;
    }

    public Double getNetEarnings() {
        return netEarnings;
    }

    protected ReportAllUser() {
    }
}