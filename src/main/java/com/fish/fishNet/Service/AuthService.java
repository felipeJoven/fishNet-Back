package com.fish.fishNet.Service;

import com.fish.fishNet.dtos.DefaultResponseDto;
import com.fish.fishNet.dtos.ServiceResponseDto;
import com.fish.fishNet.dtos.DtoLogin;
import com.fish.fishNet.dtos.DtoRegistro;

public interface AuthService {
    ServiceResponseDto<DefaultResponseDto> login(DtoLogin dtoLogin);

    ServiceResponseDto<DefaultResponseDto> registerByRol(DtoRegistro dtoRegistro, String rol);
}
