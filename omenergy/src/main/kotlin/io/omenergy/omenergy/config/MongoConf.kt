package io.omenergy.omenergy.config

import com.mongodb.client.model.Indexes
import com.mongodb.kotlin.client.MongoClient
import com.mongodb.kotlin.client.MongoCollection
import io.omenergy.omenergy.entity.InfoData
import io.omenergy.omenergy.entity.TrainingDescriptionData
import jakarta.annotation.PostConstruct
import jakarta.annotation.PreDestroy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MongoConf(val mongoClient: MongoClient) {

    @Bean
    fun trainingDescriptionCollection() : MongoCollection<TrainingDescriptionData> {
       val  collection = mongoClient.getDatabase("taffeite").getCollection<TrainingDescriptionData>("training-descriptions")
        collection.createIndex(Indexes.text("header"))
        return collection
    }

    @Bean
    fun infoDataCollection() : MongoCollection<InfoData> {
        val  collection = mongoClient.getDatabase("taffeite").getCollection<InfoData>("info-data")
        return collection
    }


    @PostConstruct
    fun initMongoConf() {

    }

    @PreDestroy
    fun shutdown() {
        mongoClient.close()
    }

    @Bean
    fun database() =
        mongoClient.getDatabase("taffeite")
}