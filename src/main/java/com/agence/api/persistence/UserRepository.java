package com.agence.api.persistence;

import com.agence.api.domain.dto.RevenueUserDTO;
import com.agence.api.domain.dto.UserDTO;
import com.agence.api.domain.repository.UserDTORepository;
import com.agence.api.persistence.crud.CaoUsuarioRepository;
import com.agence.api.persistence.crud.ReportUsersRepository;
import com.agence.api.persistence.entity.ReportUser;
import com.agence.api.persistence.mapper.ReportMapper;
import com.agence.api.persistence.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepository implements UserDTORepository {

    @Autowired
    private CaoUsuarioRepository userRepository;

    @Autowired
    private ReportUsersRepository reportRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public List<UserDTO> getActiveUsers() {
        return userMapper.toUsersDTO(userRepository.activeUsers());
    }

    @Override
    public List<RevenueUserDTO> getReportUsers(String user) {
        List<ReportUser> data = reportRepository.getRevenueByUser(user);
        return reportMapper.toReportsDTO(data);
    }

}
