package com.schedule_projects.schedule_projects.repository;

import com.schedule_projects.schedule_projects.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface Schedule_repository extends JpaRepository<Schedule, String> {
    List<Schedule> findByStartTimeBetween(LocalDateTime start, LocalDateTime end);
}
