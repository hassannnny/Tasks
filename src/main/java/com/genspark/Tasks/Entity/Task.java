package com.genspark.Tasks.Entity;

public class Task {

    private int taskOrder;
    private String taskDescription;
    private String taskDueDate;

    public Task() {

    }

    public Task(int taskOrder, String taskDescription, String taskDueDate) {
        this.taskOrder = taskOrder;
        this.taskDescription = taskDescription;
        this.taskDueDate = taskDueDate;
    }


    public int getTaskOrder() {
        return taskOrder;
    }

    public void setTaskOrder(int taskOrder) {
        this.taskOrder = taskOrder;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskDueDate() {
        return taskDueDate;
    }

    public void setTaskDueDate(String taskDueDate) {
        this.taskDueDate = taskDueDate;
    }
}
