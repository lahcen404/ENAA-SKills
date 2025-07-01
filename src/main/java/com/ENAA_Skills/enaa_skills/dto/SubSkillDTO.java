package com.ENAA_Skills.enaa_skills.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SubSkillDTO {
    private Long id;

    @NotBlank(message = "SubSkill name cannot be blank")
    private String name;

    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
