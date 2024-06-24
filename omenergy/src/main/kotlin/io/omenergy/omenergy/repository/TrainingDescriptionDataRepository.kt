package io.omenergy.omenergy.repository

import io.omenergy.omenergy.entity.TrainingDescriptionData

interface TrainingDescriptionDataRepository {

    fun findAll() : List<TrainingDescriptionData>

    fun save(trainingDescription: TrainingDescriptionData) : Boolean

    fun save(trainingDescription: List<TrainingDescriptionData>): Boolean
    fun update(trainingDescriptionData: TrainingDescriptionData): Boolean
    fun findByHeader(header: String): List<TrainingDescriptionData>
    fun findOne(id: String): TrainingDescriptionData
    fun deleteById(id: String): Boolean

}