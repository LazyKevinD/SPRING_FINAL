package com.micropotro.Proyecto_ABCC_MySQL.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {

        if ("Ras".equals(request.getUsername()) &&
            "Acrobacia".equals(request.getPassword())) {

            return ResponseEntity.ok("Login correcto");
        }

        return ResponseEntity.status(401).body("Usuario o contraseña incorrectos");
    }

    public static class LoginRequest {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}