package com.xxx.xplatform.model.dto.authentication;

public record TokenDTO(String token, String refreshToken, String username, Long expiresIn) {
}
