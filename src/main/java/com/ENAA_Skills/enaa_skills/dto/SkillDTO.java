package com.ENAA_Skills.enaa_skills.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

public class SkillDTO {
    private Long id;

    @NotBlank(message = "Skill name cannot be blank")
    private String name;

    private String description;

    @Valid
    private List<SubSkillDTO> subSkills;

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

    public List<SubSkillDTO> getSubSkills() {
        return subSkills;
    }

    public void setSubSkills(List<SubSkillDTO> subSkills) {
        this.subSkills = subSkills;
    }
}
