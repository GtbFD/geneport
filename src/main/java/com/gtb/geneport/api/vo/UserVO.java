package com.gtb.geneport.api.vo;

import com.gtb.geneport.domain.entity.Address;

public record UserVO(String firstName, String lastName, String email, String password, String phoneNumber, Address address) {
}
