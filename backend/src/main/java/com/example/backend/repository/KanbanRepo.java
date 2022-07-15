package com.example.backend.repository;

import com.example.backend.enums.Status;
import com.example.backend.model.Kanban;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class KanbanRepo {
    List<Kanban> todos=new ArrayList<>();


    public void addTodo(String todo){
        todos.add(new Kanban(todo, Status.OPEN));
    }



    public void addTodo(Kanban kanban){
        todos.add(kanban);
    }

    public List<Kanban> getTodos() {

        return todos;
    }

    public void setTodos(List<Kanban> todos) {
        this.todos = todos;
    }

    public void updateTodo(Kanban kanban){

      todos= todos.stream().map(e->{

                    if(e.getDescription().equals(kanban.getDescription())){
                        e.setStatus(Status.IN_PROGRESS);
                    }

                    return e;
                }
        ).collect(Collectors.toList());

        System.out.println(todos);


    }
}
