package com.ENAA_Skills.enaa_skills.controller;

import com.ENAA_Skills.enaa_skills.dto.SkillDTO;
import com.ENAA_Skills.enaa_skills.service.SkillManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("skills")
public class SkillController {
    private final SkillManagementService skillManagementService;

    public SkillController(SkillManagementService skillManagementService) {
        this.skillManagementService = skillManagementService;
    }

    @PostMapping
    public ResponseEntity<SkillDTO> createSkill(@RequestBody SkillDTO skillDTO){
        return new ResponseEntity<>(skillManagementService.createSkill(skillDTO), HttpStatus.CREATED);
    }
}
