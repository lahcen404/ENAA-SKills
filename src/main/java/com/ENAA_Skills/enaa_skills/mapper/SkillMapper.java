package com.ENAA_Skills.enaa_skills.mapper;

import com.ENAA_Skills.enaa_skills.dto.SkillDTO;
import com.ENAA_Skills.enaa_skills.dto.SubSkillDTO;
import com.ENAA_Skills.enaa_skills.model.Skill;
import com.ENAA_Skills.enaa_skills.model.SubSkill;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SkillMapper {
    SkillDTO skillToSkillDTO(Skill skill);
    List<SkillDTO> skillsToSkillDTOs(List<Skill> skills);

    @Mapping(target = "id", ignore = true)
    Skill skillDTOToSkill(SkillDTO skillDTO);

    @Mapping(target = "id", ignore = true)
    SubSkill subSkillDTOToSubSkill(SubSkillDTO subSkillDTO);
}

