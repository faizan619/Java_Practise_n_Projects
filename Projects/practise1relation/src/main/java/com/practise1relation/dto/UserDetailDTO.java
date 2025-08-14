package com.practise1relation.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserDetailDTO {
    private Long id;
    private String phoneNumber;
    private String city = "";
    private int age = 0;
    private double experience;
    private Long userId;

    public UserDetailDTO(String phoneNumber, String city, int age, double experience, Long userId) {
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.age = age;
        this.experience = experience;
        this.userId = userId;
    }

}
