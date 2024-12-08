package com.gtb.geneport.infrastucture.mapper;

import com.gtb.geneport.domain.entity.Address;
import com.gtb.geneport.infrastucture.presentation.AddressPresentation;
import org.springframework.stereotype.Component;

@Component
public class AddressMapper {

    public Address presentationToMap(AddressPresentation addressPresentation) {
        return new Address.Builder()
                .street(addressPresentation.getStreet())
                .district(addressPresentation.getDistrict())
                .city(addressPresentation.getCity())
                .state(addressPresentation.getState())
                .zip(addressPresentation.getZip())
                .number(addressPresentation.getNumber())
                .build();
    }

    public AddressPresentation mapToPresentation(Address address) {
        return new AddressPresentation.Builder()
                .setStreet(address.getStreet())
                .setDistrict(address.getDistrict())
                .setCity(address.getCity())
                .setState(address.getState())
                .setZip(address.getZip())
                .setNumber(address.getNumber())
                .build();
    }
}
