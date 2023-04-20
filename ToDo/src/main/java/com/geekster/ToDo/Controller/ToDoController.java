package com.geekster.ToDo.Controller;

import com.geekster.ToDo.Service.models.ToDo;
import com.geekster.ToDo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    //get me all the todos in my present todo-List:
    @GetMapping(value = "/getTodos")
    public List<ToDo> getAllTodos(){
         return toDoService.getAllTodos();
    }

    @PostMapping(value = "/addTodo")
    public String addTodo(@RequestBody ToDo todo){
        return toDoService.addMytodo(todo);
    }
}
