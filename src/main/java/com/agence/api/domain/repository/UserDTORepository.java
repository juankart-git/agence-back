package com.agence.api.domain.repository;

import com.agence.api.domain.dto.RevenueUserDTO;
import com.agence.api.domain.dto.UserDTO;

import java.util.List;

public interface UserDTORepository {
    List<UserDTO> getActiveUsers();
    List<RevenueUserDTO> getReportUsers(String user);
}
