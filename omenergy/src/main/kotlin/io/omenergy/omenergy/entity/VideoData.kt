package io.omenergy.omenergy.entity

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import org.bson.types.ObjectId

@Serializable
data class VideoData(
    @SerialName("_id")
    @Contextual val id: ObjectId? = null,
    val title: String,
    val description: String,
    val image: String,
    val background: String,
    val priceLabel: String,
    val priceDescription: String,
    val content: String
)
