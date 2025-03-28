package kr.co.ipdisk.dundunhsk.HSKsite.data.enumSet;

import lombok.Getter;

@Getter
public enum ErrorType {
    DUPLICATED_ID(400,"중복된 ID가 존재합니다."),
    NOT_WRITER(400,"작성자만 수정/삭제가 가능합니다."),
    NOT_FOUND_USER(400,"해당 유저를 찾을 수 없습니다."),
    NOT_FOUND_BOARD(400,"해당 게시판을 찾을 수 없습니다."),
    NOT_FOUND_POST(400,"해당 게시글을 찾을 수 없습니다."),
    NOT_FOUND_FILE(400,"해당 파일을 찾을 수 없습니다.");

    private int status;
    private String message;

    ErrorType(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
