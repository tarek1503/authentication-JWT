package com.example.secservice.mapper;

import com.example.secservice.DTO.AppRoleDTO;
import com.example.secservice.DTO.AppUserDTO;
import com.example.secservice.entities.AppRole;
import com.example.secservice.entities.AppUser;

public final class Mapper {
    public static AppRole fromAppRoleDTOToAppRole(AppRoleDTO appRoleDTO) {
        return AppRole.builder()
                .id(appRoleDTO.getId())
                .roleName(appRoleDTO.getRoleName())
                .build();
    }

    public static AppRoleDTO fromAppRoleToAppRoleDTO(AppRole appRole) {
        return AppRoleDTO.builder()
                .id(appRole.getId())
                .roleName(appRole.getRoleName())
                .build();
    }

    public static AppUser fromAppUserDTOToAppUser(AppUserDTO appUserDTO) {
        return AppUser.builder()
                .id(appUserDTO.getId())
                .username(appUserDTO.getUsername())
                .password(appUserDTO.getPassword())
                .email(appUserDTO.getEmail())
                .role(appUserDTO.getRole())
                .build();
    }

    public static AppUserDTO fromAppUserToAppUserDTO(AppUser appUser) {
        return AppUserDTO.builder()
                .id(appUser.getId())
                .username(appUser.getUsername())
                .password(appUser.getPassword())
                .email(appUser.getEmail())
                .role(appUser.getRole())
                .build();
    }
}
