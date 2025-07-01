package com.ENAA_Skills.enaa_skills.dto;

import com.ENAA_Skills.enaa_skills.model.ValidationStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class LearnerProgressDTO {
    @NotNull(message = "Learner ID cannot be null")
    private Long learnerId;

    @NotNull(message = "SubSkill ID cannot be null")
    private Long subSkillId;

    @NotNull(message = "Status cannot be null")
    private ValidationStatus status;
}
