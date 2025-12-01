package com.example.mydemo.domain.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.mydemo.domain.user.model.User;

@Mapper
public interface UserMapper {
    // 전체 조회
    List<User> findAll();
    // PK로 1명 조회
    User findById(@Param("userId") Long userId);
    // 회원 생성
    void insert(User user);
}