package com.agence.api.persistence.mapper;

import com.agence.api.domain.dto.RevenueUserDTO;
import com.agence.api.persistence.entity.ReportUser;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReportMapper {

    ReportMapper INSTANCE = Mappers.getMapper( ReportMapper.class );

    @Mappings({
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "user", target = "user"),
            @Mapping(source = "period", target = "period"),
            @Mapping(source = "costFixed", target = "costFixed"),
            @Mapping(source = "netEarnings", target = "netEarnings"),
            @Mapping(source = "profit", target = "profit"),
            @Mapping(source = "commission", target = "commission")
    })
    RevenueUserDTO toReportDTO(ReportUser user);
    List<RevenueUserDTO> toReportsDTO(List<ReportUser> users);


}
