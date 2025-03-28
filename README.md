## 커뮤니티 게시판 애플리케이션

### 소개

이 프로젝트는 **SpringBoot Framework, MariaDB 등등..** 사용하여 개발된 프로젝트입니다.
사용자는 로그인 후 **새로운 커뮤니티를 생성**, **게시글을 작성**, **다른 사용자의 게시글을 조회**할 수 있습니다.

> **참고**: 본 프로젝트는 **Microsoft Visual Studio Code**에서 개발되었습니다.
> IntelliJ IDEA에서 실행할 경우 **호환성 문제가 발생할 가능성이 있습니다.**

### 기술 스택

- **Spring Boot**: 독립 실행형(Spring 기반) 애플리케이션을 빠르게 개발할 수 있는 프레임워크
- **MariaDB**: 게시판 데이터, 게시글 데이터, 회원정보 데이터 등등을 담기 위한 관계형 데이터베이스
- **JPA (Java Persistence API)**: 관계형 데이터 관리를 위한 ORM(Object Relational Mapping) 기술
- **Java 17**: 최신버전인 23를 사용하지 않고 안정화된 JDK를 사용 (JDK17의 경우 2027년 10월까지 지원됨)

### 핵심 기능

- **사용자 관리**: 회원 가입, 로그인, 로그아웃 기능, 사용자 프로필 수정 및 삭제
- **질문 관리**: 질문 작성, 조회, 수정, 삭제 기능
- **답변 관리**: 질문에 대한 답변 작성, 수정, 삭제 기능
- **동적 웹 페이지**: Thymeleaf를 활용하여 동적으로 콘텐츠를 생성
- **MariaDB 데이터베이스 관리**: 관계형 데이터베이스를 사용하여 데이터 저장, SQL 쿼리를 통해 데이터 확인 가능

---

## 📂 프로젝트 구조

```
src
├── main
│   ├── java
│   │   └── kr.co.ipdisk.dundunhsk.HSKsite
│   │       ├── controller      # Request & Response API Controll
│   │       ├── data		# MariaDB Table, DTO, EnumType
│   │       ├── repository      # Access & Handle DB
│   │       ├── service         # Data Processing
│   │       └── CommunityBoardApplication.java # Spring Boot 애플리케이션 진입점
│   ├── resources
│   │   ├── templates           # Thymeleaf 템플릿 파일 (프론트엔드 UI)
│   │   └── application.properties # 애플리케이션 설정 파일
│   │   ── data.sql             # 초기 데이터 로딩을 위한 SQL 스크립트
└── test                        # 단위 및 통합 테스트 코드
```

---

## 🚀 사용 방법

### 1) 커뮤니티 생성

- `커뮤니티 생성(Create Community)` 버튼을 클릭하여 새로운 커뮤니티를 생성할 수 있습니다.

### 2) 커뮤니티 목록 조회

- 생성된 커뮤니티 목록이 표시되며, 원하는 커뮤니티를 클릭하면 해당 커뮤니티의 게시글을 확인할 수 있습니다.

### 3) 게시글 작성

- `게시글 작성(Create Post)` 버튼을 클릭하여 새로운 게시글을 작성할 수 있습니다.

### 4) 게시글 조회 및 수정/삭제

- 게시글 제목을 클릭하면 상세 내용을 확인할 수 있으며,
  **게시글 수정 및 삭제** 기능도 제공합니다.

---
