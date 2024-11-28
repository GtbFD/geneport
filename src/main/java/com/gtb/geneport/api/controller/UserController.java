package com.gtb.geneport.api.controller;

import com.gtb.geneport.application.usecase.user.UserUsecase;
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
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok(userUseCase.create(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok(userUseCase.findById(id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable Long id, @RequestBody User user){
        return ResponseEntity.ok(userUseCase.update(id, user));
    }
}
