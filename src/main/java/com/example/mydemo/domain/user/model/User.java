package com.example.mydemo.domain.user.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Schema(description = "사용자 엔티티")
public class User {

    @Schema(description = "사용자 ID", example = "1")
    private Long userId;

    @Schema(description = "이메일(로그인 ID)", example = "test@example.com")
    private String email;

    @Schema(description = "비밀번호(해시 값 저장)", example = "$2a$10$...")
    private String password;

    @Schema(description = "이름", example = "김지형")
    private String name;

    @Schema(description = "휴대폰 번호", example = "010-1234-5678")
    private String phone;

    @Schema(description = "역할 (ADMIN / DRIVER / CUSTOMER)", example = "CUSTOMER")
    private String role;

    @Schema(description = "가입일시")
    private LocalDateTime createdAt;
}
