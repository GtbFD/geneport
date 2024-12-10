package com.gtb.geneport.application.usecase.user;

import com.gtb.geneport.api.vo.UserVO;
import com.gtb.geneport.application.gateway.UserGateway;
import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserUsecase {

    private final UserGateway userGateway;

    public UserUsecase(UserGateway userGateway) {
        this.userGateway = userGateway;
    }

    public User create(UserDTO userDTO) {
        return userGateway.create(userDTO);
    }

    public User findById(long id) {
        return userGateway.findById(id);
    }

    public User update(Long id, UserDTO userDTO) {
        return userGateway.update(id, userDTO);
    }

    public boolean delete(long id) {
        return userGateway.delete(id);
    }
}
