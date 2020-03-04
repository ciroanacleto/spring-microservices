package com.spring.microservices.authserver.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/")
public class AuthController {

    @RequestMapping("/user")
    public ResponseEntity<Principal> getCurrentLoggedInUser(Principal user) {
        return ResponseEntity.ok(user);
    }
}
