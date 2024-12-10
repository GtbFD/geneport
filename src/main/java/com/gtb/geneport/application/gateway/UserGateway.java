package com.gtb.geneport.application.gateway;

import com.gtb.geneport.api.vo.UserVO;
import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import org.springframework.stereotype.Component;

public interface UserGateway {
    User create(UserDTO user);
    User findById(Long id);
    User update(Long id, UserDTO user);
    boolean delete(Long id);
}
