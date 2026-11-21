package com.example.ventasitm1.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.math.BigDecimal;

public record MessageDTO (
        @NotNull
        Long id,

        @NotNull
        @PositiveOrZero
        BigDecimal valor,

        @NotNull
        Long fechaEpoch
) { }
