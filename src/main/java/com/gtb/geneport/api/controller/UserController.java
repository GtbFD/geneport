package com.gtb.geneport.api.controller;

import com.gtb.geneport.api.vo.UserVO;
import com.gtb.geneport.application.usecase.user.UserUsecase;
import com.gtb.geneport.domain.dto.UserDTO;
import com.gtb.geneport.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/v1/user/")
public class UserController {

    private final UserUsecase userUseCase;

    public UserController(UserUsecase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<UserVO> create(@RequestBody UserDTO userDTO){
        User user = userUseCase.create(userDTO);

        return ResponseEntity.ok(UserVO.transform(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                user.getPassword(), user.getPhoneNumber(), user.getGithubLink(), user.getLinkedinLink(),
                user.getDateOfBirth(), user.getAddress()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserVO> findById(@PathVariable Long id){
        User user = userUseCase.findById(id);
        if (user != null) {
            return ResponseEntity.ok(UserVO.transform(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                    user.getPassword(), user.getPhoneNumber(), user.getGithubLink(), user.getLinkedinLink(),
                    user.getDateOfBirth(), user.getAddress()));
        }
        return ResponseEntity.notFound().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<UserVO> update(@PathVariable Long id, @RequestBody UserDTO userDTO){
        User user = userUseCase.update(id, userDTO);
        if (user != null) {
            return ResponseEntity.ok(UserVO.transform(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail(),
                    user.getPassword(), user.getPhoneNumber(), user.getGithubLink(), user.getLinkedinLink(),
                    user.getDateOfBirth(), user.getAddress()));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        boolean response = userUseCase.delete(id);
        if (response) {
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }
}
