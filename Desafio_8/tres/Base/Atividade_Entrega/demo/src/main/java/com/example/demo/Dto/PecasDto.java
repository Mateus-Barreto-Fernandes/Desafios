package com.example.demo.Dto;

import jakarta.validation.constraints.NotNull;

public record PecasDto(@NotNull String nome, @NotNull String descricao, @NotNull Double preco) {

}
