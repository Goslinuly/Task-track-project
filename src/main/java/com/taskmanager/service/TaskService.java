package com.taskmanager.service;

import com.taskmanager.dto.TaskRequest;
import com.taskmanager.dto.TaskResponse;
import com.taskmanager.model.Priority;
import com.taskmanager.model.TaskStatus;

import java.util.List;

public interface TaskService {

    TaskResponse createTask(TaskRequest request);

    TaskResponse getTaskById(Long id);

    List<TaskResponse> getAllTasks();

    List<TaskResponse> getTasksByStatus(TaskStatus status);

    List<TaskResponse> getTasksByPriority(Priority priority);

    List<TaskResponse> searchTasks(String keyword);

    TaskResponse updateTask(Long id, TaskRequest request);

    TaskResponse updateTaskStatus(Long id, TaskStatus status);

    void deleteTask(Long id);
}
