package com.xxx.xplatform.model.dto.authentication;

import jakarta.validation.constraints.NotBlank;

public record LoginDTO(@NotBlank String username,
                       @NotBlank String email,
                       @NotBlank String password) {
}
