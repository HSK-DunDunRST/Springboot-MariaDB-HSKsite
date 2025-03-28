package kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet;

import java.time.LocalDateTime;

import kr.co.ipdisk.dundunhsk.HSKsite.data.entitySet.BoardEntity;
import lombok.Getter;

@Getter
public class BoardResponseDTO {
    private Long id;
    private String boardTableName;
    private String boardName;
    private String boardDescription;
    private LocalDateTime boardCreateDate;

    private BoardResponseDTO(BoardEntity boardEntity){
        this.id = boardEntity.getId();
        this.boardTableName = boardEntity.getBoardTableName();
        this.boardName = boardEntity.getBoardName();
        this.boardDescription = boardEntity.getBoardDescription();
        this.boardCreateDate = boardEntity.getBoardCreateDate();
    }

    public static BoardResponseDTO of(BoardEntity boardEntity){
        return new BoardResponseDTO(boardEntity);
    }
}
