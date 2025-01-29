package com.edenlisk.ubuvuzi.connect.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link com.edenlisk.ubuvuzi.connect.entity.HealthInsurance}
 */
@Data @NoArgsConstructor @AllArgsConstructor
public class HealthInsuranceDto implements Serializable {

    private Long id;

    @NotEmpty(message = "Health insurance title cannot be null or empty")
    private String name;

    @NotEmpty(message = "Please provide description to further explain health insurance")
    private String description;
}