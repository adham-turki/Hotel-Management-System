    package com.example.Hotel.repositories;

    import com.example.Hotel.entities.TaskHouseKeeping;
    import org.springframework.data.jpa.repository.JpaRepository;

    import java.util.Optional;

    public interface TasksHouseKeepingRepository extends JpaRepository<TaskHouseKeeping, Integer> {
        void deleteById(TaskHouseKeeping.TaskHouseKeepingId taskHouseKeepingId);

        Optional<TaskHouseKeeping> findById(TaskHouseKeeping.TaskHouseKeepingId taskHouseKeepingId);
    }
