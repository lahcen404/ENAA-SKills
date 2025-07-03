package com.ENAA_Skills.enaa_skills.controller;

import com.ENAA_Skills.enaa_skills.dto.SkillDTO;
import com.ENAA_Skills.enaa_skills.service.SkillManagementService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<SkillDTO> getSkillById(@PathVariable Long id) {
        return ResponseEntity.ok(skillManagementService.getSkillById(id));
    }
}
