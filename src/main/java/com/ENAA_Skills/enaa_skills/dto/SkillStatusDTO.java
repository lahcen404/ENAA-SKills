package com.ENAA_Skills.enaa_skills.dto;

import lombok.Data;

import java.util.List;

@Data
public class SkillStatusDTO {
    private String skillName;
    private boolean isAcquired;
    private List<SubSkillStatusDTO> subSkills;
}
