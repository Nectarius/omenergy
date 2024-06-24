package io.omenergy.omenergy.repository

import io.omenergy.omenergy.entity.InfoData

interface InfoDataRepository {
    fun findFirst() : InfoData
    fun update(infoData: String, description: String): Boolean
    fun resetToDefault(): Boolean
}