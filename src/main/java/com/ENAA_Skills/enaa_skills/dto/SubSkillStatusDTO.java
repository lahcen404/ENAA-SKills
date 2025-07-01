package com.ENAA_Skills.enaa_skills.dto;

import com.ENAA_Skills.enaa_skills.model.ValidationStatus;
import lombok.Data;

@Data
public class SubSkillStatusDTO {
    private String subSkillName;
    private ValidationStatus status;
}
