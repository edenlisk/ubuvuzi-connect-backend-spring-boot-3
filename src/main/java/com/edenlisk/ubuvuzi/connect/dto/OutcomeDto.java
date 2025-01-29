package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.Outcome}
 */
@Data
public class OutcomeDto implements Serializable {

    private Long id;

    @NotEmpty(message = "Outcome title cannot be null or empty")
    private String name;

    @NotEmpty(message = "Please provide description to further explain outcome")
    private String description;
}