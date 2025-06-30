package com.ENAA_Skills.enaa_skills.model;

import jakarta.persistence.*;

@Entity
public class LearnerProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "learner_id")
    private Learner learner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_skill_id")
    private SubSkill subSkill;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ValidationStatus status;


}
