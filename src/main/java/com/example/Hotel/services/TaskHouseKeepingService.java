package com.example.Hotel.services;

import com.example.Hotel.entities.TaskHouseKeeping;

import java.util.List;

public interface TaskHouseKeepingService {
    TaskHouseKeeping createTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping);
    List<TaskHouseKeeping> getAllTaskHouseKeepings();
    TaskHouseKeeping getTaskHouseKeepingById(Integer houseId, Integer taskId);
    TaskHouseKeeping updateTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping);
    void deleteTaskHouseKeeping(Integer houseId, Integer taskId);

    TaskHouseKeeping addTaskHouseKeeping(TaskHouseKeeping taskHouseKeeping);
}
