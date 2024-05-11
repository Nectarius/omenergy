package io.omenergy.omenergy.service

import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.springframework.stereotype.Service

@Service
class TrainingDescriptionService {

    fun data(): List<TrainingDescriptionData> {
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
}