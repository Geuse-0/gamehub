package com.insy2s.gamehub.dto.response;

import com.insy2s.gamehub.model.GameCategory;
import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;
import java.time.LocalDate;

public record GameDetailResponse(
        String title,
        String description,
        LocalDate releaseDate,
        BigDecimal price,
        String developer,
        String publisher,
        GameCategory category,
        String coverImageUrl,
        Boolean available
) {
}
