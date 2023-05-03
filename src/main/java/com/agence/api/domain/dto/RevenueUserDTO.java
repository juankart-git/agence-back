package com.agence.api.domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class RevenueUserDTO implements Serializable {
    private String name;
    private String user;
    private String period;
    private Double netEarnings;
    private Float costFixed;
    private Double commission;
    private Double profit;
}
