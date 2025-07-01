package com.ENAA_Skills.enaa_skills.dto;

import lombok.Data;

import java.util.List;

@Data
public class LearnerDashboardDTO {
    private Long learnerId;
    private String learnerName;
    private List<SkillStatusDTO> skills;
}
