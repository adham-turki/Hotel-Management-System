package com.example.Hotel.services.imp;

import com.example.Hotel.entities.TaskHouseKeeping;
import com.example.Hotel.repositories.TasksHouseKeepingRepository;
import com.example.Hotel.services.TaskHouseKeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskHouseKeepingServiceImpl implements TaskHouseKeepingService {

    @Autowired
    private TasksHouseKeepingRepository taskHouseKeepingRepository;

    @Override
    public TaskHouseKeeping createTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping) {
        return taskHouseKeepingRepository.save(taskHouseKeeping);
    }

    @Override
    public List<TaskHouseKeeping> getAllTaskHouseKeepings() {
        return taskHouseKeepingRepository.findAll();
    }

    @Override
    public TaskHouseKeeping getTaskHouseKeepingById(Integer houseId, Integer taskId) {
        Optional<TaskHouseKeeping> taskHouseKeeping = taskHouseKeepingRepository.findById(new TaskHouseKeeping.TaskHouseKeepingId(houseId, taskId));
        return taskHouseKeeping.orElse(null);
    }

    @Override
    public TaskHouseKeeping updateTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping) {
        return taskHouseKeepingRepository.save(taskHouseKeeping);
    }

    @Override
    public void deleteTaskHouseKeeping(Integer houseId, Integer taskId) {
        taskHouseKeepingRepository.deleteById(new TaskHouseKeeping.TaskHouseKeepingId(houseId, taskId));
    }

    @Override
    public TaskHouseKeeping addTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping) {
        return null;
    }
}
