package com.example.backend.repository;

import com.example.backend.enums.Status;
import com.example.backend.model.Kanban;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class KanbanRepoTest {

    @Test
    void addTodo() {
        //Given
        KanbanRepo kanbanRepo=new KanbanRepo();


        //when
        List<Kanban> expected=List.of(new Kanban("Sport machen", Status.OPEN)
                , new Kanban("Wäsche waschen", Status.OPEN));
      List<Kanban> actual= kanbanRepo.getTodos();

      //then
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getTodos() {

        //Given
        KanbanRepo kanbanRepo=new KanbanRepo();


        //when
        List<Kanban> expected=List.of(new Kanban("Sport machen", Status.OPEN)
                , new Kanban("Wäsche waschen", Status.OPEN));
        List<Kanban> actual= kanbanRepo.getTodos();

        //then
        Assertions.assertEquals(expected, actual);


    }
}