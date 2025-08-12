package com.xxx.xplatform.services.authentication;

import com.xxx.xplatform.model.dto.authentication.LoginDTO;
import com.xxx.xplatform.model.dto.authentication.TokenDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
    ResponseEntity<TokenDTO> login(@Valid LoginDTO loginDTO);
}
