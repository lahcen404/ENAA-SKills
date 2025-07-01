package com.ENAA_Skills.enaa_skills.dto;

import jakarta.validation.constraints.NotBlank;

public class LearnerDTO {
    private Long id;
    @NotBlank(message = "Learner name cannot be blank")
    private String name;
}
