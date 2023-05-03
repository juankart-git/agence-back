package com.agence.api.persistence.mapper;

import com.agence.api.domain.dto.UserDTO;
import com.agence.api.persistence.entity.CaoUsuario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    @Mappings({
            @Mapping(source = "id", target = "user"),
            @Mapping(source = "noUsuario", target = "name")
    })
    UserDTO toUserDTO(CaoUsuario user);
    List<UserDTO> toUsersDTO(List<CaoUsuario> users);


}
