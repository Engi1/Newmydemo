package com.example.mydemo.domain.user.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(description = "회원 가입 요청 DTO")
public class CreateUserRequest {

    @Schema(description = "이메일", example = "user@example.com", required = true)
    private String email;

    @Schema(description = "비밀번호", example = "password123!", required = true)
    private String password;

    @Schema(description = "이름", example = "김지형", required = true)
    private String name;

    @Schema(description = "휴대폰 번호", example = "010-1234-5678")
    private String phone;
}
