package com.example.Hotel.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tasks_house_keeping")
public class TaskHouseKeeping {
    @EmbeddedId
    private TaskHouseKeepingId id;

    public TaskHouseKeepingId getId() {
        return id;
    }

    public void setId(TaskHouseKeepingId id) {
        this.id = id;
    }

    @Embeddable
    @Data
    public static class TaskHouseKeepingId {
        private Integer houseId;
        private Integer taskId;

        public TaskHouseKeepingId(Integer houseId, Integer taskId) {
            this.houseId = houseId;
            this.taskId = taskId;
        }

        public Integer getHouseId() {
            return houseId;
        }

        public void setHouseId(Integer houseId) {
            this.houseId = houseId;
        }

        public Integer getTaskId() {
            return taskId;
        }

        public void setTaskId(Integer taskId) {
            this.taskId = taskId;
        }
    }
}
