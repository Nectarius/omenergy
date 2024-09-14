package io.omenergy.omenergy.repository

import com.mongodb.client.model.Filters
import com.mongodb.client.model.Updates
import com.mongodb.kotlin.client.MongoClient
import com.mongodb.kotlin.client.MongoCollection
import io.omenergy.omenergy.entity.InfoData
import io.omenergy.omenergy.entity.TrainingDescriptionData
import org.springframework.stereotype.Repository

@Repository
class InfoDataRepositoryImpl(mongoClient: MongoClient, val infoDataCollection: MongoCollection<InfoData>) : InfoDataRepository{

    override fun findFirst(): InfoData {
       return infoDataCollection.find(Filters.eq(InfoData::tag.name, "info")).first()
    }

    override fun update(header: String, description: String): Boolean {
        return infoDataCollection.findOneAndUpdate(
            Filters.eq(InfoData::tag.name, "info"), Updates.combine(
                Updates.set(InfoData::header.name, header),
                Updates.set(InfoData::description.name, description)
            )
        ) != null
    }

    override fun resetToDefault(): Boolean {
        infoDataCollection.deleteMany(Filters.eq(InfoData::tag.name, "info"))
        return infoDataCollection.insertOne(
            InfoData(
                header = "Здравствуйте меня зовут Ольга Молодцова",
                description = "Хореограф/Тренер и балерина. Преподаватель балета и латиноамериканских танцев более 12 лет. Автор и преподаватель курса 'Постройней за 30 дней'. Более 1500 довольных клиентов обучила растяжке, красивой осанке и этикету.",
                aboutCourses = "О моих занятиях",
                coursesTitle = "о занятиях"
            )
        ).wasAcknowledged()
    }


}