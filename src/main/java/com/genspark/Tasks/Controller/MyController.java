package com.genspark.Tasks.Controller;


import com.genspark.Tasks.Entity.Task;
import com.genspark.Tasks.Service.TaskInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private TaskInterface taskService;

    @GetMapping("/home")
    public String home() {

        return "<HTML><H1> Welcome to your to-do list</H1></HTML>";

    }

    @GetMapping("/allTasks")
    public List<Task> getAllTasks() {
        return this.taskService.getAllTasks();
    }

    @PostMapping("/allTasks")
    public List<Task> addAtask(@RequestBody Task task) {return this.taskService.addAtask(task);}

    @PutMapping("/allTasks")
    public List<Task> editATask(@RequestBody int taskOrder) {return this.taskService.editATask(taskOrder);}

    @DeleteMapping("/allTasks")
    public List<Task> deleteATask(@RequestBody int taskOrder) {return this.taskService.deleteATask(taskOrder);}

}
