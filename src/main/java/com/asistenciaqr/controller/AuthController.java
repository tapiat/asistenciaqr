package com.asistenciaqr.controller;

import com.asistenciaqr.dto.LoginRequest;
import com.asistenciaqr.model.Usuario;
import com.asistenciaqr.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        return authService.login(request);
    }
}