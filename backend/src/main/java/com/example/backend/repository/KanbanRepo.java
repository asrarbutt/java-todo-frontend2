package com.example.backend.repository;

import com.example.backend.enums.Status;
import com.example.backend.model.Kanban;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository
public class KanbanRepo {
    //List<Kanban> todos=new ArrayList<>();
    Map<String, Kanban> todos=new HashMap<>();






    public void addTodo(Kanban kanban){
        todos.put(kanban.getId(), kanban);

    }

    public List<Kanban> getTodos() {

        return new ArrayList<>(todos.values());
    }

    public void setTodos(Map<String, Kanban> todos) {
        this.todos = todos;
    }

    public void updateTodo(Kanban kanban){

        todos.put(kanban.getId(), kanban);

         /*
      todos= todos.stream().map(e->{

                    if(e.getDescription().equals(kanban.getDescription())){
                        e.setStatus(Status.IN_PROGRESS);
                    }

                    return e;
                }
        ).collect(Collectors.toList());

      */




    }

    public void deleteTodo(String id) {

        todos.remove(id);
    }

    public Kanban getDetails(String id) {
       return todos.get(id);
    }
}
