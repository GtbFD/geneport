package com.gtb.geneport.infrastucture.mapper;

import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    private final AddressMapper addressMapper;

    public UserMapper(AddressMapper addressMapper) {
        this.addressMapper = addressMapper;
    }

    public User presentationToMap(UserPresentation userPresentation){
        return new User.Builder()
                .id(userPresentation.getId())
                .firstName(userPresentation.getFirstName())
                .lastName(userPresentation.getLastName())
                .email(userPresentation.getEmail())
                .password(userPresentation.getPassword())
                .phoneNumber(userPresentation.getPhoneNumber())
                .githubLink(userPresentation.getGithubLink())
                .linkedinLink(userPresentation.getLinkedinLink())
                .dateOfBirth(userPresentation.getDateOfBirth())
                .address(addressMapper.presentationToMap(userPresentation.getAddress()))
                .build();
    }

    public UserPresentation toPresentation(UserDTO userDTO){
        return new UserPresentation.Builder()
                .firstName(userDTO.firstName())
                .lastName(userDTO.lastName())
                .email(userDTO.email())
                .password(userDTO.password())
                .phoneNumber(userDTO.phoneNumber())
                .githubLink(userDTO.githubLink())
                .linkedinLink(userDTO.linkedinLink())
                .dateOfBirth(userDTO.dateOfBirth())
                .address(addressMapper.mapToPresentation(userDTO.address()))
                .build();
    }
}
