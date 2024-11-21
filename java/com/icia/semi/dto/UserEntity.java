package com.icia.semi.dto;

// package 아래로 복붙

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="USERT")
public class UserEntity {


    @Id
    private String userId;               // 회원 아이디, pk

    @Column
    private String UserPw;               // 비밀번호

    @Column
    private String UserName;            // 회원이름

    @Column
    private String UserBirth;            // 생년월일

    @Column
    private String UserGender;            // 성별

    @Column
    private String UserEmail;            // 이메일

    @Column(unique = true)
    private String UserPhone;            // 연락처

    @Column
    private String UserProfileName;      // 프로필 파일명

    // one id(PK) in USER can be referenced multiple times in USERBOARD table
    // 한 USERID가 여러 USERBOARD 데이터의 레퍼런스로 사용된다 (ex. id : user1 => user1.board1, user1.board2, user1.board3, etc...)
    @OneToMany(mappedBy="user")
    private List<BoardEntity> boards;

    // one id(PK) in USER can referenced multiple times in USERCOMMENTS table
    // 한 USERID가 여러 USERCOMMENT 데이터의 레퍼런스로 사용된다 (ex. id : user1 => user1.comment1, user1.comment2, user1.comment3, etc...)
    @OneToMany(mappedBy="user")
    private List<CommentEntity> comments;

    // one id(PK) in USER can referenced multiple times in PLAYLISTINFO table
    // 한 USERID가 여러 PLAYLISTINFO 데이터의 레퍼런스로 사용된다 (ex. id : user1 => user1.playlistinfo1, user1.playlistinfo2, user1.playlistinfo3, etc...)
    @OneToMany(mappedBy="user")
    private List<PlaylistInfoEntity> playlistInfo;

    // change dto data into entity data
    public static UserEntity toEntity(UserDTO dto) {
        UserEntity entity = new UserEntity();

        entity.setUserId(dto.getUserId());
        entity.setUserPw(dto.getUserPw());
        entity.setUserName(dto.getUserName());
        entity.setUserBirth(dto.getUserBirth());
        entity.setUserGender(dto.getUserGender());
        entity.setUserEmail(dto.getUserEmail());
        entity.setUserPhone(dto.getUserPhone());
        entity.setUserProfileName(dto.getUserProfileName());

        return entity;
    }

}
