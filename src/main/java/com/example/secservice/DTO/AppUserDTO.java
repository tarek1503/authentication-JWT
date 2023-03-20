package com.example.secservice.DTO;

import com.example.secservice.entities.AppRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class AppUserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private AppRole role;

}
