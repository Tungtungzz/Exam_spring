package com.example.t2305m_springboot_exam.mapper;

import com.example.t2305m_springboot_exam.dto.req.UserReq;
import com.example.t2305m_springboot_exam.dto.res.UserRes;
import com.example.t2305m_springboot_exam.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserReq userReq);
    UserRes toDTO(User user);
}
