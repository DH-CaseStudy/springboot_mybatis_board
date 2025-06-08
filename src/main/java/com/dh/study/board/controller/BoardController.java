package com.dh.study.board.controller;

import com.dh.study.board.dto.BoardDTO;
import com.dh.study.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/save")
    public String save() {
        return "save";
    }

    @PostMapping("save")
    public String save(BoardDTO boardDTO) {
        System.out.println("board DTO = " + boardDTO.toString());
        return "index";
    }
}
