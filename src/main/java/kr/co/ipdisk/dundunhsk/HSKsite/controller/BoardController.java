package kr.co.ipdisk.dundunhsk.HSKsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.ApiResponseDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.data.dtoSet.BoardResponseDTO;
import kr.co.ipdisk.dundunhsk.HSKsite.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/board")
@RequiredArgsConstructor
public class BoardController {

    @Autowired
    private final BoardService boardService;

    @GetMapping("/list")
    public ApiResponseDTO<List<BoardResponseDTO>> getBoardList() {
        return boardService.getBoardList();
    }

    
}
