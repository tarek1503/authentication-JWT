package com.example.secservice.Controllers;

import com.example.secservice.DTO.AppRoleDTO;
import com.example.secservice.entities.AppRole;
import com.example.secservice.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private AccountServiceImpl accountService;

    @PostMapping
    @PreAuthorize("hasAuthority('[\"ADMIN\"]')")

    public AppRole addRole(@RequestBody AppRoleDTO appRoleDTO) {
        return accountService.addNewRole(appRoleDTO);
    }

    @GetMapping
    public List<AppRole> findAllRoles() {
        return accountService.listRoles();
    }

}
