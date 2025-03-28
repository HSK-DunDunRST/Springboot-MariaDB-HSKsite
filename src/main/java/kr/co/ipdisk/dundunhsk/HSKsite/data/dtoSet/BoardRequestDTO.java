package kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet;

import java.time.LocalDate;
import lombok.Getter;

@Getter
public class BoardRequestDTO {
    private long id;
    private String boardTableName;
    private String boardName;
    private String boardDescription;
    private LocalDate boardCreateDate;
}
