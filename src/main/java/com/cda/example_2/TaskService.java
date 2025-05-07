package com.cda.example_2;

import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository repo;

    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public void addTask(String title) {
        repo.save(new Task(title));
    }

    public void completeTask(Long id) {
        Task task = repo.findById(id).orElseThrow();
        task.markAsDone();
        repo.save(task);
    }

    public Task getTask(Long id) {
        return repo.findById(id).orElseThrow();
    }
}
