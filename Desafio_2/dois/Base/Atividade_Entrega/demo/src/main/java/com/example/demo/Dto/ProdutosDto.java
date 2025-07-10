package com.example.demo.Dto;

import jakarta.validation.constraints.NotNull;

public record ProdutosDto(@NotNull String nome, @NotNull String descricao, @NotNull Double preco) {

}
