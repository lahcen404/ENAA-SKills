package com.ENAA_Skills.enaa_skills.service;

import com.ENAA_Skills.enaa_skills.dto.LearnerDashboardDTO;
import com.ENAA_Skills.enaa_skills.dto.LearnerProgressDTO;

public interface LearnerProgressService {
    void updateSubSkillsStatus(LearnerProgressDTO progressDTO);
    LearnerDashboardDTO getLearnerDashboard(Long learnerId);
}
