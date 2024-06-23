package io.omenergy.omenergy.repository

import io.omenergy.omenergy.entity.TrainingDescriptionData

interface TrainingDescriptionDataRepository {

    fun findAll() : List<TrainingDescriptionData>

    fun save(trainingDescription: TrainingDescriptionData) : Boolean

    fun save(trainingDescription: List<TrainingDescriptionData>): Boolean

}