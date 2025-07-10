package com.example.demo.Dto;

import jakarta.validation.constraints.NotNull;

public record ProdutoDto(@NotNull String nome, @NotNull String descricao, @NotNull Double preco) {

}
