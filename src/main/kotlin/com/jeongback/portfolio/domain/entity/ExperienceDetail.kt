package com.jeongback.portfolio.domain.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id

@Entity
class ExperienceDetail : BaseEntity() {

    @Id
    // PK 생성 전략을 정해주는 것
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "experience_detail_id")
    override var id: Long? = null
    // val achivement: Achievement

}