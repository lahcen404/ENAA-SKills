package com.ENAA_Skills.enaa_skills.dto;

import com.ENAA_Skills.enaa_skills.model.ValidationStatus;
import jakarta.validation.constraints.NotNull;


public class UpdateStatusDTO {
    @NotNull
    private ValidationStatus status;

    public ValidationStatus getStatus() {
        return status;
    }

    public void setStatus(ValidationStatus status) {
        this.status = status;
    }
}
