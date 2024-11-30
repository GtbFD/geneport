package com.gtb.geneport.domain.dto;

import com.gtb.geneport.domain.entity.Address;

public record UserDTO(Long id, String firstName, String lastName, String email, String password, String phoneNumber, Address address) {
}
