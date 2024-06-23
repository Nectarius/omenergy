package io.omenergy.omenergy.entity

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.types.ObjectId

@Serializable
data class TrainingDescriptionData(
    @SerialName("_id")
    @Contextual val id: ObjectId? = null,
    val header: String,
    val description: String,
    val image: String
)
