package com.agence.api.domain.dto;

import lombok.Data;

import java.util.List;

@Data
public class ReportBarDTO {
    private String name;
    private List<AtributesBarDTO> data;
}
