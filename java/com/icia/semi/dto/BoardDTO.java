package com.icia.semi.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;
@Data
public class BoardDTO {

    private int BNum;                       // 게시글 번호
    private String BType;                   // 게시글 유형 (자유, 아티스트 추천, 플레이리스트/노래 추천)
    private String BWriter;                 // 작성자
    private String BTitle;                  // 제목
    private String BContent;                // 내용
    private LocalDateTime BDate;            // 작성일
    private LocalDateTime BUpdateDate;      // 수정일
    private int BHit;                       // 조회수
    private int BLike;                      // 추천
    private int BDislike;                   // 비추천

    private MultipartFile BFile;            // 업로드될 음원 파일
    private String BFileName;               // 파일명

    public static BoardDTO toDTO (BoardEntity entity) {
        BoardDTO dto = new BoardDTO();

        dto.setBNum(entity.getBNum());
        dto.setBType(entity.getBType());
        dto.setBTitle(entity.getBTitle());
        dto.setBContent(entity.getBContent());
        dto.setBDate(entity.getBDate());
        dto.setBUpdateDate(entity.getBUpdateDate());
        dto.setBHit(entity.getBHit());
        dto.setBFileName(entity.getBFileName());
        dto.setBLike(entity.getBLike());
        dto.setBDislike(entity.getBDislike());

        // 작성자를 userId로 저장
        dto.setBWriter(entity.getUser().getUserId());

        return dto;
    }

}

