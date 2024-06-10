package com.example.Hotel.services;

import com.example.Hotel.entities.Task;

import java.util.List;

public interface TaskService {
    Task createTask(Task task);
    List<Task> getAllTasks();
    Task getTaskById(Integer id);
    Task updateTask(Task task);
    void deleteTask(Integer id);
}
