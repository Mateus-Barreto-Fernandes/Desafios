package com.example.demo.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ClienteDto (@NotBlank String nome, @NotBlank String email, @NotNull BigDecimal telefone, @NotNull BigDecimal idade) {
}
