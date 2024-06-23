package io.omenergy.omenergy.service

import io.omenergy.omenergy.entity.TrainingDescriptionData
import io.omenergy.omenergy.repository.TrainingDescriptionDataRepository
import org.springframework.stereotype.Service

@Service
class TrainingDescriptionService(val trainingDescriptionDataRepository: TrainingDescriptionDataRepository) {

    fun defaultData(): List<TrainingDescriptionData> {
        return listOf(
            TrainingDescriptionData(
                header = "Cardio Training . Fake data",
                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
                image = "images/icons/heart-blue.png"
            ),
            TrainingDescriptionData(
                header = "Yoga Pilates . Fake data",
                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
                image = "images/icons/guru-blue.png"
            ),
            TrainingDescriptionData(
                header = "Power Training . Fake data",
                description = "A elementum ligula lacus ac quam ultrices a scelerisque praesent vel suspendisse scelerisque a aenean hac montes.",
                image = "images/icons/weight-blue.png"
            )
        )
    }

    fun getData() : List<TrainingDescriptionData> {
        return  trainingDescriptionDataRepository.findAll()
    }

    fun resetToDefault() : Boolean {
        return  trainingDescriptionDataRepository.save(defaultData())
    }

    fun save(trainingDescriptionData: TrainingDescriptionData) : Boolean {
      return  trainingDescriptionDataRepository.save(trainingDescriptionData)
    }
}