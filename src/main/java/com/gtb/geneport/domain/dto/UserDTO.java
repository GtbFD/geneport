package com.gtb.geneport.domain.dto;

import com.gtb.geneport.domain.entity.Address;

import java.time.LocalDate;

public record UserDTO(String firstName, String lastName, String email, String password, String phoneNumber,
                      String githubLink, String linkedinLink, LocalDate dateOfBirth, Address address) {
}
