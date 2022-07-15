package com.example.backend.controller;

import com.example.backend.model.Kanban;
import com.example.backend.service.TodoService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
        this.todoService.addTodo("wäsche");
    }


    @GetMapping("/todo")
    public List<Kanban> getTodos() {
        return todoService.getTodos();
    }


    @PostMapping(path = "/todo")
    public void addTodo(@RequestBody Kanban kanban) {
        System.out.println(kanban);
         todoService.addTodo(kanban);

    }


    @PutMapping(path = "/todo/{id}")
    public void updateStatus(@RequestBody Kanban kanban, @PathVariable int id ){

        id=123;
        todoService.updateTodo(kanban);
    }


    /*
    @PutMapping(path = "/todo?q=Todo")
    public void updateTodo(@RequestParam String todoparam, @RequestBody String todo){

        this.todoService.updateTodo(todoparam, kanban);

    }


     */







}
