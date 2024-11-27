package com.gtb.geneport.infrastucture.database;

import com.gtb.geneport.application.gateway.UserGateway;
import com.gtb.geneport.domain.entity.User;
import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import com.gtb.geneport.infrastucture.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserDatabase implements UserGateway {

    private final UserRepository userRepository;

    public UserDatabase(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User create(User user) {
        UserPresentation userPresentation = new UserPresentation();
        userPresentation.setFirstName(user.getFirstName());
        userPresentation.setLastName(user.getLastName());
        userPresentation.setEmail(user.getEmail());
        userPresentation.setPassword(user.getPassword());
        userPresentation.setPhoneNumber(user.getPhoneNumber());

        UserPresentation response = userRepository.save(userPresentation);

        User userResponse = new User();
        userResponse.setId(response.getId());
        userResponse.setFirstName(response.getFirstName());
        userResponse.setLastName(response.getLastName());
        userResponse.setEmail(response.getEmail());
        userResponse.setPassword(response.getPassword());
        userResponse.setPhoneNumber(response.getPhoneNumber());

        return userResponse;
    }
}
