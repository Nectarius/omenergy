package io.omenergy.omenergy.repository

import com.mongodb.client.model.Filters
import com.mongodb.client.model.Updates
import com.mongodb.kotlin.client.MongoClient
import com.mongodb.kotlin.client.MongoCollection
import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.bson.types.ObjectId
import org.springframework.stereotype.Repository

@Repository
class TrainingDescriptionDataRepositoryImpl(mongoClient: MongoClient, val trainingDescriptionCollection: MongoCollection<TrainingDescriptionData>) : TrainingDescriptionDataRepository{


    override
    fun findAll(): List<TrainingDescriptionData> {
        return trainingDescriptionCollection.find().toList()
    }

    override fun save(trainingDescription: TrainingDescriptionData): Boolean {
      return  trainingDescriptionCollection.insertOne(trainingDescription).wasAcknowledged()
    }

    override fun save(trainingDescription: List<TrainingDescriptionData>): Boolean {
        trainingDescriptionCollection.deleteMany(Filters.ne(TrainingDescriptionData::header.name, "Quest"))
        return  trainingDescriptionCollection.insertMany(trainingDescription).wasAcknowledged()
    }

    override fun update(trainingDescriptionData: TrainingDescriptionData): Boolean {
        return  trainingDescriptionCollection.findOneAndUpdate(Filters.eq(TrainingDescriptionData::header.name, trainingDescriptionData.header), Updates.combine(
            Updates.set(TrainingDescriptionData::description.name, trainingDescriptionData.description), Updates.set(TrainingDescriptionData::image.name, trainingDescriptionData.image)
        )) != null
    }

    override fun findByHeader(header: String): List<TrainingDescriptionData> {

        return trainingDescriptionCollection.find(Filters.text(header)).toList()
    }

    override fun findOne(id: String): TrainingDescriptionData {
        return trainingDescriptionCollection.find(Filters.eq("_id", ObjectId(id))).first()
    }

}