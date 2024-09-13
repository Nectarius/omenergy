package io.omenergy.omenergy.entity

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.types.ObjectId

@Serializable
data class InfoData(
    @SerialName("_id")
    @Contextual val id: ObjectId? = null,
    val header: String,
    val description: String,
    val coursesTitle: String?,
    val aboutCourses: String?,
    val tag: String? = "info"
)
