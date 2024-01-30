package com.jeongback.portfolio.domain.repository

import com.jeongback.portfolio.domain.entity.Link
import org.springframework.data.jpa.repository.JpaRepository

interface LinkRepository : JpaRepository<Link, Long> {
}