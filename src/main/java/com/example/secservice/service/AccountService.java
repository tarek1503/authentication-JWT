package com.example.secservice.service;

import com.example.secservice.DTO.AppRoleDTO;
import com.example.secservice.DTO.AppUserDTO;
import com.example.secservice.entities.AppRole;
import com.example.secservice.entities.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccountService {
    AppUser addNewUser(AppUserDTO appUserDTO);

    AppRole addNewRole(AppRoleDTO appRoleDTO);

    void addRoleToUser(String email, String roleName);

    AppUser loadUserByEmail(String email);

    AppUser loadUserByUsername(String username);

    List<AppUser> listUsers();

    List<AppRole> listRoles();


}
