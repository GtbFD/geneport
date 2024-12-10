package com.gtb.geneport.api.vo;

import com.gtb.geneport.domain.entity.Address;

import java.time.LocalDate;

public record UserVO(Long id, String firstName, String lastName, String email, String password, String phoneNumber,
                     String githubLink, String linkedinLink, LocalDate dateOfBirth, Address address) {
    public static UserVO transform(Long id, String firstName, String lastName, String email, String password, String phoneNumber,
                                   String githubLink, String linkedinLink, LocalDate dateOfBirth, Address address) {
        return new UserVO(id, firstName, lastName, email, password, phoneNumber, githubLink, linkedinLink, dateOfBirth, address);
    }
}
