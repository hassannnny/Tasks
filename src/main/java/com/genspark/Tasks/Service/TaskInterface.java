package com.genspark.Tasks.Service;

import com.genspark.Tasks.Entity.Task;

import java.util.List;

public interface TaskInterface {

    List<Task> getAllTasks();
    List<Task> addAtask(Task task);
    List<Task> editATask(int taskOrder);
    List<Task> deleteATask(int taskOrder);

}
