# Semi

project/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.example.project/    # 패키지 디렉토리
│   │   │   │   ├── controllers/         # 컨트롤러 클래스
│   │   │   │   │   ├── BasicController.java       // 기본 기능 컨트롤러
│   │   │   │   │   ├── BoardController.java       // 게시판 관련 컨트롤러
│   │   │   │   │   ├── CommentController.java     // 댓글 관리 컨트롤러
│   │   │   │   │   ├── PageMoveController.java    // 페이지 이동 처리
│   │   │   │   │   ├── PlaylistController.java    // 재생목록 관리 컨트롤러
│   │   │   │   │   ├── RestfulController.java     // RESTful API 처리
│   │   │   │   │   ├── SearchController.java      // 검색 요청 처리
│   │   │   │   │   ├── UrlRedirectController.java // URL 리다이렉션 처리
│   │   │   │   │   ├── UserController.java        // 사용자 관리 컨트롤러
│   │   │   │   ├── dao/                  # 데이터 접근 계층
│   │   │   │   │   ├── ArtistDetailDAO.java       // 아티스트 데이터 접근 클래스
│   │   │   │   │   ├── BoardRepository.java       // 게시판 데이터 저장소
│   │   │   │   │   ├── CommentRepository.java     // 댓글 데이터 저장소
│   │   │   │   │   ├── MusicDetailDAO.java        // 음악 세부정보 접근 클래스
│   │   │   │   │   ├── PlaylistDAO.java           // 재생목록 데이터 접근 클래스
│   │   │   │   │   ├── PlaylistInfoDAO.java       // 재생목록 정보 데이터 접근
│   │   │   │   │   ├── UserDAO.java               // 사용자 데이터 접근 클래스
│   │   │   │   ├── dto/                  # 데이터 전송 객체 및 엔티티
│   │   │   │   │   ├── ArtistDetailDTO.java       // 아티스트 상세 데이터 전송 객체
│   │   │   │   │   ├── ArtistDetailEntity.java    // 아티스트 상세 데이터 엔티티
│   │   │   │   │   ├── BoardDTO.java              // 게시판 데이터 전송 객체
│   │   │   │   │   ├── BoardEntity.java           // 게시판 데이터 엔티티
│   │   │   │   │   ├── CommentDTO.java            // 댓글 데이터 전송 객체
│   │   │   │   │   ├── CommentEntity.java         // 댓글 데이터 엔티티
│   │   │   │   │   ├── MusicDetailDTO.java        // 음악 세부 데이터 전송 객체
│   │   │   │   │   ├── MusicDetailEntity.java     // 음악 세부 데이터 엔티티
│   │   │   │   │   ├── PlaylistDTO.java           // 재생목록 데이터 전송 객체
│   │   │   │   │   ├── PlaylistEntity.java        // 재생목록 데이터 엔티티
│   │   │   │   │   ├── PlaylistInfoDTO.java       // 재생목록 정보 데이터 전송 객체
│   │   │   │   │   ├── PlaylistInfoEntity.java    // 재생목록 정보 데이터 엔티티
│   │   │   │   │   ├── SearchDTO.java             // 검색 데이터 전송 객체
│   │   │   │   │   ├── UserDTO.java               // 사용자 데이터 전송 객체
│   │   │   │   │   ├── UserEntity.java            // 사용자 데이터 엔티티
│   │   │   │   ├── services/             # 서비스 계층
│   │   │   │   │   ├── ArtistService.java         // 아티스트 관련 서비스
│   │   │   │   │   ├── BoardService.java          // 게시판 관련 서비스
│   │   │   │   │   ├── CommentService.java        // 댓글 관리 서비스
│   │   │   │   │   ├── MusicService.java          // 음악 관리 서비스
│   │   │   │   │   ├── PlaylistService.java       // 재생목록 관리 서비스
│   │   │   │   │   ├── SearchService.java         // 검색 서비스
│   │   │   │   │   ├── UserService.java           // 사용자 관리 서비스
│   │   │   ├── resources/
│   │   │   │   ├── application.properties         // 환경 설정 파일
│   │   │   │   ├── static/                        # 정적 파일(css, js 등)
│   │   │   │   ├── templates/                     # HTML 템플릿 파일
│   │   │   │   │   ├── boardheader.html
│   │   │   │   │   ├── footer.html
│   │   │   │   │   ├── header.html
│   │   │   │   │   ├── index.html
│   │   │   │   │   ├── playlist.html
│   │   │   │   │   ├── test.html
│   │   │   │   │   ├── board/                     # 게시판 관련 템플릿
│   │   │   │   │   │   ├── list.html
│   │   │   │   │   │   ├── view.html
│   │   │   │   │   │   ├── write.html
│   │   │   │   │   ├── music/                     # 음악 관련 템플릿
│   │   │   │   │   │   ├── artistinfo.html
│   │   │   │   │   │   ├── playlistinfo.html
│   │   │   │   │   ├── top/                       # 장르별 TOP 50
│   │   │   │   │   │   ├── balledtop50.html
│   │   │   │   │   │   ├── bandtop50.html
│   │   │   │   │   │   ├── dancetop50.html
│   │   │   │   │   │   ├── hiphoptop50.html
│   │   │   │   │   │   ├── indietop50.html
│   │   │   │   │   │   ├── poptop50.html
│   │   │   │   │   │   ├── rbtop50.html
│   │   │   │   │   │   ├── trotop50.html
│   │   │   │   │   ├── user/                      # 사용자 관련 템플릿
│   │   │   │   │   │   ├── join.html
│   │   │   │   │   │   ├── login.html
│   │   │   │   │   │   ├── modlogin.html
│   │   │   │   │   │   ├── mypage.html
├── .gitignore                   # Git 무시 파일 목록
├── README.md                    # 프로젝트 개요 및 사용법
