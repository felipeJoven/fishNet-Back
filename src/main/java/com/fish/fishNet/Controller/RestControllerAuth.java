package com.fish.fishNet.Controller;

import com.fish.fishNet.dtos.DefaultResponseDto;
import com.fish.fishNet.dtos.ServiceResponseDto;
import com.fish.fishNet.Service.AuthService;
import com.fish.fishNet.dtos.DtoLogin;
import com.fish.fishNet.dtos.DtoRegistro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/V1/auth/")
@CrossOrigin("*")
public class RestControllerAuth {
    @Autowired private AuthService authService;

    @PostMapping("register-user")
    public ResponseEntity<DefaultResponseDto> userRegister(@RequestBody DtoRegistro dtoRegistro) {
        ServiceResponseDto<DefaultResponseDto> response = this.authService.registerByRol(dtoRegistro, "USER");
        return new ResponseEntity<>(response.getMessage(), response.getStatus());
    }

    @PostMapping("register-admin")
    public ResponseEntity<DefaultResponseDto> registrarAdmin(@RequestBody DtoRegistro dtoRegistro) {
        ServiceResponseDto<DefaultResponseDto> response = this.authService.registerByRol(dtoRegistro, "ADMIN");
        return new ResponseEntity<>(response.getMessage(), response.getStatus());
    }

    @PostMapping("login")
    public ResponseEntity<DefaultResponseDto> login(@RequestBody DtoLogin dtoLogin) {
        ServiceResponseDto<DefaultResponseDto> response = authService.login(dtoLogin);
        return new ResponseEntity<>(response.getMessage(), response.getStatus());
    }
}
