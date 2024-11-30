package com.gtb.geneport.infrastucture.mapper;

import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public User presentationToMap(UserPresentation userPresentation){
        return new User.Builder()
                .id(userPresentation.getId())
                .firstName(userPresentation.getFirstName())
                .lastName(userPresentation.getLastName())
                .email(userPresentation.getEmail())
                .password(userPresentation.getPassword())
                .phoneNumber(userPresentation.getPhoneNumber())
                .build();
    }

    public UserPresentation toPresentation(UserDTO userDTO){
        return new UserPresentation.Builder()
                .id(null)
                .firstName(userDTO.firstName())
                .lastName(userDTO.lastName())
                .email(userDTO.email())
                .password(userDTO.password())
                .phoneNumber(userDTO.phoneNumber())
                .build();
    }
}
