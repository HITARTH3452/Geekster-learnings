package com.geekster.ToDo.Service;

import com.geekster.ToDo.Service.models.ToDo;
import com.geekster.ToDo.repository.ToDoDaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {
    List<ToDo> todolist;
    @Autowired
    ToDoDaoRepository toDoDaoRepository;

    public List<ToDo> getAllTodos() {
        return toDoDaoRepository.getTodosfromdatasources();
    }

    public String addMytodo(ToDo todo) {
        boolean insertionStatus = toDoDaoRepository.save(todo);
        if (insertionStatus) {
            return "Todo added successfully!!!!";
        } else {
            return "Failed!!!.....Todo Not Possible";
        }
    }

    public ToDo getTodobasedOnId(String id) {
        List<ToDo> todoListRightNOw = toDoDaoRepository.getTodosfromdatasources();

        for (ToDo todo : todoListRightNOw) {
            if (todo.getId().equals(id)) {
                return todo;
            }
        }
        return null;
    }
}


