package com.jeongback.portfolio.domain.repository

import com.jeongback.portfolio.domain.entity.Project
import org.springframework.data.jpa.repository.JpaRepository

interface ProjectRepository : JpaRepository<Project, Long> {
}