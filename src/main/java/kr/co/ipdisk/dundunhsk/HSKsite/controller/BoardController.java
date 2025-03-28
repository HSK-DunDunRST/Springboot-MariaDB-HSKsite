package kr.co.ipdisk.dundunhsk.HSKsite.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import kr.co.ipdisk.dundunhsk.HSKsite.service.BoardService;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.ApiResponseDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.BoardRequestDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.BoardResponseDTO;

@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    private final BoardService boardService;

    //^ 게시판 조회 API (테스트용)
    @GetMapping("/list")
    public ApiResponseDTO<List<BoardResponseDTO>> getBoardList() {
        return boardService.getBoardList();
    }

     //^ 게시판 생성 API
    @PostMapping("/create")
    public ApiResponseDTO<BoardResponseDTO> createBoard(@RequestBody BoardRequestDTO boardRequestDTO) {
        return boardService.createBoard(boardRequestDTO);
    }

}
