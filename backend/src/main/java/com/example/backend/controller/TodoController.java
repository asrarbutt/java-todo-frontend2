package com.example.backend.controller;

import com.example.backend.model.Kanban;
import com.example.backend.service.TodoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;

    }


    @GetMapping("/todo")
    public List<Kanban> getTodos() {
        return todoService.getTodos();
    }


    @PostMapping(path = "/todo")
    public void addTodo(@RequestBody Kanban kanban) {

        todoService.addTodo(kanban);

    }


    @PutMapping(path = "/todo/{id}")
    public void updateStatus(@RequestBody Kanban kanban, @PathVariable String id) {


        todoService.updateTodo(kanban);
    }


    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable String id){

        todoService.deleteTodo(id);
    }

    @GetMapping("/todo/{id}")
    public Kanban getDateils(@PathVariable String id){
        return todoService.getDetails(id);
    }
}
