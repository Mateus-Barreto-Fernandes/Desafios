package com.example.demo.Dto;

import jakarta.validation.constraints.NotNull;

public record RelatorioVendaDto(@NotNull String produto, @NotNull Double quantidade, @NotNull Double valorTotal) {

}
