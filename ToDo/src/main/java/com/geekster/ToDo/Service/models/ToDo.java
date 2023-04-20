package com.geekster.ToDo.Service.models;

public class ToDo {
    private String id;
    private String todoName;
    private Boolean todoStatus;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public ToDo(String id,String todoName, Boolean todoStatus) {
        this.id = id;
        this.todoName = todoName;
        this.todoStatus = todoStatus;
    }

    public void setTodoName(String todoName) {
        this.todoName = todoName;
    }

    public void setTodoStatus(Boolean todoStatus) {
        this.todoStatus = todoStatus;
    }

    public String getTodoName() {
        return todoName;
    }

    public Boolean getTodoStatus() {
        return todoStatus;
    }
}
