package io.omenergy.omenergy.dto

import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.bson.types.ObjectId


data class TrainingDescriptionDto(
    val id: String? = null,
    val header: String,
    val description: String,
    val image: String? = null
)

fun TrainingDescriptionDto.toEntity() = TrainingDescriptionData(
    id = if (this.id != null) ObjectId(this.id) else null,
    header = this.header,
    description = this.description,
    image = this.image?: ""
)

