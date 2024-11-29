package com.gtb.geneport.infrastucture.database;

import com.gtb.geneport.application.gateway.UserGateway;
import com.gtb.geneport.domain.entity.User;
import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import com.gtb.geneport.infrastucture.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

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

    @Override
    public User findById(Long id) {
        Optional<UserPresentation> response = userRepository.findById(id);

        if (response.isPresent()){

        return new User.Builder()
                .id(response.get().getId())
                .firstName(response.get().getFirstName())
                .lastName(response.get().getLastName())
                .email(response.get().getEmail())
                .password(response.get().getPassword())
                .phoneNumber(response.get().getPhoneNumber())
                .build();
        }

        return null;
    }

    @Override
    public User update(Long id, User user) {

        User fetchedUser = findById(id);

        User userResponse = null;
        if (fetchedUser != null) {

            UserPresentation updatedUser = new UserPresentation.Builder()
                    .id(fetchedUser.getId())
                    .firstName(user.getFirstName())
                    .lastName(user.getLastName())
                    .email(user.getEmail())
                    .password(user.getPassword())
                    .phoneNumber(user.getPhoneNumber())
                    .build();

            userResponse = new User.Builder()
                    .id(updatedUser.getId())
                    .firstName(updatedUser.getFirstName())
                    .lastName(updatedUser.getLastName())
                    .email(updatedUser.getEmail())
                    .password(updatedUser.getPassword())
                    .phoneNumber(updatedUser.getPhoneNumber())
                    .build();

            userRepository.save(updatedUser);

        }

        return userResponse;
    }


}
