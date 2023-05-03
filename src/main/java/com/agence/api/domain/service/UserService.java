package com.agence.api.domain.service;

import com.agence.api.domain.dto.AtributesBarDTO;
import com.agence.api.domain.dto.ReportBarDTO;
import com.agence.api.domain.dto.RevenueUserDTO;
import com.agence.api.domain.dto.UserDTO;
import com.agence.api.domain.repository.UserDTORepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDTORepository repository;

    public List<UserDTO> getActiveUsers(){
        return repository.getActiveUsers();
    }

    public List<RevenueUserDTO> getReportUsers(String user){
        return repository.getReportUsers(user);
    }

    public ReportBarDTO getReport(String user) {
        List<RevenueUserDTO> data = new ArrayList<>();
        ReportBarDTO object = new ReportBarDTO();
        List<AtributesBarDTO> atributes = new ArrayList<>();
        object.setName(user);
        data = getReportUsers(user);
        for(RevenueUserDTO dataUser: data){
            AtributesBarDTO atribute = new AtributesBarDTO();
            atribute.setPeriod(dataUser.getPeriod());
            atribute.setNetEarnings(dataUser.getNetEarnings());
            atributes.add(atribute);
        }
        object.setData(atributes);
        return object;
    }
}
