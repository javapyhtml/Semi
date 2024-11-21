package com.icia.semi.dto;

// package 아래로 복붙

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UserDTO {

    private String UserId;                   // 회원 아이디
    private String UserPw;                   // 비밀번호
    private String UserName;                 // 이름
    private String UserBirth;                // 생년월일
    private String UserGender;               // 성별
    private String UserEmail;                // 이메일
    private String UserPhone;                // 전화번호
    private MultipartFile UserProfile;       // 프로필 사진 파일
    private String UserProfileName;          // 프로필 파일명

    public static UserDTO toDTO (UserEntity entity) {
        UserDTO dto = new UserDTO();

        dto.setUserId(entity.getUserId());
        dto.setUserPw(entity.getUserPw());
        dto.setUserName(entity.getUserName());
        dto.setUserBirth(entity.getUserBirth());
        dto.setUserGender(entity.getUserGender());
        dto.setUserEmail(entity.getUserEmail());
        dto.setUserPhone(entity.getUserPhone());
        dto.setUserProfileName(entity.getUserProfileName());

        return dto;
    }

}