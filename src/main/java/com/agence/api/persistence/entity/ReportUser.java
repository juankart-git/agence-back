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
@Table(name = "ReportUsers")
public class ReportUser implements Serializable {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "user")
    private String user;

    @Column(name = "period")
    private String period;

    @Column(name = "costFixed")
    private Float costFixed;

    @Column(name = "netEarnings")
    private Double netEarnings;

    @Column(name = "commission")
    private Double commission;

    @Column(name = "profit")
    private Double profit;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUser() {
        return user;
    }

    public String getPeriod() {
        return period;
    }

    public Float getCostFixed() {
        return costFixed;
    }

    public Double getNetEarnings() {
        return netEarnings;
    }

    public Double getCommission() {
        return commission;
    }

    public Double getProfit() {
        return profit;
    }

    protected ReportUser() {
    }
}