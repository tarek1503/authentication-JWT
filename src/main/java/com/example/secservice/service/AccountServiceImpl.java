package com.example.secservice.service;

import com.example.secservice.DAO.AppRoleRepository;
import com.example.secservice.DAO.AppUserRepository;
import com.example.secservice.DTO.AppRoleDTO;
import com.example.secservice.DTO.AppUserDTO;
import com.example.secservice.entities.AppRole;
import com.example.secservice.entities.AppUser;
import com.example.secservice.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AppUserRepository appUserRepository;
    @Autowired
    private AppRoleRepository appRoleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public AppUser addNewUser(AppUserDTO appUserDTO) {
        String pw = appUserDTO.getPassword();
        appUserDTO.setPassword(passwordEncoder.encode(pw));
        return appUserRepository.save(Mapper.fromAppUserDTOToAppUser(appUserDTO));
    }

    @Override
    public AppRole addNewRole(AppRoleDTO appRoleDTO) {
        return appRoleRepository.save(Mapper.fromAppRoleDTOToAppRole(appRoleDTO));
    }

    @Override
    public void addRoleToUser(String email, String roleName) {
        AppUser appUser = appUserRepository.findAppUserByEmail(email);
        AppRole appRole = appRoleRepository.findAppRoleByRoleName(roleName);
        appUser.setRole(appRole);
    }

    @Override
    public AppUser loadUserByEmail(String email) {
        return appUserRepository.findAppUserByEmail(email);
    }

    @Override
    public AppUser loadUserByUsername(String username) {
        return appUserRepository.findAppUserByUsername(username);
    }


    @Override
    public List<AppUser> listUsers() {
        return appUserRepository.findAll();
    }

    @Override
    public List<AppRole> listRoles() {
        return appRoleRepository.findAll();
    }


}
