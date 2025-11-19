package com.example.mydemo.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Hello API", description = "Swagger 테스트용 컨트롤러")
@RestController
@RequestMapping("/api")
public class HelloController {

    @Operation(
            summary = "헬로 메시지 조회",
            description = "Swagger 연동이 잘 되는지 확인하기 위한 테스트 API"
    )
    @GetMapping("/hello")
    public String hello() {
        return "Hello Swagger + Spring Boot!";
    }
}
