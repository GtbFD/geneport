package com.gtb.geneport.api.controller;

import com.gtb.geneport.application.usecase.user.UserUsecase;
import com.gtb.geneport.domain.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserUsecase userUseCase;

    public UserController(UserUsecase userUseCase) {
        this.userUseCase = userUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok(userUseCase.create(user));
    }
}
