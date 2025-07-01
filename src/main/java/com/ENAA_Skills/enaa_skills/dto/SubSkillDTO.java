package com.ENAA_Skills.enaa_skills.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SubSkillDTO {
    private Long id;

    @NotBlank(message = "SubSkill name cannot be blank")
    private String name;


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
}
