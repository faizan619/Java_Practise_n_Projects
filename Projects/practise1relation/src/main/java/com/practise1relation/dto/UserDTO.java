package com.practise1relation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDTO {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullName;
    private String role = "USER";
    private Long departmentId;

    public UserDTO(String username, String password, String email, String fullName, String role, Long departmentId) {
        this.username = username;
        this.password = password;
        this.email = email; 
        this.fullName = fullName;
        this.role = role;
        this.departmentId = departmentId;
    }

}
