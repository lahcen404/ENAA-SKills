package com.ENAA_Skills.enaa_skills.service.serviceImpl;

import com.ENAA_Skills.enaa_skills.dto.SkillDTO;
import com.ENAA_Skills.enaa_skills.mapper.SkillMapper;
import com.ENAA_Skills.enaa_skills.model.Skill;
import com.ENAA_Skills.enaa_skills.model.SubSkill;
import com.ENAA_Skills.enaa_skills.repository.SkillRepository;
import com.ENAA_Skills.enaa_skills.service.SkillManagementService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillManagementServiceImpl implements SkillManagementService {

    private final SkillRepository skillRepository;
    private final SkillMapper skillMapper;

    public SkillManagementServiceImpl(SkillRepository skillRepository, SkillMapper skillMapper) {
        this.skillRepository = skillRepository;
        this.skillMapper = skillMapper;
    }


    @Override
    public SkillDTO createSkill(SkillDTO skillDTO) {
        Skill skill = skillMapper.skillDTOToSkill(skillDTO);
        if(skill.getSubSkills() != null){
            for (SubSkill subSkill : skill.getSubSkills()){
                subSkill.setSkill(skill);
            }
        }
        Skill savedSkill = skillRepository.save(skill);
        return skillMapper.skillToSkillDTO(savedSkill);
    }

    @Override
    public SkillDTO getSkillById(Long id) {
        return null;
    }

    @Override
    public List<SkillDTO> getAllSkills() {
        return List.of();
    }

    @Override
    public SkillDTO updateSkill(Long id, SkillDTO skillDTO) {
        return null;
    }

    @Override
    public void deleteSkill(Long id) {

    }
}
