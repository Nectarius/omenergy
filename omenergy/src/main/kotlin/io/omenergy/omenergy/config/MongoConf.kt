package io.omenergy.omenergy.config

import com.mongodb.kotlin.client.MongoClient
import jakarta.annotation.PreDestroy
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class MongoConf(val mongoClient: MongoClient) {


    @PreDestroy
    fun shutdown() {
        mongoClient.close()
    }

    @Bean
    fun database() =
        mongoClient.getDatabase("taffeite")
}