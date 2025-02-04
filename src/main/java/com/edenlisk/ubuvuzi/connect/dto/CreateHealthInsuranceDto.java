package com.edenlisk.ubuvuzi.connect.dto;



import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor
public class CreateHealthInsuranceDto {

    @NotEmpty(message = "Health insurance title cannot be null or empty")
    private String name;

    @NotEmpty(message = "Please provide description to further explain health insurance")
    private String description;

}
