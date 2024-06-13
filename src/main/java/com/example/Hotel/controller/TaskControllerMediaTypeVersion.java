package com.example.Hotel.controller;
import com.example.Hotel.entities.Task;
import com.example.Hotel.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskControllerMediaTypeVersion {

    @Autowired
    private TaskService taskService;

    @PostMapping(value = "/create", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Task> createTaskV1(@RequestBody Task task) {
        Task createdTask = taskService.createTask(task);
        return ResponseEntity.ok(createdTask);
    }

    @GetMapping(value = "/all", produces = "application/vnd.example.v1+json")
    public ResponseEntity<List<Task>> getAllTasksV1() {
        List<Task> tasks = taskService.getAllTasks();
        return ResponseEntity.ok(tasks);
    }

    @GetMapping(value = "/{id}", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Task> getTaskByIdV1(@PathVariable Integer id) {
        Task task = taskService.getTaskById(id);
        return ResponseEntity.ok(task);
    }

    @PutMapping(value = "/update", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Task> updateTaskV1(@RequestBody Task task) {
        Task updatedTask = taskService.updateTask(task);
        return ResponseEntity.ok(updatedTask);
    }

    @DeleteMapping(value = "/delete/{id}", produces = "application/vnd.example.v1+json")
    public ResponseEntity<Void> deleteTaskV1(@PathVariable Integer id) {
        taskService.deleteTask(id);
        return ResponseEntity.noContent().build();
    }
}
