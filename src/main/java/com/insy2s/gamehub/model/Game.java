package com.insy2s.gamehub.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "games")
public class Game {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "le titre ne peux pas être null")
    @Column(length = 200)
    private String title;
    private String description;
    private LocalDate releaseDate;
    @NotBlank(message = "le prix ne peux pas être null")
    private BigDecimal price;
    @Column(length = 100)
    private String developer;
    @Column(length = 100)
    private String publisher;
    @NotBlank(message = "la category ne peux pas être null")
    private GameCategory category;
    @Pattern(regexp = "^(http|https)://.*$", message = "L'URL de l'image doit être valide"
    )
    private String coverImageUrl;
    private boolean available = true;
}
