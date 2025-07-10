package com.example.demo.Dto;

import jakarta.validation.constraints.NotNull;

public record TarefaDto(@NotNull String nome, @NotNull String descricao, @NotNull Boolean concluida) {

}
