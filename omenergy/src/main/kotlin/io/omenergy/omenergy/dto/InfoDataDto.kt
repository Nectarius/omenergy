package io.omenergy.omenergy.dto

import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.bson.types.ObjectId

data class InfoDataDto(
    val id: String? = null,
    val header: String,
    val description: String,
    val coursesTitle: String,
    val aboutCourses: String
)

fun InfoDataDto.toEntity() = TrainingDescriptionData(
    id = if (this.id != null) ObjectId(this.id) else null,
    header = this.header,
    description = this.description
)
