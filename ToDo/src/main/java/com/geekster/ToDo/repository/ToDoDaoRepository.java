package com.geekster.ToDo.repository;

import com.geekster.ToDo.Service.models.ToDo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoDaoRepository {
    private List<ToDo> todolist;

    public ToDoDaoRepository(){
        todolist = new ArrayList<>();
        //done for testing
        todolist.add(new ToDo("0","dummy to do for testing",false));
    }
    public List<ToDo> getTodosfromdatasources(){
       return todolist;
    }
    public Boolean save(ToDo todo){
        todolist.add(todo);
        return true;
    }
}
