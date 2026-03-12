package com.jobportal.controller;

import com.jobportal.dto.UserDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @PostMapping("/register")
    public ResponseEntity<UserDTO> registration(@RequestBody UserDTO userDTO){

        return ResponseEntity.ok(userDTO);
    }

    @GetMapping("/login")
    public String login(){
        return "Hii, Welcome to Job Portal App !";
    }



}
