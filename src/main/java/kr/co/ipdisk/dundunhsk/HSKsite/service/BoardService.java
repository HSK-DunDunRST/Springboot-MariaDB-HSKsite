package kr.co.ipdisk.dundunhsk.HSKsite.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.co.ipdisk.dundunhsk.HSKsite.common.ErrorResponse;
import kr.co.ipdisk.dundunhsk.HSKsite.common.ResponseUtil;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.ApiResponseDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.BoardRequestDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.BoardResponseDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.entitySet.BoardEntity;
import kr.co.ipdisk.dundunhsk.HSKsite.data.enumSet.ErrorType;
// import kr.co.ipdisk.dundunhsk.HSKsite.data.enumSet.ErrorType;
import kr.co.ipdisk.dundunhsk.HSKsite.repository.BoardRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardService {

    @Autowired
    private final BoardRepository boardRepository;
    
    @Transactional(readOnly = true)
    public ApiResponseDTO<List<BoardResponseDTO>> getBoardList() {
        List<BoardEntity> boardList = boardRepository.findAll();
        List<BoardResponseDTO> boardResponseList = new ArrayList<>();

        for(BoardEntity boardEntity : boardList){
            boardResponseList.add(BoardResponseDTO.of(boardEntity));
        }
        return ResponseUtil.ok(boardResponseList);
    }

    // ^ 게시판 생성
    @Transactional
    public ApiResponseDTO<BoardResponseDTO> createBoard(BoardRequestDTO boardRequestDTO){

        if(boardRepository.findByBoardTableName(boardRequestDTO.getBoardTableName()).isEmpty()){
            BoardEntity saveBoard = boardRepository.save(BoardEntity.of(boardRequestDTO));
            // * Debug 전용출력문
            return ResponseUtil.ok(BoardResponseDTO.of(saveBoard));
        } else {
            return ResponseUtil.error(ErrorResponse.of(ErrorType.DUPLICATED_TABLE));
        }
    }

    @Transactional
    public ApiResponseDTO<Optional<BoardEntity>> getByIdBoard(Long id){
        if( boardRepository.findById(id).isPresent()){
            return ResponseUtil.ok(boardRepository.findById(id));
        }else{
            return ResponseUtil.error(ErrorResponse.of(ErrorType.NOT_FOUND_BOARD));
        }
    
    }
}
