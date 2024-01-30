package com.jeongback.portfolio.domain.repository

import com.jeongback.portfolio.domain.entity.*
import org.springframework.data.jpa.repository.JpaRepository

interface SkillRepository : JpaRepository<Skill, Long> {
}