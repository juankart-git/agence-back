package com.agence.api.web.controller;

import com.agence.api.domain.dto.ReportBarDTO;
import com.agence.api.domain.dto.RevenueUserDTO;
import com.agence.api.domain.dto.UserDTO;
import com.agence.api.domain.service.UserService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/active-users")
    @ApiOperation("Get active users in database")
    @ApiResponse(code =200, message = "OK")
    public ResponseEntity<List<UserDTO>> getActiveUsers(){
        System.out.println("/active-users");
        return ResponseEntity.ok(service.getActiveUsers());
    }

    @GetMapping("/report-users/{user}")
    @ApiOperation("Get Report by selected users")
    @ApiResponse(code =200, message = "OK")
    public ResponseEntity<List<RevenueUserDTO>> getReportUsers(@PathVariable("user") String user){
        System.out.println("/report-users/" + user);
        return ResponseEntity.ok(service.getReportUsers(user));
    }

    @GetMapping("/report/{user}")
    @ApiOperation("Get Report by selected users ")
    @ApiResponse(code =200, message = "OK")
    public ResponseEntity<ReportBarDTO> getReport(@PathVariable("user") String user){
        System.out.println("/report-users/all");
        return ResponseEntity.ok(service.getReport(user));
    }

}
