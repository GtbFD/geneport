package com.gtb.geneport.application.usecase.user;

import com.gtb.geneport.application.gateway.UserGateway;
import com.gtb.geneport.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserUsecase {

    private final UserGateway userGateway;

    public UserUsecase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User create(User user) {
        return userGateway.create(user);
    }

    public User findById(long id) {
        return userGateway.findById(id);
    }

    public User update(Long id, User user) {
        return userGateway.update(id, user);
    }
}
