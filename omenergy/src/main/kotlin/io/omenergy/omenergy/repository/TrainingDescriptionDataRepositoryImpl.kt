package io.omenergy.omenergy.repository

import com.mongodb.client.model.Filters
import com.mongodb.kotlin.client.MongoClient
import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.springframework.stereotype.Repository

@Repository
class TrainingDescriptionDataRepositoryImpl(mongoClient: MongoClient) : TrainingDescriptionDataRepository{

    val collection = mongoClient.getDatabase("taffeite").getCollection<TrainingDescriptionData>("training-descriptions")

    override
    fun findAll(): List<TrainingDescriptionData> {
        return collection.find().toList()
    }

    override fun save(trainingDescription: TrainingDescriptionData): Boolean {
      return  collection.insertOne(trainingDescription).wasAcknowledged()
    }

    override fun save(trainingDescription: List<TrainingDescriptionData>): Boolean {
        collection.deleteMany(Filters.ne(TrainingDescriptionData::header.name, "Quest"))
        return  collection.insertMany(trainingDescription).wasAcknowledged()
    }

}