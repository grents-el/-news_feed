package com.org.example.controllers;

import com.org.example.dto.CommentDto;
import com.org.example.services.CommentCRUDServise;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/comment")
public class CommentController {
    private final CommentCRUDServise commenServise;
    public CommentController(CommentCRUDServise commenServise){
        this.commenServise=commenServise;
    }

    @GetMapping("/{id}")
    public CommentDto getCommentById(@PathVariable Integer id){
        return commenServise.getById(id);
    }

    @GetMapping
    public Collection<CommentDto> getAllComments(){
        return commenServise.getAll();
    }

    @PostMapping
    public void createComment(@RequestBody CommentDto commentDto) {
        commenServise.create(commentDto);
    }

    @PutMapping("/{id}")
    public void updateComment(@PathVariable Integer id, @RequestBody CommentDto commentDto){
        commenServise.update(id, commentDto);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Integer id){
        commenServise.delete(id);
    }
}
