package com.xxx.xplatform.model.dto;

import com.xxx.xplatform.enums.UserStatus;

import java.time.LocalDateTime;

public record UserDTO(
        Long id,
        String createdBy,
        String updatedBy,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        String username,
        String nickname,
        String email,
        String phone,
        String avatar,
        UserStatus status
) {
}
