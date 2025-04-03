package com.thalles.taskmanager.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TaskDTO {

    @NotBlank(message = "O título é obrigatório.")
    @Size(min = 3, max = 100, message = "O título deve ter entre 3 e 100 caracteres.")
    private String title;

    @NotBlank(message = "A descrição é obrigatória.")
    @Size(min = 5, max = 255, message = "A descrição deve ter entre 5 e 255 caracteres.")
    private String description;

    @NotNull(message = "O campo 'completed' não pode ser nulo.")
    private Boolean completed;
}
