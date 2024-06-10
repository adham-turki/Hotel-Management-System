package com.example.Hotel.controller;

import com.example.Hotel.entities.TaskHouseKeeping;
import com.example.Hotel.services.TaskHouseKeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/task-house-keeping")
public class TaskHouseKeepingController {

    @Autowired
    private TaskHouseKeepingService taskHouseKeepingService;

    @PostMapping("/add")
    public ResponseEntity<TaskHouseKeeping> addTaskHouseKeeping(@RequestBody TaskHouseKeeping taskHouseKeeping) {
        TaskHouseKeeping savedTaskHouseKeeping = taskHouseKeepingService.addTaskHouseKeeping(taskHouseKeeping);
        return ResponseEntity.ok(savedTaskHouseKeeping);
    }

    @GetMapping("/{houseId}/{taskId}")
    public ResponseEntity<TaskHouseKeeping> getTaskHouseKeepingById(@PathVariable Integer houseId, @PathVariable Integer taskId) {
        TaskHouseKeeping taskHouseKeeping = taskHouseKeepingService.getTaskHouseKeepingById(houseId, taskId);
        return ResponseEntity.ok(taskHouseKeeping);
    }

    @PutMapping("/update")
    public ResponseEntity<TaskHouseKeeping> updateTaskHouseKeeping(@RequestBody TaskHouseKeeping taskHouseKeeping) {
        TaskHouseKeeping updatedTaskHouseKeeping = taskHouseKeepingService.updateTaskHouseKeeping(taskHouseKeeping);
        return ResponseEntity.ok(updatedTaskHouseKeeping);
    }

    @DeleteMapping("/delete/{houseId}/{taskId}")
    public ResponseEntity<Void> deleteTaskHouseKeeping(@PathVariable Integer houseId, @PathVariable Integer taskId) {
        taskHouseKeepingService.deleteTaskHouseKeeping(houseId, taskId);
        return ResponseEntity.noContent().build();
    }
}
