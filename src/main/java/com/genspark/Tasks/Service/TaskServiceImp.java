package com.genspark.Tasks.Service;

import com.genspark.Tasks.Entity.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImp implements TaskInterface {

    List<com.genspark.Tasks.Entity.Task> list;

    public TaskServiceImp() {

        list = new ArrayList<>();
        list.add(new Task(1, "get rich", "right now"));

    }

    @Override
    public List<Task> getAllTasks() {
        return list;
    }

    @Override
    public List<Task> addAtask(Task task) {
        list.add(task);
        return list;
    }

    @Override
    public List<Task> editATask(int taskNumber) {

        int num = 0;
        String editTaskDescription = "";
        String editTaskDueDate = "";

        for (Task t : list) {

            if (t.getTaskOrder() == taskNumber) {

                t.setTaskDescription(editTaskDescription);
                t.setTaskDueDate(editTaskDueDate);
                t.setTaskOrder(taskNumber);

            }
            break;
        }
        return list;
    }

    @Override
    public List<Task> deleteATask(int taskNumber) {

        list.removeIf(t -> t.getTaskOrder() == taskNumber);
        return list;
    }


}
