package com.insy2s.gamehub.dto.request;

import com.insy2s.gamehub.model.GameCategory;
import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public record GameUpdateRequest(
        @Column(length = 200)
        String title,
        @Column(length = 5000)
        String description,
        @PastOrPresent(message = "La date de sortie ne peut pas être dans le futur")
        LocalDate releaseDate,
        @Min(0) @DecimalMax(value = "999.99")
        BigDecimal price,
        @Column(length = 100)
        String developer,
        @Column(length = 100)
        String publisher,
        GameCategory category,
        @Pattern(regexp = "^(http|https)://.*$", message = "L'URL de l'image doit être valide")
        String coverImageUrl,
        Boolean available

) {
}
