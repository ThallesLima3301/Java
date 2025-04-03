package com.thalles.taskmanager.service;

import com.thalles.taskmanager.dto.TaskDTO;
import com.thalles.taskmanager.model.Task;
import com.thalles.taskmanager.repository.TaskRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        log.info("Buscando todas as tarefas...");
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        log.info("Buscando tarefa com ID: {}", id);
        return taskRepository.findById(id);
    }

    public Task createTask(TaskDTO taskDTO) {
        log.info("Criando nova tarefa: {}", taskDTO.getTitle());
        Task task = convertDTOToEntity(taskDTO);
        Task savedTask = taskRepository.save(task);
        log.info("Tarefa criada com sucesso! ID: {}", savedTask.getId());
        return savedTask;
    }

    public Optional<Task> updateTask(Long id, TaskDTO taskDTO) {
        return taskRepository.findById(id).map(existingTask -> {
            log.info("Atualizando tarefa ID: {}", id);
            existingTask.setTitle(taskDTO.getTitle());
            existingTask.setDescription(taskDTO.getDescription());
            existingTask.setCompleted(taskDTO.getCompleted());

            Task updatedTask = taskRepository.save(existingTask);
            log.info("Tarefa ID: {} atualizada com sucesso!", id);
            return updatedTask;
        });
    }

    public boolean deleteTask(Long id) {
        if (taskRepository.existsById(id)) {
            log.info("Deletando tarefa com ID: {}", id);
            taskRepository.deleteById(id);
            log.info("Tarefa ID: {} deletada com sucesso!", id);
            return true;
        }
        log.warn("Tentativa de deletar tarefa com ID inexistente: {}", id);
        return false;
    }

    private Task convertDTOToEntity(TaskDTO taskDTO) {
        Task task = new Task();
        task.setTitle(taskDTO.getTitle());
        task.setDescription(taskDTO.getDescription());
        task.setCompleted(taskDTO.getCompleted());
        task.setCreatedAt(LocalDateTime.now());
        return task;
    }
}
