package com.example.backend.service;

import com.example.backend.enums.Status;
import com.example.backend.model.Kanban;
import com.example.backend.repository.KanbanRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoService {
    private final KanbanRepo kanbanRepo;

    public TodoService(KanbanRepo kanbanRepo) {
        this.kanbanRepo = kanbanRepo;
    }

    public void addTodo(String todo){
        kanbanRepo.addTodo(todo);
    }

    public void addTodo(Kanban kanban){
        kanbanRepo.addTodo(kanban);
    }

    public List<Kanban> getTodos(){
        return kanbanRepo.getTodos();
    }

    public void updateTodo(Kanban kanban){

    kanbanRepo.updateTodo(kanban);


    }


    @Override
    public String toString() {
        return "TodoService{" +
                "kanbanRepo=" + kanbanRepo +
                '}';
    }
}
