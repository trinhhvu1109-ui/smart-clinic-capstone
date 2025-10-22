package com.smartclinic.service;

import org.springframework.stereotype.Service;

@Service
public class TokenService {
    public String generateToken(String username) {
        return "token_" + username + "_123";
    }
}
