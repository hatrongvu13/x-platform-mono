package com.xxx.xplatform.services.authentication;

import com.xxx.xplatform.model.dto.UserDTO;
import com.xxx.xplatform.model.dto.authentication.LoginDTO;
import com.xxx.xplatform.model.dto.authentication.TokenDTO;
import com.xxx.xplatform.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    @Override
    public ResponseEntity<TokenDTO> login(LoginDTO loginDTO) {
        return null;
    }

    private TokenDTO generateToken(UserDTO userDTO) {
        return new TokenDTO("","","",null);
    }
}
