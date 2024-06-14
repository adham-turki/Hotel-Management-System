package com.example.Hotel.controller;
import com.example.Hotel.entities.Task;
import com.example.Hotel.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskControllerHeaderVersion {

    @Autowired
    private TaskService taskService;

    @PostMapping(value = "/create", headers = "API-VERSION=1")
    public ResponseEntity<Task> createTaskV1(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @GetMapping(value = "/all", headers = "API-VERSION=1")
    public ResponseEntity<List<Task>> getAllTasksV1() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping(value = "/{id}", headers = "API-VERSION=1")
    public ResponseEntity<Task> getTaskByIdV1(@PathVariable Integer id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @PutMapping(value = "/update", headers = "API-VERSION=1")
    public ResponseEntity<Task> updateTaskV1(@RequestBody Task task) {
        Task updatedTask = taskService.updateTask(task);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping(value = "/delete/{id}", headers = "API-VERSION=1")
    public ResponseEntity<Void> deleteTaskV1(@PathVariable Integer id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
