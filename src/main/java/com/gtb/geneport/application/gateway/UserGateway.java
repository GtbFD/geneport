package com.gtb.geneport.application.gateway;

import com.gtb.geneport.domain.entity.User;
import org.springframework.stereotype.Component;

public interface UserGateway {
    User create(User user);
    User findById(Long id);
}
