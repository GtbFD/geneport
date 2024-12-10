package com.gtb.geneport.infrastucture.database;

import com.gtb.geneport.api.vo.UserVO;
import com.gtb.geneport.application.gateway.UserGateway;
import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import com.gtb.geneport.infrastucture.mapper.UserMapper;
import com.gtb.geneport.infrastucture.presentation.UserPresentation;
import com.gtb.geneport.infrastucture.repository.UserRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserDatabase implements UserGateway {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDatabase(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User create(UserDTO userDTO) {

        UserPresentation userPresentation = userMapper.toPresentation(userDTO);

        UserPresentation response = userRepository.save(userPresentation);

        User userResponse = userMapper.presentationToMap(response);

        return userResponse;
    }

    @Override
    public User findById(Long id) {
        Optional<UserPresentation> response = userRepository.findById(id);

        if (response.isPresent()){
            return userMapper.presentationToMap(response.get());
        }

        return null;
    }

    @Override
    public User update(Long id, UserDTO userDTO) {

        User fetchedUser = findById(id);

        User userResponse = null;
        if (fetchedUser != null) {
            UserPresentation updatedUser = userMapper.toPresentation(userDTO);
            updatedUser.setId(fetchedUser.getId());

            userResponse = userMapper.presentationToMap(updatedUser);
            userRepository.save(updatedUser);
        }

        return userResponse;
    }

    public boolean delete(Long id) {
        Optional<UserPresentation> response = userRepository.findById(id);

        if (response.isPresent()) {
            userRepository.delete(response.get());
            return true;
        }
        return false;
    }
}
